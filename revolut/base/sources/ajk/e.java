package ajk;

import pi3.h;

/* JADX INFO: loaded from: classes11.dex */
public final class e extends gim.c {
    public h u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ f f5590w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f5591x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, gim.c cVar) {
        super(cVar);
        this.f5590w = fVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f5591x |= Integer.MIN_VALUE;
        return this.f5590w.c(null, this);
    }
}
