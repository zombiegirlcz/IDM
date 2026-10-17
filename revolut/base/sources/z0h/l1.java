package z0h;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class l1 implements o1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f318529a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f318530b;

    public l1(TextLocalisedClause textLocalisedClause, String url2) {
        Intrinsics.checkNotNullParameter(url2, "url");
        this.f318529a = url2;
        this.f318530b = textLocalisedClause;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l1)) {
            return false;
        }
        l1 l1Var = (l1) obj2;
        return Intrinsics.f(this.f318529a, l1Var.f318529a) && this.f318530b.equals(l1Var.f318530b);
    }

    public final int hashCode() {
        return this.f318530b.hashCode() + (this.f318529a.hashCode() * 31);
    }
}
