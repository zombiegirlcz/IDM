package kd8;

/* JADX INFO: loaded from: classes4.dex */
public final class s extends gim.c {
    public int A;
    public String u;
    public String v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public v6d.a f182848w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public String f182849x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f182850y;
    public final /* synthetic */ v z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(v vVar, gim.c cVar) {
        super(cVar);
        this.z = vVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f182850y = obj2;
        this.A |= Integer.MIN_VALUE;
        return this.z.c(null, null, null, this);
    }
}
