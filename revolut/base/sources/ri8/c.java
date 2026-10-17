package ri8;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f254568a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f254569b;

    public c(String firstName, String customizedLink) {
        Intrinsics.checkNotNullParameter(firstName, "firstName");
        Intrinsics.checkNotNullParameter(customizedLink, "customizedLink");
        this.f254568a = firstName;
        this.f254569b = customizedLink;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f254568a, cVar.f254568a) && Intrinsics.f(this.f254569b, cVar.f254569b);
    }

    public final int hashCode() {
        return this.f254569b.hashCode() + (this.f254568a.hashCode() * 31);
    }
}
