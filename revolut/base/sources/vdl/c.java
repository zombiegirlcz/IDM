package vdl;

/* JADX INFO: loaded from: classes12.dex */
public final class c extends gim.c {
    public boolean u;
    public wel.d v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f287940w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ d f287941x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f287942y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, gim.c cVar) {
        super(cVar);
        this.f287941x = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f287940w = obj2;
        this.f287942y |= Integer.MIN_VALUE;
        return this.f287941x.a(false, this);
    }
}
