package tb0;

import kotlin.coroutines.Continuation;
import t73.v;

/* JADX INFO: loaded from: classes19.dex */
public final class e extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ v f269423w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(v vVar, Continuation continuation) {
        super(continuation);
        this.f269423w = vVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f269423w.emit(null, this);
    }
}
