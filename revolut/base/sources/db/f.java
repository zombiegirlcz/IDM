package db;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes16.dex */
public final class f extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ dah.d f112607w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(dah.d dVar, Continuation continuation) {
        super(continuation);
        this.f112607w = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f112607w.emit(null, this);
    }
}
