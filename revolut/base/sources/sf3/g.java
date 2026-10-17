package sf3;

import java.util.UUID;

/* JADX INFO: loaded from: classes21.dex */
public final class g extends gim.c {
    public jf0.c u;
    public UUID v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public UUID f262334w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f262335x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ i f262336y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(i iVar, gim.c cVar) {
        super(cVar);
        this.f262336y = iVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f262335x = obj2;
        this.z |= Integer.MIN_VALUE;
        return this.f262336y.b(null, this);
    }
}
