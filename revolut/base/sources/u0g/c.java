package u0g;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f276187a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f276188b;

    public c(String light, String dark) {
        Intrinsics.checkNotNullParameter(light, "light");
        Intrinsics.checkNotNullParameter(dark, "dark");
        this.f276187a = light;
        this.f276188b = dark;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f276187a, cVar.f276187a) && Intrinsics.f(this.f276188b, cVar.f276188b);
    }

    public final int hashCode() {
        return this.f276188b.hashCode() + (this.f276187a.hashCode() * 31);
    }
}
