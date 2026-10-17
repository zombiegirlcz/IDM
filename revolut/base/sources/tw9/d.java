package tw9;

import cli.j;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class d implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f274954a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f274955b;

    public d(String username, boolean z) {
        Intrinsics.checkNotNullParameter(username, "username");
        this.f274954a = username;
        this.f274955b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f274954a, dVar.f274954a) && this.f274955b == dVar.f274955b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f274955b) + (this.f274954a.hashCode() * 31);
    }
}
