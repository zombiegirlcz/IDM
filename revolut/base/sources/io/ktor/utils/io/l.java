package io.ktor.utils.io;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class l extends kotlin.jvm.internal.q implements Function1 {
    public static final l f = new l(1, ClosedWriteChannelException.class, "<init>", "<init>(Ljava/lang/Throwable;)V", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return new ClosedWriteChannelException((Throwable) obj2);
    }
}
