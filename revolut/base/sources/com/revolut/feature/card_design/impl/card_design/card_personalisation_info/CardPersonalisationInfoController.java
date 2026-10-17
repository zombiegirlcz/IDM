package com.revolut.feature.card_design.impl.card_design.card_personalisation_info;

import android.view.View;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.feature.card_design.impl.card_design.card_personalisation_info.CardPersonalisationInfoController;
import com.revolut.feature.card_design.impl.card_design.card_personalisation_info.CardPersonalisationInfoScreenContract$InputData;
import com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController;
import com.revolut.kompot.navigable.a;
import gy2.g;
import hx2.f;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import ox2.c;
import pki.b;
import te0.w;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/card_design/impl/card_design/card_personalisation_info/CardPersonalisationInfoController;", "Lcom/revolut/kompot/common/bottom_sheet/BaseBottomSheetRecyclerController;", "Lhx2/f;", "Lox2/c;", "retail_feature_card_design_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CardPersonalisationInfoController extends BaseBottomSheetRecyclerController<f, c> {
    public static final /* synthetic */ int U = 0;
    public final CardPersonalisationInfoScreenContract$InputData Q;
    public final List R;
    public final Object S;
    public final Object T;

    public CardPersonalisationInfoController(CardPersonalisationInfoScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.Q = inputData;
        final int i = 0;
        final int i2 = 1;
        this.R = v.k(new CellDetailsDelegate(), new TextDelegate(), new FullScreenStateDelegate());
        this.S = w.y0(new Function0(this) { // from class: ox2.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CardPersonalisationInfoController f230539b;

            {
                this.f230539b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i;
                CardPersonalisationInfoController cardPersonalisationInfoController = this.f230539b;
                switch (i3) {
                    case 0:
                        int i5 = CardPersonalisationInfoController.U;
                        phm.a aVar = (phm.a) ue0.e.j(cardPersonalisationInfoController.m2()).a().get(gy2.d.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", gy2.d.class, " is not found"));
                        }
                        gy2.d dVar = ((gy2.d) aVar2.b()).f147796y;
                        CardPersonalisationInfoScreenContract$InputData cardPersonalisationInfoScreenContract$InputData = cardPersonalisationInfoController.Q;
                        cardPersonalisationInfoScreenContract$InputData.getClass();
                        return new g(dVar, cardPersonalisationInfoScreenContract$InputData);
                    default:
                        int i6 = CardPersonalisationInfoController.U;
                        return (b) ((g) cardPersonalisationInfoController.S.getValue()).d.get();
                }
            }
        });
        this.T = w.y0(new Function0(this) { // from class: ox2.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CardPersonalisationInfoController f230539b;

            {
                this.f230539b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i2;
                CardPersonalisationInfoController cardPersonalisationInfoController = this.f230539b;
                switch (i3) {
                    case 0:
                        int i5 = CardPersonalisationInfoController.U;
                        phm.a aVar = (phm.a) ue0.e.j(cardPersonalisationInfoController.m2()).a().get(gy2.d.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", gy2.d.class, " is not found"));
                        }
                        gy2.d dVar = ((gy2.d) aVar2.b()).f147796y;
                        CardPersonalisationInfoScreenContract$InputData cardPersonalisationInfoScreenContract$InputData = cardPersonalisationInfoController.Q;
                        cardPersonalisationInfoScreenContract$InputData.getClass();
                        return new g(dVar, cardPersonalisationInfoScreenContract$InputData);
                    default:
                        int i6 = CardPersonalisationInfoController.U;
                        return (b) ((g) cardPersonalisationInfoController.S.getValue()).d.get();
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (g) this.S.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController, com.revolut.kompot.navigable.vc.ViewController
    public final b R2() {
        return (ox2.b) this.T.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        a.g2(this, e3(), null, new oli.f(this, null, 28), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: k3 */
    public final dli.b R2() {
        return (ox2.b) this.T.getValue();
    }

    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: l3, reason: from getter */
    public final List getR() {
        return this.R;
    }
}
