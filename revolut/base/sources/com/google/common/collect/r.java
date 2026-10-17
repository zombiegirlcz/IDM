package com.google.common.collect;

import com.google.common.collect.Iterators;
import java.util.Comparator;
import java.util.Map;

/* JADX INFO: loaded from: classes17.dex */
public final /* synthetic */ class r implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f49223a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Comparator f49224b;

    public /* synthetic */ r(Comparator comparator, int i) {
        this.f49223a = i;
        this.f49224b = comparator;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj2, Object obj3) {
        switch (this.f49223a) {
            case 0:
                return Iterators.MergingIterator.lambda$new$0(this.f49224b, (PeekingIterator) obj2, (PeekingIterator) obj3);
            default:
                return ImmutableSortedMap.lambda$fromEntries$0(this.f49224b, (Map.Entry) obj2, (Map.Entry) obj3);
        }
    }
}
