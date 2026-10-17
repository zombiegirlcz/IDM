package xmc;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f307142a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f307143b;

    public m(TextLocalisedClause text, boolean z) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f307142a = z;
        this.f307143b = text;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return this.f307142a == mVar.f307142a && this.f307143b.equals(mVar.f307143b);
    }

    public final int hashCode() {
        return this.f307143b.hashCode() + (Boolean.hashCode(this.f307142a) * 31);
    }
}
