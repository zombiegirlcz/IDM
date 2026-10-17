package wf4;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes22.dex */
public final class c extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ wa3.h f296964w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(wa3.h hVar, Continuation continuation) {
        super(continuation);
        this.f296964w = hVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f296964w.emit(null, this);
    }
}
