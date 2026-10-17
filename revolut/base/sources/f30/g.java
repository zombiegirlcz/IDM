package f30;

import r10.v;

/* JADX INFO: loaded from: classes19.dex */
public final class g extends gim.c {
    public v u;
    public String v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f131864w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ h f131865x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f131866y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, gim.c cVar) {
        super(cVar);
        this.f131865x = hVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f131864w = obj2;
        this.f131866y |= Integer.MIN_VALUE;
        return h.b(this.f131865x, this);
    }
}
