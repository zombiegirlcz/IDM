package jo6;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.ff;
import com.revolut.core.ui_kit.models.badge.WhiteCircleBadge;
import com.revolut.data.model.Data;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import s7a.c0;
import zhm.d0;
import zhm.f0;
import zhm.w;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends x7a.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n8b.a f176866a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n8b.b f176867b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final qd0.b f176868c;

    public b(n8b.a countryInteractor, n8b.b countryUtils, qd0.b languageProvider) {
        Intrinsics.checkNotNullParameter(countryInteractor, "countryInteractor");
        Intrinsics.checkNotNullParameter(countryUtils, "countryUtils");
        Intrinsics.checkNotNullParameter(languageProvider, "languageProvider");
        this.f176866a = countryInteractor;
        this.f176867b = countryUtils;
        this.f176868c = languageProvider;
    }

    @Override // x7a.d
    public final c0 c(Set ids, Object obj2) {
        Intrinsics.checkNotNullParameter(ids, "ids");
        return new c8a.a((String) d0.a0(ids));
    }

    @Override // x7a.c
    public final ff i() {
        return ff.DP_40;
    }

    @Override // x7a.c
    public final String k(wi0.b countryCode) {
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        return ((o8b.g) this.f176867b).a(countryCode.f297794a);
    }

    @Override // x7a.c
    public final ArrayList l(Object data, Set selectedModelIds, String query, Object obj2) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(selectedModelIds, "selectedModelIds");
        Intrinsics.checkNotNullParameter(query, "query");
        ArrayList<RowDelegate.Model> arrayListL = super.l(data, selectedModelIds, query, obj2);
        ArrayList arrayList = new ArrayList(w.t(arrayListL, 10));
        for (RowDelegate.Model modelX : arrayListL) {
            if (modelX.J()) {
                RowDelegate.Model.MainImage mainImage = modelX.f53229b;
                RowDelegate.Model.MainImage.Image40 image40 = mainImage instanceof RowDelegate.Model.MainImage.Image40 ? (RowDelegate.Model.MainImage.Image40) mainImage : null;
                if (image40 != null) {
                    modelX = RowDelegate.Model.x(modelX, null, RowDelegate.Model.MainImage.Image40.b(image40, new WhiteCircleBadge(dw0.a.Checked), 61), null, null, null, 0, null, false, null, null, 0, 0, 0, 0, null, -3, 15);
                }
            }
            arrayList.add(modelX);
        }
        return arrayList;
    }

    @Override // x7a.c
    public final Flow m(Object obj2) {
        a aVar = obj2 instanceof a ? (a) obj2 : null;
        Object obj3 = aVar != null ? aVar.f176865a : null;
        if (obj3 == null) {
            obj3 = f0.f322471a;
        }
        return new go.g(new Data(obj3, null, false, 6, null), 2);
    }

    @Override // x7a.c
    public final Flow o(Object obj2) {
        wi0.b bVarA = null;
        a aVar = obj2 instanceof a ? (a) obj2 : null;
        List list = aVar != null ? aVar.f176865a : null;
        if (list == null) {
            list = f0.f322471a;
        }
        Locale localeB = ((s80.b) this.f176868c).b();
        String country = localeB.getCountry();
        if (kotlin.text.d0.W(country)) {
            country = null;
        }
        if (country != null) {
            wi0.b.Companion.getClass();
            bVarA = wi0.a.a(country);
        }
        aim.e eVarB = zhm.u.b();
        if (bVarA != null) {
            eVarB.add(bVarA);
        }
        eVarB.addAll(((o8b.c) this.f176866a).d(localeB));
        List listU = d0.U(zhm.u.a(eVarB));
        ArrayList arrayList = new ArrayList();
        for (Object obj3 : listU) {
            if (list.contains((wi0.b) obj3)) {
                arrayList.add(obj3);
            }
        }
        return new go.g(new Data(arrayList, null, false, 6, null), 2);
    }
}
