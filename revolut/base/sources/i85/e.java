package i85;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes21.dex */
public final class e extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ i4b.y f159449w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(i4b.y yVar, Continuation continuation) {
        super(continuation);
        this.f159449w = yVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f159449w.emit(null, this);
    }
}
