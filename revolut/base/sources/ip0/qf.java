package ip0;

import com.revolut.core.ui_kit.models.Clause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class qf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f165971a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f165972b;

    public qf(float f, Clause legend) {
        Intrinsics.checkNotNullParameter(legend, "legend");
        this.f165971a = f;
        this.f165972b = legend;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof qf)) {
            return false;
        }
        qf qfVar = (qf) obj2;
        return Float.compare(this.f165971a, qfVar.f165971a) == 0 && Intrinsics.f(this.f165972b, qfVar.f165972b);
    }

    public final int hashCode() {
        return this.f165972b.hashCode() + (Float.hashCode(this.f165971a) * 31);
    }
}
