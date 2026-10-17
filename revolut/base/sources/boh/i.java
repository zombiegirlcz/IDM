package boh;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes10.dex */
public final class i extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ ble.h f17467w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(ble.h hVar, Continuation continuation) {
        super(continuation);
        this.f17467w = hVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f17467w.emit(null, this);
    }
}
