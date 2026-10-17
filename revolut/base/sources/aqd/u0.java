package aqd;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes7.dex */
public final class u0 extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ akf.g f8408w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(akf.g gVar, Continuation continuation) {
        super(continuation);
        this.f8408w = gVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f8408w.emit(null, this);
    }
}
