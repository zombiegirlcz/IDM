package m8d;

import com.revolut.core.ui_kit.models.TextClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class w implements x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextClause f203525a;

    public w(TextClause value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f203525a = value;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof w) && this.f203525a.equals(((w) obj2).f203525a);
    }

    public final int hashCode() {
        return this.f203525a.hashCode();
    }
}
