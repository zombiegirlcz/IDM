package wwf;

import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class n extends gim.c {
    public List u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ o f300663w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f300664x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(o oVar, gim.c cVar) {
        super(cVar);
        this.f300663w = oVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f300664x |= Integer.MIN_VALUE;
        return o.b3(this.f300663w, null, this);
    }
}
