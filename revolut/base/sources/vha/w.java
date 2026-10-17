package vha;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes5.dex */
public final class w extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ q3j.b f289450w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(q3j.b bVar, Continuation continuation) {
        super(continuation);
        this.f289450w = bVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f289450w.emit(null, this);
    }
}
