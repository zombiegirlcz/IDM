package com.fourthline.orca.internal;

import androidx.compose.runtime.Composer;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class ei1 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28152a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z10 f28153b;

    public /* synthetic */ ei1(z10 z10Var, int i) {
        this.f28152a = i;
        this.f28153b = z10Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        int i = this.f28152a;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        switch (i) {
            case 0:
                return a30.a(this.f28153b, composer, iIntValue);
            case 1:
                return a30.b(this.f28153b, composer, iIntValue);
            case 2:
                return g9.a(this.f28153b, composer, iIntValue);
            case 3:
                return jf0.a(this.f28153b, composer, iIntValue);
            case 4:
                return me1.a(this.f28153b, composer, iIntValue);
            default:
                return ro.a(this.f28153b, composer, iIntValue);
        }
    }
}
