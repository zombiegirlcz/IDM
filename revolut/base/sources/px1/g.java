package px1;

import java.util.List;

/* JADX INFO: loaded from: classes20.dex */
public final class g extends gim.c {
    public List u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ i f240556w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f240557x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(i iVar, gim.c cVar) {
        super(cVar);
        this.f240556w = iVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f240557x |= Integer.MIN_VALUE;
        return this.f240556w.b(null, null, this);
    }
}
