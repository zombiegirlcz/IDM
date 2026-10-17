package g32;

import g23.e0;
import gim.c;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes20.dex */
public final class a extends c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ e0 f140184w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(e0 e0Var, Continuation continuation) {
        super(continuation);
        this.f140184w = e0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f140184w.emit(null, this);
    }
}
