package tfi;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f270319a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f270320b;

    public b(ArrayList promotions, boolean z) {
        Intrinsics.checkNotNullParameter(promotions, "promotions");
        this.f270319a = promotions;
        this.f270320b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return this.f270319a.equals(bVar.f270319a) && this.f270320b == bVar.f270320b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f270320b) + (this.f270319a.hashCode() * 31);
    }
}
