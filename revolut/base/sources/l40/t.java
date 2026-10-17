package l40;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes19.dex */
public final class t extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f192024w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ v f192025x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t(v vVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f192025x = vVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                t tVar = new t(this.f192025x, continuation, 0);
                tVar.f192024w = obj2;
                return tVar;
            default:
                t tVar2 = new t(this.f192025x, continuation, 1);
                tVar2.f192024w = obj2;
                return tVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((t) create((xg0.p) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((t) create((FlowCollector) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0097 A[Catch: CancellationException -> 0x0039, Exception -> 0x00c1, TryCatch #2 {CancellationException -> 0x0039, Exception -> 0x00c1, blocks: (B:14:0x0034, B:17:0x003c, B:29:0x0091, B:31:0x0097, B:34:0x00a2, B:36:0x00a6, B:38:0x00aa, B:26:0x0072), top: B:79:0x001b }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a2 A[Catch: CancellationException -> 0x0039, Exception -> 0x00c1, TryCatch #2 {CancellationException -> 0x0039, Exception -> 0x00c1, blocks: (B:14:0x0034, B:17:0x003c, B:29:0x0091, B:31:0x0097, B:34:0x00a2, B:36:0x00a6, B:38:0x00aa, B:26:0x0072), top: B:79:0x001b }] */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            Method dump skipped, instruction units count: 328
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l40.t.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
