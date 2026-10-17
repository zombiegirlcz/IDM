package ha3;

import java.util.List;

/* JADX INFO: loaded from: classes21.dex */
public final class g extends gim.c {
    public List u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ fn2.c f150403w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f150404x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(fn2.c cVar, gim.c cVar2) {
        super(cVar2);
        this.f150403w = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f150404x |= Integer.MIN_VALUE;
        return this.f150403w.m(null, this);
    }
}
