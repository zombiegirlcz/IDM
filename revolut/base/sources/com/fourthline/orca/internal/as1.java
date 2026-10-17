package com.fourthline.orca.internal;

import androidx.compose.runtime.Composer;
import androidx.content.NavBackStackEntry;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class as1 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26896a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ge0 f26897b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ NavBackStackEntry f26898c;
    public final /* synthetic */ int d;

    public /* synthetic */ as1(ge0 ge0Var, NavBackStackEntry navBackStackEntry, int i, int i2) {
        this.f26896a = i2;
        this.f26897b = ge0Var;
        this.f26898c = navBackStackEntry;
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        int i = this.f26896a;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        switch (i) {
            case 0:
                return s00.c(this.f26897b, this.f26898c, this.d, composer, iIntValue);
            case 1:
                return s00.a(this.f26897b, this.f26898c, this.d, composer, iIntValue);
            default:
                return s00.b(this.f26897b, this.f26898c, this.d, composer, iIntValue);
        }
    }
}
