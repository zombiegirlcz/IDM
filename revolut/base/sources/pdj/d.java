package pdj;

import aii.r;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class d implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kdj.b f235263a;

    public d(kdj.b faqItem) {
        Intrinsics.checkNotNullParameter(faqItem, "faqItem");
        this.f235263a = faqItem;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && this.f235263a == ((d) obj2).f235263a;
    }

    public final int hashCode() {
        return this.f235263a.hashCode();
    }
}
