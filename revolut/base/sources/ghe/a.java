package ghe;

import com.revolut.feature.tab.accounts.api.model.ProductAccount;
import com.revolut.feature.tab.accounts.api.model.spaces.ProductContext;
import com.revolut.feature.tab.accounts.api.model.spaces.SpaceContentModel;
import com.revolut.feature.tab.accounts.api.model.spaces.SubSpaceAccountItem;
import com.revolut.feature.tab.accounts.api.model.spaces.SubSpaceContentModel;
import com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import md6.b;
import md6.c;
import md6.e;
import md6.j;
import md6.m;
import md6.n;
import md6.o;
import zhm.a0;

/* JADX INFO: loaded from: classes8.dex */
public final class a {
    public static c a(List spaceContentModels) {
        ProductAccountDescriptor$Value productAccountDescriptor$Value;
        Intrinsics.checkNotNullParameter(spaceContentModels, "spaceContentModels");
        ArrayList<SubSpaceAccountItem> arrayList = new ArrayList();
        Iterator it8 = spaceContentModels.iterator();
        while (it8.hasNext()) {
            List list = ((SpaceContentModel) it8.next()).f89558c;
            ArrayList arrayList2 = new ArrayList();
            Iterator it9 = list.iterator();
            while (it9.hasNext()) {
                a0.x(((SubSpaceContentModel) it9.next()).getF(), arrayList2);
            }
            a0.x(arrayList2, arrayList);
        }
        ArrayList arrayList3 = new ArrayList();
        for (SubSpaceAccountItem subSpaceAccountItem : arrayList) {
            ProductAccount productAccount = subSpaceAccountItem.f89560b;
            ProductContext productContext = subSpaceAccountItem.f89559a;
            b bVar = null;
            if (!(productAccount instanceof ProductAccount.ValueItem)) {
                productAccount = null;
            }
            ProductAccount.ValueItem valueItem = (ProductAccount.ValueItem) productAccount;
            if (valueItem != null) {
                nie.c cVarB = com.revolut.feature.tab.accounts.api.model.a.b(valueItem, productContext.f89553a);
                if (!(cVarB instanceof ProductAccountDescriptor$Value)) {
                    cVarB = null;
                }
                productAccountDescriptor$Value = (ProductAccountDescriptor$Value) cVarB;
            } else {
                productAccountDescriptor$Value = null;
            }
            if (valueItem != null && productAccountDescriptor$Value != null) {
                Intrinsics.checkNotNullParameter(productAccountDescriptor$Value, "<this>");
                e eVarB = age.b.b(productAccountDescriptor$Value.getF89728b(), productAccountDescriptor$Value.getF89727a());
                j jVar = o.Companion;
                xi0.b currency = valueItem.getF89505g().getCurrency();
                jVar.getClass();
                bVar = new b(eVarB, currency != null ? new n(currency) : m.f204493a, age.b.d(productAccountDescriptor$Value), age.b.f(productAccountDescriptor$Value.getF89728b(), productContext.f89553a));
            }
            if (bVar != null) {
                arrayList3.add(bVar);
            }
        }
        return new c(arrayList3);
    }
}
