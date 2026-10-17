package qyj;

import u09.q;

/* JADX INFO: loaded from: classes11.dex */
public final class b extends gim.c {
    public q u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ c f250294w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f250295x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, gim.c cVar2) {
        super(cVar2);
        this.f250294w = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f250295x |= Integer.MIN_VALUE;
        return this.f250294w.b(null, this);
    }
}
