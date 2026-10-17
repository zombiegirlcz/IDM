package com.google.common.collect;

import com.google.common.collect.TableCollectors;
import java.util.function.BinaryOperator;

/* JADX INFO: loaded from: classes17.dex */
public final /* synthetic */ class x implements BinaryOperator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f49233a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BinaryOperator f49234b;

    public /* synthetic */ x(BinaryOperator binaryOperator, int i) {
        this.f49233a = i;
        this.f49234b = binaryOperator;
    }

    @Override // java.util.function.BiFunction
    public final Object apply(Object obj2, Object obj3) {
        switch (this.f49233a) {
            case 0:
                return TableCollectors.lambda$toTable$7(this.f49234b, (Table) obj2, (Table) obj3);
            default:
                return TableCollectors.lambda$toImmutableTable$3(this.f49234b, (TableCollectors.ImmutableTableCollectorState) obj2, (TableCollectors.ImmutableTableCollectorState) obj3);
        }
    }
}
