package b45;

/* JADX INFO: loaded from: classes21.dex */
public final class c extends gim.c {
    public x35.h u;
    public String v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public String f12166w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f12167x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ h f12168y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(h hVar, gim.c cVar) {
        super(cVar);
        this.f12168y = hVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f12167x = obj2;
        this.z |= Integer.MIN_VALUE;
        return this.f12168y.b(null, this);
    }
}
