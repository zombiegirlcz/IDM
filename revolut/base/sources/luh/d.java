package luh;

import kotlin.coroutines.Continuation;
import lkf.q;

/* JADX INFO: loaded from: classes10.dex */
public final class d extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ q f200235w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(q qVar, Continuation continuation) {
        super(continuation);
        this.f200235w = qVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f200235w.emit(null, this);
    }
}
