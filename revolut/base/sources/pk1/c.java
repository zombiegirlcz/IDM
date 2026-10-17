package pk1;

import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes20.dex */
public final class c extends gim.c {
    public FlowCollector u;
    public Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f236915w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f236916x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ d f236917y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, gim.c cVar) {
        super(cVar);
        this.f236917y = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f236916x = obj2;
        this.z |= Integer.MIN_VALUE;
        return d.a(this.f236917y, null, this);
    }
}
