package zwb;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class d implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f325949a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f325950b;

    public d(String str, List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f325949a = str;
        this.f325950b = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f325950b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f325949a, dVar.f325949a) && Intrinsics.f(this.f325950b, dVar.f325950b);
    }

    public final int hashCode() {
        String str = this.f325949a;
        return this.f325950b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }
}
