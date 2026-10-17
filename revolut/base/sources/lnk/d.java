package lnk;

import kotlin.coroutines.Continuation;
import lkf.q;

/* JADX INFO: loaded from: classes11.dex */
public final class d extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ q f197290w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(q qVar, Continuation continuation) {
        super(continuation);
        this.f197290w = qVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f197290w.emit(null, this);
    }
}
