package com.fourthline.vision.internal;

import com.fourthline.core.internal.TimestampProvider;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public class zd extends m {
    private final pa e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zd(@NotNull TimestampProvider timestampProvider, long j2, @NotNull TimeUnit timeUnit) {
        super(timestampProvider, j2, timeUnit);
        Intrinsics.checkNotNullParameter(timestampProvider, "timestampProvider");
        Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
        this.e = pa.f36696b;
    }

    @Override // com.fourthline.vision.internal.m
    @NotNull
    public pa getError() {
        return this.e;
    }

    public /* synthetic */ zd(TimestampProvider timestampProvider, long j2, TimeUnit timeUnit, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(timestampProvider, j2, (i & 4) != 0 ? TimeUnit.MILLISECONDS : timeUnit);
    }
}
