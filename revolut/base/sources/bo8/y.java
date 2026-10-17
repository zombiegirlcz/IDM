package bo8;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes4.dex */
public final class y extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ ble.h f17333w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(ble.h hVar, Continuation continuation) {
        super(continuation);
        this.f17333w = hVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f17333w.emit(null, this);
    }
}
