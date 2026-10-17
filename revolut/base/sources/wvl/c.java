package wvl;

import kotlin.coroutines.Continuation;
import wv2.l;

/* JADX INFO: loaded from: classes12.dex */
public final class c extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ l f300554w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(l lVar, Continuation continuation) {
        super(continuation);
        this.f300554w = lVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f300554w.emit(null, this);
    }
}
