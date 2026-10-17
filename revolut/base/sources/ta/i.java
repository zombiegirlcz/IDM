package ta;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f269073a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f269074b;

    public i(String title, ArrayList detailsBlocks) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(detailsBlocks, "detailsBlocks");
        this.f269073a = title;
        this.f269074b = detailsBlocks;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f269073a, iVar.f269073a) && this.f269074b.equals(iVar.f269074b);
    }

    public final int hashCode() {
        return this.f269074b.hashCode() + (this.f269073a.hashCode() * 31);
    }

    public final String toString() {
        return "Section(title=" + this.f269073a + ", detailsBlocks=" + this.f269074b + ")";
    }
}
