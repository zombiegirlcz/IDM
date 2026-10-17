package dy0;

import android.animation.TimeInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class h0 {

    @NotNull
    public static final f0 Companion = new f0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Function0 f120990a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Function0 f120991b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TimeInterpolator f120992c;
    public final TimeInterpolator d;

    public h0(Function0 showDurationProvider, Function0 hideDurationProvider, TimeInterpolator showInterpolator, TimeInterpolator hideInterpolator) {
        Intrinsics.checkNotNullParameter(showDurationProvider, "showDurationProvider");
        Intrinsics.checkNotNullParameter(hideDurationProvider, "hideDurationProvider");
        Intrinsics.checkNotNullParameter(showInterpolator, "showInterpolator");
        Intrinsics.checkNotNullParameter(hideInterpolator, "hideInterpolator");
        this.f120990a = showDurationProvider;
        this.f120991b = hideDurationProvider;
        this.f120992c = showInterpolator;
        this.d = hideInterpolator;
    }

    public final long a(r targetState) {
        Intrinsics.checkNotNullParameter(targetState, "targetState");
        int i = g0.f120972a[targetState.ordinal()];
        if (i == 1) {
            return ((Number) this.f120990a.invoke()).longValue();
        }
        if (i == 2) {
            return ((Number) this.f120991b.invoke()).longValue();
        }
        throw new NoWhenBranchMatchedException();
    }

    public final TimeInterpolator b(r targetState) {
        Intrinsics.checkNotNullParameter(targetState, "targetState");
        int i = g0.f120972a[targetState.ordinal()];
        if (i == 1) {
            return this.f120992c;
        }
        if (i == 2) {
            return this.d;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final boolean c(r targetState) {
        Intrinsics.checkNotNullParameter(targetState, "targetState");
        return a(targetState) != -1;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj2;
        return Intrinsics.f(this.f120990a, h0Var.f120990a) && Intrinsics.f(this.f120991b, h0Var.f120991b) && Intrinsics.f(this.f120992c, h0Var.f120992c) && Intrinsics.f(this.d, h0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.f120992c.hashCode() + ((this.f120991b.hashCode() + (this.f120990a.hashCode() * 31)) * 31)) * 31);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ h0(long j2, LinearInterpolator linearInterpolator, int i) {
        TimeInterpolator decelerateInterpolator = (i & 4) != 0 ? new DecelerateInterpolator() : linearInterpolator;
        this(j2, j2, decelerateInterpolator, decelerateInterpolator);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public h0(long j2, long j3, TimeInterpolator showInterpolator, TimeInterpolator hideInterpolator) {
        this(new e0(j2, 0), new e0(j3, 0), showInterpolator, hideInterpolator);
        Intrinsics.checkNotNullParameter(showInterpolator, "showInterpolator");
        Intrinsics.checkNotNullParameter(hideInterpolator, "hideInterpolator");
    }
}
