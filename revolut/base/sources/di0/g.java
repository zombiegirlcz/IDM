package di0;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes19.dex */
public final class g extends gim.c {
    public AtomicBoolean u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ i f114865w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f114866x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(i iVar, gim.c cVar) {
        super(cVar);
        this.f114865w = iVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f114866x |= Integer.MIN_VALUE;
        return this.f114865w.a(this);
    }
}
