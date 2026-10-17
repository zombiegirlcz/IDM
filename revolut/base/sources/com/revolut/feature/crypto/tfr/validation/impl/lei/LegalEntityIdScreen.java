package com.revolut.feature.crypto.tfr.validation.impl.lei;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import aw0.o9;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.crypto.tfr.validation.api.R$string;
import com.revolut.feature.crypto.tfr.validation.impl.lei.LegalEntityIdScreen;
import com.revolut.feature.crypto.tfr.validation.impl.lei.LegalEntityIdScreenContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import vc.s;
import xki.e;
import ym5.b;
import ym5.c;
import ym5.d;
import ym5.f;
import ym5.j;
import zhm.u;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/crypto/tfr/validation/impl/lei/LegalEntityIdScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lym5/f;", "Ldli/a;", "Lym5/h;", "feature_crypto_tfr_validation_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class LegalEntityIdScreen extends ViewController<f> implements a {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(LegalEntityIdScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final LegalEntityIdScreenContract$InputData K;
    public final int L;
    public final h M;
    public final InputTextDelegate N;
    public final Object O;
    public final Object P;
    public final Object Q;

    public LegalEntityIdScreen(LegalEntityIdScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar_nextbutton;
        this.M = s.t(this, b.f);
        this.N = new InputTextDelegate(null);
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: ym5.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LegalEntityIdScreen f314860b;

            {
                this.f314860b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                LegalEntityIdScreen legalEntityIdScreen = this.f314860b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = LegalEntityIdScreen.R;
                        LegalEntityIdScreen legalEntityIdScreen2 = this.f314860b;
                        return dli.f.a(legalEntityIdScreen2, (j) legalEntityIdScreen2.Q.getValue(), u.c(legalEntityIdScreen2.N), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = LegalEntityIdScreen.R;
                        phm.a aVar = (phm.a) ue0.e.j(legalEntityIdScreen.m2()).a().get(um5.c.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", um5.c.class, " is not found"));
                        }
                        um5.c cVar = ((um5.c) aVar2.b()).f281237h;
                        LegalEntityIdScreenContract$InputData legalEntityIdScreenContract$InputData = legalEntityIdScreen.K;
                        legalEntityIdScreenContract$InputData.getClass();
                        return new um5.e(cVar, legalEntityIdScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = LegalEntityIdScreen.R;
                        return (j) ((um5.e) legalEntityIdScreen.P.getValue()).f281247c.get();
                }
            }
        });
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: ym5.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LegalEntityIdScreen f314860b;

            {
                this.f314860b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                LegalEntityIdScreen legalEntityIdScreen = this.f314860b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = LegalEntityIdScreen.R;
                        LegalEntityIdScreen legalEntityIdScreen2 = this.f314860b;
                        return dli.f.a(legalEntityIdScreen2, (j) legalEntityIdScreen2.Q.getValue(), u.c(legalEntityIdScreen2.N), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = LegalEntityIdScreen.R;
                        phm.a aVar = (phm.a) ue0.e.j(legalEntityIdScreen.m2()).a().get(um5.c.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", um5.c.class, " is not found"));
                        }
                        um5.c cVar = ((um5.c) aVar2.b()).f281237h;
                        LegalEntityIdScreenContract$InputData legalEntityIdScreenContract$InputData = legalEntityIdScreen.K;
                        legalEntityIdScreenContract$InputData.getClass();
                        return new um5.e(cVar, legalEntityIdScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = LegalEntityIdScreen.R;
                        return (j) ((um5.e) legalEntityIdScreen.P.getValue()).f281247c.get();
                }
            }
        });
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: ym5.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LegalEntityIdScreen f314860b;

            {
                this.f314860b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                LegalEntityIdScreen legalEntityIdScreen = this.f314860b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = LegalEntityIdScreen.R;
                        LegalEntityIdScreen legalEntityIdScreen2 = this.f314860b;
                        return dli.f.a(legalEntityIdScreen2, (j) legalEntityIdScreen2.Q.getValue(), u.c(legalEntityIdScreen2.N), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = LegalEntityIdScreen.R;
                        phm.a aVar = (phm.a) ue0.e.j(legalEntityIdScreen.m2()).a().get(um5.c.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", um5.c.class, " is not found"));
                        }
                        um5.c cVar = ((um5.c) aVar2.b()).f281237h;
                        LegalEntityIdScreenContract$InputData legalEntityIdScreenContract$InputData = legalEntityIdScreen.K;
                        legalEntityIdScreenContract$InputData.getClass();
                        return new um5.e(cVar, legalEntityIdScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = LegalEntityIdScreen.R;
                        return (j) ((um5.e) legalEntityIdScreen.P.getValue()).f281247c.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        ym5.h uiState = (ym5.h) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        d3().f174564b.setEnabled(uiState.f314864b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (um5.e) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (j) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        navBarWithToolbar.setDescriptionVisible(true);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.crypto_tfr_validation_lei_toolbar_title, null, null, 14), null);
        navBarWithToolbar.setDescriptionText(new TextLocalisedClause(R$string.crypto_tfr_validation_lei_toolbar_subtitle, u.c(new TextClause(this.K.f71042b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12));
        d3().f174564b.setText(new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_continue, null, null, 14));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174565c.f59410q), null, new c(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174564b.o), null, new c(this, continuation, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.N.e.f121375b), null, new d(this, null), 3);
    }

    public final jii.u d3() {
        ViewBinding value = this.M.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.u) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.O.getValue();
    }
}
