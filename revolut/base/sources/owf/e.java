package owf;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class e implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f230441a;

    public e(String htmlString) {
        Intrinsics.checkNotNullParameter(htmlString, "htmlString");
        this.f230441a = htmlString;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f230441a, ((e) obj2).f230441a);
    }

    public final int hashCode() {
        return this.f230441a.hashCode();
    }
}
