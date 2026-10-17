package fmb;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class t implements v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f136302a;

    public t(TextLocalisedClause title) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f136302a = title;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof t) && this.f136302a.equals(((t) obj2).f136302a);
    }

    public final int hashCode() {
        return this.f136302a.hashCode();
    }
}
