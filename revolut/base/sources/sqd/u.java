package sqd;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class u implements v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f265077a;

    public u(TextLocalisedClause text) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f265077a = text;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof u) && this.f265077a.equals(((u) obj2).f265077a);
    }

    public final int hashCode() {
        return this.f265077a.hashCode();
    }
}
