package zv5;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f325574a;

    public a(String currencyCode) {
        Intrinsics.checkNotNullParameter(currencyCode, "currencyCode");
        this.f325574a = currencyCode;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f325574a, ((a) obj2).f325574a);
    }

    public final int hashCode() {
        return this.f325574a.hashCode();
    }
}
