package grc;

import aii.r;
import com.revolut.feature.salary_switch.impl.models.SalarySwitchPreview;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class b implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SalarySwitchPreview f145965a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f145966b;

    public b(SalarySwitchPreview salarySwitchPreview, String currencyCode) {
        Intrinsics.checkNotNullParameter(salarySwitchPreview, "salarySwitchPreview");
        Intrinsics.checkNotNullParameter(currencyCode, "currencyCode");
        this.f145965a = salarySwitchPreview;
        this.f145966b = currencyCode;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f145965a, bVar.f145965a) && Intrinsics.f(this.f145966b, bVar.f145966b);
    }

    public final int hashCode() {
        return this.f145966b.hashCode() + (this.f145965a.hashCode() * 31);
    }
}
