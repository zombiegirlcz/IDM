package cuj;

/* JADX INFO: loaded from: classes11.dex */
public final class s extends gim.c {
    public h u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ y f109054w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f109055x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(y yVar, gim.c cVar) {
        super(cVar);
        this.f109054w = yVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f109055x |= Integer.MIN_VALUE;
        return y.I2(this.f109054w, null, this);
    }
}
