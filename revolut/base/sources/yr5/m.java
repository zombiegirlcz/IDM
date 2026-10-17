package yr5;

import kotlin.coroutines.Continuation;
import ymk.x;

/* JADX INFO: loaded from: classes3.dex */
public final class m extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ x f316142w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(x xVar, Continuation continuation) {
        super(continuation);
        this.f316142w = xVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f316142w.emit(null, this);
    }
}
