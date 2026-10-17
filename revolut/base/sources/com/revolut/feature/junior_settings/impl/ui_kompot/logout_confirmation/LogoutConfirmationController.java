package com.revolut.feature.junior_settings.impl.ui_kompot.logout_confirmation;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.q;
import com.revolut.core.ui_kit.delegates.CellDetailsStandaloneNoteDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsSwitcherDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.feature.junior_settings.impl.ui_kompot.logout_confirmation.LogoutConfirmationController;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import jii.n;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import mn8.o;
import mn8.p;
import no8.c;
import no8.d;
import no8.g;
import no8.k;
import no8.l;
import te0.w;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/junior_settings/impl/ui_kompot/logout_confirmation/LogoutConfirmationController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lno8/k;", "Ldli/a;", "Lno8/l;", "feature_junior_settings_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class LogoutConfirmationController extends ViewController<k> implements dli.a {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(LogoutConfirmationController.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBottomsheetBinding;", 0))};
    public final g K;
    public final int L;
    public final h M;
    public final LargeActionButtonDelegate N;
    public final CellDetailsSwitcherDelegate O;
    public final Object P;
    public final Object Q;
    public final Object R;

    public LogoutConfirmationController(g inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar_bottomsheet;
        this.M = s.t(this, no8.b.f);
        this.N = new LargeActionButtonDelegate();
        this.O = new CellDetailsSwitcherDelegate();
        final int i = 0;
        this.P = w.y0(new Function0(this) { // from class: no8.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LogoutConfirmationController f217947b;

            {
                this.f217947b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                LogoutConfirmationController logoutConfirmationController = this.f217947b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = LogoutConfirmationController.S;
                        return (e) ((p) logoutConfirmationController.Q.getValue()).f207479c.get();
                    case 1:
                        KProperty[] kPropertyArr2 = LogoutConfirmationController.S;
                        phm.a aVar = (phm.a) ue0.e.j(logoutConfirmationController.m2()).a().get(o.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", o.class, " is not found"));
                        }
                        o oVar = ((o) aVar2.b()).f207476w;
                        g gVar = logoutConfirmationController.K;
                        gVar.getClass();
                        return new p(oVar, gVar);
                    default:
                        KProperty[] kPropertyArr3 = LogoutConfirmationController.S;
                        LogoutConfirmationController logoutConfirmationController2 = this.f217947b;
                        return dli.f.a(logoutConfirmationController2, (e) logoutConfirmationController2.P.getValue(), v.k(logoutConfirmationController2.N, logoutConfirmationController2.O, new CellDetailsStandaloneNoteDelegate()), R$id.navBarBottomSheet_RecyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.Q = w.y0(new Function0(this) { // from class: no8.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LogoutConfirmationController f217947b;

            {
                this.f217947b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                LogoutConfirmationController logoutConfirmationController = this.f217947b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = LogoutConfirmationController.S;
                        return (e) ((p) logoutConfirmationController.Q.getValue()).f207479c.get();
                    case 1:
                        KProperty[] kPropertyArr2 = LogoutConfirmationController.S;
                        phm.a aVar = (phm.a) ue0.e.j(logoutConfirmationController.m2()).a().get(o.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", o.class, " is not found"));
                        }
                        o oVar = ((o) aVar2.b()).f207476w;
                        g gVar = logoutConfirmationController.K;
                        gVar.getClass();
                        return new p(oVar, gVar);
                    default:
                        KProperty[] kPropertyArr3 = LogoutConfirmationController.S;
                        LogoutConfirmationController logoutConfirmationController2 = this.f217947b;
                        return dli.f.a(logoutConfirmationController2, (e) logoutConfirmationController2.P.getValue(), v.k(logoutConfirmationController2.N, logoutConfirmationController2.O, new CellDetailsStandaloneNoteDelegate()), R$id.navBarBottomSheet_RecyclerView, null, null, null, 56);
                }
            }
        });
        final int i3 = 2;
        this.R = w.y0(new Function0(this) { // from class: no8.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LogoutConfirmationController f217947b;

            {
                this.f217947b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                LogoutConfirmationController logoutConfirmationController = this.f217947b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = LogoutConfirmationController.S;
                        return (e) ((p) logoutConfirmationController.Q.getValue()).f207479c.get();
                    case 1:
                        KProperty[] kPropertyArr2 = LogoutConfirmationController.S;
                        phm.a aVar = (phm.a) ue0.e.j(logoutConfirmationController.m2()).a().get(o.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", o.class, " is not found"));
                        }
                        o oVar = ((o) aVar2.b()).f207476w;
                        g gVar = logoutConfirmationController.K;
                        gVar.getClass();
                        return new p(oVar, gVar);
                    default:
                        KProperty[] kPropertyArr3 = LogoutConfirmationController.S;
                        LogoutConfirmationController logoutConfirmationController2 = this.f217947b;
                        return dli.f.a(logoutConfirmationController2, (e) logoutConfirmationController2.P.getValue(), v.k(logoutConfirmationController2.N, logoutConfirmationController2.O, new CellDetailsStandaloneNoteDelegate()), R$id.navBarBottomSheet_RecyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(cli.o oVar, q qVar) {
        l uiState = (l) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        ViewBinding value = this.M.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ((n) value).f174542b.setHeaderModel(new lw0.a(uiState.f217956b, null, null, null, false, 28));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (p) this.Q.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (no8.e) this.P.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(this.O.f51912c), new c(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.N.d.f121375b), new d(this, null), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.R.getValue();
    }
}
