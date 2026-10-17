package xge;

import com.revolut.core.extensions.rx.BreadcrumbException;
import com.revolut.feature.payments.splitbill.impl.ui_new.recurring_split.RecurringSplitFlowContract$LaunchMode;
import com.revolut.feature.retail.cobranded_cards.impl.data.service.CobrandedCardsPlansService;
import com.revolut.feature.retail.savings.api.challenge.model.SavingsChallengeCreationData;
import com.revolut.feature.rev_points.giftcards.api.model.VoucherProduct;
import com.revolut.feature.selfserve.sot.api.models.DocumentType;
import com.revolut.feature.selfserve.sot.api.models.IncomeSource;
import com.revolut.feature.shared.savings.models.product.SavingsProductData;
import com.revolut.feature.tab.accounts.models.ProductAccountId;
import com.revolut.feature.tab.accounts.models.spaces.ProductSpaceIdentifier;
import com.revolut.retail.feature.api.AnalyticsAccountsSelection;
import com.revolut.sso.api.models.ConsentChallenge;
import ft3.d1;
import ft3.h1;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.flow.Flow;
import nii.l1;
import nii.n1;
import tof.i7;
import vdl.c1;
import vkm.j2;
import vkm.s1;
import w5b.c5;
import xnd.a1;
import xnd.t0;

/* JADX INFO: loaded from: classes8.dex */
public final class f extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Object f305705w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f305706x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f305707y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(Object obj2, Object obj3, Object obj4, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f305705w = obj2;
        this.f305706x = obj3;
        this.f305707y = obj4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x00a9, code lost:
    
        if (y20.f.b(r1, r0, r9) == r2) goto L48;
     */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0096 A[Catch: Exception -> 0x0020, CancellationException -> 0x0023, PHI: r10
      0x0096: PHI (r10v18 java.lang.Object) = (r10v17 java.lang.Object), (r10v0 java.lang.Object) binds: [B:40:0x0093, B:16:0x002e] A[DONT_GENERATE, DONT_INLINE], TryCatch #2 {CancellationException -> 0x0023, Exception -> 0x0020, blocks: (B:8:0x001b, B:16:0x002e, B:42:0x0096, B:44:0x009e, B:46:0x00a1, B:17:0x0032, B:39:0x008b, B:20:0x003a, B:36:0x007c, B:23:0x0041, B:25:0x0045, B:33:0x006f, B:27:0x0051, B:29:0x0055, B:30:0x0060, B:32:0x0064, B:49:0x00ac, B:50:0x00b1), top: B:55:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x009e A[Catch: Exception -> 0x0020, CancellationException -> 0x0023, TryCatch #2 {CancellationException -> 0x0023, Exception -> 0x0020, blocks: (B:8:0x001b, B:16:0x002e, B:42:0x0096, B:44:0x009e, B:46:0x00a1, B:17:0x0032, B:39:0x008b, B:20:0x003a, B:36:0x007c, B:23:0x0041, B:25:0x0045, B:33:0x006f, B:27:0x0051, B:29:0x0055, B:30:0x0060, B:32:0x0064, B:49:0x00ac, B:50:0x00b1), top: B:55:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00a1 A[Catch: Exception -> 0x0020, CancellationException -> 0x0023, TryCatch #2 {CancellationException -> 0x0023, Exception -> 0x0020, blocks: (B:8:0x001b, B:16:0x002e, B:42:0x0096, B:44:0x009e, B:46:0x00a1, B:17:0x0032, B:39:0x008b, B:20:0x003a, B:36:0x007c, B:23:0x0041, B:25:0x0045, B:33:0x006f, B:27:0x0051, B:29:0x0055, B:30:0x0060, B:32:0x0064, B:49:0x00ac, B:50:0x00b1), top: B:55:0x0011 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object b(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r0 = r9.f305706x
            y20.p r0 = (y20.p) r0
            java.lang.Object r1 = r9.f305707y
            y20.f r1 = (y20.f) r1
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r9.v
            r4 = 4
            r5 = 3
            r6 = 2
            r7 = 1
            r8 = 0
            if (r3 == 0) goto L3e
            if (r3 == r7) goto L36
            if (r3 == r6) goto L32
            if (r3 == r5) goto L2e
            if (r3 != r4) goto L26
            yhm.o.b(r10)     // Catch: java.lang.Exception -> L20 java.util.concurrent.CancellationException -> L23
            goto Lbd
        L20:
            r10 = move-exception
            goto Lb2
        L23:
            r10 = move-exception
            goto Lc0
        L26:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L2e:
            yhm.o.b(r10)     // Catch: java.lang.Exception -> L20 java.util.concurrent.CancellationException -> L23
            goto L96
        L32:
            yhm.o.b(r10)     // Catch: java.lang.Exception -> L20 java.util.concurrent.CancellationException -> L23
            goto L8b
        L36:
            java.lang.Object r3 = r9.f305705w
            y20.t r3 = (y20.t) r3
            yhm.o.b(r10)     // Catch: java.lang.Exception -> L20 java.util.concurrent.CancellationException -> L23
            goto L7c
        L3e:
            yhm.o.b(r10)
            boolean r10 = r0 instanceof y20.m     // Catch: java.lang.Exception -> L20 java.util.concurrent.CancellationException -> L23
            if (r10 == 0) goto L51
            y20.q r10 = new y20.q     // Catch: java.lang.Exception -> L20 java.util.concurrent.CancellationException -> L23
            r3 = r0
            y20.m r3 = (y20.m) r3     // Catch: java.lang.Exception -> L20 java.util.concurrent.CancellationException -> L23
            java.util.UUID r3 = r3.f310523a     // Catch: java.lang.Exception -> L20 java.util.concurrent.CancellationException -> L23
            r10.<init>(r3, r8)     // Catch: java.lang.Exception -> L20 java.util.concurrent.CancellationException -> L23
        L4f:
            r3 = r10
            goto L6f
        L51:
            boolean r10 = r0 instanceof y20.n     // Catch: java.lang.Exception -> L20 java.util.concurrent.CancellationException -> L23
            if (r10 == 0) goto L60
            y20.r r10 = new y20.r     // Catch: java.lang.Exception -> L20 java.util.concurrent.CancellationException -> L23
            r3 = r0
            y20.n r3 = (y20.n) r3     // Catch: java.lang.Exception -> L20 java.util.concurrent.CancellationException -> L23
            java.util.UUID r3 = r3.f310525a     // Catch: java.lang.Exception -> L20 java.util.concurrent.CancellationException -> L23
            r10.<init>(r8, r3)     // Catch: java.lang.Exception -> L20 java.util.concurrent.CancellationException -> L23
            goto L4f
        L60:
            boolean r10 = r0 instanceof y20.o     // Catch: java.lang.Exception -> L20 java.util.concurrent.CancellationException -> L23
            if (r10 == 0) goto Lac
            y20.s r10 = new y20.s     // Catch: java.lang.Exception -> L20 java.util.concurrent.CancellationException -> L23
            r3 = r0
            y20.o r3 = (y20.o) r3     // Catch: java.lang.Exception -> L20 java.util.concurrent.CancellationException -> L23
            v30.c0 r3 = r3.f310529a     // Catch: java.lang.Exception -> L20 java.util.concurrent.CancellationException -> L23
            r10.<init>(r8, r3)     // Catch: java.lang.Exception -> L20 java.util.concurrent.CancellationException -> L23
            goto L4f
        L6f:
            tb4.t r10 = r1.f310490a     // Catch: java.lang.Exception -> L20 java.util.concurrent.CancellationException -> L23
            r9.f305705w = r3     // Catch: java.lang.Exception -> L20 java.util.concurrent.CancellationException -> L23
            r9.v = r7     // Catch: java.lang.Exception -> L20 java.util.concurrent.CancellationException -> L23
            java.lang.Object r10 = r10.c(r3, r7, r9)     // Catch: java.lang.Exception -> L20 java.util.concurrent.CancellationException -> L23
            if (r10 != r2) goto L7c
            goto Lab
        L7c:
            java.util.List r10 = (java.util.List) r10     // Catch: java.lang.Exception -> L20 java.util.concurrent.CancellationException -> L23
            uvl.c r7 = r1.f310492c     // Catch: java.lang.Exception -> L20 java.util.concurrent.CancellationException -> L23
            r9.f305705w = r8     // Catch: java.lang.Exception -> L20 java.util.concurrent.CancellationException -> L23
            r9.v = r6     // Catch: java.lang.Exception -> L20 java.util.concurrent.CancellationException -> L23
            java.lang.Object r10 = r7.r(r10, r3, r9)     // Catch: java.lang.Exception -> L20 java.util.concurrent.CancellationException -> L23
            if (r10 != r2) goto L8b
            goto Lab
        L8b:
            r9.f305705w = r8     // Catch: java.lang.Exception -> L20 java.util.concurrent.CancellationException -> L23
            r9.v = r5     // Catch: java.lang.Exception -> L20 java.util.concurrent.CancellationException -> L23
            java.lang.Object r10 = y20.f.a(r1, r0, r9)     // Catch: java.lang.Exception -> L20 java.util.concurrent.CancellationException -> L23
            if (r10 != r2) goto L96
            goto Lab
        L96:
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: java.lang.Exception -> L20 java.util.concurrent.CancellationException -> L23
            boolean r10 = r10.booleanValue()     // Catch: java.lang.Exception -> L20 java.util.concurrent.CancellationException -> L23
            if (r10 == 0) goto La1
            kotlin.Unit r10 = kotlin.Unit.f186387a     // Catch: java.lang.Exception -> L20 java.util.concurrent.CancellationException -> L23
            return r10
        La1:
            r9.f305705w = r8     // Catch: java.lang.Exception -> L20 java.util.concurrent.CancellationException -> L23
            r9.v = r4     // Catch: java.lang.Exception -> L20 java.util.concurrent.CancellationException -> L23
            java.lang.Object r10 = y20.f.b(r1, r0, r9)     // Catch: java.lang.Exception -> L20 java.util.concurrent.CancellationException -> L23
            if (r10 != r2) goto Lbd
        Lab:
            return r2
        Lac:
            kotlin.NoWhenBranchMatchedException r10 = new kotlin.NoWhenBranchMatchedException     // Catch: java.lang.Exception -> L20 java.util.concurrent.CancellationException -> L23
            r10.<init>()     // Catch: java.lang.Exception -> L20 java.util.concurrent.CancellationException -> L23
            throw r10     // Catch: java.lang.Exception -> L20 java.util.concurrent.CancellationException -> L23
        Lb2:
            zhm.h0 r0 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r1 = rd0.d.f253311a
            rd0.c r1 = rd0.c.ERROR
            java.lang.String r2 = "Failed during eager history load"
            rd0.d.a(r1, r8, r2, r10, r0)
        Lbd:
            kotlin.Unit r10 = kotlin.Unit.f186387a
            return r10
        Lc0:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: xge.f.b(java.lang.Object):java.lang.Object");
    }

    private final Object c(Object obj2) {
        ProducerScope producerScope = (ProducerScope) this.f305705w;
        Object obj3 = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            Continuation continuation = null;
            j2 j2VarC = vkm.q.c(null);
            skm.e0.C(producerScope, null, null, new y3f.u(j2VarC, (y3f.v) this.f305707y, null), 3);
            vkm.y yVar = (vkm.y) this.f305706x;
            wa7.j jVar = new wa7.j(3, 14, continuation);
            gsh.m mVar = new gsh.m(producerScope, 5);
            this.f305705w = null;
            this.v = 1;
            Object objG = mif.e0.g(this, s1.f290118a, new c1((Function3) jVar, continuation, 15), mVar, new Flow[]{yVar, j2VarC});
            if (objG != fim.a.COROUTINE_SUSPENDED) {
                objG = Unit.f186387a;
            }
            if (objG == obj3) {
                return obj3;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        return Unit.f186387a;
    }

    private final Object n(Object obj2) {
        n1 n1Var = (n1) this.f305705w;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            if (n1Var instanceof l1) {
                y48.f fVar = (y48.f) this.f305706x;
                xb4.g gVar = new xb4.g(fVar, (n38.x) this.f305707y, null, 18);
                this.f305705w = null;
                this.v = 1;
                if (fVar.Y2(this, gVar) == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        return Unit.f186387a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x004b, code lost:
    
        if (r0.emit(r7, r6) == r1) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object o(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.f305706x
            kotlinx.coroutines.flow.FlowCollector r0 = (kotlinx.coroutines.flow.FlowCollector) r0
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r6.v
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L25
            if (r2 == r4) goto L1d
            if (r2 != r3) goto L15
            yhm.o.b(r7)
            goto L4e
        L15:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1d:
            java.lang.Object r0 = r6.f305705w
            kotlinx.coroutines.flow.FlowCollector r0 = (kotlinx.coroutines.flow.FlowCollector) r0
            yhm.o.b(r7)
            goto L41
        L25:
            yhm.o.b(r7)
            java.lang.Object r7 = r6.f305707y
            y52.b r7 = (y52.b) r7
            uw1.c r7 = r7.f310979a
            ty1.b r7 = (ty1.b) r7
            ufm.c r7 = r7.e()
            r6.f305706x = r5
            r6.f305705w = r0
            r6.v = r4
            java.lang.Object r7 = nim.a.b(r7, r6)
            if (r7 != r1) goto L41
            goto L4d
        L41:
            r6.f305706x = r5
            r6.f305705w = r5
            r6.v = r3
            java.lang.Object r7 = r0.emit(r7, r6)
            if (r7 != r1) goto L4e
        L4d:
            return r1
        L4e:
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: xge.f.o(java.lang.Object):java.lang.Object");
    }

    private final Object p(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            CobrandedCardsPlansService cobrandedCardsPlansService = ((y5b.c0) this.f305705w).f311026a;
            c5 c5Var = new c5((String) this.f305706x, (String) this.f305707y);
            this.v = 1;
            if (cobrandedCardsPlansService.selectReward(c5Var, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        return Unit.f186387a;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new f((ProductSpaceIdentifier) this.f305705w, (pie.v) this.f305706x, (g) this.f305707y, continuation, 0);
            case 1:
                return new f((xif.s) this.f305705w, (i7) this.f305706x, (BreadcrumbException) this.f305707y, continuation, 1);
            case 2:
                return new f((xif.s) this.f305705w, (ArrayList) this.f305706x, (BreadcrumbException) this.f305707y, continuation, 2);
            case 3:
                f fVar = new f((xka.z) this.f305707y, continuation, 3);
                fVar.f305706x = obj2;
                return fVar;
            case 4:
                return new f((xkl.i) this.f305705w, (String) this.f305706x, (oa2.b) this.f305707y, continuation, 4);
            case 5:
                f fVar2 = new f((Throwable) this.f305706x, (com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.flow.e) this.f305707y, continuation, 5);
                fVar2.f305705w = obj2;
                return fVar2;
            case 6:
                return new f((com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.flow.e) this.f305705w, (SavingsProductData) this.f305706x, (SavingsChallengeCreationData) this.f305707y, continuation, 6);
            case 7:
                f fVar3 = new f((com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.flow.e) this.f305707y, continuation, 7);
                fVar3.f305706x = obj2;
                return fVar3;
            case 8:
                return new f((com.revolut.sso.impl.ui.consent.app.b) this.f305705w, (String) this.f305706x, (ConsentChallenge) this.f305707y, continuation, 8);
            case 9:
                f fVar4 = new f((ufm.i) this.f305707y, continuation, 9);
                fVar4.f305706x = obj2;
                return fVar4;
            case 10:
                f fVar5 = new f((t0) this.f305706x, (AnalyticsAccountsSelection) this.f305707y, continuation, 10);
                fVar5.f305705w = obj2;
                return fVar5;
            case 11:
                f fVar6 = new f((a1) this.f305707y, continuation, 11);
                fVar6.f305706x = obj2;
                return fVar6;
            case 12:
                return new f((xo8.h0) this.f305705w, (ProductAccountId) this.f305706x, (io3.d) this.f305707y, continuation, 12);
            case 13:
                return new f((bs3.h) this.f305705w, (xr3.k) this.f305706x, (String) this.f305707y, continuation, 13);
            case 14:
                return new f((Set) this.f305705w, (xr3.k) this.f305706x, (w4l.k) this.f305707y, continuation, 14);
            case 15:
                return new f((xr3.l) this.f305705w, (d1) this.f305706x, (String) this.f305707y, continuation, 15);
            case 16:
                return new f((xr3.u) this.f305705w, (String) this.f305706x, (xp3.d) this.f305707y, continuation, 16);
            case 17:
                return new f((ft3.a1) this.f305705w, (xr3.g0) this.f305706x, (d1) this.f305707y, continuation, 17);
            case 18:
                f fVar7 = new f((xsh.r) this.f305706x, (String) this.f305707y, continuation, 18);
                fVar7.f305705w = obj2;
                return fVar7;
            case 19:
                return new f((com.revolut.feature.rev_points.giftcards.impl.ui.screen.purchase.a) this.f305705w, (VoucherProduct) this.f305706x, (String) this.f305707y, continuation, 19);
            case 20:
                return new f((com.revolut.feature.selfserve.sot.impl.ui.flow.e) this.f305705w, (IncomeSource) this.f305706x, (DocumentType) this.f305707y, continuation, 20);
            case 21:
                return new f((com.revolut.feature.payments.splitbill.impl.ui_new.recurring_split.d) this.f305705w, (RecurringSplitFlowContract$LaunchMode) this.f305706x, (LinkedHashMap) this.f305707y, continuation, 21);
            case 22:
                return new f((y20.p) this.f305706x, (y20.f) this.f305707y, continuation, 22);
            case 23:
                return new f((y24.a) this.f305705w, (ly3.g) this.f305706x, (h1) this.f305707y, continuation, 23);
            case 24:
                return new f((smd.s) this.f305705w, (az3.b) this.f305706x, (h1) this.f305707y, continuation, 24);
            case 25:
                f fVar8 = new f((vkm.y) this.f305706x, (y3f.v) this.f305707y, continuation, 25);
                fVar8.f305705w = obj2;
                return fVar8;
            case 26:
                f fVar9 = new f((y48.f) this.f305706x, (n38.x) this.f305707y, continuation, 26);
                fVar9.f305705w = obj2;
                return fVar9;
            case 27:
                f fVar10 = new f((y52.b) this.f305707y, continuation, 27);
                fVar10.f305706x = obj2;
                return fVar10;
            case 28:
                return new f((y5b.c0) this.f305705w, (String) this.f305706x, (String) this.f305707y, continuation, 28);
            default:
                return new f((y5g.k) this.f305705w, (n7g.c) this.f305706x, (String) this.f305707y, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((f) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0541  */
    /* JADX WARN: Type inference failed for: r16v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r18v12 */
    /* JADX WARN: Type inference failed for: r18v13 */
    /* JADX WARN: Type inference failed for: r18v14 */
    /* JADX WARN: Type inference failed for: r18v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r18v17 */
    /* JADX WARN: Type inference failed for: r19v15, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r1v121, types: [n7g.c] */
    /* JADX WARN: Type inference failed for: r1v122 */
    /* JADX WARN: Type inference failed for: r1v123 */
    /* JADX WARN: Type inference failed for: r1v124, types: [com.revolut.core.ui_kit.models.Style, java.lang.String, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v125 */
    /* JADX WARN: Type inference failed for: r1v128 */
    /* JADX WARN: Type inference failed for: r1v129 */
    /* JADX WARN: Type inference failed for: r1v130 */
    /* JADX WARN: Type inference failed for: r1v131 */
    /* JADX WARN: Type inference failed for: r2v68, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r2v69, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v70, types: [java.util.ArrayList] */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r36) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 3084
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xge.f.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(Object obj2, Object obj3, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f305706x = obj2;
        this.f305707y = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f305707y = obj2;
    }
}
