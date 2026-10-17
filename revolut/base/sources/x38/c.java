package x38;

import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends gim.c {
    public Set u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ d f302704w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f302705x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, gim.c cVar) {
        super(cVar);
        this.f302704w = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f302705x |= Integer.MIN_VALUE;
        return this.f302704w.b(null, this);
    }
}
