package o97;

import com.revolut.core.ui_kit.models.Clause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class f0 extends d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f223101a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f223102b;

    public f0(Clause sectionTitle, String listId) {
        Intrinsics.checkNotNullParameter(sectionTitle, "sectionTitle");
        Intrinsics.checkNotNullParameter(listId, "listId");
        this.f223101a = sectionTitle;
        this.f223102b = listId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj2;
        return Intrinsics.f(this.f223101a, f0Var.f223101a) && Intrinsics.f(this.f223102b, f0Var.f223102b);
    }

    public final int hashCode() {
        return this.f223102b.hashCode() + (this.f223101a.hashCode() * 31);
    }
}
