package xe4;

import aw0.o9;
import cli.n;
import cli.o;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.credit.application.plugins.impl.ui.mortgage_signature.signing_methods_info.SigningMethodsInfoScreenContract$InputData;
import com.revolut.feature.credit.core.R$string;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import mx0.q5;
import mx0.v5;
import yy3.r;
import yy3.s;
import zhm.f0;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes22.dex */
public final class h implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SigningMethodsInfoScreenContract$InputData f304535a;

    public h(SigningMethodsInfoScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f304535a = inputData;
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        List listC;
        cli.k domainState = (cli.k) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        s sVar = this.f304535a.f68051a;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.credit_application_mortgage_signature_signing_methods_info_title, u.c(new TextClause(sVar.f317796a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12);
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.credit_application_mortgage_signature_signing_methods_info_description, u.c(new TextClause(sVar.f317797b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12);
        ArrayList arrayList = sVar.f317798c;
        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
        Iterator it8 = arrayList.iterator();
        while (it8.hasNext()) {
            r rVar = (r) it8.next();
            String str = rVar.f317793a;
            Iterator it9 = it8;
            TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(R$string.credit_application_mortgage_signature_signing_methods_info_method_title, u.c(new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12);
            TextLocalisedClause textLocalisedClause4 = new TextLocalisedClause(R$string.credit_application_mortgage_signature_signing_methods_info_method_description, u.c(new TextClause(rVar.f317794b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12);
            yy3.o oVar = rVar.f317795c;
            if (oVar == null || (listC = u.c(new q5(oVar.f317784a, new ResourceImage(oVar.f317785b.c(), (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), new TextLocalisedClause(R$string.credit_application_mortgage_signature_signing_methods_info_method_button, u.c(new TextClause(oVar.f317784a, (Style) new Custom(Integer.valueOf(R$attr.uikit_colorAccent), false, null, false, null, 254), (Integer) null, false, (o9) null, (List) null, 124)), null, 12), oVar.f317786c))) == null) {
                listC = f0.f322471a;
            }
            PlainTextDelegate.Model model = new PlainTextDelegate.Model(str, (UrlImage) null, textLocalisedClause3, textLocalisedClause4, (v5) null, listC, (String) null, (Object) null, (AnalyticsContext) null, 0, 0, 0, 0, 32682);
            yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
            arrayList2.add(model);
            it8 = it9;
        }
        return new g(textLocalisedClause, textLocalisedClause2, arrayList2);
    }
}
