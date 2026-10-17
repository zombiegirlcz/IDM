package mzk;

import a08.s;
import com.revolut.core.extensions.rx.BreadcrumbException;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.retail.feature.trading_onboarding.impl.ui.immediatefamilymember.immediate_family_member_screen.ImmediateFamilyMemberDialogScreen;
import com.revolut.retail.wealth.resources.R$string;
import com.revolut.revolut.feature_fourthline_impl.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ms2.j;
import ofm.h;
import okl.m;
import qfm.r0;
import te0.w;
import xpi.g;
import ypi.i;
import zhm.u;

/* JADX INFO: loaded from: classes12.dex */
public final class d extends pri.b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final g f210811h;
    public final i i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final kzk.a f210812j;
    public final e k;

    public d(g navBarWithToolbarView, i nextButtonView, kzk.a router, e mapper) {
        Intrinsics.checkNotNullParameter(navBarWithToolbarView, "navBarWithToolbarView");
        Intrinsics.checkNotNullParameter(nextButtonView, "nextButtonView");
        Intrinsics.checkNotNullParameter(router, "router");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        this.f210811h = navBarWithToolbarView;
        this.i = nextButtonView;
        this.f210812j = router;
        this.k = mapper;
    }

    @Override // pri.b, pri.e
    public final void h(rri.a aVar) {
        kzk.c view = (kzk.c) aVar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.h(view);
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.wealth_onboarding_sg_affiliation_header, null, null, 14);
        xpi.c cVar = (xpi.c) this.f210811h;
        cVar.n0(textLocalisedClause);
        cVar.e0(Integer.valueOf(R$drawable.uikit_icn_24_cross));
        final int i = 0;
        r0 r0VarD = w.D(cVar.Q(), new Function1(this) { // from class: mzk.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f210808b;

            {
                this.f210808b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                ln.a aVar2;
                Unit it8 = (Unit) obj2;
                switch (i) {
                    case 0:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        aVar2 = this.f210808b.f210812j.f191125a;
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        aVar2 = this.f210808b.f210812j.f191125a;
                        break;
                }
                return m.w(null, null, null, 7, aVar2);
            }
        });
        Function1 function1K = K();
        pfm.a aVar2 = new pfm.a(r0VarD, new s(27, new j(new BreadcrumbException(), 12)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar2, "onErrorResumeNext(...)");
        h hVarW = aVar2.w(new ly7.g(4, function1K), new j7a.j(13, b.f210809a));
        Intrinsics.checkNotNullExpressionValue(hVarW, "subscribe(...)");
        ifm.b bVar = this.f239031a;
        w.j0(bVar, hVarW);
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R.string.common_action_got_it, null, null, 14);
        i iVar = this.i;
        iVar.f(textLocalisedClause2);
        final int i2 = 1;
        r0 r0VarD2 = w.D(iVar.s(), new Function1(this) { // from class: mzk.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f210808b;

            {
                this.f210808b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                ln.a aVar22;
                Unit it8 = (Unit) obj2;
                switch (i2) {
                    case 0:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        aVar22 = this.f210808b.f210812j.f191125a;
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        aVar22 = this.f210808b.f210812j.f191125a;
                        break;
                }
                return m.w(null, null, null, 7, aVar22);
            }
        });
        Function1 function1K2 = K();
        pfm.a aVar3 = new pfm.a(r0VarD2, new s(27, new j(new BreadcrumbException(), 13)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar3, "onErrorResumeNext(...)");
        h hVarW2 = aVar3.w(new ly7.g(4, function1K2), new j7a.j(13, c.f210810a));
        Intrinsics.checkNotNullExpressionValue(hVarW2, "subscribe(...)");
        w.j0(bVar, hVarW2);
        this.k.getClass();
        List listC = u.c(e.f210813a);
        yp0.b.k(listC, 0, 0, 0, 0, 31);
        ((ImmediateFamilyMemberDialogScreen) view).setItems(listC);
    }
}
