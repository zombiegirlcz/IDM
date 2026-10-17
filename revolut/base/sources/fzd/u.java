package fzd;

import com.revolut.data.model.Data;
import com.revolut.feature.statements.api.models.CustomisationParameters;
import com.revolut.feature.statements.api.models.CustomisationSelection;
import com.revolut.feature.statements.api.models.Product;
import com.revolut.feature.statements.api.models.ProductSelection;
import com.revolut.feature.statements.api.models.SelectableOption;
import com.revolut.feature.statements.impl.ui.consolidated.customisation.ConsolidatedStatementCustomisationScreenContract$InputData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;
import zhm.d0;
import zhm.h0;

/* JADX INFO: loaded from: classes7.dex */
public final class u extends oki.h implements l {
    public final kgm.i o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final zxd.c f139162p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final l2j.a f139163q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final x f139164r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final z f139165s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final phm.a f139166t;
    public final cli.y u;

    public u(cli.n stateMapper, ConsolidatedStatementCustomisationScreenContract$InputData inputData, kgm.i customisationInteractor, zxd.c statementsInteractor, l2j.a currencyChooserFlowFactory, x productSectionExtension, z selectableOptionExtension, ede.a languagePickerInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(customisationInteractor, "customisationInteractor");
        Intrinsics.checkNotNullParameter(statementsInteractor, "statementsInteractor");
        Intrinsics.checkNotNullParameter(currencyChooserFlowFactory, "currencyChooserFlowFactory");
        Intrinsics.checkNotNullParameter(productSectionExtension, "productSectionExtension");
        Intrinsics.checkNotNullParameter(selectableOptionExtension, "selectableOptionExtension");
        Intrinsics.checkNotNullParameter(languagePickerInteractor, "languagePickerInteractor");
        this.o = customisationInteractor;
        this.f139162p = statementsInteractor;
        this.f139163q = currencyChooserFlowFactory;
        this.f139164r = productSectionExtension;
        this.f139165s = selectableOptionExtension;
        this.f139166t = languagePickerInteractor;
        CustomisationParameters customisationParameters = inputData.f88301a;
        Data data = customisationParameters == null ? new Data(null, null, true, 3, null) : new Data(customisationParameters, null, false, 6, null);
        CustomisationSelection customisationSelection = inputData.f88302b;
        this.u = mra.d.b(this, new j(data, customisationSelection == null ? CustomisationSelection.INSTANCE.getEMPTY() : customisationSelection), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        cli.y yVar = this.u;
        CustomisationSelection customisationSelection = ((j) ((j2) yVar.f22677a).getValue()).f139144b;
        this.f139164r.g3(new lzd.c(customisationSelection.getExpandedProducts(), customisationSelection.getProductSelection()));
        Set<String> selectedCategories = customisationSelection.getSelectedCategories();
        z zVar = this.f139165s;
        zVar.f3(selectedCategories);
        zVar.g3(customisationSelection.getSelectedTransactionDirections());
        CustomisationParameters customisationParameters = (CustomisationParameters) ((j) ((j2) yVar.f22677a).getValue()).f139143a.getContent();
        if (customisationParameters != null) {
            I2(customisationParameters, false);
        } else {
            n2(new ft.d(this, null, 13), new whi.b(6));
        }
    }

    public final void I2(CustomisationParameters customisationParameters, boolean z) {
        CustomisationSelection customisationSelectionCopy$default;
        List<Product> products = customisationParameters.getProducts();
        x xVar = this.f139164r;
        xVar.f3(products);
        List<SelectableOption> transactionCategories = customisationParameters.getTransactionCategories();
        z zVar = this.f139165s;
        zVar.e3(transactionCategories);
        cli.y yVar = this.u;
        CustomisationSelection customisationSelection = ((j) ((j2) yVar.f22677a).getValue()).f139144b;
        Locale language = customisationSelection.getLanguage();
        if (language == null) {
            language = customisationParameters.getDefaultLanguage();
        }
        Locale locale = language;
        xi0.b currency = customisationSelection.getCurrency();
        if (currency == null) {
            currency = customisationParameters.getDefaultCurrency();
        }
        xi0.b bVar = currency;
        if (z) {
            ProductSelection productSelectionZ = cj9.c.Z(customisationParameters);
            List<SelectableOption> transactionCategories2 = customisationParameters.getTransactionCategories();
            ArrayList arrayList = new ArrayList(zhm.w.t(transactionCategories2, 10));
            Iterator<T> it8 = transactionCategories2.iterator();
            while (it8.hasNext()) {
                arrayList.add(((SelectableOption) it8.next()).getType());
            }
            Set setI1 = d0.i1(arrayList);
            List<SelectableOption> transactionDirections = customisationParameters.getTransactionDirections();
            ArrayList arrayList2 = new ArrayList(zhm.w.t(transactionDirections, 10));
            Iterator<T> it9 = transactionDirections.iterator();
            while (it9.hasNext()) {
                arrayList2.add(((SelectableOption) it9.next()).getType());
            }
            Set setI12 = d0.i1(arrayList2);
            xVar.g3(new lzd.c(h0.f322473a, productSelectionZ));
            zVar.f3(setI1);
            zVar.g3(setI12);
            customisationSelectionCopy$default = CustomisationSelection.copy$default(customisationSelection, null, locale, bVar, false, null, null, productSelectionZ, setI1, setI12, 57, null);
        } else {
            customisationSelectionCopy$default = CustomisationSelection.copy$default(customisationSelection, null, locale, bVar, false, null, null, null, null, null, 505, null);
        }
        H2(yVar, new p(customisationParameters, customisationSelectionCopy$default, 0));
    }

    @Override // yji.l
    public final void T1(long j2) {
        yji.l.b1(this, this.f139164r.b3(), null, new t(this, null, 0), 3);
        z zVar = this.f139165s;
        yji.l.b1(this, zVar.b3(), null, new t(this, null, 1), 3);
        yji.l.b1(this, zVar.c3(), null, new t(this, null, 2), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.u;
    }
}
