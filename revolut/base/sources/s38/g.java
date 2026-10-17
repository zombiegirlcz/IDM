package s38;

/* JADX INFO: loaded from: classes4.dex */
public final class g extends gim.c {
    public h u;
    public Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public g3a.h f259453w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f259454x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ h f259455y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, gim.c cVar) {
        super(cVar);
        this.f259455y = hVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f259454x = obj2;
        this.z |= Integer.MIN_VALUE;
        return h.c3(this.f259455y, null, this);
    }
}
