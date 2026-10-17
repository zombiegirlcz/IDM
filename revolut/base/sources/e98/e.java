package e98;

/* JADX INFO: loaded from: classes4.dex */
public final class e extends gim.c {
    public String u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ f f123928w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f123929x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, gim.c cVar) {
        super(cVar);
        this.f123928w = fVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f123929x |= Integer.MIN_VALUE;
        return this.f123928w.b(null, this);
    }
}
