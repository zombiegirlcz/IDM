package s8a;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes5.dex */
public final class i extends gim.i implements Function2 {
    public int A;
    public int B;
    public int C;
    public /* synthetic */ Object D;
    public final /* synthetic */ l E;
    public final /* synthetic */ String F;
    public l u;
    public String v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public FlowCollector f260954w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f260955x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f260956y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(l lVar, String str, Continuation continuation) {
        super(2, continuation);
        this.E = lVar;
        this.F = str;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        i iVar = new i(this.E, this.F, continuation);
        iVar.D = obj2;
        return iVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((i) create((FlowCollector) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00dd, code lost:
    
        if (r7.emit(r14, r24) == r2) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0131, code lost:
    
        if (r1.emit(r17, r24) == r2) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x010d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00fe -> B:34:0x0103). Please report as a decompilation issue!!! */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 311
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s8a.i.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
