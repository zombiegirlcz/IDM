package v28;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f285677a;

    public a(TextLocalisedClause widgetTitle) {
        Intrinsics.checkNotNullParameter(widgetTitle, "widgetTitle");
        this.f285677a = widgetTitle;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && this.f285677a.equals(((a) obj2).f285677a);
    }

    public final int hashCode() {
        return this.f285677a.hashCode();
    }
}
