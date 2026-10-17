package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.AttributionSource;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.os.UserHandle;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.CommonStatusCodes;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.wrappers.AttributionSourceWrapper;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
@KeepForSdk
public abstract class BaseGmsClient<T extends IInterface> {

    @KeepForSdk
    public static final int CONNECT_STATE_CONNECTED = 4;

    @KeepForSdk
    public static final int CONNECT_STATE_DISCONNECTED = 1;

    @KeepForSdk
    public static final int CONNECT_STATE_DISCONNECTING = 5;
    private volatile String zzA;
    private volatile AttributionSourceWrapper zzB;
    private ConnectionResult zzC;
    private boolean zzD;
    private volatile zzj zzE;
    private UserHandle zzF;

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    zzs f38016zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    final Handler f38017zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    @NonNull
    protected ConnectionProgressReportCallbacks f38018zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    @NonNull
    protected AtomicInteger f38019zzd;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    private int f38020zzf;

    /* JADX INFO: renamed from: zzg, reason: collision with root package name */
    private long f38021zzg;

    /* JADX INFO: renamed from: zzh, reason: collision with root package name */
    private long f38022zzh;

    /* JADX INFO: renamed from: zzi, reason: collision with root package name */
    private int f38023zzi;

    /* JADX INFO: renamed from: zzj, reason: collision with root package name */
    private long f38024zzj;

    /* JADX INFO: renamed from: zzk, reason: collision with root package name */
    private volatile String f38025zzk;

    /* JADX INFO: renamed from: zzl, reason: collision with root package name */
    private final Context f38026zzl;
    private final Looper zzm;
    private final GmsClientSupervisor zzn;
    private final GoogleApiAvailabilityLight zzo;
    private final Object zzp;
    private final Object zzq;
    private IGmsServiceBroker zzr;
    private IInterface zzs;
    private final ArrayList zzt;
    private zze zzu;
    private int zzv;
    private final BaseConnectionCallbacks zzw;
    private final BaseOnConnectionFailedListener zzx;
    private final int zzy;
    private final String zzz;

    @NonNull
    @KeepForSdk
    public static final String DEFAULT_ACCOUNT = "<<default account>>";

    @NonNull
    @KeepForSdk
    public static final String KEY_PENDING_INTENT = "pendingIntent";

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    private static final Feature[] f38015zze = new Feature[0];

    @NonNull
    @KeepForSdk
    public static final String[] GOOGLE_PLUS_REQUIRED_FEATURES = {"service_esmobile", "service_googleme"};

    @KeepForSdk
    public interface BaseConnectionCallbacks {

        @KeepForSdk
        public static final int CAUSE_DEAD_OBJECT_EXCEPTION = 3;

        @KeepForSdk
        public static final int CAUSE_SERVICE_DISCONNECTED = 1;

        @KeepForSdk
        void onConnected(Bundle bundle);

        @KeepForSdk
        void onConnectionSuspended(int i);
    }

    @KeepForSdk
    public interface BaseOnConnectionFailedListener {
        @KeepForSdk
        void onConnectionFailed(@NonNull ConnectionResult connectionResult);
    }

    @KeepForSdk
    public interface ConnectionProgressReportCallbacks {
        @KeepForSdk
        void onReportServiceBinding(@NonNull ConnectionResult connectionResult);
    }

    /* JADX INFO: loaded from: classes16.dex */
    public class LegacyClientCallbackAdapter implements ConnectionProgressReportCallbacks {

        /* JADX INFO: renamed from: zza, reason: collision with root package name */
        final /* synthetic */ BaseGmsClient f38027zza;

        @KeepForSdk
        public LegacyClientCallbackAdapter(BaseGmsClient baseGmsClient) {
            java.util.Objects.requireNonNull(baseGmsClient);
            this.f38027zza = baseGmsClient;
        }

        @Override // com.google.android.gms.common.internal.BaseGmsClient.ConnectionProgressReportCallbacks
        public final void onReportServiceBinding(@NonNull ConnectionResult connectionResult) {
            if (connectionResult.isSuccess()) {
                BaseGmsClient baseGmsClient = this.f38027zza;
                baseGmsClient.getRemoteService(null, baseGmsClient.getScopes());
            } else {
                BaseGmsClient baseGmsClient2 = this.f38027zza;
                if (baseGmsClient2.zzl() != null) {
                    baseGmsClient2.zzl().onConnectionFailed(connectionResult);
                }
            }
        }
    }

    /* JADX INFO: loaded from: classes16.dex */
    @KeepForSdk
    public interface SignOutCallbacks {
        @KeepForSdk
        void onSignOutComplete();
    }

    @KeepForSdk
    public BaseGmsClient(@NonNull Context context, @NonNull Handler handler, @NonNull GmsClientSupervisor gmsClientSupervisor, @NonNull GoogleApiAvailabilityLight googleApiAvailabilityLight, int i, BaseConnectionCallbacks baseConnectionCallbacks, BaseOnConnectionFailedListener baseOnConnectionFailedListener) {
        this.f38025zzk = null;
        this.zzp = new Object();
        this.zzq = new Object();
        this.zzt = new ArrayList();
        this.zzv = 1;
        this.zzC = null;
        this.zzD = false;
        this.zzE = null;
        this.f38019zzd = new AtomicInteger(0);
        Preconditions.checkNotNull(context, "Context must not be null");
        this.f38026zzl = context;
        Preconditions.checkNotNull(handler, "Handler must not be null");
        this.f38017zzb = handler;
        this.zzm = handler.getLooper();
        Preconditions.checkNotNull(gmsClientSupervisor, "Supervisor must not be null");
        this.zzn = gmsClientSupervisor;
        Preconditions.checkNotNull(googleApiAvailabilityLight, "API availability must not be null");
        this.zzo = googleApiAvailabilityLight;
        this.zzy = i;
        this.zzw = baseConnectionCallbacks;
        this.zzx = baseOnConnectionFailedListener;
        this.zzz = null;
    }

    private final void zzp(int i, IInterface iInterface) {
        ConnectionResult connectionResultZza;
        zzs zzsVar;
        Preconditions.checkArgument((i == 4) == (iInterface != null));
        synchronized (this.zzp) {
            try {
                this.zzv = i;
                this.zzs = iInterface;
                Bundle bundle = null;
                if (i == 1) {
                    zze zzeVar = this.zzu;
                    if (zzeVar != null) {
                        if (this.zzF == null || Build.VERSION.SDK_INT < 33) {
                            GmsClientSupervisor gmsClientSupervisor = this.zzn;
                            String strZza = this.f38016zza.zza();
                            Preconditions.checkNotNull(strZza);
                            gmsClientSupervisor.zzc(new zzn(strZza, this.f38016zza.zzb(), 4225, this.f38016zza.zzc(), null), zzeVar, zza());
                        } else {
                            GmsClientSupervisor gmsClientSupervisor2 = this.zzn;
                            String strZza2 = this.f38016zza.zza();
                            Preconditions.checkNotNull(strZza2);
                            gmsClientSupervisor2.zzb(strZza2, this.f38016zza.zzb(), 4225, zzeVar, zza(), this.f38016zza.zzc(), this.zzF);
                        }
                        this.zzu = null;
                    }
                } else if (i == 2 || i == 3) {
                    zze zzeVar2 = this.zzu;
                    if (zzeVar2 != null && (zzsVar = this.f38016zza) != null) {
                        String strZza3 = zzsVar.zza();
                        String strZzb = zzsVar.zzb();
                        StringBuilder sb6 = new StringBuilder(String.valueOf(strZza3).length() + 70 + String.valueOf(strZzb).length());
                        sb6.append("Calling connect() while still connected, missing disconnect() for ");
                        sb6.append(strZza3);
                        sb6.append(" on ");
                        sb6.append(strZzb);
                        sb6.toString();
                        GmsClientSupervisor gmsClientSupervisor3 = this.zzn;
                        String strZza4 = this.f38016zza.zza();
                        Preconditions.checkNotNull(strZza4);
                        gmsClientSupervisor3.zzb(strZza4, this.f38016zza.zzb(), 4225, zzeVar2, zza(), this.f38016zza.zzc(), this.zzF);
                        this.f38019zzd.incrementAndGet();
                    }
                    zze zzeVar3 = new zze(this, this.f38019zzd.get());
                    this.zzu = zzeVar3;
                    zzs zzsVar2 = (this.zzv != 3 || getLocalStartServiceAction() == null) ? new zzs(getStartServicePackage(), getStartServiceAction(), false, 4225, getUseDynamicLookup()) : new zzs(getContext().getPackageName(), getLocalStartServiceAction(), true, 4225, false);
                    this.f38016zza = zzsVar2;
                    if (zzsVar2.zzc() && getMinApkVersion() < 17895000) {
                        throw new IllegalStateException("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(String.valueOf(this.f38016zza.zza())));
                    }
                    if (this.zzF == null || Build.VERSION.SDK_INT < 33) {
                        GmsClientSupervisor gmsClientSupervisor4 = this.zzn;
                        String strZza5 = this.f38016zza.zza();
                        Preconditions.checkNotNull(strZza5);
                        connectionResultZza = gmsClientSupervisor4.zza(new zzn(strZza5, this.f38016zza.zzb(), 4225, this.f38016zza.zzc(), null), zzeVar3, zza(), getBindServiceExecutor());
                    } else {
                        GmsClientSupervisor gmsClientSupervisor5 = this.zzn;
                        String strZza6 = this.f38016zza.zza();
                        Preconditions.checkNotNull(strZza6);
                        String strZzb2 = this.f38016zza.zzb();
                        String strZza7 = zza();
                        boolean zZzc = this.f38016zza.zzc();
                        UserHandle userHandle = this.zzF;
                        Preconditions.checkNotNull(userHandle);
                        connectionResultZza = gmsClientSupervisor5.zza(new zzn(strZza6, strZzb2, 4225, zZzc, userHandle), zzeVar3, strZza7, null);
                    }
                    if (!connectionResultZza.isSuccess()) {
                        String strZza8 = this.f38016zza.zza();
                        String strZzb3 = this.f38016zza.zzb();
                        StringBuilder sb9 = new StringBuilder(String.valueOf(strZza8).length() + 34 + String.valueOf(strZzb3).length());
                        sb9.append("unable to connect to service: ");
                        sb9.append(strZza8);
                        sb9.append(" on ");
                        sb9.append(strZzb3);
                        sb9.toString();
                        int errorCode = connectionResultZza.getErrorCode() == -1 ? 16 : connectionResultZza.getErrorCode();
                        if (connectionResultZza.getResolution() != null) {
                            bundle = new Bundle();
                            bundle.putParcelable("pendingIntent", connectionResultZza.getResolution());
                        }
                        zzb(errorCode, bundle, this.f38019zzd.get());
                    }
                } else if (i == 4) {
                    Preconditions.checkNotNull(iInterface);
                    onConnectedLocked(iInterface);
                }
            } finally {
            }
        }
    }

    @KeepForSdk
    public void checkAvailabilityAndConnect() {
        int iIsGooglePlayServicesAvailable = this.zzo.isGooglePlayServicesAvailable(this.f38026zzl, getMinApkVersion());
        if (iIsGooglePlayServicesAvailable == 0) {
            connect(new LegacyClientCallbackAdapter(this));
        } else {
            zzp(1, null);
            triggerNotAvailable(new LegacyClientCallbackAdapter(this), iIsGooglePlayServicesAvailable, null);
        }
    }

    @KeepForSdk
    public final void checkConnected() {
        if (!isConnected()) {
            throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
        }
    }

    @KeepForSdk
    public void connect(@NonNull ConnectionProgressReportCallbacks connectionProgressReportCallbacks) {
        Preconditions.checkNotNull(connectionProgressReportCallbacks, "Connection progress callbacks cannot be null.");
        this.f38018zzc = connectionProgressReportCallbacks;
        zzp(2, null);
    }

    @KeepForSdk
    public abstract T createServiceInterface(@NonNull IBinder iBinder);

    @KeepForSdk
    public void disconnect() {
        this.f38019zzd.incrementAndGet();
        ArrayList arrayList = this.zzt;
        synchronized (arrayList) {
            try {
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ((zzc) arrayList.get(i)).zzf();
                }
                arrayList.clear();
            } catch (Throwable th10) {
                throw th10;
            }
        }
        synchronized (this.zzq) {
            this.zzr = null;
        }
        zzp(1, null);
    }

    @KeepForSdk
    public void dump(@NonNull String str, @NonNull FileDescriptor fileDescriptor, @NonNull PrintWriter printWriter, @NonNull String[] strArr) {
        int i;
        IInterface iInterface;
        IGmsServiceBroker iGmsServiceBroker;
        long j2;
        synchronized (this.zzp) {
            i = this.zzv;
            iInterface = this.zzs;
        }
        synchronized (this.zzq) {
            iGmsServiceBroker = this.zzr;
        }
        printWriter.append((CharSequence) str).append("mConnectState=");
        if (i == 1) {
            printWriter.print("DISCONNECTED");
        } else if (i == 2) {
            printWriter.print("REMOTE_CONNECTING");
        } else if (i == 3) {
            printWriter.print("LOCAL_CONNECTING");
        } else if (i == 4) {
            printWriter.print("CONNECTED");
        } else if (i != 5) {
            printWriter.print("UNKNOWN");
        } else {
            printWriter.print("DISCONNECTING");
        }
        printWriter.append(" mService=");
        if (iInterface == null) {
            printWriter.append("null");
        } else {
            printWriter.append((CharSequence) getServiceDescriptor()).append("@").append((CharSequence) Integer.toHexString(System.identityHashCode(iInterface.asBinder())));
        }
        printWriter.append(" mServiceBroker=");
        if (iGmsServiceBroker == null) {
            printWriter.println("null");
        } else {
            printWriter.append("IGmsServiceBroker@").println(Integer.toHexString(System.identityHashCode(iGmsServiceBroker.asBinder())));
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.US);
        if (this.f38022zzh > 0) {
            PrintWriter printWriterAppend = printWriter.append((CharSequence) str).append("lastConnectedTime=");
            long j3 = this.f38022zzh;
            String str2 = simpleDateFormat.format(new Date(j3));
            j2 = 0;
            StringBuilder sb6 = new StringBuilder(String.valueOf(j3).length() + 1 + String.valueOf(str2).length());
            sb6.append(j3);
            sb6.append(" ");
            sb6.append(str2);
            printWriterAppend.println(sb6.toString());
        } else {
            j2 = 0;
        }
        if (this.f38021zzg > j2) {
            printWriter.append((CharSequence) str).append("lastSuspendedCause=");
            int i2 = this.f38020zzf;
            if (i2 == 1) {
                printWriter.append("CAUSE_SERVICE_DISCONNECTED");
            } else if (i2 == 2) {
                printWriter.append("CAUSE_NETWORK_LOST");
            } else if (i2 != 3) {
                printWriter.append((CharSequence) String.valueOf(i2));
            } else {
                printWriter.append("CAUSE_DEAD_OBJECT_EXCEPTION");
            }
            PrintWriter printWriterAppend2 = printWriter.append(" lastSuspendedTime=");
            long j5 = this.f38021zzg;
            String str3 = simpleDateFormat.format(new Date(j5));
            StringBuilder sb9 = new StringBuilder(String.valueOf(j5).length() + 1 + String.valueOf(str3).length());
            sb9.append(j5);
            sb9.append(" ");
            sb9.append(str3);
            printWriterAppend2.println(sb9.toString());
        }
        if (this.f38024zzj > j2) {
            printWriter.append((CharSequence) str).append("lastFailedStatus=").append((CharSequence) CommonStatusCodes.getStatusCodeString(this.f38023zzi));
            PrintWriter printWriterAppend3 = printWriter.append(" lastFailedTime=");
            long j16 = this.f38024zzj;
            String str4 = simpleDateFormat.format(new Date(j16));
            StringBuilder sb10 = new StringBuilder(String.valueOf(j16).length() + 1 + String.valueOf(str4).length());
            sb10.append(j16);
            sb10.append(" ");
            sb10.append(str4);
            printWriterAppend3.println(sb10.toString());
        }
    }

    @KeepForSdk
    public boolean enableLocalFallback() {
        return false;
    }

    @KeepForSdk
    public Account getAccount() {
        return null;
    }

    @NonNull
    @KeepForSdk
    public Feature[] getApiFeatures() {
        return f38015zze;
    }

    @KeepForSdk
    public AttributionSourceWrapper getAttributionSourceWrapper() {
        return this.zzB;
    }

    @KeepForSdk
    public final Feature[] getAvailableFeatures() {
        zzj zzjVar = this.zzE;
        if (zzjVar == null) {
            return null;
        }
        return zzjVar.f38158zzb;
    }

    @KeepForSdk
    public Executor getBindServiceExecutor() {
        return null;
    }

    @KeepForSdk
    public Bundle getConnectionHint() {
        return null;
    }

    @NonNull
    @KeepForSdk
    public final Context getContext() {
        return this.f38026zzl;
    }

    @NonNull
    @KeepForSdk
    public String getEndpointPackageName() {
        zzs zzsVar;
        if (!isConnected() || (zzsVar = this.f38016zza) == null) {
            throw new RuntimeException("Failed to connect when checking package");
        }
        return zzsVar.zzb();
    }

    @KeepForSdk
    public int getGCoreServiceId() {
        return this.zzy;
    }

    @NonNull
    @KeepForSdk
    public Bundle getGetServiceRequestExtraArgs() {
        return new Bundle();
    }

    @KeepForSdk
    public String getLastDisconnectMessage() {
        return this.f38025zzk;
    }

    @KeepForSdk
    public String getLocalStartServiceAction() {
        return null;
    }

    @NonNull
    @KeepForSdk
    public final Looper getLooper() {
        return this.zzm;
    }

    @KeepForSdk
    public int getMinApkVersion() {
        return GoogleApiAvailabilityLight.GOOGLE_PLAY_SERVICES_VERSION_CODE;
    }

    @KeepForSdk
    public void getRemoteService(IAccountAccessor iAccountAccessor, @NonNull Set<Scope> set) {
        AttributionSource attributionSource;
        Bundle getServiceRequestExtraArgs = getGetServiceRequestExtraArgs();
        String attributionTag = (Build.VERSION.SDK_INT < 31 || this.zzB == null || (attributionSource = this.zzB.getAttributionSource()) == null || attributionSource.getAttributionTag() == null) ? this.zzA : attributionSource.getAttributionTag();
        String str = attributionTag;
        int i = this.zzy;
        int i2 = GoogleApiAvailabilityLight.GOOGLE_PLAY_SERVICES_VERSION_CODE;
        Scope[] scopeArr = GetServiceRequest.f38051zza;
        Bundle bundle = new Bundle();
        Feature[] featureArr = GetServiceRequest.f38052zzb;
        GetServiceRequest getServiceRequest = new GetServiceRequest(6, i, i2, null, null, scopeArr, bundle, null, featureArr, featureArr, true, 0, false, str);
        getServiceRequest.f38056zzf = this.f38026zzl.getPackageName();
        getServiceRequest.f38059zzi = getServiceRequestExtraArgs;
        if (set != null) {
            getServiceRequest.f38058zzh = (Scope[]) set.toArray(new Scope[0]);
        }
        if (requiresSignIn()) {
            Account account = getAccount();
            if (account == null) {
                account = new Account("<<default account>>", "com.google");
            }
            getServiceRequest.f38060zzj = account;
            if (iAccountAccessor != null) {
                getServiceRequest.f38057zzg = iAccountAccessor.asBinder();
            }
        } else if (requiresAccount()) {
            getServiceRequest.f38060zzj = getAccount();
        }
        getServiceRequest.f38061zzk = f38015zze;
        getServiceRequest.f38062zzl = getApiFeatures();
        if (usesClientTelemetry()) {
            getServiceRequest.zzo = true;
        }
        try {
            synchronized (this.zzq) {
                try {
                    IGmsServiceBroker iGmsServiceBroker = this.zzr;
                    if (iGmsServiceBroker != null) {
                        iGmsServiceBroker.getService(new zzd(this, this.f38019zzd.get()), getServiceRequest);
                    }
                } finally {
                }
            }
        } catch (DeadObjectException e) {
            triggerConnectionSuspended(3);
        } catch (RemoteException e2) {
            onPostInitHandler(8, null, null, this.f38019zzd.get());
        } catch (SecurityException e4) {
            throw e4;
        } catch (RuntimeException e5) {
            onPostInitHandler(8, null, null, this.f38019zzd.get());
        }
    }

    @NonNull
    @KeepForSdk
    public Set<Scope> getScopes() {
        return Collections.EMPTY_SET;
    }

    @NonNull
    @KeepForSdk
    public final T getService() throws DeadObjectException {
        T t2;
        synchronized (this.zzp) {
            try {
                if (this.zzv == 5) {
                    throw new DeadObjectException();
                }
                checkConnected();
                IInterface iInterface = this.zzs;
                Preconditions.checkNotNull(iInterface, "Client is connected but service is null");
                t2 = (T) iInterface;
            } catch (Throwable th10) {
                throw th10;
            }
        }
        return t2;
    }

    @KeepForSdk
    public IBinder getServiceBrokerBinder() {
        synchronized (this.zzq) {
            try {
                IGmsServiceBroker iGmsServiceBroker = this.zzr;
                if (iGmsServiceBroker == null) {
                    return null;
                }
                return iGmsServiceBroker.asBinder();
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }

    @NonNull
    @KeepForSdk
    public abstract String getServiceDescriptor();

    @NonNull
    @KeepForSdk
    public Intent getSignInIntent() {
        throw new UnsupportedOperationException("Not a sign in API");
    }

    @NonNull
    @KeepForSdk
    public abstract String getStartServiceAction();

    @NonNull
    @KeepForSdk
    public String getStartServicePackage() {
        return "com.google.android.gms";
    }

    @KeepForSdk
    public ConnectionTelemetryConfiguration getTelemetryConfiguration() {
        zzj zzjVar = this.zzE;
        if (zzjVar == null) {
            return null;
        }
        return zzjVar.f38160zzd;
    }

    @KeepForSdk
    public boolean getUseDynamicLookup() {
        return getMinApkVersion() >= 211700000;
    }

    @KeepForSdk
    public boolean hasConnectionInfo() {
        return this.zzE != null;
    }

    @KeepForSdk
    public boolean isConnected() {
        boolean z;
        synchronized (this.zzp) {
            z = this.zzv == 4;
        }
        return z;
    }

    @KeepForSdk
    public boolean isConnecting() {
        boolean z;
        synchronized (this.zzp) {
            int i = this.zzv;
            z = true;
            if (i != 2 && i != 3) {
                z = false;
            }
        }
        return z;
    }

    @KeepForSdk
    public void onConnectedLocked(@NonNull T t2) {
        this.f38022zzh = System.currentTimeMillis();
    }

    @KeepForSdk
    public void onConnectionFailed(@NonNull ConnectionResult connectionResult) {
        this.f38023zzi = connectionResult.getErrorCode();
        this.f38024zzj = System.currentTimeMillis();
    }

    @KeepForSdk
    public void onConnectionSuspended(int i) {
        this.f38020zzf = i;
        this.f38021zzg = System.currentTimeMillis();
    }

    @KeepForSdk
    public void onPostInitHandler(int i, IBinder iBinder, Bundle bundle, int i2) {
        zzf zzfVar = new zzf(this, i, iBinder, bundle);
        Handler handler = this.f38017zzb;
        handler.sendMessage(handler.obtainMessage(1, i2, -1, zzfVar));
    }

    @KeepForSdk
    public void onUserSignOut(@NonNull SignOutCallbacks signOutCallbacks) {
        signOutCallbacks.onSignOutComplete();
    }

    @KeepForSdk
    public boolean providesSignIn() {
        return false;
    }

    @KeepForSdk
    public boolean requiresAccount() {
        return false;
    }

    @KeepForSdk
    public boolean requiresGooglePlayServices() {
        return true;
    }

    @KeepForSdk
    public boolean requiresSignIn() {
        return false;
    }

    @KeepForSdk
    public void setAttributionSourceWrapper(@NonNull AttributionSourceWrapper attributionSourceWrapper) {
        this.zzB = attributionSourceWrapper;
    }

    @KeepForSdk
    public void setAttributionTag(@NonNull String str) {
        this.zzA = str;
    }

    @KeepForSdk
    public void setUserHandle(@NonNull UserHandle userHandle) {
        if (isConnected()) {
            throw new IllegalStateException("setUserHandle must be called before connect()");
        }
        this.zzF = userHandle;
    }

    @KeepForSdk
    public void triggerConnectionSuspended(int i) {
        int i2 = this.f38019zzd.get();
        Handler handler = this.f38017zzb;
        handler.sendMessage(handler.obtainMessage(6, i2, i));
    }

    @KeepForSdk
    public void triggerNotAvailable(@NonNull ConnectionProgressReportCallbacks connectionProgressReportCallbacks, int i, PendingIntent pendingIntent) {
        Preconditions.checkNotNull(connectionProgressReportCallbacks, "Connection progress callbacks cannot be null.");
        this.f38018zzc = connectionProgressReportCallbacks;
        int i2 = this.f38019zzd.get();
        Handler handler = this.f38017zzb;
        handler.sendMessage(handler.obtainMessage(3, i2, i, pendingIntent));
    }

    @KeepForSdk
    public boolean usesClientTelemetry() {
        return false;
    }

    @NonNull
    public final String zza() {
        String str = this.zzz;
        return str == null ? this.f38026zzl.getClass().getName() : str;
    }

    public final void zzb(int i, Bundle bundle, int i2) {
        zzg zzgVar = new zzg(this, i, bundle);
        Handler handler = this.f38017zzb;
        handler.sendMessage(handler.obtainMessage(7, i2, -1, zzgVar));
    }

    public final /* synthetic */ void zzc(zzj zzjVar) {
        this.zzE = zzjVar;
        if (usesClientTelemetry()) {
            ConnectionTelemetryConfiguration connectionTelemetryConfiguration = zzjVar.f38160zzd;
            RootTelemetryConfigManager.getInstance().zza(connectionTelemetryConfiguration == null ? null : connectionTelemetryConfiguration.zza());
        }
    }

    public final /* synthetic */ void zzd(int i, IInterface iInterface) {
        zzp(i, null);
    }

    public final /* synthetic */ boolean zze(int i, int i2, IInterface iInterface) {
        synchronized (this.zzp) {
            try {
                if (this.zzv != i) {
                    return false;
                }
                zzp(i2, iInterface);
                return true;
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }

    public final /* synthetic */ void zzf(int i) {
        int i2;
        int i3;
        synchronized (this.zzp) {
            i2 = this.zzv;
        }
        if (i2 == 3) {
            this.zzD = true;
            i3 = 5;
        } else {
            i3 = 4;
        }
        Handler handler = this.f38017zzb;
        handler.sendMessage(handler.obtainMessage(i3, this.f38019zzd.get(), 16));
    }

    public final /* synthetic */ boolean zzg() {
        if (this.zzD || TextUtils.isEmpty(getServiceDescriptor()) || TextUtils.isEmpty(getLocalStartServiceAction())) {
            return false;
        }
        try {
            Class.forName(getServiceDescriptor());
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public final /* synthetic */ Object zzh() {
        return this.zzq;
    }

    public final /* synthetic */ void zzi(IGmsServiceBroker iGmsServiceBroker) {
        this.zzr = iGmsServiceBroker;
    }

    public final /* synthetic */ ArrayList zzj() {
        return this.zzt;
    }

    public final /* synthetic */ BaseConnectionCallbacks zzk() {
        return this.zzw;
    }

    public final /* synthetic */ BaseOnConnectionFailedListener zzl() {
        return this.zzx;
    }

    public final /* synthetic */ ConnectionResult zzm() {
        return this.zzC;
    }

    public final /* synthetic */ void zzn(ConnectionResult connectionResult) {
        this.zzC = connectionResult;
    }

    public final /* synthetic */ boolean zzo() {
        return this.zzD;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @KeepForSdk
    public BaseGmsClient(@NonNull Context context, @NonNull Looper looper, int i, BaseConnectionCallbacks baseConnectionCallbacks, BaseOnConnectionFailedListener baseOnConnectionFailedListener, String str) {
        GmsClientSupervisor gmsClientSupervisor = GmsClientSupervisor.getInstance(context);
        GoogleApiAvailabilityLight googleApiAvailabilityLight = GoogleApiAvailabilityLight.getInstance();
        Preconditions.checkNotNull(baseConnectionCallbacks);
        Preconditions.checkNotNull(baseOnConnectionFailedListener);
        this(context, looper, gmsClientSupervisor, googleApiAvailabilityLight, i, baseConnectionCallbacks, baseOnConnectionFailedListener, str);
    }

    @KeepForSdk
    public void disconnect(@NonNull String str) {
        this.f38025zzk = str;
        disconnect();
    }

    @KeepForSdk
    public BaseGmsClient(@NonNull Context context, @NonNull Looper looper, @NonNull GmsClientSupervisor gmsClientSupervisor, @NonNull GoogleApiAvailabilityLight googleApiAvailabilityLight, int i, BaseConnectionCallbacks baseConnectionCallbacks, BaseOnConnectionFailedListener baseOnConnectionFailedListener, String str) {
        this.f38025zzk = null;
        this.zzp = new Object();
        this.zzq = new Object();
        this.zzt = new ArrayList();
        this.zzv = 1;
        this.zzC = null;
        this.zzD = false;
        this.zzE = null;
        this.f38019zzd = new AtomicInteger(0);
        Preconditions.checkNotNull(context, "Context must not be null");
        this.f38026zzl = context;
        Preconditions.checkNotNull(looper, "Looper must not be null");
        this.zzm = looper;
        Preconditions.checkNotNull(gmsClientSupervisor, "Supervisor must not be null");
        this.zzn = gmsClientSupervisor;
        Preconditions.checkNotNull(googleApiAvailabilityLight, "API availability must not be null");
        this.zzo = googleApiAvailabilityLight;
        this.f38017zzb = new zzb(this, looper);
        this.zzy = i;
        this.zzw = baseConnectionCallbacks;
        this.zzx = baseOnConnectionFailedListener;
        this.zzz = str;
    }
}
