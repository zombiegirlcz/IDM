package kkf;

/* JADX INFO: loaded from: classes8.dex */
public final class k8 extends gim.c {
    public aii.u u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ l8 f184797w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f184798x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k8(l8 l8Var, gim.c cVar) {
        super(cVar);
        this.f184797w = l8Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f184798x |= Integer.MIN_VALUE;
        return this.f184797w.b3(null, this);
    }
}
