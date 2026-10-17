package g25;

import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes22.dex */
public final class a extends gim.c {
    public boolean A;
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ g0c.o f139881w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public FlowCollector f139882x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public x15.e f139883y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(g0c.o oVar, Continuation continuation) {
        super(continuation);
        this.f139881w = oVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f139881w.emit(null, this);
    }
}
