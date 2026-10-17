package crf;

/* JADX INFO: loaded from: classes9.dex */
public final class g extends gim.c {
    public String u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ k f108363w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f108364x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(k kVar, gim.c cVar) {
        super(cVar);
        this.f108363w = kVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f108364x |= Integer.MIN_VALUE;
        return this.f108363w.b3(null, null, this);
    }
}
