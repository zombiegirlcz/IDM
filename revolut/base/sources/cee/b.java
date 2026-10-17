package cee;

import android.os.Parcelable;
import aw0.o9;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.delegates.CounterTextDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.t4;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.BulletImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.support.impl.R$string;
import com.revolut.feature.support.impl.transfer_tracker.domain.model.Section;
import com.revolut.feature.support.impl.transfer_tracker.domain.model.Step;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import koi.j;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.a0;
import zhm.f0;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes8.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static j a(TextClause estimate, TextClause disclaimer) {
        Intrinsics.checkNotNullParameter(estimate, "estimate");
        Intrinsics.checkNotNullParameter(disclaimer, "disclaimer");
        CounterTextDelegate.Model model = new CounterTextDelegate.Model("ESTIMATION_LIST_ID", new TextLocalisedClause(R$string.locate_inbound_transfer_output_within_timeframe_subheader, null, null, 14), new t4(estimate), disclaimer, false, null, null, 0, 0, 0, 0, 2032);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        return model;
    }

    public static ArrayList b(ArrayList sections, aed.a aVar) {
        RowDelegate.Model.MainImage.Image24 image24;
        Intrinsics.checkNotNullParameter(sections, "sections");
        int i = 10;
        ArrayList arrayList = new ArrayList(w.t(sections, 10));
        Iterator it8 = sections.iterator();
        while (it8.hasNext()) {
            Section section = (Section) it8.next();
            TextClause textClause = new TextClause(section.f89370a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            ArrayList<Step> arrayList2 = section.f89371b;
            ArrayList arrayList3 = new ArrayList(w.t(arrayList2, 10));
            for (Step step : arrayList2) {
                arrayList3.add(new d(new TextClause(step.f89372a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextClause(step.f89373b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), step.d, aVar != null ? (Clause) aVar.invoke(step.f89374c) : null));
            }
            arrayList.add(new c(textClause, arrayList3));
        }
        ArrayList arrayListS = t61.a.s("sections", arrayList);
        boolean z = false;
        int i2 = 0;
        for (Object obj2 : arrayList) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                v.s();
                throw null;
            }
            c cVar = (c) obj2;
            ArrayList arrayList4 = cVar.f23475b;
            ArrayList arrayList5 = new ArrayList(w.t(arrayList4, i));
            int i5 = 0;
            for (Object obj3 : arrayList4) {
                int i6 = i5 + 1;
                if (i5 < 0) {
                    v.s();
                    throw null;
                }
                d dVar = (d) obj3;
                String strG = a0.d.g(i2, i5, "SECTION_", "_STEP_");
                TextClause textClause2 = dVar.f23476a;
                TextClause textClause3 = dVar.f23477b;
                int i21 = e.f23479a[dVar.f23478c.ordinal()];
                int i22 = 6;
                if (i21 == 1) {
                    image24 = new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_bell, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), z, z, i22);
                } else if (i21 == 2) {
                    image24 = new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_arrow_right_left, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), z, z, i22);
                } else {
                    if (i21 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    image24 = new RowDelegate.Model.MainImage.Image24(new BulletImage(new BulletImage.Content.Number(i6), (Integer) null, (Integer) null, (Integer) null, BitmapDescriptorFactory.HUE_RED, 62), z, z, i22);
                }
                arrayList5.add(new RowDelegate.Model(strG, image24, textClause2, null, 0, textClause3, dVar.d, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868760));
                i5 = i6;
            }
            ArrayList arrayList6 = !arrayList5.isEmpty() ? arrayList5 : null;
            Iterable iterableG = arrayList6 != null ? yp0.b.g(arrayList6, new ListSubheaderDelegate.Model(a0.d.n("STEPS_SUBHEADER_ID_", i2), (Image) null, (Clause) cVar.f23474a, (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), null, 0, 0, 126) : null;
            if (iterableG == null) {
                iterableG = f0.f322471a;
            }
            a0.x(iterableG, arrayListS);
            i2 = i3;
            i = 10;
        }
        return arrayListS;
    }
}
