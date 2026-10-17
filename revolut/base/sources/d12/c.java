package d12;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f110481a;

    public c(TextLocalisedClause contentDescriptor) {
        Intrinsics.checkNotNullParameter(contentDescriptor, "contentDescriptor");
        this.f110481a = contentDescriptor;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && this.f110481a.equals(((c) obj2).f110481a);
    }

    public final int hashCode() {
        return this.f110481a.hashCode();
    }
}
