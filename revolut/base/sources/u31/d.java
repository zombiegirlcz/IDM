package u31;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class d {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f276738a;

    public final boolean equals(Object obj2) {
        if (obj2 instanceof d) {
            return Intrinsics.f(this.f276738a, ((d) obj2).f276738a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f276738a.hashCode();
    }

    public final String toString() {
        return p.a.p("SeonDeviceFingerprint(encodedProperties=", this.f276738a, ")");
    }
}
