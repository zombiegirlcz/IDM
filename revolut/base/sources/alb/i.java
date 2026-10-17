package alb;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes6.dex */
public final class i extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ a3i.h f6180w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(a3i.h hVar, Continuation continuation) {
        super(continuation);
        this.f6180w = hVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f6180w.emit(null, this);
    }
}
