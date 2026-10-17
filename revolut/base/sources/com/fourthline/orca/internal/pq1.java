package com.fourthline.orca.internal;

import androidx.compose.runtime.Composer;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class pq1 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32027a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z10 f32028b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function0 f32029c;
    public final /* synthetic */ int d;

    public /* synthetic */ pq1(z10 z10Var, Function0 function0, int i, int i2) {
        this.f32027a = i2;
        this.f32028b = z10Var;
        this.f32029c = function0;
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        int i = this.f32027a;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        switch (i) {
            case 0:
                return oe1.a(this.f32028b, this.f32029c, this.d, composer, iIntValue);
            default:
                return ro.a(this.f32028b, this.f32029c, this.d, composer, iIntValue);
        }
    }
}
