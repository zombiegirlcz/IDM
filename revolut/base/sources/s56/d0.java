package s56;

import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.extensions.rx.BreadcrumbException;
import com.revolut.core.model.account.AccountId;
import com.revolut.feature.apm.core.models.alias.Alias;
import com.revolut.feature.backgroundpicker.api.model.ChosenBackground;
import com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.details.models.IncomeSorterDetailsDiff;
import com.revolut.feature.subaccount.api.models.SubaccountType;
import com.revolut.feature.subaccount.impl.ui.create.flow.main.CreateSubaccountFlowContract$SubaccountInfo;
import com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value;
import com.revolut.feature.tab.accounts.models.ProductAccountId;
import com.revolut.feature.topup_screen.common.CardDetails;
import com.revolut.feature_move_money.api.model.AccountWrapper;
import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.retail.feature.balance.picker.api.models.BalanceWrapper;
import ft3.h1;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.flow.FlowCollector;
import nii.n1;
import tof.q6;
import vch.y0;

/* JADX INFO: loaded from: classes3.dex */
public final class d0 extends gim.i implements Function2 {
    public final /* synthetic */ Object A;
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Object f259944w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Object f259945x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Object f259946y;
    public final /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d0(int i, Object obj2, Object obj3, Object obj4, Object obj5, Continuation continuation) {
        super(2, continuation);
        this.u = i;
        this.f259945x = obj2;
        this.f259946y = obj3;
        this.z = obj4;
        this.A = obj5;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x008a, code lost:
    
        if (r11.send(r10, r0) == r1) goto L25;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r8v0, types: [hlm.a, hlm.c] */
    /* JADX WARN: Type inference failed for: r8v1, types: [hlm.a] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2, types: [hlm.a] */
    /* JADX WARN: Type inference failed for: r8v3, types: [hlm.a] */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(hlm.c r8, kotlin.jvm.internal.Ref$IntRef r9, java.util.List r10, ukm.q r11, gim.c r12) {
        /*
            boolean r0 = r12 instanceof wx3.a
            if (r0 == 0) goto L13
            r0 = r12
            wx3.a r0 = (wx3.a) r0
            int r1 = r0.A
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.A = r1
            goto L18
        L13:
            wx3.a r0 = new wx3.a
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.z
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.A
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L4a
            if (r2 == r4) goto L37
            if (r2 != r3) goto L2f
            hlm.a r8 = r0.f300746x
            yhm.o.b(r12)     // Catch: java.lang.Throwable -> L2d
            goto L8d
        L2d:
            r9 = move-exception
            goto L95
        L2f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L37:
            int r8 = r0.f300747y
            hlm.a r9 = r0.f300746x
            ukm.q r11 = r0.f300745w
            java.util.List r10 = r0.v
            java.util.List r10 = (java.util.List) r10
            kotlin.jvm.internal.Ref$IntRef r2 = r0.u
            yhm.o.b(r12)
            r12 = r8
            r8 = r9
            r9 = r2
            goto L64
        L4a:
            yhm.o.b(r12)
            r0.u = r9
            r12 = r10
            java.util.List r12 = (java.util.List) r12
            r0.v = r12
            r0.f300745w = r11
            r0.f300746x = r8
            r12 = 0
            r0.f300747y = r12
            r0.A = r4
            java.lang.Object r2 = r8.lock(r5, r0)
            if (r2 != r1) goto L64
            goto L8c
        L64:
            int r2 = r9.f186408a     // Catch: java.lang.Throwable -> L2d
            int r2 = r2 + r4
            r9.f186408a = r2     // Catch: java.lang.Throwable -> L2d
            double r6 = (double) r2     // Catch: java.lang.Throwable -> L2d
            int r9 = r10.size()     // Catch: java.lang.Throwable -> L2d
            double r9 = (double) r9     // Catch: java.lang.Throwable -> L2d
            double r6 = r6 / r9
            r9 = 100
            double r9 = (double) r9     // Catch: java.lang.Throwable -> L2d
            double r6 = r6 * r9
            int r9 = (int) r6     // Catch: java.lang.Throwable -> L2d
            java.lang.Integer r10 = new java.lang.Integer     // Catch: java.lang.Throwable -> L2d
            r10.<init>(r9)     // Catch: java.lang.Throwable -> L2d
            r0.u = r5     // Catch: java.lang.Throwable -> L2d
            r0.v = r5     // Catch: java.lang.Throwable -> L2d
            r0.f300745w = r5     // Catch: java.lang.Throwable -> L2d
            r0.f300746x = r8     // Catch: java.lang.Throwable -> L2d
            r0.f300747y = r12     // Catch: java.lang.Throwable -> L2d
            r0.A = r3     // Catch: java.lang.Throwable -> L2d
            java.lang.Object r9 = r11.send(r10, r0)     // Catch: java.lang.Throwable -> L2d
            if (r9 != r1) goto L8d
        L8c:
            return r1
        L8d:
            kotlin.Unit r9 = kotlin.Unit.f186387a     // Catch: java.lang.Throwable -> L2d
            r8.unlock(r5)
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        L95:
            r8.unlock(r5)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: s56.d0.b(hlm.c, kotlin.jvm.internal.Ref$IntRef, java.util.List, ukm.q, gim.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v6, types: [int] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r14v0, types: [hlm.e, hlm.h, hlm.i] */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v16 */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v14, types: [hlm.e] */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v7, types: [hlm.e] */
    /* JADX WARN: Type inference failed for: r6v9 */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:41:0x00de
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(hlm.i r14, wx3.c r15, ft3.h1 r16, kotlinx.coroutines.CoroutineScope r17, ry3.a r18, gim.c r19) {
        /*
            Method dump skipped, instruction units count: 244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s56.d0.c(hlm.i, wx3.c, ft3.h1, kotlinx.coroutines.CoroutineScope, ry3.a, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00bb, code lost:
    
        if (r14.deleteWalletBudget(r3, r9, r13) == r0) goto L34;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object n(java.lang.Object r14) {
        /*
            Method dump skipped, instruction units count: 221
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s56.d0.n(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0072, code lost:
    
        if (vkm.q.u(r0, r10, r9) == r1) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object o(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r0 = r9.f259944w
            kotlinx.coroutines.flow.FlowCollector r0 = (kotlinx.coroutines.flow.FlowCollector) r0
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r9.v
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L2c
            if (r2 == r4) goto L1d
            if (r2 != r3) goto L15
            yhm.o.b(r10)
            goto L75
        L15:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L1d:
            java.lang.Object r0 = r9.f259946y
            cuc.r r0 = (cuc.r) r0
            java.lang.Object r2 = r9.f259945x
            kotlinx.coroutines.flow.FlowCollector r2 = (kotlinx.coroutines.flow.FlowCollector) r2
            yhm.o.b(r10)
            r8 = r2
            r2 = r0
            r0 = r8
            goto L46
        L2c:
            yhm.o.b(r10)
            java.lang.Object r10 = r9.z
            ufm.d r10 = (ufm.d) r10
            java.lang.Object r2 = r10.f279875a
            cuc.r r2 = (cuc.r) r2
            r9.f259944w = r5
            r9.f259945x = r0
            r9.f259946y = r2
            r9.v = r4
            java.lang.Object r10 = r10.c(r9)
            if (r10 != r1) goto L46
            goto L74
        L46:
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r4 = r9.A
            java.lang.String r4 = (java.lang.String) r4
            r2.getClass()
            java.lang.String r6 = "transactionId"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r6)
            java.lang.String r6 = "loadingStrategy"
            w4l.i r7 = w4l.i.f294643c
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r6)
            x4l.c r2 = r2.e
            cuc.m r6 = new cuc.m
            r6.<init>(r10, r4)
            vkm.d r10 = r2.b(r6, r7)
            r9.f259944w = r5
            r9.f259945x = r5
            r9.f259946y = r5
            r9.v = r3
            java.lang.Object r10 = vkm.q.u(r0, r10, r9)
            if (r10 != r1) goto L75
        L74:
            return r1
        L75:
            kotlin.Unit r10 = kotlin.Unit.f186387a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: s56.d0.o(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003d A[PHI: r9
      0x003d: PHI (r9v5 java.lang.Object) = (r9v4 java.lang.Object), (r9v17 java.lang.Object) binds: [B:12:0x003a, B:9:0x001b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0045  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x008f -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object p(java.lang.Object r9) throws java.lang.Throwable {
        /*
            r8 = this;
            java.lang.Object r0 = r8.z
            rwa.i r0 = (rwa.i) r0
            java.util.List r1 = r0.f257870a
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r8.v
            r4 = 2
            r5 = 1
            if (r3 == 0) goto L23
            if (r3 == r5) goto L1b
            if (r3 != r4) goto L13
            goto L23
        L13:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L1b:
            yhm.o.b(r9)
            yhm.m r9 = (yhm.m) r9
            java.lang.Object r9 = r9.f314193a
            goto L3d
        L23:
            yhm.o.b(r9)
        L26:
            java.lang.Object r9 = r8.f259944w
            wwa.f r9 = (wwa.f) r9
            dxa.e r9 = r9.f300642a
            java.lang.Object r3 = r8.f259945x
            pwa.n r3 = (pwa.n) r3
            java.lang.Object r6 = r8.f259946y
            java.util.ArrayList r6 = (java.util.ArrayList) r6
            r8.v = r5
            java.lang.Object r9 = r9.a(r3, r6, r8)
            if (r9 != r2) goto L3d
            goto L91
        L3d:
            yhm.m$a r3 = yhm.m.INSTANCE
            boolean r3 = r9 instanceof yhm.n
            if (r3 == 0) goto L45
            r3 = 0
            goto L46
        L45:
            r3 = r9
        L46:
            java.util.List r3 = (java.util.List) r3
            java.util.Collection r3 = (java.util.Collection) r3
            if (r3 == 0) goto L7d
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L53
            goto L7d
        L53:
            java.util.List r9 = r0.f257871b
            boolean r9 = r9.isEmpty()
            if (r9 == 0) goto L61
            rwa.k r9 = new rwa.k
            r9.<init>(r1)
            return r9
        L61:
            r9 = r1
            java.util.Collection r9 = (java.util.Collection) r9
            boolean r9 = r9.isEmpty()
            if (r9 != 0) goto L70
            rwa.m r9 = new rwa.m
            r9.<init>(r1)
            return r9
        L70:
            rwa.l r9 = new rwa.l
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Should not reach here. No created users, but messages were sent with no error."
            r0.<init>(r1)
            r9.<init>(r0)
            return r9
        L7d:
            java.lang.Object r3 = r8.A
            kotlin.jvm.internal.Ref$ObjectRef r3 = (kotlin.jvm.internal.Ref$ObjectRef) r3
            java.lang.Throwable r9 = yhm.m.a(r9)
            r3.f186409a = r9
            r8.v = r4
            r6 = 1000(0x3e8, double:4.94E-321)
            java.lang.Object r9 = skm.k0.b(r6, r8)
            if (r9 != r2) goto L26
        L91:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: s56.d0.p(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00f3, code lost:
    
        if (r1 == r8) goto L30;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v3, types: [kotlin.coroutines.CoroutineContext, skm.d0] */
    /* JADX WARN: Type inference failed for: r6v3, types: [kotlin.coroutines.Continuation] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object s(java.lang.Object r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 257
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s56.d0.s(java.lang.Object):java.lang.Object");
    }

    private final Object t(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            xd2.f fVar = (xd2.f) this.f259944w;
            String str = (String) this.f259945x;
            Alias alias = (Alias) this.f259946y;
            String str2 = ((jx1.e) ((jx1.g) this.z)).f179045a;
            this.v = 1;
            fVar.getClass();
            obj2 = pu7.a.B(fVar.e, "DENY_CLAIM_TASK_ID", new uv1.c0(fVar, str, alias, str2, (Continuation) null), this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        ((u6b.k) this.A).invoke((zz1.e) obj2);
        return Unit.f186387a;
    }

    private final Object u(Object obj2) {
        n1 n1Var = (n1) this.f259944w;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            xdk.g gVar = (xdk.g) this.f259945x;
            eim.c cVar = (eim.c) this.f259946y;
            AccountId accountId = (AccountId) this.z;
            String str = (String) this.A;
            this.f259944w = null;
            this.v = 1;
            if (xdk.g.c3(gVar, cVar, n1Var, accountId, str, this) == aVar) {
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

    private final Object v(Object obj2) {
        FlowCollector flowCollector = (FlowCollector) this.f259944w;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            pn2.c cVar = new pn2.c((String) this.f259945x, (q6) this.f259946y, (xif.o) this.z, flowCollector, (w4l.k) this.A, (Continuation) null);
            this.f259944w = null;
            this.v = 1;
            if (skm.e0.o(cVar, this) == aVar) {
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
                d0 d0Var = new d0(0, (List) this.f259945x, (i0) this.f259946y, (wk5.a) this.z, (xi0.b) this.A, continuation);
                d0Var.f259944w = obj2;
                return d0Var;
            case 1:
                d0 d0Var2 = new d0((com.revolut.feature.defi.remittances.impl.ui.send.amount.b) this.z, (w4l.k) this.A, continuation, 1);
                d0Var2.f259944w = obj2;
                return d0Var2;
            case 2:
                d0 d0Var3 = new d0(2, (s78.m) this.f259945x, (String) this.f259946y, (String) this.z, (ProductAccountId) this.A, continuation);
                d0Var3.f259944w = obj2;
                return d0Var3;
            case 3:
                return new d0((com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.review.i) this.f259944w, (IncomeSorterDetailsDiff) this.f259945x, (String) this.f259946y, (String) this.z, (Boolean) this.A, continuation, 3);
            case 4:
                return new d0((com.revolut.feature.card_design.impl.card_design.carousel.e) this.f259944w, (mg3.c) this.f259945x, (hha.d) this.f259946y, (h93.l0) this.z, (String) this.A, continuation, 4);
            case 5:
                return new d0((com.revolut.feature.subaccount.impl.ui.create.flow.main.c) this.f259944w, (SubaccountType) this.f259946y, (CreateSubaccountFlowContract$SubaccountInfo) this.z, (List) this.f259945x, (t7e.c) this.A, continuation);
            case 6:
                return new d0((com.revolut.feature.subaccount.impl.ui.qr_link.a) this.f259944w, (String) this.f259945x, (SubaccountType) this.f259946y, (xi0.b) this.A, (ChosenBackground) this.z, continuation);
            case 7:
                return new d0((te8.y) this.f259944w, (pe8.e) this.f259945x, (Function1) this.f259946y, (Function2) this.z, (Function2) this.A, continuation, 7);
            case 8:
                d0 d0Var4 = new d0(8, (BalanceWrapper) this.f259945x, (ulf.i) this.f259946y, (AccountWrapper) this.z, (dj0.d) this.A, continuation);
                d0Var4.f259944w = obj2;
                return d0Var4;
            case 9:
                d0 d0Var5 = new d0(9, (List) this.f259945x, (ulf.i) this.f259946y, (AccountWrapper) this.z, (dj0.d) this.A, continuation);
                d0Var5.f259944w = obj2;
                return d0Var5;
            case 10:
                d0 d0Var6 = new d0(10, (ulf.q) this.f259945x, (BalanceWrapper) this.f259946y, (AccountWrapper) this.z, (dj0.d) this.A, continuation);
                d0Var6.f259944w = obj2;
                return d0Var6;
            case 11:
                d0 d0Var7 = new d0(11, (List) this.f259945x, (ulf.q) this.f259946y, (AccountWrapper) this.z, (dj0.d) this.A, continuation);
                d0Var7.f259944w = obj2;
                return d0Var7;
            case 12:
                return new d0(this.f259944w, this.f259945x, (xi0.b) this.A, (Serializable) this.f259946y, this.z, continuation, 12);
            case 13:
                return new d0((com.revolut.feature.topup_screen.impl.screens.card_details.b) this.f259944w, (CardDetails) this.f259945x, (yte.a) this.f259946y, (Boolean) this.z, (t61.j) this.A, continuation, 13);
            case 14:
                return new d0(14, (com.revolut.feature.wealth.impl.ui.flows.withdraw.b) this.f259945x, (dj0.d) this.f259946y, (efl.h) this.z, (y0) this.A, continuation);
            case 15:
                d0 d0Var8 = new d0((vge.x) this.f259946y, (ProductAccountDescriptor$Value) this.z, (pfe.b) this.A, continuation, 15);
                d0Var8.f259944w = obj2;
                return d0Var8;
            case 16:
                d0 d0Var9 = new d0(16, (Ref$ObjectRef) this.f259945x, (vv.d) this.f259946y, (ProducerScope) this.z, (Ref$BooleanRef) this.A, continuation);
                d0Var9.f259944w = obj2;
                return d0Var9;
            case 17:
                d0 d0Var10 = new d0((wdb.n) this.z, (String) this.A, continuation, 17);
                d0Var10.f259944w = obj2;
                return d0Var10;
            case 18:
                d0 d0Var11 = new d0((jg0.a) this.f259946y, (toh.d) this.z, (String) this.A, continuation, 18);
                d0Var11.f259944w = obj2;
                return d0Var11;
            case 19:
                d0 d0Var12 = new d0(19, (wh3.i) this.f259945x, (AccountId) this.f259946y, (AnalyticsProduct) this.z, (NaviCommand) this.A, continuation);
                d0Var12.f259944w = obj2;
                return d0Var12;
            case 20:
                d0 d0Var13 = new d0(20, (hd.e) this.f259945x, (String) this.f259946y, (gkl.m) this.z, (Set) this.A, continuation);
                d0Var13.f259944w = obj2;
                return d0Var13;
            case 21:
                return new d0(this.f259944w, this.f259945x, (xi0.b) this.A, (Serializable) this.f259946y, this.z, continuation, 21);
            case 22:
                d0 d0Var14 = new d0((lzi.z) this.f259946y, (wqj.j) this.z, (String) this.A, continuation, 22);
                d0Var14.f259944w = obj2;
                return d0Var14;
            case 23:
                d0 d0Var15 = new d0((ufm.d) this.z, (String) this.A, continuation, 23);
                d0Var15.f259944w = obj2;
                return d0Var15;
            case 24:
                return new d0((wwa.f) this.f259944w, (pwa.n) this.f259945x, (ArrayList) this.f259946y, (rwa.i) this.z, (Ref$ObjectRef) this.A, continuation, 24);
            case 25:
                d0 d0Var16 = new d0(25, (List) this.f259945x, (wx3.c) this.f259946y, (h1) this.z, (ukm.q) this.A, continuation);
                d0Var16.f259944w = obj2;
                return d0Var16;
            case 26:
                return new d0((xd2.f) this.f259944w, (String) this.f259945x, (Alias) this.f259946y, (jx1.g) this.z, (u6b.k) this.A, continuation, 26);
            case 27:
                d0 d0Var17 = new d0(27, (xdk.g) this.f259945x, (eim.c) this.f259946y, (AccountId) this.z, (String) this.A, continuation);
                d0Var17.f259944w = obj2;
                return d0Var17;
            case 28:
                d0 d0Var18 = new d0(28, (String) this.f259945x, (q6) this.f259946y, (xif.o) this.z, (w4l.k) this.A, continuation);
                d0Var18.f259944w = obj2;
                return d0Var18;
            default:
                return new d0((xif.s) this.f259946y, (List) this.f259945x, (String) this.z, (BreadcrumbException) this.A, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((d0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((d0) create((FlowCollector) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((d0) create((FlowCollector) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((d0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 4:
                return ((d0) create((FlowCollector) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 5:
                return ((d0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 6:
                return ((d0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 7:
                return ((d0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 8:
                return ((d0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 9:
                return ((d0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 10:
                return ((d0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 11:
                return ((d0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 12:
                return ((d0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 13:
                return ((d0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 14:
                return ((d0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 15:
                return ((d0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 16:
                return ((d0) create((xv.l) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 17:
                return ((d0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 18:
                return ((d0) create((FlowCollector) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 19:
                return ((d0) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 20:
                return ((d0) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 21:
                return ((d0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 22:
                return ((d0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 23:
                return ((d0) create((FlowCollector) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 24:
                return ((d0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 25:
                return ((d0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 26:
                return ((d0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 27:
                return ((d0) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 28:
                return ((d0) create((FlowCollector) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((d0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x024f A[Catch: Exception -> 0x01ed, TryCatch #0 {Exception -> 0x01ed, blocks: (B:88:0x01e8, B:91:0x01f2, B:118:0x0283, B:107:0x0238, B:109:0x024f, B:112:0x0260, B:115:0x0271, B:119:0x0286, B:92:0x01f9, B:95:0x0202, B:96:0x0206, B:106:0x0236, B:97:0x020c, B:103:0x0226, B:100:0x0213), top: B:486:0x01d4 }] */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0286 A[Catch: Exception -> 0x01ed, TRY_LEAVE, TryCatch #0 {Exception -> 0x01ed, blocks: (B:88:0x01e8, B:91:0x01f2, B:118:0x0283, B:107:0x0238, B:109:0x024f, B:112:0x0260, B:115:0x0271, B:119:0x0286, B:92:0x01f9, B:95:0x0202, B:96:0x0206, B:106:0x0236, B:97:0x020c, B:103:0x0226, B:100:0x0213), top: B:486:0x01d4 }] */
    /* JADX WARN: Removed duplicated region for block: B:181:0x03b9  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0524  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x053f  */
    /* JADX WARN: Removed duplicated region for block: B:462:0x0a13  */
    /* JADX WARN: Removed duplicated region for block: B:526:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:554:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:555:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:556:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:116:0x0280 -> B:118:0x0283). Please report as a decompilation issue!!! */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2832
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s56.d0.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(com.revolut.feature.subaccount.impl.ui.create.flow.main.c cVar, SubaccountType subaccountType, CreateSubaccountFlowContract$SubaccountInfo createSubaccountFlowContract$SubaccountInfo, List list, t7e.c cVar2, Continuation continuation) {
        super(2, continuation);
        this.u = 5;
        this.f259944w = cVar;
        this.f259946y = subaccountType;
        this.z = createSubaccountFlowContract$SubaccountInfo;
        this.f259945x = list;
        this.A = cVar2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(com.revolut.feature.subaccount.impl.ui.qr_link.a aVar, String str, SubaccountType subaccountType, xi0.b bVar, ChosenBackground chosenBackground, Continuation continuation) {
        super(2, continuation);
        this.u = 6;
        this.f259944w = aVar;
        this.f259945x = str;
        this.f259946y = subaccountType;
        this.A = bVar;
        this.z = chosenBackground;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d0(Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f259944w = obj2;
        this.f259945x = obj3;
        this.f259946y = obj4;
        this.z = obj5;
        this.A = obj6;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d0(Object obj2, Object obj3, Object obj4, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f259946y = obj2;
        this.z = obj3;
        this.A = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d0(Object obj2, Object obj3, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.z = obj2;
        this.A = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d0(Object obj2, Object obj3, xi0.b bVar, Serializable serializable, Object obj4, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f259944w = obj2;
        this.f259945x = obj3;
        this.A = bVar;
        this.f259946y = serializable;
        this.z = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(xif.s sVar, List list, String str, BreadcrumbException breadcrumbException, Continuation continuation) {
        super(2, continuation);
        this.u = 29;
        this.f259946y = sVar;
        this.f259945x = list;
        this.z = str;
        this.A = breadcrumbException;
    }
}
