package et6;

import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class t extends gim.c {
    public Set u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ v f129326w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f129327x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(v vVar, gim.c cVar) {
        super(cVar);
        this.f129326w = vVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f129327x |= Integer.MIN_VALUE;
        return this.f129326w.f(null, this);
    }
}
