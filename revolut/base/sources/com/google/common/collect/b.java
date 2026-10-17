package com.google.common.collect;

import com.google.common.collect.CollectCollectors;
import com.google.common.collect.ImmutableBiMap;
import com.google.common.collect.ImmutableListMultimap;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableRangeMap;
import com.google.common.collect.ImmutableSetMultimap;
import com.google.common.collect.ImmutableSortedMap;
import java.util.function.BiConsumer;
import java.util.function.Function;

/* JADX INFO: loaded from: classes17.dex */
public final /* synthetic */ class b implements BiConsumer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f49200a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function f49201b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function f49202c;

    public /* synthetic */ b(Function function, Function function2, int i) {
        this.f49200a = i;
        this.f49201b = function;
        this.f49202c = function2;
    }

    @Override // java.util.function.BiConsumer
    public final void accept(Object obj2, Object obj3) {
        switch (this.f49200a) {
            case 0:
                CollectCollectors.lambda$toImmutableBiMap$11(this.f49201b, this.f49202c, (ImmutableBiMap.Builder) obj2, obj3);
                break;
            case 1:
                CollectCollectors.lambda$flatteningToMultimap$26(this.f49201b, this.f49202c, (Multimap) obj2, obj3);
                break;
            case 2:
                CollectCollectors.lambda$toImmutableRangeMap$17(this.f49201b, this.f49202c, (ImmutableRangeMap.Builder) obj2, obj3);
                break;
            case 3:
                CollectCollectors.lambda$toImmutableEnumMap$14(this.f49201b, this.f49202c, (CollectCollectors.EnumMapAccumulator) obj2, obj3);
                break;
            case 4:
                CollectCollectors.lambda$toImmutableMap$7(this.f49201b, this.f49202c, (ImmutableMap.Builder) obj2, obj3);
                break;
            case 5:
                CollectCollectors.lambda$toImmutableListMultimap$18(this.f49201b, this.f49202c, (ImmutableListMultimap.Builder) obj2, obj3);
                break;
            case 6:
                CollectCollectors.lambda$toImmutableSetMultimap$21(this.f49201b, this.f49202c, (ImmutableSetMultimap.Builder) obj2, obj3);
                break;
            case 7:
                CollectCollectors.lambda$toImmutableSortedMap$9(this.f49201b, this.f49202c, (ImmutableSortedMap.Builder) obj2, obj3);
                break;
            case 8:
                CollectCollectors.lambda$toImmutableEnumMap$16(this.f49201b, this.f49202c, (CollectCollectors.EnumMapAccumulator) obj2, obj3);
                break;
            default:
                CollectCollectors.lambda$toMultimap$24(this.f49201b, this.f49202c, (Multimap) obj2, obj3);
                break;
        }
    }
}
