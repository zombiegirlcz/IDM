package gii;

import aii.r;
import java.time.YearMonth;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class a implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final YearMonth f144218a;

    public a(YearMonth selected) {
        Intrinsics.checkNotNullParameter(selected, "selected");
        this.f144218a = selected;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f144218a, ((a) obj2).f144218a);
    }

    public final int hashCode() {
        return this.f144218a.hashCode();
    }
}
