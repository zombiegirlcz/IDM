package n47;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f212320a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f212321b;

    public m(TextLocalisedClause buttonLabel, boolean z) {
        Intrinsics.checkNotNullParameter(buttonLabel, "buttonLabel");
        this.f212320a = buttonLabel;
        this.f212321b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return this.f212320a.equals(mVar.f212320a) && this.f212321b == mVar.f212321b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f212321b) + (this.f212320a.hashCode() * 31);
    }
}
