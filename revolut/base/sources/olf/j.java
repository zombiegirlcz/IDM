package olf;

import kotlin.coroutines.Continuation;
import nvk.v;

/* JADX INFO: loaded from: classes8.dex */
public final class j extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ v f226392w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(v vVar, Continuation continuation) {
        super(continuation);
        this.f226392w = vVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f226392w.emit(null, this);
    }
}
