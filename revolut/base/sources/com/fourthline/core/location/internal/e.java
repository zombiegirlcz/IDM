package com.fourthline.core.location.internal;

import com.fourthline.core.location.Coordinate;
import com.fourthline.core.location.LocationProvider;
import java.util.Map;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class e implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26450a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LocationProviderImpl f26451b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function1 f26452c;

    public /* synthetic */ e(LocationProviderImpl locationProviderImpl, Function1 function1, int i) {
        this.f26450a = i;
        this.f26451b = locationProviderImpl;
        this.f26452c = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f26450a) {
            case 0:
                return LocationProviderImpl.a(this.f26451b, this.f26452c, (Coordinate) obj2);
            case 1:
                return LocationProviderImpl.a(this.f26451b, this.f26452c, (Throwable) obj2);
            case 2:
                return LocationProviderImpl.a(this.f26451b, this.f26452c, (Map) obj2);
            default:
                return LocationProviderImpl.a(this.f26452c, this.f26451b, (LocationProvider.AuthorizationStatus) obj2);
        }
    }

    public /* synthetic */ e(Function1 function1, LocationProviderImpl locationProviderImpl) {
        this.f26450a = 3;
        this.f26452c = function1;
        this.f26451b = locationProviderImpl;
    }
}
