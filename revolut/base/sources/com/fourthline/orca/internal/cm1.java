package com.fourthline.orca.internal;

import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.runtime.Composer;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class cm1 implements Function3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27519a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f27520b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function1 f27521c;
    public final /* synthetic */ ie1 d;

    public /* synthetic */ cm1(float f, ie1 ie1Var, Function1 function1, int i) {
        this.f27519a = i;
        this.f27520b = f;
        this.d = ie1Var;
        this.f27521c = function1;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        switch (this.f27519a) {
            case 0:
                int iIntValue = ((Integer) obj4).intValue();
                return fz.a(this.f27520b, (az) this.d, this.f27521c, (ColumnScope) obj2, (Composer) obj3, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj4).intValue();
                return qr.a(this.f27520b, (kr) this.d, this.f27521c, (ColumnScope) obj2, (Composer) obj3, iIntValue2);
        }
    }
}
