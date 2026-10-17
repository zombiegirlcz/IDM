package ilj;

import aw0.o9;
import cli.j;
import cli.n;
import cli.o;
import com.onfido.android.sdk.capture.utils.yearclass.YearClass;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.SingleChoiceDelegate;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.retail.feature.esim.api.model.EsimPhoneNumberPortingServiceProvider;
import com.revolut.retail.feature.esim.api.model.EsimPickerItem;
import com.revolut.retail.feature.esim.impl.R$string;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.picker.EsimPickerScreenContract$InputData;
import ip0.zj;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes11.dex */
public final class h implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EsimPickerScreenContract$InputData f162248a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xnj.a f162249b;

    public h(EsimPickerScreenContract$InputData inputData, xnj.a queryMatcher) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(queryMatcher, "queryMatcher");
        this.f162248a = inputData;
        this.f162249b = queryMatcher;
    }

    @Override // cli.n
    public final o c(j jVar) {
        List listC;
        d domainState = (d) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        String str = domainState.f162245a;
        EsimPickerScreenContract$InputData esimPickerScreenContract$InputData = this.f162248a;
        List list = esimPickerScreenContract$InputData.f101325a;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            String str2 = ((EsimPhoneNumberPortingServiceProvider) ((EsimPickerItem) obj2)).f100398b;
            this.f162249b.getClass();
            if (xnj.a.a(str2, str)) {
                arrayList.add(obj2);
            }
        }
        if (arrayList.isEmpty()) {
            TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.esim_country_picker_search_no_results_title, null, null, 14);
            Clause clauseC = esimPickerScreenContract$InputData.f101327c;
            if (clauseC instanceof TextLocalisedClause) {
                clauseC = TextLocalisedClause.c((TextLocalisedClause) clauseC, u.c(new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 29);
            }
            FullScreenStateDelegate.Model model = new FullScreenStateDelegate.Model("ID_NO_RESULTS_FOUND_ITEM", textLocalisedClause, clauseC, new ComplexImage.Regular(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D122", null, null, null, 30)), zj.REGULAR, null, false, null, null, false, 0, 0, 32736);
            yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
            listC = u.c(model);
        } else {
            ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
            int i = 0;
            for (Object obj3 : arrayList) {
                int i2 = i + 1;
                if (i < 0) {
                    v.s();
                    throw null;
                }
                EsimPickerItem esimPickerItem = (EsimPickerItem) obj3;
                arrayList2.add(new SingleChoiceDelegate.Model(a0.d.n("ID_PICKER_ITEM_", i), new TextClause(((EsimPhoneNumberPortingServiceProvider) esimPickerItem).f100398b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), false, null, esimPickerItem, YearClass.CLASS_2008));
                i = i2;
            }
            yp0.b.k(arrayList2, 0, 0, 0, 0, 31);
            listC = arrayList2;
        }
        return new f(listC);
    }
}
