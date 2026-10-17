package ip0;

import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class vd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.revolut.core.ui_kit.delegates.g5 f166806a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalDate f166807b;

    public vd(com.revolut.core.ui_kit.delegates.g5 model, LocalDate selectedDate) {
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(selectedDate, "selectedDate");
        this.f166806a = model;
        this.f166807b = selectedDate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof vd)) {
            return false;
        }
        vd vdVar = (vd) obj2;
        return Intrinsics.f(this.f166806a, vdVar.f166806a) && Intrinsics.f(this.f166807b, vdVar.f166807b);
    }

    public final int hashCode() {
        return this.f166807b.hashCode() + (this.f166806a.hashCode() * 31);
    }
}
