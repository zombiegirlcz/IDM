package k2h;

import com.revolut.data.model.Data;
import com.revolut.feature.wealth.asset.selection.api.model.AssetSelectionCategory;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class f implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y1h.e f180580a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AssetSelectionCategory f180581b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f180582c;
    public final Data d;

    public f(y1h.e selectionType, AssetSelectionCategory assetSelectionCategory, Set selectedIds, Data data) {
        Intrinsics.checkNotNullParameter(selectionType, "selectionType");
        Intrinsics.checkNotNullParameter(assetSelectionCategory, "assetSelectionCategory");
        Intrinsics.checkNotNullParameter(selectedIds, "selectedIds");
        this.f180580a = selectionType;
        this.f180581b = assetSelectionCategory;
        this.f180582c = selectedIds;
        this.d = data;
    }

    public static f a(f fVar, Set selectedIds, Data data, int i) {
        y1h.e selectionType = fVar.f180580a;
        AssetSelectionCategory assetSelectionCategory = fVar.f180581b;
        if ((i & 4) != 0) {
            selectedIds = fVar.f180582c;
        }
        if ((i & 8) != 0) {
            data = fVar.d;
        }
        fVar.getClass();
        Intrinsics.checkNotNullParameter(selectionType, "selectionType");
        Intrinsics.checkNotNullParameter(assetSelectionCategory, "assetSelectionCategory");
        Intrinsics.checkNotNullParameter(selectedIds, "selectedIds");
        return new f(selectionType, assetSelectionCategory, selectedIds, data);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return this.f180580a == fVar.f180580a && Intrinsics.f(this.f180581b, fVar.f180581b) && Intrinsics.f(this.f180582c, fVar.f180582c) && Intrinsics.f(this.d, fVar.d);
    }

    public final int hashCode() {
        int iF = p.a.f((this.f180581b.hashCode() + (this.f180580a.hashCode() * 31)) * 31, 31, this.f180582c);
        Data data = this.d;
        return iF + (data == null ? 0 : data.hashCode());
    }
}
