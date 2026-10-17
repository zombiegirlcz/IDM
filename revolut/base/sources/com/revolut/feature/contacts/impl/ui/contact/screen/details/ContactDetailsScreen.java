package com.revolut.feature.contacts.impl.ui.contact.screen.details;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.GridBoxDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RectangularButtonDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.SwipeToActionDelegate;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.views.navbar.NavBarLargeCentred;
import com.revolut.feature.contacts.impl.ui.contact.screen.details.ContactDetailsScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dm3.b;
import dm3.c;
import dm3.d;
import dm3.f;
import dm3.i;
import dm3.k;
import efm.r;
import jii.y;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import tx0.n1;
import tx0.o1;
import tx0.p1;
import tx0.q1;
import vc.s;
import vl3.j;
import xki.e;
import zhm.u;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/contacts/impl/ui/contact/screen/details/ContactDetailsScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Ldm3/i;", "Ldli/a;", "Ldm3/k;", "retail_feature_contacts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ContactDetailsScreen extends ViewController<i> implements dli.a {
    public static final /* synthetic */ KProperty[] X = {o0.f186429a.j(new h0(ContactDetailsScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarlargecentredBinding;", 0))};
    public final boolean K;
    public final int L;
    public final Object M;
    public final Object N;
    public final Object O;
    public final Object P;
    public final Object Q;
    public final RectangularButtonDelegate R;
    public final GridBoxDelegate S;
    public final Object T;
    public final h U;
    public final Object V;
    public final Object W;

    public ContactDetailsScreen(ContactDetailsScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = true;
        this.L = R$layout.screen_recycler_navbarlargecentred;
        this.M = w.y0(new dkd.a(20));
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: dm3.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ContactDetailsScreen f115823b;

            {
                this.f115823b = this;
            }

            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                ContactDetailsScreen contactDetailsScreen = this.f115823b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = ContactDetailsScreen.X;
                        return new SwipeToActionDelegate((RowDelegate) contactDetailsScreen.M.getValue(), false);
                    case 1:
                        KProperty[] kPropertyArr2 = ContactDetailsScreen.X;
                        ContactDetailsScreen contactDetailsScreen2 = this.f115823b;
                        return dli.f.a(contactDetailsScreen2, contactDetailsScreen2.R2(), zhm.v.k(new FullScreenStateDelegate(), new RowLoadingDelegate(), new ListSubheaderDelegate(), (LargeActionButtonDelegate) contactDetailsScreen2.Q.getValue(), (RowDelegate) contactDetailsScreen2.M.getValue(), (SwipeToActionDelegate) contactDetailsScreen2.N.getValue(), (CellDetailsDelegate) contactDetailsScreen2.O.getValue(), (CellDetailsChevronDelegate) contactDetailsScreen2.P.getValue(), contactDetailsScreen2.S), R$id.screenRecyclerNavBarLargeCentred_recyclerView, null, new koi.h(null, false, true, 1), null, 40);
                    default:
                        KProperty[] kPropertyArr3 = ContactDetailsScreen.X;
                        return (j) ((vl3.j) contactDetailsScreen.V.getValue()).f290201l.get();
                }
            }
        });
        this.O = w.y0(new dkd.a(21));
        this.P = w.y0(new dkd.a(22));
        this.Q = w.y0(new dkd.a(23));
        RectangularButtonDelegate rectangularButtonDelegate = new RectangularButtonDelegate();
        this.R = rectangularButtonDelegate;
        this.S = new GridBoxDelegate(u.c(rectangularButtonDelegate), 0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14);
        final int i2 = 1;
        this.T = w.y0(new Function0(this) { // from class: dm3.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ContactDetailsScreen f115823b;

            {
                this.f115823b = this;
            }

            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                ContactDetailsScreen contactDetailsScreen = this.f115823b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = ContactDetailsScreen.X;
                        return new SwipeToActionDelegate((RowDelegate) contactDetailsScreen.M.getValue(), false);
                    case 1:
                        KProperty[] kPropertyArr2 = ContactDetailsScreen.X;
                        ContactDetailsScreen contactDetailsScreen2 = this.f115823b;
                        return dli.f.a(contactDetailsScreen2, contactDetailsScreen2.R2(), zhm.v.k(new FullScreenStateDelegate(), new RowLoadingDelegate(), new ListSubheaderDelegate(), (LargeActionButtonDelegate) contactDetailsScreen2.Q.getValue(), (RowDelegate) contactDetailsScreen2.M.getValue(), (SwipeToActionDelegate) contactDetailsScreen2.N.getValue(), (CellDetailsDelegate) contactDetailsScreen2.O.getValue(), (CellDetailsChevronDelegate) contactDetailsScreen2.P.getValue(), contactDetailsScreen2.S), R$id.screenRecyclerNavBarLargeCentred_recyclerView, null, new koi.h(null, false, true, 1), null, 40);
                    default:
                        KProperty[] kPropertyArr3 = ContactDetailsScreen.X;
                        return (j) ((vl3.j) contactDetailsScreen.V.getValue()).f290201l.get();
                }
            }
        });
        this.U = s.t(this, b.f);
        this.V = w.y0(new dgg.b(this, inputData, 4));
        final int i3 = 2;
        this.W = w.y0(new Function0(this) { // from class: dm3.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ContactDetailsScreen f115823b;

            {
                this.f115823b = this;
            }

            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                ContactDetailsScreen contactDetailsScreen = this.f115823b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = ContactDetailsScreen.X;
                        return new SwipeToActionDelegate((RowDelegate) contactDetailsScreen.M.getValue(), false);
                    case 1:
                        KProperty[] kPropertyArr2 = ContactDetailsScreen.X;
                        ContactDetailsScreen contactDetailsScreen2 = this.f115823b;
                        return dli.f.a(contactDetailsScreen2, contactDetailsScreen2.R2(), zhm.v.k(new FullScreenStateDelegate(), new RowLoadingDelegate(), new ListSubheaderDelegate(), (LargeActionButtonDelegate) contactDetailsScreen2.Q.getValue(), (RowDelegate) contactDetailsScreen2.M.getValue(), (SwipeToActionDelegate) contactDetailsScreen2.N.getValue(), (CellDetailsDelegate) contactDetailsScreen2.O.getValue(), (CellDetailsChevronDelegate) contactDetailsScreen2.P.getValue(), contactDetailsScreen2.S), R$id.screenRecyclerNavBarLargeCentred_recyclerView, null, new koi.h(null, false, true, 1), null, 40);
                    default:
                        KProperty[] kPropertyArr3 = ContactDetailsScreen.X;
                        return (j) ((vl3.j) contactDetailsScreen.V.getValue()).f290201l.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        k uiState = (k) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        NavBarLargeCentred navBarLargeCentred = d3().f174576b;
        f fVar = uiState.f115840b;
        TextClause textClause = fVar.f115834a;
        navBarLargeCentred.setToolbarTitle(textClause);
        navBarLargeCentred.setTitle(textClause);
        navBarLargeCentred.setSubtitleText(fVar.f115835b);
        NavBarLargeCentred.setLargeImage$default(navBarLargeCentred, fVar.f115836c, (q1) null, 2, (Object) null);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (j) this.V.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f174576b.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarLargeCentred navBarLargeCentred = d3().f174576b;
        ViewController.P2(this, rd0.e.b(navBarLargeCentred.f59292m), new c(this, null, 0), 3);
        ihm.f fVar = navBarLargeCentred.f59298t;
        r rVarDoFinally = navBarLargeCentred.f59293n.doOnSubscribe(new o1(new n1(navBarLargeCentred, 1), 1)).doFinally(new p1(navBarLargeCentred, 1));
        Intrinsics.checkNotNullExpressionValue(rVarDoFinally, "doFinally(...)");
        r rVarMerge = r.merge(fVar, rVarDoFinally);
        Intrinsics.checkNotNullExpressionValue(rVarMerge, "merge(...)");
        ViewController.P2(this, rd0.e.b(rVarMerge), new c(this, null, 1), 3);
        ViewController.P2(this, rd0.e.b(navBarLargeCentred.F()), new c(this, null, 2), 3);
        ViewController.P2(this, rd0.e.b(((LargeActionButtonDelegate) this.Q.getValue()).d.f121375b), new d(this, null), 3);
        ihm.f fVar2 = this.R.f53149c;
        ihm.f fVar3 = ((CellDetailsChevronDelegate) this.P.getValue()).f51821c;
        ?? r4 = this.M;
        r rVarMerge2 = r.merge(fVar2, fVar3, ((RowDelegate) r4.getValue()).f53225r, ((RowDelegate) r4.getValue()).f53218h);
        Intrinsics.checkNotNullExpressionValue(rVarMerge2, "merge(...)");
        ViewController.P2(this, rd0.e.b(rVarMerge2), new d8j.c(this, (Continuation) null, 23), 3);
    }

    public final y d3() {
        ViewBinding value = this.U.getValue(this, X[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (y) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final dm3.j R2() {
        return (dm3.j) this.W.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.T.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.K);
    }
}
