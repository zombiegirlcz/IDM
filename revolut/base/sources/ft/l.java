package ft;

import cli.p;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class l implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f137750a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f137751b;

    public l(ArrayList items, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f137750a = items;
        this.f137751b = z;
    }

    @Override // cli.p
    public final List c() {
        return this.f137750a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return this.f137750a.equals(lVar.f137750a) && this.f137751b == lVar.f137751b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f137751b) + (this.f137750a.hashCode() * 31);
    }
}
