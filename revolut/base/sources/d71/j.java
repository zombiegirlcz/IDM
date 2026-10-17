package d71;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class j implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f111768a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f111769b;

    public j(String title, String link) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(link, "link");
        this.f111768a = title;
        this.f111769b = link;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f111768a, jVar.f111768a) && Intrinsics.f(this.f111769b, jVar.f111769b);
    }

    public final int hashCode() {
        return this.f111769b.hashCode() + (this.f111768a.hashCode() * 31);
    }
}
