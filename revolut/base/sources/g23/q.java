package g23;

import com.revolut.feature.credit.application.api.models.IntendedPricingPlan;
import com.revolut.feature.staking.api.model.StakingPocket;
import com.revolut.feature.staking.api.model.StakingProduct;
import com.revolut.feature.tab.accounts.api.model.AccountContent;
import ft3.h1;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.flow.FlowCollector;
import nii.n1;
import skm.a2;
import vkm.t0;

/* JADX INFO: loaded from: classes21.dex */
public final class q extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Object f139828w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f139829x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f139830y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(int i, Object obj2, String str, Continuation continuation) {
        super(2, continuation);
        this.u = i;
        this.f139829x = obj2;
        this.f139830y = str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003e, code lost:
    
        if (r0.d(r7) == r2) goto L23;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005e A[PHI: r3 r8
      0x005e: PHI (r3v2 ukm.g) = (r3v3 ukm.g), (r3v5 ukm.g) binds: [B:17:0x005b, B:10:0x0027] A[DONT_GENERATE, DONT_INLINE]
      0x005e: PHI (r8v5 java.lang.Object) = (r8v11 java.lang.Object), (r8v0 java.lang.Object) binds: [B:17:0x005b, B:10:0x0027] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0078  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0075 -> B:16:0x0051). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object b(java.lang.Object r8) throws java.lang.Throwable {
        /*
            r7 = this;
            java.lang.Object r0 = r7.f139830y
            gsh.n r0 = (gsh.n) r0
            java.lang.Object r1 = r7.f139829x
            ukm.b r1 = (ukm.b) r1
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r7.v
            r4 = 3
            r5 = 2
            r6 = 1
            if (r3 == 0) goto L33
            if (r3 == r6) goto L2f
            if (r3 == r5) goto L27
            if (r3 != r4) goto L1f
            java.lang.Object r3 = r7.f139828w
            ukm.g r3 = (ukm.g) r3
            yhm.o.b(r8)
            goto L51
        L1f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L27:
            java.lang.Object r3 = r7.f139828w
            ukm.g r3 = (ukm.g) r3
            yhm.o.b(r8)
            goto L5e
        L2f:
            yhm.o.b(r8)
            goto L41
        L33:
            yhm.o.b(r8)
            r7.f139829x = r1
            r7.v = r6
            java.lang.Object r8 = r0.d(r7)
            if (r8 != r2) goto L41
            goto L77
        L41:
            r8 = r1
            ukm.v r8 = (ukm.v) r8
            r8.getClass()
            ukm.q r8 = r8.d
            r8.getClass()
            ukm.g r3 = new ukm.g
            r3.<init>(r8)
        L51:
            r7.f139829x = r1
            r7.f139828w = r3
            r7.v = r5
            java.lang.Object r8 = r3.a(r7)
            if (r8 != r2) goto L5e
            goto L77
        L5e:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L78
            r3.c()
            kotlin.Unit r8 = kotlin.Unit.f186387a
            r7.f139829x = r1
            r7.f139828w = r3
            r7.v = r4
            java.lang.Object r8 = gsh.n.b(r0, r1, r7)
            if (r8 != r2) goto L51
        L77:
            return r2
        L78:
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: g23.q.b(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [gim.i, kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r0v14, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.q] */
    /* JADX WARN: Type inference failed for: r0v8, types: [gim.i, kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r1v11, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.q] */
    /* JADX WARN: Type inference failed for: r1v18, types: [gim.i, kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r1v2, types: [gim.i, kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r1v4, types: [gim.i, kotlin.jvm.functions.Function1] */
    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                q qVar = new q((r) this.f139830y, continuation, 0);
                qVar.f139829x = obj2;
                return qVar;
            case 1:
                return new q((g2e.t) this.f139828w, (String) this.f139829x, (String) this.f139830y, continuation, 1);
            case 2:
                return new q((Map) this.f139828w, (g34.a) this.f139829x, (h1) this.f139830y, continuation, 2);
            case 3:
                return new q((g44.b) this.f139828w, (h1) this.f139829x, (zt3.c) this.f139830y, continuation, 3);
            case 4:
                return new q((com.revolut.feature.freelancer.impl.ui.vat_reminder.settings.screen.a) this.f139828w, (od0.i) this.f139829x, (g57.g) this.f139830y, continuation, 4);
            case 5:
                return new q((com.revolut.feature.payments_migration.impl.ui.screen.migrate_subscriptions.c) this.f139828w, (String) this.f139829x, (Function1) this.f139830y, continuation);
            case 6:
                return new q((g6k.r) this.f139828w, (String) this.f139829x, (Function1) this.f139830y, continuation);
            case 7:
                return new q((com.revolut.feature.credit.application.plugins.impl.ui.credit_card_offer.i) this.f139828w, (Function1) this.f139829x, (Long) this.f139830y, continuation);
            case 8:
                return new q((com.revolut.feature.credit.application.plugins.impl.ui.credit_card_offer.i) this.f139828w, (IntendedPricingPlan) this.f139829x, (hha.d) this.f139830y, continuation, 8);
            case 9:
                return new q((g99.h) this.f139828w, (a2) this.f139829x, (skm.h0) this.f139830y, continuation, 9);
            case 10:
                return new q((g9j.t) this.f139828w, (StakingProduct) this.f139829x, (StakingPocket) this.f139830y, continuation, 10);
            case 11:
                q qVar2 = new q((g9j.t) this.f139830y, continuation, 11);
                qVar2.f139829x = obj2;
                return qVar2;
            case 12:
                return new q((com.revolut.feature.credit.application.plugins.impl.ui.documents_upload_plugin.b) this.f139828w, (ny3.k) this.f139829x, (Map) this.f139830y, continuation, 12);
            case 13:
                q qVar3 = new q((com.revolut.feature.onboarding.impl.onboarding.v) this.f139830y, continuation, (Function1) this.f139828w);
                qVar3.f139829x = obj2;
                return qVar3;
            case 14:
                return new q((gaa.j) this.f139828w, (Function1) this.f139829x, (Function0) this.f139830y, continuation);
            case 15:
                return new q((gb8.b) this.f139828w, (String) this.f139829x, (eb8.j) this.f139830y, continuation, 15);
            case 16:
                return new q(16, (com.revolut.feature_retail_user_declarations.email_verification.otp_flow.b) this.f139829x, (String) this.f139830y, continuation);
            case 17:
                q qVar4 = new q((gck.w) this.f139828w, (String) this.f139830y, continuation, 17);
                qVar4.f139829x = obj2;
                return qVar4;
            case 18:
                return new q((gie.e) this.f139828w, (AccountContent) this.f139829x, (AccountContent) this.f139830y, continuation, 18);
            case 19:
                q qVar5 = new q((gie.z) this.f139828w, (AccountContent) this.f139830y, continuation, 19);
                qVar5.f139829x = obj2;
                return qVar5;
            case 20:
                return new q((gld.f0) this.f139828w, (String) this.f139829x, (Function1) this.f139830y, continuation);
            case 21:
                return new q((gn9.d) this.f139828w, (String) this.f139829x, (dj0.d) this.f139830y, continuation, 21);
            case 22:
                q qVar6 = new q((go7.s) this.f139828w, (dj0.d) this.f139830y, continuation, 22);
                qVar6.f139829x = obj2;
                return qVar6;
            case 23:
                return new q((gq2.n) this.f139828w, (gq2.g) this.f139829x, (gq2.h) this.f139830y, continuation, 23);
            case 24:
                q qVar7 = new q((grc.k) this.f139828w, (bqc.a) this.f139830y, continuation, 24);
                qVar7.f139829x = obj2;
                return qVar7;
            case 25:
                return new q(25, (gs.r) this.f139829x, (String) this.f139830y, continuation);
            case 26:
                return new q((gsh.c) this.f139828w, (String) this.f139829x, (Map) this.f139830y, continuation, 26);
            case 27:
                return new q((gsh.c) this.f139828w, (String) this.f139829x, (ArrayList) this.f139830y, continuation, 27);
            case 28:
                q qVar8 = new q((gsh.n) this.f139830y, continuation, 28);
                qVar8.f139829x = obj2;
                return qVar8;
            default:
                q qVar9 = new q((gsh.n) this.f139828w, (t0) this.f139830y, continuation, 29);
                qVar9.f139829x = obj2;
                return qVar9;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((q) create((FlowCollector) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((q) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((q) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((q) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 4:
                return ((q) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 5:
                return ((q) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 6:
                return ((q) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 7:
                return ((q) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 8:
                return ((q) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 9:
                return ((q) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 10:
                return ((q) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 11:
                return ((q) create((FlowCollector) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 12:
                return ((q) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 13:
                return ((q) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 14:
                return ((q) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 15:
                return ((q) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 16:
                return ((q) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 17:
                return ((q) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 18:
                return ((q) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 19:
                return ((q) create((mkd.c) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 20:
                return ((q) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 21:
                return ((q) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 22:
                return ((q) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 23:
                return ((q) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 24:
                return ((q) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 25:
                return ((q) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 26:
                return ((q) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 27:
                return ((q) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 28:
                return ((q) create((ukm.b) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((q) create((ProducerScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:313:0x05c3  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x05cc  */
    /* JADX WARN: Removed duplicated region for block: B:607:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0176  */
    /* JADX WARN: Type inference failed for: r0v66, types: [gim.i, kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r3v19, types: [gim.i, kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r7v3, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.q] */
    /* JADX WARN: Type inference failed for: r8v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v10, types: [gim.i, kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r9v11, types: [gim.i, kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r9v17, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.q] */
    /* JADX WARN: Type inference failed for: r9v24, types: [gim.i, kotlin.jvm.functions.Function1] */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2904
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g23.q.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public q(com.revolut.feature.credit.application.plugins.impl.ui.credit_card_offer.i iVar, Function1 function1, Long l2, Continuation continuation) {
        super(2, continuation);
        this.u = 7;
        this.f139828w = iVar;
        this.f139829x = (gim.i) function1;
        this.f139830y = l2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public q(com.revolut.feature.onboarding.impl.onboarding.v vVar, Continuation continuation, Function1 function1) {
        super(2, continuation);
        this.u = 13;
        this.f139828w = (gim.i) function1;
        this.f139830y = vVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public q(com.revolut.feature.payments_migration.impl.ui.screen.migrate_subscriptions.c cVar, String str, Function1 function1, Continuation continuation) {
        super(2, continuation);
        this.u = 5;
        this.f139828w = cVar;
        this.f139829x = str;
        this.f139830y = (gim.i) function1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public q(g6k.r rVar, String str, Function1 function1, Continuation continuation) {
        super(2, continuation);
        this.u = 6;
        this.f139828w = rVar;
        this.f139829x = str;
        this.f139830y = (gim.i) function1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public q(gaa.j jVar, Function1 function1, Function0 function0, Continuation continuation) {
        super(2, continuation);
        this.u = 14;
        this.f139828w = jVar;
        this.f139829x = (kotlin.jvm.internal.q) function1;
        this.f139830y = (kotlin.jvm.internal.q) function0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public q(gld.f0 f0Var, String str, Function1 function1, Continuation continuation) {
        super(2, continuation);
        this.u = 20;
        this.f139828w = f0Var;
        this.f139829x = str;
        this.f139830y = (gim.i) function1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(Object obj2, Object obj3, Object obj4, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f139828w = obj2;
        this.f139829x = obj3;
        this.f139830y = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(Object obj2, Object obj3, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f139828w = obj2;
        this.f139830y = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f139830y = obj2;
    }
}
