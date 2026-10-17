package s15;

import com.revolut.feature.apm.bills.billers.api.model.Biller;
import com.revolut.feature.product.onboarding.domain.models.DeclarationValue;
import com.revolut.feature.retail.cobranded_cards.api.domain.model.CobrandedCardsCardConfiguration;
import com.revolut.feature.retail.cobranded_cards.api.domain.model.CobrandedCardsPlan;
import com.revolut.feature.rfi_tool.impl.domain.model.Content;
import com.revolut.feature.transfer.models.transfer.TransferTrustData;
import com.revolut.feature.travel.experiences.impl.ui.screen.options_v2.model.TravelExperienceOptionSelectionV2;
import com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.flow.BeneficiaryCreationFlowContract$CreationProcessState;
import h93.f0;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CoroutineScope;
import s2g.w;
import s9b.p;
import tjh.h0;
import tt4.s;
import ttl.x;
import v25.o;
import vha.q0;

/* JADX INFO: loaded from: classes22.dex */
public final class j extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Object f259090w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Object f259091x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Object f259092y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(int i, Object obj2, Object obj3, String str, Continuation continuation) {
        super(1, continuation);
        this.u = i;
        this.f259090w = obj2;
        this.f259092y = str;
        this.f259091x = obj3;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new j((ty0.a) this.f259090w, (l) this.f259091x, (String) this.f259092y, continuation, 0);
            case 1:
                return new j((CoroutineScope) this.f259090w, (w) this.f259091x, (TravelExperienceOptionSelectionV2) this.f259092y, continuation, 1);
            case 2:
                return new j((String) this.f259090w, (p) this.f259091x, continuation);
            case 3:
                return new j((com.revolut.feature.credit.application.plugins.impl.ui.financial_evidence.flow.e) this.f259091x, (tb4.m) this.f259092y, continuation, 3);
            case 4:
                return new j((sf9.g) this.f259092y, continuation, 4);
            case 5:
                return new j((si5.b) this.f259091x, (bi5.c) this.f259092y, continuation, 5);
            case 6:
                return new j(6, (com.revolut.feature.profile.impl.ui.details.email.c) this.f259090w, (String) this.f259091x, (String) this.f259092y, continuation);
            case 7:
                return new j((com.revolut.feature.apm.bills.bpay.impl.screen.review.review.a) this.f259091x, (qua.p) this.f259092y, continuation, 7);
            case 8:
                return new j(8, (com.revolut.feature.topup_screen.impl.flows.stored_method.flow.b) this.f259090w, (String) this.f259091x, (String) this.f259092y, continuation);
            case 9:
                return new j((com.revolut.feature.card_screen.impl.kompot.cards_carousel.screen.g) this.f259091x, (f0) this.f259092y, continuation, 9);
            case 10:
                return new j((f0) this.f259090w, (com.revolut.feature.card_screen.impl.kompot.cards_carousel.screen.g) this.f259091x, (String) this.f259092y, continuation, 10);
            case 11:
                return new j((tf9.f) this.f259090w, (Biller) this.f259091x, (ArrayList) this.f259092y, continuation, 11);
            case 12:
                return new j((h0) this.f259091x, (String) this.f259092y, continuation, 12);
            case 13:
                return new j((s) this.f259091x, (String) this.f259092y, continuation, 13);
            case 14:
                return new j((x) this.f259092y, continuation, 14);
            case 15:
                return new j((com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.flow.f) this.f259090w, (BeneficiaryCreationFlowContract$CreationProcessState) this.f259091x, (String) this.f259092y, continuation, 15);
            case 16:
                return new j((com.revolut.feature.external_accounts.impl.ui.brazil.inbound_openbanking.mandate_preview.b) this.f259092y, continuation, 16);
            case 17:
                return new j((uob.k) this.f259090w, (pcd.s) this.f259091x, (dj0.d) this.f259092y, continuation, 17);
            case 18:
                return new j((usa.g) this.f259090w, (iy9.d) this.f259091x, (TransferTrustData) this.f259092y, continuation, 18);
            case 19:
                return new j((com.revolut.feature.topup_screen.impl.flows.topup.flow.i) this.f259090w, (dj0.d) this.f259091x, (String) this.f259092y, continuation, 19);
            case 20:
                return new j((o) this.f259091x, (String) this.f259092y, continuation, 20);
            case 21:
                return new j((hdh.h) this.f259090w, (kul.b) this.f259091x, (vfh.l) this.f259092y, continuation, 21);
            case 22:
                return new j(22, (com.revolut.retail.feature.pricing_plans.ui.impl.flows.family_plan.d) this.f259090w, (zm3.l) this.f259091x, (String) this.f259092y, continuation);
            case 23:
                return new j((com.revolut.feature.credit.application.plugins.impl.ui.sepa_direct_debit.flow.a) this.f259090w, (dz3.a) this.f259091x, (x35.e) this.f259092y, continuation, 23);
            case 24:
                return new j((q0) this.f259091x, (Function1) this.f259092y, continuation, 24);
            case 25:
                return new j(25, (com.revolut.feature.product.onboarding.flow.a) this.f259090w, (DeclarationValue) this.f259091x, (String) this.f259092y, continuation);
            case 26:
                return new j(26, (vjk.d) this.f259090w, (hha.d) this.f259091x, (String) this.f259092y, continuation);
            case 27:
                return new j((com.revolut.feature.rfi_tool.impl.navigation.b) this.f259090w, (Content) this.f259091x, this.f259092y, continuation, 27);
            case 28:
                return new j((vrb.l) this.f259090w, (CoroutineScope) this.f259091x, (vrb.a) this.f259092y, continuation, 28);
            default:
                return new j((com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.value_reminder.c) this.f259090w, (CobrandedCardsPlan) this.f259091x, (CobrandedCardsCardConfiguration) this.f259092y, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((j) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:303:0x070f  */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v83, types: [java.lang.Object, java.util.Map] */
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
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r30) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2848
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s15.j.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(Object obj2, Object obj3, Object obj4, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f259090w = obj2;
        this.f259091x = obj3;
        this.f259092y = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(Object obj2, Object obj3, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f259091x = obj2;
        this.f259092y = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(Object obj2, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f259092y = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(String str, p pVar, Continuation continuation) {
        super(1, continuation);
        this.u = 2;
        this.f259090w = str;
        this.f259091x = pVar;
    }
}
