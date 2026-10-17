package eed;

/* JADX INFO: loaded from: classes7.dex */
public final class f extends gim.c {
    public d u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ h f125181w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f125182x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(h hVar, gim.c cVar) {
        super(cVar);
        this.f125181w = hVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f125182x |= Integer.MIN_VALUE;
        return this.f125181w.b(null, this);
    }
}
