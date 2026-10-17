package qq3;

import kotlin.coroutines.Continuation;
import pkf.d1;

/* JADX INFO: loaded from: classes21.dex */
public final class e extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ d1 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f248467w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(d1 d1Var, Continuation continuation) {
        super(continuation);
        this.v = d1Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f248467w |= Integer.MIN_VALUE;
        return this.v.z(null, this);
    }
}
