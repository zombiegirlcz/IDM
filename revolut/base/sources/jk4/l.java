package jk4;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f175077a;

    public l(TextLocalisedClause toolbarTitle) {
        Intrinsics.checkNotNullParameter(toolbarTitle, "toolbarTitle");
        this.f175077a = toolbarTitle;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof l) && this.f175077a.equals(((l) obj2).f175077a);
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + (this.f175077a.hashCode() * 31);
    }
}
