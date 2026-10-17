package k0g;

import aci.d;
import com.revolut.feature.product_article.api.models.ProductArticleParams;
import com.revolut.feature.subscriptions.models.RecurringPaymentAccount;
import com.revolut.feature.tab.accounts.models.ProductAccountId;
import com.revolut.feature.tab.accounts.models.ProductId;
import com.revolut.retail.feature.payments.bank_transfer.api.navigation.BankTransferFlowInputData;
import fmc.z;
import ft3.h1;
import gim.i;
import h30.q;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import jf7.j1;
import k1a.g;
import k37.f;
import k49.l;
import k4k.e;
import k50.j4;
import k64.h;
import k79.r;
import k7c.g0;
import kc9.m;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.flow.FlowCollector;
import nii.n1;
import org.joda.time.Instant;
import u2f.j;
import u2f.p;
import v20.n;
import vkm.e0;
import yhm.o;

/* JADX INFO: loaded from: classes9.dex */
public final class b extends i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Object f180039w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Object f180040x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f180041y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public b(com.revolut.feature.rewards.impl.ui.details.flow.b bVar, String str, Function1 function1, Continuation continuation) {
        super(2, continuation);
        this.u = 26;
        this.f180040x = bVar;
        this.f180039w = str;
        this.f180041y = (i) function1;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [gim.i, kotlin.jvm.functions.Function1] */
    private final Object b(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
            return obj2;
        }
        o.b(obj2);
        com.revolut.feature.rewards.impl.ui.details.flow.b bVar = (com.revolut.feature.rewards.impl.ui.details.flow.b) this.f180040x;
        String str = (String) this.f180039w;
        ?? r3 = (i) this.f180041y;
        this.v = 1;
        Object objB = pu7.a.B(bVar.k, str, r3, this);
        return objB == aVar ? aVar : objB;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0091, code lost:
    
        if (com.revolut.feature.crypto.receive_widget.impl.ui.customize.c.K2(r0, r3, r9, r1, r8) == r2) goto L34;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object c(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.Object r0 = r8.f180041y
            com.revolut.feature.crypto.receive_widget.impl.ui.customize.c r0 = (com.revolut.feature.crypto.receive_widget.impl.ui.customize.c) r0
            java.lang.Object r1 = r8.f180039w
            vj5.b r1 = (vj5.b) r1
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r8.v
            r4 = 1
            r5 = 2
            r6 = 0
            if (r3 == 0) goto L2f
            if (r3 == r4) goto L22
            if (r3 != r5) goto L1a
            yhm.o.b(r9)
            goto L94
        L1a:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L22:
            java.lang.Object r3 = r8.f180040x
            xi0.b r3 = (xi0.b) r3
            yhm.o.b(r9)     // Catch: java.lang.Exception -> L2a java.util.concurrent.CancellationException -> L2c
            goto L4f
        L2a:
            r9 = move-exception
            goto L52
        L2c:
            r9 = move-exception
            goto Lab
        L2f:
            yhm.o.b(r9)
            xi0.a r9 = xi0.b.Companion
            java.lang.String r3 = r1.f289647a
            r9.getClass()
            xi0.b r3 = xi0.a.a(r3)
            k49.f r9 = new k49.f     // Catch: java.lang.Exception -> L2a java.util.concurrent.CancellationException -> L2c
            r7 = 11
            r9.<init>(r0, r3, r6, r7)     // Catch: java.lang.Exception -> L2a java.util.concurrent.CancellationException -> L2c
            r8.f180040x = r3     // Catch: java.lang.Exception -> L2a java.util.concurrent.CancellationException -> L2c
            r8.v = r4     // Catch: java.lang.Exception -> L2a java.util.concurrent.CancellationException -> L2c
            java.lang.Object r9 = r0.p2(r8, r9)     // Catch: java.lang.Exception -> L2a java.util.concurrent.CancellationException -> L2c
            if (r9 != r2) goto L4f
            goto L93
        L4f:
            java.util.List r9 = (java.util.List) r9     // Catch: java.lang.Exception -> L2a java.util.concurrent.CancellationException -> L2c
            goto L5c
        L52:
            zhm.h0 r4 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r7 = rd0.d.f253311a
            rd0.c r7 = rd0.c.ERROR
            rd0.d.a(r7, r6, r6, r9, r4)
            r9 = r6
        L5c:
            r4 = r9
            java.util.Collection r4 = (java.util.Collection) r4
            if (r4 == 0) goto L97
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto L68
            goto L97
        L68:
            int r4 = r9.size()
            if (r4 < r5) goto L7f
            java.lang.String r1 = r1.f289647a
            yki.a r0 = r0.A
            com.revolut.feature.crypto.receive_widget.impl.ui.customize.CryptoReceiveWidgetCustomizationContract$Step$SelectNetwork r2 = new com.revolut.feature.crypto.receive_widget.impl.ui.customize.CryptoReceiveWidgetCustomizationContract$Step$SelectNetwork
            r2.<init>(r1, r9)
            com.revolut.kompot.common.ModalDestination$Style$BOTTOM_DIALOG r9 = com.revolut.kompot.common.ModalDestination.Style.BOTTOM_DIALOG.f98301a
            oki.h.z2(r0, r2, r9)
            kotlin.Unit r9 = kotlin.Unit.f186387a
            return r9
        L7f:
            java.lang.String r3 = r3.f306286a
            java.lang.Object r9 = zhm.d0.b0(r9)
            wk5.a r9 = (wk5.a) r9
            java.lang.String r1 = r1.f289648b
            r8.f180040x = r6
            r8.v = r5
            java.lang.Object r9 = com.revolut.feature.crypto.receive_widget.impl.ui.customize.c.K2(r0, r3, r9, r1, r8)
            if (r9 != r2) goto L94
        L93:
            return r2
        L94:
            kotlin.Unit r9 = kotlin.Unit.f186387a
            return r9
        L97:
            k8e.a r9 = new k8e.a
            r2 = 16
            r9.<init>(r0, r1, r2)
            ka9.b r1 = new ka9.b
            r2 = 19
            r1.<init>(r2)
            r0.L2(r9, r1)
            kotlin.Unit r9 = kotlin.Unit.f186387a
            return r9
        Lab:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: k0g.b.c(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [gim.i, kotlin.jvm.functions.Function1] */
    private final Object n(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            o.b(obj2);
            FlowCollector flowCollector = (FlowCollector) this.f180039w;
            e0 e0Var = (e0) this.f180040x;
            d dVar = new d(flowCollector, (Function1) this.f180041y);
            this.f180039w = null;
            this.v = 1;
            if (e0Var.collect(dVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        return Unit.f186387a;
    }

    /* JADX WARN: Type inference failed for: r1v24, types: [gim.i, kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r1v26, types: [gim.i, kotlin.jvm.functions.Function1] */
    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                b bVar = new b((c) this.f180041y, continuation, 0);
                bVar.f180039w = obj2;
                return bVar;
            case 1:
                b bVar2 = new b((g) this.f180040x, (String) this.f180041y, continuation, 1);
                bVar2.f180039w = obj2;
                return bVar2;
            case 2:
                b bVar3 = new b((List) this.f180040x, (g) this.f180041y, continuation, 2);
                bVar3.f180039w = obj2;
                return bVar3;
            case 3:
                return new b((String) this.f180040x, (j) this.f180039w, (k1f.d) this.f180041y, continuation, 3);
            case 4:
                return new b((z) this.f180040x, (p) this.f180039w, (String) this.f180041y, continuation, 4);
            case 5:
                return new b((com.revolut.feature.freelancer.impl.ui.tax_hub.payment.assessment.b) this.f180040x, (ArrayList) this.f180039w, (f) this.f180041y, continuation, 5);
            case 6:
                return new b((k44.c) this.f180040x, (fz3.b) this.f180039w, (h1) this.f180041y, continuation, 6);
            case 7:
                b bVar4 = new b(this.f180040x, (l) this.f180041y, continuation, 7);
                bVar4.f180039w = obj2;
                return bVar4;
            case 8:
                b bVar5 = new b((e) this.f180040x, (BankTransferFlowInputData) this.f180041y, continuation, 8);
                bVar5.f180039w = obj2;
                return bVar5;
            case 9:
                return new b((j4) this.f180041y, continuation, 9);
            case 10:
                return new b((j4) this.f180040x, (Instant) this.f180039w, (n) this.f180041y, continuation, 10);
            case 11:
                return new b((n) this.f180040x, (j4) this.f180039w, (UUID) this.f180041y, continuation, 11);
            case 12:
                return new b((j4) this.f180040x, (UUID) this.f180039w, (t50.i) this.f180041y, continuation, 12);
            case 13:
                b bVar6 = new b((vkm.d) this.f180040x, continuation, (j4) this.f180041y);
                bVar6.f180039w = obj2;
                return bVar6;
            case 14:
                return new b((h) this.f180040x, (String) this.f180039w, (j64.a) this.f180041y, continuation, 14);
            case 15:
                return new b((com.revolut.feature.credit.loan.impl.ui.rev10.cancellation_v2.flow.a) this.f180040x, (z45.e) this.f180039w, (String) this.f180041y, continuation, 15);
            case 16:
                return new b((r) this.f180040x, (g79.a) this.f180039w, (ProductArticleParams) this.f180041y, continuation, 16);
            case 17:
                b bVar7 = new b((r) this.f180040x, (s69.j) this.f180041y, continuation, 17);
                bVar7.f180039w = obj2;
                return bVar7;
            case 18:
                return new b((g0) this.f180040x, (String) this.f180039w, (s7c.a) this.f180041y, continuation, 18);
            case 19:
                return new b(this.f180039w, this.f180041y, false, continuation, 19);
            case 20:
                b bVar8 = new b((m) this.f180040x, (Throwable) this.f180041y, continuation, 20);
                bVar8.f180039w = obj2;
                return bVar8;
            case 21:
                b bVar9 = new b((kg7.f) this.f180040x, (j1) this.f180041y, continuation, 21);
                bVar9.f180039w = obj2;
                return bVar9;
            case 22:
                return new b((kge.d) this.f180040x, (ProductId) this.f180039w, (ProductAccountId) this.f180041y, continuation, 22);
            case 23:
                b bVar10 = new b((kge.d) this.f180040x, (String) this.f180041y, continuation, 23);
                bVar10.f180039w = obj2;
                return bVar10;
            case 24:
                b bVar11 = new b((q) this.f180040x, (RecurringPaymentAccount) this.f180041y, continuation, 24);
                bVar11.f180039w = obj2;
                return bVar11;
            case 25:
                b bVar12 = new b((ff4.q) this.f180040x, (com.revolut.feature.credit.application.plugins.impl.ui.refinancing_offer.b) this.f180041y, continuation, 25);
                bVar12.f180039w = obj2;
                return bVar12;
            case 26:
                return new b((com.revolut.feature.rewards.impl.ui.details.flow.b) this.f180040x, (String) this.f180039w, (Function1) this.f180041y, continuation);
            case 27:
                return new b(this.f180039w, this.f180041y, false, continuation, 27);
            case 28:
                b bVar13 = new b((e0) this.f180040x, continuation, (Function1) this.f180041y);
                bVar13.f180039w = obj2;
                return bVar13;
            default:
                return new b((km2.r) this.f180040x, (km2.j) this.f180039w, (km2.j) this.f180041y, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((b) create((FlowCollector) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((b) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((b) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((b) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 4:
                return ((b) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 5:
                return ((b) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 6:
                return ((b) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 7:
                return ((b) create((i49.c) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 8:
                return ((b) create((do3.n) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 9:
                return ((b) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 10:
                return ((b) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 11:
                return ((b) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 12:
                return ((b) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 13:
                return ((b) create((FlowCollector) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 14:
                return ((b) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 15:
                return ((b) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 16:
                return ((b) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 17:
                return ((b) create((ProducerScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 18:
                return ((b) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 19:
                return ((b) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 20:
                return ((b) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 21:
                return ((b) create((FlowCollector) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 22:
                return ((b) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 23:
                return ((b) create((FlowCollector) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 24:
                return ((b) create((ProducerScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 25:
                return ((b) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 26:
                return ((b) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 27:
                return ((b) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 28:
                return ((b) create((FlowCollector) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((b) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:302:0x06e2  */
    /* JADX WARN: Removed duplicated region for block: B:385:0x0892  */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v2 */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r27) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 2766
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k0g.b.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(Object obj2, Object obj3, Object obj4, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f180040x = obj2;
        this.f180039w = obj3;
        this.f180041y = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(Object obj2, Object obj3, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f180040x = obj2;
        this.f180041y = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(Object obj2, Object obj3, boolean z, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f180039w = obj2;
        this.f180041y = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f180041y = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(vkm.d dVar, Continuation continuation, j4 j4Var) {
        super(2, continuation);
        this.u = 13;
        this.f180040x = dVar;
        this.f180041y = j4Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public b(e0 e0Var, Continuation continuation, Function1 function1) {
        super(2, continuation);
        this.u = 28;
        this.f180040x = e0Var;
        this.f180041y = (i) function1;
    }
}
