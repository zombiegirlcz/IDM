package jb7;

import i52.l;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes21.dex */
public final class e extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ l f172604w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(l lVar, Continuation continuation) {
        super(continuation);
        this.f172604w = lVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f172604w.emit(null, this);
    }
}
