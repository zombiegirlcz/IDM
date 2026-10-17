package c7e;

import kotlin.coroutines.Continuation;
import qv0.p;

/* JADX INFO: loaded from: classes8.dex */
public final class d extends gim.c {
    public sfe.n u;
    public p v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Object f21932w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f21933x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ g f21934y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(g gVar, Continuation continuation) {
        super(continuation);
        this.f21934y = gVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f21933x = obj2;
        this.z |= Integer.MIN_VALUE;
        return this.f21934y.b3(null, this);
    }
}
