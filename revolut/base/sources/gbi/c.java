package gbi;

import a9j.o;
import am6.d;
import androidx.collection.ArrayMap;
import androidx.room.util.SQLiteStatementUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import b9.w2;
import beb.i;
import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.acquiring.card_reader.data.api.domain.model.CardReaderDevice;
import com.revolut.feature.acquiring.lite_pos.impl.ui.screen.catalogue.CatalogueScreenContract$ModalStep;
import com.revolut.feature.acquiring.lite_pos.impl.ui.screen.catalogue.a;
import com.revolut.feature.address.models.Address;
import com.revolut.feature.apm.qvik.api.navigation.QvikNavigation$Destination;
import com.revolut.feature.apm.qvik.api.navigation.QvikNavigation$StartType;
import com.revolut.feature.crypto.withdraw.impl.ui_v3.beneficiarydetails.CryptoBeneficiaryDetailsScreenInternalContract$ModalStep;
import com.revolut.feature.cryptocommodity_invest.api.CryptoCommodityInvestApi$Toggles;
import com.revolut.feature.external_accounts.impl.ui.consents_kompot.OpenBankingConsentsFlowContract$Step;
import com.revolut.feature.external_accounts.impl.ui.consents_kompot.consent_details.ConsentDetailsScreenContract$OutputData;
import com.revolut.feature.external_accounts.impl.ui.flow.cross_border.link_account.CrossBorderLinkAccountFlowContract$Step;
import com.revolut.feature.faq.api.navigation.FaqFeatureConfig;
import com.revolut.feature.insurance_car.impl.ui.flow.mta.MtaFlowContract$Step;
import com.revolut.feature.mainscreen.api.navigation.MainScreenFeatureConfig;
import com.revolut.feature.mainscreen.core.api.navigation.action.MainContainerActionData;
import com.revolut.feature.mainscreen.core.api.navigation.action.MainContainerActionId;
import com.revolut.feature.mainscreen.core.api.ui.screen.MainContainerInnerConfiguration;
import com.revolut.feature.retail.main_screen.container.models.action_payload.ApmDeeplinkPayload;
import com.revolut.feature.retail.restaurants.impl.ui.flow.reservationcreation.ReservationCreationFlowContract$Step;
import com.revolut.feature.travel.miles.api.model.TravelMilesSearchLocation;
import com.revolut.feature_retail_user_declarations.email_verification.otp_flow.EmailVerificationOtpFlowContract$Step;
import com.revolut.feature_retail_user_declarations.email_verification.otp_flow.EmailVerificationOtpFlowOutputData;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.feature.crypto_deposits.impl.ui.return_deposit.ReturnCryptoDepositFlowContract$Step;
import com.youTransactor.uCube.rpc.Constants;
import dej.o3;
import do3.n;
import eii.i;
import eii.k;
import ga9.v;
import gc1.p;
import gc1.q;
import gca.f;
import gdc.l;
import ge1.g;
import ggk.g1;
import gnh.h;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import jcj.j;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.Json;
import le1.d;
import org.jmrtd.lds.LDSFile;
import sri.m;
import tn6.h;
import vkm.j2;
import vkm.v1;
import zh9.u0;
import zhm.d0;
import zhm.f0;
import zhm.h0;
import zhm.w;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class c implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f142264a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f142265b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f142266c;

    public /* synthetic */ c(h hVar, knh.h hVar2, w2 w2Var) {
        this.f142264a = 27;
        this.f142265b = hVar;
        this.f142266c = hVar2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        TravelMilesSearchLocation travelMilesSearchLocation;
        String text;
        int i;
        int i2;
        int i3;
        Integer numValueOf;
        int i5;
        String text2;
        int i6;
        int i21;
        hi9.c cVar;
        int i22;
        String text3;
        int i32;
        List list;
        int i33 = this.f142264a;
        int i43 = 26;
        int i59 = 6;
        Object obj3 = this.f142266c;
        Object obj4 = this.f142265b;
        switch (i33) {
            case 0:
                Throwable error = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(error, "error");
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, error, h0Var);
                ((com.revolut.feature_retail_user_declarations.email_verification.otp_flow.b) obj4).I2((String) obj3);
                return Boolean.TRUE;
            case 1:
                com.revolut.feature_retail_user_declarations.email_verification.otp_flow.b bVar = (com.revolut.feature_retail_user_declarations.email_verification.otp_flow.b) obj4;
                EmailVerificationOtpFlowContract$Step.Cooldown cooldown = (EmailVerificationOtpFlowContract$Step.Cooldown) obj3;
                uai.d output = (uai.d) obj2;
                Intrinsics.checkNotNullParameter(output, "output");
                if (output instanceof uai.c) {
                    oki.h.u2(bVar, bVar.f97633t, new EmailVerificationOtpFlowContract$Step.Onboarding(cooldown.f97618a, ((uai.c) output).f278665a), null, 6);
                } else {
                    if (!Intrinsics.f(output, uai.b.f278664a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    bVar.C2(EmailVerificationOtpFlowOutputData.Verified.f97627a);
                }
                return Unit.f186387a;
            case 2:
                q qVar = (q) obj4;
                CardReaderDevice cardReaderDevice = (CardReaderDevice) obj3;
                k it8 = (k) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                if (it8 instanceof i) {
                    Object obj5 = ((i) it8).f126655a;
                    if (obj5 == gc1.a.DISCONNECT) {
                        qVar.l2(new p(qVar, null, 1), new yi5.b(i43));
                    } else {
                        Continuation continuation = null;
                        if (obj5 == gc1.a.FORGET) {
                            qVar.l2(new v(qVar, cardReaderDevice, continuation, 12), new yi5.b(i43));
                        }
                    }
                }
                return Unit.f186387a;
            case 3:
                m mVar = ((gc2.c) obj4).f142314a;
                jf0.c cVar2 = (jf0.c) obj3;
                Boolean enabled = (Boolean) obj2;
                Intrinsics.checkNotNullParameter(enabled, "enabled");
                boolean zBooleanValue = enabled.booleanValue();
                ApmDeeplinkPayload.Apm.QVIK qvik = ApmDeeplinkPayload.Apm.QVIK.f82737b;
                if (zBooleanValue) {
                    String strE = cVar2.e(2);
                    mVar.c((Intrinsics.f(strE, "teszt-azonnalifizetes.hu") || Intrinsics.f(strE, "azonnalifizetes.hu")) ? gc0.c.f(new MainScreenFeatureConfig.WithAction(s49.a.SINGLE_TOP, new MainContainerActionData(new MainContainerActionId("APM_DEEPLINK"), new ApmDeeplinkPayload.Pay(qvik, cVar2.f173627a)))) : gc0.c.f(new MainScreenFeatureConfig.WithInnerConfiguration(s49.a.SINGLE_TOP, new MainContainerInnerConfiguration(t49.a.f267949a, null, u0.f(new QvikNavigation$Destination(QvikNavigation$StartType.Area.f62776a, false)), 2))));
                } else {
                    Intrinsics.checkNotNullExpressionValue("c", "TAG");
                    IllegalStateException illegalStateException = new IllegalStateException("Attempted to open QVIK deeplink, but feature is disabled");
                    h0 h0Var2 = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                    rd0.d.a(rd0.c.WARNING, "c", null, illegalStateException, h0Var2);
                    mVar.c(gc0.c.f(new MainScreenFeatureConfig.WithAction(s49.a.SINGLE_TOP, new MainContainerActionData(new MainContainerActionId("APM_DEEPLINK"), new ApmDeeplinkPayload.Unavailable(qvik)))));
                }
                return Boolean.TRUE;
            case 4:
                f update = (f) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                w80.b bVar2 = ((gca.m) obj4).f142389p;
                xi0.b.Companion.getClass();
                xi0.b bVar3 = xi0.b.D;
                return f.a(update, new dj0.d(bVar2.b((String) obj3, bVar3.f306286a), bVar3), null, null, 126);
            case 5:
                List transactions = (List) obj2;
                Intrinsics.checkNotNullParameter(transactions, "transactions");
                return new v1(new g0a.e((gce.m) obj4, (qua.p) obj3, transactions, (Continuation) null, 7));
            case 6:
                com.revolut.retail.feature.crypto_deposits.impl.ui.return_deposit.a aVar = (com.revolut.retail.feature.crypto_deposits.impl.ui.return_deposit.a) obj4;
                yki.i iVar = aVar.f100123q;
                ReturnCryptoDepositFlowContract$Step.Chat chat = (ReturnCryptoDepositFlowContract$Step.Chat) obj3;
                kz9.e output2 = (kz9.e) obj2;
                Intrinsics.checkNotNullParameter(output2, "output");
                if (output2 instanceof kz9.c) {
                    oki.h.u2(aVar, iVar, new ReturnCryptoDepositFlowContract$Step.BeneficiaryDetails(chat.f100120a), null, 6);
                } else {
                    if (!(output2 instanceof kz9.d)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    oki.h.u2(aVar, iVar, new ReturnCryptoDepositFlowContract$Step.Summary(chat.f100120a), null, 6);
                }
                return Unit.f186387a;
            case 7:
                com.revolut.retail.feature.crypto_deposits.impl.ui.return_deposit.a aVar2 = (com.revolut.retail.feature.crypto_deposits.impl.ui.return_deposit.a) obj4;
                yki.i iVar2 = aVar2.f100123q;
                ReturnCryptoDepositFlowContract$Step.Summary summary = (ReturnCryptoDepositFlowContract$Step.Summary) obj3;
                jcj.k output3 = (jcj.k) obj2;
                Intrinsics.checkNotNullParameter(output3, "output");
                if (output3 instanceof jcj.h) {
                    oki.h.u2(aVar2, iVar2, new ReturnCryptoDepositFlowContract$Step.BeneficiaryDetails(summary.f100121a), null, 6);
                } else if (Intrinsics.f(output3, jcj.i.f172829a)) {
                    aVar2.C1(u0.b(new FeatureCommand(new FaqFeatureConfig.Starter("topic.issues-with-crypto-deposits", 2))));
                } else {
                    if (!Intrinsics.f(output3, j.f172830a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    oki.h.D2(iVar2);
                }
                return Unit.f186387a;
            case 8:
                gd2.e update2 = (gd2.e) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return gd2.e.a(update2, null, ue0.e.Q((String) obj3, ((gd2.e) ((j2) ((gd2.j) obj4).f143045r.f22677a).getValue()).d), 7);
            case 9:
                gdc.k update3 = (gdc.k) obj2;
                Intrinsics.checkNotNullParameter(update3, "$this$update");
                return gdc.k.a(update3, null, null, null, new l((String) obj3, ((l) obj4).f143139b), null, false, LDSFile.EF_SOD_TAG);
            case 10:
                return gdc.k.a((gdc.k) obj2, null, null, null, (com.revolut.feature.revolutpay.shared.ui.add_payment_method.a) obj4, null, ((u6c.j) obj3).d, 55);
            case 11:
                com.revolut.feature.acquiring.lite_pos.impl.ui.screen.catalogue.b bVar4 = (com.revolut.feature.acquiring.lite_pos.impl.ui.screen.catalogue.b) obj4;
                CatalogueScreenContract$ModalStep catalogueScreenContract$ModalStep = (CatalogueScreenContract$ModalStep) obj3;
                le1.d result = (le1.d) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                if (Intrinsics.f(result, d.a.f194434a)) {
                    bVar4.C2(new a.b(((CatalogueScreenContract$ModalStep.ShowCategoryItems) catalogueScreenContract$ModalStep).f60773a));
                } else {
                    if (!(result instanceof le1.e)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    le1.e eVar = (le1.e) result;
                    bVar4.C2(new g(eVar.f194435a, eVar.f194436b));
                }
                return Unit.f186387a;
            case 12:
                com.revolut.feature.retail.restaurants.impl.ui.flow.reservationcreation.a aVar3 = (com.revolut.feature.retail.restaurants.impl.ui.flow.reservationcreation.a) obj4;
                beb.i output4 = (beb.i) obj2;
                Intrinsics.checkNotNullParameter(output4, "output");
                ReservationCreationFlowContract$Step.Confirmation confirmation = (ReservationCreationFlowContract$Step.Confirmation) ((ReservationCreationFlowContract$Step) obj3);
                if (!Intrinsics.f(output4, i.a.f14738a)) {
                    throw new NoWhenBranchMatchedException();
                }
                oki.h.t2(aVar3, aVar3.o, new ReservationCreationFlowContract$Step.Details(confirmation.f82851a), false, null, false, 12);
                return Unit.f186387a;
            case 13:
                List subscriptions = (List) obj2;
                Intrinsics.checkNotNullParameter(subscriptions, "subscriptions");
                return ((gfj.a) obj4).f143411b.k0(subscriptions, (o3) obj3);
            case 14:
                List subscriptions2 = (List) obj2;
                Intrinsics.checkNotNullParameter(subscriptions2, "subscriptions");
                return ((gfj.b) obj4).f143413b.k0(subscriptions2, (o3) obj3);
            case 15:
                hfg.h0 h0Var3 = (hfg.h0) obj3;
                ghg.g gVar = (ghg.g) obj2;
                y yVar = ((com.revolut.feature.travel.miles.impl.ui.screen.flight_finder.c) obj4).f94293t;
                TravelMilesSearchLocation travelMilesSearchLocation2 = ((ghg.g) ((j2) yVar.f22677a).getValue()).e;
                if (travelMilesSearchLocation2 != null) {
                    travelMilesSearchLocation = travelMilesSearchLocation2;
                } else if (h0Var3 != null) {
                    travelMilesSearchLocation2 = h0Var3.f151845a;
                    travelMilesSearchLocation = travelMilesSearchLocation2;
                } else {
                    travelMilesSearchLocation = null;
                }
                TravelMilesSearchLocation travelMilesSearchLocation3 = ((ghg.g) ((j2) yVar.f22677a).getValue()).d;
                return ghg.g.a(gVar, null, null, null, travelMilesSearchLocation3 == null ? h0Var3 != null ? h0Var3.f151846b : null : travelMilesSearchLocation3, travelMilesSearchLocation, false, false, 103);
            case 16:
                ghk.j update4 = (ghk.j) obj2;
                Intrinsics.checkNotNullParameter(update4, "$this$update");
                return ghk.j.a(update4, null, (String) obj3, null, null, zi0.c.P((g1) obj4, false, null, 3), null, null, false, Constants.TAG_MPOS_MODULE_STATE);
            case 17:
                Address address = (Address) obj4;
                gi1.j jVar = (gi1.j) obj3;
                gi1.k update5 = (gi1.k) obj2;
                Intrinsics.checkNotNullParameter(update5, "$this$update");
                sh1.h hVarM2 = com.revolut.feature.address.common.impl.flow.screen.add.a.M2(address);
                Address.Type type = address.getType();
                String fullAddress = address.getFullAddress();
                if (fullAddress == null) {
                    fullAddress = "";
                }
                return gi1.k.a(update5, hVarM2, null, type, fullAddress, true, null, null, jVar, null, null, null, 64482);
            case 18:
                gi5.d dVar = (gi5.d) obj4;
                xi0.b bVar5 = (xi0.b) obj3;
                n user = (n) obj2;
                Intrinsics.checkNotNullParameter(user, "user");
                wi0.b bVarY = do3.q.y(user);
                if (com.bumptech.glide.d.q(bVarY)) {
                    dVar.f144093c = gi5.b.GB;
                    return gi5.d.e(bVar5);
                }
                if (com.bumptech.glide.d.r(bVarY)) {
                    if (((jte.d) dVar.f144092b).c(CryptoCommodityInvestApi$Toggles.CryptoIsraelExpansion.f71495c)) {
                        dVar.f144093c = gi5.b.ISRAEL;
                        return gi5.d.f();
                    }
                }
                dVar.f144093c = gi5.b.NONE;
                sh5.c.Companion.getClass();
                return sh5.b.a();
            case 19:
                ((gi9.c) obj4).e.insert((SQLiteConnection) obj2, (hi9.n) obj3);
                return null;
            case 20:
                ((gi9.c) obj4).f144103g.insert((SQLiteConnection) obj2, (hi9.b) obj3);
                return null;
            case 21:
                gi9.c cVar3 = (gi9.c) obj4;
                String str = (String) obj3;
                SQLiteConnection sQLiteConnection = (SQLiteConnection) obj2;
                SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * FROM plans WHERE plans.id = ? LIMIT 1");
                try {
                    if (str == null) {
                        sQLiteStatementPrepare.bindNull(1);
                    } else {
                        sQLiteStatementPrepare.bindText(1, str);
                    }
                    int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "id");
                    int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "facilityId");
                    int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "transactionId");
                    int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "merchantName");
                    int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "merchantLogoUrl");
                    int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "merchantLogoName");
                    int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "merchantCategory");
                    int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "startDateTime");
                    int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "updateDateTime");
                    int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "amount");
                    int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "paidAmount");
                    int columnIndexOrThrow12 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "remainingAmount");
                    int columnIndexOrThrow13 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "revPoints");
                    int columnIndexOrThrow14 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "fee");
                    int columnIndexOrThrow15 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "currency");
                    int columnIndexOrThrow16 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "state");
                    int columnIndexOrThrow17 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isLimitWithdrawn");
                    int columnIndexOrThrow18 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "feeType");
                    int columnIndexOrThrow19 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "origin");
                    int columnIndexOrThrow20 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "countryCode");
                    int columnIndexOrThrow21 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "instalmentType");
                    int columnIndexOrThrow22 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "termFeeRate");
                    int columnIndexOrThrow23 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "minFeeAmount");
                    int columnIndexOrThrow24 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "cancellationOrigin");
                    int columnIndexOrThrow25 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "rescheduleCount");
                    int columnIndexOrThrow26 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "withdrawalTransactionId");
                    int columnIndexOrThrow27 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "feeDetails");
                    ArrayMap arrayMap = new ArrayMap();
                    int i66 = columnIndexOrThrow12;
                    ArrayMap arrayMap2 = new ArrayMap();
                    while (sQLiteStatementPrepare.step()) {
                        if (sQLiteStatementPrepare.isNull(columnIndexOrThrow)) {
                            i22 = columnIndexOrThrow11;
                            text3 = null;
                        } else {
                            i22 = columnIndexOrThrow11;
                            text3 = sQLiteStatementPrepare.getText(columnIndexOrThrow);
                        }
                        if (text3 == null || arrayMap.containsKey(text3)) {
                            i32 = columnIndexOrThrow10;
                        } else {
                            i32 = columnIndexOrThrow10;
                            arrayMap.put(text3, new ArrayList());
                        }
                        String text4 = sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow);
                        if (text4 != null) {
                            arrayMap2.put(text4, null);
                        }
                        columnIndexOrThrow10 = i32;
                        columnIndexOrThrow11 = i22;
                    }
                    int i74 = columnIndexOrThrow10;
                    int i92 = columnIndexOrThrow11;
                    sQLiteStatementPrepare.reset();
                    cVar3.b(sQLiteConnection, arrayMap);
                    cVar3.a(sQLiteConnection, arrayMap2);
                    ArrayList arrayList = new ArrayList();
                    while (sQLiteStatementPrepare.step()) {
                        String text5 = sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow);
                        String text6 = sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2);
                        String text7 = sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3);
                        String text8 = sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow4);
                        String text9 = sQLiteStatementPrepare.isNull(columnIndexOrThrow5) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow5);
                        String text10 = sQLiteStatementPrepare.isNull(columnIndexOrThrow6) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow6);
                        String text11 = sQLiteStatementPrepare.isNull(columnIndexOrThrow7) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow7);
                        long j2 = sQLiteStatementPrepare.getLong(columnIndexOrThrow8);
                        long j3 = sQLiteStatementPrepare.getLong(columnIndexOrThrow9);
                        int i96 = i74;
                        long j5 = sQLiteStatementPrepare.getLong(i96);
                        int i99 = i92;
                        long j16 = sQLiteStatementPrepare.getLong(i99);
                        int i100 = i66;
                        long j22 = sQLiteStatementPrepare.getLong(i100);
                        int i101 = columnIndexOrThrow2;
                        int i102 = columnIndexOrThrow13;
                        Long lValueOf = sQLiteStatementPrepare.isNull(i102) ? null : Long.valueOf(sQLiteStatementPrepare.getLong(i102));
                        columnIndexOrThrow13 = i102;
                        int i103 = columnIndexOrThrow14;
                        long j42 = sQLiteStatementPrepare.getLong(i103);
                        columnIndexOrThrow14 = i103;
                        int i104 = columnIndexOrThrow15;
                        String text12 = sQLiteStatementPrepare.isNull(i104) ? null : sQLiteStatementPrepare.getText(i104);
                        columnIndexOrThrow15 = i104;
                        int i105 = columnIndexOrThrow16;
                        if (sQLiteStatementPrepare.isNull(i105)) {
                            text = null;
                            columnIndexOrThrow16 = i105;
                            i = columnIndexOrThrow4;
                        } else {
                            text = sQLiteStatementPrepare.getText(i105);
                            i = columnIndexOrThrow4;
                            columnIndexOrThrow16 = i105;
                        }
                        int i106 = columnIndexOrThrow17;
                        int i107 = columnIndexOrThrow3;
                        boolean z = ((int) sQLiteStatementPrepare.getLong(i106)) != 0;
                        int i108 = columnIndexOrThrow18;
                        String text13 = sQLiteStatementPrepare.isNull(i108) ? null : sQLiteStatementPrepare.getText(i108);
                        int i109 = columnIndexOrThrow19;
                        String text14 = sQLiteStatementPrepare.isNull(i109) ? null : sQLiteStatementPrepare.getText(i109);
                        int i110 = columnIndexOrThrow20;
                        String text15 = sQLiteStatementPrepare.isNull(i110) ? null : sQLiteStatementPrepare.getText(i110);
                        columnIndexOrThrow20 = i110;
                        int i111 = columnIndexOrThrow21;
                        String text16 = sQLiteStatementPrepare.isNull(i111) ? null : sQLiteStatementPrepare.getText(i111);
                        columnIndexOrThrow21 = i111;
                        int i112 = columnIndexOrThrow22;
                        String text17 = sQLiteStatementPrepare.isNull(i112) ? null : sQLiteStatementPrepare.getText(i112);
                        columnIndexOrThrow22 = i112;
                        int i113 = columnIndexOrThrow23;
                        long j46 = sQLiteStatementPrepare.getLong(i113);
                        columnIndexOrThrow23 = i113;
                        int i114 = columnIndexOrThrow24;
                        String text18 = sQLiteStatementPrepare.isNull(i114) ? null : sQLiteStatementPrepare.getText(i114);
                        columnIndexOrThrow24 = i114;
                        int i115 = columnIndexOrThrow25;
                        if (sQLiteStatementPrepare.isNull(i115)) {
                            i2 = i108;
                            i3 = i109;
                            numValueOf = null;
                        } else {
                            i2 = i108;
                            i3 = i109;
                            numValueOf = Integer.valueOf((int) sQLiteStatementPrepare.getLong(i115));
                        }
                        int i116 = columnIndexOrThrow26;
                        String text19 = sQLiteStatementPrepare.isNull(i116) ? null : sQLiteStatementPrepare.getText(i116);
                        int i117 = columnIndexOrThrow27;
                        if (sQLiteStatementPrepare.isNull(i117)) {
                            i5 = i115;
                            text2 = null;
                        } else {
                            i5 = i115;
                            text2 = sQLiteStatementPrepare.getText(i117);
                        }
                        if (text2 != null) {
                            i6 = i116;
                            Json json = (Json) bj9.a.f15588a.getValue();
                            json.getClass();
                            i21 = i117;
                            cVar = (hi9.c) json.b(nlm.a.c(hi9.c.INSTANCE.serializer()), text2);
                        } else {
                            i6 = i116;
                            i21 = i117;
                            cVar = null;
                        }
                        hi9.k kVar = new hi9.k(text5, text6, text7, text8, text9, text10, text11, j2, j3, j5, j16, j22, lValueOf, j42, text12, text, z, text13, text14, text15, text16, text17, j46, text18, numValueOf, text19, cVar);
                        String text20 = sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow);
                        ArrayList arrayList2 = text20 != null ? (ArrayList) arrayMap.get(text20) : new ArrayList();
                        String text21 = sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow);
                        ArrayMap arrayMap3 = arrayMap;
                        arrayList.add(new ki9.a(kVar, arrayList2, text21 != null ? (hi9.l) arrayMap2.get(text21) : null));
                        columnIndexOrThrow3 = i107;
                        columnIndexOrThrow17 = i106;
                        columnIndexOrThrow18 = i2;
                        columnIndexOrThrow19 = i3;
                        arrayMap = arrayMap3;
                        columnIndexOrThrow25 = i5;
                        columnIndexOrThrow2 = i101;
                        columnIndexOrThrow4 = i;
                        columnIndexOrThrow26 = i6;
                        columnIndexOrThrow27 = i21;
                        i74 = i96;
                        i92 = i99;
                        i66 = i100;
                        break;
                    }
                    sQLiteStatementPrepare.close();
                    return arrayList;
                } catch (Throwable th10) {
                    sQLiteStatementPrepare.close();
                    throw th10;
                }
            case 22:
                Pair pair = (Pair) obj4;
                Object obj6 = pair.f186385a;
                Intrinsics.checkNotNullExpressionValue(obj6, "<get-first>(...)");
                Data data = (Data) obj6;
                Object obj7 = pair.f186386b;
                Intrinsics.checkNotNullExpressionValue(obj7, "<get-second>(...)");
                return gk7.f.a((gk7.f) obj2, (Data) obj7, ((gk7.m) obj3).f144346t.b(), null, data, 4);
            case 23:
                yki.b bVar6 = (yki.b) obj4;
                OpenBankingConsentsFlowContract$Step openBankingConsentsFlowContract$Step = (OpenBankingConsentsFlowContract$Step) obj3;
                ConsentDetailsScreenContract$OutputData result2 = (ConsentDetailsScreenContract$OutputData) obj2;
                Intrinsics.checkNotNullParameter(result2, "result");
                if (!(result2 instanceof ConsentDetailsScreenContract$OutputData.RevokeClicked)) {
                    throw new NoWhenBranchMatchedException();
                }
                OpenBankingConsentsFlowContract$Step.ConsentDetails consentDetails = (OpenBankingConsentsFlowContract$Step.ConsentDetails) openBankingConsentsFlowContract$Step;
                oki.h.w2(bVar6, new OpenBankingConsentsFlowContract$Step.RevokeDialog(consentDetails.f72744a.getF60399b(), ((ConsentDetailsScreenContract$OutputData.RevokeClicked) result2).f72774a, consentDetails.f72746c, consentDetails.d), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                return Unit.f186387a;
            case 24:
                com.revolut.feature.external_accounts.impl.ui.consents_kompot.c cVar4 = (com.revolut.feature.external_accounts.impl.ui.consents_kompot.c) obj4;
                OpenBankingConsentsFlowContract$Step openBankingConsentsFlowContract$Step2 = (OpenBankingConsentsFlowContract$Step) obj3;
                am6.d result3 = (am6.d) obj2;
                Intrinsics.checkNotNullParameter(result3, "result");
                if (!Intrinsics.f(result3, d.a.f6289a)) {
                    if (!(result3 instanceof d.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    OpenBankingConsentsFlowContract$Step.RevokeDialog revokeDialog = (OpenBankingConsentsFlowContract$Step.RevokeDialog) openBankingConsentsFlowContract$Step2;
                    cVar4.l2(new o(cVar4, revokeDialog.f72752c, revokeDialog.f72751b, revokeDialog.d, (Continuation) null, 1), new yi5.b(i43));
                }
                return Unit.f186387a;
            case 25:
                com.revolut.feature.external_accounts.impl.ui.flow.cross_border.link_account.d dVar2 = (com.revolut.feature.external_accounts.impl.ui.flow.cross_border.link_account.d) obj4;
                CrossBorderLinkAccountFlowContract$Step crossBorderLinkAccountFlowContract$Step = (CrossBorderLinkAccountFlowContract$Step) obj3;
                tn6.h result4 = (tn6.h) obj2;
                Intrinsics.checkNotNullParameter(result4, "result");
                if (Intrinsics.f(result4, h.a.f272316a)) {
                    CrossBorderLinkAccountFlowContract$Step.Consent consent = (CrossBorderLinkAccountFlowContract$Step.Consent) crossBorderLinkAccountFlowContract$Step;
                    dVar2.n2(new g0a.e(10, dVar2, consent.f72870a, consent.f72872c, consent.f72871b, null), new whi.b(i59));
                } else {
                    if (!Intrinsics.f(result4, h.b.f272317a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    dVar2.B2();
                }
                return Unit.f186387a;
            case 26:
                Intrinsics.checkNotNullParameter((com.revolut.feature.insurance_car.impl.ui.flow.onboarding.proof_of_driving_number.a) obj2, "it");
                ((com.revolut.feature.insurance_car.impl.ui.flow.mta.b) obj4).P2(new MtaFlowContract$Step.Review(((MtaFlowContract$Step.ProofOfDrivingNumber) obj3).f75374b));
                return Unit.f186387a;
            case 27:
                knh.h hVar = (knh.h) obj3;
                List it9 = (List) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                List listV0 = d0.V0(it9, ((gnh.h) obj4).f145001a);
                if ((hVar instanceof knh.b) || (hVar instanceof knh.c) || (hVar instanceof knh.g) || (hVar instanceof knh.f)) {
                    List<enh.a> list2 = listV0;
                    ArrayList arrayList3 = new ArrayList(w.t(list2, 10));
                    for (enh.a aVar4 : list2) {
                        arrayList3.add(new p5d.b(aVar4.f127830a.a(), zi0.c.N(aVar4.f127830a), null));
                    }
                    list = arrayList3;
                } else {
                    if (!Intrinsics.f(hVar, knh.e.f186168a) && !(hVar instanceof knh.d)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    list = f0.f322471a;
                }
                return new gnh.i(hVar, listV0, list);
            case 28:
                com.revolut.feature.tax_residency.impl.flows.tin.a aVar5 = (com.revolut.feature.tax_residency.impl.flows.tin.a) obj4;
                zme.l lVar = (zme.l) obj3;
                boe.g result5 = (boe.g) obj2;
                Intrinsics.checkNotNullParameter(result5, "result");
                boe.f fVar = result5 instanceof boe.f ? (boe.f) result5 : null;
                aVar5.G2(new goe.b(new zme.f(lVar.f323500a, null, null, false, null, null, 62), fVar != null, (fVar == null || fVar.f17398a) ? false : true, null));
                return Unit.f186387a;
            default:
                com.revolut.feature.crypto.withdraw.impl.ui_v3.beneficiarydetails.a aVar6 = (com.revolut.feature.crypto.withdraw.impl.ui_v3.beneficiarydetails.a) obj4;
                CryptoBeneficiaryDetailsScreenInternalContract$ModalStep cryptoBeneficiaryDetailsScreenInternalContract$ModalStep = (CryptoBeneficiaryDetailsScreenInternalContract$ModalStep) obj3;
                dii.g outputData = (dii.g) obj2;
                Intrinsics.checkNotNullParameter(outputData, "outputData");
                if (outputData instanceof dii.e) {
                    aVar6.C2(new lo5.i(((CryptoBeneficiaryDetailsScreenInternalContract$ModalStep.BelongToYouDialog) cryptoBeneficiaryDetailsScreenInternalContract$ModalStep).f71285a, true));
                } else if (outputData instanceof dii.f) {
                    aVar6.C2(new lo5.i(((CryptoBeneficiaryDetailsScreenInternalContract$ModalStep.BelongToYouDialog) cryptoBeneficiaryDetailsScreenInternalContract$ModalStep).f71285a, false));
                }
                return Unit.f186387a;
        }
    }

    public /* synthetic */ c(Object obj2, Object obj3, int i) {
        this.f142264a = i;
        this.f142265b = obj2;
        this.f142266c = obj3;
    }

    public /* synthetic */ c(String str, l lVar) {
        this.f142264a = 9;
        this.f142266c = str;
        this.f142265b = lVar;
    }

    public /* synthetic */ c(oki.h hVar, Object obj2, Object obj3, int i) {
        this.f142264a = i;
        this.f142265b = obj2;
        this.f142266c = obj3;
    }
}
