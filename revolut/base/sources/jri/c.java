package jri;

import b60.g;
import b60.i;
import com.google.common.collect.ImmutableMap;
import iri.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import lp.q1;
import lp.s1;
import zhm.d0;

/* JADX INFO: loaded from: classes13.dex */
public final class c implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gf0.a f178018a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.revolut.analytics.tracking.v3.d f178019b;

    public c(gf0.a appDeclaration, com.revolut.analytics.tracking.v3.d tracker) {
        Intrinsics.checkNotNullParameter(appDeclaration, "appDeclaration");
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        this.f178018a = appDeclaration;
        this.f178019b = tracker;
    }

    @Override // iri.h
    public final hri.a u1(Object obj2, String flowName) {
        Intrinsics.checkNotNullParameter(flowName, "flowName");
        ((com.revolut.analytics.tracking.v3.f) this.f178019b).h(flowName);
        q1 q1Var = (q1) this.f178018a;
        ImmutableMap immutableMapOf = ImmutableMap.of("TRANSFER_OUT_FLOW", q1Var.k.f197487a.w6);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it8 = immutableMapOf.entrySet().iterator();
        while (it8.hasNext()) {
            Map.Entry entry = (Map.Entry) it8.next();
            if (a0.H(flowName, (String) entry.getKey(), false)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Map.Entry entry2 = (Map.Entry) d0.c0(linkedHashMap.entrySet());
        phm.a aVar = entry2 != null ? (phm.a) entry2.getValue() : null;
        if (aVar != null) {
            ArrayList arrayList = i.f12527a;
            i.a("Create Flow from framework with custom name ".concat(flowName));
            return ((waf.f) ((g) aVar.get())).a(obj2, flowName);
        }
        if (obj2 != null) {
            throw new IllegalStateException(p.a.p("Parameterised Flow factory with name ", flowName, " is not found"));
        }
        s1 s1Var = q1Var.k.f197487a;
        s1Var.getClass();
        ImmutableMap.Builder builderBuilderWithExpectedSize = ImmutableMap.builderWithExpectedSize(48);
        builderBuilderWithExpectedSize.put("KOMPOT_LAUNCHER_FLOW", s1Var.v5);
        builderBuilderWithExpectedSize.put("REMOTE_STORIES_FLOW", s1Var.w5);
        builderBuilderWithExpectedSize.put("TRANSACTION_BREAKDOWN", s1Var.x5);
        builderBuilderWithExpectedSize.put("TRADING_ONBOARDING_START_FLOW", s1Var.y5);
        builderBuilderWithExpectedSize.put("TRADING_ONBOARDING_NEXT_HELPER_FLOW", s1Var.f198879z5);
        builderBuilderWithExpectedSize.put("TRADING_ONBOARDING_SURVEY_FLOW", s1Var.A5);
        builderBuilderWithExpectedSize.put("TRADING_ONBOARDING_ROBO_RISK_SURVEY_FLOW", s1Var.B5);
        builderBuilderWithExpectedSize.put("TRADING_ONBOARDING_ROBO_SURVEY_FLOW", s1Var.C5);
        builderBuilderWithExpectedSize.put("TRADING_ONBOARDING_RISK_DISCLOSURE_SIGNED_FLOW", s1Var.D5);
        builderBuilderWithExpectedSize.put("TRADING_ONBOARDING_W8BEN_FLOW", s1Var.E5);
        builderBuilderWithExpectedSize.put("TRADING_ONBOARDING_COMPLEX_BONDS_SURVEY_FLOW", s1Var.F5);
        builderBuilderWithExpectedSize.put("TRADING_ONBOARDING_COMPLEX_BONDS_COOLDOWN_FLOW", s1Var.G5);
        builderBuilderWithExpectedSize.put("TRADING_ONBOARDING_ACKNOWLEDGEMENTS_FLOW", s1Var.H5);
        builderBuilderWithExpectedSize.put("TRADING_ONBOARDING_COMPLETED", s1Var.I5);
        builderBuilderWithExpectedSize.put("TRADING_ONBOARDING_NATIONAL_IDENTIFIERS_FLOW", s1Var.J5);
        builderBuilderWithExpectedSize.put("TRADING_IMMEDIATE_FAMILY_MEMBER_FLOW", s1Var.K5);
        builderBuilderWithExpectedSize.put("TRADING_ONBOARDING_EXTENDED_HOURS_FLOW", s1Var.L5);
        builderBuilderWithExpectedSize.put("TRADING_ONBOARDING_MARGIN_SURVEY_FLOW", s1Var.M5);
        builderBuilderWithExpectedSize.put("TRADING_ONBOARDING_OTP_FLOW", s1Var.N5);
        builderBuilderWithExpectedSize.put("TRADING_ONBOARDING_COMPLEX_ETP_SURVEY_FLOW", s1Var.O5);
        builderBuilderWithExpectedSize.put("LIMITS_PROMPT_FLOW", s1Var.P5);
        builderBuilderWithExpectedSize.put("EMAIL_VERIFICATION_FLOW", s1Var.Q5);
        builderBuilderWithExpectedSize.put("PROFILE_CONFIRMATION_FLOW", s1Var.R5);
        builderBuilderWithExpectedSize.put("SET_UP_PDA_FLOW", s1Var.S5);
        builderBuilderWithExpectedSize.put("BALANCE_PICKER_FLOW", s1Var.T5);
        builderBuilderWithExpectedSize.put("STOCK_LENDING_ONBOARDING", s1Var.U5);
        builderBuilderWithExpectedSize.put("SELF_SERVE_SOW_FLOW", s1Var.V5);
        builderBuilderWithExpectedSize.put("SELF_SERVE_SOT_FLOW", s1Var.W5);
        builderBuilderWithExpectedSize.put("LOGIN_FLOW", s1Var.X5);
        builderBuilderWithExpectedSize.put("TWO_FA_FLOW", s1Var.f198274a6);
        builderBuilderWithExpectedSize.put("SUBSCRIPTIONS_HISTORY_FLOW", s1Var.f198299b6);
        builderBuilderWithExpectedSize.put("MARK_RECURRING_TRANSACTIONS_FLOW", s1Var.c6);
        builderBuilderWithExpectedSize.put("EXTERNAL_DEEPLINK_ROUTING_FLOW", s1Var.f6);
        builderBuilderWithExpectedSize.put("STORIES_FLOW", s1Var.g6);
        builderBuilderWithExpectedSize.put("PET_HUB_FLOW", s1Var.f198444h6);
        builderBuilderWithExpectedSize.put("PET_PROFILE_FLOW", s1Var.i6);
        builderBuilderWithExpectedSize.put("PET_ADD_FLOW", s1Var.f198493j6);
        builderBuilderWithExpectedSize.put("PET_EDIT_DETAILS_FLOW", s1Var.k6);
        builderBuilderWithExpectedSize.put("PET_CANCELLATION_FLOW", s1Var.f198539l6);
        builderBuilderWithExpectedSize.put("PET_PLAN_BUILDER_FLOW", s1Var.m6);
        builderBuilderWithExpectedSize.put("CRYPTO_WITHDRAW_TO_ADDRESS_FLOW", s1Var.f198591n6);
        builderBuilderWithExpectedSize.put("CREDIT_QUESTIONNAIRE_FLOW", s1Var.f198615o6);
        builderBuilderWithExpectedSize.put("CREDIT_REGISTERS_FLOW", s1Var.f198640p6);
        builderBuilderWithExpectedSize.put("TRANSPARENT_KOMPOT_DESTINATION_FLOW", s1Var.f198664q6);
        builderBuilderWithExpectedSize.put("CREDIT_CONSENTS_WEB_VIEW_FLOW", s1Var.f198688r6);
        builderBuilderWithExpectedSize.put("CREDIT_MANAGE_CO_BORROWER_DETAILS_FLOW", s1Var.s6);
        builderBuilderWithExpectedSize.put("ILLION_BANKSTATEMENTS_WEB_VIEW_FLOW", s1Var.f198738t6);
        builderBuilderWithExpectedSize.put("HOME_INSURANCE_PARTNER_WEB_VIEW_FLOW", s1Var.f198762u6);
        phm.a aVar2 = (phm.a) builderBuilderWithExpectedSize.build().get(flowName);
        b60.d dVar = aVar2 != null ? (b60.d) aVar2.get() : null;
        if (dVar != null) {
            ArrayList arrayList2 = i.f12527a;
            i.a("Create Flow from framework with name ".concat(flowName));
            return (hri.a) dVar.a();
        }
        ImmutableMap immutableMapOf2 = ImmutableMap.of("TRADING_STOCK_BUY_FLOW", q1Var.k.f197487a.v6);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        Iterator it9 = immutableMapOf2.entrySet().iterator();
        while (it9.hasNext()) {
            Map.Entry entry3 = (Map.Entry) it9.next();
            if (a0.H(flowName, (String) entry3.getKey(), false)) {
                linkedHashMap2.put(entry3.getKey(), entry3.getValue());
            }
        }
        Map.Entry entry4 = (Map.Entry) d0.c0(linkedHashMap2.entrySet());
        phm.a aVar3 = entry4 != null ? (phm.a) entry4.getValue() : null;
        if (aVar3 == null) {
            throw new IllegalStateException(p.a.p("Flow factory with name ", flowName, " is not found"));
        }
        ArrayList arrayList3 = i.f12527a;
        i.a("Create Flow from framework with custom name ".concat(flowName));
        return ((zrk.f) aVar3.get()).a(flowName);
    }
}
