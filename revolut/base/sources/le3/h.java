package le3;

import kkf.i8;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes21.dex */
public final class h extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ i8 f194464w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i8 i8Var, Continuation continuation) {
        super(continuation);
        this.f194464w = i8Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f194464w.emit(null, this);
    }
}
