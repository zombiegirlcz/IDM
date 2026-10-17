package dfj;

import kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: loaded from: classes11.dex */
public final class b4 extends gim.c {
    public Ref$ObjectRef u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ k4 f113919w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f113920x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b4(k4 k4Var, gim.c cVar) {
        super(cVar);
        this.f113919w = k4Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f113920x |= Integer.MIN_VALUE;
        return this.f113919w.g(null, this);
    }
}
