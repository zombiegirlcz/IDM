package com.fourthline.orca.internal;

import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.runtime.Composer;
import androidx.content.NavBackStackEntry;
import com.fourthline.orca.internal.lo;
import com.fourthline.orca.internal.tr0;
import com.fourthline.orca.internal.wb;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class rn1 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32785a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f32786b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f32787c;
    public final /* synthetic */ Object d;

    public /* synthetic */ rn1(Object obj2, Object obj3, int i, int i2) {
        this.f32785a = i2;
        this.f32787c = obj2;
        this.d = obj3;
        this.f32786b = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.f32785a) {
            case 0:
                int iIntValue = ((Integer) obj3).intValue();
                return i51.a((RowScope) this.f32787c, (h51) this.d, this.f32786b, (Composer) obj2, iIntValue);
            case 1:
                int iIntValue2 = ((Integer) obj3).intValue();
                return ds0.a((tr0.a.InterfaceC0287a.C0288a) this.f32787c, (Function1) this.d, this.f32786b, (Composer) obj2, iIntValue2);
            case 2:
                int iIntValue3 = ((Integer) obj3).intValue();
                return ds0.a((List) this.f32787c, (Function1) this.d, this.f32786b, (Composer) obj2, iIntValue3);
            case 3:
                int iIntValue4 = ((Integer) obj3).intValue();
                return eo0.a((bo0) this.f32787c, (Function1) this.d, this.f32786b, (Composer) obj2, iIntValue4);
            case 4:
                int iIntValue5 = ((Integer) obj3).intValue();
                return fz.a((az) this.f32787c, (Function1) this.d, this.f32786b, (Composer) obj2, iIntValue5);
            case 5:
                int iIntValue6 = ((Integer) obj3).intValue();
                return gn.a((dn) this.f32787c, (Function1) this.d, this.f32786b, (Composer) obj2, iIntValue6);
            case 6:
                int iIntValue7 = ((Integer) obj3).intValue();
                return i00.a((b1) this.f32787c, (NavBackStackEntry) this.d, this.f32786b, (Composer) obj2, iIntValue7);
            case 7:
                int iIntValue8 = ((Integer) obj3).intValue();
                return k00.a((pc) this.f32787c, (NavBackStackEntry) this.d, this.f32786b, (Composer) obj2, iIntValue8);
            case 8:
                int iIntValue9 = ((Integer) obj3).intValue();
                return k11.a((i11) this.f32787c, (Function1) this.d, this.f32786b, (Composer) obj2, iIntValue9);
            case 9:
                int iIntValue10 = ((Integer) obj3).intValue();
                return ni.a((gi) this.f32787c, (Function1) this.d, this.f32786b, (Composer) obj2, iIntValue10);
            case 10:
                int iIntValue11 = ((Integer) obj3).intValue();
                return ni.a((li) this.f32787c, (Function1) this.d, this.f32786b, (Composer) obj2, iIntValue11);
            case 11:
                int iIntValue12 = ((Integer) obj3).intValue();
                return o00.a((bl0) this.f32787c, (NavBackStackEntry) this.d, this.f32786b, (Composer) obj2, iIntValue12);
            case 12:
                int iIntValue13 = ((Integer) obj3).intValue();
                return qr.a((kr) this.f32787c, (Function1) this.d, this.f32786b, (Composer) obj2, iIntValue13);
            case 13:
                int iIntValue14 = ((Integer) obj3).intValue();
                return r6.a((o6) this.f32787c, (Function1) this.d, this.f32786b, (Composer) obj2, iIntValue14);
            case 14:
                int iIntValue15 = ((Integer) obj3).intValue();
                return so.a((lo.c) this.f32787c, (Function0) this.d, this.f32786b, (Composer) obj2, iIntValue15);
            case 15:
                int iIntValue16 = ((Integer) obj3).intValue();
                return so.a((lo.c.a) this.f32787c, (Function0) this.d, this.f32786b, (Composer) obj2, iIntValue16);
            case 16:
                int iIntValue17 = ((Integer) obj3).intValue();
                return uz0.a((ScrollState) this.f32787c, (mj0) this.d, this.f32786b, (Composer) obj2, iIntValue17);
            case 17:
                int iIntValue18 = ((Integer) obj3).intValue();
                return vv0.a((sv0) this.f32787c, (Function1) this.d, this.f32786b, (Composer) obj2, iIntValue18);
            case 18:
                int iIntValue19 = ((Integer) obj3).intValue();
                return wc0.a((vc0) this.f32787c, (Function1) this.d, this.f32786b, (Composer) obj2, iIntValue19);
            case 19:
                int iIntValue20 = ((Integer) obj3).intValue();
                return wg.a((ag) this.f32787c, (Function1) this.d, this.f32786b, (Composer) obj2, iIntValue20);
            case 20:
                int iIntValue21 = ((Integer) obj3).intValue();
                return wp0.a((zp0) this.f32787c, (ukm.j0) this.d, this.f32786b, (Composer) obj2, iIntValue21);
            case 21:
                int iIntValue22 = ((Integer) obj3).intValue();
                return xb.a((wb.c) this.f32787c, (Function1) this.d, this.f32786b, (Composer) obj2, iIntValue22);
            case 22:
                int iIntValue23 = ((Integer) obj3).intValue();
                return xb.a((wb.a) this.f32787c, (Function1) this.d, this.f32786b, (Composer) obj2, iIntValue23);
            case 23:
                int iIntValue24 = ((Integer) obj3).intValue();
                return yq.a((sq) this.f32787c, (Function1) this.d, this.f32786b, (Composer) obj2, iIntValue24);
            default:
                int iIntValue25 = ((Integer) obj3).intValue();
                return z30.a((s30) this.f32787c, (Function1) this.d, this.f32786b, (Composer) obj2, iIntValue25);
        }
    }
}
