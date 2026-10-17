package com.fourthline.orca.internal;

import androidx.compose.runtime.Composer;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class fj1 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28539a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s2 f28540b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Flow f28541c;
    public final /* synthetic */ Function1 d;
    public final /* synthetic */ int e;

    public /* synthetic */ fj1(s2 s2Var, Flow flow, Function1 function1, int i, int i2) {
        this.f28539a = i2;
        this.f28540b = s2Var;
        this.f28541c = flow;
        this.d = function1;
        this.e = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.f28539a) {
            case 0:
                int iIntValue = ((Integer) obj3).intValue();
                return ai.a(this.f28540b, this.f28541c, this.d, this.e, (Composer) obj2, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj3).intValue();
                return o2.a(this.f28540b, this.f28541c, this.d, this.e, (Composer) obj2, iIntValue2);
        }
    }
}
