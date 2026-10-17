package com.fourthline.orca.internal;

import androidx.compose.runtime.Composer;
import androidx.content.NavBackStackEntry;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class qr1 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32521a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ pc0 f32522b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ NavBackStackEntry f32523c;
    public final /* synthetic */ int d;

    public /* synthetic */ qr1(pc0 pc0Var, NavBackStackEntry navBackStackEntry, int i, int i2) {
        this.f32521a = i2;
        this.f32522b = pc0Var;
        this.f32523c = navBackStackEntry;
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        int i = this.f32521a;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        switch (i) {
            case 0:
                return r00.b(this.f32522b, this.f32523c, this.d, composer, iIntValue);
            case 1:
                return r00.a(this.f32522b, this.f32523c, this.d, composer, iIntValue);
            default:
                return r00.c(this.f32522b, this.f32523c, this.d, composer, iIntValue);
        }
    }
}
