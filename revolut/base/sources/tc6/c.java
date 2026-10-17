package tc6;

import kotlin.coroutines.Continuation;
import t73.v;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ v f269576w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(v vVar, Continuation continuation) {
        super(continuation);
        this.f269576w = vVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f269576w.emit(null, this);
    }
}
