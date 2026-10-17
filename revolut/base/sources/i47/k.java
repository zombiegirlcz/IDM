package i47;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f158293a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f158294b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f158295c;

    public k(TextLocalisedClause buttonLabel, boolean z, boolean z3) {
        Intrinsics.checkNotNullParameter(buttonLabel, "buttonLabel");
        this.f158293a = buttonLabel;
        this.f158294b = z;
        this.f158295c = z3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return this.f158293a.equals(kVar.f158293a) && this.f158294b == kVar.f158294b && this.f158295c == kVar.f158295c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f158295c) + j6.a.c(this.f158293a.hashCode() * 31, 31, this.f158294b);
    }
}
