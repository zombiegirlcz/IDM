package d4f;

import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class h extends gim.c {
    public List u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ zjh.f f111287w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f111288x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(zjh.f fVar, gim.c cVar) {
        super(cVar);
        this.f111287w = fVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f111288x |= Integer.MIN_VALUE;
        return this.f111287w.F(null, this);
    }
}
