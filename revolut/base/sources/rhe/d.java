package rhe;

import java.util.Set;

/* JADX INFO: loaded from: classes8.dex */
public final class d extends gim.c {
    public Set u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ m f254411w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f254412x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(m mVar, gim.c cVar) {
        super(cVar);
        this.f254411w = mVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f254412x |= Integer.MIN_VALUE;
        return m.a(this.f254411w, null, this);
    }
}
