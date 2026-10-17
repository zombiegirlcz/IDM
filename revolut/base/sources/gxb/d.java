package gxb;

import com.revolut.feature.rev_points.models.RevPointsEarningBreakdown;
import com.revolut.feature.rev_points.models.RevPointsEarningRate;
import com.revolut.feature.rev_points.models.RevPointsTextWithLinks;
import com.revolut.feature.rev_points.models.RevPointsTransaction;
import com.revolut.feature.rev_points.models.RevPointsTransactionExchangeAmount;
import com.revolut.feature.rev_points.models.RevPointsTransactionExchangeDetails;
import com.revolut.feature.rev_points.models.RevPointsTransactionExchangeRate;
import com.revolut.feature.rev_points.models.RevPointsTransactionIconsUrl;
import hxb.f;
import hxb.g0;
import hxb.h0;
import hxb.i0;
import hxb.n;
import hxb.o;
import hxb.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import m1c.f1;
import m1c.j0;
import m1c.k0;
import m1c.l0;
import m1c.p1;
import m1c.x;
import vxb.b0;
import vxb.c0;
import vxb.j;
import vxb.y;
import vxb.z;
import zhm.w;

/* JADX INFO: loaded from: classes6.dex */
public abstract class d {
    public static final RevPointsEarningBreakdown a(n nVar) {
        Intrinsics.checkNotNullParameter(nVar, "<this>");
        boolean isEarning = nVar.getIsEarning();
        RevPointsEarningRate revPointsEarningRateB = b(nVar.getCurrentRate());
        List rates = nVar.getRates();
        ArrayList arrayList = new ArrayList(w.t(rates, 10));
        Iterator it8 = rates.iterator();
        while (it8.hasNext()) {
            arrayList.add(b((o) it8.next()));
        }
        return new RevPointsEarningBreakdown(isEarning, revPointsEarningRateB, arrayList);
    }

    public static final RevPointsEarningRate b(o oVar) {
        f1 f1Var;
        Intrinsics.checkNotNullParameter(oVar, "<this>");
        String product = oVar.getProduct();
        f1[] f1VarArrValues = f1.values();
        int length = f1VarArrValues.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                f1Var = null;
                break;
            }
            f1Var = f1VarArrValues[i];
            if (a0.z(f1Var.name(), product, true)) {
                break;
            }
            i++;
        }
        if (f1Var == null) {
            f1Var = f1.UNKNOWN;
        }
        return new RevPointsEarningRate(f1Var, qvb.a.d(oVar.getPointsForCardSpend()), mo3.a.o(oVar.getCashForCardSpend()));
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.revolut.feature.rev_points.models.RevPointsTransaction c(hxb.f0 r19) {
        /*
            Method dump skipped, instruction units count: 234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: gxb.d.c(hxb.f0):com.revolut.feature.rev_points.models.RevPointsTransaction");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.revolut.feature.rev_points.models.RevPointsTransaction d(vxb.y r20) {
        /*
            Method dump skipped, instruction units count: 215
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: gxb.d.d(vxb.y):com.revolut.feature.rev_points.models.RevPointsTransaction");
    }

    public static final RevPointsTransactionExchangeAmount e(g0 g0Var) {
        Intrinsics.checkNotNullParameter(g0Var, "<this>");
        jo3.a money = g0Var.getMoney();
        return new RevPointsTransactionExchangeAmount(money != null ? mo3.a.o(money) : null, g0Var.getString());
    }

    public static final RevPointsTransactionExchangeAmount f(z zVar) {
        Intrinsics.checkNotNullParameter(zVar, "<this>");
        jo3.b money = zVar.getMoney();
        return new RevPointsTransactionExchangeAmount(money != null ? hx7.a.v(money) : null, zVar.getString());
    }

    public static final RevPointsTransactionExchangeDetails g(h0 h0Var) {
        Intrinsics.checkNotNullParameter(h0Var, "<this>");
        i0 rate = h0Var.getRate();
        Intrinsics.checkNotNullParameter(rate, "<this>");
        RevPointsTransactionExchangeRate revPointsTransactionExchangeRate = new RevPointsTransactionExchangeRate(e(rate.getFromValue()), e(rate.getToValue()));
        g0 amount = h0Var.getAmount();
        RevPointsTransactionExchangeAmount revPointsTransactionExchangeAmountE = amount != null ? e(amount) : null;
        g0 fee2 = h0Var.getFee();
        RevPointsTransactionExchangeAmount revPointsTransactionExchangeAmountE2 = fee2 != null ? e(fee2) : null;
        jo3.a earningCurrencyAmount = h0Var.getEarningCurrencyAmount();
        return new RevPointsTransactionExchangeDetails(revPointsTransactionExchangeRate, revPointsTransactionExchangeAmountE, revPointsTransactionExchangeAmountE2, earningCurrencyAmount != null ? mo3.a.o(earningCurrencyAmount) : null);
    }

    public static final RevPointsTransactionExchangeDetails h(vxb.a0 a0Var) {
        Intrinsics.checkNotNullParameter(a0Var, "<this>");
        b0 rate = a0Var.getRate();
        Intrinsics.checkNotNullParameter(rate, "<this>");
        RevPointsTransactionExchangeRate revPointsTransactionExchangeRate = new RevPointsTransactionExchangeRate(f(rate.getFromValue()), f(rate.getToValue()));
        z amount = a0Var.getAmount();
        RevPointsTransactionExchangeAmount revPointsTransactionExchangeAmountF = amount != null ? f(amount) : null;
        z fee2 = a0Var.getFee();
        RevPointsTransactionExchangeAmount revPointsTransactionExchangeAmountF2 = fee2 != null ? f(fee2) : null;
        jo3.b earningCurrencyAmount = a0Var.getEarningCurrencyAmount();
        return new RevPointsTransactionExchangeDetails(revPointsTransactionExchangeRate, revPointsTransactionExchangeAmountF, revPointsTransactionExchangeAmountF2, earningCurrencyAmount != null ? hx7.a.v(earningCurrencyAmount) : null);
    }

    public static final ArrayList i(p pVar) {
        Intrinsics.checkNotNullParameter(pVar, "<this>");
        List rates = pVar.getRates();
        ArrayList arrayList = new ArrayList(w.t(rates, 10));
        Iterator it8 = rates.iterator();
        while (it8.hasNext()) {
            arrayList.add(b((o) it8.next()));
        }
        return arrayList;
    }

    public static final x j(f fVar) {
        m1c.w wVar;
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        String strD = fVar.getPointsAccountId();
        String strE = fVar.getState();
        m1c.w[] wVarArrValues = m1c.w.values();
        int length = wVarArrValues.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                wVar = null;
                break;
            }
            wVar = wVarArrValues[i];
            if (a0.z(wVar.name(), strE, true)) {
                break;
            }
            i++;
        }
        if (wVar == null) {
            wVar = m1c.w.UNKNOWN;
        }
        return new x(strD, wVar, qvb.a.a(fVar.getBalance()), qvb.a.a(fVar.getTotalAward()), qvb.a.a(fVar.getTotalRedeemed()), mo3.a.o(fVar.getTotalRedeemedCash()), fVar.getEarnedPointsMultiplier(), fVar.getActivationDate());
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0144  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final m1c.l0 k(hxb.l r28, boolean r29) {
        /*
            Method dump skipped, instruction units count: 345
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: gxb.d.k(hxb.l, boolean):m1c.l0");
    }

    public static final l0 l(j jVar, boolean z) {
        m1c.i0 i0Var;
        k0 k0Var;
        Integer num;
        k0 k0Var2;
        m1c.g0 g0Var;
        j0 j0Var;
        Intrinsics.checkNotNullParameter(jVar, "<this>");
        String id10 = jVar.getId();
        String title = jVar.getTitle();
        String subtitle = jVar.getSubtitle();
        RevPointsTextWithLinks revPointsTextWithLinksB = qvb.b.b(jVar.getDescription());
        j.a progress = jVar.getProgress();
        Intrinsics.checkNotNullParameter(progress, "<this>");
        m1c.h0 h0Var = new m1c.h0(progress.getText(), progress.getCompletedSteps(), progress.getTotalSteps());
        String iconUrl = jVar.getIconUrl();
        String ctaText = jVar.getCtaText();
        String ctaTextPreview = jVar.getCtaTextPreview();
        String deeplink = jVar.getDeeplink();
        String state = jVar.getState();
        m1c.i0[] i0VarArrValues = m1c.i0.values();
        int length = i0VarArrValues.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                i0Var = null;
                break;
            }
            i0Var = i0VarArrValues[i];
            if (a0.z(i0Var.name(), state, true)) {
                break;
            }
            i++;
        }
        if (i0Var == null) {
            IllegalStateException illegalStateException = new IllegalStateException(j6.a.q("Unknown challenges state received from entity: ", jVar.getState()));
            zhm.h0 h0Var2 = zhm.h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            k0Var = null;
            rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var2);
            i0Var = m1c.i0.UNKNOWN;
        } else {
            k0Var = null;
        }
        m1c.i0 i0Var2 = i0Var;
        String reward = jVar.getReward();
        k0 k0Var3 = k0Var;
        String campaignId = jVar.getCampaignId();
        Integer daysLeft = jVar.getDaysLeft();
        Long completionDate = jVar.getCompletionDate();
        j.b claimDetails = jVar.getClaimDetails();
        if (claimDetails != null) {
            Intrinsics.checkNotNullParameter(claimDetails, "<this>");
            num = daysLeft;
            k0Var2 = new k0(claimDetails.getDaysLeft(), claimDetails.getClaimBy());
        } else {
            num = daysLeft;
            k0Var2 = k0Var3;
        }
        boolean canBeClaimed = jVar.getCanBeClaimed();
        String activationAction = jVar.getActivationAction();
        m1c.g0[] g0VarArrValues = m1c.g0.values();
        k0 k0Var4 = k0Var2;
        int length2 = g0VarArrValues.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length2) {
                g0Var = null;
                break;
            }
            g0Var = g0VarArrValues[i2];
            int i3 = length2;
            int i5 = i2;
            if (a0.z(g0Var.name(), activationAction, true)) {
                break;
            }
            i2 = i5 + 1;
            length2 = i3;
        }
        if (g0Var == null) {
            g0Var = m1c.g0.MANUAL_ACTIVATION;
        }
        List tags = jVar.getTags();
        ArrayList arrayList = new ArrayList();
        Iterator it8 = tags.iterator();
        while (it8.hasNext()) {
            String str = (String) it8.next();
            Iterator it9 = it8;
            j0[] j0VarArrValues = j0.values();
            String str2 = id10;
            int length3 = j0VarArrValues.length;
            int i6 = 0;
            while (true) {
                if (i6 >= length3) {
                    j0Var = null;
                    break;
                }
                j0 j0Var2 = j0VarArrValues[i6];
                int i21 = i6;
                int i22 = length3;
                if (a0.z(j0Var2.name(), str, true)) {
                    j0Var = j0Var2;
                    break;
                }
                i6 = i21 + 1;
                length3 = i22;
            }
            if (j0Var != null) {
                arrayList.add(j0Var);
            }
            it8 = it9;
            id10 = str2;
        }
        return new l0(id10, title, subtitle, revPointsTextWithLinksB, h0Var, iconUrl, ctaText, ctaTextPreview, deeplink, i0Var2, reward, campaignId, num, completionDate, k0Var4, canBeClaimed, z, g0Var, arrayList);
    }

    public static final o m(RevPointsEarningRate revPointsEarningRate) {
        Intrinsics.checkNotNullParameter(revPointsEarningRate, "<this>");
        return new o(revPointsEarningRate.f83975a.name(), revPointsEarningRate.f83976b.W(), mo3.a.p(revPointsEarningRate.f83977c));
    }

    public static final j n(l0 l0Var) {
        String str;
        j.b bVar;
        Intrinsics.checkNotNullParameter(l0Var, "<this>");
        String str2 = l0Var.f201384a;
        String str3 = l0Var.f201385b;
        String str4 = l0Var.f201386c;
        p1 p1VarC = qvb.b.c(l0Var.d);
        m1c.h0 h0Var = l0Var.e;
        Intrinsics.checkNotNullParameter(h0Var, "<this>");
        j.a aVar = new j.a(h0Var.f201372a, h0Var.f201373b, h0Var.f201374c);
        String str5 = l0Var.f;
        String str6 = l0Var.f201387g;
        String str7 = l0Var.f201388h;
        String str8 = l0Var.i;
        String strName = l0Var.f201389j.name();
        String str9 = l0Var.k;
        String str10 = l0Var.f201390l;
        Integer num = l0Var.f201391m;
        Long l2 = l0Var.f201392n;
        k0 k0Var = l0Var.o;
        if (k0Var != null) {
            Intrinsics.checkNotNullParameter(k0Var, "<this>");
            str = str2;
            bVar = new j.b(k0Var.f201382a, k0Var.f201383b);
        } else {
            str = str2;
            bVar = null;
        }
        boolean z = l0Var.f201393p;
        String strName2 = l0Var.f201395r.name();
        List list = l0Var.f201396s;
        j.b bVar2 = bVar;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            arrayList.add(((j0) it8.next()).name());
        }
        return new j(str, str3, str4, p1VarC, aVar, str5, str6, str7, str8, strName, str9, str10, num, l2, bVar2, z, strName2, arrayList);
    }

    public static final y o(RevPointsTransaction revPointsTransaction) {
        c0 c0Var;
        Intrinsics.checkNotNullParameter(revPointsTransaction, "<this>");
        String str = revPointsTransaction.f84054a;
        String strName = revPointsTransaction.f84055b.name();
        double dJ = revPointsTransaction.f84056c.J();
        long j2 = revPointsTransaction.d;
        String str2 = revPointsTransaction.e;
        f1 f1Var = revPointsTransaction.f;
        String strName2 = f1Var != null ? f1Var.name() : null;
        String strName3 = revPointsTransaction.f84057g.name();
        String str3 = revPointsTransaction.f84058h;
        String str4 = revPointsTransaction.i;
        RevPointsTransactionIconsUrl revPointsTransactionIconsUrl = revPointsTransaction.f84059j;
        if (revPointsTransactionIconsUrl != null) {
            Intrinsics.checkNotNullParameter(revPointsTransactionIconsUrl, "<this>");
            c0Var = new c0(revPointsTransactionIconsUrl.f84072a, revPointsTransactionIconsUrl.f84073b);
        } else {
            c0Var = null;
        }
        RevPointsTransactionExchangeDetails revPointsTransactionExchangeDetails = revPointsTransaction.k;
        vxb.a0 a0VarQ = revPointsTransactionExchangeDetails != null ? q(revPointsTransactionExchangeDetails) : null;
        RevPointsTransactionExchangeAmount revPointsTransactionExchangeAmount = revPointsTransaction.f84060l;
        z zVarP = revPointsTransactionExchangeAmount != null ? p(revPointsTransactionExchangeAmount) : null;
        String str5 = revPointsTransaction.f84061m;
        String str6 = revPointsTransaction.f84062n;
        RevPointsTransactionExchangeDetails revPointsTransactionExchangeDetails2 = revPointsTransaction.o;
        vxb.a0 a0VarQ2 = revPointsTransactionExchangeDetails2 != null ? q(revPointsTransactionExchangeDetails2) : null;
        RevPointsTransactionExchangeDetails revPointsTransactionExchangeDetails3 = revPointsTransaction.f84063p;
        return new y(str, strName, dJ, j2, str2, strName2, strName3, str3, str4, c0Var, a0VarQ, zVarP, str5, str6, a0VarQ2, revPointsTransactionExchangeDetails3 != null ? q(revPointsTransactionExchangeDetails3) : null);
    }

    public static final z p(RevPointsTransactionExchangeAmount revPointsTransactionExchangeAmount) {
        Intrinsics.checkNotNullParameter(revPointsTransactionExchangeAmount, "<this>");
        dj0.d dVar = revPointsTransactionExchangeAmount.f84065a;
        return new z(revPointsTransactionExchangeAmount.f84066b, dVar != null ? hx7.a.A(dVar) : null);
    }

    public static final vxb.a0 q(RevPointsTransactionExchangeDetails revPointsTransactionExchangeDetails) {
        Intrinsics.checkNotNullParameter(revPointsTransactionExchangeDetails, "<this>");
        RevPointsTransactionExchangeRate revPointsTransactionExchangeRate = revPointsTransactionExchangeDetails.f84067a;
        Intrinsics.checkNotNullParameter(revPointsTransactionExchangeRate, "<this>");
        b0 b0Var = new b0(p(revPointsTransactionExchangeRate.f84070a), p(revPointsTransactionExchangeRate.f84071b));
        RevPointsTransactionExchangeAmount revPointsTransactionExchangeAmount = revPointsTransactionExchangeDetails.f84068b;
        z zVarP = revPointsTransactionExchangeAmount != null ? p(revPointsTransactionExchangeAmount) : null;
        RevPointsTransactionExchangeAmount revPointsTransactionExchangeAmount2 = revPointsTransactionExchangeDetails.f84069c;
        z zVarP2 = revPointsTransactionExchangeAmount2 != null ? p(revPointsTransactionExchangeAmount2) : null;
        dj0.d dVar = revPointsTransactionExchangeDetails.d;
        return new vxb.a0(b0Var, zVarP, zVarP2, dVar != null ? hx7.a.A(dVar) : null);
    }
}
