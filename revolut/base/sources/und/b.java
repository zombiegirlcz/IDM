package und;

import kotlin.coroutines.Continuation;
import uh7.q;

/* JADX INFO: loaded from: classes7.dex */
public final class b extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ q f281419w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(q qVar, Continuation continuation) {
        super(continuation);
        this.f281419w = qVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f281419w.emit(null, this);
    }
}
