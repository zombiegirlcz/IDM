package pbi;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.badge.CircleBadgeModel;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.data.model.Data;
import com.revolut.feature.address.models.AddressFieldSuggestion;
import com.revolut.feature.user_declarations.shared.R$string;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import s7a.c0;
import vkm.v1;
import zhm.d0;
import zhm.f0;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes10.dex */
public final class b extends x7a.d {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zi1.a f234684a;

    public b(zi1.a addressFieldSuggestionInteractor) {
        Intrinsics.checkNotNullParameter(addressFieldSuggestionInteractor, "addressFieldSuggestionInteractor");
        this.f234684a = addressFieldSuggestionInteractor;
    }

    @Override // x7a.d
    public final c0 c(Set ids, Object obj2) {
        Intrinsics.checkNotNullParameter(ids, "ids");
        return new jbl.a((String) d0.J0(ids));
    }

    @Override // x7a.d
    public final List d(Data data, Set selectedModelIds, List list, String query, Object obj2) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(selectedModelIds, "selectedModelIds");
        Intrinsics.checkNotNullParameter(query, "query");
        if (kotlin.text.d0.W(query)) {
            List listC = u.c(new RowDelegate.Model("LIST_ID_INITIAL_STATE", new RowDelegate.Model.MainImage.Image56((Image) com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D086", null, null, null, 30), (CircleBadgeModel) null, false, 14), new TextLocalisedClause(R$string.user_migration_place_of_birth_city_picker_start_typing, null, null, 14), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868856));
            yp0.b.k(listC, 0, 0, 0, 0, 31);
            return listC;
        }
        Object content = data.getContent();
        List list2 = content instanceof List ? (List) content : null;
        if (list2 != null) {
            List list3 = list2.isEmpty() ? null : list2;
            if (list3 != null) {
                List<AddressFieldSuggestion> list4 = list3;
                ArrayList arrayList = new ArrayList(w.t(list4, 10));
                for (AddressFieldSuggestion addressFieldSuggestion : list4) {
                    arrayList.add(new RowDelegate.Model(addressFieldSuggestion.getValue(), null, new TextClause(addressFieldSuggestion.getDisplayName(), (Style) null, Integer.valueOf(R$attr.uikit_colorForeground), false, (o9) null, (List) null, 122), null, 0, null, null, null, 0, null, false, null, selectedModelIds.contains(addressFieldSuggestion.getValue()), null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536862714));
                }
                yp0.b.k(arrayList, 0, 0, 0, 0, 31);
                return arrayList;
            }
        }
        return f0.f322471a;
    }

    @Override // x7a.d
    public final Flow e(String query, boolean z, Object obj2) {
        Intrinsics.checkNotNullParameter(query, "query");
        wi0.b bVar = obj2 instanceof wi0.b ? (wi0.b) obj2 : null;
        return (bVar == null || kotlin.text.d0.W(query)) ? new go.g(new Data(f0.f322471a, null, false, 6, null), 2) : new v1(new of6.d(this, bVar, query, (Continuation) null));
    }
}
