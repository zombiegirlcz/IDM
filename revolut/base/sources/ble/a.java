package ble;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes8.dex */
public final class a extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ a3i.h f16550w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(a3i.h hVar, Continuation continuation) {
        super(continuation);
        this.f16550w = hVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f16550w.emit(null, this);
    }
}
