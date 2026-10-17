package lcd;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class h implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f193846a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f193847b;

    public h(String title, g maturity) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(maturity, "maturity");
        this.f193846a = title;
        this.f193847b = maturity;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f193846a, hVar.f193846a) && Intrinsics.f(this.f193847b, hVar.f193847b);
    }

    public final int hashCode() {
        return this.f193847b.hashCode() + (this.f193846a.hashCode() * 31);
    }
}
