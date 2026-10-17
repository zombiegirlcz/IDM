package nje;

import java.time.Clock;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class q {

    @NotNull
    public static final p Companion = new p();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clock f216478a;

    public q(Clock clock) {
        Intrinsics.checkNotNullParameter(clock, "clock");
        this.f216478a = clock;
    }
}
