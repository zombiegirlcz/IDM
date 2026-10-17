package com.google.common.graph;

import com.google.common.base.Supplier;

/* JADX INFO: loaded from: classes17.dex */
public final /* synthetic */ class a implements Supplier {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f49242a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f49243b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f49244c;
    public final /* synthetic */ Object d;

    public /* synthetic */ a(Object obj2, int i, Object obj3, Object obj4) {
        this.f49242a = i;
        this.d = obj2;
        this.f49243b = obj3;
        this.f49244c = obj4;
    }

    @Override // com.google.common.base.Supplier
    public final Object get() {
        switch (this.f49242a) {
            case 0:
                return ((AbstractBaseGraph) this.d).lambda$nodePairInvalidatableSet$2(this.f49243b, this.f49244c);
            default:
                return ((AbstractNetwork) this.d).lambda$nodePairInvalidatableSet$4(this.f49243b, this.f49244c);
        }
    }
}
