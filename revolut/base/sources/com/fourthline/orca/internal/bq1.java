package com.fourthline.orca.internal;

import androidx.compose.runtime.Composer;
import androidx.content.NavBackStackEntry;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class bq1 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27196a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ xk f27197b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ NavBackStackEntry f27198c;
    public final /* synthetic */ int d;

    public /* synthetic */ bq1(xk xkVar, NavBackStackEntry navBackStackEntry, int i, int i2) {
        this.f27196a = i2;
        this.f27197b = xkVar;
        this.f27198c = navBackStackEntry;
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        int i = this.f27196a;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        switch (i) {
            case 0:
                return n00.c(this.f27197b, this.f27198c, this.d, composer, iIntValue);
            case 1:
                return n00.b(this.f27197b, this.f27198c, this.d, composer, iIntValue);
            default:
                return n00.a(this.f27197b, this.f27198c, this.d, composer, iIntValue);
        }
    }
}
