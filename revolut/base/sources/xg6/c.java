package xg6;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends gim.c {
    public od0.h u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ d f305576w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f305577x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, gim.c cVar) {
        super(cVar);
        this.f305576w = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f305577x |= Integer.MIN_VALUE;
        return this.f305576w.a(null, null, this);
    }
}
