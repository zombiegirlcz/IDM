package bzg;

import ble.e1;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes9.dex */
public final class s extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ e1 f20017w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(e1 e1Var, Continuation continuation) {
        super(continuation);
        this.f20017w = e1Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f20017w.emit(null, this);
    }
}
