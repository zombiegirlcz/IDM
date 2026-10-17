package dfj;

import kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: loaded from: classes11.dex */
public final class m1 extends gim.c {
    public Ref$ObjectRef u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ q1 f114039w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f114040x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(q1 q1Var, gim.c cVar) {
        super(cVar);
        this.f114039w = q1Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f114040x |= Integer.MIN_VALUE;
        return q1.b(this.f114039w, null, null, 0L, 0L, 0, this);
    }
}
