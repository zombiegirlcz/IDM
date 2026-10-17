package d7j;

import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes10.dex */
public final class z1 extends gim.c {
    public Function1 u;
    public hlm.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f112086w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f112087x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.edit.g f112088y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z1(com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.edit.g gVar, Continuation continuation) {
        super(continuation);
        this.f112088y = gVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f112087x = obj2;
        this.z |= Integer.MIN_VALUE;
        return this.f112088y.P2(this, null);
    }
}
