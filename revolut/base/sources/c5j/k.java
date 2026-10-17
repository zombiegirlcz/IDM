package c5j;

import aii.r;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class k implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f21571a;

    public k(List updatedFields) {
        Intrinsics.checkNotNullParameter(updatedFields, "updatedFields");
        Intrinsics.checkNotNullParameter("MissingFieldsScreenContract_BUTTON_TAG", "ctaTag");
        this.f21571a = updatedFields;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k) && Intrinsics.f(this.f21571a, ((k) obj2).f21571a);
    }

    public final int hashCode() {
        return (this.f21571a.hashCode() * 31) + 1830898511;
    }
}
