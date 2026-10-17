package l97;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes21.dex */
public final class g0 extends gim.i implements Function2 {
    public int A;
    public int B;
    public int C;
    public final /* synthetic */ z87.f D;
    public final /* synthetic */ i0 E;
    public final /* synthetic */ o97.s F;
    public final /* synthetic */ efm.r G;
    public final /* synthetic */ ukm.q H;
    public final /* synthetic */ b0 I;
    public ukm.u u;
    public b0 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public ukm.i0 f193055w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public ukm.g f193056x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f193057y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(z87.f fVar, i0 i0Var, o97.s sVar, efm.r rVar, ukm.q qVar, b0 b0Var, Continuation continuation) {
        super(2, continuation);
        this.D = fVar;
        this.E = i0Var;
        this.F = sVar;
        this.G = rVar;
        this.H = qVar;
        this.I = b0Var;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new g0(this.D, this.E, this.F, this.G, this.H, this.I, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:74:0x01bc, code lost:
    
        if (r4.send(r0, r23) == r2) goto L75;
     */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x015f A[Catch: all -> 0x0047, TryCatch #2 {all -> 0x0047, blocks: (B:11:0x0033, B:52:0x012e, B:56:0x0157, B:58:0x015f, B:62:0x0189, B:16:0x005b, B:51:0x0123), top: B:81:0x000e, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0189 A[Catch: all -> 0x0047, TRY_LEAVE, TryCatch #2 {all -> 0x0047, blocks: (B:11:0x0033, B:52:0x012e, B:56:0x0157, B:58:0x015f, B:62:0x0189, B:16:0x005b, B:51:0x0123), top: B:81:0x000e, outer: #1 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:59:0x0183 -> B:12:0x0036). Please report as a decompilation issue!!! */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r24) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 451
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l97.g0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
