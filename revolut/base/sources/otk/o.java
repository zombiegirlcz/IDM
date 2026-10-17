package otk;

import kotlin.coroutines.Continuation;
import ood.x;

/* JADX INFO: loaded from: classes12.dex */
public final class o extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ x f229741w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(x xVar, Continuation continuation) {
        super(continuation);
        this.f229741w = xVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f229741w.emit(null, this);
    }
}
