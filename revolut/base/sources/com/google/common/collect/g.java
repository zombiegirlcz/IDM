package com.google.common.collect;

import java.util.Comparator;
import java.util.function.Function;

/* JADX INFO: loaded from: classes17.dex */
public final /* synthetic */ class g implements Function {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f49207a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f49208b;

    public /* synthetic */ g(Object obj2, int i) {
        this.f49207a = i;
        this.f49208b = obj2;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj2) {
        switch (this.f49207a) {
            case 0:
                return CollectCollectors.lambda$flatteningToImmutableListMultimap$19((Function) this.f49208b, obj2);
            case 1:
                return CollectCollectors.lambda$flatteningToImmutableListMultimap$20((Function) this.f49208b, obj2);
            case 2:
                return CollectCollectors.lambda$flatteningToImmutableSetMultimap$22((Function) this.f49208b, obj2);
            case 3:
                return CollectCollectors.lambda$flatteningToImmutableSetMultimap$23((Function) this.f49208b, obj2);
            default:
                return ImmutableSortedMultiset.lambda$toImmutableSortedMultiset$4((Comparator) this.f49208b, (Multiset) obj2);
        }
    }
}
