package wl3;

import java.util.Set;

/* JADX INFO: loaded from: classes21.dex */
public final class k extends gim.c {
    public Set u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ l f298386w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f298387x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(l lVar, gim.c cVar) {
        super(cVar);
        this.f298386w = lVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f298387x |= Integer.MIN_VALUE;
        return this.f298386w.b(null, this);
    }
}
