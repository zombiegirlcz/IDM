package com.google.common.graph;

import com.google.common.base.Supplier;

/* JADX INFO: loaded from: classes17.dex */
public final /* synthetic */ class c implements Supplier {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f49248a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f49249b;

    public /* synthetic */ c(Object obj2, int i) {
        this.f49248a = i;
        this.f49249b = obj2;
    }

    @Override // com.google.common.base.Supplier
    public final Object get() {
        switch (this.f49248a) {
            case 0:
                return AbstractBaseGraph.lambda$nodeInvalidatableSet$1(this.f49249b);
            case 1:
                return AbstractNetwork.lambda$nodeInvalidatableSet$3(this.f49249b);
            default:
                return AbstractNetwork.lambda$edgeInvalidatableSet$1(this.f49249b);
        }
    }
}
