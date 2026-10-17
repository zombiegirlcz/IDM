package com.google.common.collect;

import com.google.common.collect.ImmutableBiMap;
import com.google.common.collect.ImmutableTable;
import com.google.common.collect.MoreCollectors;
import java.util.LinkedHashMap;
import java.util.function.Supplier;

/* JADX INFO: loaded from: classes17.dex */
public final /* synthetic */ class c implements Supplier {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f49203a;

    public /* synthetic */ c(int i) {
        this.f49203a = i;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        switch (this.f49203a) {
            case 0:
                return CollectCollectors.lambda$toImmutableEnumSetGeneric$1();
            case 1:
                return CollectCollectors.lambda$toImmutableEnumMap$13();
            case 2:
                return new MoreCollectors.ToOptionalState();
            case 3:
                return TableCollectors.lambda$toImmutableTable$1();
            case 4:
                return ImmutableRangeMap.builder();
            case 5:
                return ImmutableSet.builder();
            case 6:
                return ImmutableRangeSet.builder();
            case 7:
                return LinkedHashMultiset.create();
            case 8:
                return ImmutableListMultimap.builder();
            case 9:
                return ImmutableSetMultimap.builder();
            case 10:
                return new LinkedHashMap();
            case 11:
                return new ImmutableBiMap.Builder();
            default:
                return new ImmutableTable.Builder();
        }
    }
}
