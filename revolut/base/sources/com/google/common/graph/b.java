package com.google.common.graph;

import com.google.common.base.Supplier;

/* JADX INFO: loaded from: classes17.dex */
public final /* synthetic */ class b implements Supplier {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f49245a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f49246b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f49247c;

    public /* synthetic */ b(AbstractBaseGraph abstractBaseGraph, Object obj2) {
        this.f49245a = 2;
        this.f49247c = abstractBaseGraph;
        this.f49246b = obj2;
    }

    @Override // com.google.common.base.Supplier
    public final Object get() {
        switch (this.f49245a) {
            case 0:
                return AbstractBaseGraph.lambda$nodePairInvalidatableSet$3(this.f49246b, this.f49247c);
            case 1:
                return AbstractNetwork.lambda$nodePairInvalidatableSet$5(this.f49246b, this.f49247c);
            default:
                return ((AbstractBaseGraph) this.f49247c).lambda$nodeInvalidatableSet$0(this.f49246b);
        }
    }

    public /* synthetic */ b(Object obj2, Object obj3, int i) {
        this.f49245a = i;
        this.f49246b = obj2;
        this.f49247c = obj3;
    }
}
