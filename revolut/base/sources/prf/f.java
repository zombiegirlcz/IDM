package prf;

import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class f implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f239009a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f239010b;

    public f(String selectedOption, List values) {
        Intrinsics.checkNotNullParameter(selectedOption, "selectedOption");
        Intrinsics.checkNotNullParameter(values, "values");
        this.f239009a = selectedOption;
        this.f239010b = values;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f239009a, fVar.f239009a) && this.f239010b.equals(fVar.f239010b);
    }

    public final int hashCode() {
        return this.f239010b.hashCode() + (this.f239009a.hashCode() * 31);
    }
}
