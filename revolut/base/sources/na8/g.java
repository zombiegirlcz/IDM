package na8;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f213822a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f213823b;

    public g(TextLocalisedClause actionText, boolean z) {
        Intrinsics.checkNotNullParameter(actionText, "actionText");
        this.f213822a = actionText;
        this.f213823b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return this.f213822a.equals(gVar.f213822a) && this.f213823b == gVar.f213823b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f213823b) + (this.f213822a.hashCode() * 31);
    }
}
