package com.google.common.collect;

import com.google.common.collect.TableCollectors;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;

/* JADX INFO: loaded from: classes17.dex */
public final /* synthetic */ class w implements BiConsumer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f49230a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function f49231b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function f49232c;
    public final /* synthetic */ Function d;
    public final /* synthetic */ BinaryOperator e;

    public /* synthetic */ w(Function function, Function function2, Function function3, BinaryOperator binaryOperator, int i) {
        this.f49230a = i;
        this.f49231b = function;
        this.f49232c = function2;
        this.d = function3;
        this.e = binaryOperator;
    }

    @Override // java.util.function.BiConsumer
    public final void accept(Object obj2, Object obj3) {
        switch (this.f49230a) {
            case 0:
                TableCollectors.lambda$toTable$6(this.f49231b, this.f49232c, this.d, this.e, (Table) obj2, obj3);
                break;
            default:
                TableCollectors.lambda$toImmutableTable$2(this.f49231b, this.f49232c, this.d, this.e, (TableCollectors.ImmutableTableCollectorState) obj2, obj3);
                break;
        }
    }
}
