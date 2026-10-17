package os5;

import kotlin.coroutines.Continuation;
import ood.x;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ x f229227w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(x xVar, Continuation continuation) {
        super(continuation);
        this.f229227w = xVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f229227w.emit(null, this);
    }
}
