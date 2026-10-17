package pqa;

import aii.r;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class j implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f238711a;

    public j(List updatedFields) {
        Intrinsics.checkNotNullParameter(updatedFields, "updatedFields");
        Intrinsics.checkNotNullParameter("AdditionalFieldsScreenContract_BUTTON_TAG", "ctaTag");
        this.f238711a = updatedFields;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j) && Intrinsics.f(this.f238711a, ((j) obj2).f238711a);
    }

    public final int hashCode() {
        return (this.f238711a.hashCode() * 31) + 2078175278;
    }
}
