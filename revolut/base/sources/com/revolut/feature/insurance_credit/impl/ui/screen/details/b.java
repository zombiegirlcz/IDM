package com.revolut.feature.insurance_credit.impl.ui.screen.details;

import cli.g;
import cli.y;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.model.Data;
import com.revolut.feature.credit.core.R$string;
import com.revolut.feature.insurance_credit.impl.data.model.action.InsuranceAction;
import com.revolut.feature.insurance_credit.impl.data.model.action.Prompt;
import com.revolut.feature.insurance_credit.impl.data.model.coverages.CoverageDetailsLayout;
import com.revolut.feature.insurance_credit.impl.ui.screen.details.a;
import ffk.t;
import hx7.e;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import mra.d;
import oki.h;
import tq0.j;
import tt7.i;
import tt7.m;
import tt7.n;
import tt7.q;
import vkm.j2;
import vs7.f;
import wli.x;
import xs7.c;
import yji.l;
import zhm.h0;
import zhm.u;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends h implements n {
    public final InsuranceDetailsScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ys7.h f75837p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final tr7.a f75838q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final x f75839r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final t f75840s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final zt7.a f75841t;
    public final com.revolut.kompot.navigable.vc.modal.a u;
    public final y v;

    public b(cli.n stateMapper, InsuranceDetailsScreenContract$InputData inputData, ys7.h detailsRepository, tr7.a copyToClipboardHelper, x deeplinkHandler, t pricingPlanInteractor, zt7.a claimUrlExtractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(detailsRepository, "detailsRepository");
        Intrinsics.checkNotNullParameter(copyToClipboardHelper, "copyToClipboardHelper");
        Intrinsics.checkNotNullParameter(deeplinkHandler, "deeplinkHandler");
        Intrinsics.checkNotNullParameter(pricingPlanInteractor, "pricingPlanInteractor");
        Intrinsics.checkNotNullParameter(claimUrlExtractor, "claimUrlExtractor");
        this.o = inputData;
        this.f75837p = detailsRepository;
        this.f75838q = copyToClipboardHelper;
        this.f75839r = deeplinkHandler;
        this.f75840s = pricingPlanInteractor;
        this.f75841t = claimUrlExtractor;
        this.u = e.a(this, new j(16));
        this.v = d.b(this, new i(new Data(null, null, true, 3, null), null), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        vkm.d dVarA = ys7.h.a(this.f75837p, this.o.f75832a);
        h0 h0Var = h0.f322473a;
        l.a1(this, rd0.e.n(dVarA, h0Var), null, null, new q(this, null, 0), 3);
        l.a1(this, rd0.e.n(rd0.e.b(this.f75840s.q()), h0Var), null, null, new q(this, null, 1), 3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void I2(Object obj2, String listId) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        String str = null;
        Object[] objArr = 0;
        if (obj2 instanceof c) {
            xs7.b bVar = ((c) obj2).f308430b;
            if (bVar != null) {
                if (!(bVar instanceof xs7.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                n2(new tqh.j(this, bVar, objArr == true ? 1 : 0, 8), new whi.b(6));
                return;
            }
            return;
        }
        if (obj2 instanceof ss7.b) {
            ss7.b bVar2 = (ss7.b) obj2;
            if (!(bVar2 instanceof ss7.a)) {
                throw new NoWhenBranchMatchedException();
            }
            ss7.a aVar = (ss7.a) bVar2;
            tr7.a.b(this.f75838q, aVar.f265350b, new TextLocalisedClause(R$string.credit_loan_insurance_details_condition_action_accessibility_label, u.c(aVar.f265349a), null, 12), 2);
            return;
        }
        if (obj2 instanceof InsuranceAction) {
            InsuranceAction insuranceAction = (InsuranceAction) obj2;
            boolean z = insuranceAction.f75760c instanceof InsuranceAction.ActionType.ShowCancellationPrompt;
            InsuranceDetailsScreenContract$InputData insuranceDetailsScreenContract$InputData = this.o;
            if (!z) {
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, "InsuranceDetailsScreenModel", j6.a.q("Called handleInsuranceAction with unknown action - ", insuranceDetailsScreenContract$InputData.f75832a), null, h0Var);
                return;
            }
            Prompt prompt = insuranceAction.d;
            if (prompt != null) {
                C2(new tt7.l(prompt));
                return;
            }
            h0 h0Var2 = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, "InsuranceDetailsScreenModel", j6.a.q("Called ShowCancellationPrompt with no data - ", insuranceDetailsScreenContract$InputData.f75832a), null, h0Var2);
            return;
        }
        if (obj2 instanceof f) {
            C2(a.b.f75835a);
            return;
        }
        if (!(obj2 instanceof us7.a)) {
            if (obj2 instanceof ts7.c) {
                C2(a.c.f75836a);
                return;
            } else {
                if (obj2 instanceof rs7.a) {
                    C2(a.C0506a.f75834a);
                    return;
                }
                return;
            }
        }
        CoverageDetailsLayout coverageDetailsLayout = ((us7.a) obj2).f282829a;
        os7.a aVar2 = (os7.a) ((i) ((j2) this.v.f22677a).getValue()).f274243a.getContent();
        rs7.b bVar3 = aVar2 != null ? aVar2.e : null;
        this.f75841t.getClass();
        rs7.a aVar3 = bVar3 instanceof rs7.a ? (rs7.a) bVar3 : null;
        ts7.b bVar4 = aVar3 != null ? aVar3.f257038a.d : null;
        if (bVar4 instanceof ts7.a) {
            str = ((ts7.a) bVar4).f274041a;
        } else if (bVar4 != null) {
            throw new NoWhenBranchMatchedException();
        }
        C2(new m(coverageDetailsLayout, str));
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.u;
    }

    @Override // cli.z
    public final g getState() {
        return this.v;
    }
}
