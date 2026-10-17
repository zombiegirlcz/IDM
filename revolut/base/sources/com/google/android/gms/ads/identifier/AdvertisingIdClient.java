package com.google.android.gms.ads.identifier;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.RemoteException;
import android.os.SystemClock;
import androidx.annotation.NonNull;
import com.google.android.gms.common.BlockingServiceConnection;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.annotation.KeepForSdkWithMembers;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.ads_identifier.zze;
import com.google.android.gms.internal.ads_identifier.zzf;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
@KeepForSdk
public class AdvertisingIdClient {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    BlockingServiceConnection f37253zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    zzf f37254zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    boolean f37255zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    final Object f37256zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    zzb f37257zze;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    final long f37258zzf;

    /* JADX INFO: renamed from: zzg, reason: collision with root package name */
    private final Context f37259zzg;

    @KeepForSdkWithMembers
    public static final class Info {

        /* JADX INFO: renamed from: zza, reason: collision with root package name */
        private final String f37260zza;

        /* JADX INFO: renamed from: zzb, reason: collision with root package name */
        private final boolean f37261zzb;

        @Deprecated
        public Info(String str, boolean z) {
            this.f37260zza = str;
            this.f37261zzb = z;
        }

        public String getId() {
            return this.f37260zza;
        }

        public boolean isLimitAdTrackingEnabled() {
            return this.f37261zzb;
        }

        @NonNull
        public String toString() {
            String str = this.f37260zza;
            boolean z = this.f37261zzb;
            StringBuilder sb6 = new StringBuilder(String.valueOf(str).length() + 7);
            sb6.append("{");
            sb6.append(str);
            sb6.append("}");
            sb6.append(z);
            return sb6.toString();
        }
    }

    @KeepForSdk
    public AdvertisingIdClient(@NonNull Context context) {
        this(context, 30000L, false, false);
    }

    @NonNull
    @KeepForSdk
    public static Info getAdvertisingIdInfo(@NonNull Context context) throws GooglePlayServicesRepairableException, IllegalStateException, GooglePlayServicesNotAvailableException, IOException {
        AdvertisingIdClient advertisingIdClient = new AdvertisingIdClient(context, -1L, true, false);
        try {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            advertisingIdClient.zzb(false);
            Info infoZzd = advertisingIdClient.zzd(-1);
            advertisingIdClient.zzc(infoZzd, true, BitmapDescriptorFactory.HUE_RED, SystemClock.elapsedRealtime() - jElapsedRealtime, "", null);
            return infoZzd;
        } finally {
        }
    }

    @KeepForSdk
    public static boolean getIsAdIdFakeForDebugLogging(@NonNull Context context) throws GooglePlayServicesRepairableException, GooglePlayServicesNotAvailableException, IOException {
        boolean zZzd;
        AdvertisingIdClient advertisingIdClient = new AdvertisingIdClient(context, -1L, false, false);
        try {
            advertisingIdClient.zzb(false);
            Preconditions.checkNotMainThread("Calling this from your main thread can lead to deadlock");
            synchronized (advertisingIdClient) {
                try {
                    if (!advertisingIdClient.f37255zzc) {
                        synchronized (advertisingIdClient.f37256zzd) {
                            zzb zzbVar = advertisingIdClient.f37257zze;
                            if (zzbVar == null || !zzbVar.f37264zzb) {
                                throw new IOException("AdvertisingIdClient is not connected.");
                            }
                        }
                        try {
                            advertisingIdClient.zzb(false);
                            if (!advertisingIdClient.f37255zzc) {
                                throw new IOException("AdvertisingIdClient cannot reconnect.");
                            }
                        } catch (Exception e) {
                            throw new IOException("AdvertisingIdClient cannot reconnect.", e);
                        }
                    }
                    Preconditions.checkNotNull(advertisingIdClient.f37253zza);
                    Preconditions.checkNotNull(advertisingIdClient.f37254zzb);
                    try {
                        zZzd = advertisingIdClient.f37254zzb.zzd();
                    } catch (RemoteException e2) {
                        throw new IOException("Remote exception");
                    }
                } catch (Throwable th10) {
                    throw th10;
                }
            }
            advertisingIdClient.zze();
            advertisingIdClient.zza();
            return zZzd;
        } catch (Throwable th11) {
            advertisingIdClient.zza();
            throw th11;
        }
    }

    @ShowFirstParty
    @KeepForSdk
    public static void setShouldSkipGmsCoreVersionCheck(boolean z) {
    }

    private final Info zzd(int i) throws IOException {
        Info info;
        Preconditions.checkNotMainThread("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (!this.f37255zzc) {
                    synchronized (this.f37256zzd) {
                        zzb zzbVar = this.f37257zze;
                        if (zzbVar == null || !zzbVar.f37264zzb) {
                            throw new IOException("AdvertisingIdClient is not connected.");
                        }
                    }
                    try {
                        zzb(false);
                        if (!this.f37255zzc) {
                            throw new IOException("AdvertisingIdClient cannot reconnect.");
                        }
                    } catch (Exception e) {
                        throw new IOException("AdvertisingIdClient cannot reconnect.", e);
                    }
                }
                Preconditions.checkNotNull(this.f37253zza);
                Preconditions.checkNotNull(this.f37254zzb);
                try {
                    info = new Info(this.f37254zzb.zzc(), this.f37254zzb.zze(true));
                } catch (RemoteException e2) {
                    throw new IOException("Remote exception");
                }
            } catch (Throwable th10) {
                throw th10;
            }
        }
        zze();
        return info;
    }

    private final void zze() {
        synchronized (this.f37256zzd) {
            zzb zzbVar = this.f37257zze;
            if (zzbVar != null) {
                zzbVar.f37263zza.countDown();
                try {
                    this.f37257zze.join();
                } catch (InterruptedException unused) {
                }
            }
            long j2 = this.f37258zzf;
            if (j2 > 0) {
                this.f37257zze = new zzb(this, j2);
            }
        }
    }

    public final void finalize() throws Throwable {
        zza();
        super.finalize();
    }

    @NonNull
    @KeepForSdk
    public Info getInfo() throws IOException {
        return zzd(-1);
    }

    @KeepForSdk
    public void start() throws GooglePlayServicesRepairableException, IllegalStateException, GooglePlayServicesNotAvailableException, IOException {
        zzb(true);
    }

    public final void zza() {
        Preconditions.checkNotMainThread("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (this.f37259zzg == null || this.f37253zza == null) {
                    return;
                }
                try {
                    if (this.f37255zzc) {
                        ConnectionTracker.getInstance().unbindService(this.f37259zzg, this.f37253zza);
                    }
                } catch (Throwable th10) {
                }
                this.f37255zzc = false;
                this.f37254zzb = null;
                this.f37253zza = null;
            } catch (Throwable th11) {
                throw th11;
            }
        }
    }

    @VisibleForTesting
    public final void zzb(boolean z) throws GooglePlayServicesRepairableException, IllegalStateException, GooglePlayServicesNotAvailableException, IOException {
        Preconditions.checkNotMainThread("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (this.f37255zzc) {
                    zza();
                }
                Context context = this.f37259zzg;
                try {
                    context.getPackageManager().getPackageInfo("com.android.vending", 0);
                    int iIsGooglePlayServicesAvailable = GoogleApiAvailabilityLight.getInstance().isGooglePlayServicesAvailable(context, 12451000);
                    if (iIsGooglePlayServicesAvailable != 0 && iIsGooglePlayServicesAvailable != 2) {
                        throw new IOException("Google Play services not available");
                    }
                    BlockingServiceConnection blockingServiceConnection = new BlockingServiceConnection();
                    Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
                    intent.setPackage("com.google.android.gms");
                    try {
                        if (!ConnectionTracker.getInstance().bindService(context, intent, blockingServiceConnection, 1)) {
                            throw new IOException("Connection failure");
                        }
                        this.f37253zza = blockingServiceConnection;
                        try {
                            this.f37254zzb = zze.zza(blockingServiceConnection.getServiceWithTimeout(10000L, TimeUnit.MILLISECONDS));
                            this.f37255zzc = true;
                            if (z) {
                                zze();
                            }
                        } catch (InterruptedException unused) {
                            throw new IOException("Interrupted exception");
                        } catch (Throwable th10) {
                            throw new IOException(th10);
                        }
                    } finally {
                        IOException iOException = new IOException(th10);
                    }
                } catch (PackageManager.NameNotFoundException unused2) {
                    throw new GooglePlayServicesNotAvailableException(9);
                }
            } catch (Throwable th11) {
                throw th11;
            }
        }
    }

    @VisibleForTesting
    public final boolean zzc(Info info, boolean z, float f, long j2, String str, Throwable th10) {
        if (Math.random() > 0.0d) {
            return false;
        }
        HashMap map = new HashMap();
        map.put("app_context", "1");
        if (info != null) {
            map.put("limit_ad_tracking", true != info.isLimitAdTrackingEnabled() ? "0" : "1");
            String id10 = info.getId();
            if (id10 != null) {
                map.put("ad_id_size", Integer.toString(id10.length()));
            }
        }
        if (th10 != null) {
            map.put("error", th10.getClass().getName());
        }
        map.put("tag", "AdvertisingIdClient");
        map.put("time_spent", Long.toString(j2));
        new zza(this, map).start();
        return true;
    }

    @VisibleForTesting
    public AdvertisingIdClient(@NonNull Context context, long j2, boolean z, boolean z3) {
        Context applicationContext;
        this.f37256zzd = new Object();
        Preconditions.checkNotNull(context);
        if (z && (applicationContext = context.getApplicationContext()) != null) {
            context = applicationContext;
        }
        this.f37259zzg = context;
        this.f37255zzc = false;
        this.f37258zzf = j2;
    }
}
