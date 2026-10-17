package u90;

import com.revolut.feature.backend_flow.domain.models.AssetOption;
import com.revolut.feature.backend_flow.domain.models.BackendIconType;
import com.revolut.feature.backend_flow.domain.models.BackendItem;
import com.revolut.feature.backend_flow.domain.models.ProductSelectionItem;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import q90.b3;

/* JADX INFO: loaded from: classes19.dex */
public final class l0 extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t90.h f278324a;

    public l0(t90.h iconTypeMapper) {
        Intrinsics.checkNotNullParameter(iconTypeMapper, "iconTypeMapper");
        this.f278324a = iconTypeMapper;
    }

    @Override // u90.c
    public final BackendItem a(q90.v vVar, List previousElements) {
        AssetOption medium;
        b3 item = (b3) vVar;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(previousElements, "previousElements");
        String id10 = item.getId();
        String title = item.getTitle();
        String subtitle = item.getSubtitle();
        q90.f asset = item.getAsset();
        Intrinsics.checkNotNullParameter(asset, "<this>");
        String size = asset.getSize();
        if (Intrinsics.f(size, "SMALL")) {
            medium = new AssetOption.Small(asset.getUrl());
        } else {
            if (!Intrinsics.f(size, "MEDIUM")) {
                throw new IllegalArgumentException("Unknown value " + asset.getSize() + " for sealed class mapping " + kotlin.jvm.internal.o0.f186429a.b(AssetOption.class).i());
            }
            medium = new AssetOption.Medium(asset.getUrl());
        }
        AssetOption assetOption = medium;
        Integer group = item.getGroup();
        boolean zK = pd.b.k(item.getRequired());
        q90.b0 value = item.getValue();
        List list = null;
        boolean zJ = pd.b.j(value != null ? Boolean.valueOf(value.getValue()) : null);
        Boolean enabled = item.getEnabled();
        boolean zBooleanValue = enabled != null ? enabled.booleanValue() : true;
        List badges = item.getBadges();
        if (badges != null) {
            List<q90.z> list2 = badges;
            ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
            for (q90.z zVar : list2) {
                String label = zVar.getLabel();
                String iconType = zVar.getIconType();
                arrayList.add(new ProductSelectionItem.Badge(label, iconType != null ? this.f278324a.a(iconType) : null));
            }
            list = arrayList;
        }
        if (list == null) {
            list = zhm.f0.f322471a;
        }
        return new ProductSelectionItem(id10, title, subtitle, assetOption, group, zK, zJ, list, zBooleanValue);
    }

    @Override // u90.c
    public final q90.v b(BackendItem backendItem) {
        q90.f fVar;
        ProductSelectionItem item = (ProductSelectionItem) backendItem;
        Intrinsics.checkNotNullParameter(item, "item");
        String str = item.f63578a;
        String str2 = item.f63579b;
        String str3 = item.f63580c;
        AssetOption assetOption = item.d;
        Intrinsics.checkNotNullParameter(assetOption, "<this>");
        if (assetOption instanceof AssetOption.Medium) {
            fVar = new q90.f("MEDIUM", ((AssetOption.Medium) assetOption).f63252a);
        } else {
            if (!(assetOption instanceof AssetOption.Small)) {
                throw new NoWhenBranchMatchedException();
            }
            fVar = new q90.f("SMALL", ((AssetOption.Small) assetOption).f63253a);
        }
        q90.f fVar2 = fVar;
        Integer num = item.e;
        Boolean boolValueOf = Boolean.valueOf(item.f);
        q90.b0 b0Var = new q90.b0(item.f63581g);
        Boolean boolValueOf2 = Boolean.valueOf(item.i);
        List<ProductSelectionItem.Badge> list = item.f63582h;
        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
        for (ProductSelectionItem.Badge badge : list) {
            String str4 = badge.f63583a;
            BackendIconType backendIconType = badge.f63584b;
            arrayList.add(new q90.z(str4, backendIconType != null ? this.f278324a.b(backendIconType) : null));
        }
        return new b3(str, str2, str3, fVar2, num, boolValueOf, b0Var, boolValueOf2, arrayList);
    }
}
