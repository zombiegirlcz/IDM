package zy5;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes3.dex */
public final class n extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ zul.l f326385w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(zul.l lVar, Continuation continuation) {
        super(continuation);
        this.f326385w = lVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f326385w.emit(null, this);
    }
}
