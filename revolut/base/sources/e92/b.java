package e92;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.tf;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.apm.multibanco.api.R$string;
import com.revolut.feature.apm.multibanco.impl.via_verde.data.ViaVerdeEnrollment;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import yy0.h;
import zhm.w;

/* JADX INFO: loaded from: classes20.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static ArrayList a(List enrollments) {
        Intrinsics.checkNotNullParameter(enrollments, "enrollments");
        RowDelegate.Model.MainImage.Image40 image40 = new RowDelegate.Model.MainImage.Image40(LayeredImage.INSTANCE.i(R$drawable.uikit_icn_24_driving_licence, R$attr.uikit_colorWhite, R$attr.uikit_colorIndigo), null, null, false, null, false, 60);
        tf tfVar = new tf(new h(new TextLocalisedClause(R$string.via_verde_identifier_details_section_details_title, null, null, 14), new ResourceImage(R$drawable.uikit_icn_16_chevron_right, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorWhite), (List) null, (ImageTransformations) null, (Clause) null, 246)));
        List<ViaVerdeEnrollment> list = enrollments;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        for (ViaVerdeEnrollment viaVerdeEnrollment : list) {
            RowDelegate.Model.MainImage.Image40 image402 = image40;
            image40 = image402;
            arrayList.add(new RowDelegate.Model(j6.a.q("ID_ENROLLMENTS_ROW_", viaVerdeEnrollment.f62642a), image402, new TextClause(viaVerdeEnrollment.e, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, 0, new TextClause(viaVerdeEnrollment.d, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 0, tfVar, false, null, false, null, null, null, null, null, null, viaVerdeEnrollment, null, 0, 0, 0, 0, 532675544));
        }
        yp0.b.k(arrayList, 0, 0, 0, 0, 31);
        return arrayList;
    }
}
