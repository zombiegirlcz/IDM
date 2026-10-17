package fv1;

import fod.i;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes20.dex */
public final class c extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ i f138307w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(i iVar, Continuation continuation) {
        super(continuation);
        this.f138307w = iVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f138307w.emit(null, this);
    }
}
