package ru5;

/* JADX INFO: loaded from: classes3.dex */
public final class q extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ z v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f257433w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(z zVar, gim.c cVar) {
        super(cVar);
        this.v = zVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f257433w |= Integer.MIN_VALUE;
        return this.v.A2(this);
    }
}
