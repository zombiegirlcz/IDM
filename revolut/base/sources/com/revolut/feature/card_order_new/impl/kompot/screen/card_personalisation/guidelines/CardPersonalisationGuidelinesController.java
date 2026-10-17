package com.revolut.feature.card_order_new.impl.kompot.screen.card_personalisation.guidelines;

import android.view.View;
import com.revolut.core.ui_kit.delegates.ListCellDelegate;
import com.revolut.feature.card_order_new.impl.kompot.screen.card_personalisation.guidelines.CardPersonalisationGuidelinesController;
import com.revolut.feature.card_order_new.impl.kompot.screen.card_personalisation.guidelines.CardPersonalisationGuidelinesControllerContract$InputData;
import com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController;
import com.revolut.kompot.navigable.a;
import d33.c;
import d33.d;
import d33.e;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import pki.b;
import te0.w;
import x13.p;
import x13.q;
import x13.u;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/card_order_new/impl/kompot/screen/card_personalisation/guidelines/CardPersonalisationGuidelinesController;", "Lcom/revolut/kompot/common/bottom_sheet/BaseBottomSheetRecyclerController;", "Ld33/e;", "Ld33/d;", "feature_card_order_new_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CardPersonalisationGuidelinesController extends BaseBottomSheetRecyclerController<e, d> {
    public static final /* synthetic */ int U = 0;
    public final CardPersonalisationGuidelinesControllerContract$InputData Q;
    public final Object R;
    public final Object S;
    public final List T;

    public CardPersonalisationGuidelinesController(CardPersonalisationGuidelinesControllerContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.Q = inputData;
        final int i = 0;
        this.R = w.y0(new Function0(this) { // from class: d33.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CardPersonalisationGuidelinesController f110902b;

            {
                this.f110902b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                CardPersonalisationGuidelinesController cardPersonalisationGuidelinesController = this.f110902b;
                switch (i2) {
                    case 0:
                        int i3 = CardPersonalisationGuidelinesController.U;
                        qji.b bVarU2 = cardPersonalisationGuidelinesController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.card_order_new.impl.kompot.screen.card_personalisation.guidelines.di.CardPersonalisationGuidelinesControllerInjector");
                        q qVar = (q) bVarU2;
                        p pVar = qVar.f302174c;
                        q qVar2 = qVar.d;
                        CardPersonalisationGuidelinesControllerContract$InputData cardPersonalisationGuidelinesControllerContract$InputData = cardPersonalisationGuidelinesController.Q;
                        cardPersonalisationGuidelinesControllerContract$InputData.getClass();
                        return new u(pVar, qVar2, cardPersonalisationGuidelinesControllerContract$InputData);
                    default:
                        int i5 = CardPersonalisationGuidelinesController.U;
                        return (c) ((u) cardPersonalisationGuidelinesController.R.getValue()).e.get();
                }
            }
        });
        final int i2 = 1;
        this.S = w.y0(new Function0(this) { // from class: d33.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CardPersonalisationGuidelinesController f110902b;

            {
                this.f110902b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                CardPersonalisationGuidelinesController cardPersonalisationGuidelinesController = this.f110902b;
                switch (i22) {
                    case 0:
                        int i3 = CardPersonalisationGuidelinesController.U;
                        qji.b bVarU2 = cardPersonalisationGuidelinesController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.card_order_new.impl.kompot.screen.card_personalisation.guidelines.di.CardPersonalisationGuidelinesControllerInjector");
                        q qVar = (q) bVarU2;
                        p pVar = qVar.f302174c;
                        q qVar2 = qVar.d;
                        CardPersonalisationGuidelinesControllerContract$InputData cardPersonalisationGuidelinesControllerContract$InputData = cardPersonalisationGuidelinesController.Q;
                        cardPersonalisationGuidelinesControllerContract$InputData.getClass();
                        return new u(pVar, qVar2, cardPersonalisationGuidelinesControllerContract$InputData);
                    default:
                        int i5 = CardPersonalisationGuidelinesController.U;
                        return (c) ((u) cardPersonalisationGuidelinesController.R.getValue()).e.get();
                }
            }
        });
        this.T = zhm.u.c(new ListCellDelegate());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (u) this.R.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController, com.revolut.kompot.navigable.vc.ViewController
    public final b R2() {
        return (c) this.S.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        a.g2(this, e3(), null, new d33.b(this, null, 0), 3);
        a.g2(this, f3(), null, new d33.b(this, null, 1), 3);
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
