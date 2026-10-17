package god;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f145141a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f145142b;

    public h(String name, String code) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(code, "code");
        this.f145141a = name;
        this.f145142b = code;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f145141a, hVar.f145141a) && Intrinsics.f(this.f145142b, hVar.f145142b);
    }

    public final int hashCode() {
        return this.f145142b.hashCode() + (this.f145141a.hashCode() * 31);
    }
}
