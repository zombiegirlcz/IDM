package g06;

import com.revolut.chat.ui.agentinfo.AgentInfoScreen;
import com.revolut.feature.apm.core.models.alias.error.TooManyRequestsException;
import com.revolut.feature.credit.loan.impl.ui.rev10.paymentmanagement.confirm.CreateMandateConfirmationController;
import com.revolut.feature.freelancer.impl.ui.vat_reminder.settings.screen.FreelancerVatReminderSettingsScreen;
import com.revolut.feature.onboarding.impl.onboarding.v;
import com.revolut.feature.retail.cfd.impl.screens.positions.CfdPositionsController;
import com.revolut.feature.semi_independent_onboarding.api.model.GuardianInvitationResult;
import com.revolut.feature.store.impl.ui.exclusives.StoreExclusivesScreen;
import com.revolut.feature.wealth.assetdetails.ui.impl.high_risk.InstrumentHighRiskWarningController;
import com.revolut.retail.feature.travel_status.impl.ui.screens.overview.TravelStatusOverviewScreen;
import g27.t;
import g35.o;
import g6k.r;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes3.dex */
public final class k extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f139361w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(Object obj2, Object obj3, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = obj2;
        this.f139361w = obj3;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                k kVar = new k((l) this.f139361w, continuation, 0);
                kVar.v = obj2;
                return kVar;
            case 1:
                k kVar2 = new k((com.revolut.feature.topup_screen.impl.mcy.b) this.f139361w, continuation, 1);
                kVar2.v = obj2;
                return kVar2;
            case 2:
                k kVar3 = new k((g17.h) this.f139361w, continuation, 2);
                kVar3.v = obj2;
                return kVar3;
            case 3:
                return new k((com.revolut.feature.semi_independent_onboarding.impl.ui.invitation.a) this.v, (GuardianInvitationResult.ExistingUser) this.f139361w, continuation, 3);
            case 4:
                k kVar4 = new k((g22.g) this.f139361w, continuation, 4);
                kVar4.v = obj2;
                return kVar4;
            case 5:
                k kVar5 = new k((t) this.f139361w, continuation, 5);
                kVar5.v = obj2;
                return kVar5;
            case 6:
                k kVar6 = new k((g2g.b) this.f139361w, continuation, 6);
                kVar6.v = obj2;
                return kVar6;
            case 7:
                k kVar7 = new k((TravelStatusOverviewScreen) this.f139361w, continuation, 7);
                kVar7.v = obj2;
                return kVar7;
            case 8:
                k kVar8 = new k((g2l.m) this.f139361w, continuation, 8);
                kVar8.v = obj2;
                return kVar8;
            case 9:
                k kVar9 = new k((com.revolut.feature.credit.impl.ui.entry_points.a) this.f139361w, continuation, 9);
                kVar9.v = obj2;
                return kVar9;
            case 10:
                k kVar10 = new k(continuation, (o) this.f139361w);
                kVar10.v = obj2;
                return kVar10;
            case 11:
                k kVar11 = new k((StoreExclusivesScreen) this.f139361w, continuation, 11);
                kVar11.v = obj2;
                return kVar11;
            case 12:
                k kVar12 = new k((AgentInfoScreen) this.f139361w, continuation, 12);
                kVar12.v = obj2;
                return kVar12;
            case 13:
                k kVar13 = new k((CfdPositionsController) this.f139361w, continuation, 13);
                kVar13.v = obj2;
                return kVar13;
            case 14:
                k kVar14 = new k((InstrumentHighRiskWarningController) this.f139361w, continuation, 14);
                kVar14.v = obj2;
                return kVar14;
            case 15:
                k kVar15 = new k((FreelancerVatReminderSettingsScreen) this.f139361w, continuation, 15);
                kVar15.v = obj2;
                return kVar15;
            case 16:
                k kVar16 = new k((com.revolut.feature.freelancer.impl.ui.vat_reminder.settings.screen.a) this.f139361w, continuation, 16);
                kVar16.v = obj2;
                return kVar16;
            case 17:
                k kVar17 = new k((com.revolut.feature.credit.application.plugins.impl.ui.card_ordering.a) this.f139361w, continuation, 17);
                kVar17.v = obj2;
                return kVar17;
            case 18:
                k kVar18 = new k((com.revolut.feature.payments_migration.impl.ui.screen.migrate_subscriptions.c) this.f139361w, continuation, 18);
                kVar18.v = obj2;
                return kVar18;
            case 19:
                k kVar19 = new k((aah.g) this.f139361w, continuation, 19);
                kVar19.v = obj2;
                return kVar19;
            case 20:
                k kVar20 = new k((g6f.m) this.f139361w, continuation, 20);
                kVar20.v = obj2;
                return kVar20;
            case 21:
                k kVar21 = new k((g6k.e) this.f139361w, continuation, 21);
                kVar21.v = obj2;
                return kVar21;
            case 22:
                return new k((r) this.v, (i6k.b) this.f139361w, continuation, 22);
            case 23:
                k kVar22 = new k((CreateMandateConfirmationController) this.f139361w, continuation, 23);
                kVar22.v = obj2;
                return kVar22;
            case 24:
                k kVar23 = new k((g7f.b) this.f139361w, continuation, 24);
                kVar23.v = obj2;
                return kVar23;
            case 25:
                k kVar24 = new k((g7f.h) this.f139361w, continuation, 25);
                kVar24.v = obj2;
                return kVar24;
            case 26:
                k kVar25 = new k((g8c.l) this.f139361w, continuation, 26);
                kVar25.v = obj2;
                return kVar25;
            case 27:
                return new k((eim.c) this.v, (TooManyRequestsException) this.f139361w, continuation, 27);
            case 28:
                return new k((va9.f) this.v, (v) this.f139361w, continuation, 28);
            default:
                return new k((v) this.v, (wi0.b) this.f139361w, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((k) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x041e  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0424  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0481  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x04bc  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x04cc  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x04d0  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0510  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0564  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0591  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x059e  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x05a5  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x05ac  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x05b3  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x05e2  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0600  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x060d  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0614  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x061b  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0622  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0651  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x068f  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x069b  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x06a2  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x06a9  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x06ac  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x06dd  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x06e2  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x06ed  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x06f4  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x06fc  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0700  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0748  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x075f  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0761  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x07d8  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x07e6  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0803  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0831  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x083f  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x084d  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0868  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0896  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x07e1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:311:0x0848 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v12, types: [com.revolut.core.ui_kit.models.Style, com.revolut.core.ui_kit.models.TextLocalisedClause, com.revolut.core.ui_kit_core.displayers.image.models.GlyphImageTint, java.util.List] */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r2v134, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v14, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v155, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r8v0, types: [gt3.c, it3.k, kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r8v69 */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r32) {
        /*
            Method dump skipped, instruction units count: 2638
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g06.k.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f139361w = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(Continuation continuation, o oVar) {
        super(2, continuation);
        this.u = 10;
        this.f139361w = oVar;
    }
}
