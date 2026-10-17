package vgf;

import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes8.dex */
public final class l0 extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ ayf.g f289113w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public FlowCollector f289114x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public String f289115y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(ayf.g gVar, Continuation continuation) {
        super(continuation);
        this.f289113w = gVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f289113w.emit(null, this);
    }
}
