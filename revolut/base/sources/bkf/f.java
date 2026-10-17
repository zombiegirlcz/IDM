package bkf;

/* JADX INFO: loaded from: classes8.dex */
public final class f extends gim.c {
    public wd6.h u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ h f16404w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f16405x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(h hVar, gim.c cVar) {
        super(cVar);
        this.f16404w = hVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f16405x |= Integer.MIN_VALUE;
        return this.f16404w.b3(null, this);
    }
}
