package y19;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f310346a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f310347b;

    public h(f savings, ArrayList highlights) {
        Intrinsics.checkNotNullParameter(savings, "savings");
        Intrinsics.checkNotNullParameter(highlights, "highlights");
        this.f310346a = savings;
        this.f310347b = highlights;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return this.f310346a.equals(hVar.f310346a) && this.f310347b.equals(hVar.f310347b);
    }

    public final int hashCode() {
        return this.f310347b.hashCode() + (this.f310346a.hashCode() * 31);
    }
}
