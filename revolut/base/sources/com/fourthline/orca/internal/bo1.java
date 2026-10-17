package com.fourthline.orca.internal;

import androidx.compose.runtime.Composer;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class bo1 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27185a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yb1 f27186b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function1 f27187c;
    public final /* synthetic */ int d;

    public /* synthetic */ bo1(yb1 yb1Var, Function1 function1, int i, int i2) {
        this.f27185a = i2;
        this.f27186b = yb1Var;
        this.f27187c = function1;
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        int i = this.f27185a;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        switch (i) {
            case 0:
                return jc1.a(this.f27186b, this.f27187c, this.d, composer, iIntValue);
            default:
                return o7.a(this.f27186b, this.f27187c, this.d, composer, iIntValue);
        }
    }
}
