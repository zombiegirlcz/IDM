package com.fourthline.vision.internal;

import com.fourthline.core.internal.TimestampProvider;
import com.fourthline.vision.internal.ra;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public abstract class m implements qd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TimestampProvider f36514a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f36515b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final TimeUnit f36516c;
    private long d;

    public m(@NotNull TimestampProvider timestampProvider, long j2, @NotNull TimeUnit timeUnit) {
        Intrinsics.checkNotNullParameter(timestampProvider, "timestampProvider");
        Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
        this.f36514a = timestampProvider;
        this.f36515b = j2;
        this.f36516c = timeUnit;
        this.d = Long.MAX_VALUE;
    }

    public static /* synthetic */ Object consume$suspendImpl(m mVar, Unit unit, Continuation<? super Unit> continuation) throws ra.a {
        if (mVar.f36514a.getCurrentTimestamp() - mVar.d < mVar.f36516c.toMillis(mVar.f36515b)) {
            return Unit.f186387a;
        }
        throw new ra.a(mVar.getError(), null, 2, null);
    }

    public Object consume(@NotNull Unit unit, @NotNull Continuation<? super Unit> continuation) {
        return consume$suspendImpl(this, unit, continuation);
    }

    @NotNull
    public abstract pa getError();

    public final long getStartTimestamp() {
        return this.d;
    }

    public final void setStartTimestamp(long j2) {
        this.d = j2;
    }

    @Override // com.fourthline.vision.internal.qd, com.fourthline.vision.internal.pd
    public void start() {
        this.d = this.f36514a.getCurrentTimestamp();
    }

    @Override // com.fourthline.vision.internal.qd, com.fourthline.vision.internal.pd
    public void stop() {
        this.d = Long.MAX_VALUE;
    }

    @Override // com.fourthline.vision.internal.qd, com.fourthline.vision.internal.x1
    public /* bridge */ /* synthetic */ Object consume(Object obj2, Continuation continuation) {
        return consume((Unit) obj2, (Continuation<? super Unit>) continuation);
    }

    public /* synthetic */ m(TimestampProvider timestampProvider, long j2, TimeUnit timeUnit, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(timestampProvider, j2, (i & 4) != 0 ? TimeUnit.MILLISECONDS : timeUnit);
    }
}
