package is6;

import androidx.room.util.SQLiteStatementUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import com.revolut.data.network.models.wallet.account.AccountDetailsDto;
import com.revolut.data.network.models.wallet.account.PixDto;
import com.revolut.data.network.models.wallet.account.TedDto;
import com.revolut.feature.address.models.Address;
import com.revolut.feature.three_ds_verification.impl.ui.sceen.ThreeDsVerificationScreenContract$ModalStep;
import com.revolut.feature.travel.experiences.impl.ui.flow.home.TravelExperiencesHomeFlowContract$Step;
import com.revolut.shared.feature.wealth.models.account.WealthAccountType;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import n3f.c0;
import skm.p0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class t implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f168135a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f168136b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f168137c;

    public /* synthetic */ t(com.revolut.feature.three_ds_verification.impl.ui.sceen.d dVar, com.revolut.kompot.navigable.vc.modal.a aVar, ThreeDsVerificationScreenContract$ModalStep threeDsVerificationScreenContract$ModalStep) {
        this.f168135a = 7;
        this.f168136b = aVar;
        this.f168137c = threeDsVerificationScreenContract$ModalStep;
    }

    private final Object a(Object obj2) {
        com.revolut.feature.travel.experiences.impl.ui.flow.home.b bVar = (com.revolut.feature.travel.experiences.impl.ui.flow.home.b) this.f168136b;
        TravelExperiencesHomeFlowContract$Step.OptIn optIn = (TravelExperiencesHomeFlowContract$Step.OptIn) this.f168137c;
        hub.b result = (hub.b) obj2;
        Intrinsics.checkNotNullParameter(result, "result");
        if (result.f155599b) {
            oki.h.t2(bVar, bVar.u, optIn.f92993a, false, null, false, 12);
        } else {
            oki.h.D2(bVar.u);
        }
        return Unit.f186387a;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object b(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.Object r0 = r8.f168136b
            r4 = r0
            com.revolut.data.model.Data r4 = (com.revolut.data.model.Data) r4
            java.lang.Object r0 = r8.f168137c
            com.revolut.feature.rev_points.spare_change.impl.ui.screen.full_list_spare_change.a r0 = (com.revolut.feature.rev_points.spare_change.impl.ui.screen.full_list_spare_change.a) r0
            cli.y r0 = r0.v
            r1 = r9
            j2c.f r1 = (j2c.f) r1
            java.lang.Object r9 = r4.getContent()
            java.util.List r9 = (java.util.List) r9
            if (r9 == 0) goto L40
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.util.Iterator r9 = r9.iterator()
        L1c:
            boolean r2 = r9.hasNext()
            if (r2 == 0) goto L30
            java.lang.Object r2 = r9.next()
            r3 = r2
            yvh.b r3 = (yvh.b) r3
            yvh.h r3 = r3.e
            yvh.h r5 = yvh.h.LOYALTY_PROFILE
            if (r3 != r5) goto L1c
            goto L31
        L30:
            r2 = 0
        L31:
            yvh.b r2 = (yvh.b) r2
            if (r2 == 0) goto L40
            java.lang.Float r9 = r2.i
            if (r9 == 0) goto L40
            float r9 = r9.floatValue()
            int r9 = (int) r9
        L3e:
            r2 = r9
            goto L4d
        L40:
            java.lang.Object r9 = r0.f22677a
            vkm.j2 r9 = (vkm.j2) r9
            java.lang.Object r9 = r9.getValue()
            j2c.f r9 = (j2c.f) r9
            int r9 = r9.f170806a
            goto L3e
        L4d:
            java.lang.Object r9 = r0.f22677a
            vkm.j2 r9 = (vkm.j2) r9
            java.lang.Object r9 = r9.getValue()
            j2c.f r9 = (j2c.f) r9
            j2c.l r9 = r9.f170807b
            boolean r9 = r9 instanceof j2c.k
            if (r9 == 0) goto L68
            j2c.k r9 = new j2c.k
            int r0 = p2c.a.a(r2)
            r9.<init>(r0)
        L66:
            r3 = r9
            goto L75
        L68:
            java.lang.Object r9 = r0.f22677a
            vkm.j2 r9 = (vkm.j2) r9
            java.lang.Object r9 = r9.getValue()
            j2c.f r9 = (j2c.f) r9
            j2c.l r9 = r9.f170807b
            goto L66
        L75:
            r6 = 0
            r7 = 24
            r5 = 0
            j2c.f r9 = j2c.f.a(r1, r2, r3, r4, r5, r6, r7)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: is6.t.b(java.lang.Object):java.lang.Object");
    }

    private final Object c(Object obj2) {
        j2d.e eVar = (j2d.e) this.f168136b;
        Set assetTypeKeys = (Set) this.f168137c;
        Boolean isEnabled = (Boolean) obj2;
        Intrinsics.checkNotNullParameter(isEnabled, "isEnabled");
        if (!isEnabled.booleanValue()) {
            return pfm.m.f235744a;
        }
        l2d.n nVar = (l2d.n) eVar.f170838a;
        Intrinsics.checkNotNullParameter(assetTypeKeys, "assetTypeKeys");
        return pd.b.n(p0.f264003c, new kq5.d(nVar, assetTypeKeys, null, 26));
    }

    private final Object d(Object obj2) {
        String zenginBranchCode;
        io3.l lVar;
        ArrayList arrayList;
        j31.g gVar = (j31.g) this.f168136b;
        io3.l pocketType = (io3.l) this.f168137c;
        List<AccountDetailsDto> list = (List) obj2;
        Intrinsics.checkNotNullParameter(list, "list");
        ArrayList arrayList2 = new ArrayList();
        for (AccountDetailsDto dto : list) {
            gVar.d.getClass();
            Intrinsics.checkNotNullParameter(dto, "dto");
            Intrinsics.checkNotNullParameter(pocketType, "pocketType");
            ArrayList arrayList3 = arrayList2;
            String id10 = dto.getId();
            String sortCode = dto.getSortCode();
            String accountNumber = dto.getAccountNumber();
            String bankName = dto.getBankName();
            String bic2 = dto.getBic();
            String currency = dto.getCurrency();
            n71.b bVar = null;
            if (currency == null) {
                lVar = pocketType;
                arrayList = arrayList3;
            } else {
                String iban = dto.getIban();
                no3.b address = dto.getAddress();
                Address addressA = address != null ? oo3.a.a(address) : null;
                String beneficiaryName = dto.getBeneficiaryName();
                Address address2 = addressA;
                Boolean personal = dto.getPersonal();
                Boolean local = dto.getLocal();
                Boolean activate = dto.getActivate();
                Boolean kycRequired = dto.getKycRequired();
                String requiredReference = dto.getRequiredReference();
                String transferTime = dto.getTransferTime();
                String achRoutingNumber = dto.getAchRoutingNumber();
                String bsb2 = dto.getBsb();
                String bankCode = dto.getBankCode();
                if (bankCode == null) {
                    TedDto ted2 = dto.getTed();
                    bankCode = ted2 != null ? ted2.getBankCode() : null;
                    if (bankCode == null) {
                        bankCode = dto.getZenginBankCode();
                    }
                }
                String transitNumber = dto.getTransitNumber();
                String str = bankCode;
                String institutionNumber = dto.getInstitutionNumber();
                String fedwireRoutingNumber = dto.getFedwireRoutingNumber();
                PixDto pix = dto.getPix();
                n71.a aVarD = pix != null ? pyd.c.d(pix) : null;
                TedDto ted3 = dto.getTed();
                n71.c cVarE = ted3 != null ? pyd.c.e(ted3) : null;
                String bankNameCode = dto.getBankNameCode();
                String branchName = dto.getBranchName();
                TedDto ted4 = dto.getTed();
                if (ted4 == null || (zenginBranchCode = ted4.getBranchCode()) == null) {
                    zenginBranchCode = dto.getZenginBranchCode();
                }
                lVar = pocketType;
                arrayList = arrayList3;
                bVar = new n71.b(id10, currency, sortCode, accountNumber, bankName, bic2, iban, address2, beneficiaryName, personal, local, activate, kycRequired, requiredReference, transferTime, achRoutingNumber, bsb2, str, transitNumber, institutionNumber, lVar, fedwireRoutingNumber, aVarD, cVarE, bankNameCode, branchName, zenginBranchCode, dto.getAccountType(), dto.getAccountTypeCode(), dto.getBranchNameLatin(), dto.getBankNameAndAddress(), dto.getIntermediaryBic());
            }
            if (bVar != null) {
                arrayList.add(bVar);
            }
            arrayList2 = arrayList;
            pocketType = lVar;
        }
        return arrayList2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object e(Object obj2) {
        Boolean boolValueOf;
        j3f.h hVar = (j3f.h) this.f168136b;
        String str = (String) this.f168137c;
        hVar.getClass();
        SQLiteStatement sQLiteStatementPrepare = ((SQLiteConnection) obj2).prepare("SELECT * FROM trading_trades WHERE compound_id = ?");
        try {
            if (str == null) {
                sQLiteStatementPrepare.bindNull(1);
            } else {
                sQLiteStatementPrepare.bindText(1, str);
            }
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "trade_id");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "compound_id");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "ref");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "holding_id");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "state");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "completed_at");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "updated_at");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "created_at");
            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "stock_trade");
            int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "cash_trade");
            int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "dividend_trade");
            int columnIndexOrThrow12 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "coupon");
            int columnIndexOrThrow13 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "redemption");
            int columnIndexOrThrow14 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "custody_fees");
            int columnIndexOrThrow15 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "margin_trade");
            int columnIndexOrThrow16 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "commodity_trade");
            int columnIndexOrThrow17 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "exchange_trade");
            int columnIndexOrThrow18 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "stock_transfer_trade");
            int columnIndexOrThrow19 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "cash_transfer_trade");
            int columnIndexOrThrow20 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "fee_trade");
            int columnIndexOrThrow21 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "fund_trade");
            int columnIndexOrThrow22 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "value");
            int columnIndexOrThrow23 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "settlementDate");
            int columnIndexOrThrow24 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "slip_transaction");
            int columnIndexOrThrow25 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "stock_transfer_fee");
            int columnIndexOrThrow26 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "commission_refund");
            int columnIndexOrThrow27 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "refund");
            int columnIndexOrThrow28 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "overnight_fee");
            int columnIndexOrThrow29 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "standing_order_id");
            int columnIndexOrThrow30 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "client_order_id");
            int columnIndexOrThrow31 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "account_type");
            int columnIndexOrThrow32 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "portfolio_id");
            int columnIndexOrThrow33 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "price_adjustment");
            int columnIndexOrThrow34 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "base_instrument_currency");
            int columnIndexOrThrow35 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "counter_instrument_currency");
            int columnIndexOrThrow36 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "badge");
            int columnIndexOrThrow37 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "deficit_adjustment");
            int columnIndexOrThrow38 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "stock_promotion_clawback");
            int columnIndexOrThrow39 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "transfer_request_id");
            int columnIndexOrThrow40 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "merger");
            int columnIndexOrThrow41 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "spin_off");
            int columnIndexOrThrow42 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "stock_split");
            int columnIndexOrThrow43 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "initiated_by");
            int columnIndexOrThrow44 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "account_holder_type");
            int columnIndexOrThrow45 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "awaiting_settlement");
            int columnIndexOrThrow46 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "currency_pair_first");
            int columnIndexOrThrow47 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "currency_pair_second");
            if (sQLiteStatementPrepare.step()) {
                String text = sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow);
                String text2 = sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2);
                String text3 = sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3);
                String text4 = sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow4);
                String text5 = sQLiteStatementPrepare.isNull(columnIndexOrThrow5) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow5);
                Long lValueOf = sQLiteStatementPrepare.isNull(columnIndexOrThrow6) ? null : Long.valueOf(sQLiteStatementPrepare.getLong(columnIndexOrThrow6));
                Long lValueOf2 = sQLiteStatementPrepare.isNull(columnIndexOrThrow7) ? null : Long.valueOf(sQLiteStatementPrepare.getLong(columnIndexOrThrow7));
                long j2 = sQLiteStatementPrepare.getLong(columnIndexOrThrow8);
                n3f.y yVarI = r3f.a.i(sQLiteStatementPrepare.isNull(columnIndexOrThrow9) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow9));
                n3f.c cVarA = r3f.a.a(sQLiteStatementPrepare.isNull(columnIndexOrThrow10) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow10));
                n3f.i iVarF = r3f.a.f(sQLiteStatementPrepare.isNull(columnIndexOrThrow11) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow11));
                n3f.f fVarD = r3f.a.d(sQLiteStatementPrepare.isNull(columnIndexOrThrow12) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow12));
                n3f.u uVarP = r3f.a.p(sQLiteStatementPrepare.isNull(columnIndexOrThrow13) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow13));
                n3f.h hVarE = r3f.a.e(sQLiteStatementPrepare.isNull(columnIndexOrThrow14) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow14));
                n3f.q qVarL = r3f.a.l(sQLiteStatementPrepare.isNull(columnIndexOrThrow15) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow15));
                n3f.e eVarC = r3f.a.c(sQLiteStatementPrepare.isNull(columnIndexOrThrow16) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow16));
                n3f.l lVarG = r3f.a.g(sQLiteStatementPrepare.isNull(columnIndexOrThrow17) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow17));
                n3f.z zVarT = r3f.a.t(sQLiteStatementPrepare.isNull(columnIndexOrThrow18) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow18));
                n3f.d dVarB = r3f.a.b(sQLiteStatementPrepare.isNull(columnIndexOrThrow19) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow19));
                n3f.m mVarV = r3f.a.v(sQLiteStatementPrepare.isNull(columnIndexOrThrow20) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow20));
                n3f.o oVarH = r3f.a.h(sQLiteStatementPrepare.isNull(columnIndexOrThrow21) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow21));
                n3f.p pVarK = r3f.a.k(sQLiteStatementPrepare.isNull(columnIndexOrThrow22) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow22));
                Instant instantJ = b21.a.j(sQLiteStatementPrepare.isNull(columnIndexOrThrow23) ? null : Long.valueOf(sQLiteStatementPrepare.getLong(columnIndexOrThrow23)));
                boolean z = ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow24)) != 0;
                boolean z3 = ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow25)) != 0;
                boolean z4 = ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow26)) != 0;
                n3f.v vVarQ = r3f.a.q(sQLiteStatementPrepare.isNull(columnIndexOrThrow27) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow27));
                n3f.s sVarN = r3f.a.n(sQLiteStatementPrepare.isNull(columnIndexOrThrow28) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow28));
                String text6 = sQLiteStatementPrepare.isNull(columnIndexOrThrow29) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow29);
                String text7 = sQLiteStatementPrepare.isNull(columnIndexOrThrow30) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow30);
                WealthAccountType wealthAccountTypeU = r3f.a.u(sQLiteStatementPrepare.isNull(columnIndexOrThrow31) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow31));
                String text8 = sQLiteStatementPrepare.isNull(columnIndexOrThrow32) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow32);
                n3f.t tVarO = r3f.a.o(sQLiteStatementPrepare.isNull(columnIndexOrThrow33) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow33));
                String text9 = sQLiteStatementPrepare.isNull(columnIndexOrThrow34) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow34);
                String text10 = sQLiteStatementPrepare.isNull(columnIndexOrThrow35) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow35);
                String text11 = sQLiteStatementPrepare.isNull(columnIndexOrThrow36) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow36);
                boolean z6 = ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow37)) != 0;
                boolean z11 = ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow38)) != 0;
                String text12 = sQLiteStatementPrepare.isNull(columnIndexOrThrow39) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow39);
                n3f.r rVarM = r3f.a.m(sQLiteStatementPrepare.isNull(columnIndexOrThrow40) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow40));
                n3f.w wVarR = r3f.a.r(sQLiteStatementPrepare.isNull(columnIndexOrThrow41) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow41));
                n3f.x xVarS = r3f.a.s(sQLiteStatementPrepare.isNull(columnIndexOrThrow42) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow42));
                n3f.n nVarJ = r3f.a.j(sQLiteStatementPrepare.isNull(columnIndexOrThrow43) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow43));
                String text13 = sQLiteStatementPrepare.isNull(columnIndexOrThrow44) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow44);
                Integer numValueOf = sQLiteStatementPrepare.isNull(columnIndexOrThrow45) ? null : Integer.valueOf((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow45));
                if (numValueOf == null) {
                    boolValueOf = null;
                } else {
                    boolValueOf = Boolean.valueOf(numValueOf.intValue() != 0);
                }
                c0Var = new c0(text, text2, text3, text4, text5, lValueOf, lValueOf2, j2, yVarI, cVarA, iVarF, fVarD, uVarP, hVarE, qVarL, eVarC, lVarG, zVarT, dVarB, mVarV, oVarH, pVarK, instantJ, z, z3, z4, vVarQ, sVarN, text6, text7, wealthAccountTypeU, text8, tVarO, text9, text10, text11, z6, z11, text12, rVarM, wVarR, xVarS, nVarJ, text13, boolValueOf, sQLiteStatementPrepare.isNull(columnIndexOrThrow46) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow46), sQLiteStatementPrepare.isNull(columnIndexOrThrow47) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow47));
            }
            sQLiteStatementPrepare.close();
            return c0Var;
        } catch (Throwable th10) {
            sQLiteStatementPrepare.close();
            throw th10;
        }
    }

    private final Object g(Object obj2) {
        j3f.h hVar = (j3f.h) this.f168136b;
        List list = (List) this.f168137c;
        hVar.f171186b.insert((SQLiteConnection) obj2, (Iterable) list);
        return Unit.f186387a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0511  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0535 A[LOOP:6: B:161:0x052f->B:163:0x0535, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:328:0x0a60  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x0a63 A[Catch: all -> 0x082b, TryCatch #0 {all -> 0x082b, blocks: (B:241:0x0827, B:245:0x0831, B:247:0x090b, B:251:0x091a, B:255:0x0929, B:259:0x0938, B:263:0x0947, B:267:0x0956, B:271:0x0965, B:275:0x0972, B:279:0x0985, B:283:0x0998, B:287:0x09a7, B:291:0x09b6, B:295:0x09c3, B:299:0x09d4, B:303:0x09e7, B:307:0x09fa, B:311:0x0a0d, B:315:0x0a32, B:317:0x0a3e, B:319:0x0a46, B:326:0x0a5a, B:330:0x0a67, B:334:0x0a74, B:338:0x0a81, B:339:0x0a89, B:341:0x0a8f, B:347:0x0a9f, B:351:0x0ab0, B:352:0x0ab8, B:354:0x0abe, B:360:0x0ace, B:364:0x0adf, B:365:0x0ae7, B:367:0x0aed, B:376:0x0b0f, B:371:0x0af7, B:375:0x0b08, B:374:0x0b04, B:363:0x0adb, B:350:0x0aac, B:337:0x0a7d, B:333:0x0a70, B:329:0x0a63, B:314:0x0a2e, B:310:0x0a09, B:306:0x09f6, B:302:0x09e3, B:298:0x09d0, B:294:0x09bf, B:290:0x09b0, B:286:0x09a1, B:282:0x0992, B:278:0x097f, B:274:0x096e, B:270:0x095f, B:266:0x0950, B:262:0x0941, B:258:0x0932, B:254:0x0923, B:250:0x0914, B:244:0x082e), top: B:389:0x0825 }] */
    /* JADX WARN: Removed duplicated region for block: B:332:0x0a6d  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x0a70 A[Catch: all -> 0x082b, TryCatch #0 {all -> 0x082b, blocks: (B:241:0x0827, B:245:0x0831, B:247:0x090b, B:251:0x091a, B:255:0x0929, B:259:0x0938, B:263:0x0947, B:267:0x0956, B:271:0x0965, B:275:0x0972, B:279:0x0985, B:283:0x0998, B:287:0x09a7, B:291:0x09b6, B:295:0x09c3, B:299:0x09d4, B:303:0x09e7, B:307:0x09fa, B:311:0x0a0d, B:315:0x0a32, B:317:0x0a3e, B:319:0x0a46, B:326:0x0a5a, B:330:0x0a67, B:334:0x0a74, B:338:0x0a81, B:339:0x0a89, B:341:0x0a8f, B:347:0x0a9f, B:351:0x0ab0, B:352:0x0ab8, B:354:0x0abe, B:360:0x0ace, B:364:0x0adf, B:365:0x0ae7, B:367:0x0aed, B:376:0x0b0f, B:371:0x0af7, B:375:0x0b08, B:374:0x0b04, B:363:0x0adb, B:350:0x0aac, B:337:0x0a7d, B:333:0x0a70, B:329:0x0a63, B:314:0x0a2e, B:310:0x0a09, B:306:0x09f6, B:302:0x09e3, B:298:0x09d0, B:294:0x09bf, B:290:0x09b0, B:286:0x09a1, B:282:0x0992, B:278:0x097f, B:274:0x096e, B:270:0x095f, B:266:0x0950, B:262:0x0941, B:258:0x0932, B:254:0x0923, B:250:0x0914, B:244:0x082e), top: B:389:0x0825 }] */
    /* JADX WARN: Removed duplicated region for block: B:336:0x0a7a  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x0a7d A[Catch: all -> 0x082b, TryCatch #0 {all -> 0x082b, blocks: (B:241:0x0827, B:245:0x0831, B:247:0x090b, B:251:0x091a, B:255:0x0929, B:259:0x0938, B:263:0x0947, B:267:0x0956, B:271:0x0965, B:275:0x0972, B:279:0x0985, B:283:0x0998, B:287:0x09a7, B:291:0x09b6, B:295:0x09c3, B:299:0x09d4, B:303:0x09e7, B:307:0x09fa, B:311:0x0a0d, B:315:0x0a32, B:317:0x0a3e, B:319:0x0a46, B:326:0x0a5a, B:330:0x0a67, B:334:0x0a74, B:338:0x0a81, B:339:0x0a89, B:341:0x0a8f, B:347:0x0a9f, B:351:0x0ab0, B:352:0x0ab8, B:354:0x0abe, B:360:0x0ace, B:364:0x0adf, B:365:0x0ae7, B:367:0x0aed, B:376:0x0b0f, B:371:0x0af7, B:375:0x0b08, B:374:0x0b04, B:363:0x0adb, B:350:0x0aac, B:337:0x0a7d, B:333:0x0a70, B:329:0x0a63, B:314:0x0a2e, B:310:0x0a09, B:306:0x09f6, B:302:0x09e3, B:298:0x09d0, B:294:0x09bf, B:290:0x09b0, B:286:0x09a1, B:282:0x0992, B:278:0x097f, B:274:0x096e, B:270:0x095f, B:266:0x0950, B:262:0x0941, B:258:0x0932, B:254:0x0923, B:250:0x0914, B:244:0x082e), top: B:389:0x0825 }] */
    /* JADX WARN: Removed duplicated region for block: B:341:0x0a8f A[Catch: all -> 0x082b, TryCatch #0 {all -> 0x082b, blocks: (B:241:0x0827, B:245:0x0831, B:247:0x090b, B:251:0x091a, B:255:0x0929, B:259:0x0938, B:263:0x0947, B:267:0x0956, B:271:0x0965, B:275:0x0972, B:279:0x0985, B:283:0x0998, B:287:0x09a7, B:291:0x09b6, B:295:0x09c3, B:299:0x09d4, B:303:0x09e7, B:307:0x09fa, B:311:0x0a0d, B:315:0x0a32, B:317:0x0a3e, B:319:0x0a46, B:326:0x0a5a, B:330:0x0a67, B:334:0x0a74, B:338:0x0a81, B:339:0x0a89, B:341:0x0a8f, B:347:0x0a9f, B:351:0x0ab0, B:352:0x0ab8, B:354:0x0abe, B:360:0x0ace, B:364:0x0adf, B:365:0x0ae7, B:367:0x0aed, B:376:0x0b0f, B:371:0x0af7, B:375:0x0b08, B:374:0x0b04, B:363:0x0adb, B:350:0x0aac, B:337:0x0a7d, B:333:0x0a70, B:329:0x0a63, B:314:0x0a2e, B:310:0x0a09, B:306:0x09f6, B:302:0x09e3, B:298:0x09d0, B:294:0x09bf, B:290:0x09b0, B:286:0x09a1, B:282:0x0992, B:278:0x097f, B:274:0x096e, B:270:0x095f, B:266:0x0950, B:262:0x0941, B:258:0x0932, B:254:0x0923, B:250:0x0914, B:244:0x082e), top: B:389:0x0825 }] */
    /* JADX WARN: Removed duplicated region for block: B:346:0x0a9d  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x0aa9  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x0aac A[Catch: all -> 0x082b, TryCatch #0 {all -> 0x082b, blocks: (B:241:0x0827, B:245:0x0831, B:247:0x090b, B:251:0x091a, B:255:0x0929, B:259:0x0938, B:263:0x0947, B:267:0x0956, B:271:0x0965, B:275:0x0972, B:279:0x0985, B:283:0x0998, B:287:0x09a7, B:291:0x09b6, B:295:0x09c3, B:299:0x09d4, B:303:0x09e7, B:307:0x09fa, B:311:0x0a0d, B:315:0x0a32, B:317:0x0a3e, B:319:0x0a46, B:326:0x0a5a, B:330:0x0a67, B:334:0x0a74, B:338:0x0a81, B:339:0x0a89, B:341:0x0a8f, B:347:0x0a9f, B:351:0x0ab0, B:352:0x0ab8, B:354:0x0abe, B:360:0x0ace, B:364:0x0adf, B:365:0x0ae7, B:367:0x0aed, B:376:0x0b0f, B:371:0x0af7, B:375:0x0b08, B:374:0x0b04, B:363:0x0adb, B:350:0x0aac, B:337:0x0a7d, B:333:0x0a70, B:329:0x0a63, B:314:0x0a2e, B:310:0x0a09, B:306:0x09f6, B:302:0x09e3, B:298:0x09d0, B:294:0x09bf, B:290:0x09b0, B:286:0x09a1, B:282:0x0992, B:278:0x097f, B:274:0x096e, B:270:0x095f, B:266:0x0950, B:262:0x0941, B:258:0x0932, B:254:0x0923, B:250:0x0914, B:244:0x082e), top: B:389:0x0825 }] */
    /* JADX WARN: Removed duplicated region for block: B:354:0x0abe A[Catch: all -> 0x082b, TryCatch #0 {all -> 0x082b, blocks: (B:241:0x0827, B:245:0x0831, B:247:0x090b, B:251:0x091a, B:255:0x0929, B:259:0x0938, B:263:0x0947, B:267:0x0956, B:271:0x0965, B:275:0x0972, B:279:0x0985, B:283:0x0998, B:287:0x09a7, B:291:0x09b6, B:295:0x09c3, B:299:0x09d4, B:303:0x09e7, B:307:0x09fa, B:311:0x0a0d, B:315:0x0a32, B:317:0x0a3e, B:319:0x0a46, B:326:0x0a5a, B:330:0x0a67, B:334:0x0a74, B:338:0x0a81, B:339:0x0a89, B:341:0x0a8f, B:347:0x0a9f, B:351:0x0ab0, B:352:0x0ab8, B:354:0x0abe, B:360:0x0ace, B:364:0x0adf, B:365:0x0ae7, B:367:0x0aed, B:376:0x0b0f, B:371:0x0af7, B:375:0x0b08, B:374:0x0b04, B:363:0x0adb, B:350:0x0aac, B:337:0x0a7d, B:333:0x0a70, B:329:0x0a63, B:314:0x0a2e, B:310:0x0a09, B:306:0x09f6, B:302:0x09e3, B:298:0x09d0, B:294:0x09bf, B:290:0x09b0, B:286:0x09a1, B:282:0x0992, B:278:0x097f, B:274:0x096e, B:270:0x095f, B:266:0x0950, B:262:0x0941, B:258:0x0932, B:254:0x0923, B:250:0x0914, B:244:0x082e), top: B:389:0x0825 }] */
    /* JADX WARN: Removed duplicated region for block: B:359:0x0acc  */
    /* JADX WARN: Removed duplicated region for block: B:362:0x0ad8  */
    /* JADX WARN: Removed duplicated region for block: B:363:0x0adb A[Catch: all -> 0x082b, TryCatch #0 {all -> 0x082b, blocks: (B:241:0x0827, B:245:0x0831, B:247:0x090b, B:251:0x091a, B:255:0x0929, B:259:0x0938, B:263:0x0947, B:267:0x0956, B:271:0x0965, B:275:0x0972, B:279:0x0985, B:283:0x0998, B:287:0x09a7, B:291:0x09b6, B:295:0x09c3, B:299:0x09d4, B:303:0x09e7, B:307:0x09fa, B:311:0x0a0d, B:315:0x0a32, B:317:0x0a3e, B:319:0x0a46, B:326:0x0a5a, B:330:0x0a67, B:334:0x0a74, B:338:0x0a81, B:339:0x0a89, B:341:0x0a8f, B:347:0x0a9f, B:351:0x0ab0, B:352:0x0ab8, B:354:0x0abe, B:360:0x0ace, B:364:0x0adf, B:365:0x0ae7, B:367:0x0aed, B:376:0x0b0f, B:371:0x0af7, B:375:0x0b08, B:374:0x0b04, B:363:0x0adb, B:350:0x0aac, B:337:0x0a7d, B:333:0x0a70, B:329:0x0a63, B:314:0x0a2e, B:310:0x0a09, B:306:0x09f6, B:302:0x09e3, B:298:0x09d0, B:294:0x09bf, B:290:0x09b0, B:286:0x09a1, B:282:0x0992, B:278:0x097f, B:274:0x096e, B:270:0x095f, B:266:0x0950, B:262:0x0941, B:258:0x0932, B:254:0x0923, B:250:0x0914, B:244:0x082e), top: B:389:0x0825 }] */
    /* JADX WARN: Removed duplicated region for block: B:367:0x0aed A[Catch: all -> 0x082b, TryCatch #0 {all -> 0x082b, blocks: (B:241:0x0827, B:245:0x0831, B:247:0x090b, B:251:0x091a, B:255:0x0929, B:259:0x0938, B:263:0x0947, B:267:0x0956, B:271:0x0965, B:275:0x0972, B:279:0x0985, B:283:0x0998, B:287:0x09a7, B:291:0x09b6, B:295:0x09c3, B:299:0x09d4, B:303:0x09e7, B:307:0x09fa, B:311:0x0a0d, B:315:0x0a32, B:317:0x0a3e, B:319:0x0a46, B:326:0x0a5a, B:330:0x0a67, B:334:0x0a74, B:338:0x0a81, B:339:0x0a89, B:341:0x0a8f, B:347:0x0a9f, B:351:0x0ab0, B:352:0x0ab8, B:354:0x0abe, B:360:0x0ace, B:364:0x0adf, B:365:0x0ae7, B:367:0x0aed, B:376:0x0b0f, B:371:0x0af7, B:375:0x0b08, B:374:0x0b04, B:363:0x0adb, B:350:0x0aac, B:337:0x0a7d, B:333:0x0a70, B:329:0x0a63, B:314:0x0a2e, B:310:0x0a09, B:306:0x09f6, B:302:0x09e3, B:298:0x09d0, B:294:0x09bf, B:290:0x09b0, B:286:0x09a1, B:282:0x0992, B:278:0x097f, B:274:0x096e, B:270:0x095f, B:266:0x0950, B:262:0x0941, B:258:0x0932, B:254:0x0923, B:250:0x0914, B:244:0x082e), top: B:389:0x0825 }] */
    /* JADX WARN: Removed duplicated region for block: B:371:0x0af7 A[Catch: all -> 0x082b, TryCatch #0 {all -> 0x082b, blocks: (B:241:0x0827, B:245:0x0831, B:247:0x090b, B:251:0x091a, B:255:0x0929, B:259:0x0938, B:263:0x0947, B:267:0x0956, B:271:0x0965, B:275:0x0972, B:279:0x0985, B:283:0x0998, B:287:0x09a7, B:291:0x09b6, B:295:0x09c3, B:299:0x09d4, B:303:0x09e7, B:307:0x09fa, B:311:0x0a0d, B:315:0x0a32, B:317:0x0a3e, B:319:0x0a46, B:326:0x0a5a, B:330:0x0a67, B:334:0x0a74, B:338:0x0a81, B:339:0x0a89, B:341:0x0a8f, B:347:0x0a9f, B:351:0x0ab0, B:352:0x0ab8, B:354:0x0abe, B:360:0x0ace, B:364:0x0adf, B:365:0x0ae7, B:367:0x0aed, B:376:0x0b0f, B:371:0x0af7, B:375:0x0b08, B:374:0x0b04, B:363:0x0adb, B:350:0x0aac, B:337:0x0a7d, B:333:0x0a70, B:329:0x0a63, B:314:0x0a2e, B:310:0x0a09, B:306:0x09f6, B:302:0x09e3, B:298:0x09d0, B:294:0x09bf, B:290:0x09b0, B:286:0x09a1, B:282:0x0992, B:278:0x097f, B:274:0x096e, B:270:0x095f, B:266:0x0950, B:262:0x0941, B:258:0x0932, B:254:0x0923, B:250:0x0914, B:244:0x082e), top: B:389:0x0825 }] */
    /* JADX WARN: Removed duplicated region for block: B:373:0x0b01  */
    /* JADX WARN: Removed duplicated region for block: B:374:0x0b04 A[Catch: all -> 0x082b, TryCatch #0 {all -> 0x082b, blocks: (B:241:0x0827, B:245:0x0831, B:247:0x090b, B:251:0x091a, B:255:0x0929, B:259:0x0938, B:263:0x0947, B:267:0x0956, B:271:0x0965, B:275:0x0972, B:279:0x0985, B:283:0x0998, B:287:0x09a7, B:291:0x09b6, B:295:0x09c3, B:299:0x09d4, B:303:0x09e7, B:307:0x09fa, B:311:0x0a0d, B:315:0x0a32, B:317:0x0a3e, B:319:0x0a46, B:326:0x0a5a, B:330:0x0a67, B:334:0x0a74, B:338:0x0a81, B:339:0x0a89, B:341:0x0a8f, B:347:0x0a9f, B:351:0x0ab0, B:352:0x0ab8, B:354:0x0abe, B:360:0x0ace, B:364:0x0adf, B:365:0x0ae7, B:367:0x0aed, B:376:0x0b0f, B:371:0x0af7, B:375:0x0b08, B:374:0x0b04, B:363:0x0adb, B:350:0x0aac, B:337:0x0a7d, B:333:0x0a70, B:329:0x0a63, B:314:0x0a2e, B:310:0x0a09, B:306:0x09f6, B:302:0x09e3, B:298:0x09d0, B:294:0x09bf, B:290:0x09b0, B:286:0x09a1, B:282:0x0992, B:278:0x097f, B:274:0x096e, B:270:0x095f, B:266:0x0950, B:262:0x0941, B:258:0x0932, B:254:0x0923, B:250:0x0914, B:244:0x082e), top: B:389:0x0825 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00f0  */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.String, kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v40 */
    /* JADX WARN: Type inference failed for: r18v7, types: [java.util.ArrayList] */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(java.lang.Object r62) {
        /*
            Method dump skipped, instruction units count: 2972
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: is6.t.invoke(java.lang.Object):java.lang.Object");
    }

    public /* synthetic */ t(Object obj2, Object obj3, int i) {
        this.f168135a = i;
        this.f168136b = obj2;
        this.f168137c = obj3;
    }
}
