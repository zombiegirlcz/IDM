package aug;

import dp4.c0;
import gim.i;
import hwi.v;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.Flow;
import svi.f0;
import ukm.q;

/* JADX INFO: loaded from: classes9.dex */
public final class c extends i implements Function2 {
    public final /* synthetic */ Object A;
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f9821w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Object f9822x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Object f9823y;
    public /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(int i, String str, f0 f0Var, v vVar, String str2, Continuation continuation) {
        super(2, continuation);
        this.u = 4;
        this.f9821w = i;
        this.A = str;
        this.f9822x = f0Var;
        this.f9823y = vVar;
        this.z = str2;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                c cVar = new c((d) this.f9823y, (String) this.A, continuation);
                cVar.z = obj2;
                return cVar;
            case 1:
                return new c((Flow) this.f9822x, (AtomicInteger) this.f9823y, (q) this.z, (AtomicReferenceArray) this.A, this.f9821w, continuation);
            case 2:
                return new c((dp4.q) this.f9822x, (String) this.A, (Set) this.f9823y, this.f9821w, (String) this.z, continuation, 2);
            case 3:
                return new c((c0) this.f9822x, (String) this.A, (Set) this.f9823y, this.f9821w, (String) this.z, continuation, 3);
            case 4:
                return new c(this.f9821w, (String) this.A, (f0) this.f9822x, (v) this.f9823y, (String) this.z, continuation);
            case 5:
                c cVar2 = new c((ix.b) this.A, continuation, 5);
                cVar2.z = obj2;
                return cVar2;
            case 6:
                c cVar3 = new c((jx.d) this.A, continuation, 6);
                cVar3.z = obj2;
                return cVar3;
            default:
                c cVar4 = new c((mx.b) this.A, continuation, 7);
                cVar4.z = obj2;
                return cVar4;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((c) create((lx.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0343  */
    /* JADX WARN: Type inference failed for: r1v17, types: [java.lang.Object, lx.a] */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19, types: [java.lang.AutoCloseable] */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v24, types: [java.lang.AutoCloseable] */
    /* JADX WARN: Type inference failed for: r1v30, types: [java.lang.Object, lx.a] */
    /* JADX WARN: Type inference failed for: r1v31 */
    /* JADX WARN: Type inference failed for: r1v32, types: [java.lang.AutoCloseable] */
    /* JADX WARN: Type inference failed for: r1v34 */
    /* JADX WARN: Type inference failed for: r1v36 */
    /* JADX WARN: Type inference failed for: r1v37, types: [java.lang.AutoCloseable] */
    /* JADX WARN: Type inference failed for: r1v43, types: [java.lang.Object, lx.a] */
    /* JADX WARN: Type inference failed for: r1v44 */
    /* JADX WARN: Type inference failed for: r1v45, types: [java.lang.AutoCloseable] */
    /* JADX WARN: Type inference failed for: r1v47 */
    /* JADX WARN: Type inference failed for: r1v49 */
    /* JADX WARN: Type inference failed for: r1v50, types: [java.lang.AutoCloseable] */
    /* JADX WARN: Type inference failed for: r1v55 */
    /* JADX WARN: Type inference failed for: r1v56 */
    /* JADX WARN: Type inference failed for: r1v57 */
    /* JADX WARN: Type inference failed for: r1v58 */
    /* JADX WARN: Type inference failed for: r1v59 */
    /* JADX WARN: Type inference failed for: r1v60 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v13, types: [java.lang.AutoCloseable] */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v18, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v20, types: [java.lang.AutoCloseable] */
    /* JADX WARN: Type inference failed for: r5v23 */
    /* JADX WARN: Type inference failed for: r5v24 */
    /* JADX WARN: Type inference failed for: r5v25, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v27, types: [java.lang.AutoCloseable] */
    /* JADX WARN: Type inference failed for: r5v28 */
    /* JADX WARN: Type inference failed for: r5v29 */
    /* JADX WARN: Type inference failed for: r5v30 */
    /* JADX WARN: Type inference failed for: r5v9 */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 866
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: aug.c.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, String str, Continuation continuation) {
        super(2, continuation);
        this.u = 0;
        this.f9823y = dVar;
        this.A = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(ex.a aVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.A = aVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(Object obj2, String str, Set set, int i, String str2, Continuation continuation, int i2) {
        super(2, continuation);
        this.u = i2;
        this.f9822x = obj2;
        this.A = str;
        this.f9823y = set;
        this.f9821w = i;
        this.z = str2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Flow flow, AtomicInteger atomicInteger, q qVar, AtomicReferenceArray atomicReferenceArray, int i, Continuation continuation) {
        super(2, continuation);
        this.u = 1;
        this.f9822x = flow;
        this.f9823y = atomicInteger;
        this.z = qVar;
        this.A = atomicReferenceArray;
        this.f9821w = i;
    }
}
