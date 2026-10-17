package b93;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class j implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f13639a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f13640b;

    public j(b cardCode, String brand) {
        Intrinsics.checkNotNullParameter(cardCode, "cardCode");
        Intrinsics.checkNotNullParameter(brand, "brand");
        this.f13639a = cardCode;
        this.f13640b = brand;
    }

    public final String a() {
        return this.f13640b;
    }

    public final b b() {
        return this.f13639a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f13639a, jVar.f13639a) && Intrinsics.f(this.f13640b, jVar.f13640b);
    }

    public final int hashCode() {
        return this.f13640b.hashCode() + (this.f13639a.hashCode() * 31);
    }
}
