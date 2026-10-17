package ww4;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes22.dex */
public final class a extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ vkf.d f300598w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(vkf.d dVar, Continuation continuation) {
        super(continuation);
        this.f300598w = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f300598w.emit(null, this);
    }
}
