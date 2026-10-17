package com.google.common.collect;

import com.google.common.collect.CollectCollectors;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableRangeSet;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableSortedSet;
import com.google.common.collect.MoreCollectors;
import java.util.function.BiConsumer;

/* JADX INFO: loaded from: classes17.dex */
public final /* synthetic */ class d implements BiConsumer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f49204a;

    public /* synthetic */ d(int i) {
        this.f49204a = i;
    }

    @Override // java.util.function.BiConsumer
    public final void accept(Object obj2, Object obj3) {
        switch (this.f49204a) {
            case 0:
                ((CollectCollectors.EnumSetAccumulator) obj2).add((Enum) obj3);
                break;
            case 1:
                ((TopKSelector) obj2).offer(obj3);
                break;
            case 2:
                ((MoreCollectors.ToOptionalState) obj2).add(obj3);
                break;
            case 3:
                MoreCollectors.lambda$static$0((MoreCollectors.ToOptionalState) obj2, obj3);
                break;
            case 4:
                ((ImmutableList.Builder) obj2).add(obj3);
                break;
            case 5:
                ((ImmutableSet.Builder) obj2).add(obj3);
                break;
            case 6:
                ((ImmutableRangeSet.Builder) obj2).add((Range) obj3);
                break;
            default:
                ((ImmutableSortedSet.Builder) obj2).add(obj3);
                break;
        }
    }
}
