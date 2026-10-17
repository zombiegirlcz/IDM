package vpd;

import com.revolut.core.ui_kit.models.Clause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class n implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f291176a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f291177b;

    public n(Clause text, boolean z) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f291176a = z;
        this.f291177b = text;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return this.f291176a == nVar.f291176a && Intrinsics.f(this.f291177b, nVar.f291177b);
    }

    public final int hashCode() {
        return this.f291177b.hashCode() + (Boolean.hashCode(this.f291176a) * 31);
    }
}
