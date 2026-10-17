package p6g;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class a extends z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wi0.b f233265a;

    public a(wi0.b countryCode) {
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        this.f233265a = countryCode;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f233265a, ((a) obj2).f233265a);
    }

    public final int hashCode() {
        return this.f233265a.f297794a.hashCode();
    }
}
