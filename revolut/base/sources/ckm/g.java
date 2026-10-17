package ckm;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;

/* JADX INFO: loaded from: classes14.dex */
public final class g implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f24909a = new g();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        ProtoBuf.Type it8 = (ProtoBuf.Type) obj2;
        Intrinsics.checkNotNullParameter(it8, "it");
        return Integer.valueOf(it8.getArgumentCount());
    }
}
