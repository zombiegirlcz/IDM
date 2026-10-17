package d78;

import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class u extends gim.c {
    public Set u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ x f111879w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f111880x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(x xVar, gim.c cVar) {
        super(cVar);
        this.f111879w = xVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f111880x |= Integer.MIN_VALUE;
        return this.f111879w.a(null, this);
    }
}
