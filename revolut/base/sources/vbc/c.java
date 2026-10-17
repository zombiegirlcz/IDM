package vbc;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes6.dex */
public final class c extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ q3j.b f287491w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(q3j.b bVar, Continuation continuation) {
        super(continuation);
        this.f287491w = bVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f287491w.emit(null, this);
    }
}
