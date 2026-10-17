package oge;

import cie.c1;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes8.dex */
public final class e extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ c1 f225131w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(c1 c1Var, Continuation continuation) {
        super(continuation);
        this.f225131w = c1Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f225131w.emit(null, this);
    }
}
