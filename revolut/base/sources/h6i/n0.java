package h6i;

import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes10.dex */
public final class n0 extends gim.i implements Function2 {
    public Object A;
    public Object B;
    public Object C;
    public Object D;
    public final /* synthetic */ Object E;
    public final /* synthetic */ int u;
    public Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Object f149694w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f149695x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f149696y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n0(Object obj2, Object obj3, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.D = obj2;
        this.E = obj3;
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [gim.i, kotlin.jvm.functions.Function3] */
    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new n0((k1j.b) this.E, (p0) this.B, continuation);
            case 1:
                return new n0((e93.g0) this.D, (com.revolut.feature.card_personalisation.generation.impl.ui.generation.a) this.E, continuation, 1);
            case 2:
                n0 n0Var = new n0((t9l.g) this.D, (Set) this.E, continuation, 2);
                n0Var.f149694w = obj2;
                return n0Var;
            case 3:
                n0 n0Var2 = new n0((u29.m) this.E, continuation);
                n0Var2.D = obj2;
                return n0Var2;
            default:
                n0 n0Var3 = new n0(continuation, (Function0) this.f149694w, (gim.i) this.D, (FlowCollector) this.E, (Flow[]) this.v);
                n0Var3.C = obj2;
                return n0Var3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((n0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((n0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((n0) create((FlowCollector) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((n0) create((f19.g) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((n0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:195:0x010d, code lost:
    
        if (r7 != 0) goto L42;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0303 A[Catch: all -> 0x01fb, TryCatch #1 {all -> 0x01fb, blocks: (B:74:0x01f6, B:139:0x03d9, B:79:0x0216, B:136:0x03bd, B:82:0x0235, B:133:0x03a3, B:85:0x024a, B:124:0x034e, B:88:0x0261, B:119:0x0328, B:121:0x0334, B:125:0x0352, B:126:0x0368, B:128:0x036e, B:129:0x037a, B:91:0x027e, B:114:0x0303, B:115:0x0307, B:94:0x0293, B:101:0x02c5, B:105:0x02d4, B:109:0x02df, B:97:0x02a5), top: B:194:0x01d2 }] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0307 A[Catch: all -> 0x01fb, TryCatch #1 {all -> 0x01fb, blocks: (B:74:0x01f6, B:139:0x03d9, B:79:0x0216, B:136:0x03bd, B:82:0x0235, B:133:0x03a3, B:85:0x024a, B:124:0x034e, B:88:0x0261, B:119:0x0328, B:121:0x0334, B:125:0x0352, B:126:0x0368, B:128:0x036e, B:129:0x037a, B:91:0x027e, B:114:0x0303, B:115:0x0307, B:94:0x0293, B:101:0x02c5, B:105:0x02d4, B:109:0x02df, B:97:0x02a5), top: B:194:0x01d2 }] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0334 A[Catch: all -> 0x01fb, TryCatch #1 {all -> 0x01fb, blocks: (B:74:0x01f6, B:139:0x03d9, B:79:0x0216, B:136:0x03bd, B:82:0x0235, B:133:0x03a3, B:85:0x024a, B:124:0x034e, B:88:0x0261, B:119:0x0328, B:121:0x0334, B:125:0x0352, B:126:0x0368, B:128:0x036e, B:129:0x037a, B:91:0x027e, B:114:0x0303, B:115:0x0307, B:94:0x0293, B:101:0x02c5, B:105:0x02d4, B:109:0x02df, B:97:0x02a5), top: B:194:0x01d2 }] */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0352 A[Catch: all -> 0x01fb, TryCatch #1 {all -> 0x01fb, blocks: (B:74:0x01f6, B:139:0x03d9, B:79:0x0216, B:136:0x03bd, B:82:0x0235, B:133:0x03a3, B:85:0x024a, B:124:0x034e, B:88:0x0261, B:119:0x0328, B:121:0x0334, B:125:0x0352, B:126:0x0368, B:128:0x036e, B:129:0x037a, B:91:0x027e, B:114:0x0303, B:115:0x0307, B:94:0x0293, B:101:0x02c5, B:105:0x02d4, B:109:0x02df, B:97:0x02a5), top: B:194:0x01d2 }] */
    /* JADX WARN: Removed duplicated region for block: B:135:0x03bc  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x03d8  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x03ea  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x046c A[Catch: Exception -> 0x0446, TryCatch #0 {Exception -> 0x0446, blocks: (B:154:0x043d, B:168:0x049e, B:162:0x0466, B:164:0x046c, B:169:0x04a8, B:161:0x0452), top: B:192:0x041c }] */
    /* JADX WARN: Removed duplicated region for block: B:169:0x04a8 A[Catch: Exception -> 0x0446, TRY_LEAVE, TryCatch #0 {Exception -> 0x0446, blocks: (B:154:0x043d, B:168:0x049e, B:162:0x0466, B:164:0x046c, B:169:0x04a8, B:161:0x0452), top: B:192:0x041c }] */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0520  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x054a  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x054e  */
    /* JADX WARN: Removed duplicated region for block: B:201:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c9 A[LOOP:0: B:27:0x00c9->B:35:0x00ea, LOOP_START, PHI: r7 r14
      0x00c9: PHI (r7v12 int) = (r7v11 int), (r7v13 int) binds: [B:25:0x00c4, B:35:0x00ea] A[DONT_GENERATE, DONT_INLINE]
      0x00c9: PHI (r14v20 kotlin.collections.IndexedValue) = (r14v19 kotlin.collections.IndexedValue), (r14v23 kotlin.collections.IndexedValue) binds: [B:25:0x00c4, B:35:0x00ea] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01c2  */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v22, types: [int] */
    /* JADX WARN: Type inference failed for: r0v24, types: [int] */
    /* JADX WARN: Type inference failed for: r0v35, types: [int] */
    /* JADX WARN: Type inference failed for: r0v37, types: [int] */
    /* JADX WARN: Type inference failed for: r0v64 */
    /* JADX WARN: Type inference failed for: r0v65 */
    /* JADX WARN: Type inference failed for: r0v66 */
    /* JADX WARN: Type inference failed for: r0v67 */
    /* JADX WARN: Type inference failed for: r0v68 */
    /* JADX WARN: Type inference failed for: r0v69 */
    /* JADX WARN: Type inference failed for: r0v70 */
    /* JADX WARN: Type inference failed for: r2v37, types: [gim.i, kotlin.jvm.functions.Function3] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9, types: [boolean, int] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:167:0x049d -> B:168:0x049e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:185:0x053f -> B:187:0x0542). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x010a -> B:42:0x010d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x0124 -> B:42:0x010d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:61:0x01b3 -> B:63:0x01b6). Please report as a decompilation issue!!! */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            Method dump skipped, instruction units count: 1400
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: h6i.n0.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(k1j.b bVar, p0 p0Var, Continuation continuation) {
        super(2, continuation);
        this.u = 0;
        this.E = bVar;
        this.B = p0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public n0(Continuation continuation, Function0 function0, Function3 function3, FlowCollector flowCollector, Flow[] flowArr) {
        super(2, continuation);
        this.u = 4;
        this.v = flowArr;
        this.f149694w = function0;
        this.D = (gim.i) function3;
        this.E = flowCollector;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(u29.m mVar, Continuation continuation) {
        super(2, continuation);
        this.u = 3;
        this.E = mVar;
    }
}
