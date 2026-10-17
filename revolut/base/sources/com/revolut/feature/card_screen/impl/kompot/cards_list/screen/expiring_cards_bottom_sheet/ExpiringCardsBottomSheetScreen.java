package com.revolut.feature.card_screen.impl.kompot.cards_list.screen.expiring_cards_bottom_sheet;

import android.view.View;
import cli.k;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.card_screen.impl.kompot.cards_list.screen.expiring_cards_bottom_sheet.ExpiringCardsBottomSheetContract$InputData;
import com.revolut.feature.card_screen.impl.kompot.cards_list.screen.expiring_cards_bottom_sheet.ExpiringCardsBottomSheetScreen;
import com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController;
import com.revolut.kompot.navigable.vc.ViewController;
import czc.d0;
import d83.c;
import d83.i;
import d83.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import pki.b;
import te0.w;
import xki.e;
import zhm.u;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/card_screen/impl/kompot/cards_list/screen/expiring_cards_bottom_sheet/ExpiringCardsBottomSheetScreen;", "Lcom/revolut/kompot/common/bottom_sheet/BaseBottomSheetRecyclerController;", "Ld83/c;", "Lcli/k;", "feature_card_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ExpiringCardsBottomSheetScreen extends BaseBottomSheetRecyclerController<c, k> {
    public static final /* synthetic */ int V = 0;
    public final ExpiringCardsBottomSheetContract$InputData Q;
    public final Object R;
    public final Object S;
    public final Object T;
    public final Object U;

    public ExpiringCardsBottomSheetScreen(ExpiringCardsBottomSheetContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.Q = inputData;
        this.R = w.y0(new d0(26));
        final int i = 0;
        this.S = w.y0(new Function0(this) { // from class: d83.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ExpiringCardsBottomSheetScreen f112118b;

            {
                this.f112118b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                ExpiringCardsBottomSheetScreen expiringCardsBottomSheetScreen = this.f112118b;
                switch (i2) {
                    case 0:
                        int i3 = ExpiringCardsBottomSheetScreen.V;
                        qji.b bVarU2 = expiringCardsBottomSheetScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.card_screen.impl.kompot.cards_list.screen.expiring_cards_bottom_sheet.di.ExpiringCardsBottomSheetInjector");
                        z73.c cVar = (z73.c) bVarU2;
                        z73.b bVar = cVar.f319876b;
                        z73.c cVar2 = cVar.f319877c;
                        ExpiringCardsBottomSheetContract$InputData expiringCardsBottomSheetContract$InputData = expiringCardsBottomSheetScreen.Q;
                        expiringCardsBottomSheetContract$InputData.getClass();
                        return new z73.e(bVar, cVar2, expiringCardsBottomSheetContract$InputData);
                    case 1:
                        int i5 = ExpiringCardsBottomSheetScreen.V;
                        return (j) ((z73.e) expiringCardsBottomSheetScreen.S.getValue()).f319894c.get();
                    default:
                        int i6 = ExpiringCardsBottomSheetScreen.V;
                        return u.c((RowDelegate) expiringCardsBottomSheetScreen.R.getValue());
                }
            }
        });
        final int i2 = 1;
        this.T = w.y0(new Function0(this) { // from class: d83.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ExpiringCardsBottomSheetScreen f112118b;

            {
                this.f112118b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                ExpiringCardsBottomSheetScreen expiringCardsBottomSheetScreen = this.f112118b;
                switch (i22) {
                    case 0:
                        int i3 = ExpiringCardsBottomSheetScreen.V;
                        qji.b bVarU2 = expiringCardsBottomSheetScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.card_screen.impl.kompot.cards_list.screen.expiring_cards_bottom_sheet.di.ExpiringCardsBottomSheetInjector");
                        z73.c cVar = (z73.c) bVarU2;
                        z73.b bVar = cVar.f319876b;
                        z73.c cVar2 = cVar.f319877c;
                        ExpiringCardsBottomSheetContract$InputData expiringCardsBottomSheetContract$InputData = expiringCardsBottomSheetScreen.Q;
                        expiringCardsBottomSheetContract$InputData.getClass();
                        return new z73.e(bVar, cVar2, expiringCardsBottomSheetContract$InputData);
                    case 1:
                        int i5 = ExpiringCardsBottomSheetScreen.V;
                        return (j) ((z73.e) expiringCardsBottomSheetScreen.S.getValue()).f319894c.get();
                    default:
                        int i6 = ExpiringCardsBottomSheetScreen.V;
                        return u.c((RowDelegate) expiringCardsBottomSheetScreen.R.getValue());
                }
            }
        });
        final int i3 = 2;
        this.U = w.y0(new Function0(this) { // from class: d83.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ExpiringCardsBottomSheetScreen f112118b;

            {
                this.f112118b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                ExpiringCardsBottomSheetScreen expiringCardsBottomSheetScreen = this.f112118b;
                switch (i22) {
                    case 0:
                        int i32 = ExpiringCardsBottomSheetScreen.V;
                        qji.b bVarU2 = expiringCardsBottomSheetScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.card_screen.impl.kompot.cards_list.screen.expiring_cards_bottom_sheet.di.ExpiringCardsBottomSheetInjector");
                        z73.c cVar = (z73.c) bVarU2;
                        z73.b bVar = cVar.f319876b;
                        z73.c cVar2 = cVar.f319877c;
                        ExpiringCardsBottomSheetContract$InputData expiringCardsBottomSheetContract$InputData = expiringCardsBottomSheetScreen.Q;
                        expiringCardsBottomSheetContract$InputData.getClass();
                        return new z73.e(bVar, cVar2, expiringCardsBottomSheetContract$InputData);
                    case 1:
                        int i5 = ExpiringCardsBottomSheetScreen.V;
                        return (j) ((z73.e) expiringCardsBottomSheetScreen.S.getValue()).f319894c.get();
                    default:
                        int i6 = ExpiringCardsBottomSheetScreen.V;
                        return u.c((RowDelegate) expiringCardsBottomSheetScreen.R.getValue());
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (z73.e) this.S.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController, com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final b d() {
        return (j) this.T.getValue();
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, new i(rd0.e.b(((RowDelegate) this.R.getValue()).f53218h), 0), new cvi.j(this, (Continuation) null, 27), 3);
        ViewController.P2(this, e3(), new co7.c(this, null, 21), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: k3 */
    public final dli.b R2() {
        return (j) this.T.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: l3 */
    public final List getQ() {
        return (List) this.U.getValue();
    }
}
