package akl;

import au6.c3;
import au6.m3;
import au6.r3;
import au6.y3;
import com.revolut.feature.freelancer.common.models.acquiring_payment.payment.AcquiringPaymentsQuery;
import com.revolut.feature.freelancer.common.models.tax_hub.FreelancerTaxProfileSchedule;
import com.revolut.feature.slot_manager.api.model.SlotContext;
import com.revolut.feature_move_money.api.model.AccountWrapper;
import com.revolut.retail.feature.impl.budgeting.ui.rev10.set_budgets.models.CategoryBudgetEditingInfo;
import java.io.File;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes12.dex */
public final class s1 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Object f6089w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f6090x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f6091y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s1(int i, Object obj2, Object obj3, String str, Continuation continuation) {
        super(2, continuation);
        this.u = i;
        this.f6089w = obj2;
        this.f6091y = str;
        this.f6090x = obj3;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new s1((a61.a) this.f6090x, (String) this.f6091y, continuation, 0);
            case 1:
                s1 s1Var = new s1((ald.r) this.f6090x, (Function1) this.f6091y, continuation, 1);
                s1Var.f6089w = obj2;
                return s1Var;
            case 2:
                return new s1((ald.r) this.f6089w, (SlotContext) this.f6090x, (Function1) this.f6091y, continuation, 2);
            case 3:
                s1 s1Var2 = new s1((apd.f) this.f6091y, continuation);
                s1Var2.f6090x = obj2;
                return s1Var2;
            case 4:
                return new s1(4, (com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.details.e) this.f6089w, (String) this.f6090x, (String) this.f6091y, continuation);
            case 5:
                return new s1((com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.details.e) this.f6089w, (aqd.s) this.f6090x, (String) this.f6091y, continuation, 5);
            case 6:
                return new s1((ard.s0) this.f6089w, (ard.y) this.f6090x, (List) this.f6091y, continuation, 6);
            case 7:
                return new s1((com.revolut.retail.feature.impl.budgeting.ui.rev10.set_budgets.flow.b) this.f6089w, (CategoryBudgetEditingInfo) this.f6090x, (String) this.f6091y, continuation, 7);
            case 8:
                return new s1(8, (at1.j) this.f6089w, (Function1) this.f6090x, (String) this.f6091y, continuation);
            case 9:
                s1 s1Var3 = new s1((atg.h) this.f6090x, (fo3.f) this.f6091y, continuation, 9);
                s1Var3.f6089w = obj2;
                return s1Var3;
            case 10:
                s1 s1Var4 = new s1((au6.d0) this.f6090x, (AcquiringPaymentsQuery) this.f6091y, continuation, 10);
                s1Var4.f6089w = obj2;
                return s1Var4;
            case 11:
                return new s1((au6.k1) this.f6090x, (String) this.f6091y, continuation, 11);
            case 12:
                return new s1((au6.v1) this.f6089w, (xi0.b) this.f6090x, (String) this.f6091y, continuation, 12);
            case 13:
                return new s1(13, (c3) this.f6089w, (String) this.f6090x, (String) this.f6091y, continuation);
            case 14:
                return new s1((m3) this.f6090x, (es6.e) this.f6091y, continuation, 14);
            case 15:
                return new s1(15, (r3) this.f6089w, (FreelancerTaxProfileSchedule) this.f6090x, (String) this.f6091y, continuation);
            case 16:
                return new s1((y3) this.f6090x, (fs6.d) this.f6091y, continuation, 16);
            case 17:
                return new s1((y3) this.f6090x, (fs6.f) this.f6091y, continuation, 17);
            case 18:
                return new s1(18, (r10.q) this.f6089w, (String) this.f6090x, (String) this.f6091y, continuation);
            case 19:
                return new s1(19, (avk.h0) this.f6089w, (nel.n) this.f6090x, (String) this.f6091y, continuation);
            case 20:
                s1 s1Var5 = new s1((com.revolut.feature.payments.profile.impl.ui_kompot.scanner.b) this.f6090x, (File) this.f6091y, continuation, 20);
                s1Var5.f6089w = obj2;
                return s1Var5;
            case 21:
                return new s1((com.revolut.retail.feature.impl.userauth.screen.revolut_sso.wrapper.a) this.f6089w, (Ref$ObjectRef) this.f6090x, (bjl.q) this.f6091y, continuation, 21);
            case 22:
                s1 s1Var6 = new s1((zm3.a) this.f6090x, (b0a.k) this.f6091y, continuation, 22);
                s1Var6.f6089w = obj2;
                return s1Var6;
            case 23:
                return new s1((String) this.f6091y, (b34.b) this.f6089w, (String) this.f6090x, continuation);
            case 24:
                return new s1((mgd.a) this.f6090x, (b4d.i) this.f6091y, continuation, 24);
            case 25:
                return new s1((com.revolut.feature.joint.impl.ui.invite_flow.d) this.f6089w, (yki.b) this.f6090x, (t48.n) this.f6091y, continuation, 25);
            case 26:
                return new s1((com.revolut.feature_move_money.impl.amount.c) this.f6089w, (b6i.j) this.f6090x, (AccountWrapper) this.f6091y, continuation, 26);
            case 27:
                return new s1((b6j.b) this.f6089w, (wd6.e) this.f6090x, (xi0.b) this.f6091y, continuation, 27);
            case 28:
                return new s1((LinkedHashSet) this.f6089w, (b79.m) this.f6090x, (List) this.f6091y, continuation, 28);
            default:
                s1 s1Var7 = new s1((ArrayList) this.f6090x, (b7i.f) this.f6091y, continuation, 29);
                s1Var7.f6089w = obj2;
                return s1Var7;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((s1) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:507:0x0b02, code lost:
    
        if (r2 == r0) goto L508;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0535  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x059c  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x05a9  */
    /* JADX WARN: Removed duplicated region for block: B:562:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:591:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r12v6, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r6v21, types: [fim.a] */
    /* JADX WARN: Type inference failed for: r6v22, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v23, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v24 */
    /* JADX WARN: Type inference failed for: r7v29 */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2906
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: akl.s1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s1(apd.f fVar, Continuation continuation) {
        super(2, continuation);
        this.u = 3;
        this.f6091y = fVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s1(Object obj2, Object obj3, Object obj4, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f6089w = obj2;
        this.f6090x = obj3;
        this.f6091y = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s1(Object obj2, Object obj3, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f6090x = obj2;
        this.f6091y = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s1(String str, b34.b bVar, String str2, Continuation continuation) {
        super(2, continuation);
        this.u = 23;
        this.f6091y = str;
        this.f6089w = bVar;
        this.f6090x = str2;
    }
}
