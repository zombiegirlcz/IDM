package ru5;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes3.dex */
public final class t extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ qx4.b f257434w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(qx4.b bVar, Continuation continuation) {
        super(continuation);
        this.f257434w = bVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f257434w.emit(null, this);
    }
}
