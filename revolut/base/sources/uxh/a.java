package uxh;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes10.dex */
public final class a extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ urd.m f284004w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(urd.m mVar, Continuation continuation) {
        super(continuation);
        this.f284004w = mVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f284004w.emit(null, this);
    }
}
