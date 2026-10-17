package ld8;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends gim.c {
    public String u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ c f194047w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f194048x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(c cVar, gim.c cVar2) {
        super(cVar2);
        this.f194047w = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f194048x |= Integer.MIN_VALUE;
        return this.f194047w.a(null, null, null, this);
    }
}
