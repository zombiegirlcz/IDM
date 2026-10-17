package q30;

import v30.c0;

/* JADX INFO: loaded from: classes19.dex */
public final class e extends gim.c {
    public c0 u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ h f241751w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f241752x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(h hVar, gim.c cVar) {
        super(cVar);
        this.f241751w = hVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f241752x |= Integer.MIN_VALUE;
        return this.f241751w.d(null, this);
    }
}
