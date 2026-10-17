package kq;

import iw4.j;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes17.dex */
public final class f extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ j f188273w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(j jVar, Continuation continuation) {
        super(continuation);
        this.f188273w = jVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f188273w.emit(null, this);
    }
}
