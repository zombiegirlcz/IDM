package com.google.common.collect;

import java.util.Comparator;
import java.util.function.Supplier;

/* JADX INFO: loaded from: classes17.dex */
public final /* synthetic */ class i implements Supplier {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f49212a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Comparator f49213b;

    public /* synthetic */ i(Comparator comparator, int i) {
        this.f49212a = i;
        this.f49213b = comparator;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        switch (this.f49212a) {
            case 0:
                return CollectCollectors.lambda$toImmutableSortedMap$10(this.f49213b);
            case 1:
                return CollectCollectors.lambda$toImmutableSortedSet$0(this.f49213b);
            case 2:
                return CollectCollectors.lambda$toImmutableSortedMap$8(this.f49213b);
            default:
                return TreeMultiset.create(this.f49213b);
        }
    }
}
