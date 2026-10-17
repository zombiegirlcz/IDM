package xs2;

import aw0.o9;
import cli.j;
import cli.n;
import cli.o;
import com.revolut.business.feature.referrals.model.EligibilityCriteria;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import ip0.bk0;
import ip0.yj0;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.d0;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes21.dex */
public final class g implements n {

    @NotNull
    public static final f Companion = new f();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f01.a f308388a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final vu.g f308389b;

    public g(f01.a uiKitResources, vu.g resourceProvider) {
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        Intrinsics.checkNotNullParameter(resourceProvider, "resourceProvider");
        this.f308388a = uiKitResources;
        this.f308389b = resourceProvider;
    }

    @Override // cli.n
    public final o c(j jVar) {
        c domainState = (c) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        vu.f fVar = vu.f.business_referrals_eligibility_criteria_prompt_title;
        n5j.b bVar = (n5j.b) this.f308389b;
        TextDelegate.Model model = new TextDelegate.Model("TITLE_ID", new TextLocalisedClause(bVar.b(fVar), null, new Custom(new Custom.Color.Solid(R$attr.uikit_colorForeground), false, false, 254), 10), false, new bk0(yj0.START), null, null, R$attr.uikit_dp24, R$attr.uikit_dp8, 0, 0, 1652);
        ArrayList arrayList = domainState.f308386a;
        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
        int i = 0;
        for (Object obj2 : arrayList) {
            int i2 = i + 1;
            if (i < 0) {
                v.s();
                throw null;
            }
            EligibilityCriteria eligibilityCriteria = (EligibilityCriteria) obj2;
            int iA = this.f308388a.a(eligibilityCriteria.f50665a);
            Integer numValueOf = Integer.valueOf(iA);
            if (iA == 0) {
                numValueOf = null;
            }
            int iIntValue = numValueOf != null ? numValueOf.intValue() : R$drawable.uikit_icn_24_dot;
            new ResourceImage(iIntValue, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254);
            arrayList2.add(new RowDelegate.Model(a0.d.n("CRITERIA_ID", i), new RowDelegate.Model.MainImage.Image24(new ResourceImage(iIntValue, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), false, false, 6), new TextClause(eligibilityCriteria.f50666b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, 0, new TextClause(eligibilityCriteria.f50667c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870872));
            i = i2;
        }
        yp0.b.k(arrayList2, 0, 0, 0, 0, 31);
        ArrayList arrayListJ = ue0.e.J(model, arrayList2);
        LargeActionButtonDelegate.Model model2 = new LargeActionButtonDelegate.Model("ACTION_ID", LargeActionButton.ButtonStyle.f58725a, null, new TextLocalisedClause(bVar.b(vu.f.business_referrals_eligibility_criteria_prompt_action), null, null, 14), false, null, null, null, null, 1000);
        yp0.b.r(model2, 0, R$attr.uikit_dp16, 0, 0, 13);
        return new d(d0.F0(model2, arrayListJ));
    }
}
