package ia7;

import android.graphics.Path;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wi0.b f159953a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Path f159954b;

    public b(wi0.b countryCode, Path path) {
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        Intrinsics.checkNotNullParameter(path, "path");
        this.f159953a = countryCode;
        this.f159954b = path;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f159953a, bVar.f159953a) && Intrinsics.f(this.f159954b, bVar.f159954b);
    }

    public final int hashCode() {
        return this.f159954b.hashCode() + (this.f159953a.f297794a.hashCode() * 31);
    }
}
