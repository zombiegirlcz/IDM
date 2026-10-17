package sod;

import cli.j;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class a implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wi0.b f264818a;

    public a(wi0.b countryCode) {
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        this.f264818a = countryCode;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f264818a, ((a) obj2).f264818a);
    }

    public final int hashCode() {
        return this.f264818a.f297794a.hashCode();
    }
}
