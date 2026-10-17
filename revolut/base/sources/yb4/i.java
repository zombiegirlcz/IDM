package yb4;

import cli.p;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class i implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f312187a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f312188b;

    public i(ArrayList items, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f312187a = items;
        this.f312188b = z;
    }

    @Override // cli.p
    public final List c() {
        return this.f312187a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return this.f312187a.equals(iVar.f312187a) && this.f312188b == iVar.f312188b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f312188b) + (this.f312187a.hashCode() * 31);
    }
}
