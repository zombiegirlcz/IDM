package e0f;

/* JADX INFO: loaded from: classes8.dex */
public final class q extends gim.c {
    public boolean u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ z f121668w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f121669x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(z zVar, gim.c cVar) {
        super(cVar);
        this.f121668w = zVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f121669x |= Integer.MIN_VALUE;
        return this.f121668w.h(false, this);
    }
}
