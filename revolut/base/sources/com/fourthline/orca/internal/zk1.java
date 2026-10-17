package com.fourthline.orca.internal;

import androidx.compose.runtime.Composer;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class zk1 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f35625a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ tr0 f35626b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function1 f35627c;
    public final /* synthetic */ int d;

    public /* synthetic */ zk1(tr0 tr0Var, Function1 function1, int i, int i2) {
        this.f35625a = i2;
        this.f35626b = tr0Var;
        this.f35627c = function1;
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        int i = this.f35625a;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        switch (i) {
            case 0:
                return ds0.b(this.f35626b, this.f35627c, this.d, composer, iIntValue);
            default:
                return ds0.a(this.f35626b, this.f35627c, this.d, composer, iIntValue);
        }
    }
}
