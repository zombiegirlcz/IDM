package fc0;

import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes19.dex */
public final class h extends gim.i implements Function2 {
    public int A;
    public int B;
    public /* synthetic */ Object C;
    public final /* synthetic */ long D;
    public final /* synthetic */ i E;
    public final /* synthetic */ String F;
    public final /* synthetic */ String G;
    public final /* synthetic */ String H;
    public final /* synthetic */ String I;
    public final /* synthetic */ Set J;
    public Object u;
    public String v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public String f133603w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public String f133604x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public String f133605y;
    public Set z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(long j2, i iVar, String str, String str2, String str3, String str4, Set set, Continuation continuation) {
        super(2, continuation);
        this.D = j2;
        this.E = iVar;
        this.F = str;
        this.G = str2;
        this.H = str3;
        this.I = str4;
        this.J = set;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        h hVar = new h(this.D, this.E, this.F, this.G, this.H, this.I, this.J, continuation);
        hVar.C = obj2;
        return hVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((h) create((FlowCollector) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0074, code lost:
    
        if (r2.emit(r10, r22) == r3) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0145, code lost:
    
        if (r2.emit(r10, r22) == r3) goto L48;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00d4 A[Catch: all -> 0x0058, TryCatch #0 {all -> 0x0058, blocks: (B:13:0x0049, B:27:0x00d0, B:29:0x00d4, B:31:0x00dc, B:34:0x00e1, B:23:0x0097, B:35:0x00e5, B:36:0x00e9, B:37:0x00ee, B:21:0x0078), top: B:51:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00e9 A[Catch: all -> 0x0058, TryCatch #0 {all -> 0x0058, blocks: (B:13:0x0049, B:27:0x00d0, B:29:0x00d4, B:31:0x00dc, B:34:0x00e1, B:23:0x0097, B:35:0x00e5, B:36:0x00e9, B:37:0x00ee, B:21:0x0078), top: B:51:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0125  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00cb -> B:27:0x00d0). Please report as a decompilation issue!!! */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r23) {
        /*
            Method dump skipped, instruction units count: 331
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: fc0.h.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
