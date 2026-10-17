package y20;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes19.dex */
public final class r0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public r10.q v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f310541w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f310542x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f310543y;
    public final /* synthetic */ b1 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r0(b1 b1Var, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.z = b1Var;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                r0 r0Var = new r0(this.z, continuation, 0);
                r0Var.f310543y = obj2;
                return r0Var;
            default:
                r0 r0Var2 = new r0(this.z, continuation, 1);
                r0Var2.f310543y = obj2;
                return r0Var2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((r0) create((r) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((r0) create((s) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01fb  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instruction units count: 634
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: y20.r0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
