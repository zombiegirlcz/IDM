package com.fourthline.orca.internal;

import android.content.Context;
import androidx.compose.foundation.pager.PagerState;
import com.fourthline.core.location.Coordinate;
import com.fourthline.orca.internal.az;
import com.fourthline.orca.internal.bx0;
import com.fourthline.orca.internal.dh;
import com.fourthline.orca.internal.e91;
import com.fourthline.orca.internal.f70;
import com.fourthline.orca.internal.fs0;
import com.fourthline.orca.internal.gb1;
import com.fourthline.orca.internal.go0;
import com.fourthline.orca.internal.j0;
import com.fourthline.orca.internal.jm;
import com.fourthline.orca.internal.m21;
import com.fourthline.orca.internal.q80;
import com.fourthline.orca.internal.qi;
import com.fourthline.orca.internal.t6;
import com.fourthline.orca.internal.tg;
import com.fourthline.orca.internal.tr0;
import com.fourthline.orca.internal.we0;
import com.fourthline.orca.internal.xl0;
import com.fourthline.orca.internal.yb;
import com.fourthline.vision.document.DocumentScannerStepResult;
import com.fourthline.vision.selfie.SelfieScannerResult;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class rj1 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32756a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f32757b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f32758c;

    public /* synthetic */ rj1(Object obj2, Object obj3, int i) {
        this.f32756a = i;
        this.f32757b = obj2;
        this.f32758c = obj3;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f32756a) {
            case 0:
                return bx0.c.a.a((bx0) this.f32757b, (qw0) this.f32758c);
            case 1:
                return dh.b.a.a((dh) this.f32757b, (zf) this.f32758c);
            case 2:
                return e91.a.C0191a.a((e91) this.f32757b, (u81) this.f32758c);
            case 3:
                return f70.c.a.a((f70) this.f32757b, (Coordinate) this.f32758c);
            case 4:
                return fs0.c.a.a((fs0) this.f32757b, (sr0) this.f32758c);
            case 5:
                return go0.a.C0204a.a((go0) this.f32757b, (ao0) this.f32758c);
            case 6:
                return j0.b.a.a((j0) this.f32757b, (e0) this.f32758c);
            case 7:
                return jm.c.a.a((jm) this.f32757b, (em) this.f32758c);
            case 8:
                return m21.d.a.a((m21) this.f32757b, (SelfieScannerResult) this.f32758c);
            case 9:
                return qi.b.a.a((qi) this.f32757b, (ki) this.f32758c);
            case 10:
                return t6.g.a.a((t6) this.f32757b, (n6) this.f32758c);
            case 11:
                return we0.a.C0304a.a((we0) this.f32757b, (pe0) this.f32758c);
            case 12:
                return xl0.a.C0310a.a((xl0) this.f32757b, (rl0) this.f32758c);
            case 13:
                return yb.a.C0316a.a((yb) this.f32757b, (vb) this.f32758c);
            case 14:
                return bn0.a((bn0) this.f32757b, (q80.t.d) this.f32758c);
            case 15:
                return bz.a((bz) this.f32757b, (PagerState) this.f32758c);
            case 16:
                return dh.a((dh) this.f32757b, (tg.a) this.f32758c);
            case 17:
                return dp.a((dp) this.f32757b, (DocumentScannerStepResult) this.f32758c);
            case 18:
                return ds0.a((Function1) this.f32757b, (tr0.a.InterfaceC0287a.b) this.f32758c);
            case 19:
                return fj.a((fj) this.f32757b, (q80.h.d) this.f32758c);
            case 20:
                return fz.a((Function1) this.f32757b, (az.a) this.f32758c);
            case 21:
                return gv0.b((gv0) this.f32757b, (e40) this.f32758c);
            case 22:
                return hl0.a((fd) this.f32757b, (hl0) this.f32758c);
            case 23:
                return hn0.a((Context) this.f32757b, (mp0) this.f32758c);
            case 24:
                return Boolean.valueOf(hp.a((zc0) this.f32757b, (gj) this.f32758c));
            case 25:
                return i81.a((h81) this.f32757b, (Function0) this.f32758c);
            case 26:
                return j11.a((j11) this.f32757b, (q80.w.b) this.f32758c);
            case 27:
                return Boolean.valueOf(l50.b((vc1) this.f32757b, (vc1) this.f32758c));
            case 28:
                return ll0.a((fd) this.f32757b, (ll0) this.f32758c);
            default:
                return mb1.a((Function1) this.f32757b, (gb1.b) this.f32758c);
        }
    }
}
