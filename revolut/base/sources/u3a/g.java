package u3a;

import android.os.Parcelable;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.apm.core.models.recipients.ApmIdentifier;
import com.revolut.feature.apm.core.models.recipients.PayIdBeneficiary;
import com.revolut.feature.freelancer.common.models.tax_hub.TaxHubVatSummary;
import com.revolut.feature.revolut_shop.api.domain.model.FiscalProfileDetails;
import ds6.g0;
import ip0.gu;
import ip0.ij;
import ip0.nb0;
import ip0.nk;
import ip0.pb0;
import ip0.s7;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import qv0.c;
import zhm.c0;
import zhm.f0;
import zhm.h0;
import zhm.r0;
import zhm.w;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class g implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f276843a;

    public /* synthetic */ g(int i) {
        this.f276843a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f276843a) {
            case 0:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                return f0.f322471a;
            case 1:
                List beneficiaries = (List) obj2;
                Intrinsics.checkNotNullParameter(beneficiaries, "beneficiaries");
                List<f5j.a> list = beneficiaries;
                ArrayList arrayList = new ArrayList(w.t(list, 10));
                for (f5j.a aVar : list) {
                    arrayList.add(new PayIdBeneficiary(new ApmIdentifier.Uuid(aVar.f132329a), n61.j.c(aVar), aVar));
                }
                return arrayList;
            case 2:
                List contacts = (List) obj2;
                Intrinsics.checkNotNullParameter(contacts, "contacts");
                return zi0.c.P(contacts, false, null, 3);
            case 3:
                yhm.r it8 = (yhm.r) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return new i((List) it8.f314201a, (zm3.b) it8.f314202b, (List) it8.f314203c);
            case 4:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                return r0.g();
            case 5:
                List paymentRecentRecipients = (List) obj2;
                Intrinsics.checkNotNullParameter(paymentRecentRecipients, "paymentRecentRecipients");
                ArrayList arrayListN = c0.N(paymentRecentRecipients, jq9.o.class);
                ArrayList arrayList2 = new ArrayList(w.t(arrayListN, 10));
                Iterator it9 = arrayListN.iterator();
                while (it9.hasNext()) {
                    arrayList2.add(((jq9.o) it9.next()).f177512b);
                }
                return arrayList2;
            case 6:
                List charities = (List) obj2;
                Intrinsics.checkNotNullParameter(charities, "charities");
                ArrayList arrayList3 = new ArrayList();
                for (Object obj3 : charities) {
                    if (((ba6.l) obj3).f13948q == ba6.j.AVAILABLE) {
                        arrayList3.add(obj3);
                    }
                }
                return arrayList3;
            case 7:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                return f0.f322471a;
            case 8:
                List it10 = (List) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                return n61.j.h(it10);
            case 9:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                return f0.f322471a;
            case 10:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                return f0.f322471a;
            case 11:
                od0.i it11 = (od0.i) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                return zi0.c.P(zhm.v.l(it11.g()), false, null, 3);
            case 12:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                return f0.f322471a;
            case 13:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                return f0.f322471a;
            case 14:
                String it12 = (String) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                String lowerCase = it12.toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                return jli.g.e(d0.F0(lowerCase).toString());
            case 15:
                yhm.r rVar = (yhm.r) obj2;
                Intrinsics.checkNotNullParameter(rVar, "<destruct>");
                return new i((List) rVar.f314201a, (zm3.b) rVar.f314202b, (List) rVar.f314203c);
            case 16:
                Intrinsics.checkNotNullParameter((Function0) obj2, "<unused var>");
                Intrinsics.checkNotNullParameter("MAINTENANCE_MARGIN_WIDGET_ID", "listId");
                int i = R$attr.uikit_dp0;
                nk nkVar = new nk();
                nkVar.f165524a = c.d.f249513a;
                nkVar.f165525b = null;
                nkVar.f165526c = null;
                nkVar.d = null;
                nkVar.e = null;
                nkVar.f = i;
                nkVar.f165527g = i;
                nkVar.f165528h = i;
                nkVar.i = i;
                yp0.b.r(nkVar, R$attr.uikit_dp16, 0, 0, 0, 14);
                return zhm.u.c(nkVar);
            case 17:
                FiscalProfileDetails it13 = (FiscalProfileDetails) obj2;
                Intrinsics.checkNotNullParameter(it13, "it");
                return it13.f84193b;
            case 18:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                aim.e eVarB = zhm.u.b();
                pb0 pb0VarB = nb0.b(pb0.Companion, "row", false, 0, false, 30);
                yp0.b.l(pb0VarB, 0, 0, 0, 0, null, false, 63);
                eVarB.add(pb0VarB);
                eVarB.add(new gu("subtotal_subheader", 0, 0, 30));
                s7 s7Var = new s7("subtotal", 0, 0, 0, 0, false, null, 126);
                yp0.b.l(s7Var, 0, 0, 0, 0, null, false, 63);
                eVarB.add(s7Var);
                Unit unit = Unit.f186387a;
                return new u3c.h(false, zhm.u.a(eVarB));
            case 19:
                u3k.e it14 = (u3k.e) obj2;
                Intrinsics.checkNotNullParameter(it14, "it");
                return it14.f276943a;
            case 20:
                Intrinsics.checkNotNullParameter((com.revolut.retail.retail_snackbar.mediator.f) obj2, "result");
                throw null;
            case 21:
                t3l.c result = (t3l.c) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                t3l.a aVar2 = result.f267821a;
                Parcelable parcelable = result.f267822b;
                int i2 = u3l.c.f276950a[aVar2.ordinal()];
                if (i2 == 1) {
                    return new com.revolut.retail.retail_snackbar.mediator.d(parcelable);
                }
                if (i2 == 2) {
                    return new com.revolut.retail.retail_snackbar.mediator.e(parcelable);
                }
                if (i2 == 3) {
                    return new com.revolut.retail.retail_snackbar.mediator.b(parcelable);
                }
                if (i2 == 4) {
                    return new com.revolut.retail.retail_snackbar.mediator.c(parcelable);
                }
                throw new NoWhenBranchMatchedException();
            case 22:
                x33.a pocket = (x33.a) obj2;
                Intrinsics.checkNotNullParameter(pocket, "pocket");
                return new s43.d(j6.a.q("SEARCHABLE_ITEM_ID_POCKET_CRYPTO_", pocket.f302630a.f65523a.f163147c), pocket);
            case 23:
                x33.a pocket2 = (x33.a) obj2;
                Intrinsics.checkNotNullParameter(pocket2, "pocket");
                return new s43.d(j6.a.q("SEARCHABLE_ITEM_ID_POCKET_FIAT_", pocket2.f302630a.f65523a.f163147c), pocket2);
            case 24:
                x33.a pocket3 = (x33.a) obj2;
                Intrinsics.checkNotNullParameter(pocket3, "pocket");
                return new s43.d(j6.a.q("SEARCHABLE_ITEM_ID_POCKET_PERSONAL_VAULT_", pocket3.f302630a.f65523a.f163147c), pocket3);
            case 25:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                return new s47.i((g0) pair.f186386b, (TaxHubVatSummary) ((od0.i) pair.f186385a).f224257a);
            case 26:
                Throwable it15 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it15, "it");
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, it15, h0Var);
                od0.i.Companion.getClass();
                return od0.i.f224256b;
            case 27:
                u4b.e update = (u4b.e) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return u4b.e.a(update, null, 0L, null, null, false, true, 31);
            case 28:
                u4b.e update2 = (u4b.e) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return u4b.e.a(update2, null, 0L, null, null, false, true, 31);
            default:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return new ij("cfd-withdrawal-footer-loading-id");
        }
    }
}
