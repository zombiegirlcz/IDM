package uwf;

import cli.p;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class k implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f283662a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f283663b;

    public k(ArrayList items, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f283662a = items;
        this.f283663b = z;
    }

    @Override // cli.p
    public final List c() {
        return this.f283662a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return this.f283662a.equals(kVar.f283662a) && this.f283663b == kVar.f283663b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f283663b) + (this.f283662a.hashCode() * 31);
    }
}
