package n8i;

import com.revolut.data.model.Data;
import com.revolut.domain.models.moneyrequest.MoneyRequest;
import com.revolut.feature.cash_topup.api.models.BarcodeDetails;
import com.revolut.feature.hyper_text.model.HyperTextTarget;
import com.revolut.feature.hyper_text.ui.HyperTextClickData;
import com.revolut.feature.revolutpay.promoted_merchants.models.merchants.MerchantCategoryDetails;
import com.revolut.retail.core.navigation.CompositeCommand;
import com.revolut.retail.operation_status.modal_status.StatusViewConfiguration;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ta1.f;
import tof.e9;
import tof.fc;
import tof.i7;
import tof.oa;
import tof.q7;
import tof.qb;
import tof.v6;
import tof.va;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class q0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f213464a;

    public /* synthetic */ q0(int i) {
        this.f213464a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        s6i.e eVar;
        int i = this.f213464a;
        f.c cVar = f.c.f269083a;
        od0.i iVar = od0.i.f224256b;
        i7.u uVar = i7.u.f272827a;
        z = false;
        boolean z = false;
        switch (i) {
            case 0:
                k kVar = (k) ((q) obj2).f213461a.getContent();
                if (kVar == null || (eVar = kVar.f213439a) == null) {
                    return null;
                }
                return eVar.e;
            case 1:
                MoneyRequest it8 = (MoneyRequest) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return new n8k.h(it8);
            case 2:
                ea1.b.a("Waiting for the BLE FW to be installed...", fa1.k.INFO);
                return Unit.f186387a;
            case 3:
                ta1.c it9 = (ta1.c) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return Boolean.valueOf(Intrinsics.f(it9.f269080b, cVar));
            case 4:
                ea1.b.a("Waiting for the first init done...", fa1.k.INFO);
                return Unit.f186387a;
            case 5:
                ta1.c it10 = (ta1.c) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                return Boolean.valueOf(Intrinsics.f(it10.f269080b, cVar));
            case 6:
                Intrinsics.checkNotNullParameter((CompositeCommand) obj2, "it");
                return Boolean.TRUE;
            case 7:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                i7 i7Var = (i7) pair.f186385a;
                List list = (List) pair.f186386b;
                ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                Iterator it11 = list.iterator();
                while (it11.hasNext()) {
                    arrayList.add(((io3.d) it11.next()).f163145a);
                }
                return fc.a(i7Var, new va(zhm.d0.i1(arrayList)));
            case 8:
                k3l.j it12 = (k3l.j) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                return Boolean.valueOf(it12.a() instanceof StatusViewConfiguration.Success);
            case 9:
                rp0.p it13 = (rp0.p) obj2;
                Intrinsics.checkNotNullParameter(it13, "it");
                return Boolean.valueOf(it13 == rp0.p.USER);
            case 10:
                od0.i it14 = (od0.i) obj2;
                Intrinsics.checkNotNullParameter(it14, "it");
                BarcodeDetails barcodeDetails = (BarcodeDetails) it14.g();
                if (barcodeDetails != null && barcodeDetails.f65585b.isAfterNow()) {
                    return it14;
                }
                od0.i.Companion.getClass();
                return iVar;
            case 11:
                od0.i it15 = (od0.i) obj2;
                Intrinsics.checkNotNullParameter(it15, "it");
                BarcodeDetails barcodeDetails2 = (BarcodeDetails) it15.g();
                if (barcodeDetails2 != null && barcodeDetails2.f65585b.isAfterNow()) {
                    return it15;
                }
                od0.i.Companion.getClass();
                return iVar;
            case 12:
                m1c.z it16 = (m1c.z) obj2;
                Intrinsics.checkNotNullParameter(it16, "it");
                od0.i.Companion.getClass();
                return od0.h.a(it16);
            case 13:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return zhm.f0.f322471a;
            case 14:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return iii.c.c(3);
            case 15:
                List it17 = (List) obj2;
                Intrinsics.checkNotNullParameter(it17, "it");
                return Boolean.valueOf(!it17.isEmpty());
            case 16:
                Data it18 = (Data) obj2;
                Intrinsics.checkNotNullParameter(it18, "it");
                return Boolean.valueOf(!it18.getLoading());
            case 17:
                MerchantCategoryDetails it19 = (MerchantCategoryDetails) obj2;
                Intrinsics.checkNotNullParameter(it19, "it");
                return it19.f84689b;
            case 18:
                nci.k update = (nci.k) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return nci.k.a(update, null, null, true, 3);
            case 19:
                String it20 = (String) obj2;
                Intrinsics.checkNotNullParameter(it20, "it");
                return new nci.h(it20);
            case 20:
                File it21 = (File) obj2;
                Intrinsics.checkNotNullParameter(it21, "it");
                return new Data(new nci.i(it21), null, false, 6, null);
            case 21:
                Throwable it22 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it22, "it");
                return new Data(null, it22, false, 5, null);
            case 22:
                Pair pair2 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair2, "<destruct>");
                List list2 = (List) pair2.f186385a;
                List list3 = (List) pair2.f186386b;
                if (list2.isEmpty() && list3.isEmpty()) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 23:
                List pockets = (List) obj2;
                Intrinsics.checkNotNullParameter(pockets, "pockets");
                i7.c cVar2 = i7.Companion;
                qb qbVar = new qb(zhm.u.c(v6.COMPLETED));
                HashSet hashSet = new HashSet();
                Iterator it23 = pockets.iterator();
                while (it23.hasNext()) {
                    hashSet.add(((io3.d) it23.next()).f163145a);
                }
                i7[] i7VarArr = {uVar, qbVar, new va(hashSet)};
                cVar2.getClass();
                return i7.c.a(i7VarArr);
            case 24:
                List pockets2 = (List) obj2;
                Intrinsics.checkNotNullParameter(pockets2, "pockets");
                i7.c cVar3 = i7.Companion;
                qb qbVar2 = new qb(zhm.u.c(v6.COMPLETED));
                HashSet hashSet2 = new HashSet();
                Iterator it24 = pockets2.iterator();
                while (it24.hasNext()) {
                    hashSet2.add(((io3.d) it24.next()).f163145a);
                }
                i7[] i7VarArr2 = {uVar, qbVar2, new va(hashSet2)};
                cVar3.getClass();
                q7 q7VarA = i7.c.a(i7VarArr2);
                i7.c cVar4 = i7.Companion;
                i7[] i7VarArr3 = {new e9("Reward for"), i7.x.f272829a};
                cVar4.getClass();
                oa oaVarB = i7.c.b(i7VarArr3);
                v6 v6Var = v6.COMPLETED;
                return i7.c.b(q7VarA, i7.c.a(oaVarB, new qb(zhm.u.c(v6Var))), i7.c.a(new e9("Voucher Gift Cashback"), new qb(zhm.u.c(v6Var))));
            case 25:
                Object[] transactionFiltersArray = (Object[]) obj2;
                Intrinsics.checkNotNullParameter(transactionFiltersArray, "transactionFiltersArray");
                Intrinsics.checkNotNullParameter(transactionFiltersArray, "<this>");
                Intrinsics.checkNotNullParameter(i7.class, "klass");
                ArrayList destination = new ArrayList();
                Intrinsics.checkNotNullParameter(transactionFiltersArray, "<this>");
                Intrinsics.checkNotNullParameter(destination, "destination");
                Intrinsics.checkNotNullParameter(i7.class, "klass");
                for (Object obj3 : transactionFiltersArray) {
                    if (i7.class.isInstance(obj3)) {
                        destination.add(obj3);
                    }
                }
                return new oa(zhm.d0.d1(destination));
            case 26:
                return Unit.f186387a;
            case 27:
                nd7.a range = (nd7.a) obj2;
                Intrinsics.checkNotNullParameter(range, "range");
                return Integer.valueOf(range.f214329a);
            case 28:
                nd7.a range2 = (nd7.a) obj2;
                Intrinsics.checkNotNullParameter(range2, "range");
                return Integer.valueOf(-(range2.f214330b - range2.f214329a));
            default:
                HyperTextTarget target = (HyperTextTarget) obj2;
                Intrinsics.checkNotNullParameter(target, "target");
                return new HyperTextClickData(target);
        }
    }
}
