package f88;

import sf8.m;

/* JADX INFO: loaded from: classes4.dex */
public final class j extends gim.c {
    public m u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f132756w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ k f132757x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f132758y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(k kVar, gim.c cVar) {
        super(cVar);
        this.f132757x = kVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f132756w = obj2;
        this.f132758y |= Integer.MIN_VALUE;
        return this.f132757x.Z2(null, this);
    }
}
