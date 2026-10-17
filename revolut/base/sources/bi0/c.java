package bi0;

/* JADX INFO: loaded from: classes19.dex */
public final class c extends gim.c {
    public ch0.a u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ e f15358w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f15359x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(e eVar, gim.c cVar) {
        super(cVar);
        this.f15358w = eVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f15359x |= Integer.MIN_VALUE;
        return this.f15358w.d(null, this);
    }
}
