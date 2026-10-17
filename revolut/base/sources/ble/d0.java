package ble;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes8.dex */
public final class d0 extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ h f16566w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(h hVar, Continuation continuation) {
        super(continuation);
        this.f16566w = hVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f16566w.emit(null, this);
    }
}
