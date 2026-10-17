package y20;

import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public final class j extends gim.c {
    public List u;
    public boolean v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f310509w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ v60.g f310510x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f310511y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(v60.g gVar, gim.c cVar) {
        super(cVar);
        this.f310510x = gVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f310509w = obj2;
        this.f310511y |= Integer.MIN_VALUE;
        return this.f310510x.d(this, null, false);
    }
}
