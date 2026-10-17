package z20;

import java.util.Set;

/* JADX INFO: loaded from: classes19.dex */
public final class i extends gim.c {
    public Set u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ j f318917w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f318918x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j jVar, gim.c cVar) {
        super(cVar);
        this.f318917w = jVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f318918x |= Integer.MIN_VALUE;
        return this.f318917w.c(null, null, this);
    }
}
