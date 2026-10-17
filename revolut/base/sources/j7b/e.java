package j7b;

import iyg.a0;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes6.dex */
public final class e extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ a0 f171890w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(a0 a0Var, Continuation continuation) {
        super(continuation);
        this.f171890w = a0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f171890w.emit(null, this);
    }
}
