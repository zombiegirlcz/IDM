package ou6;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes3.dex */
public final class s extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ nvk.v f229843w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(nvk.v vVar, Continuation continuation) {
        super(continuation);
        this.f229843w = vVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f229843w.emit(null, this);
    }
}
