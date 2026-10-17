package dp4;

import com.revolut.data.model.Data;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import k50.p4;
import k50.x4;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes22.dex */
public final class b1 extends gim.i implements Function2 {
    public final /* synthetic */ Object A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ int u;
    public long v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f116600w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Object f116601x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Object f116602y;
    public /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(long j2, String str, String str2, String str3, String str4, c1 c1Var, Continuation continuation) {
        super(2, continuation);
        this.u = 0;
        this.v = j2;
        this.f116601x = str;
        this.f116602y = str2;
        this.z = str3;
        this.A = str4;
        this.B = c1Var;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new b1(this.v, (String) this.f116601x, (String) this.f116602y, (String) this.z, (String) this.A, (c1) this.B, continuation);
            case 1:
                b1 b1Var = new b1((p4) this.A, (x4) this.B, continuation, 1);
                b1Var.z = obj2;
                return b1Var;
            case 2:
                b1 b1Var2 = new b1((ArrayList) this.z, (lr.p) this.A, (kr.d1) this.B, (String) this.f116601x, continuation);
                b1Var2.f116602y = obj2;
                return b1Var2;
            case 3:
                b1 b1Var3 = new b1((Ref$BooleanRef) this.z, (mti.g) this.A, (FlowCollector) this.B, (String) this.f116601x, this.v, continuation);
                b1Var3.f116602y = obj2;
                return b1Var3;
            case 4:
                w4l.f fVar = (w4l.f) this.f116602y;
                Object obj3 = this.z;
                scl.e eVar = (scl.e) this.A;
                TimeUnit timeUnit = TimeUnit.SECONDS;
                b1 b1Var4 = new b1(fVar, obj3, eVar, this.v, (se0.a) this.B, continuation);
                b1Var4.f116601x = obj2;
                return b1Var4;
            default:
                b1 b1Var5 = new b1((v2e.i0) this.A, (Data) this.B, continuation, 5);
                b1Var5.z = obj2;
                return b1Var5;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((b1) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((b1) create((FlowCollector) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((b1) create((ProducerScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((b1) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 4:
                return ((b1) create((ProducerScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((b1) create((FlowCollector) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Path cross not found for [B:78:0x01dc, B:81:0x01e6], limit reached: 199 */
    /* JADX WARN: Path cross not found for [B:81:0x01e6, B:93:0x021a], limit reached: 199 */
    /* JADX WARN: Path cross not found for [B:94:0x021c, B:97:0x0226], limit reached: 199 */
    /* JADX WARN: Path cross not found for [B:97:0x0226, B:107:0x0257], limit reached: 199 */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0378  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x038a  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:205:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:211:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01f0  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:105:0x0254 -> B:91:0x0216). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:108:0x0261 -> B:91:0x0216). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:160:0x0376 -> B:154:0x0344). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:162:0x0387 -> B:154:0x0344). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x00ec -> B:43:0x00ee). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:89:0x0213 -> B:91:0x0216). Please report as a decompilation issue!!! */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1004
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dp4.b1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b1(Object obj2, Object obj3, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.A = obj2;
        this.B = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(ArrayList arrayList, lr.p pVar, kr.d1 d1Var, String str, Continuation continuation) {
        super(2, continuation);
        this.u = 2;
        this.z = arrayList;
        this.A = pVar;
        this.B = d1Var;
        this.f116601x = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(Ref$BooleanRef ref$BooleanRef, mti.g gVar, FlowCollector flowCollector, String str, long j2, Continuation continuation) {
        super(2, continuation);
        this.u = 3;
        this.z = ref$BooleanRef;
        this.A = gVar;
        this.B = flowCollector;
        this.f116601x = str;
        this.v = j2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(w4l.f fVar, Object obj2, scl.e eVar, long j2, se0.a aVar, Continuation continuation) {
        super(2, continuation);
        this.u = 4;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        this.f116602y = fVar;
        this.z = obj2;
        this.A = eVar;
        this.v = j2;
        this.B = aVar;
    }
}
