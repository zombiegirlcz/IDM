package oyi;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class d extends com.revolut.retail.feature.airportlounges.impl.ui.screens.pass_refund.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f231044a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f231045b;

    public d(String str, String str2) {
        this.f231044a = str;
        this.f231045b = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f231044a, dVar.f231044a) && Intrinsics.f(this.f231045b, dVar.f231045b);
    }

    public final int hashCode() {
        String str = this.f231044a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f231045b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }
}
