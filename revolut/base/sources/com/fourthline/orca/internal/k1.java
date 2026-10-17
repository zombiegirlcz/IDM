package com.fourthline.orca.internal;

import com.fourthline.core.location.Coordinate;
import com.fourthline.core.location.LocationProvider;
import com.fourthline.core.location.LocationProviderError;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class k1 implements LocationProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final LocationProvider f30089a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final k81 f30090b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f30091c;

    public k1(LocationProvider delegate, k81 timedProcessAnalytics) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(timedProcessAnalytics, "timedProcessAnalytics");
        this.f30089a = delegate;
        this.f30090b = timedProcessAnalytics;
        this.f30091c = "geolocation_fetch_location";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(k1 k1Var, Function1 function1, Coordinate it8) {
        Intrinsics.checkNotNullParameter(it8, "it");
        k1Var.f30090b.c(k1Var.f30091c);
        function1.invoke(it8);
        return Unit.f186387a;
    }

    @Override // com.fourthline.core.location.LocationProvider
    public void cancelLocationRequest() {
        this.f30089a.cancelLocationRequest();
    }

    @Override // com.fourthline.core.location.LocationProvider
    public LocationProvider.AccuracyAuthorization getAccuracyAuthorization() {
        return this.f30089a.getAccuracyAuthorization();
    }

    @Override // com.fourthline.core.location.LocationProvider
    public LocationProvider.AuthorizationStatus getAuthorizationStatus() {
        return this.f30089a.getAuthorizationStatus();
    }

    @Override // com.fourthline.core.location.LocationProvider
    public Coordinate getLocation() {
        return this.f30089a.getLocation();
    }

    @Override // com.fourthline.core.location.LocationProvider
    public boolean getLocationServicesEnabled() {
        return this.f30089a.getLocationServicesEnabled();
    }

    @Override // com.fourthline.core.location.LocationProvider
    public void requestAuthorization(Function1 success, Function1 failure) {
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(failure, "failure");
        this.f30089a.requestAuthorization(success, failure);
    }

    @Override // com.fourthline.core.location.LocationProvider
    public void requestFullAccuracy(Function1 success, Function1 failure) {
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(failure, "failure");
        this.f30089a.requestFullAccuracy(success, failure);
    }

    @Override // com.fourthline.core.location.LocationProvider
    public void requestLocation(final Function1 success, final Function1 failure) {
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(failure, "failure");
        this.f30090b.b(this.f30091c);
        LocationProvider locationProvider = this.f30089a;
        final int i = 0;
        Function1<? super Coordinate, Unit> function1 = new Function1(this) { // from class: com.fourthline.orca.internal.oo1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ k1 f31706b;

            {
                this.f31706b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i) {
                    case 0:
                        return k1.a(this.f31706b, success, (Coordinate) obj2);
                    default:
                        return k1.a(this.f31706b, success, (LocationProviderError) obj2);
                }
            }
        };
        final int i2 = 1;
        locationProvider.requestLocation(function1, new Function1(this) { // from class: com.fourthline.orca.internal.oo1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ k1 f31706b;

            {
                this.f31706b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i2) {
                    case 0:
                        return k1.a(this.f31706b, failure, (Coordinate) obj2);
                    default:
                        return k1.a(this.f31706b, failure, (LocationProviderError) obj2);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(k1 k1Var, Function1 function1, LocationProviderError it8) {
        Intrinsics.checkNotNullParameter(it8, "it");
        k1Var.f30090b.a(k1Var.f30091c);
        function1.invoke(it8);
        return Unit.f186387a;
    }
}
