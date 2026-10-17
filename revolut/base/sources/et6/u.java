package et6;

import java.time.LocalDateTime;

/* JADX INFO: loaded from: classes3.dex */
public final class u extends gim.c {
    public LocalDateTime u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ v f129337w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f129338x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(v vVar, gim.c cVar) {
        super(cVar);
        this.f129337w = vVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f129338x |= Integer.MIN_VALUE;
        return this.f129337w.g(null, this);
    }
}
