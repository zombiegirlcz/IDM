package god;

import aw0.o9;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_core.displayers.image.models.CountryImage;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.data.model.Data;
import fmc.z;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import s7a.c0;
import zhm.d0;
import zhm.f0;
import zhm.w;

/* JADX INFO: loaded from: classes7.dex */
public final class i extends x7a.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n8b.a f145143a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z f145144b;

    public i(n8b.a countryInteractor, z tripsCountriesProvider) {
        Intrinsics.checkNotNullParameter(countryInteractor, "countryInteractor");
        Intrinsics.checkNotNullParameter(tripsCountriesProvider, "tripsCountriesProvider");
        this.f145143a = countryInteractor;
        this.f145144b = tripsCountriesProvider;
    }

    @Override // x7a.d
    public final c0 c(Set ids, Object obj2) {
        Intrinsics.checkNotNullParameter(ids, "ids");
        return new c8a.a((String) d0.a0(ids));
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
        ArrayList arrayList = new ArrayList();
        for (Object obj3 : (List) content) {
            h hVar = (h) obj3;
            if (kotlin.text.d0.J(hVar.f145141a, query, true) || kotlin.text.d0.J(hVar.f145142b, query, true)) {
                arrayList.add(obj3);
            }
        }
        List<h> listP0 = d0.P0(arrayList, new fad.i(new e23.c(4, selectedModelIds), 8));
        ArrayList arrayList2 = new ArrayList(w.t(listP0, 10));
        for (h hVar2 : listP0) {
            boolean zContains = selectedModelIds.contains(hVar2.f145142b);
            String str = hVar2.f145142b;
            TextClause textClause = new TextClause(hVar2.f145141a, (Style) null, Integer.valueOf(R$attr.uikit_colorForeground), false, (o9) null, (List) null, 122);
            LayeredImage layeredImageF = null;
            CountryImage countryImage = new CountryImage(hVar2.f145142b, (Integer) null, (ez0.e) null, 14);
            if (zContains) {
                LayeredImage.Companion companion = LayeredImage.INSTANCE;
                int i = R$drawable.uikit_icn_16_status_check;
                int i2 = R$attr.uikit_colorBackground;
                layeredImageF = LayeredImage.Companion.f(companion, i, R$attr.uikit_colorAccent, i2, Integer.valueOf(i2), 4.0f, BitmapDescriptorFactory.HUE_RED, Float.valueOf(16.0f), 32);
            }
            arrayList2.add(new RowDelegate.Model(str, new RowDelegate.Model.MainImage.Image40(countryImage, layeredImageF, null, false, 28), textClause, null, 0, null, null, null, 0, null, false, null, zContains, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536862712));
        }
        yp0.b.k(arrayList2, 0, 0, 0, 0, 31);
        return arrayList2;
    }

    @Override // x7a.d
    public final Flow e(String query, boolean z, Object obj2) {
        Intrinsics.checkNotNullParameter(query, "query");
        return nim.a.v(this.f145144b.j(), new gmk.j(this, 5));
    }
}
