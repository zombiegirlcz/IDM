package i9g;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes9.dex */
public final class e extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ ahd.b f159788w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(ahd.b bVar, Continuation continuation) {
        super(continuation);
        this.f159788w = bVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f159788w.emit(null, this);
    }
}
