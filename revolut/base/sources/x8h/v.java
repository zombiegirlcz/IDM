package x8h;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes9.dex */
public final class v extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ vkf.d f303393w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(vkf.d dVar, Continuation continuation) {
        super(continuation);
        this.f303393w = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f303393w.emit(null, this);
    }
}
