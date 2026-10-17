package b6i;

import com.revolut.feature_move_money.api.model.AccountWrapper;
import dfj.q1;
import java.time.Instant;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes10.dex */
public final class d0 extends gim.i implements Function2 {
    public final /* synthetic */ Object A;
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public long f12772w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Object f12773x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Object f12774y;
    public /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d0(long j2, q1 q1Var, Object obj2, String str, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f12772w = j2;
        this.f12774y = q1Var;
        this.z = obj2;
        this.A = str;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new d0((com.revolut.feature_move_money.impl.amount.c) this.f12773x, (AccountWrapper) this.f12774y, (AccountWrapper) this.z, this.f12772w, (j8l.d) this.A, continuation);
            case 1:
                return new d0((cuc.z) this.f12773x, (qtc.k) this.f12774y, this.f12772w, (Boolean) this.z, (String) this.A, continuation);
            case 2:
                d0 d0Var = new d0(this.f12772w, (q1) this.f12774y, (String) this.z, (String) this.A, continuation, 2);
                d0Var.f12773x = obj2;
                return d0Var;
            case 3:
                d0 d0Var2 = new d0(this.f12772w, (q1) this.f12774y, (Set) this.z, (String) this.A, continuation, 3);
                d0Var2.f12773x = obj2;
                return d0Var2;
            case 4:
                d0 d0Var3 = new d0((Function1) this.f12774y, this.f12772w, (zjh.c) this.z, (String) this.A, continuation, 4);
                d0Var3.f12773x = obj2;
                return d0Var3;
            case 5:
                d0 d0Var4 = new d0((uv.b) this.z, (jv.r) this.A, continuation, 5);
                d0Var4.f12774y = obj2;
                return d0Var4;
            case 6:
                d0 d0Var5 = new d0((l97.i0) this.A, continuation);
                d0Var5.z = obj2;
                return d0Var5;
            case 7:
                d0 d0Var6 = new d0((mti.l) this.f12774y, (String) this.z, (Ref$ObjectRef) this.A, this.f12772w, continuation);
                d0Var6.f12773x = obj2;
                return d0Var6;
            case 8:
                d0 d0Var7 = new d0((qqj.h) this.f12774y, (Long) this.z, this.f12772w, (List) this.A, continuation);
                d0Var7.f12773x = obj2;
                return d0Var7;
            case 9:
                TimeUnit timeUnit = TimeUnit.SECONDS;
                d0 d0Var8 = new d0(this.f12772w, (w4l.f) this.f12774y, this.z, (se0.a) this.A, continuation);
                d0Var8.f12773x = obj2;
                return d0Var8;
            case 10:
                d0 d0Var9 = new d0((Flow) this.f12774y, this.f12772w, (Function0) this.z, this.A, continuation, 10);
                d0Var9.f12773x = obj2;
                return d0Var9;
            case 11:
                d0 d0Var10 = new d0((wid.c) this.z, (Instant) this.A, continuation, 11);
                d0Var10.f12774y = obj2;
                return d0Var10;
            default:
                return new d0((y7d.x) this.z, (String) this.A, continuation, 12);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((d0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((d0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((d0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((d0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 4:
                return ((d0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 5:
                return ((d0) create((Pair) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 6:
                return ((d0) create((ProducerScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 7:
                return ((d0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 8:
                return ((d0) create((FlowCollector) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 9:
                return ((d0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 10:
                return ((d0) create((ProducerScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 11:
                return ((d0) create((FlowCollector) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((d0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:329:0x071f  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x0763  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x078d  */
    /* JADX WARN: Removed duplicated region for block: B:373:0x07e1  */
    /* JADX WARN: Removed duplicated region for block: B:381:0x0814  */
    /* JADX WARN: Removed duplicated region for block: B:388:0x082d  */
    /* JADX WARN: Removed duplicated region for block: B:389:0x082f  */
    /* JADX WARN: Removed duplicated region for block: B:390:0x0834  */
    /* JADX WARN: Removed duplicated region for block: B:410:0x086d  */
    /* JADX WARN: Removed duplicated region for block: B:418:0x08a8  */
    /* JADX WARN: Removed duplicated region for block: B:424:0x08bd  */
    /* JADX WARN: Removed duplicated region for block: B:425:0x08c2  */
    /* JADX WARN: Removed duplicated region for block: B:428:0x08c7  */
    /* JADX WARN: Removed duplicated region for block: B:434:0x08d2  */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v23, types: [pfj.i] */
    /* JADX WARN: Type inference failed for: r0v26 */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r0v35 */
    /* JADX WARN: Type inference failed for: r0v42, types: [com.revolut.retail.feature.esim.api.model.EsimPhoneNumberPortOutCredentials] */
    /* JADX WARN: Type inference failed for: r0v45 */
    /* JADX WARN: Type inference failed for: r0v46 */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v9, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r18v10 */
    /* JADX WARN: Type inference failed for: r18v11, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r18v12 */
    /* JADX WARN: Type inference failed for: r18v13 */
    /* JADX WARN: Type inference failed for: r18v2 */
    /* JADX WARN: Type inference failed for: r18v3 */
    /* JADX WARN: Type inference failed for: r18v37 */
    /* JADX WARN: Type inference failed for: r18v38 */
    /* JADX WARN: Type inference failed for: r18v39 */
    /* JADX WARN: Type inference failed for: r18v4, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r18v40 */
    /* JADX WARN: Type inference failed for: r18v41 */
    /* JADX WARN: Type inference failed for: r18v42 */
    /* JADX WARN: Type inference failed for: r18v5 */
    /* JADX WARN: Type inference failed for: r18v6 */
    /* JADX WARN: Type inference failed for: r18v9 */
    /* JADX WARN: Type inference failed for: r4v28, types: [int] */
    /* JADX WARN: Type inference failed for: r4v29 */
    /* JADX WARN: Type inference failed for: r4v30, types: [long] */
    /* JADX WARN: Type inference failed for: r4v37 */
    /* JADX WARN: Type inference failed for: r4v38 */
    /* JADX WARN: Type inference failed for: r4v39, types: [long] */
    /* JADX WARN: Type inference failed for: r4v40, types: [long] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v87 */
    /* JADX WARN: Type inference failed for: r4v88 */
    /* JADX WARN: Type inference failed for: r4v89 */
    /* JADX WARN: Type inference failed for: r4v90 */
    /* JADX WARN: Type inference failed for: r4v91 */
    /* JADX WARN: Type inference failed for: r5v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v17, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v56 */
    /* JADX WARN: Type inference failed for: r6v8, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:129:0x0326 -> B:123:0x02e8). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:167:0x03ce -> B:158:0x0391). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:229:0x0596 -> B:219:0x053f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:231:0x05a6 -> B:219:0x053f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:343:0x077b -> B:329:0x071f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:353:0x079a -> B:329:0x071f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:380:0x0812 -> B:468:0x0815). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:417:0x08a6 -> B:466:0x08a9). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:91:0x023f -> B:92:0x0240). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:97:0x0269 -> B:99:0x026c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r30) {
        /*
            Method dump skipped, instruction units count: 2464
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b6i.d0.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(long j2, w4l.f fVar, Object obj2, se0.a aVar, Continuation continuation) {
        super(2, continuation);
        this.u = 9;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        this.f12772w = j2;
        this.f12774y = fVar;
        this.z = obj2;
        this.A = aVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(com.revolut.feature_move_money.impl.amount.c cVar, AccountWrapper accountWrapper, AccountWrapper accountWrapper2, long j2, j8l.d dVar, Continuation continuation) {
        super(2, continuation);
        this.u = 0;
        this.f12773x = cVar;
        this.f12774y = accountWrapper;
        this.z = accountWrapper2;
        this.f12772w = j2;
        this.A = dVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(cuc.z zVar, qtc.k kVar, long j2, Boolean bool, String str, Continuation continuation) {
        super(2, continuation);
        this.u = 1;
        this.f12773x = zVar;
        this.f12774y = kVar;
        this.f12772w = j2;
        this.z = bool;
        this.A = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d0(Object obj2, long j2, Object obj3, Object obj4, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f12774y = obj2;
        this.f12772w = j2;
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
    public d0(l97.i0 i0Var, Continuation continuation) {
        super(2, continuation);
        this.u = 6;
        this.A = i0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(mti.l lVar, String str, Ref$ObjectRef ref$ObjectRef, long j2, Continuation continuation) {
        super(2, continuation);
        this.u = 7;
        this.f12774y = lVar;
        this.z = str;
        this.A = ref$ObjectRef;
        this.f12772w = j2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(qqj.h hVar, Long l2, long j2, List list, Continuation continuation) {
        super(2, continuation);
        this.u = 8;
        this.f12774y = hVar;
        this.z = l2;
        this.f12772w = j2;
        this.A = list;
    }
}
