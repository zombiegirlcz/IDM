package sa6;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes3.dex */
public final class d0 extends gim.i implements Function2 {
    public ba6.l A;
    public int B;
    public /* synthetic */ Object C;
    public final /* synthetic */ j0 D;
    public final /* synthetic */ ba6.b0 E;
    public final /* synthetic */ ba6.g0 F;
    public final /* synthetic */ ba6.u G;
    public final /* synthetic */ ba6.t H;
    public final /* synthetic */ String I;
    public skm.g0 u;
    public skm.h0 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public skm.g0 f261309w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Object f261310x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public ba6.g0 f261311y;
    public ba6.r z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(j0 j0Var, ba6.b0 b0Var, ba6.g0 g0Var, ba6.u uVar, ba6.t tVar, String str, Continuation continuation) {
        super(2, continuation);
        this.D = j0Var;
        this.E = b0Var;
        this.F = g0Var;
        this.G = uVar;
        this.H = tVar;
        this.I = str;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        d0 d0Var = new d0(this.D, this.E, this.F, this.G, this.H, this.I, continuation);
        d0Var.C = obj2;
        return d0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0157 A[RETURN] */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            Method dump skipped, instruction units count: 350
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sa6.d0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
