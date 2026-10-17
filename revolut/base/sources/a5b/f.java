package a5b;

import a07.o;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes6.dex */
public final class f extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ o f1341w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(o oVar, Continuation continuation) {
        super(continuation);
        this.f1341w = oVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f1341w.emit(null, this);
    }
}
