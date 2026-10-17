package u31;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f276737a;

    public final boolean equals(Object obj2) {
        if (obj2 instanceof b) {
            return Intrinsics.f(this.f276737a, ((b) obj2).f276737a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f276737a.hashCode();
    }

    public final String toString() {
        return "RevolutDeviceFingerprint(properties=" + this.f276737a + ")";
    }
}
