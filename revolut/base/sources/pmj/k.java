package pmj;

import cli.p;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class k implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f237604a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f237605b;

    public k(ArrayList items, i navBarConfig) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(navBarConfig, "navBarConfig");
        this.f237604a = items;
        this.f237605b = navBarConfig;
    }

    @Override // cli.p
    public final List c() {
        return this.f237604a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return this.f237604a.equals(kVar.f237604a) && this.f237605b.equals(kVar.f237605b);
    }

    public final int hashCode() {
        return this.f237605b.hashCode() + (this.f237604a.hashCode() * 31);
    }
}
