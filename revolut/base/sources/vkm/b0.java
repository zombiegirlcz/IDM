package vkm;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes13.dex */
public final class b0 extends gim.c {
    public fli.d u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ fli.d f289995w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f289996x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(fli.d dVar, Continuation continuation) {
        super(continuation);
        this.f289995w = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f289996x |= Integer.MIN_VALUE;
        return this.f289995w.emit(null, this);
    }
}
