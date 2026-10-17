package eg4;

import cnh.f;
import com.revolut.feature.apm.core.models.alias.Alias;
import com.revolut.feature.junior_onboarding.impl.ui.personal_data_creation.e;
import com.revolut.feature.junior_onboarding.impl.ui.personal_data_creation.model.PersonalDetailsForm;
import com.revolut.feature.junior_profile.api.models.JuniorBankingProfile;
import com.revolut.feature_move_money.api.model.AccountWrapper;
import com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_referral_sender.g;
import eh9.z;
import elf.m;
import elf.r0;
import elf.s1;
import eql.c0;
import fk4.q;
import g17.h;
import gim.i;
import it3.d;
import java.io.File;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import qua.p;
import zm3.l;

/* JADX INFO: loaded from: classes22.dex */
public final class b extends i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Object f125545w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f125546x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(Object obj2, Object obj3, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f125545w = obj2;
        this.f125546x = obj3;
    }

    /* JADX WARN: Type inference failed for: r1v25, types: [gim.i, kotlin.jvm.functions.Function2] */
    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new b((com.revolut.feature.credit.application.plugins.impl.ui.personal_details.a) this.f125545w, (d) this.f125546x, continuation, 0);
            case 1:
                return new b((z) this.f125545w, (h1j.d) this.f125546x, continuation, 1);
            case 2:
                return new b((e) this.f125545w, (PersonalDetailsForm) this.f125546x, continuation, 2);
            case 3:
                return new b((e) this.f125545w, (String) this.f125546x, continuation, 3);
            case 4:
                return new b((g) this.f125545w, (l) this.f125546x, continuation, 4);
            case 5:
                return new b((com.revolut.feature.external_accounts.impl.ui.apptoapp.screen.payment.d) this.f125545w, (String) this.f125546x, continuation, 5);
            case 6:
                return new b((p) this.f125545w, (m) this.f125546x, continuation, 6);
            case 7:
                return new b((r0) this.f125545w, (String) this.f125546x, continuation, 7);
            case 8:
                return new b((s1) this.f125545w, (File) this.f125546x, continuation, 8);
            case 9:
                return new b((com.revolut.feature.external_accounts.impl.ui.flow.cross_border.easy_bank_transfer.e) this.f125545w, (String) this.f125546x, continuation, 9);
            case 10:
                return new b((com.revolut.feature.tax_residency.impl.flows.submit.a) this.f125545w, (Boolean) this.f125546x, continuation, 10);
            case 11:
                return new b((eol.l) this.f125546x, continuation, 11);
            case 12:
                return new b((Function2) this.f125545w, (c0) this.f125546x, continuation);
            case 13:
                return new b((ew1.m) this.f125546x, continuation, 13);
            case 14:
                return new b((ew1.m) this.f125545w, (Alias) this.f125546x, continuation, 14);
            case 15:
                return new b((com.revolut.feature.topup_screen.impl.flow.external_card_details.e) this.f125545w, (String) this.f125546x, continuation, 15);
            case 16:
                return new b((f0a.c) this.f125545w, (zm3.a) this.f125546x, continuation, 16);
            case 17:
                return new b((com.revolut.feature.rev_points.spare_change.impl.ui.screen.full_banner_grid_spare_change.a) this.f125546x, continuation, 17);
            case 18:
                return new b((f) this.f125545w, (String) this.f125546x, continuation, 18);
            case 19:
                return new b((f) this.f125545w, (File) this.f125546x, continuation, 19);
            case 20:
                return new b((f6i.d) this.f125545w, (AccountWrapper) this.f125546x, continuation, 20);
            case 21:
                return new b((sfe.l) this.f125545w, (f88.f) this.f125546x, continuation, 21);
            case 22:
                return new b((com.revolut.feature.junior.isa.impl.ui.child_details.a) this.f125545w, (com.revolut.feature.junior_profile.api.models.a) this.f125546x, continuation, 22);
            case 23:
                return new b((com.revolut.feature.credit.application.plugins.impl.ui.failure.flow.a) this.f125546x, continuation, 23);
            case 24:
                return new b((q) this.f125545w, (String) this.f125546x, continuation, 24);
            case 25:
                return new b((JuniorBankingProfile) this.f125545w, (fo8.b) this.f125546x, continuation, 25);
            case 26:
                return new b((com.revolut.feature.security_hub.impl.ui.transactions_limits.a) this.f125545w, (String) this.f125546x, continuation, 26);
            case 27:
                return new b((fz4.l) this.f125545w, (ty0.a) this.f125546x, continuation, 27);
            case 28:
                return new b((h) this.f125545w, (wi0.b) this.f125546x, continuation, 28);
            default:
                return new b((com.revolut.feature.semi_independent_onboarding.impl.ui.invitation.a) this.f125545w, (zm3.a) this.f125546x, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((b) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Removed duplicated region for block: B:292:0x0624  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x0637  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x063a  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x0671  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x068a  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x068e  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x06fc  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x0725  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x072b  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x0731  */
    /* JADX WARN: Removed duplicated region for block: B:514:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:548:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r10v19, types: [com.revolut.core.ui_kit.models.Style, java.lang.Object, java.lang.Throwable, java.util.List] */
    /* JADX WARN: Type inference failed for: r10v20 */
    /* JADX WARN: Type inference failed for: r10v22 */
    /* JADX WARN: Type inference failed for: r1v63, types: [gim.i, kotlin.jvm.functions.Function2] */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r32) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2730
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: eg4.b.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public b(Function2 function2, c0 c0Var, Continuation continuation) {
        super(1, continuation);
        this.u = 12;
        this.f125545w = (i) function2;
        this.f125546x = c0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(oki.h hVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f125546x = hVar;
    }
}
