package com.google.common.graph;

import com.google.common.base.Supplier;

/* JADX INFO: loaded from: classes17.dex */
public final /* synthetic */ class e implements Supplier {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f49252a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractNetwork f49253b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f49254c;

    public /* synthetic */ e(AbstractNetwork abstractNetwork, Object obj2, int i) {
        this.f49252a = i;
        this.f49253b = abstractNetwork;
        this.f49254c = obj2;
    }

    @Override // com.google.common.base.Supplier
    public final Object get() {
        switch (this.f49252a) {
            case 0:
                return this.f49253b.lambda$nodeInvalidatableSet$2(this.f49254c);
            default:
                return this.f49253b.lambda$edgeInvalidatableSet$0(this.f49254c);
        }
    }
}
