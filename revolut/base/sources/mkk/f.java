package mkk;

import com.revolut.core.ui_kit.models.Clause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f206482a;

    public f(Clause subtitle) {
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        this.f206482a = subtitle;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f206482a, ((f) obj2).f206482a);
    }

    public final int hashCode() {
        return this.f206482a.hashCode();
    }
}
