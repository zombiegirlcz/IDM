package hp2;

import com.revolut.data.model.Data;
import com.revolut.feature.bank_account_switching.impl.ui.start_date_selection.BankAccountSwitchingStartDateSelectionScreen;
import com.revolut.feature.card_management.impl.cardagreements.screens.overview.CardIssuanceAgreementsScreen;
import com.revolut.feature.credit.application.close.ui.screen.CreditApplicationCloseScreen;
import com.revolut.feature.credit.card.impl.ui.instalment.past.CreditCardInstalmentsScreen;
import com.revolut.feature.freelancer.impl.ui.onboarding.business_category.FreelancerBusinessCategoryScreen;
import com.revolut.feature.insurance_car.impl.ui.screen.policy.details.PolicyDetailsScreen;
import com.revolut.feature.rev_points.impl.ui.earn.RevPointsEarnScreen;
import com.revolut.feature.transport.impl.ui.hub.tickets.expired.ExpiredTicketsListScreen;
import hs4.o;
import hwi.h0;
import i06.q;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes21.dex */
public final class d extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f154385w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(Object obj2, Object obj3, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = obj2;
        this.f154385w = obj3;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                d dVar = new d((BankAccountSwitchingStartDateSelectionScreen) this.f154385w, continuation, 0);
                dVar.v = obj2;
                return dVar;
            case 1:
                d dVar2 = new d((CreditApplicationCloseScreen) this.f154385w, continuation, 1);
                dVar2.v = obj2;
                return dVar2;
            case 2:
                d dVar3 = new d((PolicyDetailsScreen) this.f154385w, continuation, 2);
                dVar3.v = obj2;
                return dVar3;
            case 3:
                d dVar4 = new d((hq8.m) this.f154385w, continuation, 3);
                dVar4.v = obj2;
                return dVar4;
            case 4:
                d dVar5 = new d((CreditCardInstalmentsScreen) this.f154385w, continuation, 4);
                dVar5.v = obj2;
                return dVar5;
            case 5:
                d dVar6 = new d((o) this.f154385w, continuation, 5);
                dVar6.v = obj2;
                return dVar6;
            case 6:
                d dVar7 = new d((com.revolut.biometric_verification.impl.ui.step.document.flow.e) this.f154385w, continuation, 6);
                dVar7.v = obj2;
                return dVar7;
            case 7:
                d dVar8 = new d((ht4.c) this.f154385w, continuation, 7);
                dVar8.v = obj2;
                return dVar8;
            case 8:
                d dVar9 = new d((hu7.b) this.f154385w, continuation, 8);
                dVar9.v = obj2;
                return dVar9;
            case 9:
                d dVar10 = new d((hu7.l) this.f154385w, continuation, 9);
                dVar10.v = obj2;
                return dVar10;
            case 10:
                d dVar11 = new d((hu7.o) this.f154385w, continuation, 10);
                dVar11.v = obj2;
                return dVar11;
            case 11:
                d dVar12 = new d((com.revolut.feature.security_hub.impl.ui.flow.m) this.f154385w, continuation, 11);
                dVar12.v = obj2;
                return dVar12;
            case 12:
                return new d((com.revolut.feature.security_hub.impl.ui.flow.m) this.v, (yki.l) this.f154385w, continuation, 12);
            case 13:
                d dVar13 = new d((com.revolut.feature.staking.impl.confirmation.a) this.f154385w, continuation, 13);
                dVar13.v = obj2;
                return dVar13;
            case 14:
                d dVar14 = new d((com.revolut.feature.topup_screen.impl.flow.topup_methods.d) this.f154385w, continuation, 14);
                dVar14.v = obj2;
                return dVar14;
            case 15:
                d dVar15 = new d((ExpiredTicketsListScreen) this.f154385w, continuation, 15);
                dVar15.v = obj2;
                return dVar15;
            case 16:
                d dVar16 = new d((hwf.g) this.f154385w, continuation, 16);
                dVar16.v = obj2;
                return dVar16;
            case 17:
                d dVar17 = new d((h0) this.f154385w, continuation, 17);
                dVar17.v = obj2;
                return dVar17;
            case 18:
                d dVar18 = new d((hwk.c) this.f154385w, continuation, 18);
                dVar18.v = obj2;
                return dVar18;
            case 19:
                d dVar19 = new d((hx3.g) this.f154385w, continuation, 19);
                dVar19.v = obj2;
                return dVar19;
            case 20:
                d dVar20 = new d((com.revolut.feature_crypto_order_details.impl.ui.pager.a) this.f154385w, continuation, 20);
                dVar20.v = obj2;
                return dVar20;
            case 21:
                d dVar21 = new d((CardIssuanceAgreementsScreen) this.f154385w, continuation, 21);
                dVar21.v = obj2;
                return dVar21;
            case 22:
                d dVar22 = new d((FreelancerBusinessCategoryScreen) this.f154385w, continuation, 22);
                dVar22.v = obj2;
                return dVar22;
            case 23:
                d dVar23 = new d((hz6.k) this.f154385w, continuation, 23);
                dVar23.v = obj2;
                return dVar23;
            case 24:
                d dVar24 = new d((hzb.i) this.f154385w, continuation, 24);
                dVar24.v = obj2;
                return dVar24;
            case 25:
                d dVar25 = new d((RevPointsEarnScreen) this.f154385w, continuation, 25);
                dVar25.v = obj2;
                return dVar25;
            case 26:
                return new d((i01.b) this.v, (String) this.f154385w, continuation, 26);
            case 27:
                d dVar26 = new d((q) this.f154385w, continuation, 27);
                dVar26.v = obj2;
                return dVar26;
            case 28:
                d dVar27 = new d((com.revolut.feature.learn.shared.impl.ui.course.overview.e) this.f154385w, continuation, 28);
                dVar27.v = obj2;
                return dVar27;
            default:
                d dVar28 = new d((i0e.q) this.f154385w, continuation, 29);
                dVar28.v = obj2;
                return dVar28;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((d) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0093  */
    /* JADX WARN: Type inference failed for: r13v0, types: [com.revolut.retail.core.navigation.NaviCommand, kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r2v10, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v25, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v62, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v87, types: [java.lang.Object, kotlin.Lazy] */
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
    public final java.lang.Object invokeSuspend(java.lang.Object r30) {
        /*
            Method dump skipped, instruction units count: 1952
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: hp2.d.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f154385w = obj2;
    }
}
