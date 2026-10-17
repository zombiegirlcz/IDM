package jr1;

/* JADX INFO: loaded from: classes20.dex */
public final class c extends gim.c {
    public String u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ e f177922w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f177923x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(e eVar, gim.c cVar) {
        super(cVar);
        this.f177922w = eVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f177923x |= Integer.MIN_VALUE;
        return this.f177922w.c(null, this);
    }
}
