package l3d;

import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public final class n extends gim.c {
    public Set u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ r f191920w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f191921x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(r rVar, gim.c cVar) {
        super(cVar);
        this.f191920w = rVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f191921x |= Integer.MIN_VALUE;
        return this.f191920w.b(null, null, null, this);
    }
}
