package vkh;

import com.revolut.core.ui_kit.models.Clause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class k extends com.revolut.feature.wealth.ui.impl.documents.details.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f289949a;

    public k(Clause title) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f289949a = title;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k) && this.f289949a.equals(((k) obj2).f289949a);
    }

    public final int hashCode() {
        return this.f289949a.hashCode();
    }
}
