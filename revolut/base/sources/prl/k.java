package prl;

import com.revolut.feature.backend_flow.domain.models.BackendFlow;
import com.revolut.feature.terms.api.model.TermsScope;
import com.revolut.retail.feature.payments.bank_transfer.api.navigation.BankTransferData;
import ft3.h1;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import k4l.s0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import pti.z;
import q97.f2;
import q97.k2;
import q97.y1;
import retrofit2.Response;

/* JADX INFO: loaded from: classes12.dex */
public final class k extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f239336w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Object f239337x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f239338y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(int i, Object obj2, Object obj3, String str, Continuation continuation) {
        super(2, continuation);
        this.u = i;
        this.f239337x = obj2;
        this.f239338y = obj3;
        this.f239336w = str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00d5, code lost:
    
        if (r2.emit(r11, r17) == r3) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00f7, code lost:
    
        if (r2.emit(r11, r17) == r3) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a8 A[PHI: r4
      0x00a8: PHI (r4v12 java.lang.Object) = (r4v11 java.lang.Object), (r4v19 java.lang.Object) binds: [B:23:0x00a5, B:13:0x002e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00d8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object b(java.lang.Object r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 259
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: prl.k.b(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [gim.i, kotlin.jvm.functions.Function2] */
    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new k((l) this.f239337x, (String) this.f239336w, (xi0.b) this.f239338y, continuation, 0);
            case 1:
                return new k((r) this.f239337x, (String) this.f239336w, (k4l.r) this.f239338y, continuation, 1);
            case 2:
                return new k((r) this.f239337x, (String) this.f239336w, (s0) this.f239338y, continuation, 2);
            case 3:
                k kVar = new k((ptd.b) this.f239338y, continuation, 3);
                kVar.f239336w = obj2;
                return kVar;
            case 4:
                return new k((com.revolut.feature.workflow.engine.onboarding.impl.workflow.a) this.f239336w, (cp6.d) this.f239338y, continuation, 4);
            case 5:
                k kVar2 = new k((z) this.f239338y, continuation, 5);
                kVar2.f239336w = obj2;
                return kVar2;
            case 6:
                return new k((Response) this.f239337x, (Function2) this.f239336w, (z) this.f239338y, continuation);
            case 7:
                return new k((dx8.e) this.f239337x, (com.revolut.feature.kyc.impl.flow.kyc.a) this.f239336w, (wi0.b) this.f239338y, continuation, 7);
            case 8:
                return new k(8, (pz1.b) this.f239338y, (String) this.f239336w, continuation);
            case 9:
                k kVar3 = new k((pzh.c) this.f239338y, continuation, 9);
                kVar3.f239336w = obj2;
                return kVar3;
            case 10:
                k kVar4 = new k((q12.f) this.f239336w, (t02.g) this.f239338y, continuation, 10);
                kVar4.f239337x = obj2;
                return kVar4;
            case 11:
                k kVar5 = new k(11, (q13.d) this.f239338y, (String) this.f239336w, continuation);
                kVar5.f239337x = obj2;
                return kVar5;
            case 12:
                return new k((q24.c) this.f239337x, (String) this.f239336w, (BackendFlow) this.f239338y, continuation, 12);
            case 13:
                return new k(13, (uu3.a) this.f239337x, (q24.c) this.f239338y, (String) this.f239336w, continuation);
            case 14:
                return new k(14, (q24.e) this.f239337x, (h1) this.f239338y, (String) this.f239336w, continuation);
            case 15:
                return new k((q24.e) this.f239337x, (h1) this.f239336w, (List) this.f239338y, continuation, 15);
            case 16:
                return new k((com.revolut.feature.store.impl.ui.brand_detail.flow.c) this.f239336w, (TermsScope) this.f239338y, continuation, 16);
            case 17:
                return new k((q2l.c) this.f239337x, (String) this.f239336w, (Map) this.f239338y, continuation, 17);
            case 18:
                return new k((q2l.c) this.f239337x, (String) this.f239336w, (ArrayList) this.f239338y, continuation, 18);
            case 19:
                return new k((q4k.h) this.f239337x, (f5j.a) this.f239336w, (BankTransferData) this.f239338y, continuation, 19);
            case 20:
                k kVar6 = new k((q65.m) this.f239338y, continuation, 20);
                kVar6.f239336w = obj2;
                return kVar6;
            case 21:
                k kVar7 = new k(21, (q7c.j) this.f239338y, (String) this.f239336w, continuation);
                kVar7.f239337x = obj2;
                return kVar7;
            case 22:
                k kVar8 = new k((com.revolut.feature.credit.application.plugins.impl.ui.debts.c) this.f239336w, (pu3.d) this.f239338y, continuation, 22);
                kVar8.f239337x = obj2;
                return kVar8;
            case 23:
                k kVar9 = new k((y1) this.f239338y, continuation, 23);
                kVar9.f239336w = obj2;
                return kVar9;
            case 24:
                k kVar10 = new k((f2) this.f239338y, continuation, 24);
                kVar10.f239336w = obj2;
                return kVar10;
            case 25:
                k kVar11 = new k((y1) this.f239338y, continuation, 25);
                kVar11.f239336w = obj2;
                return kVar11;
            case 26:
                k kVar12 = new k((k2) this.f239338y, continuation, 26);
                kVar12.f239336w = obj2;
                return kVar12;
            case 27:
                k kVar13 = new k((q9c.l) this.f239336w, (q9c.b) this.f239338y, continuation, 27);
                kVar13.f239337x = obj2;
                return kVar13;
            case 28:
                return new k((qac.i) this.f239337x, (String) this.f239336w, (String) this.f239338y, continuation, 28);
            default:
                k kVar14 = new k((com.revolut.feature.cash_topup.impl.ui.amount.c) this.f239338y, continuation, 29);
                kVar14.f239336w = obj2;
                return kVar14;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((k) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((k) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((k) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((k) create((FlowCollector) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 4:
                return ((k) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 5:
                return ((k) create((Response) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 6:
                return ((k) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 7:
                return ((k) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 8:
                return ((k) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 9:
                return ((k) create((FlowCollector) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 10:
                return ((k) create((FlowCollector) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 11:
                return ((k) create((FlowCollector) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 12:
                return ((k) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 13:
                return ((k) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 14:
                return ((k) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 15:
                return ((k) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 16:
                return ((k) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 17:
                return ((k) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 18:
                return ((k) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 19:
                return ((k) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 20:
                return ((k) create((FlowCollector) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 21:
                return ((k) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 22:
                return ((k) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 23:
                return ((k) create((FlowCollector) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 24:
                return ((k) create((FlowCollector) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 25:
                return ((k) create((FlowCollector) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 26:
                return ((k) create((FlowCollector) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 27:
                return ((k) create((FlowCollector) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 28:
                return ((k) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((k) create((dj0.d) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0415  */
    /* JADX WARN: Type inference failed for: r3v33, types: [gim.i, kotlin.jvm.functions.Function2] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r9v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r9v12 */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2788
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: prl.k.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(int i, Object obj2, String str, Continuation continuation) {
        super(2, continuation);
        this.u = i;
        this.f239338y = obj2;
        this.f239336w = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(Object obj2, Object obj3, Object obj4, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f239337x = obj2;
        this.f239336w = obj3;
        this.f239338y = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(Object obj2, Object obj3, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f239336w = obj2;
        this.f239338y = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f239338y = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public k(Response response, Function2 function2, z zVar, Continuation continuation) {
        super(2, continuation);
        this.u = 6;
        this.f239337x = response;
        this.f239336w = (gim.i) function2;
        this.f239338y = zVar;
    }
}
