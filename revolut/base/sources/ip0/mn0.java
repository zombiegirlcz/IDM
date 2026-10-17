package ip0;

import com.revolut.core.ui.models.Color;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class mn0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Color.Solid f165407a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Color.Solid f165408b;

    public mn0(int i, int i2) {
        Color.Solid inProgressColor = new Color.Solid(i);
        Color.Solid completeColor = new Color.Solid(i2);
        Intrinsics.checkNotNullParameter(inProgressColor, "inProgressColor");
        Intrinsics.checkNotNullParameter(completeColor, "completeColor");
        this.f165407a = inProgressColor;
        this.f165408b = completeColor;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof mn0)) {
            return false;
        }
        mn0 mn0Var = (mn0) obj2;
        return this.f165407a.equals(mn0Var.f165407a) && this.f165408b.equals(mn0Var.f165408b);
    }

    public final int hashCode() {
        return Integer.hashCode(this.f165408b.f51464b) + (Integer.hashCode(this.f165407a.f51464b) * 31);
    }
}
