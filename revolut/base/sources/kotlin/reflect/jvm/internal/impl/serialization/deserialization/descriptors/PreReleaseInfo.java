package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import ch.qos.logback.core.CoreConstants;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import m72.b;
import org.jetbrains.annotations.NotNull;
import zhm.f0;

/* JADX INFO: loaded from: classes14.dex */
public final class PreReleaseInfo {

    @NotNull
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f187741a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f187742b;

    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    static {
        new PreReleaseInfo(false, null, 2, null);
    }

    public PreReleaseInfo(boolean z, @NotNull List<String> poisoningFeatures) {
        Intrinsics.checkNotNullParameter(poisoningFeatures, "poisoningFeatures");
        this.f187741a = z;
        this.f187742b = poisoningFeatures;
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PreReleaseInfo)) {
            return false;
        }
        PreReleaseInfo preReleaseInfo = (PreReleaseInfo) obj2;
        return this.f187741a == preReleaseInfo.f187741a && Intrinsics.f(this.f187742b, preReleaseInfo.f187742b);
    }

    public int hashCode() {
        return this.f187742b.hashCode() + (Boolean.hashCode(this.f187741a) * 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb6 = new StringBuilder("PreReleaseInfo(isInvisible=");
        sb6.append(this.f187741a);
        sb6.append(", poisoningFeatures=");
        return b.p(CoreConstants.RIGHT_PARENTHESIS_CHAR, this.f187742b, sb6);
    }

    public PreReleaseInfo(boolean z, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, (i & 2) != 0 ? f0.f322471a : list);
    }
}
