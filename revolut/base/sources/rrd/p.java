package rrd;

import com.revolut.core.ui_kit.models.TimeClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class p extends o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TimeClause f256822a;

    public p(TimeClause date) {
        Intrinsics.checkNotNullParameter(date, "date");
        this.f256822a = date;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof p) && this.f256822a.equals(((p) obj2).f256822a);
    }

    public final int hashCode() {
        return this.f256822a.hashCode();
    }
}
