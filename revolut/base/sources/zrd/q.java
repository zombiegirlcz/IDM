package zrd;

import android.content.Intent;
import androidx.room.util.SQLiteStatementUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import aw0.b2;
import aw0.c2;
import aw0.d2;
import com.onfido.android.sdk.capture.utils.yearclass.YearClass;
import com.revolut.core.ui_kit.delegates.CellDetailsSwitcherDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.model.Data;
import com.revolut.feature.address.models.Address;
import com.revolut.feature.credit.application.plugins.impl.ui.agreements.v1.documents.CreditApplicationDocumentsScreenContract$Configuration;
import com.revolut.feature.credit.core.R$string;
import com.revolut.feature.freelancer.common.models.invoices.FreelancerInvoice;
import com.revolut.feature.freelancer.common.models.invoices.FreelancerInvoiceCustomerDetails;
import com.revolut.feature.freelancer.common.models.invoices.FreelancerInvoiceSettings;
import com.revolut.feature.security_hub.impl.interactor.ConnectedWifi;
import com.revolut.feature.selfserve.sot.impl.ui.home.SotHomeFragment;
import com.revolut.feature.statements.api.models.StatementUrlState;
import com.revolut.kompot.common.ExternalDestination;
import ip0.br;
import ip0.cr;
import ip0.qi;
import ip0.tj;
import ip0.v7;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import mx0.e4;
import nii.y0;
import p35.e0;
import zul.k0;
import zul.m0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class q implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f324699a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f324700b;

    public /* synthetic */ q(Object obj2, int i) {
        this.f324699a = i;
        this.f324700b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        int i;
        k6d.f fVar;
        int i2 = this.f324699a;
        int i3 = 26;
        int i5 = 18;
        int i6 = 0;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object obj3 = this.f324700b;
        switch (i2) {
            case 0:
                d2 d2Var = (d2) obj3;
                a update = (a) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                if (Intrinsics.f(d2Var, b2.f10241a)) {
                    i = -1;
                } else {
                    if (!(d2Var instanceof c2)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i = ((c2) d2Var).f10253a;
                }
                return a.a(update, null, null, null, null, i, null, 95);
            case 1:
                return (a) obj3;
            case 2:
                zrf.m mVar = (zrf.m) obj3;
                gy4.h result = (gy4.h) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                mVar.X2(mVar.f324738m, new v1.m(i5, new q(result, 3)));
                return Unit.f186387a;
            case 3:
                zrf.i updateContent = (zrf.i) obj2;
                Intrinsics.checkNotNullParameter(updateContent, "$this$updateContent");
                return zrf.i.a(updateContent, ((Integer) ((gy4.h) obj3).f147824a.f147828b).intValue());
            case 4:
                com.revolut.feature.credit.card.impl.ui.repay.boleto.boleto_details.a aVar = (com.revolut.feature.credit.card.impl.ui.repay.boleto.boleto_details.a) obj3;
                dii.g result2 = (dii.g) obj2;
                Intrinsics.checkNotNullParameter(result2, "result");
                if (result2 instanceof dii.e) {
                    aVar.l2(new zt4.n(aVar, objArr == true ? 1 : 0, i6), new yi5.b(i3));
                } else {
                    int i21 = jli.h.f175850a;
                }
                return Unit.f186387a;
            case 5:
                vf0.h hVar = (vf0.h) obj2;
                Intrinsics.checkNotNullParameter(hVar, "<destruct>");
                FreelancerInvoice freelancerInvoice = (FreelancerInvoice) hVar.f288433a;
                k6d.j jVar = (k6d.j) hVar.f288434b;
                k6d.h hVar2 = (k6d.h) hVar.f288435c;
                od0.i iVar = (od0.i) hVar.d;
                l6d.a aVar2 = (l6d.a) ((v60.g) obj3).f286252c;
                String str = jVar.f181697c;
                List list = freelancerInvoice.f73382n;
                ArrayList arrayList = new ArrayList();
                Iterator it8 = list.iterator();
                while (it8.hasNext()) {
                    switch (zt6.c.f325085a[((sr6.i) it8.next()).ordinal()]) {
                        case 1:
                            fVar = k6d.f.PAY_WITH_REVOLUT;
                            break;
                        case 2:
                            fVar = k6d.f.CARD;
                            break;
                        case 3:
                            fVar = k6d.f.BANK_TRANSFER;
                            break;
                        case 4:
                            fVar = k6d.f.OPEN_BANKING;
                            break;
                        case 5:
                            fVar = k6d.f.CLICK_TO_PAY;
                            break;
                        case 6:
                            fVar = null;
                            break;
                        default:
                            throw new NoWhenBranchMatchedException();
                    }
                    if (fVar != null) {
                        arrayList.add(fVar);
                    }
                }
                Address address = (Address) iVar.f224257a;
                dj0.d dVar = freelancerInvoice.f73379j;
                String str2 = dVar.f115083b.f306286a;
                String strValueOf = String.valueOf(dVar.f115082a);
                FreelancerInvoiceCustomerDetails freelancerInvoiceCustomerDetails = freelancerInvoice.f73383p;
                String str3 = freelancerInvoiceCustomerDetails != null ? freelancerInvoiceCustomerDetails.f73391a : null;
                if (str3 == null) {
                    str3 = "";
                }
                return aVar2.b(str, hVar2, arrayList, jVar, address, str2, strValueOf, str3, i6d.a.PAYMENT_METHODS, k6d.g.PERSONAL);
            case 6:
                zth.a aVar3 = (zth.a) obj3;
                zth.a it9 = (zth.a) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return Boolean.valueOf(Intrinsics.f(it9.f325165a, aVar3.f325165a) && Intrinsics.f(it9.f325166b, aVar3.f325166b));
            case 7:
                String accountId = (String) obj2;
                Intrinsics.checkNotNullParameter(accountId, "accountId");
                return (so6.a) v7.r("BRAZIL_INBOUND_STORED_METHOD_DETAILS_MEMORY_CACHE_KEY", accountId, ((zue.a) obj3).f325441b);
            case 8:
                zug.c selectedTab = (zug.c) obj3;
                zug.a update2 = (zug.a) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                Data data = update2.f325453b;
                Intrinsics.checkNotNullParameter(selectedTab, "selectedTab");
                return new zug.a(selectedTab, data);
            case 9:
                zul.n update3 = (zul.n) obj2;
                Intrinsics.checkNotNullParameter(update3, "$this$update");
                return zul.n.a(update3, null, null, null, null, null, null, null, null, null, null, (zul.s) obj3, 2047);
            case 10:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                if (!((k0) obj3).b()) {
                    aim.e eVarB = zhm.u.b();
                    eVarB.addAll(zhm.u.c(new tj("investment_plan_forecast_loading_list_id")));
                    eVarB.add(new cr("input_slider_loading_list_id", br.START));
                    aim.e eVarA = zhm.u.a(eVarB);
                    yp0.b.k(eVarA, 0, 0, 0, 0, 31);
                    return eVarA;
                }
                aim.e eVarB2 = zhm.u.b();
                eVarB2.add(new qi("list_id_fixed_tabs_loading_delegate", 2));
                List listC = zhm.u.c(new tj("investment_plan_forecast_loading_list_id"));
                yp0.b.k(listC, 0, 0, 0, 0, 31);
                eVarB2.addAll(listC);
                cr crVar = new cr("list_id_slider_loading_delegate", br.START);
                yp0.b.l(crVar, 0, 0, 0, 0, null, false, 63);
                eVarB2.add(crVar);
                return zhm.u.a(eVarB2);
            case 11:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return ((m0) obj3).f325539a;
            case 12:
                com.revolut.feature.security_hub.impl.ui.street_mode.trusted_wifis_list.a aVar4 = (com.revolut.feature.security_hub.impl.ui.street_mode.trusted_wifis_list.a) obj3;
                dii.g result3 = (dii.g) obj2;
                Intrinsics.checkNotNullParameter(result3, "result");
                if (result3 instanceof dii.e) {
                    aVar4.u.getClass();
                    aVar4.C1(new ExternalDestination.ByIntent(new Intent("android.settings.WIFI_SETTINGS"), null));
                } else if (!(result3 instanceof dii.b) && !(result3 instanceof dii.c) && !(result3 instanceof dii.d) && !(result3 instanceof dii.f)) {
                    throw new NoWhenBranchMatchedException();
                }
                return Unit.f186387a;
            case 13:
                return zvc.d.a((zvc.d) obj2, null, (ConnectedWifi) obj3, true, 1);
            case 14:
                List exchanges = (List) obj2;
                Intrinsics.checkNotNullParameter(exchanges, "exchanges");
                return (List) ((zwk.a) obj3).f325975c.get(zwk.a.a(exchanges));
            case 15:
                ((zx1.h) obj3).getClass();
                SQLiteStatement sQLiteStatementPrepare = ((SQLiteConnection) obj2).prepare("SELECT * FROM multibanco_contacts");
                try {
                    int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "id");
                    int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "idValue");
                    int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "descriptor");
                    int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "descriptorValue");
                    int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "contactName");
                    int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "alias");
                    int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "photoUri");
                    int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "state");
                    ArrayList arrayList2 = new ArrayList();
                    while (sQLiteStatementPrepare.step()) {
                        arrayList2.add(new zx1.i(sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow), sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2), sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3), sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow4), sQLiteStatementPrepare.isNull(columnIndexOrThrow5) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow5), sQLiteStatementPrepare.isNull(columnIndexOrThrow6) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow6), sQLiteStatementPrepare.isNull(columnIndexOrThrow7) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow7), zx1.h.j(sQLiteStatementPrepare.getText(columnIndexOrThrow8))));
                        break;
                    }
                    return arrayList2;
                } finally {
                    sQLiteStatementPrepare.close();
                }
            case 16:
                zx6.o oVar = (zx6.o) obj3;
                yhm.r rVar = (yhm.r) obj2;
                Intrinsics.checkNotNullParameter(rVar, "<destruct>");
                Set set = (Set) rVar.f314201a;
                FreelancerInvoiceSettings freelancerInvoiceSettings = (FreelancerInvoiceSettings) rVar.f314202b;
                xi0.b bVar = (xi0.b) rVar.f314203c;
                oVar.H2(oVar.f326064t, new q(freelancerInvoiceSettings, 17));
                return new zx6.g(set, bVar, freelancerInvoiceSettings);
            case 17:
                FreelancerInvoiceSettings freelancerInvoiceSettings2 = (FreelancerInvoiceSettings) obj3;
                zx6.h update4 = (zx6.h) obj2;
                Intrinsics.checkNotNullParameter(update4, "$this$update");
                FreelancerInvoiceSettings freelancerInvoiceSettings3 = update4.f326047a;
                if (freelancerInvoiceSettings3 != null) {
                    freelancerInvoiceSettings2 = freelancerInvoiceSettings3;
                }
                return zx6.h.a(update4, freelancerInvoiceSettings2, null, null, 6);
            case 18:
                Pair pair = (Pair) obj2;
                List list2 = (List) pair.f186385a;
                zyc.c model = (zyc.c) pair.f186386b;
                SotHomeFragment sotHomeFragment = (SotHomeFragment) ((zyc.f) obj3);
                sotHomeFragment.setItems(list2);
                Intrinsics.checkNotNullParameter(model, "model");
                sotHomeFragment.D().setTitle(model.f326411a);
                sotHomeFragment.D().setToolbarTitle(model.f326412b);
                sotHomeFragment.D().setNavigationButtonIcon(model.d);
                sotHomeFragment.D().setBackgroundImage(model.f326413c);
                sotHomeFragment.D().setActionStatusLabel(model.e);
                return Unit.f186387a;
            case 19:
                zyd.g update5 = (zyd.g) obj2;
                Intrinsics.checkNotNullParameter(update5, "$this$update");
                return zyd.g.a(update5, null, !((CellDetailsSwitcherDelegate.Model) obj3).f51915c, null, null, 13);
            case 20:
                vyd.a aVar5 = ((zyd.m) obj3).f326448s;
                StatementUrlState content = (StatementUrlState) obj2;
                Intrinsics.checkNotNullParameter(content, "content");
                if (content instanceof StatementUrlState.InPreparation) {
                    return aVar5.b(((StatementUrlState.InPreparation) content).getEmail());
                }
                if (content instanceof StatementUrlState.Ready) {
                    return aVar5.a();
                }
                throw new NoWhenBranchMatchedException();
            case 21:
                zyh.c cVar = (zyh.c) obj3;
                eii.k output = (eii.k) obj2;
                Intrinsics.checkNotNullParameter(output, "output");
                if (Intrinsics.f(output, eii.g.f126653a)) {
                    cVar.f326465n.invoke();
                } else {
                    int i22 = jli.h.f175850a;
                }
                return Unit.f186387a;
            case 22:
                List list3 = (List) obj2;
                Intrinsics.h(list3);
                return new CreditApplicationDocumentsScreenContract$Configuration(list3, new TextLocalisedClause(R$string.credit_forbearance_sign_doc_list_title, null, null, 14), null, null, new TextLocalisedClause(R$string.credit_forbearance_sign_doc_list_subtitle, null, null, 14), null, com.bumptech.glide.d.q(((e0) obj3).G) ? new TextLocalisedClause(R$string.loan_application_doc_sign_doc_list_confirm_button, null, null, 14) : new TextLocalisedClause(R$string.loan_application_doc_sign_doc_list_sign_button, null, null, 14));
            case 23:
                zz9.q update6 = (zz9.q) obj2;
                Intrinsics.checkNotNullParameter(update6, "$this$update");
                return zz9.q.a(update6, null, null, null, (e4) obj3, null, null, 0, false, 2031);
            case 24:
                com.revolut.feature.payments.social.impl.presentation.p2p_kompot.screen.d dVar2 = (com.revolut.feature.payments.social.impl.presentation.p2p_kompot.screen.d) obj3;
                el3.j output2 = (el3.j) obj2;
                Intrinsics.checkNotNullParameter(output2, "output");
                if (Intrinsics.f(output2, el3.i.f127241a)) {
                    dVar2.A.getClass();
                    dVar2.X1(new mii.k("SUCCESSFUL_UNBLOCK_TOAST_ID", new TextLocalisedClause(com.revolut.feature.payments.social.impl.R$string.toast_unblocked_user_title, null, null, 14), null, null, null, 28));
                } else if (output2 instanceof el3.h) {
                    dVar2.l2(new zr5.k(dVar2, ((el3.h) output2).f127240a, objArr2 == true ? 1 : 0, i5), new yi5.b(i3));
                }
                return Unit.f186387a;
            case 25:
                return zz9.q.a((zz9.q) obj2, null, null, null, null, (zz9.n) obj3, null, 0, false, YearClass.CLASS_2015);
            case 26:
                return zz9.q.a((zz9.q) obj2, null, null, null, null, null, (fu9.a) obj3, 0, false, 1983);
            case 27:
                return zz9.q.a((zz9.q) obj2, (com.revolut.feature.payments.social.impl.presentation.p2p_kompot.screen.a) obj3, null, null, null, null, null, 0, false, 2045);
            case 28:
                return zz9.q.a((zz9.q) obj2, null, (zz9.s) obj3, null, null, null, null, 0, false, 2043);
            default:
                com.revolut.feature.statements.impl.ui.documents_hub.a aVar6 = (com.revolut.feature.statements.impl.ui.documents_hub.a) obj3;
                Throwable exception = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(exception, "exception");
                aVar6.X1(new y0(null, aVar6.v.c(exception), false, 5));
                return Boolean.TRUE;
        }
    }
}
