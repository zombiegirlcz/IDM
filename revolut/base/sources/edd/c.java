package edd;

/* JADX INFO: loaded from: classes7.dex */
public final class c extends gim.c {
    public d u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ d f124978w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f124979x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, gim.c cVar) {
        super(cVar);
        this.f124978w = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f124979x |= Integer.MIN_VALUE;
        return this.f124978w.c(null, null, false, this);
    }
}
