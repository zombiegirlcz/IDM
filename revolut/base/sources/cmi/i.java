package cmi;

/* JADX INFO: loaded from: classes10.dex */
public final class i extends gim.c {
    public String u;
    public wli.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public String f25280w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f25281x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ m f25282y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(m mVar, gim.c cVar) {
        super(cVar);
        this.f25282y = mVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f25281x = obj2;
        this.z |= Integer.MIN_VALUE;
        return this.f25282y.o3(null, null, this);
    }
}
