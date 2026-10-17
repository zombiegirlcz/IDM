package ms0;

import com.revolut.core.ui_kit.models.TextClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class l5 implements m5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextClause f208333a;

    public l5(TextClause text) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f208333a = text;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof l5) && this.f208333a.equals(((l5) obj2).f208333a);
    }

    public final int hashCode() {
        return this.f208333a.hashCode();
    }
}
