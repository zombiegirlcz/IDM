package lz3;

/* JADX INFO: loaded from: classes22.dex */
public final class e extends gim.c {
    public it3.d u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ f f200918w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f200919x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, gim.c cVar) {
        super(cVar);
        this.f200918w = fVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f200919x |= Integer.MIN_VALUE;
        return this.f200918w.a(null, this);
    }
}
