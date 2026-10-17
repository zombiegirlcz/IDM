package com.fourthline.orca.internal;

import androidx.compose.runtime.Composer;
import androidx.content.NavBackStackEntry;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class yn1 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f35395a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d5 f35396b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ NavBackStackEntry f35397c;
    public final /* synthetic */ int d;

    public /* synthetic */ yn1(d5 d5Var, NavBackStackEntry navBackStackEntry, int i, int i2) {
        this.f35395a = i2;
        this.f35396b = d5Var;
        this.f35397c = navBackStackEntry;
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        int i = this.f35395a;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        switch (i) {
            case 0:
                return j00.d(this.f35396b, this.f35397c, this.d, composer, iIntValue);
            case 1:
                return j00.a(this.f35396b, this.f35397c, this.d, composer, iIntValue);
            case 2:
                return j00.b(this.f35396b, this.f35397c, this.d, composer, iIntValue);
            default:
                return j00.c(this.f35396b, this.f35397c, this.d, composer, iIntValue);
        }
    }
}
