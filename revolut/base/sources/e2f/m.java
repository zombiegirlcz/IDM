package e2f;

import com.revolut.core.ui_kit.models.Clause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f122073a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f122074b;

    public m(Clause buttonText, boolean z) {
        Intrinsics.checkNotNullParameter(buttonText, "buttonText");
        this.f122073a = z;
        this.f122074b = buttonText;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return this.f122073a == mVar.f122073a && this.f122074b.equals(mVar.f122074b);
    }

    public final int hashCode() {
        return this.f122074b.hashCode() + (Boolean.hashCode(this.f122073a) * 31);
    }
}
