package mlj;

import cli.p;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class h implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f206984a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f206985b;

    public h(ArrayList items, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f206984a = items;
        this.f206985b = z;
    }

    @Override // cli.p
    public final List c() {
        return this.f206984a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return this.f206984a.equals(hVar.f206984a) && this.f206985b == hVar.f206985b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f206985b) + (this.f206984a.hashCode() * 31);
    }
}
