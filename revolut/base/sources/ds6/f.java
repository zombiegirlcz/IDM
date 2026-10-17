package ds6;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class f {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f117235a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f117236b;

    public f(g type, Set supportedPeriods) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(supportedPeriods, "supportedPeriods");
        this.f117235a = type;
        this.f117236b = supportedPeriods;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return this.f117235a == fVar.f117235a && Intrinsics.f(this.f117236b, fVar.f117236b);
    }

    public final int hashCode() {
        return this.f117236b.hashCode() + (this.f117235a.hashCode() * 31);
    }
}
