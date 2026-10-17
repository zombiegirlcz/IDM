package jhi;

import com.revolut.data.model.Data;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes10.dex */
public final class j extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ aci.g f174264w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public FlowCollector f174265x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Data f174266y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(aci.g gVar, Continuation continuation) {
        super(continuation);
        this.f174264w = gVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f174264w.emit(null, this);
    }
}
