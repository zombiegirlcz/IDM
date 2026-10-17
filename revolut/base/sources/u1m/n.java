package u1m;

import android.content.Context;

/* JADX INFO: loaded from: classes12.dex */
public final class n extends gim.c {
    public o u;
    public Context v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Object f276486w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f276487x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ o f276488y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(o oVar, gim.c cVar) {
        super(cVar);
        this.f276488y = oVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f276487x = obj2;
        this.z |= Integer.MIN_VALUE;
        return this.f276488y.k(null, null, this);
    }
}
