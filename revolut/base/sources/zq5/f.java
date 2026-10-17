package zq5;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f324376a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f324377b;

    public f(ArrayList compatibleRecipients, ArrayList incompatibleRecipients) {
        Intrinsics.checkNotNullParameter(compatibleRecipients, "compatibleRecipients");
        Intrinsics.checkNotNullParameter(incompatibleRecipients, "incompatibleRecipients");
        this.f324376a = compatibleRecipients;
        this.f324377b = incompatibleRecipients;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return this.f324376a.equals(fVar.f324376a) && this.f324377b.equals(fVar.f324377b);
    }

    public final int hashCode() {
        return this.f324377b.hashCode() + (this.f324376a.hashCode() * 31);
    }
}
