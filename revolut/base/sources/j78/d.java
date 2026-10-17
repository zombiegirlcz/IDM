package j78;

import iyg.a0;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes4.dex */
public final class d extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ a0 f171867w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(a0 a0Var, Continuation continuation) {
        super(continuation);
        this.f171867w = a0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f171867w.emit(null, this);
    }
}
