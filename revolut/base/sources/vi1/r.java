package vi1;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.data.model.Data;
import com.revolut.feature.address.models.CountryState;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import org.jmrtd.cbeff.ISO781611;
import s7a.c0;
import zhm.d0;
import zhm.f0;
import zhm.w;

/* JADX INFO: loaded from: classes20.dex */
public final class r extends x7a.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rh1.b f289516a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final te0.r f289517b;

    public r(rh1.b addressFlowInteractor) {
        Intrinsics.checkNotNullParameter(addressFlowInteractor, "addressFlowInteractor");
        this.f289516a = addressFlowInteractor;
        this.f289517b = new te0.r(f0.f322471a);
    }

    @Override // x7a.d
    public final c0 c(Set ids, Object obj2) {
        Intrinsics.checkNotNullParameter(ids, "ids");
        for (CountryState countryState : (Iterable) this.f289517b.get()) {
            if (Intrinsics.f(countryState.getCode(), d0.a0(ids))) {
                return new q(countryState);
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // x7a.d
    public final List d(Data data, Set selectedModelIds, List list, String query, Object obj2) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(selectedModelIds, "selectedModelIds");
        Intrinsics.checkNotNullParameter(query, "query");
        Object content = data.getContent();
        if (content == null) {
            return f0.f322471a;
        }
        ArrayList<CountryState> arrayList = new ArrayList();
        for (Object obj3 : (List) content) {
            CountryState countryState = (CountryState) obj3;
            if (kotlin.text.d0.J(countryState.getName(), query, true) || kotlin.text.d0.J(countryState.getCode(), query, true)) {
                arrayList.add(obj3);
            }
        }
        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
        for (CountryState countryState2 : arrayList) {
            RowDelegate.Model.b bVar = (list == null || !list.contains(countryState2.getCode())) ? RowDelegate.Model.b.c.f53268a : RowDelegate.Model.b.a.f53266a;
            String code = countryState2.getCode();
            TextClause textClause = new TextClause(countryState2.getName(), (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            String str = obj2 instanceof String ? (String) obj2 : null;
            TextClause textClause2 = new TextClause(countryState2.getCode(), (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            wi0.b.Companion.getClass();
            arrayList2.add(new RowDelegate.Model(code, null, textClause, null, 0, null, null, null, 0, (Intrinsics.f(str, "JP") || Intrinsics.f(str, "UA")) ? null : new RowDelegate.Model.c.b(null, textClause2, null, false, ISO781611.SMT_TAG), bVar instanceof RowDelegate.Model.b.c, null, false, bVar, null, null, null, null, null, countryState2, null, 0, 0, 0, 0, 532657146));
        }
        yp0.b.k(arrayList2, 0, 0, 0, 0, 31);
        return arrayList2;
    }

    @Override // x7a.d
    public final Flow e(String query, boolean z, Object obj2) {
        Intrinsics.checkNotNullParameter(query, "query");
        Intrinsics.i(obj2, "null cannot be cast to non-null type kotlin.String");
        return nim.a.v(((lj1.a) this.f289516a).c((String) obj2), new vh2.j(this, 5));
    }
}
