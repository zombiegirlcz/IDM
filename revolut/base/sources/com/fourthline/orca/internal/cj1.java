package com.fourthline.orca.internal;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.AnnotatedString;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class cj1 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27484a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f27485b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f27486c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ cj1(int i, Object obj2, Object obj3, int i2, int i3) {
        this.f27484a = i3;
        this.e = obj2;
        this.f27485b = obj3;
        this.f27486c = i;
        this.d = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.f27484a) {
            case 0:
                int iIntValue = ((Integer) obj3).intValue();
                return ah0.a((AnnotatedString) this.e, (Function1) this.f27485b, this.f27486c, this.d, (Composer) obj2, iIntValue);
            case 1:
                int iIntValue2 = ((Integer) obj3).intValue();
                return ah0.a((c81) this.e, (Function1) this.f27485b, this.f27486c, this.d, (Composer) obj2, iIntValue2);
            case 2:
                int iIntValue3 = ((Integer) obj3).intValue();
                return hi0.a((Function0) this.e, (Function2) this.f27485b, this.f27486c, this.d, (Composer) obj2, iIntValue3);
            case 3:
                int iIntValue4 = ((Integer) obj3).intValue();
                return hj0.a((gj0) this.e, (Function2) this.f27485b, this.f27486c, this.d, (Composer) obj2, iIntValue4);
            case 4:
                int iIntValue5 = ((Integer) obj3).intValue();
                return py0.a((z10) this.e, (Pair) this.f27485b, this.f27486c, this.d, (Composer) obj2, iIntValue5);
            default:
                int iIntValue6 = ((Integer) obj3).intValue();
                return vv0.a((Modifier) this.e, (Function3) this.f27485b, this.f27486c, this.d, (Composer) obj2, iIntValue6);
        }
    }
}
