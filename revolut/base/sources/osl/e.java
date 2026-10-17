package osl;

import kotlin.coroutines.Continuation;
import ood.x;

/* JADX INFO: loaded from: classes12.dex */
public final class e extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ x f229364w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(x xVar, Continuation continuation) {
        super(continuation);
        this.f229364w = xVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f229364w.emit(null, this);
    }
}
