package eq5;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f128351a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f128352b;

    public y(TextLocalisedClause text, boolean z) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f128351a = text;
        this.f128352b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof y)) {
            return false;
        }
        y yVar = (y) obj2;
        return this.f128351a.equals(yVar.f128351a) && this.f128352b == yVar.f128352b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f128352b) + (this.f128351a.hashCode() * 31);
    }
}
