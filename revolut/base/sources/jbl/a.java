package jbl;

import kotlin.jvm.internal.Intrinsics;
import s7a.c0;

/* JADX INFO: loaded from: classes12.dex */
public final class a implements c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f172653a;

    public a(String selectedCity) {
        Intrinsics.checkNotNullParameter(selectedCity, "selectedCity");
        this.f172653a = selectedCity;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f172653a, ((a) obj2).f172653a);
    }

    public final int hashCode() {
        return this.f172653a.hashCode();
    }
}
