package ip0;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class k4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f164954a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f164955b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f164956c;

    public k4(int i, TextLocalisedClause text, TextLocalisedClause actionText) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(actionText, "actionText");
        this.f164954a = text;
        this.f164955b = actionText;
        this.f164956c = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k4)) {
            return false;
        }
        k4 k4Var = (k4) obj2;
        return this.f164954a.equals(k4Var.f164954a) && this.f164955b.equals(k4Var.f164955b) && this.f164956c == k4Var.f164956c;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + j6.a.c(j6.a.b(this.f164956c, t61.a.a(this.f164954a.hashCode() * 31, 31, this.f164955b), 31), 31, true);
    }
}
