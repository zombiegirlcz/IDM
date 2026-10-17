package e23;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.feature.card_order_new.impl.kompot.interactor.CountryPickerScreenInteractor$Params;
import d27.g0;
import efm.r;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import org.jetbrains.annotations.NotNull;
import qv0.i;
import y7a.w;
import zhm.f0;

/* JADX INFO: loaded from: classes21.dex */
public final class d extends a8a.d {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rh1.b f122017a;

    public d(rh1.b addressFlowInteractor) {
        Intrinsics.checkNotNullParameter(addressFlowInteractor, "addressFlowInteractor");
        this.f122017a = addressFlowInteractor;
    }

    @Override // a8a.d
    public final boolean b(String query, i model) {
        Intrinsics.checkNotNullParameter(query, "query");
        Intrinsics.checkNotNullParameter(model, "model");
        RowDelegate.Model model2 = (RowDelegate.Model) model;
        Clause clause = model2.f53230c;
        Intrinsics.i(clause, "null cannot be cast to non-null type com.revolut.core.ui_kit.models.TextClause");
        return d0.J(((TextClause) clause).f57936a, query, true) || d0.J(model2.f53228a, query, true);
    }

    @Override // a8a.d
    public final w d(Set ids, Object obj2) {
        Intrinsics.checkNotNullParameter(ids, "ids");
        return new b8a.a((String) zhm.d0.a0(ids));
    }

    @Override // a8a.d
    public final r e(Object obj2, Set selectedModelIds, List list) {
        Intrinsics.checkNotNullParameter(selectedModelIds, "selectedModelIds");
        CountryPickerScreenInteractor$Params countryPickerScreenInteractor$Params = obj2 instanceof CountryPickerScreenInteractor$Params ? (CountryPickerScreenInteractor$Params) obj2 : null;
        List list2 = countryPickerScreenInteractor$Params != null ? countryPickerScreenInteractor$Params.f65089a : null;
        if (list2 == null) {
            list2 = f0.f322471a;
        }
        return rd0.e.c(nim.a.v(nim.a.v(((lj1.a) this.f122017a).a(), new g0(list2, 24, this, selectedModelIds)), new a83.d0(this, selectedModelIds, 15)), kotlin.coroutines.g.f186406a);
    }
}
