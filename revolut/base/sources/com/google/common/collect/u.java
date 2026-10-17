package com.google.common.collect;

import com.google.common.base.Function;
import com.google.common.collect.Table;
import java.util.Collection;
import java.util.Map;

/* JADX INFO: loaded from: classes17.dex */
public final /* synthetic */ class u implements Function {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f49227a;

    public /* synthetic */ u(int i) {
        this.f49227a = i;
    }

    @Override // com.google.common.base.Function
    public final Object apply(Object obj2) {
        switch (this.f49227a) {
            case 0:
                return Multimaps.access$100((Collection) obj2);
            case 1:
                return Tables.access$000((Table.Cell) obj2);
            case 2:
                return ((Iterable) obj2).iterator();
            case 3:
                return ((Range) obj2).upperBound();
            case 4:
                return ((Range) obj2).lowerBound();
            default:
                return TreeBasedTable.lambda$createColumnKeyIterator$0((Map) obj2);
        }
    }
}
