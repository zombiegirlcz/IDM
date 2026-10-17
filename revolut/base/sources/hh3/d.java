package hh3;

import hg4.i;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes21.dex */
public final class d extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ i f152246w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(i iVar, Continuation continuation) {
        super(continuation);
        this.f152246w = iVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f152246w.emit(null, this);
    }
}
