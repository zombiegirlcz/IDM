package i97;

/* JADX INFO: loaded from: classes21.dex */
public final class j extends gim.c {
    public int A;
    public d97.e u;
    public xi0.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public String f159598w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public l f159599x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f159600y;
    public final /* synthetic */ l z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(l lVar, gim.c cVar) {
        super(cVar);
        this.z = lVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f159600y = obj2;
        this.A |= Integer.MIN_VALUE;
        return l.d(this.z, null, this);
    }
}
