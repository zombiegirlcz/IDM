package com.fourthline.vision.internal;

import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class dd extends k8 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dd(@NotNull d2 dataSource, @NotNull Function0<Long> maxDuration) {
        super(dataSource, maxDuration);
        Intrinsics.checkNotNullParameter(dataSource, "dataSource");
        Intrinsics.checkNotNullParameter(maxDuration, "maxDuration");
    }

    @Override // com.fourthline.vision.internal.k8
    public long getTrimmedVideoStartMs(@NotNull List<? extends z8> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        return 0L;
    }
}
