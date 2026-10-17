package lrk;

import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import androidx.room.util.SQLiteStatementUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import com.revolut.chat.domain.model.call.Call;
import com.revolut.core.error.data.model.ServerError;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.apm.core.models.alias.Alias;
import com.revolut.feature.card_order_new.api.junior.CardDesignNotFoundException;
import com.revolut.feature.in_app_calls.InAppCallStateWithData;
import com.revolut.feature.insurance_pet.impl.ui.profile.help.PetGetHelpActivity;
import com.revolut.feature_exchange.impl.R$string;
import com.revolut.feature_exchange.impl.ui.exchange.market_order.model.ExchangeOrderDraft;
import com.revolut.retail.common.ui.activity.builder.fragment.BaseLayoutBuilderFragment;
import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.retail.feature.stockdetails.impl.data.network.StockFinancialsService;
import com.revolut.revolut.feature_fourthline_impl.R;
import com.revolut.shared.feature.market_data.models.domain.models.Amount;
import com.revolut.shared.feature.market_data.models.domain.models.Limit;
import drk.e;
import efm.d0;
import g1i.l0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import le.u1;
import m1i.i1;
import m1i.n0;
import m1i.o0;
import m1i.p0;
import m9d.g1;
import my8.s;
import my8.t;
import nii.y0;
import nii.z;
import org.joda.time.Duration;
import retrofit2.HttpException;
import rp0.y;
import vkm.j2;
import w30.o;
import w30.v;
import zhm.h0;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class h extends kotlin.jvm.internal.q implements Function1 {
    public final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(int i, Object obj2, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj2, str, str2);
        this.f = i3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r5v11, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r5v21, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.Object, java.util.Map] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        String str;
        List list;
        InAppCallStateWithData inAppCallStateWithData;
        be7.a aVar;
        ServerError serverErrorC;
        alc.k kVar;
        alc.k kVar2;
        int i = 10;
        int i2 = 5;
        int i3 = 3;
        alc.l lVar = null;
        boolean z = false;
        boolean z3 = false;
        int i5 = 2;
        final int i6 = 1;
        switch (this.f) {
            case 0:
                wrk.b params = (wrk.b) obj2;
                Intrinsics.checkNotNullParameter(params, "p0");
                i iVar = (i) this.receiver;
                iVar.getClass();
                Intrinsics.checkNotNullParameter(params, "params");
                StockFinancialsService stockFinancialsService = iVar.f199532a;
                String str2 = params.f299625a;
                uqk.l lVar2 = params.f299626b;
                Intrinsics.checkNotNullParameter(lVar2, "<this>");
                int i21 = g.f199531b[lVar2.ordinal()];
                if (i21 == 1) {
                    str = "income_statement";
                } else if (i21 == 2) {
                    str = "balance_sheet";
                } else {
                    if (i21 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    str = "cash_flows";
                }
                d0<List<jrk.d0>> stockFinancialsStatements = stockFinancialsService.getStockFinancialsStatements(str2, str, i.a(params.f299627c));
                lr9.m mVar = new lr9.m(new lk4.g(params, 24), i);
                stockFinancialsStatements.getClass();
                ufm.i iVar2 = new ufm.i(stockFinancialsStatements, mVar, 1);
                Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                return iVar2;
            case 1:
                wrk.b params2 = (wrk.b) obj2;
                Intrinsics.checkNotNullParameter(params2, "p0");
                xqk.a aVar2 = (xqk.a) this.receiver;
                aVar2.getClass();
                Intrinsics.checkNotNullParameter(params2, "params");
                ne0.j jVar = aVar2.f308184a;
                String ref2 = params2.f299625a;
                uqk.l statementType = params2.f299626b;
                uqk.e period = params2.f299627c;
                Intrinsics.checkNotNullParameter(ref2, "ref");
                Intrinsics.checkNotNullParameter(statementType, "statementType");
                Intrinsics.checkNotNullParameter(period, "period");
                return (List) jVar.get(com.google.android.gms.internal.mlkit_vision_face.a.p(ref2, "|", statementType.name(), "|", period.name()));
            case 2:
                wrk.b params3 = (wrk.b) obj2;
                Intrinsics.checkNotNullParameter(params3, "p0");
                final ark.d dVar = ((i) this.receiver).f199533b;
                Intrinsics.checkNotNullParameter(params3, "params");
                uqk.e eVar = params3.f299627c;
                uqk.l lVar3 = params3.f299626b;
                final String str3 = params3.f299625a;
                int i22 = g.f199530a[eVar.ordinal()];
                if (i22 == 1) {
                    Object obj3 = grk.c.f146055a;
                    Intrinsics.checkNotNullParameter(lVar3, "<this>");
                    final String strG = u1.g(lVar3, grk.c.f146055a);
                    list = (List) DBUtil.performBlocking(dVar.f8731a, true, false, new Function1() { // from class: ark.b
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj4) {
                            SQLiteStatement sQLiteStatementPrepare;
                            switch (i6) {
                                case 0:
                                    String str4 = strG;
                                    dVar.getClass();
                                    sQLiteStatementPrepare = ((SQLiteConnection) obj4).prepare("SELECT * FROM stock_financials_statements WHERE ref = ? AND type = ? AND quarter IS NOT NULL");
                                    String str5 = str3;
                                    try {
                                        if (str5 == null) {
                                            sQLiteStatementPrepare.bindNull(1);
                                        } else {
                                            sQLiteStatementPrepare.bindText(1, str5);
                                        }
                                        sQLiteStatementPrepare.bindText(2, str4);
                                        int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "ref");
                                        int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "type");
                                        int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "year");
                                        int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "quarter");
                                        int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "statementItems");
                                        int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "quarterId");
                                        ArrayList arrayList = new ArrayList();
                                        while (sQLiteStatementPrepare.step()) {
                                            e eVar2 = new e(sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow), sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow3), sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : Integer.valueOf((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow4)), zqk.a.a(sQLiteStatementPrepare.isNull(columnIndexOrThrow5) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow5)));
                                            String text = sQLiteStatementPrepare.isNull(columnIndexOrThrow6) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow6);
                                            Intrinsics.checkNotNullParameter(text, "<set-?>");
                                            eVar2.f = text;
                                            arrayList.add(eVar2);
                                            break;
                                        }
                                        sQLiteStatementPrepare.close();
                                        return arrayList;
                                    } finally {
                                    }
                                default:
                                    String str6 = strG;
                                    dVar.getClass();
                                    sQLiteStatementPrepare = ((SQLiteConnection) obj4).prepare("SELECT * FROM stock_financials_statements WHERE ref = ? AND type = ? AND quarter IS NULL");
                                    String str7 = str3;
                                    try {
                                        if (str7 == null) {
                                            sQLiteStatementPrepare.bindNull(1);
                                        } else {
                                            sQLiteStatementPrepare.bindText(1, str7);
                                        }
                                        sQLiteStatementPrepare.bindText(2, str6);
                                        int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "ref");
                                        int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "type");
                                        int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "year");
                                        int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "quarter");
                                        int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "statementItems");
                                        int columnIndexOrThrow12 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "quarterId");
                                        ArrayList arrayList2 = new ArrayList();
                                        while (sQLiteStatementPrepare.step()) {
                                            e eVar3 = new e(sQLiteStatementPrepare.isNull(columnIndexOrThrow7) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow7), sQLiteStatementPrepare.isNull(columnIndexOrThrow8) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow8), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow9), sQLiteStatementPrepare.isNull(columnIndexOrThrow10) ? null : Integer.valueOf((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow10)), zqk.a.a(sQLiteStatementPrepare.isNull(columnIndexOrThrow11) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow11)));
                                            String text2 = sQLiteStatementPrepare.isNull(columnIndexOrThrow12) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow12);
                                            Intrinsics.checkNotNullParameter(text2, "<set-?>");
                                            eVar3.f = text2;
                                            arrayList2.add(eVar3);
                                            break;
                                        }
                                        sQLiteStatementPrepare.close();
                                        return arrayList2;
                                    } finally {
                                    }
                            }
                        }
                    });
                } else {
                    if (i22 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    Object obj4 = grk.c.f146055a;
                    Intrinsics.checkNotNullParameter(lVar3, "<this>");
                    final String strG2 = u1.g(lVar3, grk.c.f146055a);
                    RoomDatabase roomDatabase = dVar.f8731a;
                    final int i32 = z ? 1 : 0;
                    list = (List) DBUtil.performBlocking(roomDatabase, true, false, new Function1() { // from class: ark.b
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj42) {
                            SQLiteStatement sQLiteStatementPrepare;
                            switch (i32) {
                                case 0:
                                    String str4 = strG2;
                                    dVar.getClass();
                                    sQLiteStatementPrepare = ((SQLiteConnection) obj42).prepare("SELECT * FROM stock_financials_statements WHERE ref = ? AND type = ? AND quarter IS NOT NULL");
                                    String str5 = str3;
                                    try {
                                        if (str5 == null) {
                                            sQLiteStatementPrepare.bindNull(1);
                                        } else {
                                            sQLiteStatementPrepare.bindText(1, str5);
                                        }
                                        sQLiteStatementPrepare.bindText(2, str4);
                                        int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "ref");
                                        int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "type");
                                        int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "year");
                                        int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "quarter");
                                        int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "statementItems");
                                        int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "quarterId");
                                        ArrayList arrayList = new ArrayList();
                                        while (sQLiteStatementPrepare.step()) {
                                            e eVar2 = new e(sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow), sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow3), sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : Integer.valueOf((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow4)), zqk.a.a(sQLiteStatementPrepare.isNull(columnIndexOrThrow5) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow5)));
                                            String text = sQLiteStatementPrepare.isNull(columnIndexOrThrow6) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow6);
                                            Intrinsics.checkNotNullParameter(text, "<set-?>");
                                            eVar2.f = text;
                                            arrayList.add(eVar2);
                                            break;
                                        }
                                        sQLiteStatementPrepare.close();
                                        return arrayList;
                                    } finally {
                                    }
                                default:
                                    String str6 = strG2;
                                    dVar.getClass();
                                    sQLiteStatementPrepare = ((SQLiteConnection) obj42).prepare("SELECT * FROM stock_financials_statements WHERE ref = ? AND type = ? AND quarter IS NULL");
                                    String str7 = str3;
                                    try {
                                        if (str7 == null) {
                                            sQLiteStatementPrepare.bindNull(1);
                                        } else {
                                            sQLiteStatementPrepare.bindText(1, str7);
                                        }
                                        sQLiteStatementPrepare.bindText(2, str6);
                                        int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "ref");
                                        int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "type");
                                        int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "year");
                                        int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "quarter");
                                        int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "statementItems");
                                        int columnIndexOrThrow12 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "quarterId");
                                        ArrayList arrayList2 = new ArrayList();
                                        while (sQLiteStatementPrepare.step()) {
                                            e eVar3 = new e(sQLiteStatementPrepare.isNull(columnIndexOrThrow7) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow7), sQLiteStatementPrepare.isNull(columnIndexOrThrow8) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow8), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow9), sQLiteStatementPrepare.isNull(columnIndexOrThrow10) ? null : Integer.valueOf((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow10)), zqk.a.a(sQLiteStatementPrepare.isNull(columnIndexOrThrow11) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow11)));
                                            String text2 = sQLiteStatementPrepare.isNull(columnIndexOrThrow12) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow12);
                                            Intrinsics.checkNotNullParameter(text2, "<set-?>");
                                            eVar3.f = text2;
                                            arrayList2.add(eVar3);
                                            break;
                                        }
                                        sQLiteStatementPrepare.close();
                                        return arrayList2;
                                    } finally {
                                    }
                            }
                        }
                    });
                }
                List<drk.e> list2 = list;
                ArrayList arrayList = new ArrayList(w.t(list2, 10));
                for (drk.e eVar2 : list2) {
                    Object obj5 = grk.c.f146055a;
                    Intrinsics.checkNotNullParameter(eVar2, "<this>");
                    String str4 = eVar2.f117163a;
                    uqk.l lVar4 = (uqk.l) u1.u(eVar2.f117164b, grk.c.f146055a);
                    int i33 = eVar2.f117165c;
                    Integer num = eVar2.d;
                    ArrayList arrayList2 = eVar2.e.f117171a;
                    ArrayList arrayList3 = new ArrayList(w.t(arrayList2, 10));
                    Iterator it8 = arrayList2.iterator();
                    while (it8.hasNext()) {
                        arrayList3.add(grk.c.b((drk.f) it8.next()));
                    }
                    arrayList.add(new uqk.f(str4, lVar4, i33, num, arrayList3));
                }
                return c6d.b.N(arrayList);
            case 3:
                NaviCommand p0 = (NaviCommand) obj2;
                Intrinsics.checkNotNullParameter(p0, "p0");
                ((sri.m) this.receiver).c(p0);
                return Unit.f186387a;
            case 4:
                Throwable p03 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(p03, "p0");
                lw8.h hVar = (lw8.h) this.receiver;
                hVar.getClass();
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, p03, h0Var);
                hVar.C2(new ly8.b(new s(t.ERROR, null)));
                return Boolean.TRUE;
            case 5:
                ServerError p010 = (ServerError) obj2;
                Intrinsics.checkNotNullParameter(p010, "p0");
                ly2.l.Q((ly2.l) this.receiver, p010);
                return Boolean.TRUE;
            case 6:
                ServerError p011 = (ServerError) obj2;
                Intrinsics.checkNotNullParameter(p011, "p0");
                ly2.l.Q((ly2.l) this.receiver, p011);
                return Boolean.TRUE;
            case 7:
                ServerError p012 = (ServerError) obj2;
                Intrinsics.checkNotNullParameter(p012, "p0");
                ly2.l.Q((ly2.l) this.receiver, p012);
                return Boolean.TRUE;
            case 8:
                List p013 = (List) obj2;
                Intrinsics.checkNotNullParameter(p013, "p0");
                ((PetGetHelpActivity) ((m08.d) this.receiver)).setItems(p013);
                return Unit.f186387a;
            case 9:
                long jLongValue = ((Number) obj2).longValue();
                g1i.d0 d0Var = (g1i.d0) ((m1i.k) this.receiver);
                d0Var.getClass();
                return d0Var.R3(new g1i.g(d0Var, jLongValue, z ? 1 : 0));
            case 10:
                n0 p014 = (n0) obj2;
                Intrinsics.checkNotNullParameter(p014, "p0");
                i1 i1Var = (i1) this.receiver;
                p1i.a aVar3 = i1Var.A;
                l4i.a aVar4 = i1Var.u;
                o0 o0Var = p014.f201564b;
                ExchangeOrderDraft draft = p014.f201563a;
                int i43 = o0Var == null ? -1 : p0.d[o0Var.ordinal()];
                pfm.m mVar2 = pfm.m.f235744a;
                switch (i43) {
                    case -1:
                        Intrinsics.checkNotNullExpressionValue(mVar2, "complete(...)");
                        return mVar2;
                    case 0:
                    default:
                        throw new NoWhenBranchMatchedException();
                    case 1:
                        Limit.UpperRestrictionLimit upperRestrictionLimitF = r1i.d.f(draft);
                        if (upperRestrictionLimitF == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        Amount amount = upperRestrictionLimitF.f104747b;
                        aVar4.getClass();
                        dj0.d limitMoney = l4i.a.b(amount);
                        i1i.c cVar = (i1i.c) i1Var.f201551t;
                        cVar.getClass();
                        Intrinsics.checkNotNullParameter(limitMoney, "limitMoney");
                        pfm.h hVar2 = new pfm.h(new i1i.a(cVar, z ? 1 : 0), 2);
                        Intrinsics.checkNotNullExpressionValue(hVar2, "fromAction(...)");
                        pfm.h hVar3 = new pfm.h(new hc7.a(cVar, limitMoney, i3), 2);
                        Intrinsics.checkNotNullExpressionValue(hVar3, "fromAction(...)");
                        pfm.a aVarE = hVar2.e(hVar3);
                        Intrinsics.checkNotNullExpressionValue(aVarE, "andThen(...)");
                        return aVarE;
                    case 2:
                        final e2i.k kVar3 = (e2i.k) i1Var.v;
                        kVar3.getClass();
                        pfm.h hVar4 = new pfm.h(new kfm.a() { // from class: e2i.f
                            @Override // kfm.a
                            public final void run() {
                                switch (i6) {
                                    case 0:
                                        opi.d dVar2 = kVar3.i;
                                        rp0.t tVar = new rp0.t(new TextLocalisedClause(R$string.fx_orders_order_estimated_dialog_title, null, null, 14), new TextLocalisedClause(R$string.fx_orders_order_estimated_dialog_subtitle, null, null, 14), null, 28);
                                        LargeActionButton.ButtonStyle.DefaultFilledButton defaultFilledButton = LargeActionButton.ButtonStyle.f58725a;
                                        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R.string.common_action_got_it, null, null, 14);
                                        int i59 = R$attr.uikit_dp16;
                                        int i66 = R$attr.uikit_dp24;
                                        ((opi.b) dVar2).Z(new y(u.c(new LargeActionButtonDelegate.Model("ITEM_ID_GOT_IT", defaultFilledButton, null, textLocalisedClause, false, null, null, i66, i66, i59, i59, 496)), tVar, null, null, null, null, 1020));
                                        break;
                                    default:
                                        ((rpi.b) kVar3.f122110j).N(false);
                                        break;
                                }
                            }
                        }, 2);
                        Intrinsics.checkNotNullExpressionValue(hVar4, "fromAction(...)");
                        final int i59 = z ? 1 : 0;
                        pfm.h hVar5 = new pfm.h(new kfm.a() { // from class: e2i.f
                            @Override // kfm.a
                            public final void run() {
                                switch (i59) {
                                    case 0:
                                        opi.d dVar2 = kVar3.i;
                                        rp0.t tVar = new rp0.t(new TextLocalisedClause(R$string.fx_orders_order_estimated_dialog_title, null, null, 14), new TextLocalisedClause(R$string.fx_orders_order_estimated_dialog_subtitle, null, null, 14), null, 28);
                                        LargeActionButton.ButtonStyle.DefaultFilledButton defaultFilledButton = LargeActionButton.ButtonStyle.f58725a;
                                        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R.string.common_action_got_it, null, null, 14);
                                        int i592 = R$attr.uikit_dp16;
                                        int i66 = R$attr.uikit_dp24;
                                        ((opi.b) dVar2).Z(new y(u.c(new LargeActionButtonDelegate.Model("ITEM_ID_GOT_IT", defaultFilledButton, null, textLocalisedClause, false, null, null, i66, i66, i592, i592, 496)), tVar, null, null, null, null, 1020));
                                        break;
                                    default:
                                        ((rpi.b) kVar3.f122110j).N(false);
                                        break;
                                }
                            }
                        }, 2);
                        Intrinsics.checkNotNullExpressionValue(hVar5, "fromAction(...)");
                        pfm.a aVarE2 = hVar4.e(hVar5);
                        Intrinsics.checkNotNullExpressionValue(aVarE2, "andThen(...)");
                        return aVarE2;
                    case 3:
                        return ((l0) i1Var.f201543j).l(r1i.g.a(draft, aVar4, ((g1i.d0) i1Var.k).p3(), null));
                    case 4:
                        p1i.h hVar6 = (p1i.h) aVar3;
                        hVar6.getClass();
                        Intrinsics.checkNotNullParameter(draft, "draft");
                        Limit.UsageLimit usageLimitC = r1i.d.c(draft.f96889q);
                        if (usageLimitC != null) {
                            return hVar6.N(hVar6.f231939h.c(usageLimitC.f104750b, usageLimitC.f104751c));
                        }
                        Intrinsics.checkNotNullExpressionValue(mVar2, "complete(...)");
                        return mVar2;
                    case 5:
                        p1i.h hVar7 = (p1i.h) aVar3;
                        hVar7.getClass();
                        Intrinsics.checkNotNullParameter(draft, "draft");
                        Limit.UpperRestrictionLimit upperRestrictionLimitB = r1i.d.b(draft.f96889q);
                        if (upperRestrictionLimitB != null) {
                            return hVar7.N(hVar7.f231939h.b(upperRestrictionLimitB.f104747b));
                        }
                        Intrinsics.checkNotNullExpressionValue(mVar2, "complete(...)");
                        return mVar2;
                    case 6:
                        p1i.h hVar8 = (p1i.h) aVar3;
                        hVar8.getClass();
                        Intrinsics.checkNotNullParameter(draft, "draft");
                        Limit.UsageLimit usageLimitH = r1i.d.h(draft.f96889q);
                        if (usageLimitH != null) {
                            return hVar8.N(hVar8.f231939h.d(usageLimitH.f104750b));
                        }
                        Intrinsics.checkNotNullExpressionValue(mVar2, "complete(...)");
                        return mVar2;
                    case 7:
                        p1i.h hVar9 = (p1i.h) aVar3;
                        return hVar9.N(hVar9.f231939h.e());
                }
            case 11:
                long jLongValue2 = ((Number) obj2).longValue();
                g1i.d0 d0Var2 = (g1i.d0) ((m1i.k) this.receiver);
                d0Var2.getClass();
                return d0Var2.R3(new g1i.g(d0Var2, jLongValue2, i6));
            case 12:
                w30.n p015 = (w30.n) obj2;
                Intrinsics.checkNotNullParameter(p015, "p0");
                efm.r map = ((com.revolut.feature.in_app_calls.b) ((m30.g) this.receiver).f202268c).d(p015.f294102a).map(new m30.b(i2, new m30.d(p015, i3)));
                Intrinsics.checkNotNullExpressionValue(map, "map(...)");
                return map;
            case 13:
                w30.n chatAndCallDetails = (w30.n) obj2;
                Intrinsics.checkNotNullParameter(chatAndCallDetails, "p0");
                ((m30.g) this.receiver).getClass();
                Intrinsics.checkNotNullParameter(chatAndCallDetails, "chatAndCallDetails");
                w30.y yVar = chatAndCallDetails.f294106h;
                if ((yVar instanceof w30.w) || (yVar instanceof v)) {
                    efm.r rVarJust = efm.r.just(chatAndCallDetails);
                    Intrinsics.checkNotNullExpressionValue(rVarJust, "just(...)");
                    return rVarJust;
                }
                Call call = chatAndCallDetails.f294108l;
                if ((call != null ? call.f51086h : 0) == w30.g.IN_PROGRESS || !((inAppCallStateWithData = chatAndCallDetails.k) == null || (aVar = inAppCallStateWithData.f74785a) == null || !aVar.a())) {
                    efm.w map2 = efm.r.interval(0L, 1L, TimeUnit.SECONDS).map(new m30.b(i6, new m30.d(chatAndCallDetails, z ? 1 : 0)));
                    Intrinsics.checkNotNullExpressionValue(map2, "map(...)");
                    return map2;
                }
                long jCurrentTimeMillis = System.currentTimeMillis();
                long millis = chatAndCallDetails.f294103b.plus(o.a.f294117b).plus(Duration.standardSeconds(1L)).getMillis();
                aim.e eVarB = u.b();
                if (millis > jCurrentTimeMillis) {
                    eVarB.add(efm.r.timer(millis - jCurrentTimeMillis, TimeUnit.MILLISECONDS));
                }
                efm.r rVarStartWith = efm.r.merge(u.a(eVarB)).map(new m30.b(i5, new m30.d(chatAndCallDetails, i6))).startWith(chatAndCallDetails);
                Intrinsics.checkNotNullExpressionValue(rVarStartWith, "let(...)");
                return rVarStartWith;
            case 14:
                w30.n p016 = (w30.n) obj2;
                Intrinsics.checkNotNullParameter(p016, "p0");
                efm.r map3 = ((m30.g) this.receiver).d.a().map(new m30.b(i3, new m30.d(p016, i5)));
                Intrinsics.checkNotNullExpressionValue(map3, "map(...)");
                return map3;
            case 15:
                Throwable p017 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(p017, "p0");
                m98.p pVar = (m98.p) this.receiver;
                pVar.getClass();
                if (p017 instanceof CardDesignNotFoundException) {
                    h0 h0Var2 = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, p017, h0Var2);
                    pVar.X1(new y0(null, new z(new TextLocalisedClause(com.revolut.feature.junior.card_request.impl.R$string.junior_card_request_error_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.junior.card_request.impl.R$string.junior_card_request_error_description, null, null, 14), new TextLocalisedClause(com.revolut.feature.junior.card_request.impl.R$string.junior_card_request_error_action, null, null, 14), null, null, null, false, null, null, null, null, null, null, 32756), false, 5));
                    z = true;
                }
                return Boolean.valueOf(z);
            case 16:
                Throwable p018 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(p018, "p0");
                g1.y2((g1) this.receiver, p018);
                return Boolean.TRUE;
            case 17:
                Throwable p019 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(p019, "p0");
                com.revolut.feature.apm.payid.impl.screen.createpayid.addpayid.a aVar5 = (com.revolut.feature.apm.payid.impl.screen.createpayid.addpayid.a) this.receiver;
                if ((p019 instanceof HttpException) && (serverErrorC = aVar5.f62722q.c((HttpException) p019)) != null && serverErrorC.f51362a == 80002) {
                    Alias alias = (Alias) ((ma2.e) ((j2) aVar5.f62723r.f22677a).getValue()).f203923b.getContent();
                    if (alias != null) {
                        aVar5.n2(new ma2.v(alias, aVar5, null), new ma2.p(aVar5, i6));
                    }
                    z3 = true;
                } else {
                    aVar5.s1();
                }
                return Boolean.valueOf(z3);
            case 18:
                f5j.a beneficiary = (f5j.a) obj2;
                Intrinsics.checkNotNullParameter(beneficiary, "p0");
                m3j.l lVar5 = (m3j.l) ((y2j.c) this.receiver);
                lVar5.getClass();
                Intrinsics.checkNotNullParameter(beneficiary, "beneficiary");
                m3j.h hVar10 = lVar5.f202580a;
                y2j.a aVar6 = y2j.b.Companion;
                return hVar10.a(beneficiary, false);
            case 19:
                List p020 = (List) obj2;
                Intrinsics.checkNotNullParameter(p020, "p0");
                ((BaseLayoutBuilderFragment) ((mak.b) this.receiver)).setItems(p020);
                return Unit.f186387a;
            case 20:
                d67.u p021 = (d67.u) obj2;
                Intrinsics.checkNotNullParameter(p021, "p0");
                com.revolut.feature.donations.impl.ui.kompot.flow.acceptterms.a aVar7 = (com.revolut.feature.donations.impl.ui.kompot.flow.acceptterms.a) this.receiver;
                aVar7.getClass();
                int i66 = 26;
                if (p021 instanceof d67.r) {
                    aVar7.l2(new mb6.g(aVar7, , i6), new yi5.b(i66));
                } else if (p021 instanceof d67.s) {
                    aVar7.l2(new mb6.g(aVar7, , z ? 1 : 0), new yi5.b(i66));
                } else if ((p021 instanceof d67.t) || (p021 instanceof d67.q)) {
                    aVar7.C2(mb6.d.f204163a);
                } else {
                    if (!(p021 instanceof d67.p)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    int i74 = jli.h.f175850a;
                }
                return Unit.f186387a;
            case 21:
                Throwable p022 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(p022, "p0");
                ((com.revolut.feature.onboarding.impl.qes.waiting_qes_result.b) this.receiver).L2(p022);
                return Boolean.TRUE;
            case 22:
                Throwable p023 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(p023, "p0");
                mib.k.I2((mib.k) this.receiver, p023);
                return Boolean.TRUE;
            case 23:
                Throwable p024 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(p024, "p0");
                mib.k.I2((mib.k) this.receiver, p024);
                return Boolean.TRUE;
            case 24:
                slc.c model = (slc.c) obj2;
                Intrinsics.checkNotNullParameter(model, "p0");
                ((rlc.c) this.receiver).getClass();
                Intrinsics.checkNotNullParameter(model, "model");
                int i92 = rlc.b.f255011a[model.getAccount().getOnboardingStatus().ordinal()];
                if (i92 == 1) {
                    kVar = alc.k.NONE;
                } else if (i92 == 2) {
                    kVar = alc.k.PENDING;
                } else if (i92 == 3) {
                    kVar = alc.k.COMPLETED;
                } else {
                    if (i92 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    kVar = alc.k.FAILED;
                }
                return new alc.l(kVar, mo3.a.o(model.getAccount().getMinimumWithdrawalAmount()), mo3.a.o(model.getAccount().getMinimumBalanceAfterWithdraw()));
            case 25:
                Unit params4 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(params4, "p0");
                mlc.b bVar = (mlc.b) this.receiver;
                bVar.getClass();
                Intrinsics.checkNotNullParameter(params4, "params");
                d0<slc.c> userInformation = bVar.f206667a.getUserInformation();
                mhd.c cVar2 = new mhd.c(new h(1, bVar.f206668b, rlc.c.class, "toDomain", "toDomain(Lcom/revolut/feature/robo/impl/data/network/model/RoboAccountDto;)Lcom/revolut/feature/robo/api/model/RoboAccount;", 0, 24), 25);
                userInformation.getClass();
                ufm.i iVar3 = new ufm.i(userInformation, cVar2, 1);
                Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                return iVar3;
            case 26:
                Unit params5 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(params5, "p0");
                mlc.b bVar2 = (mlc.b) this.receiver;
                bVar2.getClass();
                Intrinsics.checkNotNullParameter(params5, "params");
                zlc.b model2 = (zlc.b) bVar2.f206669c.f298470a.T2("ROBO_ACCOUNT_INFORMATION", zlc.b.class);
                if (model2 != null) {
                    Intrinsics.checkNotNullParameter(model2, "model");
                    int i96 = ylc.a.f314684a[model2.getOnboardingStatus().ordinal()];
                    if (i96 == 1) {
                        kVar2 = alc.k.NONE;
                    } else if (i96 == 2) {
                        kVar2 = alc.k.PENDING;
                    } else if (i96 == 3) {
                        kVar2 = alc.k.COMPLETED;
                    } else {
                        if (i96 != 4) {
                            throw new NoWhenBranchMatchedException();
                        }
                        kVar2 = alc.k.FAILED;
                    }
                    lVar = new alc.l(kVar2, hx7.a.v(model2.getMinimumWithdrawalAmount()), hx7.a.v(model2.getMinimumBalanceAfterWithdraw()));
                }
                return lVar;
            case 27:
                Unit params6 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(params6, "p0");
                mlc.b bVar3 = (mlc.b) this.receiver;
                bVar3.getClass();
                Intrinsics.checkNotNullParameter(params6, "params");
                return (alc.l) bVar3.d.j(params6);
            case 28:
                Throwable p025 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(p025, "p0");
                vl7.a.g((yji.l) this.receiver, p025);
                return Boolean.TRUE;
            default:
                Throwable p026 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(p026, "p0");
                vl7.a.g((yji.l) this.receiver, p026);
                return Boolean.TRUE;
        }
    }
}
