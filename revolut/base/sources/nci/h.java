package nci;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class h implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f214202a;

    public h(String htmlString) {
        Intrinsics.checkNotNullParameter(htmlString, "htmlString");
        this.f214202a = htmlString;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && Intrinsics.f(this.f214202a, ((h) obj2).f214202a);
    }

    public final int hashCode() {
        return this.f214202a.hashCode();
    }
}
