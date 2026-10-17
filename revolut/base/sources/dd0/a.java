package dd0;

import ard.b0;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: loaded from: classes19.dex */
public final class a extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ b0 f113077w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Ref$ObjectRef f113078x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b0 b0Var, Continuation continuation) {
        super(continuation);
        this.f113077w = b0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f113077w.emit(null, this);
    }
}
