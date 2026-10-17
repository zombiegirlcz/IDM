package hx4;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class b extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f156385a;

    public b(TextLocalisedClause title) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f156385a = title;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && this.f156385a.equals(((b) obj2).f156385a);
    }

    public final int hashCode() {
        return this.f156385a.hashCode();
    }
}
