package z1h;

import aii.e;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.wealth.asset.selection.api.model.AssetSelectionCategory;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class a implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f318796a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y1h.e f318797b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f318798c;
    public final Set d;
    public final Set e;
    public final AssetSelectionCategory f;

    public a(TextLocalisedClause textLocalisedClause, y1h.e selectionType, Set selectionCategories, Set preSelectedIds, Set excludedIds, AssetSelectionCategory assetSelectionCategory) {
        Intrinsics.checkNotNullParameter(selectionType, "selectionType");
        Intrinsics.checkNotNullParameter(selectionCategories, "selectionCategories");
        Intrinsics.checkNotNullParameter(preSelectedIds, "preSelectedIds");
        Intrinsics.checkNotNullParameter(excludedIds, "excludedIds");
        this.f318796a = textLocalisedClause;
        this.f318797b = selectionType;
        this.f318798c = selectionCategories;
        this.d = preSelectedIds;
        this.e = excludedIds;
        this.f = assetSelectionCategory;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f318796a, aVar.f318796a) && this.f318797b == aVar.f318797b && Intrinsics.f(this.f318798c, aVar.f318798c) && Intrinsics.f(this.d, aVar.d) && Intrinsics.f(this.e, aVar.e) && Intrinsics.f(this.f, aVar.f);
    }

    public final int hashCode() {
        Clause clause = this.f318796a;
        int iF = p.a.f(p.a.f(p.a.f((this.f318797b.hashCode() + ((clause == null ? 0 : clause.hashCode()) * 31)) * 31, 31, this.f318798c), 31, this.d), 31, this.e);
        AssetSelectionCategory assetSelectionCategory = this.f;
        return iF + (assetSelectionCategory != null ? assetSelectionCategory.hashCode() : 0);
    }
}
