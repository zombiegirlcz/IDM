package com.google.common.collect;

import java.util.Map;
import java.util.function.Function;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k implements Function {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f49214a;

    public /* synthetic */ k(int i) {
        this.f49214a = i;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj2) {
        switch (this.f49214a) {
            case 0:
                return ImmutableMap.copyOf((Map) obj2);
            case 1:
                return Long.valueOf(System.nanoTime());
            default:
                return new akl.p((Class) obj2, 19);
        }
    }
}
