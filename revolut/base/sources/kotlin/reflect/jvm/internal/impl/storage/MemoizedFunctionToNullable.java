package kotlin.reflect.jvm.internal.impl.storage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes13.dex */
public interface MemoizedFunctionToNullable<P, R> extends Function1<P, R> {
    @Override // kotlin.jvm.functions.Function1
    /* synthetic */ Object invoke(Object obj2);

    boolean isComputed(P p2);
}
