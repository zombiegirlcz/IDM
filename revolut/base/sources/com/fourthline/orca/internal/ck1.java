package com.fourthline.orca.internal;

import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.pager.PagerState;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import com.fourthline.orca.internal.c21;
import com.fourthline.orca.internal.tr0;
import com.fourthline.orca.internal.zp0;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class ck1 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27495a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f27496b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f27497c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ ck1(int i, Object obj2, int i2, Object obj3, int i3, Object obj4) {
        this.f27495a = i3;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
        this.f27496b = i;
        this.f27497c = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.f27495a) {
            case 0:
                int iIntValue = ((Integer) obj3).intValue();
                return c40.a((String) this.d, (Function0) this.e, (Function0) this.f, this.f27496b, this.f27497c, (Composer) obj2, iIntValue);
            case 1:
                int iIntValue2 = ((Integer) obj3).intValue();
                return cb1.a((Modifier) this.d, (bb1) this.e, (bb1) this.f, this.f27496b, this.f27497c, (Composer) obj2, iIntValue2);
            case 2:
                int iIntValue3 = ((Integer) obj3).intValue();
                return ci0.a((PagerState) this.d, (List) this.e, (z10) this.f, this.f27496b, this.f27497c, (Composer) obj2, iIntValue3);
            case 3:
                int iIntValue4 = ((Integer) obj3).intValue();
                return ci0.a((ColumnScope) this.d, (bi0) this.f, (Function0) this.e, this.f27496b, this.f27497c, (Composer) obj2, iIntValue4);
            case 4:
                int iIntValue5 = ((Integer) obj3).intValue();
                return ds0.a((Modifier) this.d, (tr0.a.InterfaceC0287a.b) this.e, (Function1) this.f, this.f27496b, this.f27497c, (Composer) obj2, iIntValue5);
            case 5:
                int iIntValue6 = ((Integer) obj3).intValue();
                return hi0.a((List) this.d, (Function1) this.f, (Function0) this.e, this.f27496b, this.f27497c, (Composer) obj2, iIntValue6);
            case 6:
                int iIntValue7 = ((Integer) obj3).intValue();
                return jf0.a((Modifier) this.d, (z10) this.f, (Function0) this.e, this.f27496b, this.f27497c, (Composer) obj2, iIntValue7);
            case 7:
                int iIntValue8 = ((Integer) obj3).intValue();
                return k11.a((Modifier) this.e, (String) this.d, (z10) this.f, this.f27496b, this.f27497c, (Composer) obj2, iIntValue8);
            case 8:
                int iIntValue9 = ((Integer) obj3).intValue();
                return ke1.a((Modifier) this.d, (le1) this.e, (Function1) this.f, this.f27496b, this.f27497c, (Composer) obj2, iIntValue9);
            case 9:
                int iIntValue10 = ((Integer) obj3).intValue();
                return qy0.a((Modifier) this.d, (c21.b.c) this.e, (Function1) this.f, this.f27496b, this.f27497c, (Composer) obj2, iIntValue10);
            case 10:
                int iIntValue11 = ((Integer) obj3).intValue();
                return qz0.a((Modifier) this.e, (String) this.d, (String) this.f, this.f27496b, this.f27497c, (Composer) obj2, iIntValue11);
            case 11:
                int iIntValue12 = ((Integer) obj3).intValue();
                return r7.a((Modifier) this.d, (Function0) this.e, (Function2) this.f, this.f27496b, this.f27497c, (Composer) obj2, iIntValue12);
            default:
                int iIntValue13 = ((Integer) obj3).intValue();
                return wp0.a((zp0.g) this.d, (Function1) this.e, (Function1) this.f, this.f27496b, this.f27497c, (Composer) obj2, iIntValue13);
        }
    }

    public /* synthetic */ ck1(Modifier modifier, String str, Object obj2, int i, int i2, int i3) {
        this.f27495a = i3;
        this.e = modifier;
        this.d = str;
        this.f = obj2;
        this.f27496b = i;
        this.f27497c = i2;
    }

    public /* synthetic */ ck1(Object obj2, Object obj3, Function0 function0, int i, int i2, int i3) {
        this.f27495a = i3;
        this.d = obj2;
        this.f = obj3;
        this.e = function0;
        this.f27496b = i;
        this.f27497c = i2;
    }
}
