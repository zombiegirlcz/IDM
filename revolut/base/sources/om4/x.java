package om4;

/* JADX INFO: loaded from: classes22.dex */
public final class x extends gim.c {
    public final /* synthetic */ z A;
    public int B;
    public String u;
    public hl4.e v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public hl4.g f226738w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public dj0.d f226739x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Boolean f226740y;
    public /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(z zVar, gim.c cVar) {
        super(cVar);
        this.A = zVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.z = obj2;
        this.B |= Integer.MIN_VALUE;
        return this.A.a(null, null, null, null, null, this);
    }
}
