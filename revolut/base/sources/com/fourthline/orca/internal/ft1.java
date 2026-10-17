package com.fourthline.orca.internal;

import androidx.compose.runtime.Composer;
import androidx.content.NavBackStackEntry;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class ft1 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28662a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n91 f28663b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ NavBackStackEntry f28664c;
    public final /* synthetic */ int d;

    public /* synthetic */ ft1(n91 n91Var, NavBackStackEntry navBackStackEntry, int i, int i2) {
        this.f28662a = i2;
        this.f28663b = n91Var;
        this.f28664c = navBackStackEntry;
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        int i = this.f28662a;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        switch (i) {
            case 0:
                return x00.c(this.f28663b, this.f28664c, this.d, composer, iIntValue);
            case 1:
                return x00.a(this.f28663b, this.f28664c, this.d, composer, iIntValue);
            default:
                return x00.b(this.f28663b, this.f28664c, this.d, composer, iIntValue);
        }
    }
}
