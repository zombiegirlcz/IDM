package com.fourthline.core.location.internal;

import android.content.Context;
import android.location.Location;
import android.os.Build;
import android.os.Looper;
import androidx.core.content.PermissionChecker;
import com.fourthline.core.location.Coordinate;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.tasks.Task;
import ib.h;
import java.lang.ref.SoftReference;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.r0;

/* JADX INFO: loaded from: classes23.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0000\u0018\u0000 -2\u00020\u0001:\u0001\u000fB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J1\u0010\u000f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\b2\u0018\u0010\u000e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b0\nH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J=\u0010\u0014\u001a\u00020\r2\u0018\u0010\u0011\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b0\n2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\r0\u000bH\u0017¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0018\u0010!\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R$\u0010\t\u001a\u0004\u0018\u00010\f8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u0014\u0010*\u001a\u00020(8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010)R\u001a\u0010,\u001a\u00020(*\u0004\u0018\u00010\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010+¨\u0006."}, d2 = {"Lcom/fourthline/core/location/internal/LocationFetcherImpl;", "Lcom/fourthline/core/location/internal/LocationFetcher;", "Landroid/content/Context;", "context", "Lcom/fourthline/core/location/internal/VpnConnectivityChecker;", "vpnConnectivityChecker", "<init>", "(Landroid/content/Context;Lcom/fourthline/core/location/internal/VpnConnectivityChecker;)V", "Landroid/location/Location;", "location", "Ljava/lang/ref/SoftReference;", "Lkotlin/Function1;", "Lcom/fourthline/core/location/Coordinate;", "", "locationCallback", "a", "(Landroid/location/Location;Ljava/lang/ref/SoftReference;)V", "success", "", "failure", "start", "(Ljava/lang/ref/SoftReference;Lkotlin/jvm/functions/Function1;)V", "stop", "()V", "Landroid/content/Context;", "b", "Lcom/fourthline/core/location/internal/VpnConnectivityChecker;", "Lcom/google/android/gms/location/LocationCallback;", "c", "Lcom/google/android/gms/location/LocationCallback;", "Lcom/google/android/gms/location/FusedLocationProviderClient;", "d", "Lcom/google/android/gms/location/FusedLocationProviderClient;", "fusedProviderClient", "e", "Lcom/fourthline/core/location/Coordinate;", "getLocation", "()Lcom/fourthline/core/location/Coordinate;", "setLocation", "(Lcom/fourthline/core/location/Coordinate;)V", "", "()Z", "isReducedAccuracy", "(Landroid/location/Location;)Z", "isFromMockedSource", "f", "fourthline-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class LocationFetcherImpl implements LocationFetcher {

    @Deprecated
    public static final long FASTEST_INTERVAL = 200;

    @Deprecated
    public static final long INTERVAL = 500;

    @Deprecated
    public static final long MAX_WAITING_TIME = 500;
    private static final a f = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final VpnConnectivityChecker vpnConnectivityChecker;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private LocationCallback locationCallback;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private FusedLocationProviderClient fusedProviderClient;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private Coordinate location;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public LocationFetcherImpl(@NotNull Context context, @NotNull VpnConnectivityChecker vpnConnectivityChecker) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(vpnConnectivityChecker, "vpnConnectivityChecker");
        this.context = context;
        this.vpnConnectivityChecker = vpnConnectivityChecker;
    }

    @Override // com.fourthline.core.location.internal.LocationFetcher
    public Coordinate getLocation() {
        return this.location;
    }

    public void setLocation(Coordinate coordinate) {
        this.location = coordinate;
    }

    @Override // com.fourthline.core.location.internal.LocationFetcher
    public void start(@NotNull final SoftReference<Function1<Coordinate, Unit>> success, @NotNull Function1<? super Throwable, Unit> failure) {
        FusedLocationProviderClient fusedLocationProviderClient;
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(failure, "failure");
        try {
            this.fusedProviderClient = LocationServices.getFusedLocationProviderClient(this.context);
            this.locationCallback = new LocationCallback() { // from class: com.fourthline.core.location.internal.LocationFetcherImpl.start.1
                @Override // com.google.android.gms.location.LocationCallback
                public void onLocationResult(LocationResult locationResult) {
                    Intrinsics.checkNotNullParameter(locationResult, "locationResult");
                    Location lastLocation = locationResult.getLastLocation();
                    if (lastLocation != null) {
                        LocationFetcherImpl.this.a(lastLocation, success);
                    }
                }
            };
            LocationRequest locationRequestCreate = LocationRequest.create();
            locationRequestCreate.setPriority(a() ? 102 : 100);
            locationRequestCreate.setMaxWaitTime(500L);
            locationRequestCreate.setInterval(500L);
            locationRequestCreate.setFastestInterval(200L);
            Intrinsics.checkNotNullExpressionValue(locationRequestCreate, "apply(...)");
            FusedLocationProviderClient fusedLocationProviderClient2 = this.fusedProviderClient;
            if (fusedLocationProviderClient2 != null) {
                fusedLocationProviderClient2.getLocationAvailability().addOnSuccessListener(new c(0, new b(fusedLocationProviderClient2, 0, this, success)));
            }
            LocationCallback locationCallback = this.locationCallback;
            if (locationCallback == null || (fusedLocationProviderClient = this.fusedProviderClient) == null) {
                return;
            }
            fusedLocationProviderClient.requestLocationUpdates(locationRequestCreate, locationCallback, Looper.getMainLooper());
        } catch (Exception e) {
            stop();
            failure.invoke(e);
        }
    }

    @Override // com.fourthline.core.location.internal.LocationFetcher
    public void stop() {
        FusedLocationProviderClient fusedLocationProviderClient;
        Task<Void> taskRemoveLocationUpdates;
        LocationCallback locationCallback = this.locationCallback;
        if (locationCallback != null && (fusedLocationProviderClient = this.fusedProviderClient) != null && (taskRemoveLocationUpdates = fusedLocationProviderClient.removeLocationUpdates(locationCallback)) != null) {
            taskRemoveLocationUpdates.addOnSuccessListener(new c(1, new aem.d(13)));
        }
        this.locationCallback = null;
        this.fusedProviderClient = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(FusedLocationProviderClient fusedLocationProviderClient, LocationFetcherImpl locationFetcherImpl, SoftReference softReference, LocationAvailability locationAvailability) {
        if (locationAvailability.isLocationAvailable()) {
            fusedLocationProviderClient.getLastLocation().addOnSuccessListener(new c(2, new d(locationFetcherImpl, softReference, 0)));
        }
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(Function1 function1, Object obj2) {
        function1.invoke(obj2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(Function1 function1, Object obj2) {
        function1.invoke(obj2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Function1 function1, Object obj2) {
        function1.invoke(obj2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(LocationFetcherImpl locationFetcherImpl, SoftReference softReference, Location location) {
        if (location != null && locationFetcherImpl.locationCallback != null) {
            locationFetcherImpl.a(location, softReference);
        }
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(Location location, SoftReference locationCallback) {
        Function1 function1 = (Function1) locationCallback.get();
        Objects.toString(location);
        Objects.toString(function1);
        Coordinate coordinate = new Coordinate(location.getLatitude(), location.getLongitude());
        boolean zA = a(location);
        boolean zIsVpnEnabled = this.vpnConnectivityChecker.isVpnEnabled();
        boolean zA2 = a();
        h hVar = hb.a.f150532a;
        hb.a.c(r0.k(new Pair("is_from_mocked_source", Boolean.valueOf(zA)), new Pair("is_vpn_enabled", Boolean.valueOf(zIsVpnEnabled)), new Pair("location_accuracy", zA2 ? "REDUCED" : "FULL")), "location_scan_did_retrieve_location", 2);
        setLocation(coordinate);
        if (function1 != null) {
            function1.invoke(coordinate);
        }
    }

    private final boolean a() {
        return PermissionChecker.checkSelfPermission(this.context, "android.permission.ACCESS_FINE_LOCATION") != 0;
    }

    private final boolean a(Location location) {
        if (location != null) {
            return Build.VERSION.SDK_INT >= 31 ? location.isMock() : location.isFromMockProvider();
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(Void r06) {
        return Unit.f186387a;
    }
}
