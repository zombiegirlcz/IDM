package ish;

/* JADX INFO: loaded from: classes10.dex */
public final class o extends gim.c {
    public String u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ z f168274w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f168275x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(z zVar, gim.c cVar) {
        super(cVar);
        this.f168274w = zVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f168275x |= Integer.MIN_VALUE;
        return this.f168274w.d(null, null, this);
    }
}
