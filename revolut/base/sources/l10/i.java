package l10;

import kkf.i8;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes16.dex */
public final class i extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ i8 f191380w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(i8 i8Var, Continuation continuation) {
        super(continuation);
        this.f191380w = i8Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f191380w.emit(null, this);
    }
}
