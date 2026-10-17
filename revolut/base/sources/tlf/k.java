package tlf;

import com.revolut.core.ui_kit.models.Clause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f272078a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f272079b;

    public k(Clause topSubtitle, boolean z) {
        Intrinsics.checkNotNullParameter(topSubtitle, "topSubtitle");
        this.f272078a = topSubtitle;
        this.f272079b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return this.f272078a.equals(kVar.f272078a) && this.f272079b == kVar.f272079b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f272079b) + (this.f272078a.hashCode() * 31);
    }
}
