package s56;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f259991a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f259992b;

    public u(TextLocalisedClause text, boolean z) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f259991a = text;
        this.f259992b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof u)) {
            return false;
        }
        u uVar = (u) obj2;
        return this.f259991a.equals(uVar.f259991a) && this.f259992b == uVar.f259992b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f259992b) + (this.f259991a.hashCode() * 31);
    }
}
