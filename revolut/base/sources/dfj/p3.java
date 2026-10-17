package dfj;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes11.dex */
public final class p3 extends gim.i implements Function2 {
    public int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Function1 f114068w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ q3 f114069x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p3(Function1 function1, q3 q3Var, Continuation continuation) {
        super(2, continuation);
        this.f114068w = function1;
        this.f114069x = q3Var;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new p3(this.f114068w, this.f114069x, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((p3) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x00cd, code lost:
    
        if (skm.k0.c(r6, r9) == r0) goto L59;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004d A[Catch: Exception -> 0x0026, TryCatch #1 {Exception -> 0x0026, blocks: (B:25:0x0047, B:27:0x004d, B:29:0x0057, B:31:0x005b, B:36:0x0064, B:38:0x0067, B:41:0x0079, B:43:0x007d, B:45:0x0083, B:46:0x0088, B:11:0x0021, B:16:0x002b), top: B:65:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0057 A[Catch: Exception -> 0x0026, TryCatch #1 {Exception -> 0x0026, blocks: (B:25:0x0047, B:27:0x004d, B:29:0x0057, B:31:0x005b, B:36:0x0064, B:38:0x0067, B:41:0x0079, B:43:0x007d, B:45:0x0083, B:46:0x0088, B:11:0x0021, B:16:0x002b), top: B:65:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0036 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x0076 -> B:60:0x00d0). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:58:0x00cd -> B:60:0x00d0). Please report as a decompilation issue!!! */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            Method dump skipped, instruction units count: 224
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dfj.p3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
