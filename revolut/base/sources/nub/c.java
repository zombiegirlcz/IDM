package nub;

import com.revolut.core.ui_kit.models.NumberClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class c implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NumberClause.Format f219276a;

    public c(NumberClause.Format format) {
        Intrinsics.checkNotNullParameter(format, "format");
        this.f219276a = format;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f219276a, ((c) obj2).f219276a);
    }

    public final int hashCode() {
        return this.f219276a.hashCode();
    }
}
