package vsj;

/* JADX INFO: loaded from: classes11.dex */
public final class m extends gim.c {
    public String u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ q f291829w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f291830x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(q qVar, gim.c cVar) {
        super(cVar);
        this.f291829w = qVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f291830x |= Integer.MIN_VALUE;
        return this.f291829w.h(null, this);
    }
}
