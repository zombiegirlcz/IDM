package zc0;

import com.revolut.feature.backend_flow.domain.models.Filter;
import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class d3 implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f321035a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalDate f321036b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Filter f321037c;

    public d3(String itemId, LocalDate localDate, Filter filter) {
        Intrinsics.checkNotNullParameter(itemId, "itemId");
        this.f321035a = itemId;
        this.f321036b = localDate;
        this.f321037c = filter;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d3)) {
            return false;
        }
        d3 d3Var = (d3) obj2;
        return Intrinsics.f(this.f321035a, d3Var.f321035a) && Intrinsics.f(this.f321036b, d3Var.f321036b) && Intrinsics.f(this.f321037c, d3Var.f321037c);
    }

    @Override // zc0.d
    public final String getItemId() {
        return this.f321035a;
    }

    public final int hashCode() {
        int iHashCode = this.f321035a.hashCode() * 31;
        LocalDate localDate = this.f321036b;
        int iHashCode2 = (iHashCode + (localDate == null ? 0 : localDate.hashCode())) * 31;
        Filter filter = this.f321037c;
        return iHashCode2 + (filter != null ? filter.hashCode() : 0);
    }
}
