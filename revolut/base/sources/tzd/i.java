package tzd;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class i implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f275929a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f275930b;

    public i(ArrayList items, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f275929a = z;
        this.f275930b = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f275930b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return this.f275929a == iVar.f275929a && this.f275930b.equals(iVar.f275930b);
    }

    public final int hashCode() {
        return this.f275930b.hashCode() + (Boolean.hashCode(this.f275929a) * 31);
    }
}
