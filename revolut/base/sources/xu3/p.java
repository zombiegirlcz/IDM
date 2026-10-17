package xu3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class p implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f308938a;

    public p(String popupTitle) {
        Intrinsics.checkNotNullParameter(popupTitle, "popupTitle");
        this.f308938a = popupTitle;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof p) && Intrinsics.f(this.f308938a, ((p) obj2).f308938a);
    }

    public final int hashCode() {
        return this.f308938a.hashCode();
    }
}
