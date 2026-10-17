package rea;

/* JADX INFO: loaded from: classes5.dex */
public final class b extends gim.c {
    public int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f253559w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ kbb.c f253560x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f253561y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(kbb.c cVar, gim.c cVar2) {
        super(cVar2);
        this.f253560x = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f253559w = obj2;
        this.f253561y |= Integer.MIN_VALUE;
        return this.f253560x.C(this);
    }
}
