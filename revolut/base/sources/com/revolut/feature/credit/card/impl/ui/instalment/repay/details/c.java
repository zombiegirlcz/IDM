package com.revolut.feature.credit.card.impl.ui.instalment.repay.details;

import aw0.t0;
import cli.n;
import cli.y;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.data.model.Data;
import com.revolut.feature.credit.core.R$string;
import knd.g0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import mp.p;
import oki.h;
import om4.r1;
import org.jetbrains.annotations.NotNull;
import ql4.d0;
import ql4.v;
import rd0.e;
import tk9.i;
import w4l.j;
import xjl.g;
import xs4.f;
import xs4.m;
import yji.l;
import zhm.h0;

/* JADX INFO: loaded from: classes22.dex */
public final class c extends h implements xs4.h {

    @NotNull
    public static final m Companion = new m();
    public final CreditCardRepayDetailsControllerScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final al4.m f69489p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final vt4.b f69490q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final j60.a f69491r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final y f69492s;

    public c(CreditCardRepayDetailsControllerScreenContract$InputData inputData, al4.m creditCardInstalmentInteractor, vt4.b creditCardDialogMapper, j60.a bottomExpandableDialogExtension, n stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(creditCardInstalmentInteractor, "creditCardInstalmentInteractor");
        Intrinsics.checkNotNullParameter(creditCardDialogMapper, "creditCardDialogMapper");
        Intrinsics.checkNotNullParameter(bottomExpandableDialogExtension, "bottomExpandableDialogExtension");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f69489p = creditCardInstalmentInteractor;
        this.f69490q = creditCardDialogMapper;
        this.f69491r = bottomExpandableDialogExtension;
        this.f69492s = mra.d.b(this, new f(new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
    }

    public static p I2() {
        return new p("id_credit_card_instalment_repay_details_got_it", new TextLocalisedClause(R$string.credit_common_got_it, null, null, 14), (Object) null);
    }

    public static CellDetailsDelegate.Model J2(dj0.d dVar) {
        return new CellDetailsDelegate.Model("id_credit_card_instalment_repay_details_last_interest", new t0((Clause) new TextLocalisedClause(R$string.credit_card_instalment_repay_details_dialog_item_accrued_interest, null, null, 14), (Image) null, 0, false, 30), sx4.f.b(3, null, null, dVar), null, null, null, null, 0, null, false, false, null, null, 32760);
    }

    public static CellDetailsDelegate.Model K2(dj0.d dVar) {
        return new CellDetailsDelegate.Model("id_credit_card_instalment_repay_details_last_principal", new t0((Clause) new TextLocalisedClause(R$string.credit_card_instalment_repay_details_dialog_item_principal_repayment, null, null, 14), (Image) null, 0, false, 30), sx4.f.b(3, null, null, dVar), null, null, null, null, 0, null, false, false, null, null, 32760);
    }

    @Override // yji.l
    public final void I1() {
        akg.n nVarV;
        CreditCardRepayDetailsControllerScreenContract$InputData creditCardRepayDetailsControllerScreenContract$InputData = this.o;
        v vVar = creditCardRepayDetailsControllerScreenContract$InputData.d;
        String str = creditCardRepayDetailsControllerScreenContract$InputData.f69479b;
        String str2 = creditCardRepayDetailsControllerScreenContract$InputData.f69478a;
        int i = xs4.n.f308408a[vVar.ordinal()];
        Continuation continuation = null;
        j jVar = j.f294644c;
        al4.m mVar = this.f69489p;
        int i2 = 2;
        if (i == 1) {
            final int i3 = 0;
            nVarV = nim.a.v(new g0(((r1) mVar).u(str2, str, jVar), new i(i2, 28, continuation), 1), new Function1(this) { // from class: xs4.l

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ com.revolut.feature.credit.card.impl.ui.instalment.repay.details.c f308407b;

                {
                    this.f308407b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    switch (i3) {
                        case 0:
                            d0 plan = (d0) obj2;
                            Intrinsics.checkNotNullParameter(plan, "plan");
                            return new com.revolut.feature.credit.card.impl.ui.instalment.repay.details.a(this.f308407b.o.f69480c, plan.i, plan.f247106j);
                        default:
                            ql4.q plan2 = (ql4.q) obj2;
                            Intrinsics.checkNotNullParameter(plan2, "plan");
                            return new com.revolut.feature.credit.card.impl.ui.instalment.repay.details.a(this.f308407b.o.f69480c, plan2.f247173w, plan2.f247174x);
                    }
                }
            });
        } else {
            if (i != 2 && i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            final int i5 = 1;
            nVarV = nim.a.v(new g0(((r1) mVar).k(str2, str, jVar), new i(i2, 29, continuation), 1), new Function1(this) { // from class: xs4.l

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ com.revolut.feature.credit.card.impl.ui.instalment.repay.details.c f308407b;

                {
                    this.f308407b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    switch (i5) {
                        case 0:
                            d0 plan = (d0) obj2;
                            Intrinsics.checkNotNullParameter(plan, "plan");
                            return new com.revolut.feature.credit.card.impl.ui.instalment.repay.details.a(this.f308407b.o.f69480c, plan.i, plan.f247106j);
                        default:
                            ql4.q plan2 = (ql4.q) obj2;
                            Intrinsics.checkNotNullParameter(plan2, "plan");
                            return new com.revolut.feature.credit.card.impl.ui.instalment.repay.details.a(this.f308407b.o.f69480c, plan2.f247173w, plan2.f247174x);
                    }
                }
            });
        }
        l.a1(this, e.n(nVarV, h0.f322473a), null, null, new g(this, continuation, 21), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f69492s;
    }
}
