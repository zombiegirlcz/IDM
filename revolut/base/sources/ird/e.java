package ird;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.CurrencyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.CurrencyImage;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.data.model.Data;
import e7l.g;
import fad.i;
import ip4.m;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import s7a.c0;
import w4l.h;
import zhm.d0;
import zhm.f0;
import zhm.w;

/* JADX INFO: loaded from: classes7.dex */
public final class e extends x7a.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fk3.a f168043a;

    public e(fk3.a configurationInteractor) {
        Intrinsics.checkNotNullParameter(configurationInteractor, "configurationInteractor");
        this.f168043a = configurationInteractor;
    }

    @Override // x7a.d
    public final c0 c(Set ids, Object obj2) {
        Intrinsics.checkNotNullParameter(ids, "ids");
        xi0.a aVar = xi0.b.Companion;
        String str = (String) d0.a0(ids);
        aVar.getClass();
        return new c(xi0.a.a(str));
    }

    @Override // x7a.d
    public final List d(Data data, Set selectedModelIds, List list, String query, Object obj2) {
        LayeredImage layeredImageF;
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(selectedModelIds, "selectedModelIds");
        Intrinsics.checkNotNullParameter(query, "query");
        Object content = data.getContent();
        List list2 = content instanceof List ? (List) content : null;
        if (list2 == null) {
            return f0.f322471a;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj3 : list2) {
            if (obj3 instanceof xi0.b) {
                arrayList.add(obj3);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj4 : arrayList) {
            if (kotlin.text.d0.J(((xi0.b) obj4).f306286a, query, true)) {
                arrayList2.add(obj4);
            }
        }
        List<xi0.b> listP0 = d0.P0(arrayList2, new i(new e23.c(8, selectedModelIds), 28));
        ArrayList arrayList3 = new ArrayList(w.t(listP0, 10));
        for (xi0.b bVar : listP0) {
            boolean zContains = selectedModelIds.contains(bVar.f306286a);
            String str = bVar.f306286a;
            CurrencyClause currencyClause = new CurrencyClause(bVar, CurrencyClause.Format.DisplayName.f57755a, null, 4);
            CurrencyClause currencyClause2 = new CurrencyClause(bVar, CurrencyClause.Format.Ticker.f57756a, null, 4);
            CurrencyImage currencyImage = new CurrencyImage(bVar.f306286a, (ImageTransformations) null, (TextLocalisedClause) null, 14);
            if (zContains) {
                LayeredImage.Companion companion = LayeredImage.INSTANCE;
                int i = R$drawable.uikit_icn_16_status_check;
                int i2 = R$attr.uikit_colorBackground;
                layeredImageF = LayeredImage.Companion.f(companion, i, R$attr.uikit_colorAccent, i2, Integer.valueOf(i2), 4.0f, BitmapDescriptorFactory.HUE_RED, Float.valueOf(16.0f), 32);
            } else {
                layeredImageF = null;
            }
            arrayList3.add(new RowDelegate.Model(str, new RowDelegate.Model.MainImage.Image40(currencyImage, layeredImageF, null, false, 28), currencyClause, null, 0, currencyClause2, null, null, 0, null, false, null, zContains, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536862680));
        }
        yp0.b.k(arrayList3, 0, 0, 0, 0, 31);
        return arrayList3;
    }

    @Override // x7a.d
    public final Flow e(String query, boolean z, Object obj2) {
        Intrinsics.checkNotNullParameter(query, "query");
        return nim.a.v(rd0.e.b(((ik3.c) this.f168043a).l(g.b.f123407a, h.f294642c)), new m(13));
    }
}
