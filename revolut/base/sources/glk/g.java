package glk;

import com.revolut.core.ui_kit.models.Clause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class g implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f144718a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f144719b;

    public g(Clause planName, List ineligibilityReasons) {
        Intrinsics.checkNotNullParameter(ineligibilityReasons, "ineligibilityReasons");
        Intrinsics.checkNotNullParameter(planName, "planName");
        this.f144718a = ineligibilityReasons;
        this.f144719b = planName;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f144718a, gVar.f144718a) && Intrinsics.f(this.f144719b, gVar.f144719b);
    }

    public final int hashCode() {
        return this.f144719b.hashCode() + (this.f144718a.hashCode() * 31);
    }
}
