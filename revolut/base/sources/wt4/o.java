package wt4;

import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.CellDetailsStandaloneNoteDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.pa;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import mx0.v5;
import org.jetbrains.annotations.NotNull;
import zhm.d0;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes22.dex */
public final class o implements cli.n {

    @NotNull
    private static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static aim.e a(TextLocalisedClause textLocalisedClause, String str, List list) {
        aim.e eVarB = u.b();
        eVarB.add(new PlainTextDelegate.Model(str, (Clause) null, (Clause) textLocalisedClause, (v5) null, (UrlImage) null, false, pa.LIGHT, (Object) null, (AnalyticsContext) null, 0, R$attr.uikit_dp0, 0, 0, 56814));
        List list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        int i = 0;
        for (Object obj2 : list2) {
            int i2 = i + 1;
            if (i < 0) {
                v.s();
                throw null;
            }
            String strK = com.google.android.gms.internal.mlkit_vision_face.a.k(i, str, "-item-");
            Clause clauseF = sx4.g.f((Clause) obj2, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254));
            ResourceImage resourceImage = new ResourceImage(R$drawable.uikit_icn_24_dot, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone50), (List) null, (ImageTransformations) null, (Clause) null, 246);
            int i3 = R$attr.uikit_dp0;
            arrayList.add(new CellDetailsStandaloneNoteDelegate.Model(strK, null, clauseF, null, resourceImage, false, null, i3, i3, 1642));
            i = i2;
        }
        int i5 = R$attr.uikit_dp8;
        int i6 = R$attr.uikit_dp16;
        qv0.i iVar = (qv0.i) d0.d0(arrayList);
        if (iVar != null) {
            iVar.g(i5);
        }
        qv0.i iVar2 = (qv0.i) d0.o0(arrayList);
        if (iVar2 != null) {
            iVar2.o(i6);
        }
        eVarB.addAll(arrayList);
        aim.e eVarA = u.a(eVarB);
        yp0.b.k(eVarA, 0, 0, 0, 0, 31);
        return eVarA;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        e domainState = (e) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (j) iii.c.f(domainState.f299772a, new wsg.a(this, 13), new wsg.e(this, 15), new w2a.o(this, 23));
    }
}
