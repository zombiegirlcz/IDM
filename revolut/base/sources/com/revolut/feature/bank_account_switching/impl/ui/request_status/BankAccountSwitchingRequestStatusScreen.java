package com.revolut.feature.bank_account_switching.impl.ui.request_status;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.ActionCardLoadingDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.LabelButtonDelegate;
import com.revolut.core.ui_kit.delegates.ProgressStepVerticalLoadingV2Delegate;
import com.revolut.core.ui_kit.delegates.ProgressStepVerticalV2Delegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.ScrollerDelegate;
import com.revolut.core.ui_kit.delegates.SmallActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.SmallStockCardDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.bank_account_switching.api.R$string;
import com.revolut.feature.bank_account_switching.impl.ui.request_status.BankAccountSwitchingRequestStatusScreen;
import com.revolut.feature.bank_account_switching.impl.ui.request_status.BankAccountSwitchingRequestStatusScreenContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import vc.s;
import vn2.n;
import wo2.b;
import wo2.c;
import wo2.d;
import wo2.f;
import wo2.i;
import wo2.m;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/bank_account_switching/impl/ui/request_status/BankAccountSwitchingRequestStatusScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lwo2/i;", "feature_bank_account_switching_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class BankAccountSwitchingRequestStatusScreen extends ViewController<q> implements a {
    public static final /* synthetic */ KProperty[] V = {o0.f186429a.j(new h0(BankAccountSwitchingRequestStatusScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final BankAccountSwitchingRequestStatusScreenContract$InputData K;
    public final int L;
    public final ProgressStepVerticalV2Delegate M;
    public final RowDelegate N;
    public final FullScreenStateDelegate O;
    public final LabelButtonDelegate P;
    public final SmallActionButtonDelegate Q;
    public final Object R;
    public final Object S;
    public final h T;
    public final Object U;

    public BankAccountSwitchingRequestStatusScreen(BankAccountSwitchingRequestStatusScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar;
        this.M = new ProgressStepVerticalV2Delegate();
        this.N = new RowDelegate(null, null, 7);
        this.O = new FullScreenStateDelegate();
        this.P = new LabelButtonDelegate();
        this.Q = new SmallActionButtonDelegate();
        final int i = 0;
        this.R = w.y0(new Function0(this) { // from class: wo2.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BankAccountSwitchingRequestStatusScreen f298866b;

            {
                this.f298866b = this;
            }

            /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                BankAccountSwitchingRequestStatusScreen bankAccountSwitchingRequestStatusScreen = this.f298866b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = BankAccountSwitchingRequestStatusScreen.V;
                        BankAccountSwitchingRequestStatusScreen bankAccountSwitchingRequestStatusScreen2 = this.f298866b;
                        return dli.f.a(bankAccountSwitchingRequestStatusScreen2, bankAccountSwitchingRequestStatusScreen2.d(), v.k(bankAccountSwitchingRequestStatusScreen2.M, new ScrollerDelegate(v.k(new SmallStockCardDelegate(), new ActionCardLoadingDelegate()), false), bankAccountSwitchingRequestStatusScreen2.P, new ProgressStepVerticalLoadingV2Delegate(), new RowLoadingDelegate(), bankAccountSwitchingRequestStatusScreen2.O, bankAccountSwitchingRequestStatusScreen2.Q, bankAccountSwitchingRequestStatusScreen2.N), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = BankAccountSwitchingRequestStatusScreen.V;
                        phm.a aVar = (phm.a) ue0.e.j(bankAccountSwitchingRequestStatusScreen.m2()).a().get(vn2.h.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", vn2.h.class, " is not found"));
                        }
                        vn2.h hVar = ((vn2.h) aVar2.b()).f290682l;
                        BankAccountSwitchingRequestStatusScreenContract$InputData bankAccountSwitchingRequestStatusScreenContract$InputData = bankAccountSwitchingRequestStatusScreen.K;
                        bankAccountSwitchingRequestStatusScreenContract$InputData.getClass();
                        return new vn2.n(hVar, bankAccountSwitchingRequestStatusScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = BankAccountSwitchingRequestStatusScreen.V;
                        return (h) ((vn2.n) bankAccountSwitchingRequestStatusScreen.S.getValue()).d.get();
                }
            }
        });
        final int i2 = 1;
        this.S = w.y0(new Function0(this) { // from class: wo2.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BankAccountSwitchingRequestStatusScreen f298866b;

            {
                this.f298866b = this;
            }

            /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                BankAccountSwitchingRequestStatusScreen bankAccountSwitchingRequestStatusScreen = this.f298866b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = BankAccountSwitchingRequestStatusScreen.V;
                        BankAccountSwitchingRequestStatusScreen bankAccountSwitchingRequestStatusScreen2 = this.f298866b;
                        return dli.f.a(bankAccountSwitchingRequestStatusScreen2, bankAccountSwitchingRequestStatusScreen2.d(), v.k(bankAccountSwitchingRequestStatusScreen2.M, new ScrollerDelegate(v.k(new SmallStockCardDelegate(), new ActionCardLoadingDelegate()), false), bankAccountSwitchingRequestStatusScreen2.P, new ProgressStepVerticalLoadingV2Delegate(), new RowLoadingDelegate(), bankAccountSwitchingRequestStatusScreen2.O, bankAccountSwitchingRequestStatusScreen2.Q, bankAccountSwitchingRequestStatusScreen2.N), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = BankAccountSwitchingRequestStatusScreen.V;
                        phm.a aVar = (phm.a) ue0.e.j(bankAccountSwitchingRequestStatusScreen.m2()).a().get(vn2.h.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", vn2.h.class, " is not found"));
                        }
                        vn2.h hVar = ((vn2.h) aVar2.b()).f290682l;
                        BankAccountSwitchingRequestStatusScreenContract$InputData bankAccountSwitchingRequestStatusScreenContract$InputData = bankAccountSwitchingRequestStatusScreen.K;
                        bankAccountSwitchingRequestStatusScreenContract$InputData.getClass();
                        return new vn2.n(hVar, bankAccountSwitchingRequestStatusScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = BankAccountSwitchingRequestStatusScreen.V;
                        return (h) ((vn2.n) bankAccountSwitchingRequestStatusScreen.S.getValue()).d.get();
                }
            }
        });
        this.T = s.t(this, b.f);
        final int i3 = 2;
        this.U = w.y0(new Function0(this) { // from class: wo2.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BankAccountSwitchingRequestStatusScreen f298866b;

            {
                this.f298866b = this;
            }

            /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                BankAccountSwitchingRequestStatusScreen bankAccountSwitchingRequestStatusScreen = this.f298866b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = BankAccountSwitchingRequestStatusScreen.V;
                        BankAccountSwitchingRequestStatusScreen bankAccountSwitchingRequestStatusScreen2 = this.f298866b;
                        return dli.f.a(bankAccountSwitchingRequestStatusScreen2, bankAccountSwitchingRequestStatusScreen2.d(), v.k(bankAccountSwitchingRequestStatusScreen2.M, new ScrollerDelegate(v.k(new SmallStockCardDelegate(), new ActionCardLoadingDelegate()), false), bankAccountSwitchingRequestStatusScreen2.P, new ProgressStepVerticalLoadingV2Delegate(), new RowLoadingDelegate(), bankAccountSwitchingRequestStatusScreen2.O, bankAccountSwitchingRequestStatusScreen2.Q, bankAccountSwitchingRequestStatusScreen2.N), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = BankAccountSwitchingRequestStatusScreen.V;
                        phm.a aVar = (phm.a) ue0.e.j(bankAccountSwitchingRequestStatusScreen.m2()).a().get(vn2.h.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", vn2.h.class, " is not found"));
                        }
                        vn2.h hVar = ((vn2.h) aVar2.b()).f290682l;
                        BankAccountSwitchingRequestStatusScreenContract$InputData bankAccountSwitchingRequestStatusScreenContract$InputData = bankAccountSwitchingRequestStatusScreen.K;
                        bankAccountSwitchingRequestStatusScreenContract$InputData.getClass();
                        return new vn2.n(hVar, bankAccountSwitchingRequestStatusScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = BankAccountSwitchingRequestStatusScreen.V;
                        return (h) ((vn2.n) bankAccountSwitchingRequestStatusScreen.S.getValue()).d.get();
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, cli.q qVar) {
        a.z0((i) oVar);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController, com.revolut.kompot.navigable.a
    public final boolean F2() {
        ((m) d()).C2(q.f5292a);
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (n) this.S.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.T.getValue(this, V[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarWithToolbar navBarWithToolbar = ((jii.m) value).f174539b;
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.account_switch_status_title, null, null, 14));
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.account_switch_status_title, null, null, 14), null);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.T.getValue(this, V[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((jii.m) value).f174539b.f59410q), null, new wkg.e(this, null, 8), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.N.f53218h), null, new c(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.O.f52371h.f121375b), null, new d(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.P.d.f121375b), null, new wo2.e(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.M.f.f121375b), null, new f(this, null), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: d3, reason: merged with bridge method [inline-methods] */
    public final wo2.h d() {
        return (wo2.h) this.U.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getU() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.R.getValue();
    }
}
