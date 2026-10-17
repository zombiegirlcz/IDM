package um2;

import com.revolut.core.ui_kit.models.Clause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class k extends n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f281203a;

    public k(Clause description) {
        Intrinsics.checkNotNullParameter(description, "description");
        this.f281203a = description;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k) && this.f281203a.equals(((k) obj2).f281203a);
    }

    public final int hashCode() {
        return this.f281203a.hashCode();
    }
}
