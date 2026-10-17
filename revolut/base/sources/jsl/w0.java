package jsl;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes12.dex */
public final class w0 extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ k f178250w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(k kVar, Continuation continuation) {
        super(continuation);
        this.f178250w = kVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f178250w.emit(null, this);
    }
}
