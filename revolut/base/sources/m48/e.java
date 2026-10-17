package m48;

import yfe.l1;

/* JADX INFO: loaded from: classes4.dex */
public final class e extends gim.c {
    public dj0.d u;
    public l1 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f202673w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f202674x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ f f202675y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, gim.c cVar) {
        super(cVar);
        this.f202675y = fVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f202674x = obj2;
        this.z |= Integer.MIN_VALUE;
        return this.f202675y.b(null, null, null, this);
    }
}
