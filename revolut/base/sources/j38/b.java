package j38;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f170989a;

    public b(String rawName) {
        Intrinsics.checkNotNullParameter(rawName, "rawName");
        this.f170989a = rawName;
    }

    public final String a() {
        return this.f170989a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f170989a, ((b) obj2).f170989a);
    }

    public final int hashCode() {
        return this.f170989a.hashCode();
    }
}
