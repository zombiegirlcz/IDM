package zq7;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.insurance_car.impl.R$string;
import com.revolut.feature.insurance_car.impl.data.model.DocumentRequirementsPoint;
import com.revolut.feature.insurance_car.impl.data.model.RequestedDocument;
import ip0.zj;
import java.util.ArrayList;
import java.util.List;
import jki.m;
import jki.p;
import kl7.z1;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.a0;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes4.dex */
public final class h implements p {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    @Override // jki.p
    public final m a(jki.i iVar) {
        c domainState = (c) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        RequestedDocument requestedDocument = domainState.f324411a;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.car_insurance_requested_documents_requirements_title, u.c(requestedDocument.f75306j.f75307a), null, 12);
        aim.e eVarB = u.b();
        z1 z1Var = requestedDocument.f75302b;
        Intrinsics.checkNotNullParameter(z1Var, "<this>");
        eVarB.add(new FullScreenStateDelegate.Model("FULL_SCREEN_STATE_ID", null, null, new ComplexImage.Regular(mra.d.B(i.f324416a[z1Var.ordinal()] == 1 ? "3D186" : "3D021")), zj.REGULAR, null, false, null, null, false, 0, 0, 31686));
        ArrayList<DocumentRequirementsPoint> arrayList = requestedDocument.f75306j.f75308b;
        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
        for (DocumentRequirementsPoint documentRequirementsPoint : arrayList) {
            String str = documentRequirementsPoint.f75212a;
            arrayList2.add(new RowDelegate.Model(str, sr7.e.a(documentRequirementsPoint.f75214c, R$attr.uikit_colorForeground), new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, 0, new TextClause(documentRequirementsPoint.f75213b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868824));
        }
        yp0.b.k(arrayList2, 0, 0, 0, 0, 31);
        a0.x(arrayList2, eVarB);
        Unit unit = Unit.f186387a;
        return new f(u.a(eVarB), textLocalisedClause);
    }
}
