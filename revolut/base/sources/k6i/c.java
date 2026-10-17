package k6i;

/* JADX INFO: loaded from: classes10.dex */
public final class c extends gim.c {
    public final /* synthetic */ jpc.e A;
    public int B;
    public String u;
    public String v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public String f181723w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public String f181724x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public String f181725y;
    public /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(jpc.e eVar, gim.c cVar) {
        super(cVar);
        this.A = eVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.z = obj2;
        this.B |= Integer.MIN_VALUE;
        return this.A.b0(null, null, this);
    }
}
