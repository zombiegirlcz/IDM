package k09;

import u09.q;

/* JADX INFO: loaded from: classes4.dex */
public final class e extends gim.c {
    public q u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ g f179989w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f179990x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(g gVar, gim.c cVar) {
        super(cVar);
        this.f179989w = gVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f179990x |= Integer.MIN_VALUE;
        return this.f179989w.c3(null, this);
    }
}
