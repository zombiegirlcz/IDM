package vu5;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends gim.c {
    public boolean u;
    public nii.d v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f292257w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ h f292258x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f292259y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(h hVar, gim.c cVar) {
        super(cVar);
        this.f292258x = hVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f292257w = obj2;
        this.f292259y |= Integer.MIN_VALUE;
        return h.I2(this.f292258x, false, this);
    }
}
