package d0a;

import acb.h;
import gim.c;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes5.dex */
public final class b extends c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ h f110337w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(h hVar, Continuation continuation) {
        super(continuation);
        this.f110337w = hVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f110337w.emit(null, this);
    }
}
