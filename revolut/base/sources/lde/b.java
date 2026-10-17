package lde;

import kkf.i8;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes8.dex */
public final class b extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ i8 f194074w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(i8 i8Var, Continuation continuation) {
        super(continuation);
        this.f194074w = i8Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f194074w.emit(null, this);
    }
}
