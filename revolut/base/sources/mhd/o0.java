package mhd;

import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.model.account.AccountId;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.status.StatusViewContract$Duration;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.domain.models.beneficiary.BeneficiaryRouteDetails;
import com.revolut.feature.pix.api.model.PixQrCodeScheduleData;
import com.revolut.feature.pix.api.model.PixQrCodeTransferData;
import com.revolut.feature.pix.api.model.PixQrCodeTransferResult;
import com.revolut.feature.pix.impl.data.network.PixQrCodeService;
import com.revolut.feature.rev_points.models.SpareChangeRefundQuote;
import com.revolut.feature.rev_points.spare_change.impl.data.network.RevPointsSpareChangeService;
import com.revolut.feature.shared_separate_favourites.api.R$string;
import com.revolut.feature.shared_separate_favourites.domain.FavouritesAssetDetails;
import com.revolut.feature.shared_separate_favourites.domain.FavouritesAssetTypeKey;
import com.revolut.feature.shared_separate_favourites.domain.watchlist.WatchlistItem;
import com.revolut.feature.wealth.api.navigation.models.DepositInfo;
import com.revolut.feature.wealth.impl.data.network.margin_borrowing.WealthMarginBorrowingService;
import com.revolut.kompot.common.dialog.status.StatusDialogDescriptionProgress;
import com.revolut.retail.feature.api.trips.models.Trip;
import com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.contract.BeneficiaryInfoState;
import com.revolut.retail.feature.payments.bank_transfer.api.navigation.BankTransferData;
import com.revolut.shared.feature.market_data.models.domain.models.OrderQuote;
import com.revolut.shared.feature.suspicious_transaction.impl.flow.SuspiciousTransactionFlowContract$Step;
import com.revolut.sso.impl.domain.models.Claim;
import java.util.Set;
import java.util.UUID;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l8a.w0;
import n33.v0;
import nii.u1;
import nii.y0;
import retrofit2.Response;
import rp0.f1;
import sgm.e3;
import vkm.j2;
import vkm.z1;
import zh9.u0;

/* JADX INFO: loaded from: classes7.dex */
public final class o0 extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Object f205521w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f205522x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public o0(com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.account_fields.d dVar, Continuation continuation, Function1 function1) {
        super(1, continuation);
        this.u = 18;
        this.f205521w = (gim.i) function1;
        this.f205522x = dVar;
    }

    /* JADX WARN: Type inference failed for: r1v37, types: [gim.i, kotlin.jvm.functions.Function1] */
    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new o0((q0) this.f205521w, (WatchlistItem) this.f205522x, continuation, 0);
            case 1:
                return new o0((com.revolut.feature.credit.application.plugins.impl.ui.spousal_consent_initiator.flow.b) this.f205521w, (ni4.d) this.f205522x, continuation, 1);
            case 2:
                return new o0((com.revolut.feature.credit.application.plugins.impl.ui.spousal_consent_initiator.flow.b) this.f205521w, (oi4.g) this.f205522x, continuation, 2);
            case 3:
                return new o0((com.revolut.sso.impl.ui.combined_authentication.flow.c) this.f205521w, (qll.b0) this.f205522x, continuation, 3);
            case 4:
                return new o0((com.revolut.feature.profile.impl.ui.close_account.c) this.f205521w, (String) this.f205522x, continuation, 4);
            case 5:
                return new o0((mn1.b0) this.f205522x, continuation, 5);
            case 6:
                return new o0((com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.trips.flow.a) this.f205521w, (god.b) this.f205522x, continuation, 6);
            case 7:
                return new o0((com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.trips.flow.a) this.f205521w, (Trip) this.f205522x, continuation, 7);
            case 8:
                return new o0((mp6.n) this.f205521w, (ep6.d) this.f205522x, continuation, 8);
            case 9:
                return new o0((mzb.k) this.f205521w, this.f205522x, continuation, 9);
            case 10:
                return new o0((n2c.d) this.f205521w, (SpareChangeRefundQuote) this.f205522x, continuation, 10);
            case 11:
                return new o0((n3h.c) this.f205521w, (q2h.d) this.f205522x, continuation, 11);
            case 12:
                return new o0((n3h.c) this.f205521w, (q2h.e) this.f205522x, continuation, 12);
            case 13:
                return new o0((com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.account_fields.d) this.f205521w, (d2k.m) this.f205522x, continuation, 13);
            case 14:
                return new o0((com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.account_fields.d) this.f205521w, (l1j.a) this.f205522x, continuation, 14);
            case 15:
                return new o0((com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.account_fields.d) this.f205521w, (l4j.b) this.f205522x, continuation, 15);
            case 16:
                return new o0((com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.account_fields.d) this.f205521w, this.f205522x, continuation, 16);
            case 17:
                return new o0((com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.account_fields.d) this.f205521w, (String) this.f205522x, continuation, 17);
            case 18:
                return new o0((com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.account_fields.d) this.f205522x, continuation, (Function1) this.f205521w);
            case 19:
                return new o0((com.revolut.retail.feature.payments.bank_transfer.impl.ui_kompot.flow.c) this.f205521w, (r4k.q) this.f205522x, continuation, 19);
            case 20:
                return new o0((com.revolut.feature.credit.application.plugins.impl.ui.autopay.loan.flow.a) this.f205521w, (it3.e) this.f205522x, continuation, 20);
            case 21:
                return new o0((lal.a) this.f205521w, (t7h.d) this.f205522x, continuation, 21);
            case 22:
                return new o0((n8a.b0) this.f205521w, (PixQrCodeScheduleData) this.f205522x, continuation, 22);
            case 23:
                return new o0((n8a.b0) this.f205521w, (PixQrCodeTransferData) this.f205522x, continuation, 23);
            case 24:
                return new o0((com.revolut.feature_move_money.impl.topup.a) this.f205521w, (nyh.b) this.f205522x, continuation, 24);
            case 25:
                return new o0((com.revolut.feature_move_money.impl.topup.a) this.f205521w, (n8i.k) this.f205522x, continuation, 25);
            case 26:
                return new o0((kge.d) this.f205521w, (DepositInfo) this.f205522x, continuation, 26);
            case 27:
                return new o0((com.revolut.shared.feature.suspicious_transaction.impl.flow.a) this.f205521w, (SuspiciousTransactionFlowContract$Step) this.f205522x, continuation, 27);
            case 28:
                return new o0((com.revolut.feature.credit.application.plugins.impl.ui.manual_underwriting.a) this.f205521w, (com.revolut.feature.credit.application.plugins.impl.ui.manual_underwriting.document.a) this.f205522x, continuation, 28);
            default:
                return new o0((nd8.q) this.f205522x, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((o0) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r1v81, types: [gim.i, kotlin.jvm.functions.Function1] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        Object objB;
        AccountId accountId;
        Object objInvoke;
        Object marginBorrowingInterest;
        Object objTransfer;
        String str;
        o0 o0Var = this;
        int i = o0Var.u;
        int i2 = 10;
        int i3 = 3;
        int i5 = 5;
        int i6 = 2;
        Object obj3 = o0Var.f205522x;
        int i21 = 1;
        switch (i) {
            case 0:
                WatchlistItem watchlistItem = (WatchlistItem) obj3;
                FavouritesAssetDetails asset = watchlistItem.f86898a;
                q0 q0Var = (q0) o0Var.f205521w;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i22 = o0Var.v;
                if (i22 == 0) {
                    yhm.o.b(obj2);
                    l3d.h0 h0Var = q0Var.f205527m;
                    FavouritesAssetTypeKey favouritesAssetTypeKey = asset.d;
                    Pair pair = new Pair(asset.f86863a, watchlistItem.f86899b);
                    o0Var.v = 1;
                    if (h0Var.h(favouritesAssetTypeKey, pair, o0Var) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i22 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                q0Var.f205529p.getClass();
                Intrinsics.checkNotNullParameter(asset, "asset");
                FavouritesAssetTypeKey favouritesAssetTypeKey2 = asset.d;
                y1d.b.Companion.getClass();
                q0Var.L2(new mii.g("DIALOG_ID_REMOVED_FROM_WATCHLIST", Intrinsics.f(favouritesAssetTypeKey2, y1d.a.f310361h) ? new TextLocalisedClause(R$string.shared_watchlist_remove_item_from_watchlist_toast_title, null, null, 14) : new TextLocalisedClause(R$string.shared_watchlist_remove_item_from_watchlist_toast_with_asset_title, zhm.u.c(asset.f86864b), null, 12), f1.ABOVE_ANCHOR_VIEW, 12));
                return Unit.f186387a;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i32 = o0Var.v;
                if (i32 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.credit.application.plugins.impl.ui.spousal_consent_initiator.flow.b bVar = (com.revolut.feature.credit.application.plugins.impl.ui.spousal_consent_initiator.flow.b) o0Var.f205521w;
                    it3.d dVar = ((ni4.c) ((ni4.d) obj3)).f215638a;
                    o0Var.v = 1;
                    if (c84.t.N2(bVar, dVar, o0Var, 2) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i32 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 2:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i33 = o0Var.v;
                if (i33 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.credit.application.plugins.impl.ui.spousal_consent_initiator.flow.b bVar2 = (com.revolut.feature.credit.application.plugins.impl.ui.spousal_consent_initiator.flow.b) o0Var.f205521w;
                    it3.d dVar2 = ((oi4.g) obj3).f225438a;
                    o0Var.v = 1;
                    if (c84.t.N2(bVar2, dVar2, o0Var, 2) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i33 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 3:
                qll.b0 b0Var = (qll.b0) obj3;
                com.revolut.sso.impl.ui.combined_authentication.flow.c cVar = (com.revolut.sso.impl.ui.combined_authentication.flow.c) o0Var.f205521w;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i43 = o0Var.v;
                if (i43 == 0) {
                    yhm.o.b(obj2);
                    cVar.H2(cVar.G, new ml3.y(b0Var, i5));
                    Claim claimB = yjl.h.b(((qll.z) b0Var).f247608a);
                    o0Var.v = 1;
                    if (com.revolut.sso.impl.ui.combined_authentication.flow.c.O2(cVar, claimB, o0Var) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i43 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 4:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                int i59 = o0Var.v;
                if (i59 != 0) {
                    if (i59 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                wik.m mVar = ((com.revolut.feature.profile.impl.ui.close_account.c) o0Var.f205521w).f81359q;
                o0Var.v = 1;
                kjk.o oVar = (kjk.o) mVar.f297924b;
                oVar.getClass();
                kb7.c cVar2 = new kb7.c(oVar, (String) obj3, dVar, i2);
                skm.p0 p0Var = skm.p0.f264001a;
                Object objJ = skm.e0.J(elm.f.f127540b, cVar2, o0Var);
                return objJ == aVar5 ? aVar5 : objJ;
            case 5:
                mn1.b0 b0Var2 = (mn1.b0) obj3;
                gn1.b bVar3 = b0Var2.u;
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                int i66 = o0Var.v;
                if (i66 == 0) {
                    yhm.o.b(obj2);
                    mn1.i iVar = b0Var2.o;
                    AccountId accountId2 = iVar.f207341c;
                    String str2 = iVar.d;
                    o0Var.f205521w = accountId2;
                    o0Var.v = 1;
                    objB = bVar3.b(accountId2, o0Var, str2);
                    if (objB == aVar6) {
                        return aVar6;
                    }
                    accountId = accountId2;
                } else {
                    if (i66 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    accountId = (AccountId) o0Var.f205521w;
                    yhm.o.b(obj2);
                    objB = obj2;
                }
                io3.d pocket = (io3.d) objB;
                bVar3.getClass();
                Intrinsics.checkNotNullParameter(pocket, "pocket");
                Intrinsics.checkNotNullParameter(accountId, "accountId");
                b0Var2.H2(b0Var2.f207334w, new in1.n(new hn1.a(accountId, vo9.a.b(bVar3.f144902a, pocket, accountId, 4), pocket), i21));
                return Unit.f186387a;
            case 6:
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                int i74 = o0Var.v;
                if (i74 != 0) {
                    if (i74 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                mod.l lVar = ((com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.trips.flow.a) o0Var.f205521w).o;
                Set set = ((god.b) obj3).f145134a;
                o0Var.v = 1;
                Object objC = lVar.c(set, o0Var);
                return objC == aVar7 ? aVar7 : objC;
            case 7:
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                int i92 = o0Var.v;
                if (i92 != 0) {
                    if (i92 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                o0Var.v = 1;
                Object objE = ((com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.trips.flow.a) o0Var.f205521w).o.e((Trip) obj3, o0Var);
                return objE == aVar8 ? aVar8 : objE;
            case 8:
                mp6.n nVar = (mp6.n) o0Var.f205521w;
                ep6.d dVar3 = (ep6.d) obj3;
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                int i96 = o0Var.v;
                if (i96 == 0) {
                    yhm.o.b(obj2);
                    yo6.d dVar4 = dVar3.f128085b;
                    String str3 = dVar3.f128084a;
                    int iB = yo6.e.POSITIVE.b();
                    yo6.c cVar3 = dVar3.f128086c;
                    o0Var.v = 1;
                    o0Var = this;
                    if (nVar.g3(dVar4, str3, iB, null, null, cVar3, this) == aVar9) {
                        return aVar9;
                    }
                } else {
                    if (i96 != 1) {
                        if (i96 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                        return Unit.f186387a;
                    }
                    yhm.o.b(obj2);
                }
                nVar.d3(new mlk.a0(19));
                nVar.h3();
                z1 z1Var = nVar.f207764s;
                ep6.j jVar = new ep6.j(dVar3.f128084a);
                o0Var.v = 2;
                if (z1Var.emit(jVar, o0Var) == aVar9) {
                    return aVar9;
                }
                return Unit.f186387a;
            case 9:
                mzb.k kVar = (mzb.k) o0Var.f205521w;
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                int i99 = o0Var.v;
                if (i99 == 0) {
                    yhm.o.b(obj2);
                    nyb.k kVar2 = kVar.f210754p;
                    m1c.p learnType = kVar.o.f83807a;
                    kVar2.getClass();
                    Intrinsics.checkNotNullParameter(learnType, "learnType");
                    jxb.l lVar2 = (jxb.l) kVar2.f220804a;
                    lVar2.getClass();
                    Intrinsics.checkNotNullParameter(learnType, "learnType");
                    pfm.r rVarG0 = te0.w.g0(lVar2.f179124a.markLearnCompleted(learnType.name()));
                    o0Var.v = 1;
                    if (nim.a.a(rVarG0, o0Var) == aVar10) {
                        return aVar10;
                    }
                } else {
                    if (i99 != 1) {
                        if (i99 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                        kVar.C2(aii.q.f5292a);
                        return Unit.f186387a;
                    }
                    yhm.o.b(obj2);
                }
                efm.d0 d0VarC = ((s06.j) kVar.f210755q).c(((mzb.a) obj3).f210745a, false, lg0.a.IGNORE);
                o0Var.v = 2;
                if (nim.a.b(d0VarC, o0Var) == aVar10) {
                    return aVar10;
                }
                kVar.C2(aii.q.f5292a);
                return Unit.f186387a;
            case 10:
                n2c.d dVar5 = (n2c.d) o0Var.f205521w;
                fim.a aVar11 = fim.a.COROUTINE_SUSPENDED;
                int i100 = o0Var.v;
                if (i100 == 0) {
                    yhm.o.b(obj2);
                    rul.e eVar = dVar5.o;
                    SpareChangeRefundQuote spareChangeRefundQuote = (SpareChangeRefundQuote) obj3;
                    eVar.getClass();
                    Intrinsics.checkNotNullParameter(spareChangeRefundQuote, "spareChangeRefundQuote");
                    s1c.f fVar = (s1c.f) eVar.f257629a;
                    Intrinsics.checkNotNullParameter(spareChangeRefundQuote, "spareChangeRefundQuote");
                    RevPointsSpareChangeService revPointsSpareChangeService = fVar.f259131a;
                    Object obj4 = q1c.a.f241419a;
                    Intrinsics.checkNotNullParameter(spareChangeRefundQuote, "<this>");
                    efm.d0<Response<Unit>> d0VarRequestSpareChangeRefund = revPointsSpareChangeService.requestSpareChangeRefund(new r1c.h(mo3.a.p(spareChangeRefundQuote.f84093a), mo3.a.p(spareChangeRefundQuote.f84094b), spareChangeRefundQuote.f84095c));
                    s08.g gVar = new s08.g(i2, new s1c.a(i3));
                    d0VarRequestSpareChangeRefund.getClass();
                    ufm.i iVar2 = new ufm.i(d0VarRequestSpareChangeRefund, gVar, 1);
                    Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                    ufm.n nVarI0 = te0.w.i0(iVar2);
                    o0Var.v = 1;
                    if (nim.a.b(nVarI0, o0Var) == aVar11) {
                        return aVar11;
                    }
                } else {
                    if (i100 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return yji.l.b1(dVar5, dVar5.X1(new y0(null, new nii.g0(new TextLocalisedClause(com.revolut.feature.rev_points.api.R$string.rev_points_spare_change_refund_result_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.rev_points.api.R$string.rev_points_spare_change_refund_result_description, null, null, 14), null, null, null, null, null, null, false, null, false, null, 16380), false, 5)), null, new mta.c(dVar5, dVar, 13), 3);
            case 11:
                fim.a aVar12 = fim.a.COROUTINE_SUSPENDED;
                int i101 = o0Var.v;
                if (i101 != 0) {
                    if (i101 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                n3h.c cVar4 = (n3h.c) o0Var.f205521w;
                mh1.d dVar6 = new mh1.d(cVar4, (q2h.d) obj3, (Continuation) dVar, 9);
                o0Var.v = 1;
                Object objY2 = cVar4.Y2(o0Var, dVar6);
                return objY2 == aVar12 ? aVar12 : objY2;
            case 12:
                fim.a aVar13 = fim.a.COROUTINE_SUSPENDED;
                int i102 = o0Var.v;
                if (i102 != 0) {
                    if (i102 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                n3h.c cVar5 = (n3h.c) o0Var.f205521w;
                mh1.d dVar7 = new mh1.d(cVar5, (q2h.e) obj3, (Continuation) dVar, i2);
                o0Var.v = 1;
                Object objY22 = cVar5.Y2(o0Var, dVar7);
                return objY22 == aVar13 ? aVar13 : objY22;
            case 13:
                fim.a aVar14 = fim.a.COROUTINE_SUSPENDED;
                int i103 = o0Var.v;
                if (i103 != 0) {
                    if (i103 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.account_fields.d dVar8 = (com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.account_fields.d) o0Var.f205521w;
                t3j.c cVar6 = dVar8.f99686q;
                BeneficiaryInfoState beneficiaryInfoStateK2 = dVar8.K2();
                wi0.b bVar4 = ((d2k.l) ((d2k.m) obj3)).f110884a.f110878a;
                o0Var.v = 1;
                Object objA = cVar6.a(beneficiaryInfoStateK2, bVar4, o0Var);
                return objA == aVar14 ? aVar14 : objA;
            case 14:
                fim.a aVar15 = fim.a.COROUTINE_SUSPENDED;
                int i104 = o0Var.v;
                if (i104 != 0) {
                    if (i104 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.account_fields.d dVar9 = (com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.account_fields.d) o0Var.f205521w;
                u3j.b bVar5 = dVar9.f99687r;
                BeneficiaryInfoState beneficiaryInfoStateK22 = dVar9.K2();
                xi0.a aVar16 = xi0.b.Companion;
                String str4 = ((l1j.b) ((l1j.a) obj3)).f191547a;
                aVar16.getClass();
                xi0.b bVarA = xi0.a.a(str4);
                o0Var.v = 1;
                Object objA2 = bVar5.a(beneficiaryInfoStateK22, bVarA, o0Var);
                return objA2 == aVar15 ? aVar15 : objA2;
            case 15:
                fim.a aVar17 = fim.a.COROUTINE_SUSPENDED;
                int i105 = o0Var.v;
                if (i105 != 0) {
                    if (i105 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.account_fields.d dVar10 = (com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.account_fields.d) o0Var.f205521w;
                e3 e3Var = dVar10.f99688s;
                BeneficiaryInfoState beneficiaryInfoStateK23 = dVar10.K2();
                BeneficiaryRouteDetails beneficiaryRouteDetails = ((l4j.b) obj3).f192144a;
                o0Var.v = 1;
                Object objF = e3Var.f(beneficiaryInfoStateK23, beneficiaryRouteDetails, o0Var);
                return objF == aVar17 ? aVar17 : objF;
            case 16:
                com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.account_fields.d dVar11 = (com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.account_fields.d) o0Var.f205521w;
                fim.a aVar18 = fim.a.COROUTINE_SUSPENDED;
                int i106 = o0Var.v;
                if (i106 == 0) {
                    yhm.o.b(obj2);
                    d4j.c cVar7 = dVar11.E;
                    o0Var.v = 1;
                    Object objC2 = cVar7.f111339a.c((f5j.k) obj3, o0Var);
                    if (objC2 != aVar18) {
                        objC2 = Unit.f186387a;
                    }
                    if (objC2 == aVar18) {
                        return aVar18;
                    }
                } else {
                    if (i106 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                dVar11.H2(dVar11.K, new v0(18));
                return Unit.f186387a;
            case 17:
                fim.a aVar19 = fim.a.COROUTINE_SUSPENDED;
                int i107 = o0Var.v;
                if (i107 != 0) {
                    if (i107 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.account_fields.d dVar12 = (com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.account_fields.d) o0Var.f205521w;
                o0Var.v = 1;
                Object objA3 = dVar12.f99689t.a(dVar12.K2(), (String) obj3, o0Var);
                return objA3 == aVar19 ? aVar19 : objA3;
            case 18:
                fim.a aVar20 = fim.a.COROUTINE_SUSPENDED;
                int i108 = o0Var.v;
                if (i108 == 0) {
                    yhm.o.b(obj2);
                    ?? r110 = (gim.i) o0Var.f205521w;
                    o0Var.v = 1;
                    objInvoke = r110.invoke(o0Var);
                    if (objInvoke == aVar20) {
                        return aVar20;
                    }
                } else {
                    if (i108 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    objInvoke = obj2;
                }
                com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.account_fields.d.I2((com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.account_fields.d) obj3, (BeneficiaryInfoState) objInvoke);
                return Unit.f186387a;
            case 19:
                fim.a aVar21 = fim.a.COROUTINE_SUSPENDED;
                int i109 = o0Var.v;
                if (i109 != 0) {
                    if (i109 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                a5k.t tVar = ((com.revolut.retail.feature.payments.bank_transfer.impl.ui_kompot.flow.c) o0Var.f205521w).f102111q;
                r4k.o oVar2 = (r4k.o) ((r4k.q) obj3);
                BankTransferData bankTransferData = oVar2.f251490a;
                r4k.m mVar2 = oVar2.f251491b;
                f5j.a aVar22 = oVar2.f251492c;
                AccountId accountId3 = oVar2.d;
                o0Var.v = 1;
                Object objB3 = tVar.b3(bankTransferData, mVar2, aVar22, accountId3, o0Var);
                return objB3 == aVar21 ? aVar21 : objB3;
            case 20:
                fim.a aVar23 = fim.a.COROUTINE_SUSPENDED;
                int i110 = o0Var.v;
                if (i110 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.credit.application.plugins.impl.ui.autopay.loan.flow.a aVar24 = (com.revolut.feature.credit.application.plugins.impl.ui.autopay.loan.flow.a) o0Var.f205521w;
                    it3.e eVar2 = (it3.e) obj3;
                    Intrinsics.checkNotNullParameter(eVar2, "<this>");
                    Intrinsics.checkNotNullParameter(eVar2, "<this>");
                    dVar = eVar2 instanceof it3.d ? (it3.d) eVar2 : 0;
                    if (dVar == 0) {
                        throw new IllegalStateException("Status doesn't support plugins");
                    }
                    o0Var.v = 1;
                    if (c84.t.N2(aVar24, dVar, o0Var, 2) == aVar23) {
                        return aVar23;
                    }
                } else {
                    if (i110 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 21:
                fim.a aVar25 = fim.a.COROUTINE_SUSPENDED;
                int i111 = o0Var.v;
                if (i111 == 0) {
                    yhm.o.b(obj2);
                    WealthMarginBorrowingService wealthMarginBorrowingService = (WealthMarginBorrowingService) ((d4m.a) ((lal.a) o0Var.f205521w).f193426b).get();
                    t7h.d dVar13 = (t7h.d) obj3;
                    String str5 = dVar13.f268698a;
                    String str6 = dVar13.f268699b;
                    o0Var.v = 1;
                    marginBorrowingInterest = wealthMarginBorrowingService.getMarginBorrowingInterest(str5, str6, o0Var);
                    if (marginBorrowingInterest == aVar25) {
                        return aVar25;
                    }
                } else {
                    if (i111 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    marginBorrowingInterest = obj2;
                }
                return n14.k.y((t7h.c) marginBorrowingInterest);
            case 22:
                fim.a aVar26 = fim.a.COROUTINE_SUSPENDED;
                int i112 = o0Var.v;
                if (i112 == 0) {
                    yhm.o.b(obj2);
                    PixQrCodeService pixQrCodeService = ((n8a.b0) o0Var.f205521w).f213297a;
                    PixQrCodeScheduleData pixQrCodeScheduleData = (PixQrCodeScheduleData) obj3;
                    Intrinsics.checkNotNullParameter(pixQrCodeScheduleData, "<this>");
                    l8a.m0 m0Var = new l8a.m0(pixQrCodeScheduleData.f80473b, pixQrCodeScheduleData.f80474c, pixQrCodeScheduleData.d, mo3.a.p(pixQrCodeScheduleData.f80472a));
                    o0Var.v = 1;
                    PixQrCodeService.Companion aVar27 = PixQrCodeService.INSTANCE;
                    if (pixQrCodeService.schedule(m0Var, new wj0.b("QR_TRANSFER_IDEMPOTENCY_KEY"), o0Var) == aVar26) {
                        return aVar26;
                    }
                } else {
                    if (i112 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 23:
                fim.a aVar28 = fim.a.COROUTINE_SUSPENDED;
                int i113 = o0Var.v;
                if (i113 == 0) {
                    yhm.o.b(obj2);
                    PixQrCodeService pixQrCodeService2 = ((n8a.b0) o0Var.f205521w).f213297a;
                    PixQrCodeTransferData pixQrCodeTransferData = (PixQrCodeTransferData) obj3;
                    Intrinsics.checkNotNullParameter(pixQrCodeTransferData, "<this>");
                    jo3.a aVarP = mo3.a.p(pixQrCodeTransferData.f80475a);
                    dj0.d dVar14 = pixQrCodeTransferData.f80476b;
                    jo3.a aVarP2 = dVar14 != null ? mo3.a.p(dVar14) : null;
                    String str7 = pixQrCodeTransferData.f80477c;
                    String str8 = pixQrCodeTransferData.d;
                    w0 w0Var = new w0(new l8a.v0(Boolean.valueOf(pixQrCodeTransferData.f)));
                    dj0.d dVar15 = pixQrCodeTransferData.e;
                    l8a.n0 n0Var = new l8a.n0(aVarP, aVarP2, str7, str8, w0Var, dVar15 != null ? mo3.a.p(dVar15) : null);
                    o0Var.v = 1;
                    PixQrCodeService.Companion aVar29 = PixQrCodeService.INSTANCE;
                    objTransfer = pixQrCodeService2.transfer(n0Var, new wj0.b("QR_TRANSFER_IDEMPOTENCY_KEY"), o0Var);
                    if (objTransfer == aVar28) {
                        return aVar28;
                    }
                } else {
                    if (i113 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    objTransfer = obj2;
                }
                l8a.o0 o0Var2 = (l8a.o0) objTransfer;
                Intrinsics.checkNotNullParameter(o0Var2, "<this>");
                return new PixQrCodeTransferResult(o0Var2.getTransactionId());
            case 24:
                fim.a aVar30 = fim.a.COROUTINE_SUSPENDED;
                int i114 = o0Var.v;
                if (i114 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature_move_money.impl.topup.a aVar31 = (com.revolut.feature_move_money.impl.topup.a) o0Var.f205521w;
                    n8i.k kVarM2 = aVar31.M2();
                    OrderQuote orderQuote = ((nyh.b) obj3).f220875a;
                    o0Var.v = 1;
                    if (aVar31.K2(kVarM2, orderQuote, o0Var) == aVar30) {
                        return aVar30;
                    }
                } else {
                    if (i114 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 25:
                fim.a aVar32 = fim.a.COROUTINE_SUSPENDED;
                int i115 = o0Var.v;
                if (i115 == 0) {
                    yhm.o.b(obj2);
                    o0Var.v = 1;
                    if (com.revolut.feature_move_money.impl.topup.a.I2((com.revolut.feature_move_money.impl.topup.a) o0Var.f205521w, (n8i.k) obj3, o0Var) == aVar32) {
                        return aVar32;
                    }
                } else {
                    if (i115 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 26:
                fim.a aVar33 = fim.a.COROUTINE_SUSPENDED;
                int i116 = o0Var.v;
                if (i116 == 0) {
                    yhm.o.b(obj2);
                    kge.d dVar16 = (kge.d) o0Var.f205521w;
                    tzg.k kVar3 = (tzg.k) dVar16.f183974b;
                    oah.d dVar17 = (oah.d) dVar16.f183975c;
                    UUID uuid = dVar17.f223640h;
                    o0Var.v = 1;
                    if (((x8h.i0) kVar3).a(dVar17.f223636a, (DepositInfo) obj3, uuid, o0Var) == aVar33) {
                        return aVar33;
                    }
                } else {
                    if (i116 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 27:
                com.revolut.shared.feature.suspicious_transaction.impl.flow.a aVar34 = (com.revolut.shared.feature.suspicious_transaction.impl.flow.a) o0Var.f205521w;
                fim.a aVar35 = fim.a.COROUTINE_SUSPENDED;
                int i117 = o0Var.v;
                if (i117 == 0) {
                    yhm.o.b(obj2);
                    nal.k kVar4 = new nal.k(aVar34, dVar, i6);
                    o0Var.v = 1;
                    if (aVar34.p2(o0Var, kVar4) == aVar35) {
                        return aVar35;
                    }
                } else {
                    if (i117 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                aVar34.R2((SuspiciousTransactionFlowContract$Step) obj3);
                aVar34.r2();
                return Unit.f186387a;
            case 28:
                fim.a aVar36 = fim.a.COROUTINE_SUSPENDED;
                int i118 = o0Var.v;
                if (i118 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.credit.application.plugins.impl.ui.manual_underwriting.a aVar37 = (com.revolut.feature.credit.application.plugins.impl.ui.manual_underwriting.a) o0Var.f205521w;
                    it3.d dVar18 = ((pd4.j) ((com.revolut.feature.credit.application.plugins.impl.ui.manual_underwriting.document.a) obj3)).f235075a;
                    o0Var.v = 1;
                    if (c84.t.N2(aVar37, dVar18, o0Var, 2) == aVar36) {
                        return aVar36;
                    }
                } else {
                    if (i118 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                nd8.q qVar = (nd8.q) obj3;
                fim.a aVar38 = fim.a.COROUTINE_SUSPENDED;
                int i119 = o0Var.v;
                if (i119 == 0) {
                    yhm.o.b(obj2);
                    String str9 = (String) ((nd8.f) ((j2) qVar.f214349t.f22677a).getValue()).f214336a.getContent();
                    if (str9 == null) {
                        throw new IllegalStateException("Junior first name must be present at this stage");
                    }
                    nd8.n nVar2 = new nd8.n(qVar, dVar, i6);
                    o0Var.f205521w = str9;
                    o0Var.v = 1;
                    if (u0.b0(qVar.X(), "BLANK_CARD_DELIVERY_SECONDARY_BUTTON_LOADING_TAG", nVar2, o0Var) == aVar38) {
                        return aVar38;
                    }
                    str = str9;
                } else {
                    if (i119 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str = (String) o0Var.f205521w;
                    yhm.o.b(obj2);
                }
                return yji.l.b1(qVar, qVar.X1(new y0(null, new nii.j0((Clause) new TextLocalisedClause(com.revolut.feature.junior_consent.impl.R$string.junior_blank_card_delivery_consent_decline_title, zhm.u.c(str), null, 12), (Clause) null, (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) null, false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (nii.h0) null, (ResourceImage) null, 4094), false, 5)), null, new nd8.o(qVar, dVar, i21), 3);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o0(Object obj2, Object obj3, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f205521w = obj2;
        this.f205522x = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o0(oki.h hVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f205522x = hVar;
    }
}
