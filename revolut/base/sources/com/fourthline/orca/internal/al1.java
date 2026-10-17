package com.fourthline.orca.internal;

import androidx.compose.animation.core.MutableTransitionState;
import androidx.compose.runtime.Composer;
import com.fourthline.orca.internal.lo;
import com.fourthline.orca.internal.tr0;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class al1 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26837a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f26838b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f26839c;

    public /* synthetic */ al1(Object obj2, int i, int i2) {
        this.f26837a = i2;
        this.f26839c = obj2;
        this.f26838b = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.f26837a) {
            case 0:
                int iIntValue = ((Integer) obj3).intValue();
                return ds0.a((tr0.a.b) this.f26839c, this.f26838b, (Composer) obj2, iIntValue);
            case 1:
                int iIntValue2 = ((Integer) obj3).intValue();
                return hi0.a((z10) this.f26839c, this.f26838b, (Composer) obj2, iIntValue2);
            case 2:
                int iIntValue3 = ((Integer) obj3).intValue();
                return i51.a((Pair) this.f26839c, this.f26838b, (Composer) obj2, iIntValue3);
            case 3:
                int iIntValue4 = ((Integer) obj3).intValue();
                return jf0.a((ff0) this.f26839c, this.f26838b, (Composer) obj2, iIntValue4);
            case 4:
                int iIntValue5 = ((Integer) obj3).intValue();
                return jf0.a((df0) this.f26839c, this.f26838b, (Composer) obj2, iIntValue5);
            case 5:
                int iIntValue6 = ((Integer) obj3).intValue();
                return o00.a((bl0) this.f26839c, this.f26838b, (Composer) obj2, iIntValue6);
            case 6:
                int iIntValue7 = ((Integer) obj3).intValue();
                return o2.a((Function0) this.f26839c, this.f26838b, (Composer) obj2, iIntValue7);
            case 7:
                int iIntValue8 = ((Integer) obj3).intValue();
                return q00.a((s60) this.f26839c, this.f26838b, (Composer) obj2, iIntValue8);
            case 8:
                int iIntValue9 = ((Integer) obj3).intValue();
                return s80.a((bj0) this.f26839c, this.f26838b, (Composer) obj2, iIntValue9);
            case 9:
                int iIntValue10 = ((Integer) obj3).intValue();
                return so.a((lo.c) this.f26839c, this.f26838b, (Composer) obj2, iIntValue10);
            case 10:
                int iIntValue11 = ((Integer) obj3).intValue();
                return t21.a((MutableTransitionState) this.f26839c, this.f26838b, (Composer) obj2, iIntValue11);
            case 11:
                int iIntValue12 = ((Integer) obj3).intValue();
                return w00.a((d8) this.f26839c, this.f26838b, (Composer) obj2, iIntValue12);
            case 12:
                int iIntValue13 = ((Integer) obj3).intValue();
                return x00.a((n91) this.f26839c, this.f26838b, (Composer) obj2, iIntValue13);
            default:
                int iIntValue14 = ((Integer) obj3).intValue();
                return y00.a((rf1) this.f26839c, this.f26838b, (Composer) obj2, iIntValue14);
        }
    }
}
