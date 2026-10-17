package k01;

import jid.z;

/* JADX INFO: loaded from: classes20.dex */
public final class j extends gim.c {
    public int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f179905w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ z f179906x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f179907y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(z zVar, gim.c cVar) {
        super(cVar);
        this.f179906x = zVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f179905w = obj2;
        this.f179907y |= Integer.MIN_VALUE;
        return this.f179906x.h(null, null, 0, 0, this);
    }
}
