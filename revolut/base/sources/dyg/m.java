package dyg;

import dwi.v;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes9.dex */
public final class m extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ v f121120w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(v vVar, Continuation continuation) {
        super(continuation);
        this.f121120w = vVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f121120w.emit(null, this);
    }
}
