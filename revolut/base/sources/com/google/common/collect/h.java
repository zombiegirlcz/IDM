package com.google.common.collect;

import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.ToIntFunction;

/* JADX INFO: loaded from: classes17.dex */
public final /* synthetic */ class h implements BiConsumer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f49209a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function f49210b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ToIntFunction f49211c;

    public /* synthetic */ h(Function function, ToIntFunction toIntFunction, int i) {
        this.f49209a = i;
        this.f49210b = function;
        this.f49211c = toIntFunction;
    }

    @Override // java.util.function.BiConsumer
    public final void accept(Object obj2, Object obj3) {
        switch (this.f49209a) {
            case 0:
                CollectCollectors.lambda$toImmutableMultiset$2(this.f49210b, this.f49211c, (Multiset) obj2, obj3);
                break;
            case 1:
                CollectCollectors.lambda$toMultiset$5(this.f49210b, this.f49211c, (Multiset) obj2, obj3);
                break;
            default:
                ImmutableSortedMultiset.mapAndAdd(obj3, (Multiset) obj2, this.f49210b, this.f49211c);
                break;
        }
    }
}
