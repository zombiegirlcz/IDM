package a5k;

import android.os.Parcelable;
import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.chat.data.db.ChatDatabase;
import com.revolut.core.model.account.AccountId;
import com.revolut.feature.apm.core.models.alias.AliasType;
import com.revolut.feature.backgroundpicker.api.model.ChosenBackground;
import com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.details.models.IncomeSorterDetailsDiff;
import com.revolut.feature.staking.api.model.StakingPocket;
import com.revolut.feature.subaccount.api.models.SubaccountType;
import com.revolut.feature.subaccount.impl.ui.create.flow.main.CreateSubaccountFlowContract$SubaccountInfo;
import com.revolut.feature.trade_rev_points.models.TradeRevPointsRate;
import com.revolut.feature.transfer.core.models.FundingSource;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.retail.feature.api.userauth.navigation.UserOnboardingNavigationProvider$UseCase;
import com.revolut.retail.feature.payments.bank_transfer.api.navigation.BankTransferData;
import com.revolut.sso.impl.domain.models.Challenge;
import com.revolut.sso.impl.domain.models.Claim;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import nii.n1;
import x8j.g0;
import y7k.s0;

/* JADX INFO: loaded from: classes11.dex */
public final class n extends gim.i implements Function1 {
    public final /* synthetic */ Object A;
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Object f1468w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Object f1469x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Object f1470y;
    public Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(int i, Object obj2, Object obj3, Object obj4, Object obj5, Continuation continuation) {
        super(1, continuation);
        this.u = i;
        this.f1469x = obj2;
        this.f1470y = obj3;
        this.z = obj4;
        this.A = obj5;
    }

    private final Object b(Object obj2) {
        u8c.e eVar;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            u8c.e eVar2 = (u8c.e) this.f1469x;
            dj0.d dVar = (dj0.d) this.f1470y;
            xi0.b bVar = (xi0.b) this.z;
            xi0.b bVar2 = (xi0.b) this.A;
            this.f1468w = eVar2;
            this.v = 1;
            Object objF3 = u8c.e.f3(eVar2, dVar, bVar, bVar2, this);
            if (objF3 == aVar) {
                return aVar;
            }
            eVar = eVar2;
            obj2 = objF3;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            eVar = (u8c.e) this.f1468w;
            yhm.o.b(obj2);
        }
        return eVar.A2((aii.u) obj2);
    }

    private final Object c(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
            return obj2;
        }
        yhm.o.b(obj2);
        di3.w wVar = ((wh3.i) this.f1468w).f297379m;
        Parcelable parcelableA = ((n1) this.f1469x).a().a();
        AccountId accountId = (AccountId) this.z;
        AnalyticsProduct analyticsProduct = (AnalyticsProduct) this.f1470y;
        NaviCommand naviCommand = (NaviCommand) this.A;
        this.v = 1;
        Object objE = wVar.e(parcelableA, accountId, analyticsProduct, naviCommand, this);
        return objE == aVar ? aVar : objE;
    }

    private final Object n(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
            return obj2;
        }
        yhm.o.b(obj2);
        oki.h hVar = (oki.h) this.f1468w;
        uv1.c0 c0Var = new uv1.c0(11, (wll.e) this.f1469x, (String) this.f1470y, (Claim) this.z, (Set) this.A, (Continuation) null);
        this.v = 1;
        Object objP2 = hVar.p2(this, c0Var);
        return objP2 == aVar ? aVar : objP2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x015f, code lost:
    
        if (nim.a.a(r2, r30) == r1) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object o(java.lang.Object r31) {
        /*
            Method dump skipped, instruction units count: 357
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a5k.n.o(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x006b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object p(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.Object r0 = r8.f1469x
            xd2.f r0 = (xd2.f) r0
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r8.v
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L2b
            if (r2 == r5) goto L27
            if (r2 == r4) goto L23
            if (r2 != r3) goto L1b
            java.lang.Object r0 = r8.f1468w
            zz1.f r0 = (zz1.f) r0
            yhm.o.b(r9)
            return r0
        L1b:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L23:
            yhm.o.b(r9)
            goto L61
        L27:
            yhm.o.b(r9)
            goto L56
        L2b:
            yhm.o.b(r9)
            wj0.a r9 = r0.f304236m
            java.lang.String r2 = "IDEMPOTENCY_TAG_REGISTER_ALIAS"
            r9.a(r2)
            zz1.i r9 = new zz1.i
            com.revolut.feature.apm.core.models.alias.RegisterAlias$Alias r2 = new com.revolut.feature.apm.core.models.alias.RegisterAlias$Alias
            java.lang.Object r6 = r8.f1470y
            com.revolut.feature.apm.core.models.alias.AliasType r6 = (com.revolut.feature.apm.core.models.alias.AliasType) r6
            java.lang.Object r7 = r8.z
            java.lang.String r7 = (java.lang.String) r7
            r2.<init>(r6, r7)
            java.lang.Object r6 = r8.A
            java.lang.String r6 = (java.lang.String) r6
            r9.<init>(r2, r6)
            vw1.b r2 = r0.f304235l
            r8.v = r5
            java.lang.Object r9 = vw1.b.a(r2, r9, r8)
            if (r9 != r1) goto L56
            goto L79
        L56:
            zz1.f r9 = (zz1.f) r9
            r8.v = r4
            java.lang.Object r9 = xd2.f.Z2(r0, r9, r8)
            if (r9 != r1) goto L61
            goto L79
        L61:
            zz1.f r9 = (zz1.f) r9
            zz1.e r2 = r9.f326484b
            boolean r2 = nz8.d.l(r2)
            if (r2 == 0) goto L7a
            vw1.b r0 = r0.f304235l
            r8.f1468w = r9
            r8.v = r3
            uy1.j r0 = (uy1.j) r0
            java.lang.Object r0 = r0.j(r5, r8)
            if (r0 != r1) goto L7a
        L79:
            return r1
        L7a:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: a5k.n.p(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0052, code lost:
    
        if (r0.invoke(r8, r7) == r1) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object s(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.z
            o10.c r0 = (o10.c) r0
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r7.v
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L20
            if (r2 == r4) goto L1c
            if (r2 != r3) goto L14
            yhm.o.b(r8)
            goto L67
        L14:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1c:
            yhm.o.b(r8)
            goto L40
        L20:
            yhm.o.b(r8)
            int r8 = android.os.Build.VERSION.SDK_INT
            r2 = 30
            if (r8 < r2) goto L55
            java.lang.Object r8 = r7.f1468w
            xkl.i r8 = (xkl.i) r8
            java.lang.Object r2 = r7.f1469x
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r5 = r7.f1470y
            com.revolut.sso.impl.domain.models.Challenge r5 = (com.revolut.sso.impl.domain.models.Challenge) r5
            java.lang.String r5 = r5.e
            r7.v = r4
            java.lang.Object r8 = xkl.i.Z2(r8, r2, r5, r7)
            if (r8 != r1) goto L40
            goto L54
        L40:
            com.revolut.sso.api.models.BioSignatureEvidence r8 = (com.revolut.sso.api.models.BioSignatureEvidence) r8
            if (r8 != 0) goto L48
            r0.invoke()
            goto L67
        L48:
            java.lang.Object r0 = r7.A
            okl.s r0 = (okl.s) r0
            r7.v = r3
            java.lang.Object r8 = r0.invoke(r8, r7)
            if (r8 != r1) goto L67
        L54:
            return r1
        L55:
            java.util.concurrent.CopyOnWriteArrayList r8 = rd0.d.f253311a
            rd0.c r1 = rd0.c.WARNING
            r5 = 0
            r6 = 16
            java.lang.String r2 = "BioSignatureControllerModelExtensionImpl"
            java.lang.String r3 = "Bio signature is not supported on API < 30. Challenge rejected"
            r4 = 0
            rd0.d.b(r1, r2, r3, r4, r5, r6)
            r0.invoke()
        L67:
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: a5k.n.s(java.lang.Object):java.lang.Object");
    }

    private final Object t(Object obj2) {
        Object objPerformSuspending;
        r10.q qVar;
        ChatDatabase chatDatabase = (ChatDatabase) this.f1469x;
        uvl.c cVar = (uvl.c) this.z;
        y10.h hVar = (y10.h) cVar.f283492b;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            r10.q qVarM = chatDatabase.m();
            List listC = zhm.u.c((UUID) this.f1470y);
            this.f1468w = qVarM;
            this.v = 1;
            qVarM.getClass();
            StringBuilder sb6 = new StringBuilder();
            sb6.append("SELECT * FROM messages WHERE id IN (");
            objPerformSuspending = DBUtil.performSuspending((RoomDatabase) qVarM.f250849b, true, false, new amh.n(qVarM, prk.o.p(")", listC, sb6), listC, 11), this);
            if (objPerformSuspending == aVar) {
                return aVar;
            }
            qVar = qVarM;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            qVar = (r10.q) this.f1468w;
            yhm.o.b(obj2);
            objPerformSuspending = obj2;
        }
        u10.h hVar2 = (u10.h) zhm.d0.d0((List) objPerformSuspending);
        if (hVar2 == null) {
            return null;
        }
        v20.n nVar = (v20.n) ((Function1) this.A).invoke(hVar.h(hVar2));
        if (nVar == null) {
            return null;
        }
        u10.h hVarI = hVar.i(nVar);
        String strC = uvl.c.c(cVar, new u10.q(hVar2), hVarI);
        if (strC != null) {
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.b(rd0.c.DEBUG, "MessagesPersister", "Identity drift — accepting the transformed identity, decoloring: ".concat(strC), null, null, 16);
        }
        List listC2 = zhm.u.c(strC != null ? u10.h.a(hVarI, 0, 0, 0) : u10.h.a(hVarI, hVar2.i, hVar2.f276287j, hVar2.k));
        qVar.getClass();
        listC2.getClass();
        DBUtil.performBlocking((RoomDatabase) qVar.f250849b, false, true, new r10.b(qVar, listC2, 5));
        u10.i iVarL = hVar.l(nVar);
        if (iVarL != null) {
            r10.r rVarO = chatDatabase.o();
            List listC3 = zhm.u.c(iVarL);
            rVarO.getClass();
            listC3.getClass();
            DBUtil.performBlocking((RoomDatabase) rVarO.f250851a, false, true, new r10.b(rVarO, listC3, 7));
        }
        return nVar;
    }

    private final Object u(Object obj2) {
        n nVar;
        com.revolut.retail.feature.payments.payment_links.impl.ui_kompot.amount.a aVar = (com.revolut.retail.feature.payments.payment_links.impl.ui_kompot.amount.a) this.f1468w;
        fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            b8k.d dVar = aVar.f102208p;
            AccountId accountId = (AccountId) this.z;
            String str = (String) this.f1469x;
            String str2 = (String) this.f1470y;
            k1j.a aVar3 = (k1j.a) this.A;
            this.v = 1;
            nVar = this;
            obj2 = dVar.a(accountId, str, str2, aVar3, nVar);
            if (obj2 == aVar2) {
                return aVar2;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
            nVar = this;
        }
        aVar.O2(new s0(com.revolut.retail.feature.payments.payment_links.impl.ui_kompot.amount.a.K2(aVar, (String) nVar.f1470y), (FundingSource) obj2, (AccountId) nVar.z, 0));
        return Unit.f186387a;
    }

    private final Object v(Object obj2) {
        n nVar;
        yra.x xVar = (yra.x) this.f1468w;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            bsa.i iVar = xVar.f316200q;
            AccountId accountId = (AccountId) this.z;
            String str = (String) this.f1469x;
            String str2 = (String) this.f1470y;
            k1j.a aVar2 = (k1j.a) this.A;
            this.v = 1;
            nVar = this;
            obj2 = iVar.a(accountId, str, str2, aVar2, nVar);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
            nVar = this;
        }
        xVar.x2(new yj2.b(new xwd.o((FundingSource) obj2, 27, (String) nVar.f1470y, (AccountId) nVar.z), xVar, 27));
        return Unit.f186387a;
    }

    private final Object w(Object obj2) {
        n nVar;
        com.revolut.retail.feature.payments.peer_to_peer.impl.ui_kompot.amount.b bVar = (com.revolut.retail.feature.payments.peer_to_peer.impl.ui_kompot.amount.b) this.f1468w;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            c9k.l lVar = bVar.f102334q;
            AccountId accountId = (AccountId) this.z;
            String str = (String) this.f1469x;
            String str2 = (String) this.f1470y;
            k1j.a aVar2 = (k1j.a) this.A;
            this.v = 1;
            nVar = this;
            obj2 = lVar.a(accountId, str, str2, aVar2, nVar);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
            nVar = this;
        }
        bVar.H2(new s0(com.revolut.retail.feature.payments.peer_to_peer.impl.ui_kompot.amount.b.y2(bVar, (String) nVar.f1470y), (FundingSource) obj2, (AccountId) nVar.z, 1));
        return Unit.f186387a;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new n((t) this.f1468w, (BankTransferData) this.f1469x, (f5j.a) this.f1470y, (AccountId) this.z, (r4k.m) this.A, continuation, 0);
            case 1:
                return new n((dj0.d) this.f1468w, (com.revolut.retail.feature.plan_gifting.impl.ui.flows.sender.b) this.f1469x, (zm3.l) this.f1470y, (String) this.z, (hha.i) this.A, continuation, 1);
            case 2:
                return new n(2, (com.revolut.retail.feature.impl.userauth.screen.revolut_sso.wrapper.a) this.f1469x, (UserOnboardingNavigationProvider$UseCase) this.f1470y, (yji.l) this.z, (FeatureCommand) this.A, continuation);
            case 3:
                return new n(3, (com.revolut.feature_move_money.impl.amount.c) this.f1469x, (String) this.f1470y, (k1j.a) this.z, (b6i.j) this.A, continuation);
            case 4:
                return new n((com.revolut.trading.orders.ui.invest.placement.screens.edit.e) this.A, continuation);
            case 5:
                return new n((yji.l) this.f1468w, (AccountId) this.z, (String) this.f1469x, (String) this.f1470y, (k1j.a) this.A, continuation, 5);
            case 6:
                return new n((yji.l) this.f1468w, (AccountId) this.z, (String) this.f1469x, (String) this.f1470y, (k1j.a) this.A, continuation, 6);
            case 7:
                return new n((kk9.n) this.z, (kk9.e) this.A, continuation, 7);
            case 8:
                return new n((com.revolut.feature.trade_rev_points.impl.ui.screen.transfer.a) this.f1470y, (String) this.z, (TradeRevPointsRate) this.A, continuation, 8);
            case 9:
                return new n((mp6.n) this.f1468w, (yo6.d) this.f1469x, (String) this.f1470y, (yo6.e) this.z, (yo6.c) this.A, continuation, 9);
            case 10:
                return new n((com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.review.i) this.f1468w, (IncomeSorterDetailsDiff) this.f1469x, (String) this.f1470y, (String) this.z, (Boolean) this.A, continuation, 10);
            case 11:
                return new n((s63.g) this.f1470y, (com.revolut.feature.card_screen.impl.kompot.cards_carousel.screen.g) this.z, (h93.f0) this.A, continuation, 11);
            case 12:
                return new n((com.revolut.feature.subaccount.impl.ui.create.flow.main.c) this.f1468w, (SubaccountType) this.f1469x, (CreateSubaccountFlowContract$SubaccountInfo) this.f1470y, (List) this.z, (t7e.c) this.A, continuation, 12);
            case 13:
                return new n((com.revolut.feature.subaccount.impl.ui.qr_link.a) this.f1468w, (String) this.f1469x, (SubaccountType) this.f1470y, (xi0.b) this.z, (ChosenBackground) this.A, continuation, 13);
            case 14:
                return new n(14, (u8c.e) this.f1469x, (dj0.d) this.f1470y, (xi0.b) this.z, (xi0.b) this.A, continuation);
            case 15:
                return new n((wh3.i) this.f1468w, (n1) this.f1469x, (AccountId) this.z, (AnalyticsProduct) this.f1470y, (NaviCommand) this.A, continuation);
            case 16:
                return new n((oki.h) this.f1468w, (wll.e) this.f1469x, (String) this.f1470y, (Claim) this.z, (Set) this.A, continuation, 16);
            case 17:
                return new n((g0) this.z, (StakingPocket) this.A, continuation, 17);
            case 18:
                return new n(18, (xd2.f) this.f1469x, (AliasType) this.f1470y, (String) this.z, (String) this.A, continuation);
            case 19:
                return new n((xkl.i) this.f1468w, (String) this.f1469x, (Challenge) this.f1470y, (o10.c) this.z, (okl.s) this.A, continuation, 19);
            case 20:
                return new n(20, (ChatDatabase) this.f1469x, (UUID) this.f1470y, (uvl.c) this.z, (Function1) this.A, continuation);
            case 21:
                return new n((yji.l) this.f1468w, (AccountId) this.z, (String) this.f1469x, (String) this.f1470y, (k1j.a) this.A, continuation, 21);
            case 22:
                return new n((yji.l) this.f1468w, (AccountId) this.z, (String) this.f1469x, (String) this.f1470y, (k1j.a) this.A, continuation, 22);
            case 23:
                return new n((yji.l) this.f1468w, (AccountId) this.z, (String) this.f1469x, (String) this.f1470y, (k1j.a) this.A, continuation, 23);
            default:
                return new n((String) this.f1468w, (zpl.g) this.f1469x, (String) this.f1470y, (String) this.z, (a3l.b) this.A, continuation, 24);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((n) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0493 A[Catch: all -> 0x04ad, TryCatch #6 {all -> 0x04ad, blocks: (B:190:0x048d, B:192:0x0493, B:196:0x04af), top: B:449:0x048d }] */
    /* JADX WARN: Removed duplicated region for block: B:290:0x0795  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x0797  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x083a  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x083c  */
    /* JADX WARN: Removed duplicated region for block: B:356:0x089d  */
    /* JADX WARN: Removed duplicated region for block: B:361:0x08b3  */
    /* JADX WARN: Removed duplicated region for block: B:390:0x0959  */
    /* JADX WARN: Type inference failed for: r0v5, types: [a5k.y] */
    /* JADX WARN: Type inference failed for: r10v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r10v1, types: [dj0.d] */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r11v17, types: [u2f.a] */
    /* JADX WARN: Type inference failed for: r13v15, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r14v22, types: [u2f.a] */
    /* JADX WARN: Type inference failed for: r16v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v115 */
    /* JADX WARN: Type inference failed for: r1v116 */
    /* JADX WARN: Type inference failed for: r1v62 */
    /* JADX WARN: Type inference failed for: r1v75 */
    /* JADX WARN: Type inference failed for: r4v37, types: [int] */
    /* JADX WARN: Type inference failed for: r4v38 */
    /* JADX WARN: Type inference failed for: r4v46 */
    /* JADX WARN: Type inference failed for: r4v67 */
    /* JADX WARN: Type inference failed for: r4v68 */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r32) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2672
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a5k.n.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(com.revolut.trading.orders.ui.invest.placement.screens.edit.e eVar, Continuation continuation) {
        super(1, continuation);
        this.u = 4;
        this.A = eVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f1468w = obj2;
        this.f1469x = obj3;
        this.f1470y = obj4;
        this.z = obj5;
        this.A = obj6;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(Object obj2, Object obj3, Object obj4, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f1470y = obj2;
        this.z = obj3;
        this.A = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(Object obj2, Object obj3, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.z = obj2;
        this.A = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(wh3.i iVar, n1 n1Var, AccountId accountId, AnalyticsProduct analyticsProduct, NaviCommand naviCommand, Continuation continuation) {
        super(1, continuation);
        this.u = 15;
        this.f1468w = iVar;
        this.f1469x = n1Var;
        this.z = accountId;
        this.f1470y = analyticsProduct;
        this.A = naviCommand;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(yji.l lVar, AccountId accountId, String str, String str2, k1j.a aVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f1468w = lVar;
        this.z = accountId;
        this.f1469x = str;
        this.f1470y = str2;
        this.A = aVar;
    }
}
