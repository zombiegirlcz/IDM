package x57;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends gim.c {
    public String u;
    public String v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public dsh.e f302913w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f302914x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ d f302915y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, gim.c cVar) {
        super(cVar);
        this.f302915y = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f302914x = obj2;
        this.z |= Integer.MIN_VALUE;
        return this.f302915y.i(null, null, null, this);
    }
}
