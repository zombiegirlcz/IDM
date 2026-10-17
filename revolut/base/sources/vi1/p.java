package vi1;

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
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import q2j.v;
import s7a.c0;
import zhm.d0;
import zhm.f0;
import zhm.w;

/* JADX INFO: loaded from: classes.dex */
public final class p extends x7a.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rh1.b f289514a;

    public p(rh1.b addressFlowInteractor) {
        Intrinsics.checkNotNullParameter(addressFlowInteractor, "addressFlowInteractor");
        this.f289514a = addressFlowInteractor;
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
            sh1.m mVar = (sh1.m) obj3;
            if (kotlin.text.d0.J(mVar.b(), query, true) || kotlin.text.d0.J(mVar.a(), query, true)) {
                arrayList.add(obj3);
            }
        }
        List<sh1.m> listP0 = d0.P0(arrayList, new v(new e23.c(11, selectedModelIds), 15));
        ArrayList arrayList2 = new ArrayList(w.t(listP0, 10));
        for (sh1.m mVar2 : listP0) {
            boolean zContains = selectedModelIds.contains(mVar2.a());
            String strA = mVar2.a();
            TextClause textClause = new TextClause(mVar2.b(), (Style) null, Integer.valueOf(R$attr.uikit_colorForeground), false, (o9) null, (List) null, 122);
            LayeredImage layeredImageF = null;
            CountryImage countryImage = new CountryImage(mVar2.a(), (Integer) null, (ez0.e) null, 14);
            if (zContains) {
                LayeredImage.Companion companion = LayeredImage.INSTANCE;
                int i = R$drawable.uikit_icn_16_status_check;
                int i2 = R$attr.uikit_colorBackground;
                layeredImageF = LayeredImage.Companion.f(companion, i, R$attr.uikit_colorAccent, i2, Integer.valueOf(i2), 4.0f, BitmapDescriptorFactory.HUE_RED, Float.valueOf(16.0f), 32);
            }
            arrayList2.add(new RowDelegate.Model(strA, new RowDelegate.Model.MainImage.Image40(countryImage, layeredImageF, null, false, 28), textClause, null, 0, null, null, null, 0, null, false, null, zContains, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536862712));
        }
        yp0.b.k(arrayList2, 0, 0, 0, 0, 31);
        return arrayList2;
    }

    @Override // x7a.d
    public final Flow e(String query, boolean z, Object obj2) {
        Intrinsics.checkNotNullParameter(query, "query");
        return nim.a.v(((lj1.a) this.f289514a).a(), new vh2.j(this, 4));
    }
}
