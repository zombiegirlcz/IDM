package asa;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes5.dex */
public final class i extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ acb.h f8899w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(acb.h hVar, Continuation continuation) {
        super(continuation);
        this.f8899w = hVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f8899w.emit(null, this);
    }
}
