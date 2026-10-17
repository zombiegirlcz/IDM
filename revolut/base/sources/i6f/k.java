package i6f;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes8.dex */
public final class k extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ i4b.y f158941w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(i4b.y yVar, Continuation continuation) {
        super(continuation);
        this.f158941w = yVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f158941w.emit(null, this);
    }
}
