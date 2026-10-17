package com.revolut.feature.apm.payid.impl.screen.createpayid.aliases;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TextLocalisedQuantityClause;
import com.revolut.feature.apm.payid.api.R$plurals;
import com.revolut.feature.apm.payid.api.R$string;
import com.revolut.feature.apm.payid.impl.screen.createpayid.aliases.AliasesScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import java.util.List;
import jii.n;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import oa2.b;
import oa2.c;
import oa2.d;
import oa2.f;
import oa2.h;
import oa2.i;
import oa2.k;
import te0.w;
import vc.s;
import xki.e;
import zhm.u;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/payid/impl/screen/createpayid/aliases/AliasesScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Loa2/h;", "Ldli/a;", "Loa2/k;", "feature_apm_payid_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AliasesScreen extends ViewController<h> implements a {
    public static final /* synthetic */ KProperty[] Q = {o0.f186429a.j(new h0(AliasesScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBottomsheetBinding;", 0))};
    public final int K;
    public final ao.h L;
    public final RowDelegate M;
    public final Object N;
    public final Object O;
    public final Object P;

    public AliasesScreen(f inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = R$layout.screen_recycler_navbar_bottomsheet;
        this.L = s.t(this, c.f);
        this.M = new RowDelegate(null, null, 7);
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: oa2.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AliasesScreen f223501b;

            {
                this.f223501b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        KProperty[] kPropertyArr = AliasesScreen.Q;
                        return (i) ((ea2.b) this.f223501b.O.getValue()).f124056c.get();
                    default:
                        KProperty[] kPropertyArr2 = AliasesScreen.Q;
                        AliasesScreen aliasesScreen = this.f223501b;
                        return dli.f.a(aliasesScreen, (i) aliasesScreen.N.getValue(), u.c(aliasesScreen.M), R$id.navBarBottomSheet_RecyclerView, null, null, null, 56);
                }
            }
        });
        this.O = w.y0(new b(this, inputData, i));
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: oa2.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AliasesScreen f223501b;

            {
                this.f223501b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = AliasesScreen.Q;
                        return (i) ((ea2.b) this.f223501b.O.getValue()).f124056c.get();
                    default:
                        KProperty[] kPropertyArr2 = AliasesScreen.Q;
                        AliasesScreen aliasesScreen = this.f223501b;
                        return dli.f.a(aliasesScreen, (i) aliasesScreen.N.getValue(), u.c(aliasesScreen.M), R$id.navBarBottomSheet_RecyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        k uiState = (k) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        ViewBinding value = this.L.getValue(this, Q[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ((n) value).f174542b.setHeaderModel(new lw0.a(new TextLocalisedClause(R$string.payid_list_bottom_sheet_title, null, null, 14), new TextLocalisedQuantityClause(R$plurals.payid_list_bottom_sheet_subtitle, Integer.valueOf(uiState.f223510b), (List) null, (Style) null, 28), null, null, false, 28));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (ea2.b) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (i) this.N.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(this.M.f53218h), new d(this, null), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.P.getValue();
    }
}
