package com.revolut.feature.payments.profile.impl.ui_kompot.details_card;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.a0;
import cli.o;
import cli.w;
import com.revolut.core.ui_kit.R$style;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.feature.payments.profile.impl.R$layout;
import com.revolut.feature.payments.profile.impl.ui_kompot.details_card.ProfileDetailsCard;
import com.revolut.feature.payments.profile.impl.ui_kompot.details_card.ProfileDetailsCardContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import ow9.i;
import ow9.l;
import pki.a;
import tw9.b;
import tw9.c;
import tw9.e;
import vc.s;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/payments/profile/impl/ui_kompot/details_card/ProfileDetailsCard;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Lcli/w;", "Ltw9/e;", "retail_feature_payments_profile_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ProfileDetailsCard extends ViewController<q> implements w {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(ProfileDetailsCard.class, "binding", "getBinding()Lcom/revolut/feature/payments/profile/impl/databinding/ScreenProfileCardPaymentsBinding;", 0))};
    public final ProfileDetailsCardContract$InputData K;
    public final h L;
    public final int M;
    public final int N;
    public final boolean O;
    public final Object P;
    public final Object Q;
    public final Object R;

    public ProfileDetailsCard(ProfileDetailsCardContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = s.t(this, b.f);
        this.M = R$layout.screen_profile_card_payments;
        this.N = R$style.UiKitTheme_Mono;
        this.O = true;
        final int i = 0;
        this.P = te0.w.y0(new Function0(this) { // from class: tw9.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ProfileDetailsCard f274953b;

            {
                this.f274953b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                ProfileDetailsCard profileDetailsCard = this.f274953b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = ProfileDetailsCard.S;
                        return n14.e.a(profileDetailsCard, (i) profileDetailsCard.R.getValue());
                    case 1:
                        KProperty[] kPropertyArr2 = ProfileDetailsCard.S;
                        phm.a aVar = (phm.a) ue0.e.j(profileDetailsCard.m2()).a().get(l.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", l.class, " is not found"));
                        }
                        ow9.e eVar = ((ow9.e) aVar2.b()).z;
                        ProfileDetailsCardContract$InputData profileDetailsCardContract$InputData = profileDetailsCard.K;
                        profileDetailsCardContract$InputData.getClass();
                        return new ow9.i(eVar, profileDetailsCardContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = ProfileDetailsCard.S;
                        return (i) ((ow9.i) profileDetailsCard.Q.getValue()).d.get();
                }
            }
        });
        final int i2 = 1;
        this.Q = te0.w.y0(new Function0(this) { // from class: tw9.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ProfileDetailsCard f274953b;

            {
                this.f274953b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                ProfileDetailsCard profileDetailsCard = this.f274953b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = ProfileDetailsCard.S;
                        return n14.e.a(profileDetailsCard, (i) profileDetailsCard.R.getValue());
                    case 1:
                        KProperty[] kPropertyArr2 = ProfileDetailsCard.S;
                        phm.a aVar = (phm.a) ue0.e.j(profileDetailsCard.m2()).a().get(l.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", l.class, " is not found"));
                        }
                        ow9.e eVar = ((ow9.e) aVar2.b()).z;
                        ProfileDetailsCardContract$InputData profileDetailsCardContract$InputData = profileDetailsCard.K;
                        profileDetailsCardContract$InputData.getClass();
                        return new ow9.i(eVar, profileDetailsCardContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = ProfileDetailsCard.S;
                        return (i) ((ow9.i) profileDetailsCard.Q.getValue()).d.get();
                }
            }
        });
        final int i3 = 2;
        this.R = te0.w.y0(new Function0(this) { // from class: tw9.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ProfileDetailsCard f274953b;

            {
                this.f274953b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                ProfileDetailsCard profileDetailsCard = this.f274953b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = ProfileDetailsCard.S;
                        return n14.e.a(profileDetailsCard, (i) profileDetailsCard.R.getValue());
                    case 1:
                        KProperty[] kPropertyArr2 = ProfileDetailsCard.S;
                        phm.a aVar = (phm.a) ue0.e.j(profileDetailsCard.m2()).a().get(l.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", l.class, " is not found"));
                        }
                        ow9.e eVar = ((ow9.e) aVar2.b()).z;
                        ProfileDetailsCardContract$InputData profileDetailsCardContract$InputData = profileDetailsCard.K;
                        profileDetailsCardContract$InputData.getClass();
                        return new ow9.i(eVar, profileDetailsCardContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = ProfileDetailsCard.S;
                        return (i) ((ow9.i) profileDetailsCard.Q.getValue()).d.get();
                }
            }
        });
    }

    @Override // com.revolut.kompot.navigable.a
    /* JADX INFO: renamed from: A2 */
    public final Integer getN() {
        return Integer.valueOf(this.N);
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        e uiState = (e) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        d3().f209416c.setModel(uiState.f274956a);
        LargeActionButton googleWalletButton = d3().f209415b;
        Intrinsics.checkNotNullExpressionValue(googleWalletButton, "googleWalletButton");
        googleWalletButton.setVisibility(uiState.f274957b ? 0 : 8);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (i) this.Q.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (tw9.i) this.R.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(d3().f209416c.f()), new c(this, continuation, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().f209415b.o), new c(this, continuation, 1), 3);
    }

    public final mw9.c d3() {
        ViewBinding value = this.L.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (mw9.c) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final a k() {
        return (a0) this.P.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.O);
    }
}
