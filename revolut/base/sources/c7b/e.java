package c7b;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes6.dex */
public final class e extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ c65.h f21893w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(c65.h hVar, Continuation continuation) {
        super(continuation);
        this.f21893w = hVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f21893w.emit(null, this);
    }
}
