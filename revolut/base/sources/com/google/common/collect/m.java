package com.google.common.collect;

import com.google.common.collect.MultimapBuilder;
import java.util.function.BinaryOperator;
import java.util.function.Supplier;

/* JADX INFO: loaded from: classes17.dex */
public final /* synthetic */ class m implements Supplier {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f49216a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f49217b;

    public /* synthetic */ m(Object obj2, int i) {
        this.f49216a = i;
        this.f49217b = obj2;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        switch (this.f49216a) {
            case 0:
                return CollectCollectors.lambda$toImmutableEnumMap$15((BinaryOperator) this.f49217b);
            case 1:
                return ((MultimapBuilder.ListMultimapBuilder) this.f49217b).build();
            default:
                return ((MultimapBuilder.SetMultimapBuilder) this.f49217b).build();
        }
    }
}
