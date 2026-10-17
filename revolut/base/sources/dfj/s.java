package dfj;

/* JADX INFO: loaded from: classes11.dex */
public final class s extends gim.c {
    public String u;
    public Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f114096w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ u f114097x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f114098y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(u uVar, gim.c cVar) {
        super(cVar);
        this.f114097x = uVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f114096w = obj2;
        this.f114098y |= Integer.MIN_VALUE;
        return this.f114097x.a(null, this);
    }
}
