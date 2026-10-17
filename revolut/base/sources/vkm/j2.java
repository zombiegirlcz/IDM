package vkm;

import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.MutableStateFlow;
import yhm.m;

/* JADX INFO: loaded from: classes13.dex */
public final class j2 extends wkm.a implements MutableStateFlow, Flow, wkm.q {
    public static final /* synthetic */ AtomicReferenceFieldUpdater f = AtomicReferenceFieldUpdater.newUpdater(j2.class, Object.class, "_state$volatile");
    private volatile /* synthetic */ Object _state$volatile;
    public int e;

    public j2(Object obj2) {
        this._state$volatile = obj2;
    }

    @Override // wkm.a
    public final wkm.c b() {
        return new k2();
    }

    @Override // wkm.a
    public final wkm.c[] c() {
        return new k2[2];
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0078, code lost:
    
        if (((vkm.m2) r11).a(r0) == r1) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00ac, code lost:
    
        if (r11.equals(r12) == false) goto L46;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:44:0x00a8, B:46:0x00ae], limit reached: 61 */
    /* JADX WARN: Path cross not found for [B:46:0x00ae, B:44:0x00a8], limit reached: 61 */
    /* JADX WARN: Path cross not found for [B:46:0x00ae, B:54:0x00c9], limit reached: 61 */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009a A[Catch: all -> 0x0038, TryCatch #0 {all -> 0x0038, blocks: (B:14:0x0034, B:36:0x0092, B:38:0x009a, B:41:0x00a1, B:42:0x00a5, B:44:0x00a8, B:54:0x00c9, B:57:0x00d9, B:46:0x00ae, B:50:0x00b5, B:21:0x004d, B:24:0x0058, B:35:0x0083), top: B:62:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a8 A[Catch: all -> 0x0038, TryCatch #0 {all -> 0x0038, blocks: (B:14:0x0034, B:36:0x0092, B:38:0x009a, B:41:0x00a1, B:42:0x00a5, B:44:0x00a8, B:54:0x00c9, B:57:0x00d9, B:46:0x00ae, B:50:0x00b5, B:21:0x004d, B:24:0x0058, B:35:0x0083), top: B:62:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00d9 A[Catch: all -> 0x0038, TRY_LEAVE, TryCatch #0 {all -> 0x0038, blocks: (B:14:0x0034, B:36:0x0092, B:38:0x009a, B:41:0x00a1, B:42:0x00a5, B:44:0x00a8, B:54:0x00c9, B:57:0x00d9, B:46:0x00ae, B:50:0x00b5, B:21:0x004d, B:24:0x0058, B:35:0x0083), top: B:62:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v2, types: [wkm.c] */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v6, types: [vkm.k2] */
    /* JADX WARN: Type inference failed for: r6v7, types: [vkm.k2] */
    /* JADX WARN: Type inference failed for: r8v1, types: [wkm.a] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v5, types: [vkm.j2] */
    /* JADX WARN: Type inference failed for: r8v6, types: [java.lang.Object, vkm.j2] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:56:0x00d8 -> B:36:0x0092). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:58:0x00e9 -> B:36:0x0092). Please report as a decompilation issue!!! */
    @Override // kotlinx.coroutines.flow.Flow
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector r11, kotlin.coroutines.Continuation r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: vkm.j2.collect(kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // kotlinx.coroutines.flow.SharedFlow
    public final List d() {
        return zhm.u.c(getValue());
    }

    @Override // kotlinx.coroutines.flow.MutableSharedFlow, kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj2, Continuation continuation) {
        setValue(obj2);
        return Unit.f186387a;
    }

    @Override // wkm.q
    public final Flow f(CoroutineContext coroutineContext, int i, ukm.f fVar) {
        return (((i < 0 || i >= 2) && i != -2) || fVar != ukm.f.DROP_OLDEST) ? q.D(this, coroutineContext, i, fVar) : this;
    }

    public final boolean g(Object obj2, Object obj3) {
        int i;
        wkm.c[] cVarArr;
        cfm.c cVar;
        synchronized (this) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f;
            Object obj4 = atomicReferenceFieldUpdater.get(this);
            if (obj2 != null && !Intrinsics.f(obj4, obj2)) {
                return false;
            }
            if (Intrinsics.f(obj4, obj3)) {
                return true;
            }
            atomicReferenceFieldUpdater.set(this, obj3);
            int i2 = this.e;
            if ((i2 & 1) != 0) {
                this.e = i2 + 2;
                return true;
            }
            int i3 = i2 + 1;
            this.e = i3;
            wkm.c[] cVarArr2 = this.f298300a;
            Unit unit = Unit.f186387a;
            while (true) {
                k2[] k2VarArr = (k2[]) cVarArr2;
                if (k2VarArr != null) {
                    for (k2 k2Var : k2VarArr) {
                        if (k2Var != null) {
                            AtomicReference atomicReference = k2Var.f290058a;
                            while (true) {
                                Object objF = zkm.b.f(atomicReference);
                                if (objF != null && objF != (cVar = q.e)) {
                                    cfm.c cVar2 = q.d;
                                    if (objF != cVar2) {
                                        while (!atomicReference.compareAndSet(objF, cVar2)) {
                                            if (atomicReference.get() != objF) {
                                                break;
                                            }
                                        }
                                        m.Companion aVar = yhm.m.INSTANCE;
                                        ((skm.l) objF).resumeWith(Unit.f186387a);
                                        break;
                                    }
                                    while (!atomicReference.compareAndSet(objF, cVar)) {
                                        if (atomicReference.get() != objF) {
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                synchronized (this) {
                    i = this.e;
                    if (i == i3) {
                        this.e = i3 + 1;
                        return true;
                    }
                    cVarArr = this.f298300a;
                    Unit unit2 = Unit.f186387a;
                }
                cVarArr2 = cVarArr;
                i3 = i;
            }
        }
    }

    @Override // kotlinx.coroutines.flow.MutableStateFlow, kotlinx.coroutines.flow.StateFlow
    public final Object getValue() {
        cfm.c cVar = wkm.b.f298304b;
        Object obj2 = f.get(this);
        if (obj2 == cVar) {
            return null;
        }
        return obj2;
    }

    @Override // kotlinx.coroutines.flow.MutableStateFlow
    public final boolean h(Object obj2, Object obj3) {
        cfm.c cVar = wkm.b.f298304b;
        if (obj2 == null) {
            obj2 = cVar;
        }
        if (obj3 == null) {
            obj3 = cVar;
        }
        return g(obj2, obj3);
    }

    @Override // kotlinx.coroutines.flow.MutableSharedFlow
    public final void i() {
        throw new UnsupportedOperationException("MutableStateFlow.resetReplayCache is not supported");
    }

    @Override // kotlinx.coroutines.flow.MutableSharedFlow
    public final boolean k(Object obj2) {
        setValue(obj2);
        return true;
    }

    @Override // kotlinx.coroutines.flow.MutableStateFlow
    public final void setValue(Object obj2) {
        if (obj2 == null) {
            obj2 = wkm.b.f298304b;
        }
        g(null, obj2);
    }
}
