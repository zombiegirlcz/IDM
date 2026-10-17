package amk;

import aw0.o9;
import cli.j;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.tf;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.pricingplans.models.documents.PricingPlanDocument;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes11.dex */
public final class i implements n {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    @Override // cli.n
    public final o c(j jVar) {
        d domainState = (d) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        Clause clause = (Clause) domainState.f6468a.getContent();
        lw0.a aVar = clause != null ? new lw0.a(clause, null, null, null, false, 30) : null;
        boolean z = aVar == null;
        List list = domainState.f6469b;
        int i = z ? R$attr.uikit_dp24 : R$attr.uikit_dp8;
        List list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        int i2 = 0;
        for (Object obj2 : list2) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                v.s();
                throw null;
            }
            PricingPlanDocument pricingPlanDocument = (PricingPlanDocument) obj2;
            String strN = a0.d.n("ID_DOCUMENT_PREFIX_", i2);
            RowDelegate.Model.MainImage.Image40 image40 = new RowDelegate.Model.MainImage.Image40(new ResourceImage(R$drawable.uikit_icn_24_document, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), null, null, false, null, false, 62);
            tf tfVar = new tf(4, new ResourceImage(R$drawable.uikit_icn_24_chevron_right, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGrey20), (List) null, (ImageTransformations) null, (Clause) null, 246), false);
            TextClause textClause = new TextClause(pricingPlanDocument.f81186a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            int i5 = R$attr.uikit_dp12;
            arrayList.add(new RowDelegate.Model(strN, image40, textClause, null, 0, null, null, null, 0, tfVar, true, null, false, null, null, null, null, null, null, pricingPlanDocument, null, i5, i5, 0, 0, 482341880));
            i2 = i3;
        }
        yp0.b.k(arrayList, i, 0, 0, 0, 30);
        return new f(arrayList, aVar);
    }
}
