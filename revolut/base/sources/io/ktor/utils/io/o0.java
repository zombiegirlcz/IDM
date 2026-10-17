package io.ktor.utils.io;

/* JADX INFO: loaded from: classes23.dex */
public final class o0 extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ p0 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f163071w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(p0 p0Var, gim.c cVar) {
        super(cVar);
        this.v = p0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f163071w |= Integer.MIN_VALUE;
        return this.v.d(0, this);
    }
}
