package com.fourthline.orca.internal;

import androidx.compose.animation.core.MutableTransitionState;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.pager.PagerState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.text.TextStyle;
import com.fourthline.orca.internal.c21;
import com.fourthline.orca.internal.lo;
import com.fourthline.orca.internal.wb;
import com.fourthline.orca.internal.zp0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class uj1 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f34113a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f34114b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f34115c;
    public final /* synthetic */ Object d;

    public /* synthetic */ uj1(Object obj2, int i, Object obj3, Object obj4) {
        this.f34113a = i;
        this.f34114b = obj2;
        this.f34115c = obj3;
        this.d = obj4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.f34113a) {
            case 0:
                return bz.a((bz) this.f34114b, (PagerState) this.f34115c, (zp0.b) this.d, (Composer) obj2, ((Integer) obj3).intValue());
            case 1:
                return h21.a((c21.b) this.f34114b, (Function1) this.f34115c, (Function1) this.d, (Composer) obj2, ((Integer) obj3).intValue());
            case 2:
                return hi0.a((String) this.f34114b, (c81) this.f34115c, (TextStyle) this.d, (Composer) obj2, ((Integer) obj3).intValue());
            case 3:
                return k21.a((c21.b) this.f34114b, (Function1) this.f34115c, (MutableState) this.d, (Composer) obj2, ((Integer) obj3).intValue());
            case 4:
                return kb1.a((p41) this.f34114b, (String) this.f34115c, (String) this.d, (Composer) obj2, ((Integer) obj3).intValue());
            case 5:
                return kb1.a((RowScope) this.f34114b, (p41) this.f34115c, (String) this.d, (Composer) obj2, ((Integer) obj3).intValue());
            case 6:
                return kr0.a((Rect) this.f34114b, (Function2) this.f34115c, (SolidColor) this.d, (Composer) obj2, ((Integer) obj3).intValue());
            case 7:
                return o2.a((String) this.f34114b, (String) this.f34115c, (String) this.d, (Composer) obj2, ((Integer) obj3).intValue());
            case 8:
                return p9.a((kd1) this.f34114b, (String) this.f34115c, (TextStyle) this.d, (Composer) obj2, ((Integer) obj3).intValue());
            case 9:
                return so.b((lo.c) this.f34114b, (Function1) this.f34115c, (Function1) this.d, (Composer) obj2, ((Integer) obj3).intValue());
            case 10:
                return so.a((lo.c) this.f34114b, (MutableTransitionState) this.f34115c, (Function0) this.d, (Composer) obj2, ((Integer) obj3).intValue());
            case 11:
                return wp0.a((zp0.g) this.f34114b, (Function1) this.f34115c, (Function1) this.d, (Composer) obj2, ((Integer) obj3).intValue());
            case 12:
                return xb.a((wb.c) this.f34114b, (Function1) this.f34115c, (s20) this.d, (Composer) obj2, ((Integer) obj3).intValue());
            default:
                return xo.a((lo) this.f34114b, (Function1) this.f34115c, (MutableState) this.d, (Composer) obj2, ((Integer) obj3).intValue());
        }
    }
}
