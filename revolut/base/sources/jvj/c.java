package jvj;

import cli.j;
import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;
import wp5.y;

/* JADX INFO: loaded from: classes11.dex */
public final class c implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vim.e f178888a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalDate f178889b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f178890c;

    public c(vim.e selectedDatesRange, LocalDate presentedMonth, boolean z) {
        Intrinsics.checkNotNullParameter(selectedDatesRange, "selectedDatesRange");
        Intrinsics.checkNotNullParameter(presentedMonth, "presentedMonth");
        this.f178888a = selectedDatesRange;
        this.f178889b = presentedMonth;
        this.f178890c = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return this.f178888a.equals(cVar.f178888a) && Intrinsics.f(this.f178889b, cVar.f178889b) && this.f178890c == cVar.f178890c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f178890c) + y.a(this.f178888a.hashCode() * 31, 31, this.f178889b);
    }
}
