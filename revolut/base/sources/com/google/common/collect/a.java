package com.google.common.collect;

import com.google.common.collect.CollectCollectors;
import com.google.common.collect.ImmutableBiMap;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableListMultimap;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.ImmutableRangeMap;
import com.google.common.collect.ImmutableRangeSet;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableSetMultimap;
import com.google.common.collect.ImmutableSortedMap;
import com.google.common.collect.ImmutableSortedSet;
import com.google.common.collect.ImmutableTable;
import com.google.common.collect.MoreCollectors;
import java.util.function.BinaryOperator;

/* JADX INFO: loaded from: classes17.dex */
public final /* synthetic */ class a implements BinaryOperator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f49199a;

    public /* synthetic */ a(int i) {
        this.f49199a = i;
    }

    @Override // java.util.function.BiFunction
    public final Object apply(Object obj2, Object obj3) {
        switch (this.f49199a) {
            case 0:
                return CollectCollectors.lambda$toImmutableEnumMap$12(obj2, obj3);
            case 1:
                return ((CollectCollectors.EnumSetAccumulator) obj2).combine((CollectCollectors.EnumSetAccumulator) obj3);
            case 2:
                return CollectCollectors.lambda$flatteningToMultimap$27((Multimap) obj2, (Multimap) obj3);
            case 3:
                return CollectCollectors.lambda$toImmutableMultiset$3((Multiset) obj2, (Multiset) obj3);
            case 4:
                return ((CollectCollectors.EnumMapAccumulator) obj2).combine((CollectCollectors.EnumMapAccumulator) obj3);
            case 5:
                return CollectCollectors.lambda$toMultiset$6((Multiset) obj2, (Multiset) obj3);
            case 6:
                return CollectCollectors.lambda$toMultimap$25((Multimap) obj2, (Multimap) obj3);
            case 7:
                return ((TopKSelector) obj2).combine((TopKSelector) obj3);
            case 8:
                return ((MoreCollectors.ToOptionalState) obj2).combine((MoreCollectors.ToOptionalState) obj3);
            case 9:
                return TableCollectors.lambda$toTable$5(obj2, obj3);
            case 10:
                return ((ImmutableBiMap.Builder) obj2).combine((ImmutableMap.Builder) obj3);
            case 11:
                return ((ImmutableRangeSet.Builder) obj2).combine((ImmutableRangeSet.Builder) obj3);
            case 12:
                return ((ImmutableList.Builder) obj2).combine((ImmutableList.Builder) obj3);
            case 13:
                return ((ImmutableSet.Builder) obj2).combine((ImmutableSet.Builder) obj3);
            case 14:
                return ((ImmutableRangeMap.Builder) obj2).combine((ImmutableRangeMap.Builder) obj3);
            case 15:
                return ((ImmutableMap.Builder) obj2).combine((ImmutableMap.Builder) obj3);
            case 16:
                return ((ImmutableSortedSet.Builder) obj2).combine((ImmutableSet.Builder) obj3);
            case 17:
                return ((ImmutableListMultimap.Builder) obj2).combine((ImmutableMultimap.Builder) obj3);
            case 18:
                return ((ImmutableSetMultimap.Builder) obj2).combine((ImmutableMultimap.Builder) obj3);
            case 19:
                return ((ImmutableSortedMap.Builder) obj2).combine((ImmutableSortedMap.Builder) obj3);
            case 20:
                return ImmutableSortedMultiset.lambda$toImmutableSortedMultiset$3((Multiset) obj2, (Multiset) obj3);
            default:
                return ((ImmutableTable.Builder) obj2).combine((ImmutableTable.Builder) obj3);
        }
    }
}
