package kg7;

import anf.k;
import aw0.o9;
import aw0.t0;
import com.revolut.core.model.faq.FaqNodeBase;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.feature.crypto.remittance.api.models.TransactionCryptoRemittanceAction;
import com.revolut.feature.crypto.withdraw.api.models.CryptoAddress;
import com.revolut.feature.crypto.withdraw.api.models.CryptoAddressDestinationTag;
import com.revolut.feature.shared.help_centre.api.faq.model.DisplayableFaqItem;
import com.revolut.feature.transactions.impl.R$string;
import com.revolut.revolut.feature_fourthline_impl.R;
import i7d.g;
import i7d.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import jf7.i1;
import jf7.j1;
import k71.q;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import pkf.a2;
import pkf.l1;
import pkf.y1;
import qv0.i;
import tof.a3;
import tof.r3;
import uf7.t;
import zhf.j;
import zhm.d0;
import zhm.f0;
import zhm.q0;
import zhm.w;

/* JADX INFO: loaded from: classes22.dex */
public final class e implements Function3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f183926a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f183927b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f183928c;

    public e(com.revolut.feature.shared.help_centre.impl.extension.b bVar, List list, Function1 function1) {
        this.f183926a = 2;
        this.f183927b = list;
        this.f183928c = function1;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        CellDetailsDelegate.Model model;
        Object node;
        int i = this.f183926a;
        t tVar = null;
        Object obj5 = this.f183928c;
        Object obj6 = this.f183927b;
        switch (i) {
            case 0:
                b transactionsContent = (b) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(transactionsContent, "transactionsContent");
                f fVar = (f) obj6;
                j1 j1Var = (j1) obj5;
                String str = j1Var.f173685a;
                List list = transactionsContent.f183921a;
                boolean z = transactionsContent.f183923c;
                if (list.isEmpty()) {
                    return f0.f322471a;
                }
                String strQ = j6.a.q("TRANSACTIONS_TITLE_LIST_ID_", str);
                TextClause textClause = new TextClause(j1Var.f173685a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                TextLocalisedClause textLocalisedClause = z ? new TextLocalisedClause(R.string.common_action_see_all, null, null, 14) : null;
                if (z) {
                    List list2 = j1Var.f173686b;
                    ArrayList arrayList = new ArrayList(w.t(list2, 10));
                    Iterator it8 = list2.iterator();
                    while (it8.hasNext()) {
                        arrayList.add(((i1) it8.next()).f173682a);
                    }
                    tVar = new t(str, d0.i1(arrayList));
                }
                return yp0.b.g(((k) fVar.f183930b).q(transactionsContent.f183921a, transactionsContent.f183922b, new thf.f(false, 3)), xf7.a.a(strQ, textClause, textLocalisedClause, tVar), null, 0, 0, 126);
            case 1:
                CryptoAddress beneficiary = (CryptoAddress) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(beneficiary, "beneficiary");
                a3 transaction = (a3) obj5;
                a2 a2Var = ((y1) obj6).f237161n;
                wk5.a aVar = beneficiary.f71063h;
                a2Var.getClass();
                sj5.b bVar = a2Var.f237019a;
                Intrinsics.checkNotNullParameter(transaction, "transaction");
                r3 r3Var = transaction.V;
                dj0.d dVar = transaction.k;
                String str2 = r3Var != null ? r3Var.f273024b : null;
                CellDetailsActionDelegate.Model modelA = (aVar == null || str2 == null) ? null : l1.a("ID_EXTRAS_CRYPTO_WITHDRAW_TRANSACTION_HASH", R$string.transaction_details_cryptowithdrawal_transaction_hash, ((hk5.b) bVar).a(str2), new TransactionCryptoRemittanceAction.TransactionHashAction(dVar.f115083b, aVar, str2));
                xi0.b currency = dVar.f115083b;
                String str3 = beneficiary.f71061c;
                Intrinsics.checkNotNullParameter(currency, "currency");
                CellDetailsActionDelegate.Model modelA2 = (aVar == null || str3 == null) ? null : l1.a("ID_EXTRAS_CRYPTO_WITHDRAW_ADDRESS", R$string.transaction_details_cryptowithdrawal_wallet_address, ((hk5.b) bVar).a(str3), new TransactionCryptoRemittanceAction.AddressAction(currency, aVar, str3));
                CryptoAddressDestinationTag destinationTag = beneficiary.d;
                xi0.b currency2 = dVar.f115083b;
                Intrinsics.checkNotNullParameter(destinationTag, "destinationTag");
                Intrinsics.checkNotNullParameter(currency2, "currency");
                if (destinationTag instanceof CryptoAddressDestinationTag.Optional) {
                    t0 t0Var = new t0((Clause) new TextLocalisedClause(a2Var.f237020b.a(currency2), null, null, 14), (Image) null, 0, false, 30);
                    String str4 = ((CryptoAddressDestinationTag.Optional) destinationTag).f71071a;
                    if (str4 == null) {
                        str4 = "-";
                    }
                    model = new CellDetailsDelegate.Model("ID_EXTRAS_CRYPTO_WITHDRAW_DESTINATION_TAG", t0Var, new TextClause(str4, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, null, null, 0, null, false, false, null, null, 30712);
                } else {
                    model = null;
                }
                i[] elements = {modelA, modelA2, model, aVar != null ? new CellDetailsDelegate.Model("ID_EXTRAS_CRYPTO_WITHDRAW_NETWORK", new t0((Clause) new TextLocalisedClause(R$string.transaction_details_cryptowithdrawal_network, null, null, 14), (Image) null, 0, false, 30), ((ik5.a) a2Var.f237021c).b(aVar, true, null), null, null, null, null, 0, null, false, false, null, null, 30712) : null};
                Intrinsics.checkNotNullParameter(elements, "elements");
                List listL = kotlin.collections.d.L(elements);
                yp0.b.k(listL, 0, 0, 0, 0, 31);
                return listL;
            case 2:
                List faqNodes = (List) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(faqNodes, "faqNodes");
                List<h> list3 = (List) obj6;
                List list4 = faqNodes;
                int iB = q0.b(w.t(list4, 10));
                if (iB < 16) {
                    iB = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iB);
                for (Object obj7 : list4) {
                    linkedHashMap.put(((FaqNodeBase) obj7).getF51434a(), obj7);
                }
                ArrayList<DisplayableFaqItem> arrayList2 = new ArrayList();
                for (h hVar : list3) {
                    if (hVar instanceof i7d.f) {
                        i7d.f fVar2 = (i7d.f) hVar;
                        TextClause textClause2 = fVar2.f159268a;
                        String str5 = fVar2.f159269b;
                        node = new DisplayableFaqItem.DeepLink(textClause2, str5, str5);
                    } else {
                        if (!(hVar instanceof g)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        FaqNodeBase faqNodeBase = (FaqNodeBase) linkedHashMap.get(((g) hVar).f159270a);
                        node = faqNodeBase == null ? null : new DisplayableFaqItem.Node(faqNodeBase);
                    }
                    if (node != null) {
                        arrayList2.add(node);
                    }
                }
                ArrayList arrayListS = t61.a.s("<this>", arrayList2);
                ArrayList arrayList3 = new ArrayList();
                for (DisplayableFaqItem displayableFaqItem : arrayList2) {
                    if (displayableFaqItem instanceof DisplayableFaqItem.DeepLink) {
                        arrayListS.add(displayableFaqItem);
                    } else {
                        if (!(displayableFaqItem instanceof DisplayableFaqItem.Node)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        arrayList3.clear();
                        t7d.b.a(((DisplayableFaqItem.Node) displayableFaqItem).f86139a, arrayList3);
                        FaqNodeBase faqNodeBase2 = (FaqNodeBase) d0.d0(arrayList3);
                        if (faqNodeBase2 != null) {
                            Intrinsics.checkNotNullParameter(faqNodeBase2, "<this>");
                            arrayListS.add(new DisplayableFaqItem.Node(faqNodeBase2));
                        }
                    }
                }
                if (arrayListS.size() == 1) {
                    DisplayableFaqItem displayableFaqItem2 = (DisplayableFaqItem) d0.b0(arrayListS);
                    if (!(displayableFaqItem2 instanceof DisplayableFaqItem.DeepLink)) {
                        if (!(displayableFaqItem2 instanceof DisplayableFaqItem.Node)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        FaqNodeBase faqNodeBase3 = ((DisplayableFaqItem.Node) displayableFaqItem2).f86139a;
                        if (t7d.b.e(faqNodeBase3)) {
                            List<FaqNodeBase> listB = t7d.b.b(arrayList3, t7d.b.c(faqNodeBase3));
                            arrayListS = new ArrayList(w.t(listB, 10));
                            for (FaqNodeBase faqNodeBase4 : listB) {
                                Intrinsics.checkNotNullParameter(faqNodeBase4, "<this>");
                                arrayListS.add(new DisplayableFaqItem.Node(faqNodeBase4));
                            }
                        }
                    }
                }
                return (List) ((Function1) obj5).invoke(arrayListS);
            default:
                List content = (List) obj2;
                ((Boolean) obj3).getClass();
                zhf.g gVar = (zhf.g) obj6;
                Intrinsics.checkNotNullParameter(content, "content");
                a3 a3Var = (a3) d0.d0(content);
                return a3Var == null ? new zhf.h(gVar.c3().f310974a) : new j(gVar.c3().f310974a, (q) obj5, a3Var);
        }
    }

    public /* synthetic */ e(Object obj2, Object obj3, int i) {
        this.f183926a = i;
        this.f183927b = obj2;
        this.f183928c = obj3;
    }
}
