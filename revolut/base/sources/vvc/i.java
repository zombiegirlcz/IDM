package vvc;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class i implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f292512a;

    public i(String countryCode) {
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        this.f292512a = countryCode;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && Intrinsics.f(this.f292512a, ((i) obj2).f292512a);
    }

    public final int hashCode() {
        return this.f292512a.hashCode();
    }
}
