package rx6;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f258048a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f258049b;

    public n(ArrayList drafts, ArrayList invoices) {
        Intrinsics.checkNotNullParameter(drafts, "drafts");
        Intrinsics.checkNotNullParameter(invoices, "invoices");
        this.f258048a = drafts;
        this.f258049b = invoices;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return this.f258048a.equals(nVar.f258048a) && this.f258049b.equals(nVar.f258049b);
    }

    public final int hashCode() {
        return this.f258049b.hashCode() + (this.f258048a.hashCode() * 31);
    }
}
