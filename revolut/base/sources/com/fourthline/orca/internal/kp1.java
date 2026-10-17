package com.fourthline.orca.internal;

import androidx.compose.runtime.Composer;
import androidx.content.NavBackStackEntry;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class kp1 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30357a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ gq f30358b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ NavBackStackEntry f30359c;
    public final /* synthetic */ int d;

    public /* synthetic */ kp1(gq gqVar, NavBackStackEntry navBackStackEntry, int i, int i2) {
        this.f30357a = i2;
        this.f30358b = gqVar;
        this.f30359c = navBackStackEntry;
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        int i = this.f30357a;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        switch (i) {
            case 0:
                return m00.b(this.f30358b, this.f30359c, this.d, composer, iIntValue);
            case 1:
                return m00.c(this.f30358b, this.f30359c, this.d, composer, iIntValue);
            case 2:
                return m00.a(this.f30358b, this.f30359c, this.d, composer, iIntValue);
            default:
                return m00.d(this.f30358b, this.f30359c, this.d, composer, iIntValue);
        }
    }
}
