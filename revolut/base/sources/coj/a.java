package coj;

/* JADX INFO: loaded from: classes11.dex */
public final class a extends gim.c {
    public String u;
    public String v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f25553w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ b f25554x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f25555y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, gim.c cVar) {
        super(cVar);
        this.f25554x = bVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f25553w = obj2;
        this.f25555y |= Integer.MIN_VALUE;
        return this.f25554x.i(null, null, this);
    }
}
