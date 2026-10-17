package ob0;

import com.revolut.feature.backend_flow.domain.models.BackendFlowBinary;
import com.revolut.feature.backend_flow.domain.models.BackendFlowFile;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes19.dex */
public final class h extends gim.i implements Function2 {
    public int A;
    public int B;
    public /* synthetic */ Object C;
    public final /* synthetic */ BackendFlowBinary D;
    public final /* synthetic */ i E;
    public final /* synthetic */ String F;
    public BackendFlowFile u;
    public i v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public String f223821w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f223822x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f223823y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(BackendFlowBinary backendFlowBinary, i iVar, String str, Continuation continuation) {
        super(2, continuation);
        this.D = backendFlowBinary;
        this.E = iVar;
        this.F = str;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        h hVar = new h(this.D, this.E, this.F, continuation);
        hVar.C = obj2;
        return hVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((h) create((FlowCollector) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x009b, code lost:
    
        if (r0.emit(r9, r17) == r2) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0140, code lost:
    
        if (r0.emit(r5, r17) == r2) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0158, code lost:
    
        if (r0.emit(r3, r17) == r2) goto L65;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a9 A[Catch: CancellationException -> 0x002b, Exception -> 0x0143, TryCatch #1 {CancellationException -> 0x002b, blocks: (B:8:0x0026, B:13:0x0038, B:59:0x0124, B:36:0x00a9, B:40:0x00cb, B:43:0x00d3, B:45:0x00d8, B:48:0x00df, B:50:0x00e4, B:53:0x0100, B:49:0x00e2, B:55:0x0103, B:60:0x012c, B:17:0x004f, B:20:0x0062, B:34:0x009f), top: B:72:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d3 A[Catch: CancellationException -> 0x002b, Exception -> 0x0143, TRY_ENTER, TryCatch #1 {CancellationException -> 0x002b, blocks: (B:8:0x0026, B:13:0x0038, B:59:0x0124, B:36:0x00a9, B:40:0x00cb, B:43:0x00d3, B:45:0x00d8, B:48:0x00df, B:50:0x00e4, B:53:0x0100, B:49:0x00e2, B:55:0x0103, B:60:0x012c, B:17:0x004f, B:20:0x0062, B:34:0x009f), top: B:72:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0103 A[Catch: CancellationException -> 0x002b, Exception -> 0x0143, TryCatch #1 {CancellationException -> 0x002b, blocks: (B:8:0x0026, B:13:0x0038, B:59:0x0124, B:36:0x00a9, B:40:0x00cb, B:43:0x00d3, B:45:0x00d8, B:48:0x00df, B:50:0x00e4, B:53:0x0100, B:49:0x00e2, B:55:0x0103, B:60:0x012c, B:17:0x004f, B:20:0x0062, B:34:0x009f), top: B:72:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x012c A[Catch: CancellationException -> 0x002b, Exception -> 0x0143, TRY_LEAVE, TryCatch #1 {CancellationException -> 0x002b, blocks: (B:8:0x0026, B:13:0x0038, B:59:0x0124, B:36:0x00a9, B:40:0x00cb, B:43:0x00d3, B:45:0x00d8, B:48:0x00df, B:50:0x00e4, B:53:0x0100, B:49:0x00e2, B:55:0x0103, B:60:0x012c, B:17:0x004f, B:20:0x0062, B:34:0x009f), top: B:72:0x0010 }] */
    /* JADX WARN: Type inference failed for: r3v0, types: [int] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:58:0x011f -> B:59:0x0124). Please report as a decompilation issue!!! */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instruction units count: 370
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ob0.h.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
