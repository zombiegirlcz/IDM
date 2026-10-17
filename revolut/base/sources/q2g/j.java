package q2g;

import aw0.o9;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.travel.experiences.api.R$string;
import com.revolut.feature.travel.experiences.api.models.experience.TravelExperienceAddress;
import com.revolut.feature.travel.experiences.api.models.experience.TravelExperienceLocation;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import jki.m;
import jki.p;
import kotlin.jvm.internal.Intrinsics;
import zhm.d0;
import zhm.f0;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes9.dex */
public final class j implements p {
    public static RowDelegate.Model.MainImage.Image40 b(int i) {
        return new RowDelegate.Model.MainImage.Image40(new LayeredImage(v.k(new LayeredImage.Layer.Drawable(R$drawable.uikit_icn_circle_background, Integer.valueOf(R$attr.uikit_colorAccent_10), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (com.revolut.core.ui_kit_core.displayers.image.models.c) null, 124), new LayeredImage.Layer.Drawable(i, Integer.valueOf(R$attr.uikit_colorAccent), 8.0f, 8.0f, 8.0f, 8.0f, (com.revolut.core.ui_kit_core.displayers.image.models.c) null, 64)), (Float) null, (Float) null, 14), null, null, false, null, false, 62);
    }

    @Override // jki.p
    public final m a(jki.i iVar) {
        Collection collectionC;
        String strB;
        c domainState = (c) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        if (domainState.d) {
            RowDelegate.Model model = new RowDelegate.Model("ADD_MANUALLY_ITEM_ID", b(R$drawable.uikit_icn_24_plus), new TextLocalisedClause(R$string.experiences_location_picker_add_manually, null, new Custom(Integer.valueOf(R$attr.uikit_colorAccent), false, null, false, null, 254), 10), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870904);
            yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
            collectionC = u.c(model);
        } else {
            collectionC = f0.f322471a;
        }
        Collection collection = collectionC;
        List<TravelExperienceLocation> list = domainState.f241644c;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        for (TravelExperienceLocation travelExperienceLocation : list) {
            String strQ = j6.a.q("LOCATION_ITEM_ID_", travelExperienceLocation.f92826a);
            RowDelegate.Model.MainImage.Image40 image40B = b(R$drawable.uikit_icn_24_location_pin);
            TextClause textClause = new TextClause(travelExperienceLocation.f92827b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            TravelExperienceAddress travelExperienceAddress = travelExperienceLocation.f92828c;
            arrayList.add(new RowDelegate.Model(strQ, image40B, textClause, null, 0, (travelExperienceAddress == null || (strB = io3.h.b(travelExperienceAddress)) == null) ? null : new TextClause(strB, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 0, null, false, null, false, null, null, null, null, null, null, travelExperienceLocation, null, 0, 0, 0, 0, 532676568));
        }
        yp0.b.k(arrayList, 0, 0, 0, 0, 31);
        return new g(new TextClause(domainState.f241642a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), d0.E0(arrayList, collection));
    }
}
