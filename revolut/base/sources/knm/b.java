package knm;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.RectF;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.animation.LinearInterpolator;
import android.webkit.CookieManager;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.TextView;
import androidx.appcompat.R$attr;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.widget.TextViewCompat;
import cg0.v;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.feature.credit.application.plugins.impl.ui.incomecheck.WebPageException;
import com.revolut.feature.credit.loan.api.models.rev10.LoanRepaymentAccountDetails;
import com.revolut.feature.crypto.account.api.model.dto.CryptoAccountOnboardingDetailsDto;
import com.revolut.feature.crypto.account.api.model.dto.CryptoAccountOnboardingDto;
import com.revolut.feature.crypto_investments.api.model.transaction_filter.CryptoTransactionFilter;
import com.revolut.feature.rev_points.models.RevPoints;
import com.revolut.feature.tax_residency.api.exemption.model.ValidityPeriod;
import com.revolut.feature.vaults.R$string;
import com.revolut.feature.wealth.analytics.data.repositories.complex_analytics.model.TotalValueChartFacade;
import com.revolut.feature.wealth.analytics.data.repositories.complex_analytics.model.TotalValueChartPointFacade;
import com.revolut.retail.feature.esim.api.model.EsimAutoRenewalTerms;
import com.revolut.retail.feature.esim.api.model.EsimAutoRenewalTermsItem;
import dj0.d;
import e10.t;
import ec5.h;
import ec5.j;
import eel.c;
import gwi.g0;
import gwi.j0;
import gwi.m0;
import hvb.f;
import j18.s;
import j18.u;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.math.BigDecimal;
import java.time.Instant;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.y;
import kr.p1;
import o45.b2;
import o45.c2;
import org.joda.time.DateTime;
import pne.h0;
import pne.i;
import pvg.p;
import pvg.q;
import pvg.r;
import q35.b0;
import q35.c0;
import q35.e0;
import yhm.m;
import yhm.n;
import yhm.o;
import zhm.d0;
import zhm.f0;
import zhm.w;
import zhm.z;

/* JADX INFO: loaded from: classes14.dex */
public abstract class b {
    public static final void A(int i, View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setBackground(DrawableCompat.wrap(view.getBackground()));
        view.setBackgroundTintList(ColorStateList.valueOf(i));
    }

    public static final Pair B(TotalValueChartFacade totalValueChartFacade, String assetTypesId, c timeSpan, xi0.b currency, String userId, String chartDetailsType) {
        Intrinsics.checkNotNullParameter(totalValueChartFacade, "<this>");
        Intrinsics.checkNotNullParameter(assetTypesId, "assetTypesId");
        Intrinsics.checkNotNullParameter(timeSpan, "timeSpan");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(chartDetailsType, "chartDetailsType");
        String str = currency.f306286a;
        DateTime dateTime = totalValueChartFacade.f94985a;
        DateTime dateTime2 = totalValueChartFacade.f94986b;
        d dVar = totalValueChartFacade.d;
        jo3.b bVarA = dVar != null ? hx7.a.A(dVar) : null;
        d dVar2 = totalValueChartFacade.e;
        q qVar = new q(userId, assetTypesId, timeSpan, str, dateTime, dateTime2, bVarA, dVar2 != null ? hx7.a.A(dVar2) : null, chartDetailsType);
        List<TotalValueChartPointFacade> list = totalValueChartFacade.f94987c;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        for (TotalValueChartPointFacade totalValueChartPointFacade : list) {
            String str2 = currency.f306286a;
            DateTime dateTime3 = totalValueChartPointFacade.f94988a;
            jo3.b bVarA2 = hx7.a.A(totalValueChartPointFacade.f94989b);
            d dVar3 = totalValueChartPointFacade.f94990c;
            arrayList.add(new r(userId, assetTypesId, timeSpan, str2, dateTime3, bVarA2, dVar3 != null ? hx7.a.A(dVar3) : null, chartDetailsType));
        }
        return new Pair(qVar, arrayList);
    }

    public static final cj0.c C(v vVar) {
        cj0.d dVar;
        Intrinsics.checkNotNullParameter(vVar, "<this>");
        UUID uuidA = vVar.getId();
        String type = vVar.getType();
        Intrinsics.checkNotNullParameter(type, "type");
        if (Intrinsics.f(type, "TRANSACTION")) {
            dVar = cj0.d.TRANSACTION;
        } else {
            if (!Intrinsics.f(type, "CARD")) {
                throw new IllegalArgumentException(a0.d.r(type, " is unknown troubleshooting type!"));
            }
            dVar = cj0.d.CARD;
        }
        return new cj0.c(uuidA, dVar);
    }

    public static final ValidityPeriod D(h0 h0Var) {
        Intrinsics.checkNotNullParameter(h0Var, "<this>");
        return new ValidityPeriod(h0Var.f237720a, h0Var.f237721b);
    }

    public static final TotalValueChartFacade E(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        p pVar = (p) d0.d0(list);
        if (pVar == null) {
            return null;
        }
        DateTime dateTime = pVar.e;
        DateTime dateTime2 = pVar.f;
        List<p> list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        for (p pVar2 : list2) {
            DateTime dateTime3 = pVar2.i;
            d dVarV = hx7.a.v(pVar2.f240203j);
            jo3.b bVar = pVar2.k;
            arrayList.add(new TotalValueChartPointFacade(dVarV, bVar != null ? hx7.a.v(bVar) : null, dateTime3));
        }
        jo3.b bVar2 = pVar.f240201g;
        d dVarV2 = bVar2 != null ? hx7.a.v(bVar2) : null;
        jo3.b bVar3 = pVar.f240202h;
        return new TotalValueChartFacade(dVarV2, bVar3 != null ? hx7.a.v(bVar3) : null, arrayList, dateTime, dateTime2);
    }

    public static final EsimAutoRenewalTerms F(kfj.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        String strB = aVar.getTitle();
        List listA = aVar.getItems();
        Intrinsics.checkNotNullParameter(listA, "<this>");
        List<kfj.b> list = listA;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        for (kfj.b bVar : list) {
            Intrinsics.checkNotNullParameter(bVar, "<this>");
            arrayList.add(new EsimAutoRenewalTermsItem(bVar.getIcon(), bVar.getDescription()));
        }
        return new EsimAutoRenewalTerms(strB, arrayList);
    }

    public static final ec5.c G(CryptoAccountOnboardingDto cryptoAccountOnboardingDto) {
        ec5.d dVar;
        j jVar;
        h hVar;
        Intrinsics.checkNotNullParameter(cryptoAccountOnboardingDto, "<this>");
        String str = cryptoAccountOnboardingDto.f70753a;
        j[] jVarArrValues = j.values();
        int length = jVarArrValues.length;
        int i = 0;
        while (true) {
            dVar = null;
            if (i >= length) {
                jVar = null;
                break;
            }
            jVar = jVarArrValues[i];
            if (a0.z(jVar.name(), str, true)) {
                break;
            }
            i++;
        }
        if (jVar == null) {
            jVar = j.UNKNOWN;
        }
        boolean z = cryptoAccountOnboardingDto.f70754b;
        String str2 = cryptoAccountOnboardingDto.f70755c;
        if (str2 != null) {
            h[] hVarArrValues = h.values();
            int length2 = hVarArrValues.length;
            for (int i2 = 0; i2 < length2; i2++) {
                hVar = hVarArrValues[i2];
                if (a0.z(hVar.name(), str2, true)) {
                    break;
                }
            }
            hVar = null;
        } else {
            hVar = null;
        }
        CryptoAccountOnboardingDetailsDto cryptoAccountOnboardingDetailsDto = cryptoAccountOnboardingDto.d;
        if (cryptoAccountOnboardingDetailsDto != null) {
            Intrinsics.checkNotNullParameter(cryptoAccountOnboardingDetailsDto, "<this>");
            dVar = new ec5.d(cryptoAccountOnboardingDetailsDto.f70749a, cryptoAccountOnboardingDetailsDto.f70750b, cryptoAccountOnboardingDetailsDto.f70751c, cryptoAccountOnboardingDetailsDto.d);
        }
        return new ec5.c(jVar, z, dVar, hVar);
    }

    public static final fvb.a H(hvb.c cVar) {
        fvb.c cVar2;
        Object objA;
        ZonedDateTime zonedDateTime;
        Double dK;
        Double dK2;
        Double dK3;
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        String str = cVar.f;
        RevPoints revPointsA = (str == null || (dK3 = y.k(str)) == null) ? null : qvb.a.a(dK3.doubleValue());
        String str2 = cVar.f155800j;
        if (str2 != null) {
            fvb.c[] cVarArrValues = fvb.c.values();
            int length = cVarArrValues.length;
            for (int i = 0; i < length; i++) {
                cVar2 = cVarArrValues[i];
                if (a0.z(cVar2.name(), str2, true)) {
                    break;
                }
            }
            cVar2 = null;
        } else {
            cVar2 = null;
        }
        String str3 = cVar.f155795a;
        String str4 = cVar.f155796b;
        fvb.c cVar3 = cVar2;
        String str5 = cVar.f155797c;
        String str6 = cVar.d;
        String str7 = cVar.e;
        if (str7 != null) {
            try {
                m.Companion aVar = m.INSTANCE;
                objA = ZonedDateTime.parse(str7);
            } catch (Throwable th10) {
                m.Companion aVar2 = m.INSTANCE;
                objA = o.a(th10);
            }
            if (objA instanceof n) {
                objA = null;
            }
            zonedDateTime = (ZonedDateTime) objA;
        } else {
            zonedDateTime = null;
        }
        String str8 = cVar.f155798g;
        RevPoints revPointsA2 = (str8 == null || (dK2 = y.k(str8)) == null) ? null : qvb.a.a(dK2.doubleValue());
        String str9 = cVar.f155799h;
        RevPoints revPointsA3 = (str9 == null || (dK = y.k(str9)) == null) ? null : qvb.a.a(dK.doubleValue());
        List list = cVar.i;
        ArrayList arrayList = new ArrayList();
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            Double dK4 = y.k((String) it8.next());
            RevPoints revPointsA4 = dK4 != null ? qvb.a.a(dK4.doubleValue()) : null;
            if (revPointsA4 != null) {
                arrayList.add(revPointsA4);
            }
        }
        return new fvb.a(str3, str4, str5, str6, zonedDateTime, revPointsA, revPointsA2, revPointsA3, arrayList, cVar3 == null ? fvb.c.PENDING : cVar3);
    }

    public static final fvb.b I(f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        String str = fVar.f155803b;
        String str2 = fVar.f155804c;
        Double dK = y.k(str);
        fvb.c cVar = null;
        RevPoints revPointsA = dK != null ? qvb.a.a(dK.doubleValue()) : null;
        fvb.c[] cVarArrValues = fvb.c.values();
        int length = cVarArrValues.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            fvb.c cVar2 = cVarArrValues[i];
            if (a0.z(cVar2.name(), str2, true)) {
                cVar = cVar2;
                break;
            }
            i++;
        }
        if (revPointsA == null) {
            throw new IllegalArgumentException(j6.a.q("points value is invalid: ", fVar.f155803b).toString());
        }
        if (cVar != null) {
            return new fvb.b(fVar.f155802a, revPointsA, cVar);
        }
        throw new IllegalArgumentException(j6.a.q("status value is invalid: ", str2).toString());
    }

    public static final ArrayList J(List list) {
        q35.d0 d0Var;
        Iterator it8;
        d dVar;
        String str;
        d dVar2;
        String str2;
        d dVar3;
        d dVar4;
        LoanRepaymentAccountDetails loanRepaymentAccountDetails;
        String str3;
        b0 b0Var;
        String str4 = "<this>";
        Intrinsics.checkNotNullParameter(list, "<this>");
        List list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        Iterator it9 = list2.iterator();
        while (it9.hasNext()) {
            c2 c2Var = (c2) it9.next();
            Intrinsics.checkNotNullParameter(c2Var, str4);
            String str5 = c2Var.f222027b;
            String str6 = c2Var.f222028c;
            ZonedDateTime zonedDateTime = ZonedDateTime.parse(c2Var.d);
            Intrinsics.checkNotNullExpressionValue(zonedDateTime, "parse(...)");
            long j2 = c2Var.f;
            xi0.a aVar = xi0.b.Companion;
            String str7 = c2Var.e;
            aVar.getClass();
            d dVar5 = new d(j2, xi0.a.a(str7));
            String str8 = c2Var.f222029g;
            q35.d0[] d0VarArrValues = q35.d0.values();
            int length = d0VarArrValues.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    d0Var = null;
                    break;
                }
                d0Var = d0VarArrValues[i];
                if (a0.z(d0Var.name(), str8, true)) {
                    break;
                }
                i++;
            }
            if (d0Var == null) {
                d0Var = q35.d0.Auto;
            }
            q35.d0 d0Var2 = d0Var;
            String str9 = c2Var.f222030h;
            String str10 = c2Var.i;
            String str11 = c2Var.f222031j;
            Long l2 = c2Var.k;
            if (l2 != null) {
                long jLongValue = l2.longValue();
                xi0.b.Companion.getClass();
                it8 = it9;
                dVar = new d(jLongValue, xi0.a.a(str7));
            } else {
                it8 = it9;
                dVar = null;
            }
            Long l3 = c2Var.f222032l;
            if (l3 != null) {
                long jLongValue2 = l3.longValue();
                xi0.b.Companion.getClass();
                str = str7;
                dVar2 = new d(jLongValue2, xi0.a.a(str));
            } else {
                str = str7;
                dVar2 = null;
            }
            Long l4 = c2Var.f222033m;
            if (l4 != null) {
                long jLongValue3 = l4.longValue();
                xi0.b.Companion.getClass();
                str2 = str6;
                dVar3 = new d(jLongValue3, xi0.a.a(str));
            } else {
                str2 = str6;
                dVar3 = null;
            }
            String str12 = c2Var.f222034n;
            c0 c0VarValueOf = str12 != null ? c0.valueOf(str12) : null;
            b2 b2Var = c2Var.o;
            if (b2Var != null) {
                Object obj2 = d55.c.f111351a;
                Intrinsics.checkNotNullParameter(b2Var, str4);
                dVar4 = dVar3;
                loanRepaymentAccountDetails = new LoanRepaymentAccountDetails(b2Var.f222016a, b2Var.f222017b);
            } else {
                dVar4 = dVar3;
                loanRepaymentAccountDetails = null;
            }
            String str13 = c2Var.f222035p;
            if (str13 != null) {
                b0[] b0VarArrValues = b0.values();
                int length2 = b0VarArrValues.length;
                str3 = str4;
                int i2 = 0;
                while (i2 < length2) {
                    b0 b0Var2 = b0VarArrValues[i2];
                    int i3 = i2;
                    b0[] b0VarArr = b0VarArrValues;
                    if (a0.z(b0Var2.name(), str13, true)) {
                        b0Var = b0Var2;
                        break;
                    }
                    i2 = i3 + 1;
                    b0VarArrValues = b0VarArr;
                }
            } else {
                str3 = str4;
            }
            b0Var = null;
            arrayList.add(new e0(str5, str2, zonedDateTime, dVar5, d0Var2, str9, str10, str11, dVar, dVar2, dVar4, c0VarValueOf, loanRepaymentAccountDetails, b0Var));
            it9 = it8;
            str4 = str3;
        }
        return arrayList;
    }

    public static final one.d K(pne.y yVar) {
        Intrinsics.checkNotNullParameter(yVar, "<this>");
        List<pne.o> list = yVar.f237744a;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        for (pne.o oVar : list) {
            String str = oVar.f237728a;
            pne.c cVar = oVar.f237729b;
            arrayList.add(new one.c(str, new one.a(cVar.f237706a, cVar.f237707b), oVar.f237730c, oVar.d, D(oVar.e)));
        }
        List<i> list2 = yVar.f237745b;
        ArrayList arrayList2 = new ArrayList(w.t(list2, 10));
        for (i iVar : list2) {
            String str2 = iVar.f237722a;
            h0 h0Var = iVar.f237723b;
            arrayList2.add(new one.b(str2, h0Var != null ? D(h0Var) : null));
        }
        return new one.d(arrayList, arrayList2);
    }

    public static final svi.r L(m0 m0Var) {
        svi.q qVar;
        svi.p pVar;
        Instant instant;
        String str;
        boolean z;
        boolean z3;
        svi.n nVar;
        svi.m mVar;
        String str2;
        svi.o oVar;
        Intrinsics.checkNotNullParameter(m0Var, "<this>");
        String str3 = m0Var.f147454a;
        String upperCase = m0Var.f147455b.toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        svi.q[] qVarArrValues = svi.q.values();
        int length = qVarArrValues.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                qVar = null;
                break;
            }
            qVar = qVarArrValues[i];
            if (a0.z(qVar.name(), upperCase, true)) {
                break;
            }
            i++;
        }
        if (qVar == null) {
            qVar = svi.q.UNKNOWN;
        }
        boolean z4 = m0Var.f147456c;
        boolean z6 = m0Var.d;
        Long l2 = m0Var.e;
        Instant instantOfEpochMilli = l2 != null ? Instant.ofEpochMilli(l2.longValue()) : null;
        Long l3 = m0Var.f;
        Instant instantOfEpochMilli2 = l3 != null ? Instant.ofEpochMilli(l3.longValue()) : null;
        Long l4 = m0Var.f147457g;
        Instant instantOfEpochMilli3 = l4 != null ? Instant.ofEpochMilli(l4.longValue()) : null;
        String upperCase2 = m0Var.f147458h.toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase2, "toUpperCase(...)");
        svi.p[] pVarArrValues = svi.p.values();
        int length2 = pVarArrValues.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length2) {
                pVar = null;
                break;
            }
            pVar = pVarArrValues[i2];
            if (a0.z(pVar.name(), upperCase2, true)) {
                break;
            }
            i2++;
        }
        if (pVar == null) {
            pVar = svi.p.UNKNOWN;
        }
        svi.p pVar2 = pVar;
        jo3.a aVar = m0Var.i;
        d dVarO = aVar != null ? mo3.a.o(aVar) : null;
        jo3.a aVar2 = m0Var.f147459j;
        d dVarO2 = aVar2 != null ? mo3.a.o(aVar2) : null;
        j0 j0Var = m0Var.k;
        if (j0Var != null) {
            Intrinsics.checkNotNullParameter(j0Var, "<this>");
            instant = instantOfEpochMilli;
            int i3 = j0Var.f147428a;
            str = str3;
            int i5 = j0Var.f147429b;
            z = z4;
            z3 = z6;
            Instant instantOfEpochMilli4 = Instant.ofEpochMilli(j0Var.f147430c);
            Intrinsics.checkNotNullExpressionValue(instantOfEpochMilli4, "ofEpochMilli(...)");
            nVar = new svi.n(i3, i5, instantOfEpochMilli4);
        } else {
            instant = instantOfEpochMilli;
            str = str3;
            z = z4;
            z3 = z6;
            nVar = null;
        }
        g0 g0Var = m0Var.f147460l;
        if (g0Var != null) {
            Intrinsics.checkNotNullParameter(g0Var, "<this>");
            String str4 = g0Var.f147398a;
            Instant instantOfEpochMilli5 = Instant.ofEpochMilli(g0Var.f147399b);
            Intrinsics.checkNotNullExpressionValue(instantOfEpochMilli5, "ofEpochMilli(...)");
            mVar = new svi.m(str4, instantOfEpochMilli5);
        } else {
            mVar = null;
        }
        String str5 = m0Var.f147461m;
        String str6 = m0Var.f147462n;
        String str7 = m0Var.o;
        String str8 = m0Var.f147463p;
        String str9 = m0Var.f147464q;
        String upperCase3 = m0Var.f147465r.toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase3, "toUpperCase(...)");
        svi.o[] oVarArrValues = svi.o.values();
        int length3 = oVarArrValues.length;
        int i6 = 0;
        while (true) {
            if (i6 >= length3) {
                str2 = str7;
                oVar = null;
                break;
            }
            oVar = oVarArrValues[i6];
            int i21 = i6;
            str2 = str7;
            if (a0.z(oVar.name(), upperCase3, true)) {
                break;
            }
            i6 = i21 + 1;
            str7 = str2;
        }
        if (oVar == null) {
            oVar = svi.o.UNKNOWN;
        }
        return new svi.r(str, qVar, z, z3, instant, instantOfEpochMilli2, instantOfEpochMilli3, pVar2, dVarO, dVarO2, nVar, mVar, str5, str6, str2, str8, str9, oVar);
    }

    public static final x08.b M(u uVar) {
        x08.a aVar;
        Intrinsics.checkNotNullParameter(uVar, "<this>");
        ej0.b bVar = uVar.f170158b;
        BigDecimal bigDecimal = uVar.f170159c;
        Integer num = uVar.d;
        s sVar = uVar.f170157a;
        Intrinsics.checkNotNullParameter(sVar, "<this>");
        int i = i18.b.f157590a[sVar.ordinal()];
        if (i == 1) {
            aVar = x08.a.PENDING;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            aVar = x08.a.ATTRIBUTED;
        }
        return new x08.b(aVar, bVar, bigDecimal, num, uVar.e);
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0178  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.ArrayList N(java.util.List r21) {
        /*
            Method dump skipped, instruction units count: 639
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: knm.b.N(java.util.List):java.util.ArrayList");
    }

    public static final p1 O(t tVar, String str) {
        return new p1(str, tVar.f121844b);
    }

    public static final h0 P(ValidityPeriod validityPeriod) {
        Intrinsics.checkNotNullParameter(validityPeriod, "<this>");
        return new h0(validityPeriod.f89975a, validityPeriod.f89976b);
    }

    public static final uz5.a Q(wz5.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        boolean z = aVar.f301367a;
        List listC = aVar.f301368b;
        if (listC.isEmpty()) {
            listC = zhm.u.c(0);
        }
        return new uz5.a(z, listC);
    }

    public static final void R(Rect destination, RectF rectF) {
        Intrinsics.checkNotNullParameter(rectF, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        destination.top = rim.d.c(rectF.top);
        destination.bottom = rim.d.c(rectF.bottom);
        destination.left = rim.d.c(rectF.left);
        destination.right = rim.d.c(rectF.right);
    }

    public static final ArrayList S(List list, List filters) {
        Object next;
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(filters, "filters");
        List<CryptoTransactionFilter> list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        for (CryptoTransactionFilter cryptoTransactionFilter : list2) {
            Iterator it8 = filters.iterator();
            while (true) {
                if (!it8.hasNext()) {
                    next = null;
                    break;
                }
                next = it8.next();
                if (Intrinsics.f(((CryptoTransactionFilter) next).getF71396c(), cryptoTransactionFilter.getF71396c())) {
                    break;
                }
            }
            CryptoTransactionFilter cryptoTransactionFilter2 = (CryptoTransactionFilter) next;
            if (cryptoTransactionFilter2 != null) {
                cryptoTransactionFilter = cryptoTransactionFilter2;
            }
            arrayList.add(cryptoTransactionFilter);
        }
        return arrayList;
    }

    public static final void a(TextView textView, int i) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        TypedArray typedArrayObtainStyledAttributes = textView.getContext().obtainStyledAttributes(i, new int[]{R$attr.lineHeight});
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1);
        TextViewCompat.setTextAppearance(textView, i);
        if (dimensionPixelSize != -1) {
            TextViewCompat.setLineHeight(textView, dimensionPixelSize);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public static final void b(WebView webView) {
        Intrinsics.checkNotNullParameter(webView, "<this>");
        WebSettings settings = webView.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setDomStorageEnabled(true);
        settings.setSupportMultipleWindows(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        settings.setLoadsImagesAutomatically(true);
        settings.setDatabaseEnabled(true);
        CookieManager.getInstance().setAcceptCookie(true);
        CookieManager.getInstance().setAcceptThirdPartyCookies(webView, true);
        od0.a aVar = od0.a.f224253a;
        if (od0.a.i()) {
            WebView.setWebContentsDebuggingEnabled(true);
        }
        Intrinsics.checkNotNullExpressionValue(settings, "apply(...)");
    }

    public static Object c(Class cls, InvocationHandler invocationHandler) {
        if (invocationHandler == null) {
            return null;
        }
        return cls.cast(Proxy.newProxyInstance(b.class.getClassLoader(), new Class[]{cls}, invocationHandler));
    }

    public static final boolean d(RectF rectF, RectF bounds) {
        Intrinsics.checkNotNullParameter(rectF, "<this>");
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        return rectF.left >= bounds.left && rectF.top >= bounds.top && rectF.right <= bounds.right && rectF.bottom <= bounds.bottom;
    }

    public static final int e(ViewGroup relativeParent, View view, boolean z) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(relativeParent, "relativeParent");
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        int i = 0;
        while (!view.equals(relativeParent)) {
            if (view2 == null) {
                return 0;
            }
            int left = view.getLeft() + i;
            if (z) {
                left -= view2.getScrollX();
            }
            i = left;
            Object parent2 = view2.getParent();
            View view3 = view2;
            view2 = parent2 instanceof View ? (View) parent2 : null;
            view = view3;
        }
        return i;
    }

    public static final float f(View view, ViewGroup relativeParent) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(relativeParent, "relativeParent");
        if (view == relativeParent) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        int scrollX = view2 != null ? view2.getScrollX() : 0;
        if (view2 == relativeParent || view2 == null) {
            return view.getX() - scrollX;
        }
        return f(view2, relativeParent) + (view.getX() - scrollX);
    }

    public static final int g(ViewGroup relativeParent, View view, boolean z) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(relativeParent, "relativeParent");
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        int i = 0;
        while (!view.equals(relativeParent)) {
            if (view2 == null) {
                return 0;
            }
            int top = view.getTop() + i;
            if (z) {
                top -= view2.getScrollY();
            }
            i = top;
            Object parent2 = view2.getParent();
            View view3 = view2;
            view2 = parent2 instanceof View ? (View) parent2 : null;
            view = view3;
        }
        return i;
    }

    public static final float h(View view, ViewGroup relativeParent) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(relativeParent, "relativeParent");
        if (view == relativeParent) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        int scrollY = view2 != null ? view2.getScrollY() : 0;
        if (view2 == relativeParent || view2 == null) {
            return view.getY() - scrollY;
        }
        return h(view2, relativeParent) + (view.getY() - scrollY);
    }

    public static final List i() {
        return zhm.v.k(new Pair(Integer.valueOf(R$string.vaults_personal_name_suggestion_holidays), "holidays"), new Pair(Integer.valueOf(R$string.vaults_personal_name_suggestion_gift), "gift"), new Pair(Integer.valueOf(R$string.vaults_personal_name_suggestion_rainy_day), "rainyDays"), new Pair(Integer.valueOf(R$string.vaults_personal_name_suggestion_education), "education"), new Pair(Integer.valueOf(R$string.vaults_personal_name_suggestion_renovation), "renovation"));
    }

    public static final aii.n j(aii.o oVar, aii.u destination) {
        Intrinsics.checkNotNullParameter(oVar, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        return oVar.M0(new aii.v(destination));
    }

    public static final boolean k(RectF rectF, RectF bounds) {
        Intrinsics.checkNotNullParameter(rectF, "<this>");
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        return rectF.left == bounds.left && rectF.top == bounds.top && rectF.right == bounds.right && rectF.bottom == bounds.bottom;
    }

    public static final boolean l(pi3.d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        b93.a aVar = b93.b.Companion;
        aVar.getClass();
        b93.b bVar = b93.b.U;
        aVar.getClass();
        b93.b bVar2 = b93.b.T;
        aVar.getClass();
        return zhm.v.k(bVar, bVar2, b93.b.V).contains(dVar.f236390c);
    }

    public static final boolean m(qn9.f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        long j2 = fVar.f247880b;
        io3.d dVarU = u(fVar);
        return j2 <= (dVarU != null ? dVarU.i : 0L);
    }

    public static final boolean n(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        if (view.getVisibility() == 0 && (view.getHeight() != 0 || view.getWidth() != 0)) {
            View rootView = view.getRootView();
            ViewGroup viewGroup = rootView instanceof ViewGroup ? (ViewGroup) rootView : null;
            if (viewGroup == null) {
                return false;
            }
            int iE = e(viewGroup, view, true);
            int iG = g(viewGroup, view, true);
            if (iG < viewGroup.getHeight() && view.getHeight() + iG > 0 && iE < viewGroup.getWidth() && view.getWidth() + iE > 0) {
                return true;
            }
        }
        return false;
    }

    public static final void o(int i, String failingUrl, String description) {
        Intrinsics.checkNotNullParameter(failingUrl, "failingUrl");
        Intrinsics.checkNotNullParameter(description, "description");
        Uri uri2 = Uri.parse(failingUrl);
        WebPageException webPageException = new WebPageException("WebPage error: url: " + new Uri.Builder().scheme(uri2.getScheme()).authority(uri2.getAuthority()).path(uri2.getPath()) + " errorCode: " + i + " description: " + description);
        zhm.h0 h0Var = zhm.h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, null, null, webPageException, h0Var);
    }

    public static final void p(String failingUrl, WebResourceResponse errorResponse) {
        Intrinsics.checkNotNullParameter(failingUrl, "failingUrl");
        Intrinsics.checkNotNullParameter(errorResponse, "errorResponse");
        int statusCode = errorResponse.getStatusCode();
        String reasonPhrase = errorResponse.getReasonPhrase();
        StringBuilder sbK = v0.a.k(statusCode, "WebView HTTP error - url: ", failingUrl, " errorCode: ", " description: ");
        sbK.append(reasonPhrase);
        WebPageException webPageException = new WebPageException(sbK.toString());
        zhm.h0 h0Var = zhm.h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, null, null, webPageException, h0Var);
    }

    public static final List q(zsc.d dVar, Iterable entities, List foundIds, atc.b idAccessor, int i, boolean z, Comparator comparator) {
        int i2;
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        Intrinsics.checkNotNullParameter(entities, "entities");
        Intrinsics.checkNotNullParameter(foundIds, "foundIds");
        Intrinsics.checkNotNullParameter(idAccessor, "idAccessor");
        if ((entities instanceof Collection) && ((Collection) entities).isEmpty()) {
            return f0.f322471a;
        }
        HashMap map = new HashMap();
        if (!foundIds.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : entities) {
                arrayList.clear();
                idAccessor.a(obj2, arrayList);
                int iJ = zhm.v.j(arrayList);
                if (iJ >= 0) {
                    while (true) {
                        map.put(arrayList.get(i2), obj2);
                        i2 = i2 != iJ ? i2 + 1 : 0;
                    }
                }
            }
        }
        ArrayList arrayList2 = new ArrayList();
        HashSet hashSet = new HashSet();
        Iterator it8 = foundIds.iterator();
        while (true) {
            if (it8.hasNext()) {
                Object obj3 = map.get((String) it8.next());
                if (obj3 != null && hashSet.add(obj3)) {
                    arrayList2.add(obj3);
                }
                if (arrayList2.size() > i) {
                    break;
                }
            } else {
                ArrayList arrayList3 = comparator == null ? arrayList2 : new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                Iterator it9 = entities.iterator();
                while (true) {
                    if (it9.hasNext()) {
                        Object next = it9.next();
                        if (!hashSet.contains(next)) {
                            if (dVar.a(next)) {
                                arrayList3.add(next);
                            } else if (z) {
                                arrayList4.add(next);
                            }
                            if (arrayList2 == arrayList3) {
                                if (arrayList2.size() > i) {
                                    break;
                                }
                            } else {
                                if (arrayList3.size() + arrayList2.size() > i) {
                                    zhm.a0.x(arrayList3, arrayList2);
                                    return arrayList2;
                                }
                            }
                        }
                    } else {
                        if (comparator != null) {
                            z.w(arrayList3, comparator);
                            zhm.a0.x(arrayList3, arrayList2);
                        }
                        if (!arrayList4.isEmpty()) {
                            zhm.a0.x(arrayList4, arrayList2);
                        }
                    }
                }
            }
        }
        return arrayList2;
    }

    public static /* synthetic */ List r(zsc.d dVar, Iterable iterable, List list, atc.b bVar, zkh.t tVar, int i) {
        if ((i & 32) != 0) {
            tVar = null;
        }
        return q(dVar, iterable, list, bVar, Integer.MAX_VALUE, false, tVar);
    }

    public static wih.c s(Function1 pollAction, Function1 pollWhile) {
        wgk.f onEach = new wgk.f(10);
        Intrinsics.checkNotNullParameter(pollAction, "pollAction");
        Intrinsics.checkNotNullParameter(pollWhile, "pollWhile");
        Intrinsics.checkNotNullParameter(onEach, "onEach");
        return new wih.c(pollAction, onEach, pollWhile, (Continuation) null);
    }

    public static final boolean t(View view, ViewGroup target, RectF outBounds) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(target, "target");
        Intrinsics.checkNotNullParameter(outBounds, "outBounds");
        if (!view.isAttachedToWindow() || view.isLayoutRequested() || view.getWidth() == 0 || view.getHeight() == 0) {
            return false;
        }
        view.getLocationInWindow(new int[2]);
        target.getLocationInWindow(new int[2]);
        float f = r2[0] - r0[0];
        float f4 = r2[1] - r0[1];
        outBounds.set(f, f4, view.getWidth() + f, view.getHeight() + f4);
        return true;
    }

    public static final io3.d u(qn9.f fVar) {
        Object next;
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        Iterator it8 = fVar.f247881c.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (Intrinsics.f(((io3.d) next).f163145a, fVar.d)) {
                break;
            }
        }
        return (io3.d) next;
    }

    public static final void v(int i, View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setPaddingRelative(view.getPaddingStart(), view.getPaddingTop(), view.getPaddingEnd(), i);
    }

    public static final void w(int i, View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setPaddingRelative(view.getPaddingStart(), view.getPaddingTop(), i, view.getPaddingBottom());
    }

    public static final void x(int i, View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setPaddingRelative(i, view.getPaddingTop(), view.getPaddingEnd(), view.getPaddingBottom());
    }

    public static final void y(int i, View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setPaddingRelative(view.getPaddingStart(), i, view.getPaddingEnd(), view.getPaddingBottom());
    }

    public static void z(View view, boolean z, Long l2, int i) {
        if ((i & 2) != 0) {
            l2 = null;
        }
        LinearInterpolator animationInterpolator = new LinearInterpolator();
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(animationInterpolator, "animationInterpolator");
        if (z && view.getVisibility() == 0) {
            return;
        }
        if (z || view.getVisibility() != 8) {
            float f = BitmapDescriptorFactory.HUE_RED;
            if (l2 == null) {
                if (z) {
                    f = 1.0f;
                }
                view.setAlpha(f);
                view.setVisibility(z ? 0 : 8);
                return;
            }
            view.setAlpha(z ? 0.0f : 1.0f);
            ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
            if (z) {
                f = 1.0f;
            }
            viewPropertyAnimatorAnimate.alpha(f).setDuration(l2.longValue()).setInterpolator(animationInterpolator).withStartAction(new com.google.android.material.internal.b(z, view, 2)).withEndAction(new com.google.android.material.internal.b(z, view, 3)).setStartDelay(0L).start();
        }
    }
}
