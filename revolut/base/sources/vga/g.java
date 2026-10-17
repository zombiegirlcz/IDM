package vga;

import android.os.Parcelable;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.data.model.Data;
import com.revolut.feature.backgroundpicker.api.model.BackgroundKey;
import com.revolut.feature.rev_points.models.RevPointsTransaction;
import com.revolut.feature.rewards.api.model.rent_and_bills.RentAndBillsConfigurations;
import com.revolut.feature.tab.accounts.api.model.AccountContent;
import com.revolut.feature.tab.accounts.api.model.ProductAccount;
import com.revolut.feature.tab.accounts.api.model.ProductAccountMetadata;
import com.revolut.feature.tab.accounts.api.model.spaces.SpaceContentModel;
import com.revolut.feature.tab.accounts.api.model.spaces.SubSpaceContentModel;
import com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value;
import com.revolut.feature.tab.accounts.models.ProductAccountId;
import com.revolut.feature.tab.accounts.models.ProductId;
import com.revolut.feature.unified_transactions.api.filter.UnifiedTransactionsFilter;
import em2.i;
import ip0.nb0;
import ip0.pb0;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import m1c.r1;
import od0.h;
import tof.a3;
import vgc.p;
import vge.m0;
import vge.w1;
import vge.x1;
import vgf.r;
import vgf.s;
import zhm.a0;
import zhm.d0;
import zhm.f0;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class g implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f288813a;

    public /* synthetic */ g(int i) {
        this.f288813a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        md6.d dVar;
        i iVar;
        List list;
        switch (this.f288813a) {
            case 0:
                hha.d it8 = (hha.d) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return it8.f152287a;
            case 1:
                RentAndBillsConfigurations configurations = (RentAndBillsConfigurations) obj2;
                Intrinsics.checkNotNullParameter(configurations, "configurations");
                return Boolean.valueOf((configurations.f84777a == null && configurations.f84778b == null) ? false : true);
            case 2:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                return new Pair((String) pair.f186385a, ((a3) pair.f186386b).f272581b);
            case 3:
                Pair pair2 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair2, "<destruct>");
                return ((a3) pair2.f186386b).f272581b;
            case 4:
                a3 transaction = (a3) obj2;
                Intrinsics.checkNotNullParameter(transaction, "transaction");
                return Boolean.valueOf(transaction.N1.f115082a < 0);
            case 5:
                a3 transaction2 = (a3) obj2;
                Intrinsics.checkNotNullParameter(transaction2, "transaction");
                ibd.i iVar2 = transaction2.C;
                if (iVar2 != null) {
                    return new Pair(iVar2.getId(), transaction2);
                }
                return null;
            case 6:
                r1 content = (r1) obj2;
                Intrinsics.checkNotNullParameter(content, "content");
                return content.f201449a;
            case 7:
                RevPointsTransaction transaction3 = (RevPointsTransaction) obj2;
                Intrinsics.checkNotNullParameter(transaction3, "transaction");
                return Boolean.valueOf(p.d.contains(transaction3.f84055b));
            case 8:
                Data it9 = (Data) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return new Pair(it9.getContent(), it9.getError());
            case 9:
                AccountContent accountContent = (AccountContent) obj2;
                Intrinsics.checkNotNullParameter(accountContent, "accountContent");
                return a0.d.s("productId=", accountContent.f89474a.getId(), ",accountId=", accountContent.f89475b.getF89504c().f89729a);
            case 10:
                Data params = (Data) obj2;
                Intrinsics.checkNotNullParameter(params, "params");
                Object content2 = params.getContent();
                Boolean boolValueOf = Boolean.valueOf(params.getLoading());
                if (params.getContent() != null) {
                    boolValueOf = null;
                }
                return new Pair(content2, boolValueOf);
            case 11:
                List it10 = (List) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                return m0.e(it10);
            case 12:
                List it11 = (List) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                ArrayList arrayList = new ArrayList();
                Iterator it12 = it11.iterator();
                while (it12.hasNext()) {
                    a0.x(((SpaceContentModel) it12.next()).f89558c, arrayList);
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it13 = arrayList.iterator();
                while (it13.hasNext()) {
                    a0.x(((SubSpaceContentModel) it13.next()).getF(), arrayList2);
                }
                return m0.e(arrayList2);
            case 13:
                List<AccountContent> accountsContent = (List) obj2;
                Intrinsics.checkNotNullParameter(accountsContent, "accountsContent");
                HashSet hashSet = new HashSet();
                ArrayList arrayList3 = new ArrayList();
                for (AccountContent accountContent2 : accountsContent) {
                    ProductAccount.ValueItem valueItem = accountContent2.f89475b;
                    String str = valueItem.getF89504c().f89729a;
                    if (hashSet.contains(str)) {
                        iVar = null;
                    } else {
                        hashSet.add(str);
                        Clause clause = valueItem.getF().d;
                        if (clause == null) {
                            clause = valueItem.getE().f89478b;
                        }
                        BackgroundKey.Companion companion = BackgroundKey.INSTANCE;
                        ProductId productId = accountContent2.f89474a;
                        ProductAccountId f89504c = valueItem.getF89504c();
                        ProductAccountMetadata f89505g = valueItem.getF89505g();
                        Intrinsics.checkNotNullParameter(valueItem, "<this>");
                        if (valueItem instanceof ProductAccount.ValueItem.Discover) {
                            dVar = md6.d.DISCOVERY;
                        } else {
                            if (!(valueItem instanceof ProductAccount.ValueItem.Main)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            dVar = md6.d.OPENED;
                        }
                        iVar = new i(clause, age.b.a(companion, productId, f89504c, f89505g, dVar), accountContent2.f89476c.f89471a, valueItem.getE().f89477a, null);
                    }
                    if (iVar != null) {
                        arrayList3.add(iVar);
                    }
                }
                return arrayList3;
            case 14:
                String it14 = (String) obj2;
                Intrinsics.checkNotNullParameter(it14, "it");
                x1.Companion.getClass();
                Pair pairA = w1.a(it14);
                if (pairA == null) {
                    return null;
                }
                return new ProductAccountDescriptor$Value.Main((ProductAccountId) pairA.f186386b, (ProductId) pairA.f186385a);
            case 15:
                ProductAccount.ValueItem productAccount = (ProductAccount.ValueItem) obj2;
                Intrinsics.checkNotNullParameter(productAccount, "productAccount");
                return productAccount.getF89505g();
            case 16:
                Pair it15 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(it15, "it");
                return (ProductAccountDescriptor$Value) it15.f186385a;
            case 17:
                r update = (r) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return r.a(update, null, null, null, null, null, null, false, false, false, false, null, null, 4091);
            case 18:
                yhm.r rVar = (yhm.r) obj2;
                Intrinsics.checkNotNullParameter(rVar, "<destruct>");
                List list2 = (List) rVar.f314201a;
                vgf.g gVar = (vgf.g) rVar.f314202b;
                return new kkg.a(list2, gVar.f289095a, (whf.a) rVar.f314203c, gVar.f289096b);
            case 19:
                r update2 = (r) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return r.a(update2, null, new Data(null, null, false, 7, null), null, null, null, null, false, false, false, false, null, null, 4093);
            case 20:
                s it16 = (s) obj2;
                Intrinsics.checkNotNullParameter(it16, "it");
                return it16.f289131b;
            case 21:
                Pair pair3 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair3, "<destruct>");
                return (UnifiedTransactionsFilter) pair3.f186385a;
            case 22:
                r it17 = (r) obj2;
                Intrinsics.checkNotNullParameter(it17, "it");
                kkg.a aVar = (kkg.a) it17.f289122a.getContent();
                if (aVar == null || (list = aVar.f185062a) == null) {
                    return null;
                }
                return com.revolut.feature.unified_transactions.models.a.a(list);
            case 23:
                List transactions = (List) obj2;
                Intrinsics.checkNotNullParameter(transactions, "transactions");
                return (a3) d0.d0(transactions);
            case 24:
                return r.a((r) obj2, null, null, null, null, null, null, false, true, false, false, null, null, 3967);
            case 25:
                return r.a((r) obj2, null, null, null, null, null, null, false, true, false, false, null, null, 3967);
            case 26:
                Function0 getDefaultLoadingItems = (Function0) obj2;
                Intrinsics.checkNotNullParameter(getDefaultLoadingItems, "getDefaultLoadingItems");
                return (List) getDefaultLoadingItems.invoke();
            case 27:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return f0.f322471a;
            case 28:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                aim.e eVarB = u.b();
                eVarB.add(new ListSubheaderDelegate.Model("YOUR_GIFT_CARDS_SUB_HEADER_LIST_ID", (Image) null, (Clause) null, (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, true, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65278));
                IntRange intRange = new IntRange(0, 3, 1);
                ArrayList arrayList4 = new ArrayList(w.t(intRange, 10));
                vim.f it18 = intRange.iterator();
                while (it18.f289625c) {
                    arrayList4.add(nb0.b(pb0.Companion, a0.d.n("YOUR_GIFT_CARDS_LOADING_ITEM_LIST_ID", it18.nextInt()), false, 0, false, 30));
                }
                yp0.b.k(arrayList4, 0, 0, 0, 0, 31);
                eVarB.addAll(arrayList4);
                return u.a(eVarB);
            default:
                lha.d it19 = (lha.d) obj2;
                Intrinsics.checkNotNullParameter(it19, "it");
                od0.i.Companion.getClass();
                return h.a(it19);
        }
    }

    public /* synthetic */ g(Object obj2, int i) {
        this.f288813a = i;
    }
}
