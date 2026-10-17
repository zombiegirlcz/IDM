package ii5;

import gim.i;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends gim.c {
    public boolean u;
    public i v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f161577w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ g f161578x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f161579y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(g gVar, Continuation continuation) {
        super(continuation);
        this.f161578x = gVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f161577w = obj2;
        this.f161579y |= Integer.MIN_VALUE;
        return this.f161578x.d3(false, null, this);
    }
}
