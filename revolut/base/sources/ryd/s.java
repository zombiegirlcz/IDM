package ryd;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes7.dex */
public final class s extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ rx6.e f258353w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(rx6.e eVar, Continuation continuation) {
        super(continuation);
        this.f258353w = eVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f258353w.emit(null, this);
    }
}
