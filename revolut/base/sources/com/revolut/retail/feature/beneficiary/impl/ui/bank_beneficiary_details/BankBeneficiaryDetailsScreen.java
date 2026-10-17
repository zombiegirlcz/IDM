package com.revolut.retail.feature.beneficiary.impl.ui.bank_beneficiary_details;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import b3j.r;
import cli.o;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsNoteDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.SwipeToActionDelegate;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.views.navbar.NavBarLargeCentred;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.beneficiary.impl.ui.bank_beneficiary_details.BankBeneficiaryDetailsScreen;
import gul.n;
import h3j.c;
import h3j.d;
import h3j.f;
import h3j.g;
import jii.y;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import tx0.q1;
import vc.s;
import xki.e;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/beneficiary/impl/ui/bank_beneficiary_details/BankBeneficiaryDetailsScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lh3j/h;", "feature_beneficiary_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class BankBeneficiaryDetailsScreen extends ViewController<q> implements dli.a {
    public static final /* synthetic */ KProperty[] V = {o0.f186429a.j(new h0(BankBeneficiaryDetailsScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarlargecentredBinding;", 0))};
    public final int K;
    public final RowDelegate L;
    public final SwipeToActionDelegate M;
    public final LargeActionButtonDelegate N;
    public final CellDetailsChevronDelegate O;
    public final CellDetailsActionDelegate P;
    public final FullScreenStateDelegate Q;
    public final Object R;
    public final h S;
    public final Object T;
    public final Object U;

    public BankBeneficiaryDetailsScreen(BankBeneficiaryDetailsScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = R$layout.screen_recycler_navbarlargecentred;
        RowDelegate rowDelegate = new RowDelegate(null, null, 7);
        this.L = rowDelegate;
        this.M = new SwipeToActionDelegate(rowDelegate, false);
        this.N = new LargeActionButtonDelegate();
        this.O = new CellDetailsChevronDelegate();
        this.P = new CellDetailsActionDelegate();
        this.Q = new FullScreenStateDelegate();
        final int i = 0;
        this.R = w.y0(new Function0(this) { // from class: h3j.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BankBeneficiaryDetailsScreen f149137b;

            {
                this.f149137b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        KProperty[] kPropertyArr = BankBeneficiaryDetailsScreen.V;
                        BankBeneficiaryDetailsScreen bankBeneficiaryDetailsScreen = this.f149137b;
                        return dli.f.a(bankBeneficiaryDetailsScreen, (g) bankBeneficiaryDetailsScreen.U.getValue(), zhm.v.k(bankBeneficiaryDetailsScreen.L, bankBeneficiaryDetailsScreen.M, bankBeneficiaryDetailsScreen.O, bankBeneficiaryDetailsScreen.P, bankBeneficiaryDetailsScreen.N, bankBeneficiaryDetailsScreen.Q, new RowLoadingDelegate(), new ListSubheaderDelegate(), new CellDetailsDelegate(), new CellDetailsNoteDelegate()), R$id.screenRecyclerNavBarLargeCentred_recyclerView, null, new koi.h(null, false, true, 1), null, 40);
                    default:
                        KProperty[] kPropertyArr2 = BankBeneficiaryDetailsScreen.V;
                        return (g) ((b3j.r) this.f149137b.T.getValue()).e.get();
                }
            }
        });
        this.S = s.t(this, h3j.b.f);
        this.T = w.y0(new h1k.a(this, inputData, 6));
        final int i2 = 1;
        this.U = w.y0(new Function0(this) { // from class: h3j.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BankBeneficiaryDetailsScreen f149137b;

            {
                this.f149137b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = BankBeneficiaryDetailsScreen.V;
                        BankBeneficiaryDetailsScreen bankBeneficiaryDetailsScreen = this.f149137b;
                        return dli.f.a(bankBeneficiaryDetailsScreen, (g) bankBeneficiaryDetailsScreen.U.getValue(), zhm.v.k(bankBeneficiaryDetailsScreen.L, bankBeneficiaryDetailsScreen.M, bankBeneficiaryDetailsScreen.O, bankBeneficiaryDetailsScreen.P, bankBeneficiaryDetailsScreen.N, bankBeneficiaryDetailsScreen.Q, new RowLoadingDelegate(), new ListSubheaderDelegate(), new CellDetailsDelegate(), new CellDetailsNoteDelegate()), R$id.screenRecyclerNavBarLargeCentred_recyclerView, null, new koi.h(null, false, true, 1), null, 40);
                    default:
                        KProperty[] kPropertyArr2 = BankBeneficiaryDetailsScreen.V;
                        return (g) ((b3j.r) this.f149137b.T.getValue()).e.get();
                }
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v3, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        h3j.h uiState = (h3j.h) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        NavBarLargeCentred navBarLargeCentred = d3().f174576b;
        f fVar = uiState.f149156b;
        if (fVar != null) {
            TextClause textClause = fVar.f149148a;
            navBarLargeCentred.setToolbarTitle(textClause);
            navBarLargeCentred.setTitle(textClause);
            NavBarLargeCentred.setLargeImage$default(navBarLargeCentred, fVar.f149150c, (q1) null, 2, (Object) null);
            navBarLargeCentred.setDescriptionText(fVar.f149149b);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (r) this.T.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (g) this.U.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f174576b.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f174576b.C()), new c(this, null, 0), 3);
        ihm.f fVar = this.O.f51821c;
        RowDelegate rowDelegate = this.L;
        efm.r rVarMerge = efm.r.merge(fVar, rowDelegate.f53225r, rowDelegate.f53218h, this.N.d.f121375b);
        Intrinsics.checkNotNullExpressionValue(rVarMerge, "merge(...)");
        ViewController.P2(this, rd0.e.b(rVarMerge), new n(this, null, 16), 3);
        ViewController.P2(this, rd0.e.b(this.P.d), new d(this, null), 3);
        ViewController.P2(this, rd0.e.b(d3().f174576b.f59292m), new c(this, null, 1), 3);
    }

    public final y d3() {
        ViewBinding value = this.S.getValue(this, V[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (y) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.R.getValue();
    }
}
