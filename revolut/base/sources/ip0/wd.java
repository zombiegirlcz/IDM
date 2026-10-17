package ip0;

import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class wd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.revolut.core.ui_kit.delegates.g5 f166987a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalDate f166988b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LocalDate f166989c;

    public wd(com.revolut.core.ui_kit.delegates.g5 originalModel, LocalDate presentedMonth, LocalDate localDate) {
        Intrinsics.checkNotNullParameter(originalModel, "originalModel");
        Intrinsics.checkNotNullParameter(presentedMonth, "presentedMonth");
        this.f166987a = originalModel;
        this.f166988b = presentedMonth;
        this.f166989c = localDate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof wd)) {
            return false;
        }
        wd wdVar = (wd) obj2;
        return Intrinsics.f(this.f166987a, wdVar.f166987a) && Intrinsics.f(this.f166988b, wdVar.f166988b) && Intrinsics.f(this.f166989c, wdVar.f166989c);
    }

    public final int hashCode() {
        int iA = wp5.y.a(this.f166987a.hashCode() * 31, 31, this.f166988b);
        LocalDate localDate = this.f166989c;
        return iA + (localDate == null ? 0 : localDate.hashCode());
    }
}
