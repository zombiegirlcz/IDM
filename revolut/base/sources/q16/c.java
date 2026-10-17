package q16;

import d6j.y;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ y f241392w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(y yVar, Continuation continuation) {
        super(continuation);
        this.f241392w = yVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f241392w.emit(null, this);
    }
}
