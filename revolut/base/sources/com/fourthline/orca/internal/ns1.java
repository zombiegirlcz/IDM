package com.fourthline.orca.internal;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class ns1 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31476a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Modifier f31477b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ mj0 f31478c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;

    public /* synthetic */ ns1(Modifier modifier, mj0 mj0Var, int i, int i2, int i3) {
        this.f31476a = i3;
        this.f31477b = modifier;
        this.f31478c = mj0Var;
        this.d = i;
        this.e = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.f31476a) {
            case 0:
                int iIntValue = ((Integer) obj3).intValue();
                return uz0.a(this.f31477b, this.f31478c, this.d, this.e, (Composer) obj2, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj3).intValue();
                return uz0.b(this.f31477b, this.f31478c, this.d, this.e, (Composer) obj2, iIntValue2);
        }
    }
}
