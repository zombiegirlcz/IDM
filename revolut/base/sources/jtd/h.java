package jtd;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class h implements u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wi0.b f178479a;

    public h(wi0.b countryCode) {
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        this.f178479a = countryCode;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && Intrinsics.f(this.f178479a, ((h) obj2).f178479a);
    }

    public final int hashCode() {
        return this.f178479a.f297794a.hashCode();
    }
}
