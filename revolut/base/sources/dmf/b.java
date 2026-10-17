package dmf;

import com.revolut.data.model.Data;
import d3c.b0;
import d3c.d0;
import fg8.m;
import gim.i;
import i9g.h;
import java.util.ArrayList;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicReferenceArray;
import k3c.p;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import pjl.z0;
import qei.n;
import ukm.q;

/* JADX INFO: loaded from: classes8.dex */
public final class b extends i implements Function2 {
    public Object A;
    public Object B;
    public final /* synthetic */ Object C;
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f116118w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Object f116119x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Object f116120y;
    public Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(int i, ArrayList arrayList, q qVar, FlowCollector flowCollector, AtomicReferenceArray atomicReferenceArray, Continuation continuation) {
        super(2, continuation);
        this.u = 0;
        this.f116118w = i;
        this.z = arrayList;
        this.A = qVar;
        this.B = flowCollector;
        this.C = atomicReferenceArray;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                b bVar = new b(this.f116118w, (ArrayList) this.z, (q) this.A, (FlowCollector) this.B, (AtomicReferenceArray) this.C, continuation);
                bVar.f116120y = obj2;
                return bVar;
            case 1:
                return new b((m) this.A, (String) this.B, (fo3.c) this.C, continuation, 1);
            case 2:
                b bVar2 = new b((h) this.B, (n) this.C, continuation);
                bVar2.f116120y = obj2;
                return bVar2;
            case 3:
                return new b((p) this.z, (b0) this.A, (String) this.B, (d0) this.C, continuation);
            case 4:
                return new b((z0) this.A, (cjl.b) this.B, (UUID) this.C, continuation, 4);
            default:
                b bVar3 = new b((vnb.h) this.C, continuation);
                bVar3.f116120y = obj2;
                return bVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((b) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((b) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((b) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((b) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 4:
                return ((b) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((b) create((Pair) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:137:0x03cf, code lost:
    
        if (r2 == r1) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x0421, code lost:
    
        if (r5 == r1) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:311:?, code lost:
    
        return r1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0409  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0435 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:267:0x06bf  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x06f4  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x00f6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:319:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:323:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0131 A[Catch: all -> 0x003f, TryCatch #3 {all -> 0x003f, blocks: (B:9:0x0038, B:44:0x012d, B:46:0x0131, B:48:0x0139), top: B:282:0x0038 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0182  */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v30 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v49, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v56 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v18, types: [com.revolut.core.ui_kit.models.Style, java.util.List] */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v22 */
    /* JADX WARN: Type inference failed for: r7v28 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:149:0x0421 -> B:151:0x0425). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:272:0x06f1 -> B:262:0x06a9). Please report as a decompilation issue!!! */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r53) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1798
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dmf.b.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(h hVar, n nVar, Continuation continuation) {
        super(2, continuation);
        this.u = 2;
        this.B = hVar;
        this.C = nVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(Object obj2, Object obj3, Object obj4, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.A = obj2;
        this.B = obj3;
        this.C = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(p pVar, b0 b0Var, String str, d0 d0Var, Continuation continuation) {
        super(2, continuation);
        this.u = 3;
        this.z = pVar;
        this.A = b0Var;
        this.B = str;
        this.C = d0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(vnb.h hVar, Continuation continuation) {
        super(2, continuation);
        this.u = 5;
        this.C = hVar;
    }
}
