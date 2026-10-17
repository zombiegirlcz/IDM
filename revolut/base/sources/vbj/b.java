package vbj;

import kotlin.coroutines.Continuation;
import v6e.p;

/* JADX INFO: loaded from: classes11.dex */
public final class b extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ p f287528w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(p pVar, Continuation continuation) {
        super(continuation);
        this.f287528w = pVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f287528w.emit(null, this);
    }
}
