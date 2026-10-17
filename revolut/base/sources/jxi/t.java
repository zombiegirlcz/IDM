package jxi;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class t extends com.revolut.retail.feature.airportlounges.impl.ui.screens.home.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f179227a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f179228b;

    public t(String loungeId, String str) {
        Intrinsics.checkNotNullParameter(loungeId, "loungeId");
        this.f179227a = loungeId;
        this.f179228b = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof t)) {
            return false;
        }
        t tVar = (t) obj2;
        return Intrinsics.f(this.f179227a, tVar.f179227a) && Intrinsics.f(this.f179228b, tVar.f179228b);
    }

    public final int hashCode() {
        int iHashCode = this.f179227a.hashCode() * 31;
        String str = this.f179228b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
