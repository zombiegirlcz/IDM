package com.revolut.feature.retail.cfd.impl.screens.riskwarning;

import a2b.f;
import android.view.View;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.feature.retail.cfd.impl.screens.riskwarning.CfdRiskWarningController;
import com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import lph.h;
import m2b.s;
import m2b.v;
import m4b.c;
import m4b.d;
import m4b.e;
import pki.b;
import te0.w;
import zhm.u;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/retail/cfd/impl/screens/riskwarning/CfdRiskWarningController;", "Lcom/revolut/kompot/common/bottom_sheet/BaseBottomSheetRecyclerController;", "La2b/f;", "Lm4b/d;", "feature_retail_cfd_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CfdRiskWarningController extends BaseBottomSheetRecyclerController<f, d> {
    public static final /* synthetic */ int V = 0;
    public final e Q;
    public final FullScreenStateDelegate R;
    public final Object S;
    public final List T;
    public final Object U;

    public CfdRiskWarningController(e inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.Q = inputData;
        FullScreenStateDelegate fullScreenStateDelegate = new FullScreenStateDelegate();
        this.R = fullScreenStateDelegate;
        final int i = 0;
        this.S = w.y0(new Function0(this) { // from class: m4b.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CfdRiskWarningController f202684b;

            {
                this.f202684b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                CfdRiskWarningController cfdRiskWarningController = this.f202684b;
                switch (i2) {
                    case 0:
                        int i3 = CfdRiskWarningController.V;
                        return (c) ((s) cfdRiskWarningController.U.getValue()).f201897b.get();
                    default:
                        int i5 = CfdRiskWarningController.V;
                        phm.a aVar = (phm.a) ue0.e.j(cfdRiskWarningController.m2()).a().get(v.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", v.class, " is not found"));
                        }
                        v vVar = ((v) aVar2.b()).C;
                        e eVar = cfdRiskWarningController.Q;
                        eVar.getClass();
                        return new s(vVar, eVar);
                }
            }
        });
        this.T = u.c(fullScreenStateDelegate);
        final int i2 = 1;
        this.U = w.y0(new Function0(this) { // from class: m4b.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CfdRiskWarningController f202684b;

            {
                this.f202684b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                CfdRiskWarningController cfdRiskWarningController = this.f202684b;
                switch (i22) {
                    case 0:
                        int i3 = CfdRiskWarningController.V;
                        return (c) ((s) cfdRiskWarningController.U.getValue()).f201897b.get();
                    default:
                        int i5 = CfdRiskWarningController.V;
                        phm.a aVar = (phm.a) ue0.e.j(cfdRiskWarningController.m2()).a().get(v.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", v.class, " is not found"));
                        }
                        v vVar = ((v) aVar2.b()).C;
                        e eVar = cfdRiskWarningController.Q;
                        eVar.getClass();
                        return new s(vVar, eVar);
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (s) this.U.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController, com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final b e3() {
        return (c) this.S.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        ViewController.P2(this, e3(), new lpl.c(this, continuation, 16), 3);
        ViewController.P2(this, rd0.e.b(this.R.f52371h.f121375b), new m4b.b(this, null), 3);
        ViewController.P2(this, h3(), new h(this, continuation, 21), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: k3 */
    public final dli.b R2() {
        return (c) this.S.getValue();
    }

    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: l3, reason: from getter */
    public final List getT() {
        return this.T;
    }
}
