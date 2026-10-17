package kh4;

import kbb.n;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes22.dex */
public final class e extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ n f184050w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(n nVar, Continuation continuation) {
        super(continuation);
        this.f184050w = nVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f184050w.emit(null, this);
    }
}
