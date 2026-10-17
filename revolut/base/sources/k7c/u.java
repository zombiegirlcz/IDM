package k7c;

/* JADX INFO: loaded from: classes6.dex */
public final class u extends gim.c {
    public od0.h u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ z f182006w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f182007x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(z zVar, gim.c cVar) {
        super(cVar);
        this.f182006w = zVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f182007x |= Integer.MIN_VALUE;
        return z.b(this.f182006w, null, this);
    }
}
