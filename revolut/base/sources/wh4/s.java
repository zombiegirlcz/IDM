package wh4;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes22.dex */
public final class s extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ wa3.h f297413w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(wa3.h hVar, Continuation continuation) {
        super(continuation);
        this.f297413w = hVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f297413w.emit(null, this);
    }
}
