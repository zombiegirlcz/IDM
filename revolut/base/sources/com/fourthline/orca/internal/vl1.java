package com.fourthline.orca.internal;

import com.fourthline.core.location.LocationProvider;
import com.fourthline.core.location.LocationProviderError;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class vl1 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f34398a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f70 f34399b;

    public /* synthetic */ vl1(f70 f70Var, int i) {
        this.f34398a = i;
        this.f34399b = f70Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f34398a) {
            case 0:
                return f70.b(this.f34399b, (b70) obj2);
            case 1:
                return f70.a(this.f34399b, (b70) obj2);
            case 2:
                return f70.a(this.f34399b, (LocationProvider.AccuracyAuthorization) obj2);
            default:
                return f70.c(this.f34399b, (LocationProviderError) obj2);
        }
    }
}
