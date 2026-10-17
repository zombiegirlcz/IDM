package bnh;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes10.dex */
public final class h0 extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ ble.h f17186w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(ble.h hVar, Continuation continuation) {
        super(continuation);
        this.f17186w = hVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f17186w.emit(null, this);
    }
}
