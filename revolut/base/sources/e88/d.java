package e88;

import dwi.v;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes4.dex */
public final class d extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ v f123625w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(v vVar, Continuation continuation) {
        super(continuation);
        this.f123625w = vVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f123625w.emit(null, this);
    }
}
