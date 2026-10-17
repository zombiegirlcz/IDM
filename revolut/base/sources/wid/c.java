package wid;

import java.time.Duration;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import l80.e;
import org.jetbrains.annotations.NotNull;
import vkm.q;
import wkm.l;

/* JADX INFO: loaded from: classes7.dex */
public final class c {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Duration f297882b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f297883a;

    static {
        Duration durationOfHours = Duration.ofHours(1L);
        Intrinsics.checkNotNullExpressionValue(durationOfHours, "ofHours(...)");
        f297882b = durationOfHours;
    }

    public c(e dateProvider) {
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        this.f297883a = dateProvider;
    }

    public final l a(Flow nearestEndTimeFlow) {
        Intrinsics.checkNotNullParameter(nearestEndTimeFlow, "nearestEndTimeFlow");
        return q.Q(q.q(nearestEndTimeFlow), new w2a.q((Continuation) null, this, 14));
    }
}
