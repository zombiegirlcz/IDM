package zmd;

import com.revolut.core.ui_kit.models.Clause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class f implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f323463a;

    public f(Clause subtitle) {
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        this.f323463a = subtitle;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && this.f323463a.equals(((f) obj2).f323463a);
    }

    public final int hashCode() {
        return this.f323463a.hashCode();
    }
}
