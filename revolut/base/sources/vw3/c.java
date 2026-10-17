package vw3;

/* JADX INFO: loaded from: classes22.dex */
public final class c extends gim.c {
    public String u;
    public String v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public nu3.e f292614w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f292615x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ d f292616y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, gim.c cVar) {
        super(cVar);
        this.f292616y = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f292615x = obj2;
        this.z |= Integer.MIN_VALUE;
        return this.f292616y.a(null, null, null, this);
    }
}
