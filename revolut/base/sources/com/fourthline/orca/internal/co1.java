package com.fourthline.orca.internal;

import androidx.compose.runtime.Composer;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class co1 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27529a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ff0 f27530b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function1 f27531c;
    public final /* synthetic */ int d;

    public /* synthetic */ co1(ff0 ff0Var, Function1 function1, int i, int i2) {
        this.f27529a = i2;
        this.f27530b = ff0Var;
        this.f27531c = function1;
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        int i = this.f27529a;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        switch (i) {
            case 0:
                return jf0.a(this.f27530b, this.f27531c, this.d, composer, iIntValue);
            default:
                return jf0.b(this.f27530b, this.f27531c, this.d, composer, iIntValue);
        }
    }
}
