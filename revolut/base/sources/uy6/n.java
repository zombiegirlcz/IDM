package uy6;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f284089a;

    public n(TextLocalisedClause title) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f284089a = title;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof n) && this.f284089a.equals(((n) obj2).f284089a);
    }

    public final int hashCode() {
        return this.f284089a.hashCode();
    }
}
