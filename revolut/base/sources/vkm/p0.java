package vkm;

import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes13.dex */
public final class p0 extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public FlowCollector f290093w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ akg.m f290094x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(akg.m mVar, Continuation continuation) {
        super(continuation);
        this.f290094x = mVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f290094x.emit(null, this);
    }
}
