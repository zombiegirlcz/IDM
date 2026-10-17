package lk9;

/* JADX INFO: loaded from: classes5.dex */
public final class s extends gim.c {
    public dj0.d u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ y f196324w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f196325x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(y yVar, gim.c cVar) {
        super(cVar);
        this.f196324w = yVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f196325x |= Integer.MIN_VALUE;
        return y.y2(this.f196324w, null, this);
    }
}
