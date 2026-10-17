package com.fourthline.orca.internal;

import androidx.compose.runtime.Composer;
import androidx.content.NavBackStackEntry;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class yq1 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f35418a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ nt f35419b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ NavBackStackEntry f35420c;
    public final /* synthetic */ int d;

    public /* synthetic */ yq1(nt ntVar, NavBackStackEntry navBackStackEntry, int i, int i2) {
        this.f35418a = i2;
        this.f35419b = ntVar;
        this.f35420c = navBackStackEntry;
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        int i = this.f35418a;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        switch (i) {
            case 0:
                return p00.a(this.f35419b, this.f35420c, this.d, composer, iIntValue);
            case 1:
                return p00.f(this.f35419b, this.f35420c, this.d, composer, iIntValue);
            case 2:
                return p00.b(this.f35419b, this.f35420c, this.d, composer, iIntValue);
            case 3:
                return p00.d(this.f35419b, this.f35420c, this.d, composer, iIntValue);
            case 4:
                return p00.e(this.f35419b, this.f35420c, this.d, composer, iIntValue);
            default:
                return p00.c(this.f35419b, this.f35420c, this.d, composer, iIntValue);
        }
    }
}
