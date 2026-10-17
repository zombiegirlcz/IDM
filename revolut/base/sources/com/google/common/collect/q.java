package com.google.common.collect;

import java.util.function.ToIntFunction;

/* JADX INFO: loaded from: classes17.dex */
public final /* synthetic */ class q implements ToIntFunction {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f49222a;

    public /* synthetic */ q(int i) {
        this.f49222a = i;
    }

    @Override // java.util.function.ToIntFunction
    public final int applyAsInt(Object obj2) {
        switch (this.f49222a) {
            case 0:
                return ImmutableMultiset.lambda$toImmutableMultiset$0(obj2);
            default:
                return ImmutableSortedMultiset.lambda$toImmutableSortedMultiset$0(obj2);
        }
    }
}
