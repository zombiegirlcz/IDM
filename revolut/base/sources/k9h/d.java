package k9h;

import com.google.android.gms.common.util.GmsVersion;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.data.model.Data;
import com.revolut.feature.apm.core.models.recipients.ApmRecipient;
import com.revolut.feature.apm.core.models.recipients.PayIdBeneficiary;
import com.revolut.feature.revolutpay.promoted_merchants.models.merchants.PromotedMerchant;
import com.revolut.feature.subscriptions.impl.label.SubscriptionLabelScreen;
import com.revolut.retail.core.navigation.NaviCommand;
import ecd.r4;
import ip0.gu;
import ip0.nb0;
import ip0.pb0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jq9.k;
import jq9.l;
import kbi.j;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import kotlin.text.a0;
import uam.i;
import xzg.o;
import ybd.m0;
import ybd.o0;
import zhm.d0;
import zhm.f0;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class d implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f182337a;

    public /* synthetic */ d(int i) {
        this.f182337a = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0, types: [java.util.List] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f182337a) {
            case 0:
                List it8 = (List) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                xzg.d dVar = (xzg.d) d0.d0(it8);
                if (dVar == null) {
                    return null;
                }
                List list = dVar.f309981j;
                objV0 = list != null ? d0.V0(list, 2) : null;
                String key = dVar.f309976a;
                o assetType = dVar.f309977b;
                String title = dVar.f309978c;
                String str = dVar.d;
                String str2 = dVar.e;
                String str3 = dVar.f;
                String str4 = dVar.f309979g;
                String str5 = dVar.f309980h;
                List list2 = dVar.i;
                String str6 = dVar.k;
                String str7 = dVar.f309982l;
                Intrinsics.checkNotNullParameter(key, "key");
                Intrinsics.checkNotNullParameter(assetType, "assetType");
                Intrinsics.checkNotNullParameter(title, "title");
                return new xzg.d(key, title, str, str2, str3, str4, str5, str6, str7, list2, objV0, assetType);
            case 1:
                LargeActionButtonDelegate.Model it9 = (LargeActionButtonDelegate.Model) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return Boolean.valueOf(Intrinsics.f(it9.f52613a, "COLLECTIONS_INFO_DIALOG_ACTION_BUTTON"));
            case 2:
                k0h.f it10 = (k0h.f) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                if (it10 instanceof k0h.e) {
                    return (k0h.e) it10;
                }
                return null;
            case 3:
                ListSubheaderDelegate.Model it11 = (ListSubheaderDelegate.Model) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                return Boolean.valueOf(a0.H(it11.f52708a, "COLLECTIONS_SUBHEADER_LIST_ID_", false));
            case 4:
                k0h.f it12 = (k0h.f) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                if (it12 instanceof k0h.d) {
                    return (k0h.d) it12;
                }
                return null;
            case 5:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                gu guVar = new gu("LIST_ID_RECENTS_HEADER_LOADING", 0, 0, 30);
                pb0 pb0VarB = nb0.b(pb0.Companion, "LIST_ID_RECENTS_LIST_LOADING", false, 0, false, 30);
                yp0.b.l(pb0VarB, 0, 0, 0, 0, null, false, 63);
                return v.k(guVar, pb0VarB);
            case 6:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                pb0 pb0Var = new pb0("LIST_ID_TRANSACTIONS_LIST_LOADING");
                yp0.b.l(pb0Var, 0, 0, 0, 0, null, false, 63);
                return u.c(pb0Var);
            case 7:
                List<k> list3 = (List) obj2;
                Intrinsics.checkNotNullParameter(list3, "list");
                ArrayList arrayList = new ArrayList();
                for (k kVar : list3) {
                    l lVar = kVar instanceof l ? (l) kVar : null;
                    ApmRecipient apmRecipient = lVar != null ? lVar.f177506b : null;
                    PayIdBeneficiary payIdBeneficiary = apmRecipient instanceof PayIdBeneficiary ? (PayIdBeneficiary) apmRecipient : null;
                    if (payIdBeneficiary != null) {
                        arrayList.add(payIdBeneficiary);
                    }
                }
                return arrayList;
            case 8:
                InputTextDelegate.TextData it13 = (InputTextDelegate.TextData) obj2;
                KProperty[] kPropertyArr = SubscriptionLabelScreen.R;
                Intrinsics.checkNotNullParameter(it13, "it");
                return it13.f52598b.toString();
            case 9:
                return kaf.a.a((kaf.a) obj2, true);
            case 10:
                return kaf.a.a((kaf.a) obj2, false);
            case 11:
                Data it14 = (Data) obj2;
                Intrinsics.checkNotNullParameter(it14, "it");
                n61.o oVar = (n61.o) it14.getContent();
                return oVar == null ? new n61.o(false, false) : oVar;
            case 12:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return kbb.f.a();
            case 13:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return null;
            case 14:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return null;
            case 15:
                kbi.f update = (kbi.f) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return kbi.f.a(update, j.f182604a, update.f182598a instanceof j ? update.f182599b : "", null, 12);
            case 16:
                Boolean it15 = (Boolean) obj2;
                Intrinsics.checkNotNullParameter(it15, "it");
                return Boolean.valueOf(!it15.booleanValue());
            case 17:
                Intrinsics.checkNotNullParameter((NaviCommand) obj2, "it");
                return Boolean.TRUE;
            case 18:
                List it16 = (List) obj2;
                Intrinsics.checkNotNullParameter(it16, "it");
                return Boolean.valueOf(!it16.isEmpty());
            case 19:
                Data data = (Data) obj2;
                Intrinsics.checkNotNullParameter(data, "data");
                pd5.d dVar2 = (pd5.d) data.getContent();
                if (dVar2 == null) {
                    return f0.f322471a;
                }
                ArrayList arrayList2 = dVar2.f235097c;
                ArrayList arrayList3 = new ArrayList();
                for (Object obj3 : arrayList2) {
                    if (!((pd5.g) obj3).f.isEmpty()) {
                        arrayList3.add(obj3);
                    }
                }
                ArrayList arrayList4 = new ArrayList(w.t(arrayList3, 10));
                Iterator it17 = arrayList3.iterator();
                while (it17.hasNext()) {
                    arrayList4.add(((pd5.g) it17.next()).f235102a);
                }
                return arrayList4;
            case 20:
                int i = kc0.c.z0;
                Intrinsics.checkNotNullParameter((zam.a) obj2, "it");
                return Unit.f186387a;
            case 21:
                Iterable CameraConfiguration = (Iterable) obj2;
                int i2 = kc0.c.z0;
                Intrinsics.checkNotNullParameter(CameraConfiguration, "$this$CameraConfiguration");
                Iterator it18 = CameraConfiguration.iterator();
                if (it18.hasNext()) {
                    objV0 = it18.next();
                    if (it18.hasNext()) {
                        int iAbs = Math.abs(GmsVersion.VERSION_LONGHORN - ((i) objV0).a());
                        do {
                            Object next = it18.next();
                            int iAbs2 = Math.abs(GmsVersion.VERSION_LONGHORN - ((i) next).a());
                            if (iAbs > iAbs2) {
                                objV0 = next;
                                iAbs = iAbs2;
                            }
                        } while (it18.hasNext());
                    }
                }
                return (i) objV0;
            case 22:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                return Boolean.valueOf(((Boolean) pair.f186385a).booleanValue() && ((Boolean) pair.f186386b).booleanValue());
            case 23:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                return Boolean.FALSE;
            case 24:
                lk0.e lowerPage = (lk0.e) obj2;
                Intrinsics.checkNotNullParameter(lowerPage, "lowerPage");
                ucc.g gVar = (ucc.g) lowerPage.f196172b;
                if (lowerPage.f196171a.size() < 20) {
                    gVar.getClass();
                    return null;
                }
                Integer num = gVar.d;
                return new ucc.g(Integer.valueOf((num != null ? num.intValue() : 0) + 20), gVar.f279027b, gVar.f279028c, gVar.f279026a);
            case 25:
                Intrinsics.checkNotNullParameter((lk0.e) obj2, "it");
                return null;
            case 26:
                PromotedMerchant it19 = (PromotedMerchant) obj2;
                Intrinsics.checkNotNullParameter(it19, "it");
                return it19;
            case 27:
                return o0.INSTANCE.serializer();
            case 28:
                return m0.INSTANCE.serializer();
            default:
                return r4.INSTANCE.serializer();
        }
    }

    public /* synthetic */ d(kbb.f fVar) {
        this.f182337a = 12;
    }
}
