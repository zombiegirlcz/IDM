package com.revolut.feature.referrals.code.impl.referral_code.screen;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.CodeEditorDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.referrals.code.api.R$string;
import com.revolut.feature.referrals.code.impl.referral_code.screen.ReferralCodeContract$InputData;
import com.revolut.feature.referrals.code.impl.referral_code.screen.ReferralCodeController;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import jii.m;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import kwa.b;
import kwa.c;
import kwa.e;
import kwa.i;
import org.jetbrains.annotations.NotNull;
import te0.w;
import vc.s;
import zhm.u;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003:\u0001\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/referrals/code/impl/referral_code/screen/ReferralCodeController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lkwa/b;", "Ldli/a;", "Lkwa/c;", "Companion", "a", "feature_retail_referrals_code_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ReferralCodeController extends ViewController<b> implements a {
    public final ReferralCodeContract$InputData K;
    public final Object L;
    public final Object M;
    public final boolean N;
    public final h O;
    public final int P;
    public final CodeEditorDelegate Q;
    public final Object R;
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(ReferralCodeController.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: com.revolut.feature.referrals.code.impl.referral_code.screen.ReferralCodeController$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    public ReferralCodeController(ReferralCodeContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: kwa.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ReferralCodeController f190318b;

            {
                this.f190318b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                ReferralCodeController referralCodeController = this.f190318b;
                switch (i2) {
                    case 0:
                        ReferralCodeController.Companion companion = ReferralCodeController.INSTANCE;
                        qji.b bVarU2 = referralCodeController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.referrals.code.impl.referral_code.screen.di.ReferralCodeControllerInjector");
                        hwa.c cVar = (hwa.c) bVarU2;
                        hwa.a aVar = cVar.f156117b;
                        hwa.c cVar2 = cVar.f156118c;
                        ReferralCodeContract$InputData referralCodeContract$InputData = referralCodeController.K;
                        referralCodeContract$InputData.getClass();
                        return new hwa.b(aVar, cVar2, referralCodeContract$InputData);
                    case 1:
                        ReferralCodeController.Companion companion2 = ReferralCodeController.INSTANCE;
                        ReferralCodeController referralCodeController2 = this.f190318b;
                        return dli.f.a(referralCodeController2, (i) referralCodeController2.R.getValue(), u.c(referralCodeController2.Q), 0, null, null, null, 60);
                    default:
                        ReferralCodeController.Companion companion3 = ReferralCodeController.INSTANCE;
                        return (i) ((hwa.b) referralCodeController.L.getValue()).f156115b.get();
                }
            }
        });
        final int i2 = 1;
        this.M = w.y0(new Function0(this) { // from class: kwa.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ReferralCodeController f190318b;

            {
                this.f190318b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                ReferralCodeController referralCodeController = this.f190318b;
                switch (i22) {
                    case 0:
                        ReferralCodeController.Companion companion = ReferralCodeController.INSTANCE;
                        qji.b bVarU2 = referralCodeController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.referrals.code.impl.referral_code.screen.di.ReferralCodeControllerInjector");
                        hwa.c cVar = (hwa.c) bVarU2;
                        hwa.a aVar = cVar.f156117b;
                        hwa.c cVar2 = cVar.f156118c;
                        ReferralCodeContract$InputData referralCodeContract$InputData = referralCodeController.K;
                        referralCodeContract$InputData.getClass();
                        return new hwa.b(aVar, cVar2, referralCodeContract$InputData);
                    case 1:
                        ReferralCodeController.Companion companion2 = ReferralCodeController.INSTANCE;
                        ReferralCodeController referralCodeController2 = this.f190318b;
                        return dli.f.a(referralCodeController2, (i) referralCodeController2.R.getValue(), u.c(referralCodeController2.Q), 0, null, null, null, 60);
                    default:
                        ReferralCodeController.Companion companion3 = ReferralCodeController.INSTANCE;
                        return (i) ((hwa.b) referralCodeController.L.getValue()).f156115b.get();
                }
            }
        });
        this.N = true;
        this.O = s.t(this, e.f);
        this.P = R$layout.screen_recycler_navbar;
        this.Q = new CodeEditorDelegate();
        final int i3 = 2;
        this.R = w.y0(new Function0(this) { // from class: kwa.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ReferralCodeController f190318b;

            {
                this.f190318b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                ReferralCodeController referralCodeController = this.f190318b;
                switch (i22) {
                    case 0:
                        ReferralCodeController.Companion companion = ReferralCodeController.INSTANCE;
                        qji.b bVarU2 = referralCodeController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.referrals.code.impl.referral_code.screen.di.ReferralCodeControllerInjector");
                        hwa.c cVar = (hwa.c) bVarU2;
                        hwa.a aVar = cVar.f156117b;
                        hwa.c cVar2 = cVar.f156118c;
                        ReferralCodeContract$InputData referralCodeContract$InputData = referralCodeController.K;
                        referralCodeContract$InputData.getClass();
                        return new hwa.b(aVar, cVar2, referralCodeContract$InputData);
                    case 1:
                        ReferralCodeController.Companion companion2 = ReferralCodeController.INSTANCE;
                        ReferralCodeController referralCodeController2 = this.f190318b;
                        return dli.f.a(referralCodeController2, (i) referralCodeController2.R.getValue(), u.c(referralCodeController2.Q), 0, null, null, null, 60);
                    default:
                        ReferralCodeController.Companion companion3 = ReferralCodeController.INSTANCE;
                        return (i) ((hwa.b) referralCodeController.L.getValue()).f156115b.get();
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, q qVar) {
        a.z0((c) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (hwa.b) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (i) this.R.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.O.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarWithToolbar navBarWithToolbar = ((m) value).f174539b;
        navBarWithToolbar.setTag("ReferralCode_navbar_tag");
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_cross));
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.referrals_referral_code_input_title, null, null, 14), null);
        navBarWithToolbar.setSecondDescriptionVisible(true);
        navBarWithToolbar.setSecondDescriptionText(new TextLocalisedClause(R$string.referrals_referral_code_input_subtitle, null, null, 14));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.O.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((m) value).f174539b.f59410q), null, new ko2.b(this, continuation, 10), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.Q.d.f121375b), null, new krc.h(this, continuation, 14), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getT() {
        return this.P;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.M.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.N);
    }
}
