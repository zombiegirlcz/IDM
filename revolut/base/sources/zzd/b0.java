package zzd;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes7.dex */
public final class b0 extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ vkf.d f326672w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(vkf.d dVar, Continuation continuation) {
        super(continuation);
        this.f326672w = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f326672w.emit(null, this);
    }
}
