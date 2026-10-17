package lv4;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class h implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f200300a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wi0.b f200301b;

    public h(List interests, wi0.b countryCode) {
        Intrinsics.checkNotNullParameter(interests, "interests");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        this.f200300a = interests;
        this.f200301b = countryCode;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f200300a, hVar.f200300a) && Intrinsics.f(this.f200301b, hVar.f200301b);
    }

    public final int hashCode() {
        return this.f200301b.f297794a.hashCode() + (this.f200300a.hashCode() * 31);
    }
}
