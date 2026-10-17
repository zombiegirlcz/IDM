package d4j;

import acb.h;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes10.dex */
public final class a extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ h f111336w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(h hVar, Continuation continuation) {
        super(continuation);
        this.f111336w = hVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f111336w.emit(null, this);
    }
}
