package com.revolut.retail.feature.payments.money_request.impl.ui_kompot.details;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import au0.b1;
import au0.r0;
import au0.s0;
import au0.z0;
import aw0.k;
import cli.o;
import com.revolut.core.ui_kit.delegates.CellDetailsActionableIconDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsAttachmentDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsNoteDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsPhotoDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.IconDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.avatar.AvatarModel;
import com.revolut.core.ui_kit.views.navbar.NavBarWithBigTile;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.payments.money_request.impl.R$id;
import com.revolut.retail.feature.payments.money_request.impl.R$layout;
import com.revolut.retail.feature.payments.money_request.impl.ui_kompot.details.MoneyRequestDetailsContract$InputData;
import com.revolut.retail.feature.payments.money_request.impl.ui_kompot.details.MoneyRequestDetailsNewScreen;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import org.jmrtd.lds.LDSFile;
import te0.w;
import tki.c;
import tx0.p2;
import vc.s;
import z6k.d;
import z6k.e;
import z6k.f;
import z6k.g;
import z6k.r;
import z6k.t;
import z6k.u;
import z6k.v;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/payments/money_request/impl/ui_kompot/details/MoneyRequestDetailsNewScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ltki/c;", "Lz6k/h;", "feature_payments_money_request_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class MoneyRequestDetailsNewScreen extends ViewController<q> implements c {
    public static final /* synthetic */ KProperty[] X = {o0.f186429a.j(new h0(MoneyRequestDetailsNewScreen.class, "binding", "getBinding()Lcom/revolut/retail/feature/payments/money_request/impl/databinding/ScreenMoneyRequestDetailsNewBinding;", 0))};
    public final MoneyRequestDetailsContract$InputData K;
    public final h L;
    public final CellDetailsDelegate M;
    public final CellDetailsChevronDelegate N;
    public final CellDetailsPhotoDelegate O;
    public final FullScreenStateDelegate P;
    public final RowDelegate Q;
    public final CellDetailsAttachmentDelegate R;
    public final boolean S;
    public final int T;
    public final Object U;
    public final Object V;
    public final Object W;

    public MoneyRequestDetailsNewScreen(MoneyRequestDetailsContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = s.t(this, z6k.q.f);
        this.M = new CellDetailsDelegate();
        this.N = new CellDetailsChevronDelegate();
        this.O = new CellDetailsPhotoDelegate();
        this.P = new FullScreenStateDelegate();
        this.Q = new RowDelegate(null, null, 7);
        this.R = new CellDetailsAttachmentDelegate();
        this.S = true;
        this.T = R$layout.screen_money_request_details_new;
        final int i = 0;
        this.U = w.y0(new Function0(this) { // from class: z6k.p

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MoneyRequestDetailsNewScreen f319806b;

            {
                this.f319806b = this;
            }

            /* JADX WARN: Type inference failed for: r1v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                MoneyRequestDetailsNewScreen moneyRequestDetailsNewScreen = this.f319806b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = MoneyRequestDetailsNewScreen.X;
                        phm.a aVar = (phm.a) ue0.e.j(moneyRequestDetailsNewScreen.m2()).a().get(t6k.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", t6k.e.class, " is not found"));
                        }
                        t6k.c cVar = ((t6k.c) aVar2.b()).f268376n;
                        MoneyRequestDetailsContract$InputData moneyRequestDetailsContract$InputData = moneyRequestDetailsNewScreen.K;
                        moneyRequestDetailsContract$InputData.getClass();
                        return new t6k.b(cVar, moneyRequestDetailsNewScreen, moneyRequestDetailsContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = MoneyRequestDetailsNewScreen.X;
                        return (g) ((t6k.b) moneyRequestDetailsNewScreen.U.getValue()).f268367l.get();
                    default:
                        KProperty[] kPropertyArr3 = MoneyRequestDetailsNewScreen.X;
                        MoneyRequestDetailsNewScreen moneyRequestDetailsNewScreen2 = this.f319806b;
                        return tki.g.a(moneyRequestDetailsNewScreen2, moneyRequestDetailsNewScreen2.R2(), zhm.v.k(new CellDetailsActionableIconDelegate(), moneyRequestDetailsNewScreen2.R, moneyRequestDetailsNewScreen2.M, new CellDetailsNoteDelegate(), new ListSubheaderDelegate(), new RowLoadingDelegate(), new IconDelegate(), moneyRequestDetailsNewScreen2.N, moneyRequestDetailsNewScreen2.O, moneyRequestDetailsNewScreen2.P, moneyRequestDetailsNewScreen2.Q), R$id.mrDetailsNew_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.V = w.y0(new Function0(this) { // from class: z6k.p

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MoneyRequestDetailsNewScreen f319806b;

            {
                this.f319806b = this;
            }

            /* JADX WARN: Type inference failed for: r1v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                MoneyRequestDetailsNewScreen moneyRequestDetailsNewScreen = this.f319806b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = MoneyRequestDetailsNewScreen.X;
                        phm.a aVar = (phm.a) ue0.e.j(moneyRequestDetailsNewScreen.m2()).a().get(t6k.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", t6k.e.class, " is not found"));
                        }
                        t6k.c cVar = ((t6k.c) aVar2.b()).f268376n;
                        MoneyRequestDetailsContract$InputData moneyRequestDetailsContract$InputData = moneyRequestDetailsNewScreen.K;
                        moneyRequestDetailsContract$InputData.getClass();
                        return new t6k.b(cVar, moneyRequestDetailsNewScreen, moneyRequestDetailsContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = MoneyRequestDetailsNewScreen.X;
                        return (g) ((t6k.b) moneyRequestDetailsNewScreen.U.getValue()).f268367l.get();
                    default:
                        KProperty[] kPropertyArr3 = MoneyRequestDetailsNewScreen.X;
                        MoneyRequestDetailsNewScreen moneyRequestDetailsNewScreen2 = this.f319806b;
                        return tki.g.a(moneyRequestDetailsNewScreen2, moneyRequestDetailsNewScreen2.R2(), zhm.v.k(new CellDetailsActionableIconDelegate(), moneyRequestDetailsNewScreen2.R, moneyRequestDetailsNewScreen2.M, new CellDetailsNoteDelegate(), new ListSubheaderDelegate(), new RowLoadingDelegate(), new IconDelegate(), moneyRequestDetailsNewScreen2.N, moneyRequestDetailsNewScreen2.O, moneyRequestDetailsNewScreen2.P, moneyRequestDetailsNewScreen2.Q), R$id.mrDetailsNew_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i3 = 2;
        this.W = w.y0(new Function0(this) { // from class: z6k.p

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MoneyRequestDetailsNewScreen f319806b;

            {
                this.f319806b = this;
            }

            /* JADX WARN: Type inference failed for: r1v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                MoneyRequestDetailsNewScreen moneyRequestDetailsNewScreen = this.f319806b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = MoneyRequestDetailsNewScreen.X;
                        phm.a aVar = (phm.a) ue0.e.j(moneyRequestDetailsNewScreen.m2()).a().get(t6k.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", t6k.e.class, " is not found"));
                        }
                        t6k.c cVar = ((t6k.c) aVar2.b()).f268376n;
                        MoneyRequestDetailsContract$InputData moneyRequestDetailsContract$InputData = moneyRequestDetailsNewScreen.K;
                        moneyRequestDetailsContract$InputData.getClass();
                        return new t6k.b(cVar, moneyRequestDetailsNewScreen, moneyRequestDetailsContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = MoneyRequestDetailsNewScreen.X;
                        return (g) ((t6k.b) moneyRequestDetailsNewScreen.U.getValue()).f268367l.get();
                    default:
                        KProperty[] kPropertyArr3 = MoneyRequestDetailsNewScreen.X;
                        MoneyRequestDetailsNewScreen moneyRequestDetailsNewScreen2 = this.f319806b;
                        return tki.g.a(moneyRequestDetailsNewScreen2, moneyRequestDetailsNewScreen2.R2(), zhm.v.k(new CellDetailsActionableIconDelegate(), moneyRequestDetailsNewScreen2.R, moneyRequestDetailsNewScreen2.M, new CellDetailsNoteDelegate(), new ListSubheaderDelegate(), new RowLoadingDelegate(), new IconDelegate(), moneyRequestDetailsNewScreen2.N, moneyRequestDetailsNewScreen2.O, moneyRequestDetailsNewScreen2.P, moneyRequestDetailsNewScreen2.Q), R$id.mrDetailsNew_recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        z6k.h uiState = (z6k.h) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        NavBarWithBigTile mrDetailsNewNavBarWithToolbar = d3().f212835b;
        Intrinsics.checkNotNullExpressionValue(mrDetailsNewNavBarWithToolbar, "mrDetailsNewNavBarWithToolbar");
        f fVar = uiState.f319791b;
        if (fVar instanceof e) {
            mrDetailsNewNavBarWithToolbar.setLoadingState(true);
            return;
        }
        if (fVar instanceof d) {
            mrDetailsNewNavBarWithToolbar.setLoadingState(false);
            return;
        }
        if (!(fVar instanceof z6k.c)) {
            throw new NoWhenBranchMatchedException();
        }
        mrDetailsNewNavBarWithToolbar.setLoadingState(false);
        z6k.c cVar = (z6k.c) fVar;
        MoneyClause moneyClause = cVar.f319784a;
        mrDetailsNewNavBarWithToolbar.setToolbarTitle(moneyClause);
        mrDetailsNewNavBarWithToolbar.setTitle(new z0(moneyClause, false));
        Clause clause = cVar.f319785b;
        mrDetailsNewNavBarWithToolbar.setActionStatusLabel(clause != null ? new k(6, clause, null, false) : null);
        mrDetailsNewNavBarWithToolbar.setDescription(new au0.o0(cVar.f319786c));
        mrDetailsNewNavBarWithToolbar.setActions(cVar.f);
        mrDetailsNewNavBarWithToolbar.setAvatar(new AvatarModel.Default(cVar.d, null, null, null, new AvatarModel.BadgeModel(cVar.e, com.revolut.core.ui_kit.models.avatar.b.BOTTOM), null, LDSFile.EF_DG14_TAG), r0.DEFAULT);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (t6k.b) this.U.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithBigTile navBarWithBigTile = d3().f212835b;
        navBarWithBigTile.setLayoutType(s0.CENTERED_SMALL_BUTTONS);
        navBarWithBigTile.setTitleStyle(b1.LARGE_SINGLE_LINE);
        navBarWithBigTile.setNavigationButtonIcon(new ResourceImage(ofm.q.k(q2()), (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
        navBarWithBigTile.setHeightMode(p2.f275222a);
        navBarWithBigTile.setIconClickable(false);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f212835b.f59357t), new r(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().f212835b.K()), new z6k.s(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.P.f52371h.f121375b), new t(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.Q.f53218h), new u(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.O.f51886c), new r(this, null, 1), 3);
        ViewController.P2(this, rd0.e.b(this.N.f51821c), new v(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.R.f51808c), new yy6.f(this, null, 14), 3);
        ViewController.P2(this, rd0.e.b(this.M.e), new z6k.w(this, null), 3);
    }

    public final n6k.b d3() {
        ViewBinding value = this.L.getValue(this, X[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (n6k.b) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final g R2() {
        return (g) this.V.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getT() {
        return this.T;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (tki.a) this.W.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.S);
    }
}
