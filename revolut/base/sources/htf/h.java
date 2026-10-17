package htf;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f155368a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f155369b;

    public h(TextLocalisedClause subheaderClause, ArrayList categories) {
        Intrinsics.checkNotNullParameter(subheaderClause, "subheaderClause");
        Intrinsics.checkNotNullParameter(categories, "categories");
        this.f155368a = subheaderClause;
        this.f155369b = categories;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return this.f155368a.equals(hVar.f155368a) && this.f155369b.equals(hVar.f155369b);
    }

    public final int hashCode() {
        return this.f155369b.hashCode() + (this.f155368a.hashCode() * 31);
    }
}
