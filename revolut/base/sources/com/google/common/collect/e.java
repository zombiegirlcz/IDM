package com.google.common.collect;

import com.google.common.collect.CollectCollectors;
import com.google.common.collect.ImmutableBiMap;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableListMultimap;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableRangeMap;
import com.google.common.collect.ImmutableRangeSet;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableSetMultimap;
import com.google.common.collect.ImmutableSortedMap;
import com.google.common.collect.ImmutableSortedSet;
import com.google.common.collect.ImmutableTable;
import com.google.common.collect.MoreCollectors;
import com.google.common.collect.TableCollectors;
import java.util.TreeMap;
import java.util.function.Function;

/* JADX INFO: loaded from: classes17.dex */
public final /* synthetic */ class e implements Function {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f49205a;

    public /* synthetic */ e(int i) {
        this.f49205a = i;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj2) {
        switch (this.f49205a) {
            case 0:
                return ((CollectCollectors.EnumSetAccumulator) obj2).toImmutableSet();
            case 1:
                return CollectCollectors.lambda$toImmutableMultiset$4((Multiset) obj2);
            case 2:
                return ((CollectCollectors.EnumMapAccumulator) obj2).toImmutableMap();
            case 3:
                return ((TopKSelector) obj2).topK();
            case 4:
                return ((MoreCollectors.ToOptionalState) obj2).getOptional();
            case 5:
                return MoreCollectors.lambda$static$1((MoreCollectors.ToOptionalState) obj2);
            case 6:
                return ((TableCollectors.ImmutableTableCollectorState) obj2).toTable();
            case 7:
                return ((ImmutableBiMap.Builder) obj2).buildOrThrow();
            case 8:
                return ((ImmutableRangeSet.Builder) obj2).build();
            case 9:
                return ((ImmutableList.Builder) obj2).build();
            case 10:
                return ((ImmutableSet.Builder) obj2).build();
            case 11:
                return ImmutableListMultimap.copyOf((Multimap) obj2);
            case 12:
                return ImmutableSetMultimap.copyOf((Multimap) obj2);
            case 13:
                return ImmutableSortedMap.copyOfSorted((TreeMap) obj2);
            case 14:
                return ((ImmutableRangeMap.Builder) obj2).build();
            case 15:
                return ((ImmutableMap.Builder) obj2).buildOrThrow();
            case 16:
                return ((ImmutableSortedSet.Builder) obj2).build();
            case 17:
                return ((ImmutableListMultimap.Builder) obj2).build();
            case 18:
                return ((ImmutableSetMultimap.Builder) obj2).build();
            case 19:
                return ((ImmutableSortedMap.Builder) obj2).buildOrThrow();
            default:
                return ((ImmutableTable.Builder) obj2).build();
        }
    }
}
