package kmk;

import imk.u;

/* JADX INFO: loaded from: classes11.dex */
public final class e extends gim.c {
    public u u;
    public hha.d v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f185901w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ f f185902x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f185903y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, gim.c cVar) {
        super(cVar);
        this.f185902x = fVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f185901w = obj2;
        this.f185903y |= Integer.MIN_VALUE;
        return this.f185902x.Z2(null, null, this);
    }
}
