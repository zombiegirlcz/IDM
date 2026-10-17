package zt4;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import cli.y;
import com.revolut.core.deeplink.DeeplinkDroppedException;
import com.revolut.core.ui_kit.delegates.ai;
import com.revolut.core.ui_kit.delegates.g6;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.model.Data;
import com.revolut.feature.credit.card.impl.ui.repay.boleto.boleto_details.CreditCardBoletoDetailsContract$ModalStep;
import com.revolut.feature.credit.card.impl.ui.repay.boleto.boleto_details.CreditCardBoletoDetailsScreen;
import com.revolut.feature.credit.core.R$string;
import com.revolut.feature.external_accounts.models.open_banking_brazil.ThirdPartyBrazil;
import com.revolut.feature.faq.api.navigation.FaqFeatureConfig;
import com.revolut.feature.statements.impl.ui.documents_hub.DocumentsHubScreen;
import com.revolut.feature.transport.impl.ui.help.main.TransportHelpMainScreen;
import com.revolut.feature.wealth.account_closure.impl.ui.screens.upcoming_dividends.UpcomingDividendsController;
import com.revolut.kompot.common.ModalDestination;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KTypeProjection;
import kotlin.text.a0;
import kotlinx.coroutines.CoroutineScope;
import nii.n1;
import vkm.j2;
import zh9.u0;
import zhm.w;
import zrd.q;
import zuj.x;
import zzb.t;
import zzd.s;

/* JADX INFO: loaded from: classes22.dex */
public final class l extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f325079w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(Object obj2, Object obj3, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = obj2;
        this.f325079w = obj3;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                l lVar = new l((CreditCardBoletoDetailsScreen) this.f325079w, continuation, 0);
                lVar.v = obj2;
                return lVar;
            case 1:
                l lVar2 = new l((com.revolut.feature.credit.card.impl.ui.repay.boleto.boleto_details.a) this.f325079w, continuation, 1);
                lVar2.v = obj2;
                return lVar2;
            case 2:
                l lVar3 = new l((ztk.h) this.f325079w, continuation, 2);
                lVar3.v = obj2;
                return lVar3;
            case 3:
                l lVar4 = new l((zue.a) this.f325079w, continuation, 3);
                lVar4.v = obj2;
                return lVar4;
            case 4:
                l lVar5 = new l((UpcomingDividendsController) this.f325079w, continuation, 4);
                lVar5.v = obj2;
                return lVar5;
            case 5:
                l lVar6 = new l((zug.i) this.f325079w, continuation, 5);
                lVar6.v = obj2;
                return lVar6;
            case 6:
                l lVar7 = new l((com.revolut.retail.feature.impl.travel_trips.ui.screen.travel_itinerary.a) this.f325079w, continuation, 6);
                lVar7.v = obj2;
                return lVar7;
            case 7:
                return new l((zv6.k) this.v, (String) this.f325079w, continuation, 7);
            case 8:
                l lVar8 = new l((com.revolut.feature.security_hub.impl.ui.street_mode.trusted_wifis_list.a) this.f325079w, continuation, 8);
                lVar8.v = obj2;
                return lVar8;
            case 9:
                l lVar9 = new l((TransportHelpMainScreen) this.f325079w, continuation, 9);
                lVar9.v = obj2;
                return lVar9;
            case 10:
                l lVar10 = new l((zw5.n) this.f325079w, continuation, 10);
                lVar10.v = obj2;
                return lVar10;
            case 11:
                return new l((dbi.c) this.v, (jf0.c) this.f325079w, continuation, 11);
            case 12:
                return new l((zwj.e) this.v, (String) this.f325079w, continuation, 12);
            case 13:
                l lVar11 = new l((zwk.a) this.f325079w, continuation, 13);
                lVar11.v = obj2;
                return lVar11;
            case 14:
                l lVar12 = new l((zx6.o) this.f325079w, continuation, 14);
                lVar12.v = obj2;
                return lVar12;
            case 15:
                l lVar13 = new l((zyb.h) this.f325079w, continuation, 15);
                lVar13.v = obj2;
                return lVar13;
            case 16:
                l lVar14 = new l((t) this.f325079w, continuation, 16);
                lVar14.v = obj2;
                return lVar14;
            default:
                l lVar15 = new l((DocumentsHubScreen) this.f325079w, continuation, 17);
                lVar15.v = obj2;
                return lVar15;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) throws Throwable {
        switch (this.u) {
            case 0:
                return ((l) create(obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((l) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((l) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((l) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 4:
                return ((l) create((g6) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 5:
                return ((l) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 6:
                return ((l) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 7:
                return ((l) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 8:
                return ((l) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 9:
                return ((l) create((zvf.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 10:
                return ((l) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 11:
                ((l) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
                return Boolean.TRUE;
            case 12:
                return ((l) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 13:
                return ((l) create((List) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 14:
                return ((l) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 15:
                return ((l) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 16:
                return ((l) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((l) create((ai) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Type inference failed for: r2v34, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v38, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        Iterator it8;
        Iterator it9;
        String str;
        String str2;
        String str3;
        so6.d bVar;
        dj0.d dVar;
        zug.c cVar;
        zug.c cVar2;
        zug.c cVar3;
        int i = this.u;
        int i2 = 2;
        int i3 = 0;
        z = false;
        boolean z = false;
        int i5 = 10;
        int i6 = 6;
        int i21 = 1;
        Object obj3 = this.f325079w;
        switch (i) {
            case 0:
                Object obj4 = this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                e eVar = (e) ((CreditCardBoletoDetailsScreen) obj3).P.getValue();
                yx4.b.Companion.getClass();
                yx4.b event = yx4.a.a(obj4);
                com.revolut.feature.credit.card.impl.ui.repay.boleto.boleto_details.a aVar2 = (com.revolut.feature.credit.card.impl.ui.repay.boleto.boleto_details.a) eVar;
                aVar2.getClass();
                Intrinsics.checkNotNullParameter(event, "event");
                Object obj5 = event.f317545b;
                if (obj5 instanceof p) {
                    aVar2.f69550s.a(null, ((p) obj5).f325082a, false);
                    if (!c70.a.g()) {
                        aVar2.X1(new mii.f("id_credit_card_boleto_copy_to_clipboard", new TextLocalisedClause(R$string.credit_common_copied_to_clipboard, null, null, 14), null, null, null, null, 124));
                    }
                } else {
                    String str4 = event.f317544a;
                    int iHashCode = str4.hashCode();
                    if (iHashCode != -965139733) {
                        if (iHashCode == 260933966) {
                            Continuation continuation = null;
                            if (str4.equals("id_credit_card_boleto_share")) {
                                aVar2.l2(new n(aVar2, continuation, i2), new yi5.b(26));
                            }
                        } else if (iHashCode == 1918729248 && str4.equals("ERROR_STATE_ID")) {
                            aVar2.n2(new n(aVar2, null, i21), new whi.b(i6));
                        }
                    } else if (str4.equals("id_credit_card_boleto_cancel")) {
                        oki.h.v2(aVar2.u, CreditCardBoletoDetailsContract$ModalStep.ConfirmCancellation.f69546a, ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                    }
                }
                return Unit.f186387a;
            case 1:
                Data data = (Data) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.credit.card.impl.ui.repay.boleto.boleto_details.a aVar4 = (com.revolut.feature.credit.card.impl.ui.repay.boleto.boleto_details.a) obj3;
                aVar4.H2(aVar4.f69551t, new znc.m(data, 9));
                return Unit.f186387a;
            case 2:
                Data data2 = (Data) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ztk.h hVar = (ztk.h) obj3;
                hVar.H2(hVar.f325182q, new zp5.f(data2, hVar, 11));
                return Unit.f186387a;
            case 3:
                String str5 = (String) this.v;
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ro6.a aVar7 = (ro6.a) j6.a.k(ro6.a.class, ((zue.a) obj3).f325442c, j6.a.q("BRAZIL_INBOUND_STORED_METHOD_DETAILS_STORAGE_KEY", str5));
                if (aVar7 == null) {
                    return null;
                }
                Intrinsics.checkNotNullParameter(aVar7, "<this>");
                String strB = aVar7.getConsentId();
                String strA = aVar7.getAlias();
                String strC = aVar7.getDescription();
                ThirdPartyBrazil thirdPartyBrazilY = foh.i.y(aVar7.getThirdParty());
                List listE = aVar7.getGroups();
                ArrayList arrayList = new ArrayList(w.t(listE, 10));
                Iterator it10 = listE.iterator();
                while (it10.hasNext()) {
                    ro6.d dVar2 = (ro6.d) it10.next();
                    boolean zA = dVar2.getFoldable();
                    String strB2 = dVar2.getFoldableTitle();
                    String strD = dVar2.getSectionTitle();
                    List listC = dVar2.getItems();
                    ArrayList arrayList2 = new ArrayList(w.t(listC, i5));
                    Iterator it11 = listC.iterator();
                    while (it11.hasNext()) {
                        ro6.e eVar2 = (ro6.e) it11.next();
                        String strC2 = eVar2.getTitle();
                        ro6.a aVar8 = aVar7;
                        String strD2 = eVar2.getValue();
                        if (eVar2.getEditableMoney() != null) {
                            ro6.c cVarB = eVar2.getEditableMoney();
                            it8 = it10;
                            it9 = it11;
                            String strB3 = cVarB.getId();
                            ro6.f fVarA = cVarB.getCurrentValue();
                            str = strB;
                            if (fVarA != null) {
                                str2 = strA;
                                str3 = strC;
                                long jA = fVarA.getAmount();
                                xi0.a aVar9 = xi0.b.Companion;
                                String strB4 = fVarA.getCurrency();
                                aVar9.getClass();
                                dVar = new dj0.d(jA, xi0.a.a(strB4));
                            } else {
                                str2 = strA;
                                str3 = strC;
                                dVar = null;
                            }
                            bVar = new so6.c(dVar, strB3);
                        } else {
                            it8 = it10;
                            it9 = it11;
                            str = strB;
                            str2 = strA;
                            str3 = strC;
                            if (eVar2.getEditableDate() != null) {
                                ro6.b bVarA = eVar2.getEditableDate();
                                String strB5 = bVarA.getId();
                                String strA2 = bVarA.getCurrentDate();
                                bVar = new so6.b(strB5, strA2 != null ? LocalDate.parse(strA2) : null);
                            } else {
                                bVar = null;
                            }
                        }
                        arrayList2.add(new so6.f(strC2, strD2, bVar));
                        aVar7 = aVar8;
                        it10 = it8;
                        it11 = it9;
                        strB = str;
                        strA = str2;
                        strC = str3;
                    }
                    arrayList.add(new so6.e(strB2, strD, arrayList2, zA));
                    aVar7 = aVar7;
                    i5 = 10;
                }
                return new so6.a(strB, strA, strC, thirdPartyBrazilY, arrayList, aVar7.getFooter());
            case 4:
                g6 selectedData = (g6) this.v;
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                zug.i iVar = (zug.i) ((UpcomingDividendsController) obj3).N.getValue();
                Intrinsics.h(selectedData);
                iVar.getClass();
                Intrinsics.checkNotNullParameter(selectedData, "selectedData");
                String str6 = selectedData.f54199a;
                zug.c[] cVarArrValues = zug.c.values();
                int length = cVarArrValues.length;
                while (true) {
                    if (i3 < length) {
                        zug.c cVar4 = cVarArrValues[i3];
                        if (a0.z(cVar4.name(), str6, true)) {
                            cVar = cVar4;
                        } else {
                            i3++;
                        }
                    } else {
                        cVar = null;
                    }
                }
                if (cVar != null) {
                    iVar.H2(iVar.f325463r, new q(cVar, 8));
                } else {
                    hx7.e.n(new IllegalStateException("invalid tab=" + selectedData));
                }
                return Unit.f186387a;
            case 5:
                zug.i iVar2 = (zug.i) obj3;
                y yVar = iVar2.f325463r;
                Data data3 = (Data) this.v;
                fim.a aVar11 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                wbl.e eVar3 = (wbl.e) data3.getContent();
                if (eVar3 != null) {
                    ArrayList arrayList3 = eVar3.f296259b;
                    ArrayList arrayList4 = eVar3.f296258a;
                    zug.c cVar5 = ((zug.a) ((j2) yVar.f22677a).getValue()).f325452a;
                    cVar2 = zug.c.CASH;
                    if ((cVar5 != cVar2 || arrayList3.isEmpty()) && ((cVar5 == (cVar3 = zug.c.STOCK) && !arrayList4.isEmpty()) || (arrayList3.isEmpty() && !arrayList4.isEmpty()))) {
                        cVar2 = cVar3;
                    }
                } else {
                    cVar2 = ((zug.a) ((j2) yVar.f22677a).getValue()).f325452a;
                }
                iVar2.H2(yVar, new zp5.f(cVar2, data3, 12));
                return Unit.f186387a;
            case 6:
                Data data4 = (Data) this.v;
                fim.a aVar12 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.retail.feature.impl.travel_trips.ui.screen.travel_itinerary.a aVar13 = (com.revolut.retail.feature.impl.travel_trips.ui.screen.travel_itinerary.a) obj3;
                aVar13.H2(aVar13.z, new znc.m(data4, i5));
                return Unit.f186387a;
            case 7:
                fim.a aVar14 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                zv6.k kVar = (zv6.k) this.v;
                kVar.v2(new zv6.e((String) obj3));
                kVar.u2();
                return Unit.f186387a;
            case 8:
                Data data5 = (Data) this.v;
                fim.a aVar15 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.security_hub.impl.ui.street_mode.trusted_wifis_list.a aVar16 = (com.revolut.feature.security_hub.impl.ui.street_mode.trusted_wifis_list.a) obj3;
                aVar16.H2(aVar16.f85708x, new znc.m(data5, 17));
                return Unit.f186387a;
            case 9:
                zvf.a action = (zvf.a) this.v;
                fim.a aVar17 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                zvf.c cVar6 = (zvf.c) ((TransportHelpMainScreen) obj3).R.getValue();
                Intrinsics.h(action);
                zvf.g gVar = (zvf.g) cVar6;
                gVar.getClass();
                Intrinsics.checkNotNullParameter(action, "action");
                int i22 = zvf.f.f325678a[action.ordinal()];
                if (i22 == 1) {
                    gVar.C2(aii.q.f5292a);
                } else {
                    if (i22 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    gVar.C1(u0.c(new FaqFeatureConfig.Entry(i6)));
                }
                return Unit.f186387a;
            case 10:
                Data data6 = (Data) this.v;
                fim.a aVar18 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((zw5.n) obj3).x2(new znc.m(data6, 19));
                return Unit.f186387a;
            case 11:
                fim.a aVar19 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                if (((wx8.a) ((dbi.c) this.v).f112756b).a(((jf0.c) obj3).f173627a)) {
                    return Boolean.TRUE;
                }
                throw new DeeplinkDroppedException();
            case 12:
                fim.a aVar20 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                zwj.e eVar4 = (zwj.e) this.v;
                String otpCode = (String) obj3;
                xjl.e eVar5 = (xjl.e) eVar4.f325971a;
                Intrinsics.checkNotNullParameter(otpCode, "otpCode");
                eVar5.f306554a.a(otpCode);
                Context context = eVar4.f325972b;
                Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
                if (launchIntentForPackage != null) {
                    try {
                        context.startActivity(launchIntentForPackage);
                        z = true;
                    } catch (ActivityNotFoundException unused) {
                    }
                }
                return Boolean.valueOf(z);
            case 13:
                List list = (List) this.v;
                fim.a aVar21 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                List list2 = (List) p.a.j(cxk.h.class, KTypeProjection.INSTANCE, List.class, ((zwk.a) obj3).f325974b, zwk.a.a(list));
                if (list2 == null) {
                    return null;
                }
                List list3 = list2;
                ArrayList arrayList5 = new ArrayList(w.t(list3, 10));
                Iterator it12 = list3.iterator();
                while (it12.hasNext()) {
                    arrayList5.add(cj9.c.U((cxk.h) it12.next()));
                }
                return arrayList5;
            case 14:
                Data data7 = (Data) this.v;
                fim.a aVar22 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                zx6.o oVar = (zx6.o) obj3;
                oVar.H2(oVar.f326064t, new znc.m(data7, 20));
                return Unit.f186387a;
            case 15:
                Data data8 = (Data) this.v;
                fim.a aVar23 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                zyb.h hVar2 = (zyb.h) obj3;
                hVar2.H2(hVar2.f326406r, new znc.m(data8, 21));
                return Unit.f186387a;
            case 16:
                Data data9 = (Data) this.v;
                fim.a aVar24 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                t tVar = (t) obj3;
                tVar.H2(tVar.f326668s, new znc.m(data9, 25));
                return Unit.f186387a;
            default:
                ai aiVar = (ai) this.v;
                fim.a aVar25 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                s sVarE3 = ((DocumentsHubScreen) obj3).d();
                String tabId = aiVar.f53687a;
                com.revolut.feature.statements.impl.ui.documents_hub.a aVar26 = (com.revolut.feature.statements.impl.ui.documents_hub.a) sVarE3;
                aVar26.getClass();
                Intrinsics.checkNotNullParameter(tabId, "tabId");
                aVar26.H2(aVar26.A, new x(tabId, i6));
                aVar26.M2();
                return Unit.f186387a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f325079w = obj2;
    }
}
