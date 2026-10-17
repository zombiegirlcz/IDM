package oyi;

import kotlin.coroutines.Continuation;
import ood.x;

/* JADX INFO: loaded from: classes10.dex */
public final class j extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ x f231049w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(x xVar, Continuation continuation) {
        super(continuation);
        this.f231049w = xVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f231049w.emit(null, this);
    }
}
