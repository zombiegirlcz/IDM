package com.fourthline.orca.internal;

import androidx.compose.runtime.Composer;
import androidx.content.NavBackStackEntry;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class ep1 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28221a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ eo f28222b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ NavBackStackEntry f28223c;
    public final /* synthetic */ int d;

    public /* synthetic */ ep1(eo eoVar, NavBackStackEntry navBackStackEntry, int i, int i2) {
        this.f28221a = i2;
        this.f28222b = eoVar;
        this.f28223c = navBackStackEntry;
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        int i = this.f28221a;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        switch (i) {
            case 0:
                return l00.a(this.f28222b, this.f28223c, this.d, composer, iIntValue);
            default:
                return l00.b(this.f28222b, this.f28223c, this.d, composer, iIntValue);
        }
    }
}
