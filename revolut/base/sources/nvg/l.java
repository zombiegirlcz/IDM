package nvg;

import androidx.room.util.SQLiteStatementUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import com.revolut.shared.feature.wealth.models.config.TradingLegalEntityInformation;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class l implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f219637a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f219638b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f219639c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ String e;
    public final /* synthetic */ Object f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f219640g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f219641h;

    public /* synthetic */ l(m mVar, ArrayList arrayList, List list, eel.c cVar, iwg.c cVar2, boolean z, String str) {
        this.f = mVar;
        this.f219640g = arrayList;
        this.f219641h = list;
        this.f219638b = cVar;
        this.f219639c = cVar2;
        this.d = z;
        this.e = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        float f;
        Float fValueOf;
        switch (this.f219637a) {
            case 0:
                return m.e((m) this.f, (ArrayList) this.f219640g, (List) this.f219641h, (eel.c) this.f219638b, (iwg.c) this.f219639c, this.d, this.e);
            case 1:
                z zVar = (z) this.f;
                iwg.a aVar = (iwg.a) this.f219640g;
                eel.c cVar = (eel.c) this.f219638b;
                iwg.c cVar2 = (iwg.c) this.f219639c;
                boolean z = this.d;
                String str = this.e;
                String str2 = (String) this.f219641h;
                b21.a aVar2 = zVar.f219695c;
                SQLiteStatement sQLiteStatementPrepare = ((SQLiteConnection) obj2).prepare("SELECT * FROM `complex_analytics_contributors` WHERE `asset_type` = ? AND `time_span` = ? AND `method` = ? AND `sector` = ? AND `portfolio_id` = ? AND `currency` = ?");
                try {
                    String strA = pvg.t.a(aVar);
                    if (strA == null) {
                        sQLiteStatementPrepare.bindNull(1);
                    } else {
                        sQLiteStatementPrepare.bindText(1, strA);
                    }
                    String strC = pvg.t.c(cVar);
                    if (strC == null) {
                        sQLiteStatementPrepare.bindNull(2);
                    } else {
                        sQLiteStatementPrepare.bindText(2, strC);
                    }
                    String strB = pvg.t.b(cVar2);
                    if (strB == null) {
                        sQLiteStatementPrepare.bindNull(3);
                    } else {
                        sQLiteStatementPrepare.bindText(3, strB);
                    }
                    sQLiteStatementPrepare.bindLong(4, z ? 1L : 0L);
                    sQLiteStatementPrepare.bindText(5, str);
                    if (str2 == null) {
                        sQLiteStatementPrepare.bindNull(6);
                    } else {
                        sQLiteStatementPrepare.bindText(6, str2);
                    }
                    int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "asset_type");
                    int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "time_span");
                    int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "method");
                    int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "sector");
                    int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "portfolio_id");
                    int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "currency");
                    int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "asset");
                    int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "pnl");
                    int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "returns");
                    int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "returnOnInitialMargin");
                    int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "closedOn");
                    int columnIndexOrThrow12 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "ref");
                    int columnIndexOrThrow13 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "openingPrice");
                    int columnIndexOrThrow14 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "positionId");
                    int columnIndexOrThrow15 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "quantity");
                    ArrayList arrayList = new ArrayList();
                    while (sQLiteStatementPrepare.step()) {
                        iwg.a aVarE = pvg.t.e(sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow));
                        eel.c cVarG = pvg.t.g(sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2));
                        iwg.c cVarF = pvg.t.f(sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3));
                        int i = columnIndexOrThrow2;
                        int i2 = columnIndexOrThrow3;
                        boolean z3 = ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow4)) != 0;
                        String text = sQLiteStatementPrepare.isNull(columnIndexOrThrow5) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow5);
                        String text2 = sQLiteStatementPrepare.isNull(columnIndexOrThrow6) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow6);
                        String text3 = sQLiteStatementPrepare.isNull(columnIndexOrThrow7) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow7);
                        jo3.b bVarG = b21.a.g(sQLiteStatementPrepare.isNull(columnIndexOrThrow8) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow8));
                        float f4 = (float) sQLiteStatementPrepare.getDouble(columnIndexOrThrow9);
                        if (sQLiteStatementPrepare.isNull(columnIndexOrThrow10)) {
                            f = f4;
                            fValueOf = null;
                        } else {
                            f = f4;
                            fValueOf = Float.valueOf((float) sQLiteStatementPrepare.getDouble(columnIndexOrThrow10));
                        }
                        String text4 = sQLiteStatementPrepare.isNull(columnIndexOrThrow11) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow11);
                        LocalDate localDate = text4 != null ? LocalDate.parse(text4) : null;
                        int i3 = columnIndexOrThrow15;
                        arrayList.add(new pvg.s(aVarE, cVarG, cVarF, z3, text, text2, text3, bVarG, f, fValueOf, localDate, sQLiteStatementPrepare.isNull(columnIndexOrThrow12) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow12), b21.a.e(sQLiteStatementPrepare.isNull(columnIndexOrThrow13) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow13)), sQLiteStatementPrepare.isNull(columnIndexOrThrow14) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow14), sQLiteStatementPrepare.isNull(i3) ? null : sQLiteStatementPrepare.getText(i3)));
                        columnIndexOrThrow15 = i3;
                        columnIndexOrThrow2 = i;
                        columnIndexOrThrow3 = i2;
                        break;
                    }
                    sQLiteStatementPrepare.close();
                    return arrayList;
                } catch (Throwable th10) {
                    sQLiteStatementPrepare.close();
                    throw th10;
                }
            default:
                tsd.a aVar3 = (tsd.a) this.f;
                rsd.k kVar = (rsd.k) this.f219640g;
                xi0.b bVar = (xi0.b) this.f219641h;
                TradingAccount tradingAccount = (TradingAccount) this.f219638b;
                TradingLegalEntityInformation tradingLegalEntityInformation = (TradingLegalEntityInformation) this.f219639c;
                wel.e portfolio = (wel.e) obj2;
                Intrinsics.checkNotNullParameter(portfolio, "portfolio");
                if (!this.d) {
                    return zi0.c.j(new tsd.l(aVar3));
                }
                ael.t tVar = kVar.e;
                String str3 = this.e;
                return nim.a.w(ael.t.d(tVar, str3, false, null, bVar, true, null, 34), new qz9.o(tradingAccount, 26, str3, tradingLegalEntityInformation));
        }
    }

    public /* synthetic */ l(z zVar, iwg.a aVar, eel.c cVar, iwg.c cVar2, boolean z, String str, String str2) {
        this.f = zVar;
        this.f219640g = aVar;
        this.f219638b = cVar;
        this.f219639c = cVar2;
        this.d = z;
        this.e = str;
        this.f219641h = str2;
    }

    public /* synthetic */ l(boolean z, tsd.a aVar, rsd.k kVar, String str, xi0.b bVar, TradingAccount tradingAccount, TradingLegalEntityInformation tradingLegalEntityInformation) {
        this.d = z;
        this.f = aVar;
        this.f219640g = kVar;
        this.e = str;
        this.f219641h = bVar;
        this.f219638b = tradingAccount;
        this.f219639c = tradingLegalEntityInformation;
    }
}
