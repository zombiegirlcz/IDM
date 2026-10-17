package d71;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class l implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f111771a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f111772b;

    public l(String number, String link) {
        Intrinsics.checkNotNullParameter(number, "number");
        Intrinsics.checkNotNullParameter(link, "link");
        this.f111771a = number;
        this.f111772b = link;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f111771a, lVar.f111771a) && Intrinsics.f(this.f111772b, lVar.f111772b);
    }

    public final int hashCode() {
        return this.f111772b.hashCode() + (this.f111771a.hashCode() * 31);
    }
}
