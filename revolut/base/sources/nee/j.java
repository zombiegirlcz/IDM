package nee;

import com.revolut.core.extensions.rx.BreadcrumbException;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.TextNavBarMenuItem;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.support.impl.R$string;
import com.revolut.feature.support.impl.ui.troubleshooting.carddelivery.details.DetailsStepFragment;
import com.revolut.retail.core.navigation.FragmentDestination;
import com.revolut.retail.core.navigation.FragmentNavigateCommand;
import efm.r;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import nb6.p;
import org.jetbrains.annotations.NotNull;
import sri.m;
import te0.w;
import zhm.u;

/* JADX INFO: loaded from: classes8.dex */
public final class j extends pri.b implements b {

    @NotNull
    private static final i Companion = new i();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final c f214496h;
    public final m i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final tri.c f214497j;
    public final xpi.g k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final uce.c f214498l;

    public j(c router, m navigator, tri.c backButtonView, xpi.g navBarWithToolbarView, uce.c neverReceivedCardMode) {
        Intrinsics.checkNotNullParameter(router, "router");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(backButtonView, "backButtonView");
        Intrinsics.checkNotNullParameter(navBarWithToolbarView, "navBarWithToolbarView");
        Intrinsics.checkNotNullParameter(neverReceivedCardMode, "neverReceivedCardMode");
        this.f214496h = router;
        this.i = navigator;
        this.f214497j = backButtonView;
        this.k = navBarWithToolbarView;
        this.f214498l = neverReceivedCardMode;
    }

    @Override // pri.b, pri.e
    public final void h(rri.a aVar) {
        e view = (e) aVar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.h(view);
        l lVar = (l) this.f214496h;
        r rVarHide = lVar.f214500b.hide();
        Intrinsics.checkNotNullExpressionValue(rVarHide, "hide(...)");
        p pVar = new p(1, this.i, m.class, "navigate", "navigate(Lcom/revolut/retail/core/navigation/NaviCommand;)V", 0, 5);
        Function1 function1K = K();
        Function0 function0J = J();
        r rVarOnErrorResumeNext = rVarHide.onErrorResumeNext(new ly7.g(7, new ne0.e(new BreadcrumbException(), 1)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe = rVarOnErrorResumeNext.subscribe(new n1i.b(2, pVar), new n1i.b(2, function1K), new j7a.j(19, function0J));
        ifm.b bVar = this.f239031a;
        w.j0(bVar, cVarSubscribe);
        Intrinsics.h(cVarSubscribe);
        lVar.f214500b.onNext(new FragmentNavigateCommand(new FragmentDestination(DetailsStepFragment.class), null, false, 2030));
        ihm.f fVar = this.f214497j.f273801b;
        final int i = 0;
        Function1 function1 = new Function1(this) { // from class: nee.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ j f214495b;

            {
                this.f214495b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i) {
                    case 0:
                        Unit it8 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        ((l) this.f214495b.f214496h).b();
                        break;
                    case 1:
                        ((l) this.f214495b.f214496h).b();
                        break;
                    default:
                        String listId = (String) obj2;
                        Intrinsics.checkNotNullParameter(listId, "listId");
                        if (Intrinsics.f(listId, "navbar_done_button_id")) {
                            ((l) this.f214495b.f214496h).b();
                        }
                        break;
                }
                return Unit.f186387a;
            }
        };
        Function1 function1K2 = K();
        Function0 function0J2 = J();
        r rVarOnErrorResumeNext2 = fVar.onErrorResumeNext(new ly7.g(7, new ne0.e(new BreadcrumbException(), 2)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext2, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe2 = rVarOnErrorResumeNext2.subscribe(new n1i.b(2, function1), new n1i.b(2, function1K2), new j7a.j(19, function0J2));
        w.j0(bVar, cVarSubscribe2);
        Intrinsics.h(cVarSubscribe2);
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.delivery_details_header, null, null, 14);
        xpi.c cVar = (xpi.c) this.k;
        cVar.n0(textLocalisedClause);
        cVar.e0(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        efm.k kVarFirstElement = cVar.Q().firstElement();
        Intrinsics.checkNotNullExpressionValue(kVarFirstElement, "firstElement(...)");
        final int i2 = 1;
        Function1 function12 = new Function1(this) { // from class: nee.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ j f214495b;

            {
                this.f214495b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i2) {
                    case 0:
                        Unit it8 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        ((l) this.f214495b.f214496h).b();
                        break;
                    case 1:
                        ((l) this.f214495b.f214496h).b();
                        break;
                    default:
                        String listId = (String) obj2;
                        Intrinsics.checkNotNullParameter(listId, "listId");
                        if (Intrinsics.f(listId, "navbar_done_button_id")) {
                            ((l) this.f214495b.f214496h).b();
                        }
                        break;
                }
                return Unit.f186387a;
            }
        };
        Function1 function1K3 = K();
        Function0 function0J3 = J();
        ly7.g gVar = new ly7.g(7, new ne0.e(new BreadcrumbException(), 3));
        kVarFirstElement.getClass();
        rfm.m mVar = new rfm.m(kVarFirstElement, gVar, 2);
        Intrinsics.checkNotNullExpressionValue(mVar, "onErrorResumeNext(...)");
        rfm.b bVar2 = new rfm.b(new n1i.b(2, function12), new n1i.b(2, function1K3), new j7a.j(19, function0J3));
        mVar.i(bVar2);
        Intrinsics.checkNotNullExpressionValue(bVar2, "subscribe(...)");
        w.j0(bVar, bVar2);
        if (this.f214498l == uce.c.REORDER_CARD) {
            cVar.d0(u.c(new TextNavBarMenuItem("navbar_done_button_id", new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_done, null, new Custom(Integer.valueOf(R$attr.uikit_colorAccent), false, null, false, null, 254), 10), null, null, 12)));
            r rVarB = cVar.b();
            final int i3 = 2;
            Function1 function13 = new Function1(this) { // from class: nee.h

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ j f214495b;

                {
                    this.f214495b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    switch (i3) {
                        case 0:
                            Unit it8 = (Unit) obj2;
                            Intrinsics.checkNotNullParameter(it8, "it");
                            ((l) this.f214495b.f214496h).b();
                            break;
                        case 1:
                            ((l) this.f214495b.f214496h).b();
                            break;
                        default:
                            String listId = (String) obj2;
                            Intrinsics.checkNotNullParameter(listId, "listId");
                            if (Intrinsics.f(listId, "navbar_done_button_id")) {
                                ((l) this.f214495b.f214496h).b();
                            }
                            break;
                    }
                    return Unit.f186387a;
                }
            };
            Function1 function1K4 = K();
            Function0 function0J4 = J();
            r rVarOnErrorResumeNext3 = rVarB.onErrorResumeNext(new ly7.g(7, new ne0.e(new BreadcrumbException(), 4)));
            Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext3, "onErrorResumeNext(...)");
            ifm.c cVarSubscribe3 = rVarOnErrorResumeNext3.subscribe(new n1i.b(2, function13), new n1i.b(2, function1K4), new j7a.j(19, function0J4));
            w.j0(bVar, cVarSubscribe3);
            Intrinsics.h(cVarSubscribe3);
        }
    }
}
