package com.fourthline.orca.internal;

import androidx.compose.runtime.Composer;
import androidx.content.NavBackStackEntry;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class ks1 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30381a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ dv0 f30382b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ NavBackStackEntry f30383c;
    public final /* synthetic */ int d;

    public /* synthetic */ ks1(dv0 dv0Var, NavBackStackEntry navBackStackEntry, int i, int i2) {
        this.f30381a = i2;
        this.f30382b = dv0Var;
        this.f30383c = navBackStackEntry;
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        int i = this.f30381a;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        switch (i) {
            case 0:
                return u00.a(this.f30382b, this.f30383c, this.d, composer, iIntValue);
            default:
                return u00.b(this.f30382b, this.f30383c, this.d, composer, iIntValue);
        }
    }
}
