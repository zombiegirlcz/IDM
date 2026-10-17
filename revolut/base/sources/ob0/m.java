package ob0;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CountryClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.CountryImage;
import com.revolut.feature.backend_flow.domain.models.CountrySelectionOption;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import s7a.c0;
import vkm.v1;
import zhm.d0;

/* JADX INFO: loaded from: classes19.dex */
public final class m extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f01.a f223832a;

    public m(f01.a uiKitResources) {
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        this.f223832a = uiKitResources;
    }

    public static Clause q(CountrySelectionOption countrySelectionOption) {
        Intrinsics.checkNotNullParameter(countrySelectionOption, "<this>");
        String str = countrySelectionOption.f63373b;
        return str != null ? new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : new CountryClause(countrySelectionOption.f63372a, null);
    }

    @Override // x7a.d
    public final c0 c(Set ids, Object obj2) {
        Intrinsics.checkNotNullParameter(ids, "ids");
        Intrinsics.i(obj2, "null cannot be cast to non-null type com.revolut.core.backend_flow.impl.ui.form_screen.interactors.CountryPickerParams");
        String str = ((c) obj2).f223815a.f63368a;
        wi0.a aVar = wi0.b.Companion;
        String str2 = (String) d0.a0(ids);
        aVar.getClass();
        return new d(str, wi0.a.a(str2));
    }

    @Override // x7a.d
    public final Flow e(String query, boolean z, Object obj2) {
        Intrinsics.checkNotNullParameter(query, "query");
        return new v1(new k(obj2, null, 0));
    }

    @Override // ob0.b
    public final ArrayList i(String query, List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(query, "query");
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            CountrySelectionOption countrySelectionOption = (CountrySelectionOption) obj2;
            String strP = countrySelectionOption.f63373b;
            if (strP == null) {
                strP = p(countrySelectionOption);
            }
            if (kotlin.text.d0.J(strP, query, true) || kotlin.text.d0.J(countrySelectionOption.f63372a.f297794a, query, true)) {
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }

    @Override // ob0.b
    public final Image j(Object obj2) {
        CountrySelectionOption countrySelectionOption = (CountrySelectionOption) obj2;
        Intrinsics.checkNotNullParameter(countrySelectionOption, "<this>");
        return new CountryImage(countrySelectionOption.f63372a.f297794a, (Integer) null, (ez0.e) null, 14);
    }

    @Override // ob0.b
    public final String k(Object obj2) {
        CountrySelectionOption countrySelectionOption = (CountrySelectionOption) obj2;
        Intrinsics.checkNotNullParameter(countrySelectionOption, "<this>");
        return countrySelectionOption.f63372a.f297794a;
    }

    @Override // ob0.b
    public final List l(String query, List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(query, "query");
        return d0.P0(list, new l(cim.b.a(new j(query, this), new j(this, query)), 0));
    }

    @Override // ob0.b
    public final Clause m(Object obj2) {
        Intrinsics.checkNotNullParameter((CountrySelectionOption) obj2, "<this>");
        return null;
    }

    @Override // ob0.b
    public final /* bridge */ /* synthetic */ Clause n(Object obj2) {
        return q((CountrySelectionOption) obj2);
    }

    @Override // ob0.b
    public final RowDelegate.Model o(Object obj2, String str) {
        CountrySelectionOption item = (CountrySelectionOption) obj2;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(item, "<this>");
        String str2 = item.f63372a.f297794a;
        boolean zF = Intrinsics.f(str, str2);
        Clause clauseQ = q(item);
        Intrinsics.checkNotNullParameter(item, "<this>");
        Intrinsics.checkNotNullParameter(item, "<this>");
        return new RowDelegate.Model(str2, new RowDelegate.Model.MainImage.Image40(new CountryImage(item.f63372a.f297794a, (Integer) null, (ez0.e) null, 14), d8l.d.b(zF), null, false, null, false, 60), clauseQ, null, 0, null, null, null, 0, null, false, null, zF, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536862680);
    }

    public final String p(CountrySelectionOption countrySelectionOption) {
        return this.f223832a.b(new CountryClause(countrySelectionOption.f63372a, null)).toString();
    }
}
