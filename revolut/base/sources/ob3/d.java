package ob3;

import kotlin.coroutines.Continuation;
import nvk.v;

/* JADX INFO: loaded from: classes21.dex */
public final class d extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ v f223869w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(v vVar, Continuation continuation) {
        super(continuation);
        this.f223869w = vVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f223869w.emit(null, this);
    }
}
