package io.ktor.utils.io;

/* JADX INFO: loaded from: classes23.dex */
public final class n extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ q v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f163068w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(q qVar, gim.c cVar) {
        super(cVar);
        this.v = qVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f163068w |= Integer.MIN_VALUE;
        return this.v.a(this);
    }
}
