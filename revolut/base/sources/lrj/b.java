package lrj;

import kotlin.coroutines.Continuation;
import lkf.q;

/* JADX INFO: loaded from: classes11.dex */
public final class b extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ q f199522w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(q qVar, Continuation continuation) {
        super(continuation);
        this.f199522w = qVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f199522w.emit(null, this);
    }
}
