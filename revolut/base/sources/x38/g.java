package x38;

import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class g extends gim.c {
    public Set u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ h f302709w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f302710x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, gim.c cVar) {
        super(cVar);
        this.f302709w = hVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f302710x |= Integer.MIN_VALUE;
        return this.f302709w.b(null, this);
    }
}
