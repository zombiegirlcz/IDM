package com.revolut.feature_retail_user_declarations.risk_assessment.screen;

import cli.g;
import cli.y;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.user_declarations.shared.R$string;
import com.revolut.feature_retail_user_declarations.risk_assessment.screen.RiskItem;
import java.util.HashSet;
import java.util.Set;
import jch.p;
import jci.e;
import jci.i;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import mra.d;
import oki.h;
import vkm.j2;
import zhm.h0;
import zhm.v;

/* JADX INFO: loaded from: classes10.dex */
public final class c extends h implements b {
    public final y o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f97739p;

    public c(i stateMapper) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = d.b(this, new e(v.k(new RiskItem.Option("PEP", new TextLocalisedClause(R$string.onboarding_risk_assessment_option_pep, null, null, 14), true, new TextLocalisedClause(R$string.onboarding_risk_assessment_option_pep_confirmation_description, null, null, 14), new TextLocalisedClause(R$string.onboarding_risk_assessment_option_pep_info_title, null, null, 14), new TextLocalisedClause(R$string.onboarding_risk_assessment_option_pep_info_description, null, null, 14), new TextLocalisedClause(R$string.onboarding_risk_assessment_option_pep_confirmation_title, null, null, 14)), new RiskItem.Option("SHAREHOLDER_OR_POSITION_IN_RISK_SECTOR", new TextLocalisedClause(R$string.onboarding_risk_assessment_option_risk_sector, null, null, 14), true, new TextLocalisedClause(R$string.onboarding_risk_assessment_option_risk_sector_confirmation_description, null, null, 14), new TextLocalisedClause(R$string.onboarding_risk_assessment_option_risk_sector_info_title, null, null, 14), new TextLocalisedClause(R$string.onboarding_risk_assessment_option_risk_sector_info_description, null, null, 14), new TextLocalisedClause(R$string.onboarding_risk_assessment_option_risk_sector_confirmation_title, null, null, 14)), new RiskItem.None(new TextLocalisedClause(R$string.onboarding_risk_assessment_option_none, null, null, 14))), h0.f322473a, false), stateMapper, null, false, 12);
        this.f97739p = hx7.e.a(this, new p(this, 1));
    }

    public final void I2(RiskItem riskItem) {
        String f97735a = riskItem.getF97735a();
        y yVar = this.o;
        Set set = ((e) ((j2) yVar.f22677a).getValue()).f172816b;
        HashSet hashSet = new HashSet(set);
        if (riskItem instanceof RiskItem.None) {
            hashSet.clear();
        } else {
            if (!(riskItem instanceof RiskItem.Option)) {
                throw new NoWhenBranchMatchedException();
            }
            hashSet.remove("none_option_id");
        }
        if (set.contains(f97735a)) {
            hashSet.remove(f97735a);
        } else {
            hashSet.add(f97735a);
        }
        H2(yVar, new jci.h(hashSet, 0));
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f97739p;
    }

    @Override // cli.z
    public final g getState() {
        return this.o;
    }
}
