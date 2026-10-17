package com.revolut.feature.freelancer.impl.ui.dialog.pocket_selection;

import android.view.View;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.feature.freelancer.impl.ui.dialog.pocket_selection.FreelancerPocketSelectionScreen;
import com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import lw6.c;
import lw6.d;
import pki.b;
import te0.w;
import us6.n0;
import us6.q;
import us6.z;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/freelancer/impl/ui/dialog/pocket_selection/FreelancerPocketSelectionScreen;", "Lcom/revolut/kompot/common/bottom_sheet/BaseBottomSheetRecyclerController;", "", "Llw6/d;", "<init>", "()V", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class FreelancerPocketSelectionScreen extends BaseBottomSheetRecyclerController<Object, d> {
    public static final /* synthetic */ int V = 0;
    public final FullScreenStateDelegate Q;
    public final RowDelegate R;
    public final Object S;
    public final Object T;
    public final List U;

    public FreelancerPocketSelectionScreen() {
        FullScreenStateDelegate fullScreenStateDelegate = new FullScreenStateDelegate();
        this.Q = fullScreenStateDelegate;
        RowDelegate rowDelegate = new RowDelegate(null, null, 7);
        this.R = rowDelegate;
        final int i = 0;
        this.S = w.y0(new Function0(this) { // from class: lw6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FreelancerPocketSelectionScreen f200413b;

            {
                this.f200413b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                FreelancerPocketSelectionScreen freelancerPocketSelectionScreen = this.f200413b;
                switch (i2) {
                    case 0:
                        int i3 = FreelancerPocketSelectionScreen.V;
                        phm.a aVar = (phm.a) ue0.e.j(freelancerPocketSelectionScreen.m2()).a().get(q.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", q.class, " is not found"));
                        }
                        q qVar = ((q) aVar2.b()).Q;
                        n0 n0Var = new n0();
                        n0Var.f282635a = e4m.b.b(new z(qVar, n0Var, 1));
                        return n0Var;
                    default:
                        int i5 = FreelancerPocketSelectionScreen.V;
                        return (e) ((n0) freelancerPocketSelectionScreen.S.getValue()).f282635a.get();
                }
            }
        });
        final int i2 = 1;
        this.T = w.y0(new Function0(this) { // from class: lw6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FreelancerPocketSelectionScreen f200413b;

            {
                this.f200413b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                FreelancerPocketSelectionScreen freelancerPocketSelectionScreen = this.f200413b;
                switch (i22) {
                    case 0:
                        int i3 = FreelancerPocketSelectionScreen.V;
                        phm.a aVar = (phm.a) ue0.e.j(freelancerPocketSelectionScreen.m2()).a().get(q.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", q.class, " is not found"));
                        }
                        q qVar = ((q) aVar2.b()).Q;
                        n0 n0Var = new n0();
                        n0Var.f282635a = e4m.b.b(new z(qVar, n0Var, 1));
                        return n0Var;
                    default:
                        int i5 = FreelancerPocketSelectionScreen.V;
                        return (e) ((n0) freelancerPocketSelectionScreen.S.getValue()).f282635a.get();
                }
            }
        });
        this.U = v.k(fullScreenStateDelegate, rowDelegate, new RowLoadingDelegate());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (n0) this.S.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController, com.revolut.kompot.navigable.vc.ViewController
    public final b R2() {
        return (lw6.e) this.T.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(this.Q.f52371h.f121375b), new lw6.b(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.R.f53218h), new c(this, null), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: k3 */
    public final dli.b R2() {
        return (lw6.e) this.T.getValue();
    }

    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: l3, reason: from getter */
    public final List getV() {
        return this.U;
    }
}
