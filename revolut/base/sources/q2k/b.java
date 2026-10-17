package q2k;

import android.app.Activity;
import android.os.Bundle;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.camera.camera2.impl.StillCaptureRequestControl;
import androidx.camera.camera2.impl.UseCaseCameraRequestControl;
import androidx.collection.ArrayMap;
import androidx.content.NavBackStackEntry;
import androidx.content.NavDestination;
import androidx.content.internal.NavControllerImpl;
import androidx.room.util.SQLiteStatementUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import aw0.o9;
import b9d.k;
import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.core.model.account.AccountId;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.badge.AccentCircleBadge;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.CurrencyImage;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.data.model.Data;
import com.revolut.domain.models.topup.methods.TopupMethod;
import com.revolut.domain.models.topup.methods.TopupMethodType;
import com.revolut.feature.bank_account_switching.impl.ui.switch_out.BankAccountSwitchingSwitchOutFlowContract$Step;
import com.revolut.feature.full_screen_prompt.c;
import com.revolut.feature.remote_stories.impl.ui.RemoteStoriesContract$Config;
import com.revolut.feature.remote_stories.impl.ui.StoriesEventsMetadata;
import com.revolut.feature.shared.savings.models.SavingsAccountDetails;
import com.revolut.feature.statements.api.models.StatementsFormat;
import com.revolut.feature.subscriptionscommon.impl.R$string;
import com.revolut.feature.tab.accounts.models.ProductAccountId;
import com.revolut.feature.topup_screen.api.model.CheckoutContext;
import com.revolut.feature.topup_screen.common.TopUpTarget;
import com.revolut.feature.topup_screen.impl.flows.checkout.flow.CheckoutFlowContract$Step;
import com.revolut.feature.topup_screen.impl.flows.topup.flow.data.SelectedMethod;
import com.revolut.feature.trading.transfer.investments.impl.ui.transfer_in_asset_selection.TransferInAssetSelectionFlowContract$InputData;
import com.revolut.feature.trading.transfer.investments.impl.ui.transfer_in_asset_selection.TransferInAssetSelectionFlowContract$State;
import com.revolut.feature.trading.transfer.investments.impl.ui.transfer_in_asset_selection.TransferInAssetSelectionFlowContract$Step;
import com.revolut.feature.travel.hotels.impl.ui_kompot.flow.amendment.TravelHotelsBookingAmendmentFlowContract$InputData;
import com.revolut.feature.travel.hotels.impl.ui_kompot.flow.amendment.TravelHotelsBookingAmendmentFlowContract$Step;
import com.revolut.feature_move_money.api.model.AccountWrapper;
import com.revolut.feature_web_view.declaration.WebViewControllerDescriptor;
import com.revolut.feature_web_view.declaration.WebViewInputData;
import com.revolut.feature_web_view.declaration.WebViewScreenTitleSource;
import com.revolut.kompot.common.ControllerDestination;
import com.revolut.kompot.navigable.TransitionAnimation;
import com.revolut.retail.feature.api.custom_assets.models.CustomAsset;
import com.revolut.retail.feature.api.custom_assets.models.CustomAssetCategoryDefinition;
import com.revolut.retail.feature.api.custom_assets.models.CustomAssetFieldDefinitions;
import com.revolut.retail.feature.balance.picker.api.models.JuniorInfo;
import com.revolut.retail.trading.core.domain.PocketInfo;
import com.revolut.retail.trading.core.domain.PocketOwnerInfo;
import com.revolut.shared.feature.move_money.api.navigation.Action;
import com.revolut.shared.feature.move_money.api.navigation.MoveMoneyInputData;
import com.revolut.shared.feature.wealth.models.config.TradingLegalEntityInformation;
import com.revolut.shared.feature.wealth.models.screener.ScreenerCollection;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import com.revolut.sso.impl.ui.auth.AuthenticationFlowContract$InputData;
import com.revolut.sso.impl.ui.auth.AuthenticationFlowContract$State;
import e8e.t;
import ejb.o;
import ejb.q;
import f28.b0;
import io3.l;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.o0;
import nel.z;
import no.r1;
import org.joda.time.Instant;
import qce.t0;
import qg7.p;
import r7i.s;
import rea.j;
import rea.m;
import rnb.r;
import rp0.y;
import ryd.w;
import skm.e0;
import skm.g0;
import tof.hc;
import tof.i7;
import u10.h;
import ufm.i;
import uyd.h0;
import uyd.j0;
import v30.c0;
import vkm.j2;
import vmh.g;
import yhm.m;
import yhm.n;
import zh9.u0;
import zhm.d0;
import zhm.f0;
import zhm.q0;
import zhm.u;
import zhm.v;
import zhm.y0;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f241719a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f241720b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f241721c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ b(int i, String str, Object obj2, Object obj3, Object obj4) {
        this.f241719a = i;
        this.f241721c = obj2;
        this.f241720b = str;
        this.d = obj3;
        this.e = obj4;
    }

    private final Object a(Object obj2) {
        UUID uuid = (UUID) this.f241721c;
        Instant instant = (Instant) this.d;
        Instant instant2 = (Instant) this.e;
        Instant instant3 = (Instant) this.f241720b;
        SQLiteStatement sQLiteStatementPrepare = ((SQLiteConnection) obj2).prepare("\n        SELECT * FROM (\n            SELECT * FROM messages\n            WHERE feedId = ? AND createdAt >= ? AND createdAt <= ?\n        )\n        UNION ALL\n        SELECT * FROM (\n            SELECT * FROM messages\n            WHERE feedId = ? AND ticketCreatedAt <= ? AND createdAt < ?\n            ORDER BY ticketCreatedAt DESC, createdAt DESC\n            LIMIT ?\n        )\n        ORDER BY ticketCreatedAt ASC, createdAt ASC\n    ");
        try {
            String strC = s10.a.c(uuid);
            if (strC == null) {
                sQLiteStatementPrepare.bindNull(1);
            } else {
                sQLiteStatementPrepare.bindText(1, strC);
            }
            String strB = s10.a.b(instant);
            if (strB == null) {
                sQLiteStatementPrepare.bindNull(2);
            } else {
                sQLiteStatementPrepare.bindText(2, strB);
            }
            String strB2 = s10.a.b(instant2);
            if (strB2 == null) {
                sQLiteStatementPrepare.bindNull(3);
            } else {
                sQLiteStatementPrepare.bindText(3, strB2);
            }
            String strC2 = s10.a.c(uuid);
            if (strC2 == null) {
                sQLiteStatementPrepare.bindNull(4);
            } else {
                sQLiteStatementPrepare.bindText(4, strC2);
            }
            String strB3 = s10.a.b(instant3);
            if (strB3 == null) {
                sQLiteStatementPrepare.bindNull(5);
            } else {
                sQLiteStatementPrepare.bindText(5, strB3);
            }
            String strB4 = s10.a.b(instant);
            if (strB4 == null) {
                sQLiteStatementPrepare.bindNull(6);
            } else {
                sQLiteStatementPrepare.bindText(6, strB4);
            }
            sQLiteStatementPrepare.bindLong(7, 30);
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "id");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "createdAt");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chatId");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "data");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "feedType");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "ticketCreatedAt");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "feedId");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "serverId");
            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chatIdGroup");
            int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "feedIdGroup");
            int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "feedTypeGroup");
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                String text = null;
                UUID uuidH = s10.a.h(sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow));
                Instant instantE = s10.a.e(sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2));
                UUID uuidH2 = s10.a.h(sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3));
                String text2 = sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow4);
                c0 c0VarD = s10.a.d(sQLiteStatementPrepare.isNull(columnIndexOrThrow5) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow5));
                Instant instantE2 = s10.a.e(sQLiteStatementPrepare.isNull(columnIndexOrThrow6) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow6));
                UUID uuidH3 = s10.a.h(sQLiteStatementPrepare.isNull(columnIndexOrThrow7) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow7));
                if (!sQLiteStatementPrepare.isNull(columnIndexOrThrow8)) {
                    text = sQLiteStatementPrepare.getText(columnIndexOrThrow8);
                }
                int i = columnIndexOrThrow;
                arrayList.add(new h(uuidH, instantE, uuidH2, text2, c0VarD, instantE2, uuidH3, s10.a.h(text), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow9), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow10), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow11)));
                columnIndexOrThrow = i;
            }
            sQLiteStatementPrepare.close();
            return arrayList;
        } catch (Throwable th10) {
            sQLiteStatementPrepare.close();
            throw th10;
        }
    }

    private final Object b(Object obj2) throws Throwable {
        m mVar = (m) this.f241721c;
        xi0.b bVar = (xi0.b) this.d;
        l lVar = (l) this.f241720b;
        AccountId accountId = (AccountId) this.e;
        Throwable throwable = (Throwable) obj2;
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        if (!(throwable instanceof NoSuchElementException)) {
            throw throwable;
        }
        return new i(new i(mVar.b(accountId, lVar, bVar), new rbf.c(new rea.i(mVar, accountId, 2), 29), 0), new j(new rd3.m(21), 0), 1);
    }

    private final Object c(Object obj2) {
        ArrayList arrayList;
        vmh.f fVar = (vmh.f) this.f241721c;
        rmh.m mVar = (rmh.m) this.d;
        zel.f fVar2 = (zel.f) this.e;
        g gVar = (g) this.f241720b;
        Pair pair = (Pair) obj2;
        Intrinsics.checkNotNullParameter(pair, "<destruct>");
        List list = (List) pair.f186385a;
        boolean zBooleanValue = ((Boolean) pair.f186386b).booleanValue();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj3 : list) {
            if (((ScreenerCollection) obj3).f105158h == zel.d.REVOLUT) {
                arrayList2.add(obj3);
            }
        }
        if (fVar == null) {
            arrayList = arrayList2;
        } else {
            ooh.d dVar = mVar.f255334b;
            if (fVar2 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            List listB = dVar.b(fVar2);
            ArrayList arrayList3 = new ArrayList();
            for (Object obj4 : arrayList2) {
                ArrayList arrayList4 = ((ScreenerCollection) obj4).f105157g;
                if (!arrayList4.isEmpty()) {
                    Iterator it8 = arrayList4.iterator();
                    while (true) {
                        if (!it8.hasNext()) {
                            break;
                        }
                        if (listB.contains((z) it8.next())) {
                            arrayList3.add(obj4);
                            break;
                        }
                    }
                }
            }
            arrayList = arrayList3;
        }
        return new nv5.e(mVar.d.a(arrayList), arrayList, zBooleanValue, gVar, mVar);
    }

    private final Object d(Object obj2) {
        r rVar = (r) this.f241721c;
        List list = (List) this.e;
        xi0.b bVar = (xi0.b) this.d;
        LocalDate localDate = (LocalDate) this.f241720b;
        i7 filter = (i7) obj2;
        Intrinsics.checkNotNullParameter(filter, "filter");
        com.revolut.domain.interactors.transactions.a aVar = rVar.f255580b;
        i7.c cVar = i7.Companion;
        i7[] i7VarArr = {filter, q.a(o.INTEREST)};
        cVar.getClass();
        return nim.a.v(u0.i(rd0.e.b(com.revolut.domain.interactors.transactions.a.d(aVar, i7.c.a(i7VarArr), f0.f322471a, null, null, null, 28)), rVar.d(), rVar.f(list, bVar)), new rnb.q(bVar, rVar, localDate));
    }

    private final Object e(Object obj2) {
        r rVar = (r) this.f241721c;
        List list = (List) this.e;
        xi0.b bVar = (xi0.b) this.d;
        hc hcVar = (hc) this.f241720b;
        i7 filter = (i7) obj2;
        Intrinsics.checkNotNullParameter(filter, "filter");
        com.revolut.domain.interactors.transactions.a aVar = rVar.f255580b;
        i7.c cVar = i7.Companion;
        i7[] i7VarArr = {filter, q.a(o.INTEREST)};
        cVar.getClass();
        return nim.a.v(u0.i(rd0.e.b(com.revolut.domain.interactors.transactions.a.d(aVar, i7.c.a(i7VarArr), v.l(hcVar), null, null, null, 28)), rVar.d(), rVar.f(list, bVar)), new rgf.m(rVar, bVar, 12));
    }

    private final Object g(Object obj2) {
        com.revolut.feature.bank_account_switching.impl.ui.switch_out.a aVar = (com.revolut.feature.bank_account_switching.impl.ui.switch_out.a) this.f241721c;
        String str = (String) this.f241720b;
        mn2.a aVar2 = (mn2.a) this.d;
        LocalDate localDate = (LocalDate) this.e;
        com.revolut.feature.full_screen_prompt.c result = (com.revolut.feature.full_screen_prompt.c) obj2;
        Intrinsics.checkNotNullParameter(result, "result");
        if (Intrinsics.f(result, c.C0497c.f74506a)) {
            aVar.l2(new p(17, aVar, str, aVar2, localDate, (Continuation) null), new yi5.b(26));
        } else if (result instanceof d67.h) {
            aVar.C1(new ControllerDestination.Stack(new WebViewControllerDescriptor(new WebViewInputData("https://www.revolut.com/legal/privacy/", WebViewScreenTitleSource.Html.f98166a, false)), null, true));
        } else if (result instanceof c.a) {
            oki.h.t2(aVar, aVar.f64052s, new BankAccountSwitchingSwitchOutFlowContract$Step.Review(str), false, TransitionAnimation.SLIDE_START_TO_END.f98396a, false, 8);
        } else if (!Intrinsics.f(result, c.b.f74505a) && !Intrinsics.f(result, c.d.f74507a)) {
            throw new NoWhenBranchMatchedException();
        }
        return Unit.f186387a;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    private final java.lang.Object h(java.lang.Object r30) {
        /*
            Method dump skipped, instruction units count: 569
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: q2k.b.h(java.lang.Object):java.lang.Object");
    }

    private final Object i(Object obj2) {
        Data data;
        Data data2 = (Data) this.f241721c;
        rrc.f0 f0Var = (rrc.f0) this.d;
        String baseCurrencyCode = (String) this.f241720b;
        String str = (String) this.e;
        rrc.v vVar = (rrc.v) obj2;
        Intrinsics.h(data2);
        try {
            Object content = data2.getContent();
            data = new Data(content != null ? ((dda.a) content).f113159a : null, data2.getError(), data2.getLoading());
        } catch (Throwable th10) {
            data = new Data(null, th10, data2.getLoading());
        }
        ((aqc.h) f0Var.f256768r).getClass();
        Intrinsics.checkNotNullParameter(baseCurrencyCode, "baseCurrencyCode");
        xi0.b.Companion.getClass();
        return rrc.v.a(vVar, Intrinsics.f(baseCurrencyCode, xi0.b.F.f306286a), null, data, str, 5);
    }

    private final Object j(Object obj2) throws Throwable {
        Object objA;
        lie.a aVar;
        Object objRemove;
        rxl.b bVar = (rxl.b) this.f241721c;
        txl.e nudge = (txl.e) this.d;
        sxl.b bVar2 = (sxl.b) this.e;
        zxl.a aVar2 = (zxl.a) this.f241720b;
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        r1 r1Var = (r1) bVar.d;
        Intrinsics.checkNotNullParameter(nudge, "nudge");
        long jA = r1Var.f.a();
        try {
            m.Companion companion = yhm.m.INSTANCE;
            aVar = (lie.a) nudge;
            objRemove = r1Var.f217839g.remove(new txl.a(aVar.b()));
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th10) {
            m.Companion companion2 = yhm.m.INSTANCE;
            objA = yhm.o.a(th10);
        }
        if (objRemove == null) {
            throw new IllegalArgumentException(("Nudge " + aVar.b() + " disappeared without tracked appearance").toString());
        }
        objA = Long.valueOf(jA - ((Number) objRemove).longValue());
        Throwable thA = yhm.m.a(objA);
        if (thA != null) {
            hx7.e.n(thA);
        }
        if (objA instanceof n) {
            objA = null;
        }
        Long l2 = (Long) objA;
        e0.C(r1Var.e.c(), null, null, new com.revolut.analytics.tracking.v3.i(r1Var, nudge, zBooleanValue, l2 != null ? l2.longValue() : 0L, null), 3);
        bVar2.b(nudge);
        Activity activity = bVar.f258189a;
        if (!activity.isFinishing() && !activity.isDestroyed()) {
            ViewParent parent = aVar2.getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                if (viewGroup.isInLayout()) {
                    viewGroup.post(new p6.e(aVar2, viewGroup, 12));
                } else {
                    viewGroup.removeView(aVar2);
                }
            }
        }
        bVar.e = false;
        return Unit.f186387a;
    }

    private final Object k(Object obj2) {
        w wVar = (w) this.f241721c;
        LocalDate fromDate = (LocalDate) this.d;
        LocalDate toDate = (LocalDate) this.e;
        wi0.b countryCode = (wi0.b) this.f241720b;
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        uyd.v vVar = wVar.f258357a;
        StatementsFormat format = StatementsFormat.PDF;
        h0 h0Var = (h0) vVar;
        h0Var.getClass();
        Intrinsics.checkNotNullParameter(fromDate, "fromDate");
        Intrinsics.checkNotNullParameter(toDate, "toDate");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        Intrinsics.checkNotNullParameter(format, "format");
        return h0Var.v.e(new j0(fromDate, toDate, countryCode, format, zBooleanValue), w4l.i.f294643c);
    }

    private final Object l(Object obj2) {
        return NavControllerImpl.navigate$lambda$44((Ref$BooleanRef) this.f241721c, (NavControllerImpl) this.d, (NavDestination) this.e, (Bundle) this.f241720b, (NavBackStackEntry) obj2);
    }

    private final Object m(Object obj2) {
        String str = (String) this.f241720b;
        s78.m mVar = (s78.m) this.f241721c;
        String str2 = (String) this.d;
        ProductAccountId productAccountId = (ProductAccountId) this.e;
        List walletsWithPockets = (List) obj2;
        Intrinsics.checkNotNullParameter(walletsWithPockets, "walletsWithPockets");
        int i = 2;
        if (walletsWithPockets.isEmpty()) {
            return new go.g(new Data(null, new IllegalArgumentException(j6.a.q("No wallet found for junior with id = ", str)), false, 5, null), 2);
        }
        fo3.c cVar = (fo3.c) ((Pair) d0.b0(walletsWithPockets)).f186385a;
        if (walletsWithPockets.size() > 1) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException(j6.a.q("Found more than one wallet for junior with id = ", str));
            zhm.h0 h0Var = zhm.h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException, h0Var);
        }
        String walletId = cVar.f136801a;
        m78.d dVar = mVar.f260587c;
        Intrinsics.checkNotNullParameter(walletId, "walletId");
        wsg.n nVar = dVar.f203337a;
        Intrinsics.checkNotNullParameter(walletId, "walletId");
        w4l.h loadingStrategy = w4l.h.f294642c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        atg.v vVar = (atg.v) nVar.f299736b;
        Intrinsics.checkNotNullParameter(walletId, "walletId");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        atg.h hVar = (atg.h) vVar.e;
        hVar.getClass();
        Intrinsics.checkNotNullParameter(walletId, "walletId");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return rd0.e.b(pd.b.s(nim.a.w(hVar.f9053g.e(walletId, loadingStrategy), new m78.b(dVar, str2, i)), new ryd.f(walletId, mVar, str, str2, productAccountId)));
    }

    private final Object n(Object obj2) {
        com.revolut.feature.trading.transfer.investments.impl.ui.transfer_in_asset_selection.a aVar = (com.revolut.feature.trading.transfer.investments.impl.ui.transfer_in_asset_selection.a) this.f241721c;
        qki.d dVar = aVar.o;
        TransferInAssetSelectionFlowContract$InputData transferInAssetSelectionFlowContract$InputData = (TransferInAssetSelectionFlowContract$InputData) this.d;
        yki.l lVar = (yki.l) this.e;
        TransferInAssetSelectionFlowContract$Step transferInAssetSelectionFlowContract$Step = (TransferInAssetSelectionFlowContract$Step) this.f241720b;
        x9f.j output = (x9f.j) obj2;
        Intrinsics.checkNotNullParameter(output, "output");
        if (!(output instanceof x9f.i)) {
            throw new NoWhenBranchMatchedException();
        }
        aVar.H2(dVar, new s78.d(output, 8));
        u8f.h hVar = transferInAssetSelectionFlowContract$InputData.getF91556a().f91502c;
        switch (hVar == null ? -1 : s9f.d.f261175a[hVar.ordinal()]) {
            case -1:
            case 1:
            case 2:
            case 3:
            case 4:
                s9f.c cVarI2 = com.revolut.feature.trading.transfer.investments.impl.ui.transfer_in_asset_selection.a.I2((TransferInAssetSelectionFlowContract$State) ((j2) dVar.f22677a).getValue());
                if (cVarI2 != null) {
                    aVar.C2(cVarI2);
                }
                break;
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 5:
            case 6:
                oki.h.t2(aVar, lVar, new TransferInAssetSelectionFlowContract$Step.BuyInPrice(((TransferInAssetSelectionFlowContract$Step.NumberOfShares) transferInAssetSelectionFlowContract$Step).f91563a), true, null, false, 12);
                break;
        }
        return Unit.f186387a;
    }

    private final Object o(Object obj2) {
        s9h.h hVar = (s9h.h) this.f241721c;
        String str = (String) this.f241720b;
        String str2 = (String) this.d;
        dsh.e eVar = (dsh.e) this.e;
        Intrinsics.checkNotNullParameter((Function0) obj2, "<unused var>");
        return hVar.d(str, str2, eVar);
    }

    /* JADX WARN: Finally extract failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        amd.e eVar;
        List list;
        amd.d dVar;
        amd.f fVar;
        SQLiteStatement sQLiteStatementPrepare;
        u10.e eVar2;
        int i;
        n2l.j jVarB;
        n2l.j jVarB2;
        TradingAccount.TaxAdvantage.Limit f105255l;
        TradingAccount.TaxAdvantage.Limit.TopUpLimit topUpLimit;
        int i2 = this.f241719a;
        int i3 = 5;
        Object obj3 = this.f241720b;
        Object obj4 = this.e;
        Object obj5 = this.d;
        Object obj6 = this.f241721c;
        switch (i2) {
            case 0:
                e eVar3 = (e) obj6;
                AccountId accountId = (AccountId) obj4;
                wsg.n nVar = eVar3.f241739c;
                pfm.r rVarN0 = nVar.n0((xi0.b) obj5, accountId);
                pfm.h hVar = new pfm.h(new phc.d(eVar3, (String) obj3, 9), 2);
                Intrinsics.checkNotNullExpressionValue(hVar, "fromAction(...)");
                return efm.b.p(rVarN0, hVar, nVar.k0(accountId), nVar.j0(accountId)).D(obj2);
            case 1:
                String str = (String) obj3;
                t0 t0Var = (t0) obj6;
                String str2 = (String) obj5;
                qua.p pVar = (qua.p) obj4;
                vf0.h hVar2 = (vf0.h) obj2;
                Intrinsics.checkNotNullParameter(hVar2, "<destruct>");
                Data data = (Data) hVar2.f288433a;
                Data data2 = (Data) hVar2.f288434b;
                od0.i iVar = (od0.i) hVar2.f288435c;
                k71.q qVar = (k71.q) hVar2.d;
                List list2 = (List) iii.c.f(t1.t(data, data2), new t(t0Var, pVar, 4), new a83.z(t0Var, 14, pVar, qVar), new lk7.p(t0Var, 22, pVar, qVar));
                int i5 = 12;
                TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.subscription_unblock_confirmation_title, u.c(str), null, 12);
                String str3 = (String) iVar.f224257a;
                return new y(list2, new rp0.t(textLocalisedClause, str3 != null ? new TextLocalisedClause(R$string.subscription_unblock_confirmation_someones_subtitle, u.c(str3), null, 12) : (Clause) iii.c.f(data, new qc7.c(i5), new b0(str, 16), new k(str, 9)), null, 28), rp0.l.WINDOW, null, null, null, str2, null, null, null, 3832);
            case 2:
                return qij.o.a((qij.o) obj6, (List) obj5, (List) obj4, (List) obj3, ((Boolean) obj2).booleanValue(), 16);
            case 3:
                String bottomSheetId = (String) obj3;
                String str4 = (String) obj5;
                Map parameters = (Map) obj4;
                hha.d it8 = (hha.d) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                egk.e eVar4 = ((qjk.t) obj6).f246915b;
                String currentPlanId = it8.f152287a;
                wik.t tVar = (wik.t) eVar4;
                Intrinsics.checkNotNullParameter(currentPlanId, "planId");
                Intrinsics.checkNotNullParameter(bottomSheetId, "bottomSheetId");
                Intrinsics.checkNotNullParameter(parameters, "parameters");
                kjk.u uVar = tVar.f297935a;
                List enabledExperiments = tVar.c();
                kjk.f0 f0Var = (kjk.f0) uVar;
                f0Var.getClass();
                Intrinsics.checkNotNullParameter(currentPlanId, "currentPlanId");
                Intrinsics.checkNotNullParameter(bottomSheetId, "bottomSheetId");
                Intrinsics.checkNotNullParameter(enabledExperiments, "enabledExperiments");
                w4l.i loadingStrategy = w4l.i.f294643c;
                Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                Intrinsics.checkNotNullParameter(parameters, "parameters");
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry entry : parameters.entrySet()) {
                    if (kjk.f0.f184432t.contains((String) entry.getKey())) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                return rd0.e.b(((w4l.f) f0Var.f184440m.getValue()).e(new kjk.z(currentPlanId, bottomSheetId, enabledExperiments, str4, linkedHashMap), loadingStrategy));
            case 4:
                qkl.j jVar = (qkl.j) obj6;
                AuthenticationFlowContract$InputData authenticationFlowContract$InputData = (AuthenticationFlowContract$InputData) obj5;
                AuthenticationFlowContract$State authenticationFlowContract$State = (AuthenticationFlowContract$State) obj4;
                okl.d dVar2 = (okl.d) obj3;
                skl.c screenResult = (skl.c) obj2;
                Intrinsics.checkNotNullParameter(screenResult, "screenResult");
                if (!Intrinsics.f(screenResult, skl.c.f263952a)) {
                    throw new NoWhenBranchMatchedException();
                }
                qkl.g gVarZ2 = jVar.Z2(authenticationFlowContract$InputData, authenticationFlowContract$State);
                if (gVarZ2 instanceof qkl.d) {
                    IllegalStateException illegalStateException = new IllegalStateException(gVarZ2.getClass().getName().concat(" is unexpected"));
                    zhm.h0 h0Var = zhm.h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
                } else if (gVarZ2 instanceof qkl.e) {
                    dVar2.invoke(new qkl.a(((qkl.e) gVarZ2).f247027a));
                } else {
                    if (!(gVarZ2 instanceof qkl.f)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    dVar2.invoke(qkl.b.f247025a);
                }
                return Unit.f186387a;
            case 5:
                qmd.g gVar = (qmd.g) obj6;
                String str5 = (String) obj3;
                org.joda.time.LocalDate localDate = (org.joda.time.LocalDate) obj5;
                kmd.c cVar = (kmd.c) obj4;
                kmd.b data3 = (kmd.b) obj2;
                Intrinsics.checkNotNullParameter(data3, "data");
                if (!Intrinsics.f(data3.getSuccess(), Boolean.TRUE)) {
                    return qmd.g.a(cVar);
                }
                String string = localDate.toString();
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                gVar.f247812b.G(string, a0.d.r(str5, "-known_projection"), wim.z.d(o0.b(String.class)));
                List forecast = data3.getForecast();
                ArrayList arrayList = new ArrayList(zhm.w.t(forecast, 10));
                Iterator it9 = forecast.iterator();
                while (it9.hasNext()) {
                    arrayList.add(Long.valueOf((long) ((Number) it9.next()).doubleValue()));
                }
                return arrayList;
            case 6:
                gsd.c cVar2 = (gsd.c) obj4;
                List list3 = (List) obj3;
                xi0.b bVar = (xi0.b) obj5;
                List exchangeRates = (List) obj2;
                Intrinsics.checkNotNullParameter(exchangeRates, "exchangeRates");
                ArrayList arrayList2 = ((CustomAssetFieldDefinitions) obj6).f99230a;
                int iB = q0.b(zhm.w.t(arrayList2, 10));
                if (iB < 16) {
                    iB = 16;
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(iB);
                for (Object obj7 : arrayList2) {
                    linkedHashMap2.put(((CustomAssetCategoryDefinition) obj7).f99224a, obj7);
                }
                LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                for (Object obj8 : list3) {
                    vzi.b bVar2 = ((CustomAsset) obj8).f99217b;
                    Object arrayList3 = linkedHashMap3.get(bVar2);
                    if (arrayList3 == null) {
                        arrayList3 = new ArrayList();
                        linkedHashMap3.put(bVar2, arrayList3);
                    }
                    ((List) arrayList3).add(obj8);
                }
                ArrayList arrayList4 = new ArrayList();
                for (Map.Entry entry2 : linkedHashMap3.entrySet()) {
                    vzi.b bVar3 = (vzi.b) entry2.getKey();
                    List list4 = (List) entry2.getValue();
                    CustomAssetCategoryDefinition categoryDefinition = (CustomAssetCategoryDefinition) linkedHashMap2.get(bVar3);
                    if (categoryDefinition == null) {
                        list = exchangeRates;
                        dVar = null;
                    } else {
                        List list5 = list4;
                        List listP0 = d0.P0(list5, new qsd.c());
                        Intrinsics.checkNotNullParameter(bVar3, "<this>");
                        switch (qsd.a.f248797a[bVar3.ordinal()]) {
                            case 1:
                                eVar = amd.e.CUSTOM_ASSET_PROPERTY;
                                break;
                            case 2:
                                eVar = amd.e.CUSTOM_ASSET_VEHICLE;
                                break;
                            case 3:
                                eVar = amd.e.CUSTOM_ASSET_FINE_ART_AND_ANTIQUE;
                                break;
                            case 4:
                                eVar = amd.e.CUSTOM_ASSET_COLLECTIBLE;
                                break;
                            case 5:
                                eVar = amd.e.CUSTOM_ASSET_WATCH;
                                break;
                            case 6:
                                eVar = amd.e.CUSTOM_ASSET_JEWELLERY;
                                break;
                            case 7:
                                eVar = amd.e.CUSTOM_ASSET_OTHER;
                                break;
                            case 8:
                                eVar = amd.e.CUSTOM_ASSET_UNKNOWN;
                                break;
                            default:
                                throw new NoWhenBranchMatchedException();
                        }
                        List<CustomAsset> list6 = listP0;
                        ArrayList arrayList5 = new ArrayList(zhm.w.t(list6, 10));
                        for (CustomAsset asset : list6) {
                            Intrinsics.checkNotNullParameter(asset, "asset");
                            Intrinsics.checkNotNullParameter(categoryDefinition, "categoryDefinition");
                            Map map = asset.i;
                            dj0.d dVar3 = asset.f99218c;
                            Object obj9 = map.get("assetName");
                            String str6 = obj9 instanceof String ? (String) obj9 : null;
                            amd.r rVar = new amd.r(asset, categoryDefinition);
                            List list7 = exchangeRates;
                            LayeredImage layeredImageA = rrd.b.a(asset.f99217b, false);
                            if (str6 == null) {
                                str6 = "";
                            }
                            TextClause textClause = new TextClause(str6, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                            if (asset.f99223m) {
                                Object obj10 = asset.i.get("purchaseAmount");
                                dj0.d dVar4 = obj10 instanceof dj0.d ? (dj0.d) obj10 : null;
                                dj0.d dVar5 = dVar4 == null ? dVar3 : dVar4;
                                fVar = new amd.f(textClause, new TextLocalisedClause(com.revolut.feature.spending_analytics.api.R$string.analytics_total_wealth_custom_assets_smart_estimation_estimating_value, null, null, 14), dVar5 != null ? new MoneyClause(dVar5, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12) : null, null, layeredImageA, new AccentCircleBadge(dw0.a.Pending), rVar, 136);
                            } else if (asset.f99221j == vzi.i.SMART_ESTIMATION) {
                                fVar = new amd.f(textClause, new TextLocalisedClause(com.revolut.feature.spending_analytics.api.R$string.analytics_total_wealth_custom_assets_smart_estimation_estimated_value, null, null, 14), dVar3 != null ? new MoneyClause(dVar3, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12) : null, rrd.f.a(asset), layeredImageA, new AccentCircleBadge(dw0.a.Info), rVar, 128);
                            } else {
                                fVar = new amd.f(textClause, null, dVar3 != null ? new MoneyClause(dVar3, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12) : null, rrd.f.a(asset), layeredImageA, null, rVar, 162);
                            }
                            arrayList5.add(fVar);
                            exchangeRates = list7;
                        }
                        list = exchangeRates;
                        j9l.a aVar = (j9l.a) cVar2.e;
                        ArrayList arrayList6 = new ArrayList(zhm.w.t(list5, 10));
                        Iterator it10 = list5.iterator();
                        while (it10.hasNext()) {
                            dj0.d dVar6 = ((CustomAsset) it10.next()).f99218c;
                            if (dVar6 == null) {
                                dVar6 = new dj0.d(0L, bVar);
                            }
                            arrayList6.add(dVar6);
                        }
                        dj0.d dVarA = aVar.a(bVar, arrayList6, list);
                        if (dVarA == null) {
                            dVarA = new dj0.d(0L, bVar);
                        }
                        dVar = new amd.d(eVar, arrayList5, f0.f322471a, dVarA);
                    }
                    if (dVar != null) {
                        arrayList4.add(dVar);
                    }
                    exchangeRates = list;
                }
                return new amd.j(amd.b.OTHER_ASSETS, d0.P0(arrayList4, new qsd.b()), null, true, null, 20);
            case 7:
                com.revolut.feature.topup_screen.impl.flows.checkout.flow.e eVar5 = (com.revolut.feature.topup_screen.impl.flows.checkout.flow.e) obj6;
                wwe.a aVar2 = eVar5.f90703q;
                yte.n nVar2 = (yte.n) obj5;
                CheckoutContext checkoutContext = (CheckoutContext) obj4;
                TopUpTarget topUpTarget = (TopUpTarget) obj3;
                hwe.k outputData = (hwe.k) obj2;
                Intrinsics.checkNotNullParameter(outputData, "outputData");
                Continuation continuation = null;
                if (outputData instanceof hwe.i) {
                    com.revolut.feature.topup_screen.impl.flows.topup.flow.data.h hVar3 = eVar5.f90705s;
                    hwe.i iVar2 = (hwe.i) outputData;
                    TopupMethod topupMethod = iVar2.f156142a;
                    SelectedMethod selectedMethodF = hVar3.f(topupMethod);
                    ((e0f.r1) eVar5.f90706t).n(topupMethod, iVar2.f156143b, nVar2);
                    if (topupMethod instanceof TopupMethod.OtherMethod) {
                        TopupMethodType topupMethodType = ((TopupMethod.OtherMethod) topupMethod).f60440a;
                        switch (qwe.f.f249894c[topupMethodType.ordinal()]) {
                            case 1:
                                oki.h.t2(eVar5, eVar5.M, CheckoutFlowContract$Step.CardDetails.f90673a, false, null, false, 12);
                                break;
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                                aVar2.f300649b.setValue(selectedMethodF);
                                break;
                            default:
                                IllegalStateException illegalStateException2 = new IllegalStateException("Selected method not supported by Checkout flow type=" + topupMethodType);
                                zhm.h0 h0Var2 = zhm.h0.f322473a;
                                CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                                rd0.d.a(rd0.c.ERROR, null, null, illegalStateException2, h0Var2);
                                break;
                        }
                    } else if (topupMethod instanceof TopupMethod.StoredMethod.Card) {
                        aVar2.f300649b.setValue(selectedMethodF);
                    } else {
                        IllegalStateException illegalStateException3 = new IllegalStateException("Selected method not supported by Checkout flow kind=".concat(topupMethod.getClass().getSimpleName()));
                        zhm.h0 h0Var3 = zhm.h0.f322473a;
                        CopyOnWriteArrayList copyOnWriteArrayList3 = rd0.d.f253311a;
                        rd0.d.a(rd0.c.ERROR, null, null, illegalStateException3, h0Var3);
                    }
                } else if (outputData instanceof hwe.j) {
                    eVar5.n2(new qd8.e(eVar5, outputData, topUpTarget, continuation, 16), new whi.b(6));
                } else if (outputData instanceof hwe.e) {
                    oki.h.t2(eVar5, eVar5.M, new CheckoutFlowContract$Step.MoveMoney(new MoveMoneyInputData(new Action.MoveWithFixedAccount(((hwe.e) outputData).f156137a, com.revolut.shared.feature.move_money.api.navigation.b.TARGET, k8l.a.MOVE, checkoutContext.f90523a.f115082a, y0.b(j8l.a.JOINT), 112), (Set) null, 4)), true, null, false, 12);
                } else if (outputData instanceof hwe.g) {
                    aVar2.f300649b.setValue(eVar5.u.h(((hwe.g) outputData).f156139a));
                } else {
                    IllegalStateException illegalStateException4 = new IllegalStateException("Output not supported by Checkout flow kind=".concat(outputData.getClass().getSimpleName()));
                    zhm.h0 h0Var4 = zhm.h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList4 = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, illegalStateException4, h0Var4);
                }
                return Unit.f186387a;
            case 8:
                mza.d remoteStory = (mza.d) obj2;
                Intrinsics.checkNotNullParameter(remoteStory, "remoteStory");
                return ((com.revolut.feature.remote_stories.impl.ui.a) obj6).e.a((mza.i) obj5, remoteStory, ((RemoteStoriesContract$Config.Deeplink) obj4).f81958b, (StoriesEventsMetadata) obj3);
            case 9:
                r10.f fVar2 = (r10.f) obj6;
                String str7 = (String) obj3;
                String str8 = (String) obj5;
                Instant instant = (Instant) obj4;
                SQLiteConnection sQLiteConnection = (SQLiteConnection) obj2;
                sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * FROM chat_drafts WHERE routingMode = ? AND routingKeyValue = ? AND expiresAt > ?");
                try {
                    if (str7 == null) {
                        sQLiteStatementPrepare.bindNull(1);
                    } else {
                        sQLiteStatementPrepare.bindText(1, str7);
                    }
                    if (str8 == null) {
                        sQLiteStatementPrepare.bindNull(2);
                    } else {
                        sQLiteStatementPrepare.bindText(2, str8);
                    }
                    String string2 = instant.toString();
                    if (string2 == null) {
                        sQLiteStatementPrepare.bindNull(3);
                    } else {
                        sQLiteStatementPrepare.bindText(3, string2);
                    }
                    int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "id");
                    int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "routingMode");
                    int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "routingKeyValue");
                    int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "text");
                    int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "inputMessageVersion");
                    int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "replyToMessageServerId");
                    int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "replyToSelectedText");
                    int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "pendingAttachments");
                    int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "voiceRecording");
                    int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "createdAt");
                    int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "expiresAt");
                    ArrayMap arrayMap = new ArrayMap();
                    while (sQLiteStatementPrepare.step()) {
                        String text = sQLiteStatementPrepare.isNull(columnIndexOrThrow6) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow6);
                        if (text != null) {
                            i = columnIndexOrThrow11;
                            arrayMap.put(text, null);
                        } else {
                            i = columnIndexOrThrow11;
                        }
                        columnIndexOrThrow11 = i;
                    }
                    int i6 = columnIndexOrThrow11;
                    sQLiteStatementPrepare.reset();
                    fVar2.b(sQLiteConnection, arrayMap);
                    if (sQLiteStatementPrepare.step()) {
                        u10.d dVar7 = new u10.d(s10.a.h(sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow)), sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2), sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3), sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow4), sQLiteStatementPrepare.getLong(columnIndexOrThrow5), s10.a.h(sQLiteStatementPrepare.isNull(columnIndexOrThrow6) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow6)), sQLiteStatementPrepare.isNull(columnIndexOrThrow7) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow7), s10.a.g(sQLiteStatementPrepare.isNull(columnIndexOrThrow8) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow8)), sQLiteStatementPrepare.isNull(columnIndexOrThrow9) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow9), s10.a.e(sQLiteStatementPrepare.isNull(columnIndexOrThrow10) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow10)), s10.a.e(sQLiteStatementPrepare.isNull(i6) ? null : sQLiteStatementPrepare.getText(i6)));
                        String text2 = sQLiteStatementPrepare.isNull(columnIndexOrThrow6) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow6);
                        eVar2 = new u10.e(dVar7, text2 != null ? (h) arrayMap.get(text2) : null);
                    } else {
                        eVar2 = null;
                    }
                    sQLiteStatementPrepare.close();
                    return eVar2;
                } finally {
                    sQLiteStatementPrepare.close();
                }
            case 10:
                c0 c0Var = (c0) obj6;
                Instant instant2 = (Instant) obj5;
                Instant instant3 = (Instant) obj4;
                Instant instant4 = (Instant) obj3;
                sQLiteStatementPrepare = ((SQLiteConnection) obj2).prepare("\n        SELECT * FROM (\n            SELECT * FROM messages\n            WHERE feedType = ? AND createdAt >= ? AND createdAt <= ?\n        )\n        UNION ALL\n        SELECT * FROM (\n            SELECT * FROM messages\n            WHERE feedType = ? AND ticketCreatedAt <= ? AND createdAt < ?\n            ORDER BY ticketCreatedAt DESC, createdAt DESC\n            LIMIT ?\n        )\n        ORDER BY ticketCreatedAt ASC, createdAt ASC\n    ");
                try {
                    String strA = s10.a.a(c0Var);
                    if (strA == null) {
                        sQLiteStatementPrepare.bindNull(1);
                    } else {
                        sQLiteStatementPrepare.bindText(1, strA);
                    }
                    String strB = s10.a.b(instant2);
                    if (strB == null) {
                        sQLiteStatementPrepare.bindNull(2);
                    } else {
                        sQLiteStatementPrepare.bindText(2, strB);
                    }
                    String strB2 = s10.a.b(instant3);
                    if (strB2 == null) {
                        sQLiteStatementPrepare.bindNull(3);
                    } else {
                        sQLiteStatementPrepare.bindText(3, strB2);
                    }
                    String strA2 = s10.a.a(c0Var);
                    if (strA2 == null) {
                        sQLiteStatementPrepare.bindNull(4);
                    } else {
                        sQLiteStatementPrepare.bindText(4, strA2);
                    }
                    String strB3 = s10.a.b(instant4);
                    if (strB3 == null) {
                        sQLiteStatementPrepare.bindNull(5);
                    } else {
                        sQLiteStatementPrepare.bindText(5, strB3);
                    }
                    String strB4 = s10.a.b(instant2);
                    if (strB4 == null) {
                        sQLiteStatementPrepare.bindNull(6);
                    } else {
                        sQLiteStatementPrepare.bindText(6, strB4);
                    }
                    sQLiteStatementPrepare.bindLong(7, 30);
                    int columnIndexOrThrow12 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "id");
                    int columnIndexOrThrow13 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "createdAt");
                    int columnIndexOrThrow14 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chatId");
                    int columnIndexOrThrow15 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "data");
                    int columnIndexOrThrow16 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "feedType");
                    int columnIndexOrThrow17 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "ticketCreatedAt");
                    int columnIndexOrThrow18 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "feedId");
                    int columnIndexOrThrow19 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "serverId");
                    int columnIndexOrThrow20 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chatIdGroup");
                    int columnIndexOrThrow21 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "feedIdGroup");
                    int columnIndexOrThrow22 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "feedTypeGroup");
                    ArrayList arrayList7 = new ArrayList();
                    while (sQLiteStatementPrepare.step()) {
                        int i21 = columnIndexOrThrow12;
                        arrayList7.add(new h(s10.a.h(sQLiteStatementPrepare.isNull(columnIndexOrThrow12) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow12)), s10.a.e(sQLiteStatementPrepare.isNull(columnIndexOrThrow13) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow13)), s10.a.h(sQLiteStatementPrepare.isNull(columnIndexOrThrow14) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow14)), sQLiteStatementPrepare.isNull(columnIndexOrThrow15) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow15), s10.a.d(sQLiteStatementPrepare.isNull(columnIndexOrThrow16) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow16)), s10.a.e(sQLiteStatementPrepare.isNull(columnIndexOrThrow17) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow17)), s10.a.h(sQLiteStatementPrepare.isNull(columnIndexOrThrow18) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow18)), s10.a.h(sQLiteStatementPrepare.isNull(columnIndexOrThrow19) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow19)), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow20), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow21), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow22)));
                        columnIndexOrThrow12 = i21;
                        break;
                    }
                    sQLiteStatementPrepare.close();
                    return arrayList7;
                } catch (Throwable th10) {
                    throw th10;
                }
            case 11:
                return a(obj2);
            case 12:
                JuniorInfo juniorInfo = (JuniorInfo) obj2;
                Intrinsics.checkNotNullParameter(juniorInfo, "juniorInfo");
                return ((s) obj6).e(juniorInfo, (SavingsAccountDetails) obj5, (x5i.d) obj4, (AccountWrapper) obj3);
            case 13:
                s sVar = (s) obj6;
                JuniorInfo juniorInfo2 = (JuniorInfo) obj5;
                x5i.d dVar8 = (x5i.d) obj3;
                Boolean accountChecksPassed = (Boolean) obj2;
                Intrinsics.checkNotNullParameter(accountChecksPassed, "accountChecksPassed");
                sVar.getClass();
                boolean zB = s.b(juniorInfo2, (AccountWrapper) obj4);
                boolean z = dVar8 == x5i.d.SOURCE ? juniorInfo2.e : true;
                if (accountChecksPassed.booleanValue() && zB && z) {
                    return m70.a.g(rd0.e.c(sVar.f252245c.b(juniorInfo2.f99454a, juniorInfo2.f, w4l.j.f294644c), kotlin.coroutines.g.f186406a), null, new r6d.h(i3), 1).firstOrError();
                }
                ufm.b bVarM = efm.d0.m(Boolean.FALSE);
                Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
                return bVarM;
            case 14:
                kel.b cashHolding = (kel.b) obj6;
                TradingAccount tradingAccount = (TradingAccount) obj5;
                rbh.r rVar2 = (rbh.r) obj4;
                TradingLegalEntityInformation tradingLegalEntityInformation = (TradingLegalEntityInformation) obj3;
                PocketOwnerInfo pocketOwnerInfo = (PocketOwnerInfo) obj2;
                Intrinsics.checkNotNullParameter(pocketOwnerInfo, "pocketOwnerInfo");
                String str9 = cashHolding.f183150c;
                kel.a aVar3 = cashHolding.f183148a;
                String str10 = aVar3.e;
                dj0.d dVar9 = cashHolding.e;
                boolean z3 = tradingAccount instanceof TradingAccount.TaxAdvantage;
                TradingAccount.TaxAdvantage taxAdvantage = (TradingAccount.TaxAdvantage) (!z3 ? null : tradingAccount);
                dj0.d dVar10 = (taxAdvantage == null || (f105255l = taxAdvantage.getF105255l()) == null || (topUpLimit = f105255l.f105246a) == null) ? null : topUpLimit.f105249c;
                String str11 = aVar3.f183146b;
                sbh.a aVar4 = rVar2.f253098l;
                hel.b bVar4 = tradingLegalEntityInformation.f105106a;
                Intrinsics.checkNotNullParameter(cashHolding, "cashHolding");
                Intrinsics.checkNotNullParameter(tradingAccount, "tradingAccount");
                Clause textClause2 = (!z3 || (jVarB2 = n2l.l.b(tradingAccount)) == null) ? new TextClause(aVar3.f, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : aVar4.f261589a.h(jVarB2, bVar4, null);
                sbh.a aVar5 = rVar2.f253098l;
                Intrinsics.checkNotNullParameter(cashHolding, "cashHolding");
                Intrinsics.checkNotNullParameter(tradingAccount, "tradingAccount");
                Image currencyImage = (!z3 || (jVarB = n2l.l.b(tradingAccount)) == null) ? new CurrencyImage(str10, (ImageTransformations) null, (TextLocalisedClause) null, 14) : LayeredImage.INSTANCE.i(aVar5.f261589a.g(jVarB), R$attr.uikit_colorWhite, R$attr.uikit_colorLightBlue);
                return new PocketInfo.InvestPocket(str9, dVar9, dVar10, pocketOwnerInfo, str11, textClause2, currencyImage);
            case 15:
                return b(obj2);
            case 16:
                return c(obj2);
            case 17:
                return d(obj2);
            case 18:
                return e(obj2);
            case 19:
                return g(obj2);
            case 20:
                return h(obj2);
            case 21:
                return i(obj2);
            case 22:
                return j(obj2);
            case 23:
                return k(obj2);
            case 24:
                return StillCaptureRequestControl.propagateResultOrEnqueueRequest$lambda$0((StillCaptureRequestControl) obj6, (g0) obj5, (StillCaptureRequestControl.CaptureRequest) obj4, (UseCaseCameraRequestControl) obj3, (Throwable) obj2);
            case 25:
                return l(obj2);
            case 26:
                return m(obj2);
            case 27:
                return n(obj2);
            case 28:
                return o(obj2);
            default:
                com.revolut.feature.travel.hotels.impl.ui_kompot.flow.amendment.a aVar6 = (com.revolut.feature.travel.hotels.impl.ui_kompot.flow.amendment.a) obj6;
                yki.l lVar = (yki.l) obj5;
                TravelHotelsBookingAmendmentFlowContract$InputData travelHotelsBookingAmendmentFlowContract$InputData = (TravelHotelsBookingAmendmentFlowContract$InputData) obj4;
                TravelHotelsBookingAmendmentFlowContract$Step travelHotelsBookingAmendmentFlowContract$Step = (TravelHotelsBookingAmendmentFlowContract$Step) obj3;
                zag.i output = (zag.i) obj2;
                Intrinsics.checkNotNullParameter(output, "output");
                if (output instanceof zag.e) {
                    oki.h.D2(lVar);
                } else if (output instanceof zag.f) {
                    aVar6.C2(new sag.d(travelHotelsBookingAmendmentFlowContract$InputData.f93681a));
                } else if (output instanceof zag.g) {
                    zag.g gVar2 = (zag.g) output;
                    oki.h.t2(aVar6, lVar, new TravelHotelsBookingAmendmentFlowContract$Step.Confirmation(((TravelHotelsBookingAmendmentFlowContract$Step.DatesPicker) travelHotelsBookingAmendmentFlowContract$Step).f93685a, gVar2.f320693b, gVar2.f320694c, gVar2.d), false, null, false, 14);
                } else {
                    if (!(output instanceof zag.h)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    zag.h hVar4 = (zag.h) output;
                    oki.h.t2(aVar6, lVar, new TravelHotelsBookingAmendmentFlowContract$Step.RoomsSelection(((TravelHotelsBookingAmendmentFlowContract$Step.DatesPicker) travelHotelsBookingAmendmentFlowContract$Step).f93685a, hVar4.f320696b, hVar4.f320697c), false, null, false, 14);
                }
                return Unit.f186387a;
        }
    }

    public /* synthetic */ b(CustomAssetFieldDefinitions customAssetFieldDefinitions, gsd.c cVar, List list, xi0.b bVar) {
        this.f241719a = 6;
        this.f241721c = customAssetFieldDefinitions;
        this.e = cVar;
        this.f241720b = list;
        this.d = bVar;
    }

    public /* synthetic */ b(Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.f241719a = i;
        this.f241721c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f241720b = obj5;
    }

    public /* synthetic */ b(Object obj2, Object obj3, Object obj4, Object obj5, boolean z, int i) {
        this.f241719a = i;
        this.f241721c = obj2;
        this.d = obj3;
        this.f241720b = obj4;
        this.e = obj5;
    }

    public /* synthetic */ b(String str, Object obj2, String str2, Object obj3, int i) {
        this.f241719a = i;
        this.f241720b = str;
        this.f241721c = obj2;
        this.d = str2;
        this.e = obj3;
    }

    public /* synthetic */ b(r10.q qVar, Object obj2, Instant instant, Instant instant2, Instant instant3, int i) {
        this.f241719a = i;
        this.f241721c = obj2;
        this.d = instant;
        this.e = instant2;
        this.f241720b = instant3;
    }

    public /* synthetic */ b(r rVar, List list, xi0.b bVar, Serializable serializable, int i) {
        this.f241719a = i;
        this.f241721c = rVar;
        this.e = list;
        this.d = bVar;
        this.f241720b = serializable;
    }
}
