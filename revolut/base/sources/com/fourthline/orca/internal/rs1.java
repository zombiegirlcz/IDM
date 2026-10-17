package com.fourthline.orca.internal;

import androidx.compose.runtime.Composer;
import androidx.content.NavBackStackEntry;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class rs1 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32823a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c11 f32824b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ NavBackStackEntry f32825c;
    public final /* synthetic */ n01 d;
    public final /* synthetic */ int e;

    public /* synthetic */ rs1(c11 c11Var, NavBackStackEntry navBackStackEntry, n01 n01Var, int i, int i2) {
        this.f32823a = i2;
        this.f32824b = c11Var;
        this.f32825c = navBackStackEntry;
        this.d = n01Var;
        this.e = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.f32823a) {
            case 0:
                int iIntValue = ((Integer) obj3).intValue();
                return v00.b(this.f32824b, this.f32825c, this.d, this.e, (Composer) obj2, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj3).intValue();
                return v00.a(this.f32824b, this.f32825c, this.d, this.e, (Composer) obj2, iIntValue2);
        }
    }
}
