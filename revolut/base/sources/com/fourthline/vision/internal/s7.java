package com.fourthline.vision.internal;

import com.fourthline.core.internal.TimestampProvider;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class s7 extends m {
    private final oa e;
    private boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final pa f36870g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s7(@NotNull oa detectionAreaProvider, @NotNull TimestampProvider timestampProvider, long j2, @NotNull TimeUnit timeUnit) {
        super(timestampProvider, j2, timeUnit);
        Intrinsics.checkNotNullParameter(detectionAreaProvider, "detectionAreaProvider");
        Intrinsics.checkNotNullParameter(timestampProvider, "timestampProvider");
        Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
        this.e = detectionAreaProvider;
        this.f36870g = pa.f36697c;
    }

    @Override // com.fourthline.vision.internal.m, com.fourthline.vision.internal.qd, com.fourthline.vision.internal.x1
    public /* bridge */ /* synthetic */ Object consume(Object obj2, Continuation continuation) {
        return consume((Unit) obj2, (Continuation<? super Unit>) continuation);
    }

    @Override // com.fourthline.vision.internal.m
    @NotNull
    public pa getError() {
        return this.f36870g;
    }

    @Override // com.fourthline.vision.internal.m
    public Object consume(@NotNull Unit unit, @NotNull Continuation<? super Unit> continuation) {
        if (!this.f) {
            if (!ga.isValid(this.e.contentDetectionArea())) {
                Object objConsume = super.consume(unit, continuation);
                return objConsume == fim.a.COROUTINE_SUSPENDED ? objConsume : Unit.f186387a;
            }
            this.f = true;
        }
        return Unit.f186387a;
    }

    public /* synthetic */ s7(oa oaVar, TimestampProvider timestampProvider, long j2, TimeUnit timeUnit, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(oaVar, timestampProvider, j2, (i & 8) != 0 ? TimeUnit.MILLISECONDS : timeUnit);
    }
}
