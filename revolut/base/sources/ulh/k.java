package ulh;

import kotlin.coroutines.Continuation;
import uh7.q;

/* JADX INFO: loaded from: classes10.dex */
public final class k extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ q f281012w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(q qVar, Continuation continuation) {
        super(continuation);
        this.f281012w = qVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f281012w.emit(null, this);
    }
}
