package zc0;

import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class e3 implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f321043a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalDate f321044b;

    public e3(String itemId, LocalDate selectedDate) {
        Intrinsics.checkNotNullParameter(itemId, "itemId");
        Intrinsics.checkNotNullParameter(selectedDate, "selectedDate");
        this.f321043a = itemId;
        this.f321044b = selectedDate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e3)) {
            return false;
        }
        e3 e3Var = (e3) obj2;
        return Intrinsics.f(this.f321043a, e3Var.f321043a) && Intrinsics.f(this.f321044b, e3Var.f321044b);
    }

    @Override // zc0.d
    public final String getItemId() {
        return this.f321043a;
    }

    public final int hashCode() {
        return this.f321044b.hashCode() + (this.f321043a.hashCode() * 31);
    }
}
