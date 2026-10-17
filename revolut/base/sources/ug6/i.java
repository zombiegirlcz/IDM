package ug6;

/* JADX INFO: loaded from: classes3.dex */
public final class i extends gim.c {
    public String u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ v f279952w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f279953x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(v vVar, gim.c cVar) {
        super(cVar);
        this.f279952w = vVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f279953x |= Integer.MIN_VALUE;
        return v.Z2(this.f279952w, null, this);
    }
}
