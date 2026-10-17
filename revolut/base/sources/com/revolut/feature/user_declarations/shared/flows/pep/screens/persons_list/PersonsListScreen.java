package com.revolut.feature.user_declarations.shared.flows.pep.screens.persons_list;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.user_declarations.shared.flows.pep.screens.persons_list.PersonsListScreen;
import com.revolut.feature.user_declarations.shared.flows.pep.screens.persons_list.PersonsListScreenContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.shared.feature.user_declarations.api.R$string;
import jii.u;
import kji.f;
import kog.c;
import kog.d;
import kog.g;
import kog.i;
import kog.j;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import nng.l;
import nng.p;
import te0.w;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00050\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/user_declarations/shared/flows/pep/screens/persons_list/PersonsListScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lcom/revolut/feature/user_declarations/shared/flows/pep/screens/persons_list/a;", "Lkji/f;", "Ldli/a;", "Lkog/j;", "feature_user_declarations_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PersonsListScreen extends ViewController<a> implements f, dli.a {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(PersonsListScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final PersonsListScreenContract$InputData K;
    public final int L;
    public final h M;
    public final RowDelegate N;
    public final ListSubheaderDelegate O;
    public final Object P;
    public final Object Q;
    public final Object R;

    public PersonsListScreen(PersonsListScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar_nextbutton;
        this.M = s.t(this, c.f);
        this.N = new RowDelegate(null, null, 7);
        this.O = new ListSubheaderDelegate();
        final int i = 0;
        this.P = w.y0(new Function0(this) { // from class: kog.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PersonsListScreen f186356b;

            {
                this.f186356b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                PersonsListScreen personsListScreen = this.f186356b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = PersonsListScreen.S;
                        qji.b bVarU2 = personsListScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.user_declarations.shared.flows.pep.screens.persons_list.di.PersonsListScreenInjector");
                        nng.j jVar = (nng.j) bVarU2;
                        p pVar = jVar.f217658b;
                        nng.j jVar2 = jVar.f217659c;
                        PersonsListScreenContract$InputData personsListScreenContract$InputData = personsListScreen.K;
                        personsListScreenContract$InputData.getClass();
                        return new nng.l(pVar, jVar2, personsListScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = PersonsListScreen.S;
                        return (i) ((nng.l) personsListScreen.P.getValue()).f217664b.get();
                    default:
                        KProperty[] kPropertyArr3 = PersonsListScreen.S;
                        PersonsListScreen personsListScreen2 = this.f186356b;
                        return dli.f.a(personsListScreen2, personsListScreen2.R2(), v.k(personsListScreen2.N, personsListScreen2.O, new RowLoadingDelegate(), new FullScreenStateDelegate()), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.Q = w.y0(new Function0(this) { // from class: kog.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PersonsListScreen f186356b;

            {
                this.f186356b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                PersonsListScreen personsListScreen = this.f186356b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PersonsListScreen.S;
                        qji.b bVarU2 = personsListScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.user_declarations.shared.flows.pep.screens.persons_list.di.PersonsListScreenInjector");
                        nng.j jVar = (nng.j) bVarU2;
                        p pVar = jVar.f217658b;
                        nng.j jVar2 = jVar.f217659c;
                        PersonsListScreenContract$InputData personsListScreenContract$InputData = personsListScreen.K;
                        personsListScreenContract$InputData.getClass();
                        return new nng.l(pVar, jVar2, personsListScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = PersonsListScreen.S;
                        return (i) ((nng.l) personsListScreen.P.getValue()).f217664b.get();
                    default:
                        KProperty[] kPropertyArr3 = PersonsListScreen.S;
                        PersonsListScreen personsListScreen2 = this.f186356b;
                        return dli.f.a(personsListScreen2, personsListScreen2.R2(), v.k(personsListScreen2.N, personsListScreen2.O, new RowLoadingDelegate(), new FullScreenStateDelegate()), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        final int i3 = 2;
        this.R = w.y0(new Function0(this) { // from class: kog.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PersonsListScreen f186356b;

            {
                this.f186356b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                PersonsListScreen personsListScreen = this.f186356b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PersonsListScreen.S;
                        qji.b bVarU2 = personsListScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.user_declarations.shared.flows.pep.screens.persons_list.di.PersonsListScreenInjector");
                        nng.j jVar = (nng.j) bVarU2;
                        p pVar = jVar.f217658b;
                        nng.j jVar2 = jVar.f217659c;
                        PersonsListScreenContract$InputData personsListScreenContract$InputData = personsListScreen.K;
                        personsListScreenContract$InputData.getClass();
                        return new nng.l(pVar, jVar2, personsListScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = PersonsListScreen.S;
                        return (i) ((nng.l) personsListScreen.P.getValue()).f217664b.get();
                    default:
                        KProperty[] kPropertyArr3 = PersonsListScreen.S;
                        PersonsListScreen personsListScreen2 = this.f186356b;
                        return dli.f.a(personsListScreen2, personsListScreen2.R2(), v.k(personsListScreen2.N, personsListScreen2.O, new RowLoadingDelegate(), new FullScreenStateDelegate()), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        j uiState = (j) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        navBarWithToolbar.setTitle(uiState.f186358a, null);
        navBarWithToolbar.setDescriptionText(uiState.f186359b);
        navBarWithToolbar.setDescriptionVisible(true);
        if (this.K.f94665b) {
            navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        }
        d3().f174564b.setEnabled(uiState.f186360c);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (l) this.P.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        RowDelegate rowDelegate = this.N;
        ViewController.P2(this, rd0.e.b(rowDelegate.f53218h), new d(this, null), 3);
        ViewController.P2(this, rd0.e.b(rowDelegate.k), new kog.e(this, null), 3);
        ViewController.P2(this, rd0.e.b(d3().f174564b.o), new kog.f(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().f174565c.f59410q), new kog.f(this, null, 1), 3);
        ViewController.P2(this, rd0.e.b(this.O.f52707c), new g(this, null), 3);
        d3().f174564b.setText(new TextLocalisedClause(R$string.pep_close_connection_home_cta, null, null, 14));
        d3().f174564b.setLoadingButtonTag("PEP_PERSONS_LIST_CONTINUE_BUTTON");
        ViewController.P2(this, rd0.e.b(d3().f174565c.p0()), new kog.f(this, null, 2), 3);
    }

    public final u d3() {
        ViewBinding value = this.M.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (u) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final i R2() {
        return (i) this.Q.getValue();
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
