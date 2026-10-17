package iob;

import java.time.Duration;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class g {

    @NotNull
    public static final d Companion = new d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Duration f163214b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Duration f163215c;
    public static final Duration d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l80.e f163216a;

    static {
        Duration durationOfMinutes = Duration.ofMinutes(1L);
        Intrinsics.checkNotNullExpressionValue(durationOfMinutes, "ofMinutes(...)");
        f163214b = durationOfMinutes;
        Duration durationOfHours = Duration.ofHours(1L);
        Intrinsics.checkNotNullExpressionValue(durationOfHours, "ofHours(...)");
        f163215c = durationOfHours;
        Duration durationOfDays = Duration.ofDays(1L);
        Intrinsics.checkNotNullExpressionValue(durationOfDays, "ofDays(...)");
        d = durationOfDays;
    }

    public g(l80.e dateProvider) {
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        this.f163216a = dateProvider;
    }
}
