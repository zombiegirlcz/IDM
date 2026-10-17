package g57;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f140677a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f140678b;

    public m(TextLocalisedClause buttonLabel, boolean z) {
        Intrinsics.checkNotNullParameter(buttonLabel, "buttonLabel");
        this.f140677a = buttonLabel;
        this.f140678b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return this.f140677a.equals(mVar.f140677a) && this.f140678b == mVar.f140678b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f140678b) + (this.f140677a.hashCode() * 31);
    }
}
