package orb;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes6.dex */
public final class m extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ f f228105w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(f fVar, Continuation continuation) {
        super(continuation);
        this.f228105w = fVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f228105w.emit(null, this);
    }
}
