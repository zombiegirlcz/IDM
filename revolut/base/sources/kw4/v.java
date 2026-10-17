package kw4;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes22.dex */
public final class v extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ kvl.m f190249w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(kvl.m mVar, Continuation continuation) {
        super(continuation);
        this.f190249w = mVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f190249w.emit(null, this);
    }
}
