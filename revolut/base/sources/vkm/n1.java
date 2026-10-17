package vkm;

import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes13.dex */
public final class n1 extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ akg.m f290080w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Object f290081x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public FlowCollector f290082y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n1(akg.m mVar, Continuation continuation) {
        super(continuation);
        this.f290080w = mVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f290080w.emit(null, this);
    }
}
