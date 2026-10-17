package vx9;

import androidx.camera.camera2.pipe.compat.ActiveCamera;
import androidx.camera.camera2.pipe.compat.PruningCamera2DeviceManager;
import androidx.camera.camera2.pipe.compat.RequestCloseById;
import androidx.room.util.SQLiteStatementUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import com.revolut.chat.domain.model.draft.DraftRoutingKey;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.card_label.api.R$string;
import com.revolut.feature.crypto.config.api.models.CryptoPeggedPair;
import com.revolut.feature.payments.splitbill.impl.ui_new.manage_split.a;
import com.revolut.feature.push_to_card.api.data.CardOwnerWithStats;
import com.revolut.feature.tab.accounts.api.model.AccountWidgetItemModel;
import com.revolut.feature_crypto_order_flow.api.exchange.CryptoExchangeContract$MoneyDetails;
import com.revolut.feature_crypto_order_flow.api.exchange.CryptoOrderDraft;
import com.revolut.feature_crypto_order_flow.impl.order_summary.extensions.price.screen.OrderPriceScreenContract$InputData;
import com.revolut.retail.core.navigation.FragmentNavigateCommand;
import com.revolut.retail.feature.trading_onboarding.impl.actions.OnboardingActionsContract$LaunchRemediationNextPartAction;
import com.revolut.retail.feature.trading_onboarding.impl.actions.OnboardingActionsContract$LaunchTradingAccountNextOnboardingAction;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import nii.y0;
import skm.p0;
import v38.c;
import vy5.a1;
import vy5.d0;
import vy5.i0;
import vy5.v0;
import w07.g;
import zh9.u0;
import zhm.h0;
import zhm.r0;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f292854a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f292855b;

    public /* synthetic */ b(Object obj2, int i) {
        this.f292854a = i;
        this.f292855b = obj2;
    }

    /* JADX WARN: Type inference failed for: r0v87, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        efm.r rVarJust;
        ArrayList arrayListF;
        efm.r rVarJust2;
        efm.r rVarJust3;
        FragmentNavigateCommand fragmentNavigateCommand;
        Object next;
        switch (this.f292854a) {
            case 0:
                c cVar = (c) this.f292855b;
                List recentModels = (List) obj2;
                Intrinsics.checkNotNullParameter(recentModels, "recentModels");
                return cVar.f292857b.b(recentModels);
            case 1:
                g gVar = (g) this.f292855b;
                List recents = (List) obj2;
                Intrinsics.checkNotNullParameter(recents, "recents");
                kx9.a aVar = gVar.f292862b;
                ArrayList arrayList = new ArrayList();
                Iterator it8 = recents.iterator();
                while (it8.hasNext()) {
                    arrayList.add(nx9.c.b((jq9.o) it8.next(), false));
                }
                return aVar.b(arrayList);
            case 2:
                i iVar = (i) this.f292855b;
                List recentModels2 = (List) obj2;
                Intrinsics.checkNotNullParameter(recentModels2, "recentModels");
                return iVar.f292867a.b(recentModels2);
            case 3:
                g gVar2 = (g) this.f292855b;
                List recents2 = (List) obj2;
                Intrinsics.checkNotNullParameter(recents2, "recents");
                ArrayList arrayList2 = new ArrayList();
                Iterator it9 = recents2.iterator();
                while (it9.hasNext()) {
                    arrayList2.add(nx9.c.b((jq9.r) it9.next(), false));
                }
                return gVar2.f292862b.b(arrayList2);
            case 4:
                c cVar2 = (c) this.f292855b;
                List recipients = (List) obj2;
                Intrinsics.checkNotNullParameter(recipients, "recipients");
                ArrayList arrayList3 = new ArrayList();
                Iterator it10 = recipients.iterator();
                while (it10.hasNext()) {
                    arrayList3.add(nx9.c.b((jq9.s) it10.next(), false));
                }
                return cVar2.f292857b.b(arrayList3);
            case 5:
                s sVar = (s) this.f292855b;
                List recents3 = (List) obj2;
                Intrinsics.checkNotNullParameter(recents3, "recents");
                kx9.a aVar2 = sVar.f292885b;
                List list = recents3;
                ArrayList arrayList4 = new ArrayList();
                Iterator it11 = list.iterator();
                while (it11.hasNext()) {
                    arrayList4.add(nx9.c.b((jq9.n) it11.next(), false));
                }
                efm.b bVarB = aVar2.b(arrayList4);
                ArrayList timestamps = new ArrayList(zhm.w.t(list, 10));
                Iterator it12 = list.iterator();
                while (it12.hasNext()) {
                    CardOwnerWithStats cardOwnerWithStats = ((jq9.n) it12.next()).f177510b;
                    timestamps.add(new wpa.g(cardOwnerWithStats.f81495a.f81490a, cardOwnerWithStats.f81497c));
                }
                lra.d dVar = sVar.f292884a;
                Intrinsics.checkNotNullParameter(timestamps, "timestamps");
                xra.h hVar = dVar.f199477a;
                hVar.getClass();
                Intrinsics.checkNotNullParameter(timestamps, "timestamps");
                xra.j jVar = hVar.f308314c;
                jVar.getClass();
                Intrinsics.checkNotNullParameter(timestamps, "timestamps");
                pfm.h hVar2 = new pfm.h(new v3e.t(timestamps, jVar, 27), 2);
                Intrinsics.checkNotNullExpressionValue(hVar2, "fromAction(...)");
                return bVarB.e(te0.w.g0(hVar2));
            case 6:
                vxk.b bVar = (vxk.b) this.f292855b;
                OnboardingActionsContract$LaunchRemediationNextPartAction action = (OnboardingActionsContract$LaunchRemediationNextPartAction) obj2;
                Intrinsics.checkNotNullParameter(action, "action");
                return ue0.e.r(pd.b.n(p0.f264003c, new vxk.a(bVar, action, null)), h0.f322473a);
            case 7:
                vxk.b bVar2 = (vxk.b) this.f292855b;
                OnboardingActionsContract$LaunchTradingAccountNextOnboardingAction action2 = (OnboardingActionsContract$LaunchTradingAccountNextOnboardingAction) obj2;
                Intrinsics.checkNotNullParameter(action2, "action");
                return ue0.e.r(pd.b.n(p0.f264003c, new vxk.c(bVar2, action2, null)), h0.f322473a);
            case 8:
                com.revolut.feature.card_label.ui.screen.card_label_screen.d dVar2 = (com.revolut.feature.card_label.ui.screen.card_label_screen.d) this.f292855b;
                Throwable throwable = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(throwable, "it");
                dVar2.f64770q.getClass();
                Intrinsics.checkNotNullParameter(throwable, "throwable");
                yji.l.a1(dVar2, dVar2.X1(new y0(null, new nii.z(new TextLocalisedClause(R$string.card_label_update_error_title, null, null, 14), new TextLocalisedClause(R$string.card_label_update_error_subtitle, null, null, 14), new TextLocalisedClause(R$string.card_label_update_try_again, null, null, 14), null, null, null, false, null, null, null, null, null, null, 32756), false, 5)), null, null, new vrl.d(dVar2, null, 14), 3);
                return Boolean.TRUE;
            case 9:
                i0 i0Var = (i0) this.f292855b;
                od0.i baseCurrencyPocket = (od0.i) obj2;
                Intrinsics.checkNotNullParameter(baseCurrencyPocket, "baseCurrencyPocket");
                uy5.f fVar = i0Var.f293163b;
                io3.l type = io3.l.CURRENT;
                vy5.p0 p0Var = (vy5.p0) fVar;
                p0Var.getClass();
                Intrinsics.checkNotNullParameter(type, "type");
                efm.r rVarA = p0Var.f293204l.a(type);
                efm.r map = i0Var.f293165g.c().map(new mic.a0(26, vy5.y.f293243a));
                Intrinsics.checkNotNullExpressionValue(map, "map(...)");
                cxe.u uVarE = ((d89.g) i0Var.e).e(z79.b.MAIN);
                kotlin.coroutines.g gVar3 = kotlin.coroutines.g.f186406a;
                efm.r rVarC = rd0.e.c(uVarE, gVar3);
                efm.r rVarK = i0Var.f293164c.k(false);
                efm.r rVarC2 = rd0.e.c(((o95.e) i0Var.f293167j).a(), gVar3);
                io3.d dVar3 = (io3.d) baseCurrencyPocket.g();
                if (dVar3 != null) {
                    wda.r rVar = i0Var.k;
                    xi0.a aVar3 = xi0.b.Companion;
                    String str = dVar3.f163147c;
                    aVar3.getClass();
                    rVarJust = rd0.e.c(new d0(rVar.c(dVar3, xi0.a.a(str)), 0), gVar3);
                } else {
                    od0.i.Companion.getClass();
                    rVarJust = efm.r.just(od0.i.f224256b);
                    Intrinsics.h(rVarJust);
                }
                efm.r map2 = rVarJust.map(new mic.a0(25, vy5.z.f293245a));
                Intrinsics.checkNotNullExpressionValue(map2, "map(...)");
                return nim.a.w(mif.a.h(rVarA, map, rVarC, rVarK, rVarC2, map2), new vrl.n(i0Var, baseCurrencyPocket, 19));
            case 10:
                a1 a1Var = (a1) this.f292855b;
                vf0.g gVar4 = (vf0.g) obj2;
                xi0.b bVar3 = (xi0.b) gVar4.f288428a;
                dj0.d dVar4 = (dj0.d) gVar4.f288429b;
                List list2 = (List) gVar4.f288430c;
                vy5.a aVar4 = (vy5.a) gVar4.d;
                List list3 = (List) gVar4.e;
                do3.n nVar = (do3.n) gVar4.f;
                f95.b bVar4 = (f95.b) gVar4.f288431g;
                Set set = (Set) gVar4.f288432h;
                io3.d dVar5 = (io3.d) zhm.d0.d0(list2);
                if (dVar5 != null) {
                    v0 v0Var = a1Var.f293134a;
                    Intrinsics.checkNotNullParameter(bVar4, "<this>");
                    arrayListF = v0Var.f(dVar5, aVar4, bVar3, bVar4 instanceof f95.a);
                } else {
                    arrayListF = null;
                }
                if (arrayListF != null) {
                    rVarJust2 = a1Var.f.a(arrayListF);
                } else {
                    rVarJust2 = efm.r.just(AccountWidgetItemModel.EmptyStateStories.NotApplicable.f89489a);
                    Intrinsics.h(rVarJust2);
                }
                if (dVar5 != null) {
                    rVarJust3 = rd0.e.c(a1Var.f293138h.d(dVar5.f163146b, io3.l.CURRENT, list2, bVar3), kotlin.coroutines.g.f186406a);
                } else {
                    rVarJust3 = efm.r.just(r0.g());
                    Intrinsics.h(rVarJust3);
                }
                efm.r map3 = te0.w.l(rVarJust2, rVarJust3).map(new w(new uyh.r(a1Var, list2, nVar, dVar4, list3, aVar4, bVar3, bVar4, set, 1), 22));
                Intrinsics.h(map3);
                return map3;
            case 11:
                vy7.i iVar2 = (vy7.i) this.f292855b;
                Unit it13 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it13, "it");
                return okl.m.w(null, null, null, 7, ((vy7.m) iVar2.k).f293257b);
            case 12:
                vy7.m mVar = (vy7.m) this.f292855b;
                vy7.c screen = (vy7.c) obj2;
                Intrinsics.checkNotNullParameter(screen, "screen");
                int i = vy7.j.f293253a[screen.ordinal()];
                if (i == 1) {
                    nz7.d.Companion.getClass();
                    fragmentNavigateCommand = new FragmentNavigateCommand(nz7.a.f220972b, null, false, 2046);
                } else {
                    if (i != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    pz7.d.Companion.getClass();
                    fragmentNavigateCommand = new FragmentNavigateCommand(pz7.a.f240901b, null, false, 2046);
                }
                return mVar.f293257b.a(fragmentNavigateCommand);
            case 13:
                vz7.e eVar = (vz7.e) this.f292855b;
                Unit it14 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it14, "it");
                return ((uz7.q) eVar.k).a();
            case 14:
                com.revolut.feature.statements.impl.ui.custom_statement.flow.b bVar5 = (com.revolut.feature.statements.impl.ui.custom_statement.flow.b) this.f292855b;
                yja.b outputData = (yja.b) obj2;
                Intrinsics.checkNotNullParameter(outputData, "outputData");
                int i2 = vzd.c.f293527a[outputData.ordinal()];
                if (i2 == 1) {
                    oki.h.D2(bVar5.f88330p);
                } else {
                    if (i2 != 2 && i2 != 3 && i2 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    bVar5.l2(new com.revolut.feature.statements.impl.ui.custom_statement.flow.a(bVar5, null), new yi5.b(26));
                }
                return Unit.f186387a;
            case 15:
                vzh.h hVar3 = (vzh.h) this.f292855b;
                List peggedPairs = (List) obj2;
                Intrinsics.checkNotNullParameter(peggedPairs, "peggedPairs");
                CryptoOrderDraft cryptoOrderDraft = hVar3.f293536m;
                wd6.h hVar4 = cryptoOrderDraft.f;
                CryptoExchangeContract$MoneyDetails cryptoExchangeContract$MoneyDetails = cryptoOrderDraft.f96689a;
                wd6.e eVar2 = cryptoOrderDraft.e;
                Iterator it15 = peggedPairs.iterator();
                while (true) {
                    if (it15.hasNext()) {
                        next = it15.next();
                        CryptoPeggedPair cryptoPeggedPair = (CryptoPeggedPair) next;
                        xi0.b bVar6 = cryptoPeggedPair.f70777a;
                        xi0.b bVar7 = cryptoPeggedPair.f70778b;
                        CryptoExchangeContract$MoneyDetails cryptoExchangeContract$MoneyDetails2 = cryptoOrderDraft.f96690b;
                        if ((!Intrinsics.f(bVar6, cryptoExchangeContract$MoneyDetails.f96683a) || !Intrinsics.f(bVar7, cryptoExchangeContract$MoneyDetails2.f96683a)) && (!Intrinsics.f(bVar7, cryptoExchangeContract$MoneyDetails.f96683a) || !Intrinsics.f(cryptoPeggedPair.f70777a, cryptoExchangeContract$MoneyDetails2.f96683a))) {
                        }
                    } else {
                        next = null;
                    }
                }
                return new OrderPriceScreenContract$InputData(hVar4, eVar2, (CryptoPeggedPair) next);
            case 16:
                vzk.x xVar = (vzk.x) this.f292855b;
                Function0 it16 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it16, "it");
                return (vzk.n) xVar.f293576c.getValue();
            case 17:
                return PruningCamera2DeviceManager.prune$lambda$2$0((skm.q) this.f292855b, (Throwable) obj2);
            case 18:
                return PruningCamera2DeviceManager.prune$lambda$6((RequestCloseById) this.f292855b, (Throwable) obj2);
            case 19:
                return PruningCamera2DeviceManager.openCameraWithRetry_zDSwpeU$lambda$1((PruningCamera2DeviceManager) this.f292855b, (ActiveCamera) obj2);
            case 20:
                w07.o oVar = (w07.o) this.f292855b;
                Function0 getDefaultLoadingItems = (Function0) obj2;
                Intrinsics.checkNotNullParameter(getDefaultLoadingItems, "getDefaultLoadingItems");
                oVar.getClass();
                return new w07.k((List) getDefaultLoadingItems.invoke(), g.a.f293655a);
            case 21:
                b21.a aVar5 = ((w0e.c) this.f292855b).f293687c;
                SQLiteStatement sQLiteStatementPrepare = ((SQLiteConnection) obj2).prepare("SELECT * FROM slip_transactions");
                try {
                    int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "id");
                    int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "amount");
                    int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "completedAt");
                    ArrayList arrayList5 = new ArrayList();
                    while (sQLiteStatementPrepare.step()) {
                        Long lValueOf = null;
                        String text = sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow);
                        jo3.b bVarG = b21.a.g(sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2));
                        if (!sQLiteStatementPrepare.isNull(columnIndexOrThrow3)) {
                            lValueOf = Long.valueOf(sQLiteStatementPrepare.getLong(columnIndexOrThrow3));
                        }
                        arrayList5.add(new x0e.a(text, bVarG, b21.a.i(lValueOf)));
                        break;
                    }
                    return arrayList5;
                } finally {
                    sQLiteStatementPrepare.close();
                }
            case 22:
                com.revolut.feature.payments.splitbill.impl.ui_new.manage_split.b bVar8 = (com.revolut.feature.payments.splitbill.impl.ui_new.manage_split.b) this.f292855b;
                x1a.c output = (x1a.c) obj2;
                Intrinsics.checkNotNullParameter(output, "output");
                if (output instanceof x1a.b) {
                    bVar8.C2(a.C0520a.f79887a);
                } else if (!Intrinsics.f(output, x1a.a.f302355a)) {
                    throw new NoWhenBranchMatchedException();
                }
                return Unit.f186387a;
            case 23:
                w20.e eVar3 = (w20.e) this.f292855b;
                DraftRoutingKey routingKey = (DraftRoutingKey) obj2;
                Intrinsics.checkNotNullParameter(routingKey, "routingKey");
                o30.c cVar3 = (o30.c) eVar3.f293914c.get(w20.e.b(routingKey));
                if (cVar3 == null || !cVar3.f221672a.f302606g.isAfter(System.currentTimeMillis())) {
                    return null;
                }
                return cVar3;
            case 24:
                i9i.e eVar4 = (i9i.e) this.f292855b;
                w2a.j update = (w2a.j) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return w2a.j.a(update, null, new w2a.g(eVar4.f159882a), eVar4, 3);
            case 25:
                com.revolut.feature.retail.cfd.impl.flows.order.c cVar4 = (com.revolut.feature.retail.cfd.impl.flows.order.c) this.f292855b;
                aii.q it17 = (aii.q) obj2;
                Intrinsics.checkNotNullParameter(it17, "it");
                oki.h.D2(cVar4.u);
                return Unit.f186387a;
            case 26:
                w38.k kVar = (w38.k) this.f292855b;
                rea.g gVar5 = kVar.f294186c;
                v38.c jointProductState = (v38.c) obj2;
                Intrinsics.checkNotNullParameter(jointProductState, "jointProductState");
                if (jointProductState instanceof v38.a) {
                    return nim.a.v(u0.m(rd0.e.b(gVar5.c(l38.a.c(((v38.a) jointProductState).f285854a))), rd0.e.b(gVar5.d())), new b(jointProductState, 27));
                }
                if (jointProductState instanceof v38.d) {
                    return nim.a.v(rd0.e.b(r38.b.a(kVar.f294184a, l38.a.c(((v38.d) jointProductState).f285857a))), new w29.a(9));
                }
                if (jointProductState instanceof c.a) {
                    return zi0.c.i(new w38.i(n38.l.INSTANCE, 0, false));
                }
                if (jointProductState instanceof v38.b) {
                    return zi0.c.i(new w38.i(new n38.k(((v38.b) jointProductState).f285855a.f), 0, false));
                }
                throw new NoWhenBranchMatchedException();
            case 27:
                v38.c cVar5 = (v38.c) this.f292855b;
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                eda.b bVar9 = (eda.b) pair.f186385a;
                int iIntValue = ((Number) pair.f186386b).intValue();
                boolean z = bVar9.f124960a.get(eda.c.FIAT) != eda.d.ALL_ADDED;
                n38.a aVar6 = ((v38.a) cVar5).f285854a;
                return new w38.i(new n38.g(aVar6.f211923a, aVar6.f211924b), iIntValue, z);
            case 28:
                com.revolut.feature.retail.cfd.impl.screens.margin.a aVar7 = (com.revolut.feature.retail.cfd.impl.screens.margin.a) this.f292855b;
                kge.d dVar6 = aVar7.f82230q;
                nel.n instrument = (nel.n) obj2;
                Intrinsics.checkNotNullParameter(instrument, "instrument");
                w3b.e eVar5 = aVar7.f82231r;
                w3b.i iVar3 = eVar5.f294259b;
                String str2 = eVar5.f294260c;
                if (iVar3 instanceof w3b.f) {
                    return nim.a.v(vkm.q.Q(aVar7.f82229p.f(str2, instrument.f214596b), new mki.d((Continuation) null, aVar7, instrument, (w3b.f) iVar3, 26)), new w3b.l(aVar7, instrument));
                }
                if (iVar3 instanceof w3b.g) {
                    return nim.a.v(kge.d.u(dVar6, ((w3b.g) iVar3).f294262a, str2), new w3b.l(instrument, aVar7, 2));
                }
                if (iVar3.equals(w3b.h.f294263a)) {
                    return nim.a.v(kge.d.w(dVar6, eVar5.f294258a, eVar5.f294260c), new w3b.l(instrument, aVar7, 0));
                }
                throw new NoWhenBranchMatchedException();
            default:
                d4c.f fVar2 = (d4c.f) this.f292855b;
                w3c.e update2 = (w3c.e) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return w3c.e.a(update2, null, null, null, zi0.c.P(fVar2.f111274a, false, null, 3), null, null, 55);
        }
    }
}
