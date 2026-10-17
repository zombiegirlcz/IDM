package ob0;

import aw0.o9;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CountryClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.CountryImage;
import com.revolut.feature.backend_flow.domain.models.PhoneInputItem;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import lb0.u;
import s7a.c0;
import vkm.v1;
import zhm.d0;

/* JADX INFO: loaded from: classes19.dex */
public final class s extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f01.a f223840a;

    public s(f01.a uiKitResources) {
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        this.f223840a = uiKitResources;
    }

    @Override // x7a.d
    public final c0 c(Set ids, Object obj2) {
        Intrinsics.checkNotNullParameter(ids, "ids");
        Intrinsics.i(obj2, "null cannot be cast to non-null type com.revolut.core.backend_flow.impl.ui.form_screen.interactors.PhoneCodePickerParams");
        PhoneInputItem phoneInputItem = ((t) obj2).f223841a;
        String str = phoneInputItem.f63569a;
        List<PhoneInputItem.Country> list = phoneInputItem.i;
        if (list == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        for (PhoneInputItem.Country country : list) {
            if (Intrinsics.f(country.f63574a.f297794a, d0.a0(ids))) {
                return new u(str, country);
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // x7a.d
    public final Flow e(String query, boolean z, Object obj2) {
        Intrinsics.checkNotNullParameter(query, "query");
        return new v1(new r(obj2, null));
    }

    @Override // ob0.b
    public final ArrayList i(String query, List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(query, "query");
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            PhoneInputItem.Country country = (PhoneInputItem.Country) obj2;
            String str = country.f63576c;
            if (str == null) {
                str = "";
            }
            if (!kotlin.text.d0.J(str, query, true) && !kotlin.text.d0.J(hx7.a.J(country.f63575b), query, true)) {
                if (kotlin.text.d0.J(this.f223840a.b(new CountryClause(country.f63574a, null)), query, true)) {
                }
            }
            arrayList.add(obj2);
        }
        return arrayList;
    }

    @Override // ob0.b
    public final Image j(Object obj2) {
        PhoneInputItem.Country country = (PhoneInputItem.Country) obj2;
        Intrinsics.checkNotNullParameter(country, "<this>");
        return new CountryImage(country.f63574a.f297794a, (Integer) null, (ez0.e) null, 14);
    }

    @Override // ob0.b
    public final String k(Object obj2) {
        PhoneInputItem.Country country = (PhoneInputItem.Country) obj2;
        Intrinsics.checkNotNullParameter(country, "<this>");
        return country.f63574a.f297794a;
    }

    @Override // ob0.b
    public final List l(String query, List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(query, "query");
        return d0.P0(list, new l(cim.b.a(new q(query, this), new q(this, query)), 1));
    }

    @Override // ob0.b
    public final Clause m(Object obj2) {
        PhoneInputItem.Country country = (PhoneInputItem.Country) obj2;
        Intrinsics.checkNotNullParameter(country, "<this>");
        return new TextClause(hx7.a.J(country.f63575b), (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
    }

    @Override // ob0.b
    public final Clause n(Object obj2) {
        PhoneInputItem.Country country = (PhoneInputItem.Country) obj2;
        Intrinsics.checkNotNullParameter(country, "<this>");
        String str = country.f63576c;
        return str != null ? new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : new CountryClause(country.f63574a, null);
    }
}
