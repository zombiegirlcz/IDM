package lek;

/* JADX INFO: loaded from: classes11.dex */
public final class j extends gim.c {
    public uek.g u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ m f194581w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f194582x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(m mVar, gim.c cVar) {
        super(cVar);
        this.f194581w = mVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f194582x |= Integer.MIN_VALUE;
        return this.f194581w.h(null, this);
    }
}
