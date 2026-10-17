package ox1;

import java.util.List;

/* JADX INFO: loaded from: classes20.dex */
public final class f extends gim.c {
    public List u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ i f230530w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f230531x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(i iVar, gim.c cVar) {
        super(cVar);
        this.f230530w = iVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f230531x |= Integer.MIN_VALUE;
        return this.f230530w.a(null, this);
    }
}
