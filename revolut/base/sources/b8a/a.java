package b8a;

import kotlin.jvm.internal.Intrinsics;
import y7a.w;

/* JADX INFO: loaded from: classes5.dex */
public final class a implements w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f13146a;

    public a(String country) {
        Intrinsics.checkNotNullParameter(country, "country");
        this.f13146a = country;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f13146a, ((a) obj2).f13146a);
    }

    public final int hashCode() {
        return this.f13146a.hashCode();
    }
}
