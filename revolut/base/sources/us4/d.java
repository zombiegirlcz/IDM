package us4;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes22.dex */
public final class d extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ urd.m f282419w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(urd.m mVar, Continuation continuation) {
        super(continuation);
        this.f282419w = mVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f282419w.emit(null, this);
    }
}
