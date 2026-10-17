package com.revolut.feature.card_management.impl.ui.kompot.replace.reason;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.InputDisclosureDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.card_management.impl.ui.kompot.replace.reason.CardReplaceReasonPickerContract$InputData;
import com.revolut.feature.card_management.impl.ui.kompot.replace.reason.CardReplaceReasonPickerController;
import com.revolut.feature.cards_core.R$string;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import dli.c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import nuh.j;
import nwf.b;
import o03.e;
import o03.f;
import o03.i;
import o03.m;
import te0.w;
import vc.s;
import zhm.v;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/card_management/impl/ui/kompot/replace/reason/CardReplaceReasonPickerController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lo03/e;", "Ldli/a;", "Lo03/f;", "feature_card_management_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CardReplaceReasonPickerController extends ViewController<e> implements a {
    public static final /* synthetic */ KProperty[] T = {o0.f186429a.j(new h0(CardReplaceReasonPickerController.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final CardReplaceReasonPickerContract$InputData K;
    public final int L;
    public final h M;
    public final Object N;
    public final Object O;
    public final Object P;
    public final Object Q;
    public final Object R;
    public final Object S;

    public CardReplaceReasonPickerController(CardReplaceReasonPickerContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar;
        this.M = s.t(this, o03.h.f);
        this.N = w.y0(new b(18));
        this.O = w.y0(new b(19));
        this.P = w.y0(new b(20));
        final int i = 0;
        this.Q = w.y0(new Function0(this) { // from class: o03.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CardReplaceReasonPickerController f221110b;

            {
                this.f221110b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                CardReplaceReasonPickerController cardReplaceReasonPickerController = this.f221110b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = CardReplaceReasonPickerController.T;
                        CardReplaceReasonPickerController cardReplaceReasonPickerController2 = this.f221110b;
                        return dli.f.a(cardReplaceReasonPickerController2, (m) cardReplaceReasonPickerController2.S.getValue(), v.k((RowDelegate) cardReplaceReasonPickerController2.N.getValue(), (ListSubheaderDelegate) cardReplaceReasonPickerController2.O.getValue(), (InputDisclosureDelegate) cardReplaceReasonPickerController2.P.getValue(), new RowLoadingDelegate()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = CardReplaceReasonPickerController.T;
                        qji.b bVarU2 = cardReplaceReasonPickerController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.card_management.impl.ui.kompot.replace.reason.di.CardReplaceReasonPickerControllerInjector");
                        tz2.g gVar = (tz2.g) bVarU2;
                        tz2.e eVar = gVar.f275776b;
                        tz2.g gVar2 = gVar.f275777c;
                        CardReplaceReasonPickerContract$InputData cardReplaceReasonPickerContract$InputData = cardReplaceReasonPickerController.K;
                        cardReplaceReasonPickerContract$InputData.getClass();
                        return new tz2.h(eVar, gVar2, cardReplaceReasonPickerContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = CardReplaceReasonPickerController.T;
                        return (m) ((tz2.h) cardReplaceReasonPickerController.R.getValue()).d.get();
                }
            }
        });
        final int i2 = 1;
        this.R = w.y0(new Function0(this) { // from class: o03.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CardReplaceReasonPickerController f221110b;

            {
                this.f221110b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                CardReplaceReasonPickerController cardReplaceReasonPickerController = this.f221110b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CardReplaceReasonPickerController.T;
                        CardReplaceReasonPickerController cardReplaceReasonPickerController2 = this.f221110b;
                        return dli.f.a(cardReplaceReasonPickerController2, (m) cardReplaceReasonPickerController2.S.getValue(), v.k((RowDelegate) cardReplaceReasonPickerController2.N.getValue(), (ListSubheaderDelegate) cardReplaceReasonPickerController2.O.getValue(), (InputDisclosureDelegate) cardReplaceReasonPickerController2.P.getValue(), new RowLoadingDelegate()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = CardReplaceReasonPickerController.T;
                        qji.b bVarU2 = cardReplaceReasonPickerController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.card_management.impl.ui.kompot.replace.reason.di.CardReplaceReasonPickerControllerInjector");
                        tz2.g gVar = (tz2.g) bVarU2;
                        tz2.e eVar = gVar.f275776b;
                        tz2.g gVar2 = gVar.f275777c;
                        CardReplaceReasonPickerContract$InputData cardReplaceReasonPickerContract$InputData = cardReplaceReasonPickerController.K;
                        cardReplaceReasonPickerContract$InputData.getClass();
                        return new tz2.h(eVar, gVar2, cardReplaceReasonPickerContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = CardReplaceReasonPickerController.T;
                        return (m) ((tz2.h) cardReplaceReasonPickerController.R.getValue()).d.get();
                }
            }
        });
        final int i3 = 2;
        this.S = w.y0(new Function0(this) { // from class: o03.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CardReplaceReasonPickerController f221110b;

            {
                this.f221110b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                CardReplaceReasonPickerController cardReplaceReasonPickerController = this.f221110b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CardReplaceReasonPickerController.T;
                        CardReplaceReasonPickerController cardReplaceReasonPickerController2 = this.f221110b;
                        return dli.f.a(cardReplaceReasonPickerController2, (m) cardReplaceReasonPickerController2.S.getValue(), v.k((RowDelegate) cardReplaceReasonPickerController2.N.getValue(), (ListSubheaderDelegate) cardReplaceReasonPickerController2.O.getValue(), (InputDisclosureDelegate) cardReplaceReasonPickerController2.P.getValue(), new RowLoadingDelegate()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = CardReplaceReasonPickerController.T;
                        qji.b bVarU2 = cardReplaceReasonPickerController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.card_management.impl.ui.kompot.replace.reason.di.CardReplaceReasonPickerControllerInjector");
                        tz2.g gVar = (tz2.g) bVarU2;
                        tz2.e eVar = gVar.f275776b;
                        tz2.g gVar2 = gVar.f275777c;
                        CardReplaceReasonPickerContract$InputData cardReplaceReasonPickerContract$InputData = cardReplaceReasonPickerController.K;
                        cardReplaceReasonPickerContract$InputData.getClass();
                        return new tz2.h(eVar, gVar2, cardReplaceReasonPickerContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = CardReplaceReasonPickerController.T;
                        return (m) ((tz2.h) cardReplaceReasonPickerController.R.getValue()).d.get();
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, q qVar) {
        a.z0((f) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (tz2.h) this.R.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (m) this.S.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.M.getValue(this, T[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarWithToolbar navBarWithToolbar = ((jii.m) value).f174539b;
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.card_action_replace_title, null, null, 14), null);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
    }

    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.M.getValue(this, T[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ViewController.P2(this, rd0.e.b(((jii.m) value).f174539b.f59410q), new j(this, null, 7), 3);
        ViewController.P2(this, rd0.e.b(((InputDisclosureDelegate) this.P.getValue()).f52538c), new i(this, null), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.Q.getValue();
    }
}
