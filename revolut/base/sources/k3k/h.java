package k3k;

import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class h extends gim.c {
    public List u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ i f180766w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f180767x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar, gim.c cVar) {
        super(cVar);
        this.f180766w = iVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f180767x |= Integer.MIN_VALUE;
        return this.f180766w.e(null, this);
    }
}
