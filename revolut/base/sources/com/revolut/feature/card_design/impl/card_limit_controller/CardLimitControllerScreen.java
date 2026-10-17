package com.revolut.feature.card_design.impl.card_limit_controller;

import aii.q;
import android.view.View;
import brc.h;
import by2.b;
import by2.c;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.feature.card_design.impl.card_limit_controller.CardLimitControllerScreen;
import com.revolut.feature.card_design.impl.card_limit_controller.CardLimitControllerScreenContract$InputData;
import com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController;
import com.revolut.kompot.navigable.vc.ViewController;
import gy2.f;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import no.m;
import te0.w;
import xki.e;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/card_design/impl/card_limit_controller/CardLimitControllerScreen;", "Lcom/revolut/kompot/common/bottom_sheet/BaseBottomSheetRecyclerController;", "Laii/q;", "Lby2/b;", "Lno/m;", "retail_feature_card_design_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CardLimitControllerScreen extends BaseBottomSheetRecyclerController<q, b> implements m {
    public static final /* synthetic */ int V = 0;
    public final CardLimitControllerScreenContract$InputData Q;
    public final AnalyticsProduct R;
    public final List S;
    public final Object T;
    public final Object U;

    public CardLimitControllerScreen(CardLimitControllerScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.Q = inputData;
        this.R = inputData.f64739c;
        this.S = m72.b.v(null, null, 7);
        final int i = 0;
        this.T = w.y0(new Function0(this) { // from class: by2.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CardLimitControllerScreen f19736b;

            {
                this.f19736b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                CardLimitControllerScreen cardLimitControllerScreen = this.f19736b;
                switch (i2) {
                    case 0:
                        int i3 = CardLimitControllerScreen.V;
                        phm.a aVar = (phm.a) ue0.e.j(cardLimitControllerScreen.m2()).a().get(gy2.d.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", gy2.d.class, " is not found"));
                        }
                        gy2.d dVar = ((gy2.d) aVar2.b()).f147796y;
                        CardLimitControllerScreenContract$InputData cardLimitControllerScreenContract$InputData = cardLimitControllerScreen.Q;
                        cardLimitControllerScreenContract$InputData.getClass();
                        return new f(dVar, cardLimitControllerScreenContract$InputData);
                    default:
                        int i5 = CardLimitControllerScreen.V;
                        return (c) ((f) cardLimitControllerScreen.T.getValue()).f147802c.get();
                }
            }
        });
        final int i2 = 1;
        this.U = w.y0(new Function0(this) { // from class: by2.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CardLimitControllerScreen f19736b;

            {
                this.f19736b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                CardLimitControllerScreen cardLimitControllerScreen = this.f19736b;
                switch (i22) {
                    case 0:
                        int i3 = CardLimitControllerScreen.V;
                        phm.a aVar = (phm.a) ue0.e.j(cardLimitControllerScreen.m2()).a().get(gy2.d.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", gy2.d.class, " is not found"));
                        }
                        gy2.d dVar = ((gy2.d) aVar2.b()).f147796y;
                        CardLimitControllerScreenContract$InputData cardLimitControllerScreenContract$InputData = cardLimitControllerScreen.Q;
                        cardLimitControllerScreenContract$InputData.getClass();
                        return new f(dVar, cardLimitControllerScreenContract$InputData);
                    default:
                        int i5 = CardLimitControllerScreen.V;
                        return (c) ((f) cardLimitControllerScreen.T.getValue()).f147802c.get();
                }
            }
        });
    }

    @Override // no.m
    /* JADX INFO: renamed from: P, reason: from getter */
    public final AnalyticsProduct getR() {
        return this.R;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (f) this.T.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController, com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (c) this.U.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, e3(), new h(this, null, 17), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: k3 */
    public final dli.b R2() {
        return (c) this.U.getValue();
    }

    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: l3, reason: from getter */
    public final List getS() {
        return this.S;
    }
}
