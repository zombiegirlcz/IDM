package com.fourthline.orca.internal;

import androidx.compose.runtime.Composer;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class fn1 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28577a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zp0 f28578b;

    public /* synthetic */ fn1(zp0 zp0Var, int i) {
        this.f28577a = i;
        this.f28578b = zp0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        int i = this.f28577a;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        switch (i) {
            case 0:
                return hi0.b(this.f28578b, composer, iIntValue);
            case 1:
                return hi0.c(this.f28578b, composer, iIntValue);
            default:
                return wp0.a(this.f28578b, composer, iIntValue);
        }
    }
}
