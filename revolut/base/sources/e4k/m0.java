package e4k;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.material.DrawerKt;
import androidx.compose.material.OutlinedTextFieldKt;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.room.util.SQLiteStatementUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import com.google.protobuf.f3;
import com.revolut.data.model.Data;
import com.revolut.retail.feature.payments.bank_transfer.api.navigation.BankTransferData;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.collections.IndexedValue;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class m0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f122618a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f122619b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f122620c;

    public /* synthetic */ m0(long j2, Object obj2, int i) {
        this.f122618a = i;
        this.f122619b = j2;
        this.f122620c = obj2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        ufm.i iVar;
        SQLiteStatement sQLiteStatementPrepare;
        boolean z;
        int i = 28;
        int i2 = 27;
        int i3 = 2;
        switch (this.f122618a) {
            case 0:
                BankTransferData bankTransferData = (BankTransferData) this.f122620c;
                long j2 = this.f122619b;
                x updateState = (x) obj2;
                Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                return x.a(updateState, null, BankTransferData.a(bankTransferData, j2, null, null, null, null, null, null, null, null, null, null, null, null, 1048574), null, 0, null, null, null, false, 1019);
            case 1:
                eed.n nVar = (eed.n) this.f122620c;
                long j3 = this.f122619b;
                pcd.s vault = (pcd.s) obj2;
                Intrinsics.checkNotNullParameter(vault, "vault");
                ryc.a aVar = nVar.i;
                wsg.n nVar2 = (wsg.n) aVar.f258289a;
                Intrinsics.checkNotNullParameter(vault, "vault");
                if (vault.f234889n == pcd.b.PERSONAL) {
                    efm.d0 d0VarR = osg.b.r(nVar2, kii.e.u(vault, xi0.b.Companion), null, null, null, 62);
                    yma.r rVar = new yma.r(new ypd.i(2), 27);
                    d0VarR.getClass();
                    ufm.i iVar2 = new ufm.i(d0VarR, rVar, 1);
                    Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                    iVar = ue0.e.D(iVar2, new ypg.j(aVar, vault, 0));
                } else {
                    int i5 = 1;
                    efm.d0 d0VarFirstOrError = m70.a.g(nVar2.e0(vault.f, w4l.h.f294642c), null, new ypg.h(i5), 1).firstOrError();
                    yma.r rVar2 = new yma.r(new ypg.j(aVar, vault, i5), i);
                    d0VarFirstOrError.getClass();
                    iVar = new ufm.i(d0VarFirstOrError, rVar2, 0);
                }
                return new pfm.a(iVar, new ed7.e(new csl.a(nVar, vault, j3, 4), 7), 4);
            case 2:
                esj.w wVar = (esj.w) this.f122620c;
                long j5 = this.f122619b;
                esj.o updateState2 = (esj.o) obj2;
                Intrinsics.checkNotNullParameter(updateState2, "$this$updateState");
                dj0.d enteredBudget = dj0.d.c(wVar.f, j5, null, 2);
                uzi.b budgetingCycle = wVar.f128985a;
                int i6 = wVar.f128986b;
                dj0.d categoriesSum = wVar.f128987c;
                dj0.d currentBudget = wVar.d;
                dj0.d lastSpendings = wVar.e;
                Intrinsics.checkNotNullParameter(budgetingCycle, "budgetingCycle");
                Intrinsics.checkNotNullParameter(categoriesSum, "categoriesSum");
                Intrinsics.checkNotNullParameter(currentBudget, "currentBudget");
                Intrinsics.checkNotNullParameter(lastSpendings, "lastSpendings");
                Intrinsics.checkNotNullParameter(enteredBudget, "enteredBudget");
                return esj.o.a(updateState2, new Data(new esj.w(budgetingCycle, i6, categoriesSum, currentBudget, lastSpendings, enteredBudget), null, false, 6, null));
            case 3:
                ((com.revolut.core.ui_kit.internal.views.timer.a) this.f122620c).setTime(this.f122619b);
                return Unit.f186387a;
            case 4:
                gv9.j jVar = (gv9.j) this.f122620c;
                long j16 = this.f122619b;
                jVar.getClass();
                sQLiteStatementPrepare = ((SQLiteConnection) obj2).prepare("\n        SELECT \n            * \n        FROM \n            payments_social_reactions \n        WHERE\n            type in ('TEXT','GIF','STICKER','PLAN_GIFTING','PLAN_REFERRAL','REFERRAL','SALARY_REFERRAL') AND\n            createdDate >= ?\n        ORDER BY \n            updatedDate DESC\n        ");
                try {
                    sQLiteStatementPrepare.bindLong(1, j16);
                    int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "id");
                    int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "senderId");
                    int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "recipientId");
                    int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "media");
                    int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "type");
                    int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isGroupChat");
                    int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "createdDate");
                    int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "updatedDate");
                    int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "status");
                    int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "state");
                    int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "metadata");
                    ArrayList arrayList = new ArrayList();
                    while (sQLiteStatementPrepare.step()) {
                        String text = sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow);
                        String text2 = sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2);
                        String text3 = sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3);
                        String text4 = sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow4);
                        String text5 = sQLiteStatementPrepare.isNull(columnIndexOrThrow5) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow5);
                        int i21 = columnIndexOrThrow7;
                        boolean z3 = ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow6)) != 0;
                        long j22 = sQLiteStatementPrepare.getLong(i21);
                        int i22 = columnIndexOrThrow;
                        arrayList.add(new iv9.a(text, text2, text3, text4, text5, z3, j22, sQLiteStatementPrepare.getLong(columnIndexOrThrow8), sQLiteStatementPrepare.isNull(columnIndexOrThrow9) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow9), sQLiteStatementPrepare.isNull(columnIndexOrThrow10) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow10), jVar.f147116c.b(sQLiteStatementPrepare.isNull(columnIndexOrThrow11) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow11))));
                        columnIndexOrThrow = i22;
                        columnIndexOrThrow7 = i21;
                        break;
                    }
                    return arrayList;
                } finally {
                }
            case 5:
                ha4.f fVar = (ha4.f) this.f122620c;
                long j42 = this.f122619b;
                ha4.d update = (ha4.d) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                List<ha4.j> list = update.f150438b;
                ArrayList sourceInputs = new ArrayList(zhm.w.t(list, 10));
                for (ha4.j jVar2 : list) {
                    if (Intrinsics.f(jVar2.f150444a, fVar.f150440a)) {
                        dj0.d value = dj0.d.c(jVar2.f150445b, j42, null, 2);
                        String id10 = jVar2.f150444a;
                        Intrinsics.checkNotNullParameter(id10, "id");
                        Intrinsics.checkNotNullParameter(value, "value");
                        jVar2 = new ha4.j(value, id10);
                    }
                    sourceInputs.add(jVar2);
                }
                oy3.a details = update.f150437a;
                Intrinsics.checkNotNullParameter(details, "details");
                Intrinsics.checkNotNullParameter(sourceInputs, "sourceInputs");
                return new ha4.d(details, sourceInputs);
            case 6:
                long j46 = this.f122619b;
                CharSequence charSequence = (CharSequence) this.f122620c;
                k50.h0 update2 = (k50.h0) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                k50.o0 o0Var = update2.e;
                return j46 > o0Var.f181193b ? k50.h0.a(update2, null, null, null, null, k50.o0.a(o0Var, charSequence, j46, null, null, false, null, null, 124), null, null, null, null, null, false, false, null, null, null, null, false, null, null, null, null, null, null, null, 268435439) : update2;
            case 7:
                Data data = (Data) this.f122620c;
                long j47 = this.f122619b;
                l3e.a aVar2 = (l3e.a) obj2;
                return l3e.a.a(aVar2, null, k3e.b.b(data, j47), k3e.b.a(j47, data, aVar2.f191938c), 1);
            case 8:
                Long l2 = (Long) this.f122620c;
                long j57 = this.f122619b;
                sQLiteStatementPrepare = ((SQLiteConnection) obj2).prepare("DELETE FROM balance_history WHERE date BETWEEN ? AND ?");
                try {
                    if (l2 == null) {
                        sQLiteStatementPrepare.bindNull(1);
                    } else {
                        sQLiteStatementPrepare.bindLong(1, l2.longValue());
                    }
                    sQLiteStatementPrepare.bindLong(2, j57);
                    sQLiteStatementPrepare.step();
                    sQLiteStatementPrepare.close();
                    return null;
                } catch (Throwable th10) {
                    throw th10;
                }
            case 9:
                long j58 = this.f122619b;
                Map map = (Map) this.f122620c;
                f3 buildStruct = (f3) obj2;
                Intrinsics.checkNotNullParameter(buildStruct, "$this$buildStruct");
                com.bumptech.glide.c.w(buildStruct, "duration", Long.valueOf(j58));
                for (Map.Entry entry : map.entrySet()) {
                    com.revolut.analytics.tracking.v3.f.c(buildStruct, (String) entry.getKey(), entry.getValue());
                }
                return Unit.f186387a;
            case 10:
                Function1 function1 = (Function1) this.f122620c;
                long j65 = this.f122619b;
                IndexedValue indexedValue = (IndexedValue) obj2;
                Intrinsics.checkNotNullParameter(indexedValue, "indexedValue");
                if (indexedValue.f186391a == 0 || ((Boolean) function1.invoke(indexedValue.f186392b)).booleanValue()) {
                    j65 = 0;
                }
                return Long.valueOf(j65);
            case 11:
                px9.c cVar = (px9.c) this.f122620c;
                long j69 = this.f122619b;
                String userCode = (String) obj2;
                Intrinsics.checkNotNullParameter(userCode, "userCode");
                mv9.k kVar = cVar.f240585a;
                Intrinsics.checkNotNullParameter(userCode, "userCode");
                efm.d0 d0VarFirstOrError2 = kVar.e(j69, userCode).firstOrError();
                msb.e eVar = new msb.e(15, new mv9.f(kVar, userCode, j69, 0));
                d0VarFirstOrError2.getClass();
                sfm.b bVar = new sfm.b(d0VarFirstOrError2, eVar, 2);
                Intrinsics.checkNotNullExpressionValue(bVar, "flatMapObservable(...)");
                return bVar;
            case 12:
                long j76 = this.f122619b;
                com.revolut.feature.travel.hotels.impl.ui_kompot.screen.search_results.map.b bVar2 = (com.revolut.feature.travel.hotels.impl.ui_kompot.screen.search_results.map.b) this.f122620c;
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                if (j76 == bVar2.S) {
                    bVar2.H2(bVar2.W, new ud3.m(i));
                }
                return Boolean.TRUE;
            case 13:
                uif.g gVar = (uif.g) this.f122620c;
                long j85 = this.f122619b;
                synchronized (gVar) {
                    z = gVar.f280438h < gVar.f280437g;
                }
                if (z) {
                    zhm.h0 h0Var = zhm.h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, "TransactionsQueryDispatcher", "Stuck query detected.", null, h0Var);
                    gVar.b(j85);
                }
                return Unit.f186387a;
            case 14:
                return DrawerKt.Scrim_Bx497Mc$lambda$2$0(this.f122619b, (Function0) this.f122620c, (DrawScope) obj2);
            case 15:
                return OutlinedTextFieldKt.outlineCutout_12SF9DM$lambda$0(this.f122619b, (PaddingValues) this.f122620c, (ContentDrawScope) obj2);
            case 16:
                long j100 = this.f122619b;
                return vgf.r.a((vgf.r) obj2, new Data(null, null, true, 3, null), null, Long.valueOf(j100), null, null, null, ((com.revolut.feature.transaction_list.impl.ui.list.screen.transactions.a) this.f122620c).J2(Long.valueOf(j100)), false, false, false, null, null, 4026);
            case 17:
                xx9.s sVar = (xx9.s) this.f122620c;
                long j101 = this.f122619b;
                do3.n user = (do3.n) obj2;
                Intrinsics.checkNotNullParameter(user, "user");
                wx9.d dVar = sVar.e;
                String currentUserId = user.f116408a;
                Intrinsics.checkNotNullParameter(currentUserId, "currentUserId");
                hx9.a aVar3 = dVar.f300795c;
                Long lValueOf = Long.valueOf(j101);
                Intrinsics.checkNotNullParameter(currentUserId, "currentUserId");
                efm.r rVarA = aVar3.a();
                ufm.i iVar3 = new ufm.i(((ty1.e) aVar3.f156414c).b(), new ty1.c(new tx.f(17), 6), 1);
                Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                efm.r rVarX = new ufm.i(ue0.e.F(iVar3, Boolean.TRUE), new hw3.d(23, new blj.s(lValueOf, i3)), 1).x();
                Intrinsics.checkNotNullExpressionValue(rVarX, "toObservable(...)");
                int i32 = 22;
                efm.r map2 = te0.w.F0(rVarA, rVarX).map(new hw3.d(i32, new hsa.l(aVar3, 4, lValueOf, currentUserId)));
                Intrinsics.checkNotNullExpressionValue(map2, "map(...)");
                efm.d0 d0VarFirstOrError3 = map2.firstOrError();
                Intrinsics.checkNotNullExpressionValue(d0VarFirstOrError3, "firstOrError(...)");
                efm.d0 d0VarFirstOrError4 = nim.a.w(rd0.e.c(((g48.r0) dVar.f300794b.f207713b).i(false), kotlin.coroutines.g.f186406a), new hwf.b(i32)).firstOrError();
                Intrinsics.checkNotNullExpressionValue(d0VarFirstOrError4, "firstOrError(...)");
                sfm.b bVar3 = new sfm.b(te0.w.H0(d0VarFirstOrError3, zi0.c.s(d0VarFirstOrError4)), new wx9.b(new wvg.d0(dVar, 13), 0), 2);
                Intrinsics.checkNotNullExpressionValue(bVar3, "flatMapObservable(...)");
                return m70.a.g(mo3.a.n(mif.a.h(bVar3, sVar.f309457g.a(j101), sVar.f.c(j101), sVar.f309456c.b(j101), sVar.d.a(j101), sVar.f309458h.g(j101))), null, new xx9.e(14), 1).map(new xx9.d(26, new xpe.c(user, sVar, 25))).filter(new xx9.d(27, new xx9.f(7)));
            case 18:
                yq9.c cVar2 = (yq9.c) this.f122620c;
                long j102 = this.f122619b;
                cVar2.getClass();
                sQLiteStatementPrepare = ((SQLiteConnection) obj2).prepare("\n        SELECT \n            * \n        FROM \n            payments_groups_bills \n        WHERE \n            createdDate >= ?\n        ORDER BY \n            createdDate\n        ");
                try {
                    sQLiteStatementPrepare.bindLong(1, j102);
                    int columnIndexOrThrow12 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "id");
                    int columnIndexOrThrow13 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "groupId");
                    int columnIndexOrThrow14 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "ownerId");
                    int columnIndexOrThrow15 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "createdBy");
                    int columnIndexOrThrow16 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "type");
                    int columnIndexOrThrow17 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "title");
                    int columnIndexOrThrow18 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "amount");
                    int columnIndexOrThrow19 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "currencyCode");
                    int columnIndexOrThrow20 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "exchangedAmount");
                    int columnIndexOrThrow21 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "createdDate");
                    int columnIndexOrThrow22 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "transactionId");
                    int columnIndexOrThrow23 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "transactionCategory");
                    int columnIndexOrThrow24 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "transactionLogo");
                    int columnIndexOrThrow25 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "lineItems");
                    int columnIndexOrThrow26 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "receiptImageUri");
                    ArrayList arrayList2 = new ArrayList();
                    while (sQLiteStatementPrepare.step()) {
                        String text6 = sQLiteStatementPrepare.isNull(columnIndexOrThrow12) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow12);
                        int i33 = columnIndexOrThrow12;
                        int i43 = columnIndexOrThrow26;
                        columnIndexOrThrow26 = i43;
                        arrayList2.add(new ar9.j(text6, sQLiteStatementPrepare.isNull(columnIndexOrThrow13) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow13), sQLiteStatementPrepare.isNull(columnIndexOrThrow14) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow14), sQLiteStatementPrepare.isNull(columnIndexOrThrow15) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow15), xq9.d.a(sQLiteStatementPrepare.isNull(columnIndexOrThrow16) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow16)), sQLiteStatementPrepare.isNull(columnIndexOrThrow17) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow17), sQLiteStatementPrepare.getLong(columnIndexOrThrow18), sQLiteStatementPrepare.isNull(columnIndexOrThrow19) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow19), b21.a.g(sQLiteStatementPrepare.isNull(columnIndexOrThrow20) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow20)), sQLiteStatementPrepare.getLong(columnIndexOrThrow21), sQLiteStatementPrepare.isNull(columnIndexOrThrow22) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow22), sQLiteStatementPrepare.isNull(columnIndexOrThrow23) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow23), sQLiteStatementPrepare.isNull(columnIndexOrThrow24) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow24), xq9.c.a(sQLiteStatementPrepare.isNull(columnIndexOrThrow25) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow25)), sQLiteStatementPrepare.isNull(i43) ? null : sQLiteStatementPrepare.getText(i43)));
                        columnIndexOrThrow12 = i33;
                        break;
                    }
                    return arrayList2;
                } finally {
                }
            case 19:
                yq9.o oVar = (yq9.o) this.f122620c;
                long j103 = this.f122619b;
                oVar.getClass();
                sQLiteStatementPrepare = ((SQLiteConnection) obj2).prepare("\n        SELECT \n            * \n        FROM \n            payments_groups_settlements \n        WHERE \n            createdDate >= ?\n        ORDER BY \n            createdDate\n        ");
                try {
                    sQLiteStatementPrepare.bindLong(1, j103);
                    int columnIndexOrThrow27 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "id");
                    int columnIndexOrThrow28 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "groupId");
                    int columnIndexOrThrow29 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "type");
                    int columnIndexOrThrow30 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "state");
                    int columnIndexOrThrow31 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "transactionId");
                    int columnIndexOrThrow32 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "paymentLinkId");
                    int columnIndexOrThrow33 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "payerId");
                    int columnIndexOrThrow34 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "payeeId");
                    int columnIndexOrThrow35 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "createdBy");
                    int columnIndexOrThrow36 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "amount");
                    int columnIndexOrThrow37 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "currencyCode");
                    int columnIndexOrThrow38 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "exchangedAmount");
                    int columnIndexOrThrow39 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "createdDate");
                    ArrayList arrayList3 = new ArrayList();
                    while (sQLiteStatementPrepare.step()) {
                        int i59 = columnIndexOrThrow27;
                        arrayList3.add(new ar9.v(sQLiteStatementPrepare.isNull(columnIndexOrThrow27) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow27), sQLiteStatementPrepare.isNull(columnIndexOrThrow28) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow28), yq9.o.a(sQLiteStatementPrepare.getText(columnIndexOrThrow29)), xq9.i.a(sQLiteStatementPrepare.isNull(columnIndexOrThrow30) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow30)), sQLiteStatementPrepare.isNull(columnIndexOrThrow31) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow31), sQLiteStatementPrepare.isNull(columnIndexOrThrow32) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow32), sQLiteStatementPrepare.isNull(columnIndexOrThrow33) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow33), sQLiteStatementPrepare.isNull(columnIndexOrThrow34) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow34), sQLiteStatementPrepare.isNull(columnIndexOrThrow35) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow35), sQLiteStatementPrepare.getLong(columnIndexOrThrow36), sQLiteStatementPrepare.isNull(columnIndexOrThrow37) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow37), b21.a.g(sQLiteStatementPrepare.isNull(columnIndexOrThrow38) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow38)), sQLiteStatementPrepare.getLong(columnIndexOrThrow39)));
                        columnIndexOrThrow27 = i59;
                        break;
                    }
                    return arrayList3;
                } finally {
                }
            default:
                z39.b bVar4 = (z39.b) this.f122620c;
                long j104 = this.f122619b;
                Boolean it8 = (Boolean) obj2;
                od0.i iVar4 = od0.i.f224256b;
                Intrinsics.checkNotNullParameter(it8, "it");
                if (!it8.booleanValue()) {
                    od0.i.Companion.getClass();
                    return efm.d0.m(iVar4);
                }
                ufm.p pVarT = new ufm.i(bVar4.f319221b.b(), new z1i.n(new z1i.l(21), i2), 1).t(j104, TimeUnit.MILLISECONDS);
                Intrinsics.checkNotNullExpressionValue(pVarT, "timeout(...)");
                od0.i.Companion.getClass();
                return ue0.e.F(pVarT, iVar4);
        }
    }

    public /* synthetic */ m0(long j2, Map map, com.revolut.analytics.tracking.v3.f fVar) {
        this.f122618a = 9;
        this.f122619b = j2;
        this.f122620c = map;
    }

    public /* synthetic */ m0(Object obj2, long j2, int i) {
        this.f122618a = i;
        this.f122620c = obj2;
        this.f122619b = j2;
    }
}
