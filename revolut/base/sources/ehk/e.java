package ehk;

import zfk.n;

/* JADX INFO: loaded from: classes11.dex */
public final class e extends gim.c {
    public xfk.a u;
    public n v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public String f126206w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f126207x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ g f126208y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(g gVar, gim.c cVar) {
        super(cVar);
        this.f126208y = gVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f126207x = obj2;
        this.z |= Integer.MIN_VALUE;
        return this.f126208y.c3(null, null, null, this);
    }
}
