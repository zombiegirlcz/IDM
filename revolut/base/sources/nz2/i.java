package nz2;

import aii.r;
import com.revolut.feature.card_management.impl.cardlimit.domain.CardLimitSetData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class i implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CardLimitSetData f220941a;

    public i(CardLimitSetData data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.f220941a = data;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && Intrinsics.f(this.f220941a, ((i) obj2).f220941a);
    }

    public final int hashCode() {
        return this.f220941a.hashCode();
    }
}
