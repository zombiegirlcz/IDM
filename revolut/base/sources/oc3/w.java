package oc3;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes21.dex */
public final class w extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ o42.j f224085w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(o42.j jVar, Continuation continuation) {
        super(continuation);
        this.f224085w = jVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f224085w.emit(null, this);
    }
}
