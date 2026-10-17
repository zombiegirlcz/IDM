package com.fourthline.core.location.internal;

import com.fourthline.core.location.Coordinate;
import com.fourthline.core.location.LocationProvider;
import com.fourthline.core.location.LocationProviderError;
import java.lang.ref.SoftReference;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ#\u0010\u000e\u001a\u00020\f2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u000e\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u0010J\u0017\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u000e\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0014\u0010\u0010J\u000f\u0010\u0015\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0015\u0010\u0010J+\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u00162\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\f0\nH\u0002¢\u0006\u0004\b\u000e\u0010\u001aJ7\u0010\u001b\u001a\u00020\f2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\f0\nH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ7\u0010\u001e\u001a\u00020\f2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\f0\n2\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\f0\nH\u0016¢\u0006\u0004\b\u001e\u0010\u001cJ7\u0010 \u001a\u00020\f2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\f0\n2\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\f0\nH\u0016¢\u0006\u0004\b \u0010\u001cJ\u000f\u0010!\u001a\u00020\fH\u0016¢\u0006\u0004\b!\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\"R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010#R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010$R\u001c\u0010(\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u001a\u0010+\u001a\u00020)*\u0004\u0018\u00010\u00168BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010*R\u0014\u0010.\u001a\u00020)8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-R\u0014\u00101\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b/\u00100R\u0014\u00104\u001a\u00020\u001d8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b2\u00103R\u0016\u00107\u001a\u0004\u0018\u00010\u001f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b5\u00106¨\u00068"}, d2 = {"Lcom/fourthline/core/location/internal/LocationProviderImpl;", "Lcom/fourthline/core/location/LocationProvider;", "Lcom/fourthline/core/location/internal/AuthorizationManager;", "authorizationManager", "Lcom/fourthline/core/location/internal/LocationAvailabilityChecker;", "locationAvailabilityChecker", "Lcom/fourthline/core/location/internal/LocationFetcher;", "locationFetcher", "<init>", "(Lcom/fourthline/core/location/internal/AuthorizationManager;Lcom/fourthline/core/location/internal/LocationAvailabilityChecker;Lcom/fourthline/core/location/internal/LocationFetcher;)V", "Lkotlin/Function1;", "Lcom/fourthline/core/location/LocationProvider$AuthorizationStatus;", "", "success", "a", "(Lkotlin/jvm/functions/Function1;)V", "()V", "Lcom/fourthline/core/location/internal/Request;", "request", "(Lcom/fourthline/core/location/internal/Request;)V", "b", "c", "", "e", "Lcom/fourthline/core/location/LocationProviderError;", "failure", "(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function1;)V", "requestAuthorization", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "Lcom/fourthline/core/location/LocationProvider$AccuracyAuthorization;", "requestFullAccuracy", "Lcom/fourthline/core/location/Coordinate;", "requestLocation", "cancelLocationRequest", "Lcom/fourthline/core/location/internal/AuthorizationManager;", "Lcom/fourthline/core/location/internal/LocationAvailabilityChecker;", "Lcom/fourthline/core/location/internal/LocationFetcher;", "Ljava/util/concurrent/atomic/AtomicReference;", "d", "Ljava/util/concurrent/atomic/AtomicReference;", "currentRequest", "", "(Ljava/lang/Throwable;)Z", "isKnownError", "getLocationServicesEnabled", "()Z", "locationServicesEnabled", "getAuthorizationStatus", "()Lcom/fourthline/core/location/LocationProvider$AuthorizationStatus;", "authorizationStatus", "getAccuracyAuthorization", "()Lcom/fourthline/core/location/LocationProvider$AccuracyAuthorization;", "accuracyAuthorization", "getLocation", "()Lcom/fourthline/core/location/Coordinate;", "location", "fourthline-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class LocationProviderImpl implements LocationProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final AuthorizationManager authorizationManager;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final LocationAvailabilityChecker locationAvailabilityChecker;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final LocationFetcher locationFetcher;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final AtomicReference currentRequest;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[LocationProvider.AuthorizationStatus.values().length];
            try {
                iArr[LocationProvider.AuthorizationStatus.NOT_DETERMINED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LocationProvider.AuthorizationStatus.AUTHORIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LocationProvider.AuthorizationStatus.DENIED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[LocationProvider.AccuracyAuthorization.values().length];
            try {
                iArr2[LocationProvider.AccuracyAuthorization.FULL.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[LocationProvider.AccuracyAuthorization.REDUCED.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public LocationProviderImpl(@NotNull AuthorizationManager authorizationManager, @NotNull LocationAvailabilityChecker locationAvailabilityChecker, @NotNull LocationFetcher locationFetcher) {
        Intrinsics.checkNotNullParameter(authorizationManager, "authorizationManager");
        Intrinsics.checkNotNullParameter(locationAvailabilityChecker, "locationAvailabilityChecker");
        Intrinsics.checkNotNullParameter(locationFetcher, "locationFetcher");
        this.authorizationManager = authorizationManager;
        this.locationAvailabilityChecker = locationAvailabilityChecker;
        this.locationFetcher = locationFetcher;
        this.currentRequest = new AtomicReference(null);
    }

    private final void a(Function1 success) {
        this.authorizationManager.requestAuthorization(new e(this, success, 2));
    }

    private final void b() {
        if (!getLocationServicesEnabled()) {
            throw LocationProviderError.LocationServicesNotEnabled.INSTANCE;
        }
    }

    private final void c() {
        if (getAuthorizationStatus() != LocationProvider.AuthorizationStatus.AUTHORIZED) {
            throw LocationProviderError.LocationPermissionsNotGranted.INSTANCE;
        }
    }

    @Override // com.fourthline.core.location.LocationProvider
    public void cancelLocationRequest() {
        this.locationFetcher.stop();
        a();
    }

    @Override // com.fourthline.core.location.LocationProvider
    @NotNull
    public LocationProvider.AccuracyAuthorization getAccuracyAuthorization() {
        return this.authorizationManager.getAuthorizationAccuracy();
    }

    @Override // com.fourthline.core.location.LocationProvider
    @NotNull
    public LocationProvider.AuthorizationStatus getAuthorizationStatus() {
        return this.authorizationManager.getAuthorizationStatus();
    }

    @Override // com.fourthline.core.location.LocationProvider
    public Coordinate getLocation() {
        return this.locationFetcher.getLocation();
    }

    @Override // com.fourthline.core.location.LocationProvider
    public boolean getLocationServicesEnabled() {
        return this.locationAvailabilityChecker.isLocationEnabled();
    }

    @Override // com.fourthline.core.location.LocationProvider
    public void requestAuthorization(@NotNull Function1<? super LocationProvider.AuthorizationStatus, Unit> success, @NotNull Function1<? super LocationProviderError, Unit> failure) {
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(failure, "failure");
        try {
            a(Request.AUTHORIZATION);
            b();
            int i = WhenMappings.$EnumSwitchMapping$0[getAuthorizationStatus().ordinal()];
            if (i == 1) {
                a(success);
                return;
            }
            if (i == 2) {
                a();
                success.invoke(LocationProvider.AuthorizationStatus.AUTHORIZED);
            } else {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                a();
                success.invoke(LocationProvider.AuthorizationStatus.DENIED);
            }
        } catch (Exception e) {
            a();
            a(e, failure);
        }
    }

    @Override // com.fourthline.core.location.LocationProvider
    public void requestFullAccuracy(@NotNull Function1<? super LocationProvider.AccuracyAuthorization, Unit> success, @NotNull Function1<? super LocationProviderError, Unit> failure) {
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(failure, "failure");
        try {
            a(Request.FULL_ACCURACY);
            b();
            c();
            int i = WhenMappings.$EnumSwitchMapping$1[getAccuracyAuthorization().ordinal()];
            if (i == 1) {
                a();
                success.invoke(LocationProvider.AccuracyAuthorization.FULL);
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                a(new e(success, this));
            }
        } catch (Exception e) {
            a();
            a(e, failure);
        }
    }

    @Override // com.fourthline.core.location.LocationProvider
    public void requestLocation(@NotNull Function1<? super Coordinate, Unit> success, @NotNull Function1<? super LocationProviderError, Unit> failure) {
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(failure, "failure");
        try {
            a(Request.LOCATION_UPDATES);
            b();
            c();
            this.locationFetcher.start(new SoftReference<>(new e(this, success, 0)), new e(this, failure, 1));
        } catch (Exception e) {
            cancelLocationRequest();
            a(e, failure);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(LocationProviderImpl locationProviderImpl, Function1 function1, Map permissions) {
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        locationProviderImpl.a();
        Object obj2 = permissions.get("android.permission.ACCESS_FINE_LOCATION");
        if (obj2 == null) {
            obj2 = Boolean.FALSE;
        }
        if (((Boolean) obj2).booleanValue()) {
            function1.invoke(LocationProvider.AuthorizationStatus.AUTHORIZED);
        } else {
            Object obj3 = permissions.get("android.permission.ACCESS_COARSE_LOCATION");
            if (obj3 == null) {
                obj3 = Boolean.FALSE;
            }
            if (((Boolean) obj3).booleanValue()) {
                function1.invoke(LocationProvider.AuthorizationStatus.AUTHORIZED);
            } else {
                function1.invoke(LocationProvider.AuthorizationStatus.DENIED);
            }
        }
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(Function1 function1, LocationProviderImpl locationProviderImpl, LocationProvider.AuthorizationStatus it8) {
        Intrinsics.checkNotNullParameter(it8, "it");
        function1.invoke(locationProviderImpl.authorizationManager.getAuthorizationAccuracy());
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(LocationProviderImpl locationProviderImpl, Function1 function1, Coordinate it8) {
        Intrinsics.checkNotNullParameter(it8, "it");
        locationProviderImpl.cancelLocationRequest();
        function1.invoke(it8);
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(LocationProviderImpl locationProviderImpl, Function1 function1, Throwable it8) {
        Intrinsics.checkNotNullParameter(it8, "it");
        locationProviderImpl.cancelLocationRequest();
        locationProviderImpl.a(it8, function1);
        return Unit.f186387a;
    }

    private final void a() {
        this.currentRequest.set(null);
    }

    private final void a(Request request) {
        Request request2 = (Request) this.currentRequest.getAndSet(request);
        if (request2 != null) {
            throw new LocationProviderError.AnotherRequestInProgress(request2.name());
        }
    }

    private final void a(Throwable e, Function1 failure) {
        if ((e instanceof LocationProviderError) && a(e)) {
            failure.invoke(e);
        } else {
            failure.invoke(new LocationProviderError.Unknown(e));
        }
    }

    private final boolean a(Throwable th10) {
        return (th10 instanceof LocationProviderError.LocationServicesNotEnabled) || (th10 instanceof LocationProviderError.LocationPermissionsNotGranted) || (th10 instanceof LocationProviderError.AnotherRequestInProgress);
    }
}
