package pyd;

import com.revolut.feature.statements.api.models.CustomisationParameters;
import com.revolut.feature.statements.api.models.Product;
import com.revolut.feature.statements.api.models.ProductElement;
import com.revolut.feature.statements.api.models.SelectableOption;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import oyd.d;
import zhm.f0;
import zhm.w;

/* JADX INFO: loaded from: classes7.dex */
public abstract class a {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v0, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v0, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v2, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.util.ArrayList] */
    public static final CustomisationParameters a(oyd.d dVar) {
        ?? arrayList;
        ?? arrayList2;
        ?? arrayList3;
        ?? arrayList4;
        String str;
        dj0.d dVarO;
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        Locale localeForLanguageTag = Locale.forLanguageTag(dVar.getLanguage());
        Intrinsics.checkNotNullExpressionValue(localeForLanguageTag, "forLanguageTag(...)");
        xi0.a aVar = xi0.b.Companion;
        String currency = dVar.getCurrency();
        aVar.getClass();
        xi0.b bVarA = xi0.a.a(currency);
        List<d.a> accounts = dVar.getAccounts();
        if (accounts != null) {
            arrayList = new ArrayList();
            for (d.a aVar2 : accounts) {
                String productType = aVar2.getProductType();
                String label = aVar2.getLabel();
                String icon = aVar2.getIcon();
                List<d.a.C1269a> elements = aVar2.getElements();
                if (elements != null) {
                    arrayList4 = new ArrayList();
                    for (d.a.C1269a c1269a : elements) {
                        String id10 = c1269a.getId();
                        String type = c1269a.getType();
                        String label2 = c1269a.getLabel();
                        String icon2 = c1269a.getIcon();
                        String backgroundColor = c1269a.getBackgroundColor();
                        jo3.a balance = c1269a.getBalance();
                        if (balance != null) {
                            dVarO = mo3.a.o(balance);
                            str = null;
                        } else {
                            str = null;
                            dVarO = null;
                        }
                        String ownerId = c1269a.getOwnerId();
                        String currency2 = c1269a.getCurrency();
                        if (currency2 == null) {
                            jo3.a balance2 = c1269a.getBalance();
                            currency2 = balance2 != null ? balance2.getCurrency() : str;
                        }
                        arrayList4.add(new ProductElement(id10, type, label2, icon2, backgroundColor, ownerId, dVarO, currency2));
                    }
                } else {
                    arrayList4 = f0.f322471a;
                }
                arrayList.add(new Product(productType, label, icon, arrayList4));
            }
        } else {
            arrayList = f0.f322471a;
        }
        List transactionDirections = dVar.getTransactionDirections();
        if (transactionDirections != null) {
            List<d.b> list = transactionDirections;
            arrayList2 = new ArrayList(w.t(list, 10));
            for (d.b bVar : list) {
                arrayList2.add(new SelectableOption(bVar.getLabel(), bVar.getType(), bVar.getIcon()));
            }
        } else {
            arrayList2 = f0.f322471a;
        }
        List transactionCategories = dVar.getTransactionCategories();
        if (transactionCategories != null) {
            List<d.b> list2 = transactionCategories;
            arrayList3 = new ArrayList(w.t(list2, 10));
            for (d.b bVar2 : list2) {
                arrayList3.add(new SelectableOption(bVar2.getLabel(), bVar2.getType(), bVar2.getIcon()));
            }
        } else {
            arrayList3 = f0.f322471a;
        }
        return new CustomisationParameters(localeForLanguageTag, bVarA, arrayList, arrayList2, arrayList3);
    }
}
