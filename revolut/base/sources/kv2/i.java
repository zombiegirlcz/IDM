package kv2;

import cli.p;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class i implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f189942a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f189943b;

    public i(ArrayList items, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f189942a = items;
        this.f189943b = z;
    }

    @Override // cli.p
    public final List c() {
        return this.f189942a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return this.f189942a.equals(iVar.f189942a) && this.f189943b == iVar.f189943b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f189943b) + (this.f189942a.hashCode() * 31);
    }
}
