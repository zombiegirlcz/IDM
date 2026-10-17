package dfj;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: loaded from: classes11.dex */
public final class q2 extends gim.c {
    public final /* synthetic */ v2 A;
    public int B;
    public nfj.a1 u;
    public dej.q1 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Function1 f114077w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Ref$ObjectRef f114078x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Ref$ObjectRef f114079y;
    public /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q2(v2 v2Var, gim.c cVar) {
        super(cVar);
        this.A = v2Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.z = obj2;
        this.B |= Integer.MIN_VALUE;
        return v2.a(this.A, null, null, null, this);
    }
}
