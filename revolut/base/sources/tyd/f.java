package tyd;

import com.revolut.core.model.account.AccountId;
import com.revolut.feature.statements.api.models.StatementPeriod;
import efm.d0;
import efm.r;
import java.util.HashMap;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import org.joda.time.ReadableInstant;
import org.joda.time.format.DateTimeFormatter;
import q06.k;
import rfm.l;
import sri.m;
import ufm.i;
import wp5.y;
import wsg.n;
import yhm.m;
import yhm.o;

/* JADX INFO: loaded from: classes7.dex */
public final class f implements jf0.d, k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ang.f f275560a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f275561b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m f275562c;
    public final y91.b d;

    public f(ang.f userInteractor, n walletInteractor, m navigator, y91.b accountsProductFeatureChecker) {
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(accountsProductFeatureChecker, "accountsProductFeatureChecker");
        this.f275560a = userInteractor;
        this.f275561b = walletInteractor;
        this.f275562c = navigator;
        this.d = accountsProductFeatureChecker;
    }

    public static StatementPeriod b(d dVar) {
        LocalDate localDate = dVar.f275555a.toLocalDate();
        Intrinsics.checkNotNullExpressionValue(localDate, "toLocalDate(...)");
        java.time.LocalDate localDateE = jli.b.e(localDate);
        LocalDate localDate2 = dVar.f275556b.toLocalDate();
        Intrinsics.checkNotNullExpressionValue(localDate2, "toLocalDate(...)");
        return new StatementPeriod(localDateE, jli.b.e(localDate2));
    }

    public static boolean d(jf0.c cVar) {
        return Intrinsics.f(cVar.e(1), "documents") && Intrinsics.f(cVar.e(2), "consolidated-tax-hub");
    }

    public static String g(String str, jf0.c cVar) {
        String str2 = (String) cVar.d.get(str);
        if (str2 == null) {
            return null;
        }
        String lowerCase = str2.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }

    @Override // jf0.d, q06.k
    public final boolean a(jf0.c cVar) {
        return (y.D(cVar, "deeplink", 1, "statement") && this.d.a("STATEMENTS.account_statement")) || d(cVar);
    }

    public final l c(String str) {
        efm.k mVar;
        n nVar = this.f275561b;
        if (str != null) {
            r rVarFilter = osg.b.e(nVar, false, io3.l.CURRENT, null, null, null, null, null, 124).filter(new ty1.c(new tx.f(24), 15));
            Intrinsics.checkNotNullExpressionValue(rVarFilter, "filter(...)");
            efm.k kVarFirstElement = m70.a.g(rVarFilter, null, null, 3).firstElement();
            ty1.c cVar = new ty1.c(new te8.a(str, 17), 16);
            kVarFirstElement.getClass();
            mVar = new rfm.m(kVarFirstElement, cVar, 0);
            Intrinsics.checkNotNullExpressionValue(mVar, "flatMap(...)");
        } else {
            mVar = rfm.h.f253943a;
        }
        l lVarL = mVar.l(nVar.y(AccountId.Personal.f51414a));
        Intrinsics.checkNotNullExpressionValue(lVarL, "switchIfEmpty(...)");
        return lVarL;
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x0130, code lost:
    
        if (r11 == r1) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0172, code lost:
    
        if (r11 == r1) goto L79;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // q06.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(jf0.c r10, kotlin.coroutines.Continuation r11) {
        /*
            Method dump skipped, instruction units count: 399
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: tyd.f.e(jf0.c, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // jf0.d
    public final d0 f(jf0.c cVar, boolean z) {
        Object objA;
        DateTime dateTime;
        Object objA2;
        DateTime dateTime2;
        HashMap map = cVar.d;
        if (!y.D(cVar, "deeplink", 1, "statement")) {
            if (d(cVar)) {
                i iVar = new i(this.f275560a.f(false), new ty1.c(new t9f.n(z, this, 5), 14), 1);
                Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                return iVar;
            }
            ufm.b bVarM = d0.m(Boolean.FALSE);
            Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
            return bVarM;
        }
        String str = (String) map.get("ccy");
        if (str == null) {
            str = (String) map.get("currency");
        }
        String strG = g("from", cVar);
        d dVar = null;
        if (strG != null) {
            try {
                m.Companion companion = yhm.m.INSTANCE;
                objA = new LocalDate(strG).toDateTimeAtStartOfDay();
            } catch (Throwable th10) {
                m.Companion companion2 = yhm.m.INSTANCE;
                objA = o.a(th10);
            }
            if (objA instanceof yhm.n) {
                objA = null;
            }
            dateTime = (DateTime) objA;
        } else {
            dateTime = null;
        }
        String strG2 = g("to", cVar);
        if (strG2 != null) {
            try {
                m.Companion companion3 = yhm.m.INSTANCE;
                LocalDate localDate = new LocalDate(strG2);
                DateTimeFormatter dateTimeFormatter = jli.b.f175839a;
                Intrinsics.checkNotNullParameter(localDate, "<this>");
                DateTime dateTimeNow = DateTime.now();
                Intrinsics.checkNotNullExpressionValue(dateTimeNow, "now(...)");
                objA2 = localDate.toDateTime(jli.b.k(dateTimeNow));
                Intrinsics.checkNotNullExpressionValue(objA2, "toDateTime(...)");
            } catch (Throwable th11) {
                m.Companion companion4 = yhm.m.INSTANCE;
                objA2 = o.a(th11);
            }
            if (objA2 instanceof yhm.n) {
                objA2 = null;
            }
            dateTime2 = (DateTime) objA2;
        } else {
            dateTime2 = null;
        }
        String str2 = (String) map.get("requestId");
        String strG3 = g("mode", cVar);
        c cVar2 = Intrinsics.f(strG3, "autostart") ? c.AUTOSTART : Intrinsics.f(strG3, "default") ? c.DEFAULT : c.DEFAULT;
        if (dateTime != null && dateTime2 != null && dateTime.compareTo((ReadableInstant) dateTime2) <= 0) {
            dVar = new d(dateTime, dateTime2, cVar2);
        }
        if (str2 != null) {
            ufm.c cVar3 = new ufm.c(new to7.f(this, str2, 4), 2);
            Intrinsics.checkNotNullExpressionValue(cVar3, "fromCallable(...)");
            return cVar3;
        }
        i iVar2 = new i(c(str), new ty1.c(new pud.b(this, dVar, z, 19), 13), 0);
        Intrinsics.checkNotNullExpressionValue(iVar2, "flatMap(...)");
        return iVar2;
    }
}
