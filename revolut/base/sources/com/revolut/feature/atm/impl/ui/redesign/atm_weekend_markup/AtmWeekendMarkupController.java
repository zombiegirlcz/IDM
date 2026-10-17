package com.revolut.feature.atm.impl.ui.redesign.atm_weekend_markup;

import aii.q;
import android.view.View;
import c65.i;
import ck2.f;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsLoadingDelegate;
import com.revolut.feature.atm.impl.ui.redesign.atm_weekend_markup.AtmWeekendMarkupController;
import com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import pki.b;
import te0.w;
import xf6.t1;
import xj2.l;
import xj2.n;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/atm/impl/ui/redesign/atm_weekend_markup/AtmWeekendMarkupController;", "Lcom/revolut/kompot/common/bottom_sheet/BaseBottomSheetRecyclerController;", "Laii/q;", "Lck2/f;", "<init>", "()V", "feature_atm_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AtmWeekendMarkupController extends BaseBottomSheetRecyclerController<q, f> {
    public static final /* synthetic */ int T = 0;
    public final Object Q;
    public final Object R;
    public final List S = v.k(new CellDetailsDelegate(), new CellDetailsLoadingDelegate());

    public AtmWeekendMarkupController() {
        final int i = 0;
        this.Q = w.y0(new Function0(this) { // from class: ck2.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AtmWeekendMarkupController f24745b;

            {
                this.f24745b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                AtmWeekendMarkupController atmWeekendMarkupController = this.f24745b;
                switch (i2) {
                    case 0:
                        int i3 = AtmWeekendMarkupController.T;
                        phm.a aVar = (phm.a) ue0.e.j(atmWeekendMarkupController.m2()).a().get(n.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", n.class, " is not found"));
                        }
                        n nVar = ((n) aVar2.b()).f306487q;
                        l lVar = new l();
                        int i5 = 19;
                        lVar.f306472a = e4m.b.b(new t1(nVar, lVar, 1, i5));
                        lVar.f306473b = e4m.b.b(new t1(nVar, lVar, 0, i5));
                        return lVar;
                    default:
                        int i6 = AtmWeekendMarkupController.T;
                        return (e) ((l) atmWeekendMarkupController.Q.getValue()).f306473b.get();
                }
            }
        });
        final int i2 = 1;
        this.R = w.y0(new Function0(this) { // from class: ck2.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AtmWeekendMarkupController f24745b;

            {
                this.f24745b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                AtmWeekendMarkupController atmWeekendMarkupController = this.f24745b;
                switch (i22) {
                    case 0:
                        int i3 = AtmWeekendMarkupController.T;
                        phm.a aVar = (phm.a) ue0.e.j(atmWeekendMarkupController.m2()).a().get(n.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", n.class, " is not found"));
                        }
                        n nVar = ((n) aVar2.b()).f306487q;
                        l lVar = new l();
                        int i5 = 19;
                        lVar.f306472a = e4m.b.b(new t1(nVar, lVar, 1, i5));
                        lVar.f306473b = e4m.b.b(new t1(nVar, lVar, 0, i5));
                        return lVar;
                    default:
                        int i6 = AtmWeekendMarkupController.T;
                        return (e) ((l) atmWeekendMarkupController.Q.getValue()).f306473b.get();
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (l) this.Q.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController, com.revolut.kompot.navigable.vc.ViewController
    public final b R2() {
        return (ck2.e) this.R.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, e3(), new i(this, null, 20), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: k3 */
    public final dli.b R2() {
        return (ck2.e) this.R.getValue();
    }

    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: l3, reason: from getter */
    public final List getS() {
        return this.S;
    }
}
