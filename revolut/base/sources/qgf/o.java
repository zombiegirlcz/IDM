package qgf;

import android.os.Parcelable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.util.SQLiteStatementUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import aw0.o9;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.error.data.model.ServerError;
import com.revolut.core.ui_kit.internal.views.videoplayer.UiKitPlayerView;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.buttons.CollapsingActionButton;
import com.revolut.data.model.Data;
import com.revolut.feature.credit.core.R$string;
import com.revolut.feature.crypto.withdraw.impl.ui.withdrawtoaddress.confirmation.CryptoWithdrawToAddressConfirmationActivity;
import com.revolut.feature.insurance_car.impl.ui.screen.onboarding.reservation.ReservationScreen;
import com.revolut.feature.spending_analytics.api.models.GroupingExtraData;
import com.revolut.feature.spending_analytics.impl.ui.rev10.group_details.GroupDetailsScreenContract$InputData;
import com.revolut.feature.tab.crypto.api.TabCryptoApi$Toggles;
import com.revolut.feature.transactions.api.navigation.TransactionsListFilterType;
import com.revolut.feature.transfer_reasons.impl.flow.TransferReasonsFlowContract$State;
import com.revolut.feature.trusted_merchants.impl.ui.trusted_merchants.TrustedMerchantsActivity;
import com.revolut.retail.feature.api.custom_assets.models.CustomAsset;
import com.revolut.retail.feature.api.custom_assets.models.CustomAssetFieldDefinitions;
import com.revolut.retail.feature.pricing_plans.ui.api.models.PlansDashboardLayout$PlanPageLayout$BillingOptions;
import com.revolut.retail.feature.pricing_plans.ui.impl.flows.inner.plan_pager.c;
import com.revolut.retail.feature.pricing_plans.ui.impl.model.SelectedBillingPlan;
import com.revolut.shared.feature.workflow.engine.api.models.WorkflowStepConfiguration;
import com.youTransactor.uCube.rpc.Constants;
import grl.k9;
import ip0.u3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.flow.Flow;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import nii.c0;
import nii.y0;
import nii.z;
import qlm.d1;
import qsk.e;
import zhm.d0;
import zhm.f0;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class o implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f245812a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f245813b;

    public /* synthetic */ o(Object obj2, int i) {
        this.f245812a = i;
        this.f245813b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v150, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r0v155, types: [android.view.ViewGroup, jv0.e] */
    /* JADX WARN: Type inference failed for: r14v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r15v2, types: [c84.t, com.revolut.feature.credit.application.plugins.impl.ui.rollee.c, java.lang.Object, yji.l] */
    /* JADX WARN: Type inference failed for: r2v30, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v49, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r5v25, types: [ppk.f] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        TextLocalisedClause textLocalisedClause;
        TextLocalisedClause textLocalisedClause2;
        he3.j jVar;
        Flow gVar;
        int i = this.f245812a;
        int i2 = 7;
        int i3 = 26;
        int i5 = 3;
        boolean z = true;
        boolean z3 = false;
        ?? r142 = 0;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = this.f245813b;
        switch (i) {
            case 0:
                h update = (h) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return h.a(update, null, null, false, new TransactionsListFilterType.ConfigurableFilter.SelectableFilters(((tgf.i) obj5).f271176a), false, null, null, null, Constants.TAG_BLE_FIRMWARE_VERSION);
            case 1:
                qgg.o oVar = (qgg.o) obj5;
                Throwable it8 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                yji.l.a1(oVar, oVar.X1(((qgg.c) oVar.f245845s).a(it8, oVar.f245842p.f94259a)), null, null, new qc3.c(oVar, r142, 15), 3);
                return Boolean.TRUE;
            case 2:
                ?? r152 = (com.revolut.feature.credit.application.plugins.impl.ui.rollee.c) obj5;
                qh4.y it9 = (qh4.y) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                if (it9 instanceof qh4.v) {
                    if (((qh4.v) it9).f246479b) {
                        y0 y0VarP2 = r152.P2();
                        if (y0VarP2 != null) {
                            r152.t1(y0VarP2);
                        }
                    } else {
                        r152.l2(new qh4.i(r152, it9, r142, 0), new yi5.b(i3));
                    }
                } else if (it9 instanceof qh4.x) {
                    r152.l2(new qh4.i(r152, it9, r142, 1), new yi5.b(i3));
                } else if (it9 instanceof qh4.u) {
                    c84.t.J2(r152, false, null, null, 7);
                } else if (it9 instanceof qh4.w) {
                    if (r152.f68336r.get()) {
                        return Unit.f186387a;
                    }
                    qh4.w wVar = (qh4.w) it9;
                    if (wVar.f246481b) {
                        sh4.e eVar = wVar.f246480a;
                        int[] iArr = sh4.d.f263426a;
                        int i6 = iArr[eVar.ordinal()];
                        if (i6 == 1) {
                            textLocalisedClause = new TextLocalisedClause(R$string.credit_rollee_status_connection_title, null, null, 14);
                        } else if (i6 == 2) {
                            textLocalisedClause = new TextLocalisedClause(R$string.credit_rollee_status_encrypting_title, null, null, 14);
                        } else {
                            if (i6 != 3 && i6 != 4) {
                                throw new NoWhenBranchMatchedException();
                            }
                            textLocalisedClause = new TextLocalisedClause(R$string.credit_rollee_status_authentication_title, null, null, 14);
                        }
                        TextLocalisedClause textLocalisedClause3 = textLocalisedClause;
                        int i21 = iArr[eVar.ordinal()];
                        if (i21 == 1) {
                            textLocalisedClause2 = new TextLocalisedClause(R$string.credit_rollee_status_connection_description, null, null, 14);
                        } else if (i21 == 2) {
                            textLocalisedClause2 = new TextLocalisedClause(R$string.credit_rollee_status_encrypting_description, null, null, 14);
                        } else {
                            if (i21 != 3 && i21 != 4) {
                                throw new NoWhenBranchMatchedException();
                            }
                            textLocalisedClause2 = new TextLocalisedClause(R$string.credit_rollee_status_authentication_description, null, null, 14);
                        }
                        TextLocalisedClause textLocalisedClause4 = textLocalisedClause2;
                        k9 value = k9.Credit;
                        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
                        Intrinsics.checkNotNullParameter(value, "value");
                        y0 y0Var = new y0(null, new c0(textLocalisedClause3, textLocalisedClause4, null, true, null, false, false, new AnalyticsProduct.Retail(value), 1644), false, 5);
                        r152.f68337s.set(new qh4.e(y0Var, r152.l2(new qh4.g((com.revolut.feature.credit.application.plugins.impl.ui.rollee.c) r152, (Continuation) r142, i5), new yi5.b(i3))));
                        yji.l.a1(r152, r152.X1(y0Var), null, null, new qg4.d(r152, r142, i5), 3);
                    } else {
                        y0 y0VarP22 = r152.P2();
                        if (y0VarP22 != null) {
                            r152.t1(y0VarP22);
                        }
                    }
                } else if (!(it9 instanceof qh4.t)) {
                    throw new NoWhenBranchMatchedException();
                }
                return Unit.f186387a;
            case 3:
                qhb.f fVar = (qhb.f) obj5;
                Throwable throwable = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(throwable, "throwable");
                fVar.H2(fVar.f246597p, new nd8.l(throwable, i2));
                return Boolean.TRUE;
            case 4:
                com.revolut.retail.feature.pricing_plans.ui.impl.flows.select_family_plan.a aVar = (com.revolut.retail.feature.pricing_plans.ui.impl.flows.select_family_plan.a) obj5;
                com.revolut.retail.feature.pricing_plans.ui.impl.flows.inner.plan_pager.c output = (com.revolut.retail.feature.pricing_plans.ui.impl.flows.inner.plan_pager.c) obj2;
                Intrinsics.checkNotNullParameter(output, "output");
                if (output instanceof ghk.m) {
                    ghk.m mVar = (ghk.m) output;
                    String str = mVar.f143968a;
                    PlansDashboardLayout$PlanPageLayout$BillingOptions plansDashboardLayout$PlanPageLayout$BillingOptions = mVar.f143969b.k;
                    if (plansDashboardLayout$PlanPageLayout$BillingOptions != null) {
                        aVar.f103258p.Z2(new phk.i(new SelectedBillingPlan.PlanId(str), aVar.o.f103256a, plansDashboardLayout$PlanPageLayout$BillingOptions, null), new qce.a(13, str, aVar));
                    }
                } else if (!(output instanceof c.a) && !(output instanceof ghk.n) && !(output instanceof ghk.l) && !(output instanceof c.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                return Unit.f186387a;
            case 5:
                String juniorId = (String) obj2;
                Intrinsics.checkNotNullParameter(juniorId, "juniorId");
                return (List) ((qj8.l) obj5).f246794b.get(qj8.l.a(juniorId));
            case 6:
                com.revolut.feature.pay_later.impl.ui.help.a aVar2 = (com.revolut.feature.pay_later.impl.ui.help.a) obj5;
                cy4.b bVar = (cy4.b) obj2;
                if (bVar != null) {
                    qv0.p pVar = bVar.f110042b;
                    if (pVar == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    aVar2.O1(pVar);
                }
                return Unit.f186387a;
            case 7:
                qje.e eVar2 = (qje.e) obj5;
                Data data = (Data) obj2;
                Intrinsics.checkNotNullParameter(data, "data");
                pwa.n nVar = (pwa.n) data.getContent();
                if (nVar != null && data.getError() == null) {
                    od0.i.Companion.getClass();
                    return te0.w.h(new Data(od0.h.a(nVar), null, data.getLoading(), 2, null));
                }
                if (((jte.d) eVar2.f246835b).c(TabCryptoApi$Toggles.InviteFriends.f89776c)) {
                    return nim.a.w(wwa.b.d(eVar2.f246834a, false, pwa.n.STANDARD, 4), new qg7.v(17));
                }
                od0.i.Companion.getClass();
                return zi0.c.j(od0.i.f224256b);
            case 8:
                List items = (List) obj2;
                Intrinsics.h(items);
                Intrinsics.checkNotNullParameter(items, "items");
                ((z4l.j) ((TrustedMerchantsActivity) ((qjg.d) obj5)).B0.getValue()).c(items);
                return Unit.f186387a;
            case 9:
                Parcelable parcelable = (Parcelable) obj5;
                Intrinsics.checkNotNullParameter((Parcelable) obj2, "$this$update");
                return parcelable;
            case 10:
                olm.a buildSerialDescriptor = (olm.a) obj2;
                Intrinsics.checkNotNullParameter(buildSerialDescriptor, "$this$buildSerialDescriptor");
                buildSerialDescriptor.c(((d1) obj5).f247630b);
                return Unit.f186387a;
            case 11:
                SerialDescriptor serialDescriptor = (SerialDescriptor) obj5;
                int iIntValue = ((Integer) obj2).intValue();
                return serialDescriptor.d(iIntValue) + ": " + serialDescriptor.b(iIntValue).e();
            case 12:
                mlm.a aVar3 = (mlm.a) obj5;
                olm.a buildClassSerialDescriptor = (olm.a) obj2;
                Intrinsics.checkNotNullParameter(buildClassSerialDescriptor, "$this$buildClassSerialDescriptor");
                SerialDescriptor descriptor = aVar3.f207087b.getDescriptor();
                f0 f0Var = f0.f322471a;
                buildClassSerialDescriptor.a("first", descriptor, f0Var, false);
                buildClassSerialDescriptor.a("second", ((KSerializer) aVar3.f207088c).getDescriptor(), f0Var, false);
                buildClassSerialDescriptor.a("third", ((KSerializer) aVar3.d).getDescriptor(), f0Var, false);
                return Unit.f186387a;
            case 13:
                com.revolut.feature.backgroundpicker.impl.flow.a aVar4 = (com.revolut.feature.backgroundpicker.impl.flow.a) obj5;
                zm2.f output2 = (zm2.f) obj2;
                Intrinsics.checkNotNullParameter(output2, "output");
                if (output2 == null) {
                    throw new NoWhenBranchMatchedException();
                }
                em2.e eVar3 = output2.f323326a;
                aVar4.l2(new qg7.p(aVar4.o.f63739a, aVar4, eVar3.a(), fm2.a.a(eVar3), (Continuation) null, 3), new yi5.b(i3));
                return Unit.f186387a;
            case 14:
                com.revolut.feature.profile.impl.ui.details.address.flow.c cVar = (com.revolut.feature.profile.impl.ui.details.address.flow.c) obj5;
                Throwable it10 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                v60.e eVar4 = cVar.u;
                ServerError serverErrorA = cVar.f81376t.a(it10);
                v60.d dVarB = ((ao0.a) eVar4).b(serverErrorA != null ? Integer.valueOf(serverErrorA.f51362a) : null);
                if (dVarB == null) {
                    dVarB = new v60.b();
                }
                yji.l.a1(cVar, cVar.X1(new y0(null, new z(ofm.q.O(dVarB), null, null, null, null, null, false, null, null, null, null, null, null, 32766), false, 5)), null, null, new qg4.d(cVar, r142, 12), 3);
                return Boolean.TRUE;
            case 15:
                qn9.q qVar = (qn9.q) obj5;
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                qVar.f247896t.getClass();
                qVar.X1(on9.a.a());
                return Boolean.TRUE;
            case 16:
                qng.e update2 = (qng.e) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                List items2 = update2.f247941a;
                Intrinsics.checkNotNullParameter(items2, "items");
                return new qng.e(items2, (WorkflowStepConfiguration.Screen.AddressSuggestion.AddressSuggestionItem) obj5);
            case 17:
                jlc.b bVar2 = (jlc.b) obj5;
                jlc.r updateState = (jlc.r) obj2;
                Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                ?? r2 = bVar2.f175673a;
                jlc.c cVar2 = bVar2.f175674b;
                return jlc.r.a(updateState, null, null, null, null, null, null, null, null, null, r2, cVar2 != null ? new jlc.q(cVar2.f175675a, cVar2.f175676b) : updateState.f175703l, null, null, null, 29695);
            case 18:
                CompositeClause compositeClause = (CompositeClause) obj5;
                od0.i cryptoConvertDisclaimer = (od0.i) obj2;
                Intrinsics.checkNotNullParameter(cryptoConvertDisclaimer, "cryptoConvertDisclaimer");
                TextLocalisedClause textLocalisedClause5 = (TextLocalisedClause) cryptoConvertDisclaimer.f224257a;
                if (textLocalisedClause5 == null) {
                    return compositeClause;
                }
                List listK = zhm.v.k(compositeClause, textLocalisedClause5);
                t0 t0Var = t0.f186434a;
                return new CompositeClause(listK, new TextClause(a0.d.r(m70.a.o(t0Var), m70.a.o(t0Var)), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12);
            case 19:
                List items3 = (List) obj2;
                Intrinsics.checkNotNullParameter(items3, "items");
                ((CryptoWithdrawToAddressConfirmationActivity) ((qp5.i) obj5)).setItems(items3);
                return Unit.f186387a;
            case 20:
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                KProperty[] kPropertyArr = ReservationScreen.g0;
                CollapsingActionButton screenCollapsingButtonButton = ((ReservationScreen) obj5).g3().f217060b;
                Intrinsics.checkNotNullExpressionValue(screenCollapsingButtonButton, "screenCollapsingButtonButton");
                screenCollapsingButtonButton.setCollapsed(!zBooleanValue, true);
                return Unit.f186387a;
            case 21:
                he3.s remoteTransactionGrouping = (he3.s) obj2;
                Intrinsics.checkNotNullParameter(remoteTransactionGrouping, "remoteTransactionGrouping");
                return remoteTransactionGrouping.a((he3.l) obj5, null).f151570a;
            case 22:
                GroupDetailsScreenContract$InputData.Group group = (GroupDetailsScreenContract$InputData.Group) obj5;
                List categoryGroups = (List) obj2;
                Intrinsics.checkNotNullParameter(categoryGroups, "categoryGroups");
                if (group instanceof GroupDetailsScreenContract$InputData.Group.CategoryGroup) {
                    Iterator it11 = categoryGroups.iterator();
                    while (true) {
                        if (it11.hasNext()) {
                            Object next = it11.next();
                            if (Intrinsics.f(((he3.j) next).f151563a, ((GroupDetailsScreenContract$InputData.Group.CategoryGroup) group).f87695a.getId())) {
                                obj3 = next;
                            }
                        }
                    }
                    jVar = (he3.j) obj3;
                } else if (group instanceof GroupDetailsScreenContract$InputData.Group.CardholderGroup) {
                    Iterator it12 = categoryGroups.iterator();
                    while (true) {
                        if (it12.hasNext()) {
                            Object next2 = it12.next();
                            if (Intrinsics.f(((he3.j) next2).f151563a, ((GroupDetailsScreenContract$InputData.Group.CardholderGroup) group).f87693a)) {
                                obj4 = next2;
                            }
                        }
                    }
                    jVar = (he3.j) obj4;
                } else if (group instanceof GroupDetailsScreenContract$InputData.Group.ParticipantGroup) {
                    Iterator it13 = categoryGroups.iterator();
                    while (true) {
                        if (it13.hasNext()) {
                            Object next3 = it13.next();
                            if (Intrinsics.f(((he3.j) next3).f151563a, ((GroupDetailsScreenContract$InputData.Group.ParticipantGroup) group).f87699a)) {
                                r142 = next3;
                            }
                        }
                    }
                    jVar = (he3.j) r142;
                } else {
                    if (group != null && !(group instanceof GroupDetailsScreenContract$InputData.Group.CountryGroup) && !(group instanceof GroupDetailsScreenContract$InputData.Group.MerchantGroup) && !(group instanceof GroupDetailsScreenContract$InputData.Group.CurrencyGroup) && !(group instanceof GroupDetailsScreenContract$InputData.Group.SavingsTransactionType) && !(group instanceof GroupDetailsScreenContract$InputData.Group.SourceAccountGroup) && !(group instanceof GroupDetailsScreenContract$InputData.Group.SavingsOperationType) && !(group instanceof GroupDetailsScreenContract$InputData.Group.CardGroup)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    jVar = (he3.j) d0.d0(categoryGroups);
                }
                od0.i.Companion.getClass();
                return od0.h.a(jVar);
            case 23:
                return qpd.f.a((qpd.f) obj2, null, null, (GroupingExtraData) obj5, 3);
            case 24:
                qr0.l lVar = (qr0.l) obj5;
                RecyclerView.ViewHolder holder = (RecyclerView.ViewHolder) obj2;
                Intrinsics.checkNotNullParameter(holder, "holder");
                ?? r06 = holder.itemView;
                qr0.b bVar3 = r06 instanceof qr0.b ? (qr0.b) r06 : null;
                if (bVar3 != null) {
                    lVar.e.remove(bVar3);
                    ?? r09 = ((qr0.d) bVar3).f;
                    UiKitPlayerView uiKitPlayerView = r09.f178737a;
                    if (uiKitPlayerView != null) {
                        uiKitPlayerView.h();
                        uiKitPlayerView.setVisibility(8);
                        r09.f178737a = null;
                        r09.removeView(uiKitPlayerView);
                    }
                }
                return Unit.f186387a;
            case 25:
                ((qra.d) obj5).getClass();
                SQLiteStatement sQLiteStatementPrepare = ((SQLiteConnection) obj2).prepare("SELECT * FROM card_owners");
                try {
                    int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "id");
                    int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "firstName");
                    int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "lastName");
                    int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "label");
                    int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "email");
                    int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "type");
                    int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "card");
                    int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "twoFaRequired");
                    ArrayList arrayList = new ArrayList();
                    while (sQLiteStatementPrepare.step()) {
                        boolean z4 = z;
                        boolean z6 = z3;
                        arrayList.add(new sra.b(sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow), sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2), sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3), sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow4), sQLiteStatementPrepare.isNull(columnIndexOrThrow5) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow5), sQLiteStatementPrepare.isNull(columnIndexOrThrow6) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow6), tra.a.a(sQLiteStatementPrepare.isNull(columnIndexOrThrow7) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow7)), ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow8)) != 0 ? z4 : z6));
                        z = z4;
                        z3 = z6;
                        break;
                    }
                    return arrayList;
                } finally {
                    sQLiteStatementPrepare.close();
                }
            case 26:
                return qsa.i.a((qsa.i) obj2, null, (qsa.j) obj5, null, null, 59);
            case 27:
                gsd.c cVar3 = (gsd.c) obj5;
                yhm.r rVar = (yhm.r) obj2;
                Intrinsics.checkNotNullParameter(rVar, "<destruct>");
                List list = (List) rVar.f314201a;
                CustomAssetFieldDefinitions customAssetFieldDefinitions = (CustomAssetFieldDefinitions) rVar.f314202b;
                xi0.b bVar4 = (xi0.b) rVar.f314203c;
                if (list.isEmpty()) {
                    return ((tsj.g) cVar3.f146392b).e() ? new go.g(zi0.c.P(new amd.j(amd.b.OTHER_ASSETS, f0.f322471a, null, false, null, 28), false, null, 3), 2) : new go.g(new Data(null, null, false, 7, null), 2);
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it14 = list.iterator();
                while (it14.hasNext()) {
                    dj0.d dVar = ((CustomAsset) it14.next()).f99218c;
                    xi0.b bVar5 = dVar != null ? dVar.f115083b : null;
                    if (bVar5 != null) {
                        arrayList2.add(bVar5);
                    }
                }
                List listU = d0.U(arrayList2);
                if (listU.isEmpty() || (listU.size() <= 1 && Intrinsics.f(d0.b0(listU), bVar4))) {
                    gVar = new go.g(zi0.c.P(f0.f322471a, false, null, 3), 2);
                } else {
                    ?? r56 = (ppk.f) cVar3.f146393c;
                    List list2 = listU;
                    ArrayList arrayList3 = new ArrayList(zhm.w.t(list2, 10));
                    Iterator it15 = list2.iterator();
                    while (it15.hasNext()) {
                        v1.c.A(arrayList3, bVar4, (xi0.b) it15.next());
                    }
                    gVar = rd0.e.b(r56.b(arrayList3, false));
                }
                return nim.a.v(gVar, new q2k.b(customAssetFieldDefinitions, cVar3, list, bVar4));
            case 28:
                TransferReasonsFlowContract$State update3 = (TransferReasonsFlowContract$State) obj2;
                Intrinsics.checkNotNullParameter(update3, "$this$update");
                return TransferReasonsFlowContract$State.a(update3, null, null, null, null, false, ((vsf.e) obj5).f291778a, 31);
            default:
                qsk.e eVar5 = (qsk.e) obj5;
                e.a it16 = (e.a) obj2;
                Intrinsics.checkNotNullParameter(it16, "it");
                eVar5.getClass();
                Intrinsics.checkNotNullParameter(it16, "<this>");
                return new u3(eVar5.n(it16));
        }
    }

    public /* synthetic */ o(jlc.b bVar, qoc.r rVar) {
        this.f245812a = 17;
        this.f245813b = bVar;
    }
}
