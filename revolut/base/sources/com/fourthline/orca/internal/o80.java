package com.fourthline.orca.internal;

import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public interface o80 extends ukm.j0 {
    @Override // ukm.j0
    /* synthetic */ boolean close(Throwable th10);

    @Override // ukm.j0
    @NotNull
    /* synthetic */ flm.e getOnSend();

    @Override // ukm.j0
    /* synthetic */ void invokeOnClose(@NotNull Function1 function1);

    @Override // ukm.j0
    /* synthetic */ boolean isClosedForSend();

    @Override // ukm.j0
    @yhm.d
    /* synthetic */ boolean offer(Object obj2);

    @Override // ukm.j0
    /* synthetic */ Object send(Object obj2, @NotNull Continuation continuation);

    @Override // ukm.j0
    @NotNull
    /* JADX INFO: renamed from: trySend-JP2dKIU */
    /* synthetic */ Object mo3647trySendJP2dKIU(Object obj2);
}
