package com.revolut.feature.card_screen.impl.kompot.reactivate.confirmation_bottom_sheet;

import android.view.View;
import cli.k;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.feature.card_screen.impl.kompot.reactivate.confirmation_bottom_sheet.ReactivateCardConfirmationBottomSheetContract$InputData;
import com.revolut.feature.card_screen.impl.kompot.reactivate.confirmation_bottom_sheet.ReactivateCardConfirmationBottomSheetScreen;
import com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kw4.b;
import l83.d;
import l83.i;
import l83.j;
import te0.w;
import xki.e;
import z73.f;
import zhm.u;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/card_screen/impl/kompot/reactivate/confirmation_bottom_sheet/ReactivateCardConfirmationBottomSheetScreen;", "Lcom/revolut/kompot/common/bottom_sheet/BaseBottomSheetRecyclerController;", "Ll83/d;", "Lcli/k;", "feature_card_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ReactivateCardConfirmationBottomSheetScreen extends BaseBottomSheetRecyclerController<d, k> {
    public static final /* synthetic */ int V = 0;
    public final ReactivateCardConfirmationBottomSheetContract$InputData Q;
    public final Object R;
    public final Object S;
    public final Object T;
    public final List U;

    public ReactivateCardConfirmationBottomSheetScreen(ReactivateCardConfirmationBottomSheetContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.Q = inputData;
        Lazy lazyY0 = w.y0(new b(26));
        this.R = lazyY0;
        final int i = 0;
        this.S = w.y0(new Function0(this) { // from class: l83.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ReactivateCardConfirmationBottomSheetScreen f192771b;

            {
                this.f192771b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                ReactivateCardConfirmationBottomSheetScreen reactivateCardConfirmationBottomSheetScreen = this.f192771b;
                switch (i2) {
                    case 0:
                        int i3 = ReactivateCardConfirmationBottomSheetScreen.V;
                        qji.b bVarU2 = reactivateCardConfirmationBottomSheetScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.card_screen.impl.kompot.reactivate.confirmation_bottom_sheet.di.ReactivateCardConfirmationBottomSheetInjector");
                        z73.c cVar = (z73.c) bVarU2;
                        z73.b bVar = cVar.f319876b;
                        z73.c cVar2 = cVar.f319877c;
                        ReactivateCardConfirmationBottomSheetContract$InputData reactivateCardConfirmationBottomSheetContract$InputData = reactivateCardConfirmationBottomSheetScreen.Q;
                        reactivateCardConfirmationBottomSheetContract$InputData.getClass();
                        return new z73.f(bVar, cVar2, reactivateCardConfirmationBottomSheetContract$InputData);
                    default:
                        int i5 = ReactivateCardConfirmationBottomSheetScreen.V;
                        return (j) ((z73.f) reactivateCardConfirmationBottomSheetScreen.S.getValue()).f319897c.get();
                }
            }
        });
        final int i2 = 1;
        this.T = w.y0(new Function0(this) { // from class: l83.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ReactivateCardConfirmationBottomSheetScreen f192771b;

            {
                this.f192771b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                ReactivateCardConfirmationBottomSheetScreen reactivateCardConfirmationBottomSheetScreen = this.f192771b;
                switch (i22) {
                    case 0:
                        int i3 = ReactivateCardConfirmationBottomSheetScreen.V;
                        qji.b bVarU2 = reactivateCardConfirmationBottomSheetScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.card_screen.impl.kompot.reactivate.confirmation_bottom_sheet.di.ReactivateCardConfirmationBottomSheetInjector");
                        z73.c cVar = (z73.c) bVarU2;
                        z73.b bVar = cVar.f319876b;
                        z73.c cVar2 = cVar.f319877c;
                        ReactivateCardConfirmationBottomSheetContract$InputData reactivateCardConfirmationBottomSheetContract$InputData = reactivateCardConfirmationBottomSheetScreen.Q;
                        reactivateCardConfirmationBottomSheetContract$InputData.getClass();
                        return new z73.f(bVar, cVar2, reactivateCardConfirmationBottomSheetContract$InputData);
                    default:
                        int i5 = ReactivateCardConfirmationBottomSheetScreen.V;
                        return (j) ((z73.f) reactivateCardConfirmationBottomSheetScreen.S.getValue()).f319897c.get();
                }
            }
        });
        this.U = u.c((LargeActionButtonDelegate) lazyY0.getValue());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (f) this.S.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController, com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (j) this.T.getValue();
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(((LargeActionButtonDelegate) this.R.getValue()).d.f121375b), new i(this, null), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: k3 */
    public final dli.b R2() {
        return (j) this.T.getValue();
    }

    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: l3, reason: from getter */
    public final List getU() {
        return this.U;
    }
}
