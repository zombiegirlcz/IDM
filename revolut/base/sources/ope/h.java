package ope;

import aii.r;
import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import com.revolut.core.ui_kit.delegates.id;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CountryClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.feature.full_screen_prompt.PromptMarketingScreen;
import com.revolut.feature.full_screen_prompt.PromptMarketingScreenContract$InputData;
import com.revolut.feature.tax_residency.api.BackNavigationType;
import com.revolut.feature.tax_residency.impl.R$string;
import com.revolut.feature.tax_residency.impl.v2.models.CountryRule;
import com.revolut.feature.tax_residency.impl.v2.models.UserSpecificRule;
import com.revolut.feature.tax_residency.impl.v2.ui.crs_flow.CrsFlowContract$InputData;
import com.revolut.feature.tax_residency.impl.v2.ui.crs_flow.CrsFlowContract$Step;
import com.revolut.feature.tax_residency.impl.v2.ui.declaration_flow.TaxResidencyDeclarationFlow;
import com.revolut.feature.tax_residency.impl.v2.ui.declaration_flow.TaxResidencyDeclarationFlowContract$InputData;
import com.revolut.feature.tax_residency.impl.v2.ui.declaration_flow.TaxResidencyDeclarationFlowContract$UseCase;
import com.revolut.feature.tax_residency.impl.v2.ui.multi_residency_flow.MultiResidencyFlow;
import com.revolut.feature.tax_residency.impl.v2.ui.multi_residency_flow.MultiResidencyFlowContract$InputData;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.kompot.common.bottom_sheet.actions.ActionsBottomSheetController;
import d67.s;
import d67.t;
import hx7.q;
import java.util.ArrayList;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yki.l;
import zhm.d0;
import zhm.u;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f227594a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.tax_residency.impl.v2.ui.crs_flow.a f227595b;

    public /* synthetic */ h(com.revolut.feature.tax_residency.impl.v2.ui.crs_flow.a aVar, int i) {
        this.f227594a = i;
        this.f227595b = aVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        r cVar;
        wi0.b bVar;
        switch (this.f227594a) {
            case 0:
                final com.revolut.feature.tax_residency.impl.v2.ui.crs_flow.a aVar = this.f227595b;
                CrsFlowContract$InputData crsFlowContract$InputData = aVar.o;
                l FlowCoordinator = (l) obj2;
                CrsFlowContract$Step step = (CrsFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(FlowCoordinator, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step, "step");
                if (step instanceof CrsFlowContract$Step.SoleResidencyQuestion) {
                    j jVar = aVar.f90213p;
                    wi0.b countryCode = crsFlowContract$InputData.f90203a;
                    boolean zQ = q.Q(crsFlowContract$InputData.f);
                    BackNavigationType backNavigationType = crsFlowContract$InputData.f90208j;
                    jVar.getClass();
                    Intrinsics.checkNotNullParameter(countryCode, "countryCode");
                    Intrinsics.checkNotNullParameter(backNavigationType, "backNavigationType");
                    CountryClause countryClause = new CountryClause(countryCode, null);
                    PromptMarketingScreen promptMarketingScreen = new PromptMarketingScreen(new PromptMarketingScreenContract$InputData(new TextLocalisedClause(zQ ? R$string.tin_flow_sole_residency_declaration_us_title : R$string.tin_flow_sole_residency_declaration_title, u.c(countryClause), null, 12), new TextLocalisedClause(R$string.tin_flow_declaration_description, null, null, 14), com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D299", null, null, null, 30), null, null, czi.c.R(backNavigationType), null, new PromptMarketingContentDelegate.Model.Button((Clause) new TextLocalisedClause(R$string.tin_flow_sole_residency_declaration_cta_primary, u.c(countryClause), null, 12), (ResourceImage) null, (LargeActionButton.ButtonStyle) LargeActionButton.ButtonStyle.f58725a, false, (String) null, 54), new PromptMarketingContentDelegate.Model.Button((Clause) new TextLocalisedClause(R$string.tin_flow_sole_residency_declaration_cta_secondary, null, null, 14), (ResourceImage) null, (LargeActionButton.ButtonStyle) LargeActionButton.ButtonStyle.f58726b, false, (String) null, 54), id.VERTICAL, null, null, null, new TextLocalisedClause(R$string.tin_flow_sole_residency_declaration_learn_more, null, null, 14), 56408));
                    final int i = 0;
                    Function1 block = new Function1() { // from class: ope.i
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj4) {
                            r cVar2;
                            r rVar;
                            switch (i) {
                                case 0:
                                    com.revolut.feature.tax_residency.impl.v2.ui.crs_flow.a aVar2 = aVar;
                                    CrsFlowContract$InputData crsFlowContract$InputData2 = aVar2.o;
                                    d67.u output = (d67.u) obj4;
                                    Intrinsics.checkNotNullParameter(output, "output");
                                    if (Intrinsics.f(output, s.f111464a)) {
                                        CountryRule countryRule = (CountryRule) crsFlowContract$InputData2.f90205c.get(crsFlowContract$InputData2.f90203a);
                                        if (countryRule == null) {
                                            aVar2.C2(new c(p.a.p("Sole residency declaration ", crsFlowContract$InputData2.f90203a.f297794a, " requires rule")));
                                            return Unit.f186387a;
                                        }
                                        oki.h.t2(aVar2, aVar2.f90215r, new CrsFlowContract$Step.SoleResidencyDeclaration(countryRule), false, null, false, 14);
                                    } else if (Intrinsics.f(output, t.f111465a)) {
                                        oki.h.t2(aVar2, aVar2.f90215r, new CrsFlowContract$Step.MultiResidencyDeclaration(BackNavigationType.BACK), false, null, false, 14);
                                    } else if (Intrinsics.f(output, d67.r.f111463a)) {
                                        oki.h.w2(aVar2.f90215r, CrsFlowContract$Step.WhatIsTaxResidency.f90212a, ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                                    } else if (Intrinsics.f(output, d67.q.f111462a)) {
                                        aVar2.B2();
                                    }
                                    return Unit.f186387a;
                                default:
                                    wpe.f output2 = (wpe.f) obj4;
                                    Intrinsics.checkNotNullParameter(output2, "output");
                                    if (Intrinsics.f(output2, wpe.c.f299227a)) {
                                        rVar = d.f227589a;
                                    } else {
                                        if (output2 instanceof wpe.e) {
                                            wpe.e eVar = (wpe.e) output2;
                                            cVar2 = new e(eVar.f299229a, eVar.f299230b, eVar.f299231c);
                                        } else {
                                            if (!(output2 instanceof wpe.d)) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            cVar2 = new c(((wpe.d) output2).f299228a);
                                        }
                                        rVar = cVar2;
                                    }
                                    aVar.C2(rVar);
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block, "block");
                    promptMarketingScreen.H = block;
                    return promptMarketingScreen;
                }
                if (step instanceof CrsFlowContract$Step.WhatIsTaxResidency) {
                    aVar.f90214q.getClass();
                    return new ActionsBottomSheetController(lpe.e.a());
                }
                if (step instanceof CrsFlowContract$Step.SoleResidencyDeclaration) {
                    UserSpecificRule userSpecificRuleA = com.revolut.feature.tax_residency.impl.v2.models.a.a(crsFlowContract$InputData.d, crsFlowContract$InputData.f90203a);
                    wi0.b bVar2 = crsFlowContract$InputData.f90203a;
                    TaxResidencyDeclarationFlow taxResidencyDeclarationFlow = new TaxResidencyDeclarationFlow(new TaxResidencyDeclarationFlowContract$InputData(bVar2, ((CrsFlowContract$Step.SoleResidencyDeclaration) step).f90210a, userSpecificRuleA, new TaxResidencyDeclarationFlowContract$UseCase.Add(q.o(crsFlowContract$InputData.f, bVar2)), crsFlowContract$InputData.i, crsFlowContract$InputData.f90206g.f90181c, crsFlowContract$InputData.f90207h, BackNavigationType.BACK, true));
                    aVar.a(taxResidencyDeclarationFlow, new h(aVar, 1));
                    return taxResidencyDeclarationFlow;
                }
                if (!(step instanceof CrsFlowContract$Step.MultiResidencyDeclaration)) {
                    throw new NoWhenBranchMatchedException();
                }
                wi0.b bVar3 = crsFlowContract$InputData.f90203a;
                ArrayList arrayList = crsFlowContract$InputData.e;
                boolean z = crsFlowContract$InputData.f90204b;
                Map map = crsFlowContract$InputData.f90205c;
                Map map2 = crsFlowContract$InputData.d;
                MultiResidencyFlow multiResidencyFlow = new MultiResidencyFlow(new MultiResidencyFlowContract$InputData(crsFlowContract$InputData.i, ((CrsFlowContract$Step.MultiResidencyDeclaration) step).f90209a, crsFlowContract$InputData.f90206g, crsFlowContract$InputData.f90207h, arrayList, crsFlowContract$InputData.f, map, map2, bVar3, z));
                final int i2 = 1;
                Function1 block2 = new Function1() { // from class: ope.i
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj4) {
                        r cVar2;
                        r rVar;
                        switch (i2) {
                            case 0:
                                com.revolut.feature.tax_residency.impl.v2.ui.crs_flow.a aVar2 = aVar;
                                CrsFlowContract$InputData crsFlowContract$InputData2 = aVar2.o;
                                d67.u output = (d67.u) obj4;
                                Intrinsics.checkNotNullParameter(output, "output");
                                if (Intrinsics.f(output, s.f111464a)) {
                                    CountryRule countryRule = (CountryRule) crsFlowContract$InputData2.f90205c.get(crsFlowContract$InputData2.f90203a);
                                    if (countryRule == null) {
                                        aVar2.C2(new c(p.a.p("Sole residency declaration ", crsFlowContract$InputData2.f90203a.f297794a, " requires rule")));
                                        return Unit.f186387a;
                                    }
                                    oki.h.t2(aVar2, aVar2.f90215r, new CrsFlowContract$Step.SoleResidencyDeclaration(countryRule), false, null, false, 14);
                                } else if (Intrinsics.f(output, t.f111465a)) {
                                    oki.h.t2(aVar2, aVar2.f90215r, new CrsFlowContract$Step.MultiResidencyDeclaration(BackNavigationType.BACK), false, null, false, 14);
                                } else if (Intrinsics.f(output, d67.r.f111463a)) {
                                    oki.h.w2(aVar2.f90215r, CrsFlowContract$Step.WhatIsTaxResidency.f90212a, ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                                } else if (Intrinsics.f(output, d67.q.f111462a)) {
                                    aVar2.B2();
                                }
                                return Unit.f186387a;
                            default:
                                wpe.f output2 = (wpe.f) obj4;
                                Intrinsics.checkNotNullParameter(output2, "output");
                                if (Intrinsics.f(output2, wpe.c.f299227a)) {
                                    rVar = d.f227589a;
                                } else {
                                    if (output2 instanceof wpe.e) {
                                        wpe.e eVar = (wpe.e) output2;
                                        cVar2 = new e(eVar.f299229a, eVar.f299230b, eVar.f299231c);
                                    } else {
                                        if (!(output2 instanceof wpe.d)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        cVar2 = new c(((wpe.d) output2).f299228a);
                                    }
                                    rVar = cVar2;
                                }
                                aVar.C2(rVar);
                                return Unit.f186387a;
                        }
                    }
                };
                Intrinsics.checkNotNullParameter(block2, "block");
                multiResidencyFlow.H = block2;
                return multiResidencyFlow;
            default:
                oki.g onResult = (oki.g) obj2;
                ppe.f output = (ppe.f) obj3;
                Intrinsics.checkNotNullParameter(onResult, "$this$onResult");
                Intrinsics.checkNotNullParameter(output, "output");
                boolean z3 = output instanceof ppe.c;
                com.revolut.feature.tax_residency.impl.v2.ui.crs_flow.a aVar2 = this.f227595b;
                if (z3) {
                    if (!((ppe.c) output).d) {
                        onResult.pop();
                    }
                    CrsFlowContract$InputData crsFlowContract$InputData2 = aVar2.o;
                    wi0.b bVar4 = crsFlowContract$InputData2.f90203a;
                    if (q.Q(crsFlowContract$InputData2.f)) {
                        wi0.b.Companion.getClass();
                        bVar = wi0.b.f297770q3;
                    } else {
                        bVar = null;
                    }
                    wi0.b[] elements = {bVar4, bVar};
                    Intrinsics.checkNotNullParameter(elements, "elements");
                    cVar = new f(d0.U(kotlin.collections.d.L(elements)));
                } else if (output instanceof ppe.d) {
                    cVar = new c(((ppe.d) output).f238593a);
                } else {
                    if (!Intrinsics.f(output, ppe.e.f238594a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    cVar = new c("Unexpected primary residency request for a sole residency declaration");
                }
                aVar2.C2(cVar);
                return Unit.f186387a;
        }
    }
}
