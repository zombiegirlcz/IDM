package com.fourthline.orca.internal;

import androidx.compose.runtime.Composer;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class so1 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f33077a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m21 f33078b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c21 f33079c;
    public final /* synthetic */ Flow d;
    public final /* synthetic */ Function1 e;
    public final /* synthetic */ int f;

    public /* synthetic */ so1(m21 m21Var, c21 c21Var, Flow flow, Function1 function1, int i, int i2) {
        this.f33077a = i2;
        this.f33078b = m21Var;
        this.f33079c = c21Var;
        this.d = flow;
        this.e = function1;
        this.f = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.f33077a) {
            case 0:
                int iIntValue = ((Integer) obj3).intValue();
                return k21.a(this.f33078b, this.f33079c, this.d, this.e, this.f, (Composer) obj2, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj3).intValue();
                return q7.a(this.f33078b, this.f33079c, this.d, this.e, this.f, (Composer) obj2, iIntValue2);
        }
    }
}
