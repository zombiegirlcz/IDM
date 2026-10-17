package z0k;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class l implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f318634a;

    public l(ArrayList items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f318634a = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f318634a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof l) && this.f318634a.equals(((l) obj2).f318634a);
    }

    public final int hashCode() {
        return this.f318634a.hashCode();
    }
}
