package com.fourthline.orca.internal;

import androidx.compose.runtime.Composer;
import androidx.content.NavBackStackEntry;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class gs1 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28990a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ dn0 f28991b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ NavBackStackEntry f28992c;
    public final /* synthetic */ int d;

    public /* synthetic */ gs1(dn0 dn0Var, NavBackStackEntry navBackStackEntry, int i, int i2) {
        this.f28990a = i2;
        this.f28991b = dn0Var;
        this.f28992c = navBackStackEntry;
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        int i = this.f28990a;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        switch (i) {
            case 0:
                return t00.e(this.f28991b, this.f28992c, this.d, composer, iIntValue);
            case 1:
                return t00.b(this.f28991b, this.f28992c, this.d, composer, iIntValue);
            case 2:
                return t00.a(this.f28991b, this.f28992c, this.d, composer, iIntValue);
            case 3:
                return t00.c(this.f28991b, this.f28992c, this.d, composer, iIntValue);
            default:
                return t00.d(this.f28991b, this.f28992c, this.d, composer, iIntValue);
        }
    }
}
