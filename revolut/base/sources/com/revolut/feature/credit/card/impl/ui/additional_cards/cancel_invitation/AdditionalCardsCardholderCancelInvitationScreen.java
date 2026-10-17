package com.revolut.feature.credit.card.impl.ui.additional_cards.cancel_invitation;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.TwinHorizontalButtonDelegate;
import com.revolut.feature.credit.card.impl.ui.additional_cards.cancel_invitation.AdditionalCardsCardholderCancelInvitationScreen;
import com.revolut.feature.credit.card.impl.ui.additional_cards.cancel_invitation.AdditionalCardsCardholderCancelInvitationScreenContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import ep4.b;
import gp4.c;
import gp4.d;
import jii.n;
import jm4.a3;
import jm4.v;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import no.m;
import te0.w;
import vc.s;
import xki.e;
import zhm.u;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/credit/card/impl/ui/additional_cards/cancel_invitation/AdditionalCardsCardholderCancelInvitationScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lgp4/d;", "Lno/m;", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AdditionalCardsCardholderCancelInvitationScreen extends ViewController<q> implements a, m {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(AdditionalCardsCardholderCancelInvitationScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBottomsheetBinding;", 0))};
    public final /* synthetic */ b K;
    public final AdditionalCardsCardholderCancelInvitationScreenContract$InputData L;
    public final h M;
    public final TwinHorizontalButtonDelegate N;
    public final Object O;
    public final int P;
    public final Object Q;
    public final Object R;

    public AdditionalCardsCardholderCancelInvitationScreen(AdditionalCardsCardholderCancelInvitationScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = b.f128075a;
        this.L = inputData;
        this.M = s.t(this, gp4.b.f);
        this.N = new TwinHorizontalButtonDelegate();
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: gp4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AdditionalCardsCardholderCancelInvitationScreen f145248b;

            {
                this.f145248b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                AdditionalCardsCardholderCancelInvitationScreen additionalCardsCardholderCancelInvitationScreen = this.f145248b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = AdditionalCardsCardholderCancelInvitationScreen.S;
                        AdditionalCardsCardholderCancelInvitationScreen additionalCardsCardholderCancelInvitationScreen2 = this.f145248b;
                        return dli.f.a(additionalCardsCardholderCancelInvitationScreen2, (e) additionalCardsCardholderCancelInvitationScreen2.R.getValue(), u.c(additionalCardsCardholderCancelInvitationScreen2.N), R$id.navBarBottomSheet_RecyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = AdditionalCardsCardholderCancelInvitationScreen.S;
                        phm.a aVar = (phm.a) ue0.e.j(additionalCardsCardholderCancelInvitationScreen.m2()).a().get(a3.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", a3.class, " is not found"));
                        }
                        a3 a3Var = ((a3) aVar2.b()).Y;
                        AdditionalCardsCardholderCancelInvitationScreenContract$InputData additionalCardsCardholderCancelInvitationScreenContract$InputData = additionalCardsCardholderCancelInvitationScreen.L;
                        additionalCardsCardholderCancelInvitationScreenContract$InputData.getClass();
                        return new v(a3Var, additionalCardsCardholderCancelInvitationScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = AdditionalCardsCardholderCancelInvitationScreen.S;
                        return (e) ((v) additionalCardsCardholderCancelInvitationScreen.Q.getValue()).f176391c.get();
                }
            }
        });
        this.P = R$layout.screen_recycler_navbar_bottomsheet;
        final int i2 = 1;
        this.Q = w.y0(new Function0(this) { // from class: gp4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AdditionalCardsCardholderCancelInvitationScreen f145248b;

            {
                this.f145248b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                AdditionalCardsCardholderCancelInvitationScreen additionalCardsCardholderCancelInvitationScreen = this.f145248b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = AdditionalCardsCardholderCancelInvitationScreen.S;
                        AdditionalCardsCardholderCancelInvitationScreen additionalCardsCardholderCancelInvitationScreen2 = this.f145248b;
                        return dli.f.a(additionalCardsCardholderCancelInvitationScreen2, (e) additionalCardsCardholderCancelInvitationScreen2.R.getValue(), u.c(additionalCardsCardholderCancelInvitationScreen2.N), R$id.navBarBottomSheet_RecyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = AdditionalCardsCardholderCancelInvitationScreen.S;
                        phm.a aVar = (phm.a) ue0.e.j(additionalCardsCardholderCancelInvitationScreen.m2()).a().get(a3.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", a3.class, " is not found"));
                        }
                        a3 a3Var = ((a3) aVar2.b()).Y;
                        AdditionalCardsCardholderCancelInvitationScreenContract$InputData additionalCardsCardholderCancelInvitationScreenContract$InputData = additionalCardsCardholderCancelInvitationScreen.L;
                        additionalCardsCardholderCancelInvitationScreenContract$InputData.getClass();
                        return new v(a3Var, additionalCardsCardholderCancelInvitationScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = AdditionalCardsCardholderCancelInvitationScreen.S;
                        return (e) ((v) additionalCardsCardholderCancelInvitationScreen.Q.getValue()).f176391c.get();
                }
            }
        });
        final int i3 = 2;
        this.R = w.y0(new Function0(this) { // from class: gp4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AdditionalCardsCardholderCancelInvitationScreen f145248b;

            {
                this.f145248b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                AdditionalCardsCardholderCancelInvitationScreen additionalCardsCardholderCancelInvitationScreen = this.f145248b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = AdditionalCardsCardholderCancelInvitationScreen.S;
                        AdditionalCardsCardholderCancelInvitationScreen additionalCardsCardholderCancelInvitationScreen2 = this.f145248b;
                        return dli.f.a(additionalCardsCardholderCancelInvitationScreen2, (e) additionalCardsCardholderCancelInvitationScreen2.R.getValue(), u.c(additionalCardsCardholderCancelInvitationScreen2.N), R$id.navBarBottomSheet_RecyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = AdditionalCardsCardholderCancelInvitationScreen.S;
                        phm.a aVar = (phm.a) ue0.e.j(additionalCardsCardholderCancelInvitationScreen.m2()).a().get(a3.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", a3.class, " is not found"));
                        }
                        a3 a3Var = ((a3) aVar2.b()).Y;
                        AdditionalCardsCardholderCancelInvitationScreenContract$InputData additionalCardsCardholderCancelInvitationScreenContract$InputData = additionalCardsCardholderCancelInvitationScreen.L;
                        additionalCardsCardholderCancelInvitationScreenContract$InputData.getClass();
                        return new v(a3Var, additionalCardsCardholderCancelInvitationScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = AdditionalCardsCardholderCancelInvitationScreen.S;
                        return (e) ((v) additionalCardsCardholderCancelInvitationScreen.Q.getValue()).f176391c.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        d uiState = (d) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        ViewBinding value = this.M.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ((n) value).f174542b.setHeaderModel(uiState.f145249a);
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getN() {
        this.K.getClass();
        return b.f128076b;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (v) this.Q.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (gp4.e) this.R.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        TwinHorizontalButtonDelegate twinHorizontalButtonDelegate = this.N;
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(twinHorizontalButtonDelegate.f53572c.f121375b), new c(this, continuation, 0), 3);
        ViewController.P2(this, rd0.e.b(twinHorizontalButtonDelegate.d.f121375b), new c(this, continuation, 1), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.P;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.O.getValue();
    }
}
