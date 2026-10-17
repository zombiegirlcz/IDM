package com.google.common.util.concurrent;

import com.google.common.base.Function;
import java.lang.reflect.Constructor;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public final /* synthetic */ class m implements Function {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f49338a;

    public /* synthetic */ m(int i) {
        this.f49338a = i;
    }

    @Override // com.google.common.base.Function
    public final Object apply(Object obj2) {
        switch (this.f49338a) {
            case 0:
                return FuturesGetChecked.lambda$static$0((List) obj2);
            case 1:
                return FuturesGetChecked.lambda$static$1((List) obj2);
            case 2:
                return FuturesGetChecked.lambda$static$2((Constructor) obj2);
            default:
                return ClosingFuture.access$000((ClosingFuture) obj2);
        }
    }
}
