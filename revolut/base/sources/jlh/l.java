package jlh;

/* JADX INFO: loaded from: classes10.dex */
public final class l extends gim.c {
    public String u;
    public n4l.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f175777w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ o f175778x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f175779y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(o oVar, gim.c cVar) {
        super(cVar);
        this.f175778x = oVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f175777w = obj2;
        this.f175779y |= Integer.MIN_VALUE;
        return this.f175778x.c(null, null, this);
    }
}
