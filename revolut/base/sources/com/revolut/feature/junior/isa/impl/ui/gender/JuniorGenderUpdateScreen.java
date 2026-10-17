package com.revolut.feature.junior.isa.impl.ui.gender;

import android.view.View;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.SingleChoiceDelegate;
import com.revolut.core.ui_kit.delegates.SingleChoiceLoadingDelegate;
import com.revolut.feature.junior.isa.impl.ui.gender.JuniorGenderUpdateScreen;
import com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController;
import com.revolut.kompot.navigable.vc.ViewController;
import ja8.c;
import ja8.d;
import ja8.e;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import pki.b;
import te0.w;
import x98.f;
import x98.o;
import zhm.v;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/junior/isa/impl/ui/gender/JuniorGenderUpdateScreen;", "Lcom/revolut/kompot/common/bottom_sheet/BaseBottomSheetRecyclerController;", "Lja8/e;", "Lja8/c;", "feature_junior_isa_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class JuniorGenderUpdateScreen extends BaseBottomSheetRecyclerController<e, c> {
    public static final /* synthetic */ int V = 0;
    public final d Q;
    public final Object R;
    public final Object S;
    public final SingleChoiceDelegate T;
    public final List U;

    public JuniorGenderUpdateScreen(d inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.Q = inputData;
        final int i = 0;
        this.R = w.y0(new Function0(this) { // from class: ja8.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ JuniorGenderUpdateScreen f172458b;

            {
                this.f172458b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                JuniorGenderUpdateScreen juniorGenderUpdateScreen = this.f172458b;
                switch (i2) {
                    case 0:
                        int i3 = JuniorGenderUpdateScreen.V;
                        phm.a aVar = (phm.a) ue0.e.j(juniorGenderUpdateScreen.m2()).a().get(o.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", o.class, " is not found"));
                        }
                        o oVar = ((o) aVar2.b()).f303638q;
                        d dVar = juniorGenderUpdateScreen.Q;
                        dVar.getClass();
                        return new x98.f(oVar, dVar);
                    default:
                        int i5 = JuniorGenderUpdateScreen.V;
                        return (f) ((x98.f) juniorGenderUpdateScreen.R.getValue()).f303613b.get();
                }
            }
        });
        final int i2 = 1;
        this.S = w.y0(new Function0(this) { // from class: ja8.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ JuniorGenderUpdateScreen f172458b;

            {
                this.f172458b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                JuniorGenderUpdateScreen juniorGenderUpdateScreen = this.f172458b;
                switch (i22) {
                    case 0:
                        int i3 = JuniorGenderUpdateScreen.V;
                        phm.a aVar = (phm.a) ue0.e.j(juniorGenderUpdateScreen.m2()).a().get(o.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", o.class, " is not found"));
                        }
                        o oVar = ((o) aVar2.b()).f303638q;
                        d dVar = juniorGenderUpdateScreen.Q;
                        dVar.getClass();
                        return new x98.f(oVar, dVar);
                    default:
                        int i5 = JuniorGenderUpdateScreen.V;
                        return (f) ((x98.f) juniorGenderUpdateScreen.R.getValue()).f303613b.get();
                }
            }
        });
        SingleChoiceDelegate singleChoiceDelegate = new SingleChoiceDelegate();
        this.T = singleChoiceDelegate;
        this.U = v.k(singleChoiceDelegate, new SingleChoiceLoadingDelegate(), new FullScreenStateDelegate());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (f) this.R.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController, com.revolut.kompot.navigable.vc.ViewController
    public final b R2() {
        return (ja8.f) this.S.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(this.T.p()), new ja8.b(this, null), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: k3 */
    public final dli.b R2() {
        return (ja8.f) this.S.getValue();
    }

    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: l3, reason: from getter */
    public final List getU() {
        return this.U;
    }
}
