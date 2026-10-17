package a83;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes21.dex */
public final class l0 extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ a3i.h f2060w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(a3i.h hVar, Continuation continuation) {
        super(continuation);
        this.f2060w = hVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f2060w.emit(null, this);
    }
}
