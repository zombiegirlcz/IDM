package hpg;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class h implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f154531a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f154532b;

    public h(List recurringPayments, String currencyCode) {
        Intrinsics.checkNotNullParameter(recurringPayments, "recurringPayments");
        Intrinsics.checkNotNullParameter(currencyCode, "currencyCode");
        this.f154531a = recurringPayments;
        this.f154532b = currencyCode;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f154531a, hVar.f154531a) && Intrinsics.f(this.f154532b, hVar.f154532b);
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + p.a.c(this.f154531a.hashCode() * 31, 31, this.f154532b);
    }
}
