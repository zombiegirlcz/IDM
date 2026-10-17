package rr6;

import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087@\u0018\u0000 \b2\u00020\u0001:\u0001\u0003R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\u0088\u0001\u0007\u0092\u0001\u00020\u0002¨\u0006\t"}, d2 = {"Lrr6/o;", "", "Ljava/math/BigDecimal;", "a", "Ljava/math/BigDecimal;", "getValue", "()Ljava/math/BigDecimal;", "value", "Companion", "feature_freelancer_common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class o {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("rate")
    @NotNull
    private final BigDecimal value;

    /* JADX INFO: renamed from: rr6.o$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final /* synthetic */ BigDecimal getValue() {
        return this.value;
    }

    public final boolean equals(Object obj2) {
        return (obj2 instanceof o) && Intrinsics.f(this.value, ((o) obj2).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "FreelancerCashbackRate(value=" + this.value + ")";
    }
}
