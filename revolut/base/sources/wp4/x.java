package wp4;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes22.dex */
public final class x extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ ly4.g f299092w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(ly4.g gVar, Continuation continuation) {
        super(continuation);
        this.f299092w = gVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f299092w.emit(null, this);
    }
}
