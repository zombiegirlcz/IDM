package ysk;

import kotlin.coroutines.Continuation;
import ymk.x;

/* JADX INFO: loaded from: classes12.dex */
public final class f extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ x f316512w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(x xVar, Continuation continuation) {
        super(continuation);
        this.f316512w = xVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f316512w.emit(null, this);
    }
}
