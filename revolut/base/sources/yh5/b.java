package yh5;

import afl.t0;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.YuvImage;
import android.media.Image;
import android.os.Build;
import android.util.Log;
import b60.f;
import com.getkeepsafe.relinker.MissingLibraryException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.common.collect.ImmutableSet;
import com.google.gson.JsonParseException;
import com.google.mlkit.common.MlKitException;
import com.google.mlkit.vision.common.InputImage;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.ImageClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.onboarding.models.OnboardingCompany;
import com.revolut.feature.pricingplans.models.PricingPlanSubscription;
import com.revolut.feature.pricingplans.models.PricingPlanSubscriptionBillingChange;
import com.revolut.feature.retail.cobranded_cards.api.domain.model.CobrandedCardsValueReminderAction;
import com.revolut.feature.retail.cobranded_cards.api.domain.model.CobrandedCardsValueReminderActionConfirmation;
import com.revolut.feature.retail.cobranded_cards.api.domain.model.CobrandedCardsValueReminderActionConfirmationAction;
import com.revolut.feature.retail.cobranded_cards.api.domain.model.CobrandedCardsValueReminderActionConfirmationItem;
import com.revolut.feature.retail.cobranded_cards.api.domain.model.CobrandedCardsValueReminderActionConfirmationSection;
import com.revolut.feature.shops.api.model.ShopsLockedProductOffer;
import com.revolut.feature_exchange.impl.ui.exchange.market_order.model.MoneyDetails;
import com.revolut.retail.feature.pricing_plans.ui.api.models.PricingPlanSwitchToAnnualSavings;
import dfl.j0;
import dfl.q;
import dfl.x;
import eid.v;
import gx1.i;
import hee.j;
import hx7.e;
import ib9.g;
import io.reactivex.rxjava3.exceptions.ProtocolViolationException;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import jb3.l;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.a0;
import kotlinx.coroutines.flow.Flow;
import krl.r;
import lp.q1;
import oq9.c0;
import oq9.y;
import orl.i0;
import pcl.z;
import sid.p;
import w5b.a6;
import w5b.e6;
import w5b.h6;
import w5b.u5;
import w5b.x5;
import x5b.h;
import yhm.m;
import yhm.n;
import yhm.o;
import zhm.d0;
import zhm.f0;
import zhm.h0;
import zhm.w;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b {
    public static void A(Class cls) {
        String name = cls.getName();
        l.v(new ProtocolViolationException(j6.a.s("It is not allowed to subscribe with a(n) ", name, " multiple times. Please create a fresh instance of ", name, " and subscribe that to the target source instead.")));
    }

    public static final Set B(List list) {
        List list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        Iterator it8 = list2.iterator();
        while (it8.hasNext()) {
            arrayList.add(com.bumptech.glide.d.c((String) it8.next()));
        }
        return d0.i1(arrayList);
    }

    public static final z C(t0 t0Var) {
        Intrinsics.checkNotNullParameter(t0Var, "<this>");
        return new z(hx7.a.A(t0Var.f4647a), hx7.a.A(t0Var.f4648b));
    }

    public static final r D(q qVar) {
        Intrinsics.checkNotNullParameter(qVar, "<this>");
        if (!(qVar instanceof dfl.a)) {
            if (qVar instanceof x) {
                return new r("QUANTITY", null, ((x) qVar).f114516a.toString(), null);
            }
            throw new NoWhenBranchMatchedException();
        }
        dfl.a aVar = (dfl.a) qVar;
        long j2 = aVar.f114177a;
        return new r("AMOUNT", Long.valueOf(j2), null, aVar.f114178b.f306286a);
    }

    public static final t0 E(z zVar) {
        Intrinsics.checkNotNullParameter(zVar, "<this>");
        return new t0(hx7.a.v(zVar.getLow()), hx7.a.v(zVar.getHigh()));
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public static final com.revolut.feature.retail.cobranded_cards.api.domain.model.CobrandedCardsValueReminder F(w5b.z6 r23) {
        /*
            Method dump skipped, instruction units count: 369
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yh5.b.F(w5b.z6):com.revolut.feature.retail.cobranded_cards.api.domain.model.CobrandedCardsValueReminder");
    }

    public static final CobrandedCardsValueReminderAction G(h6 h6Var) {
        ArrayList arrayList;
        ArrayList arrayList2;
        CobrandedCardsValueReminderActionConfirmationAction cobrandedCardsValueReminderActionConfirmationAction;
        Intrinsics.checkNotNullParameter(h6Var, "<this>");
        String str = h6Var.f294868a;
        x5 x5Var = h6Var.f294869b;
        CobrandedCardsValueReminderActionConfirmation cobrandedCardsValueReminderActionConfirmation = null;
        CobrandedCardsValueReminderActionConfirmationAction cobrandedCardsValueReminderActionConfirmationAction2 = null;
        if (x5Var != null) {
            Intrinsics.checkNotNullParameter(x5Var, "<this>");
            String str2 = x5Var.f295071a;
            String str3 = x5Var.f295072b;
            List list = x5Var.f295073c;
            if (list != null) {
                List list2 = list;
                arrayList = new ArrayList(w.t(list2, 10));
                Iterator it8 = list2.iterator();
                while (it8.hasNext()) {
                    arrayList.add(H((a6) it8.next()));
                }
            } else {
                arrayList = null;
            }
            List list3 = x5Var.d;
            if (list3 != null) {
                List<e6> list4 = list3;
                arrayList2 = new ArrayList(w.t(list4, 10));
                for (e6 e6Var : list4) {
                    Intrinsics.checkNotNullParameter(e6Var, "<this>");
                    List list5 = e6Var.f294827a;
                    ArrayList arrayList3 = new ArrayList(w.t(list5, 10));
                    Iterator it9 = list5.iterator();
                    while (it9.hasNext()) {
                        arrayList3.add(H((a6) it9.next()));
                    }
                    arrayList2.add(new CobrandedCardsValueReminderActionConfirmationSection(arrayList3));
                }
            } else {
                arrayList2 = null;
            }
            u5 u5Var = x5Var.e;
            if (u5Var != null) {
                Intrinsics.checkNotNullParameter(u5Var, "<this>");
                cobrandedCardsValueReminderActionConfirmationAction = new CobrandedCardsValueReminderActionConfirmationAction(u5Var.f295035a, u5Var.f295036b);
            } else {
                cobrandedCardsValueReminderActionConfirmationAction = null;
            }
            u5 u5Var2 = x5Var.f;
            if (u5Var2 != null) {
                Intrinsics.checkNotNullParameter(u5Var2, "<this>");
                cobrandedCardsValueReminderActionConfirmationAction2 = new CobrandedCardsValueReminderActionConfirmationAction(u5Var2.f295035a, u5Var2.f295036b);
            }
            cobrandedCardsValueReminderActionConfirmation = new CobrandedCardsValueReminderActionConfirmation(str2, str3, arrayList, arrayList2, cobrandedCardsValueReminderActionConfirmationAction, cobrandedCardsValueReminderActionConfirmationAction2);
        }
        return new CobrandedCardsValueReminderAction(str, cobrandedCardsValueReminderActionConfirmation);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.revolut.feature.retail.cobranded_cards.api.domain.model.CobrandedCardsValueReminderActionConfirmationItem H(w5b.a6 r9) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            com.revolut.feature.retail.cobranded_cards.api.domain.model.CobrandedCardsValueReminderActionConfirmationItem r1 = new com.revolut.feature.retail.cobranded_cards.api.domain.model.CobrandedCardsValueReminderActionConfirmationItem
            java.lang.String r2 = r9.f294778a
            java.lang.String r3 = r9.f294779b
            java.lang.String r4 = r9.f294780c
            java.lang.String r5 = r9.d
            java.lang.String r6 = r9.e
            java.lang.String r0 = r9.f
            r7 = 0
            if (r0 == 0) goto L59
            int r8 = r0.hashCode()
            switch(r8) {
                case -1593994019: goto L4e;
                case -1302127026: goto L42;
                case -1155340077: goto L36;
                case 2402104: goto L2a;
                case 3900344: goto L1e;
                default: goto L1d;
            }
        L1d:
            goto L59
        L1e:
            java.lang.String r8 = "FREEZE_CARD"
            boolean r0 = r0.equals(r8)
            if (r0 != 0) goto L27
            goto L59
        L27:
            r5b.p r7 = r5b.p.FREEZE_CARD
            goto L59
        L2a:
            java.lang.String r8 = "NONE"
            boolean r0 = r0.equals(r8)
            if (r0 != 0) goto L33
            goto L59
        L33:
            r5b.p r7 = r5b.p.NONE
            goto L59
        L36:
            java.lang.String r8 = "DOWNGRADE_PLAN"
            boolean r0 = r0.equals(r8)
            if (r0 != 0) goto L3f
            goto L59
        L3f:
            r5b.p r7 = r5b.p.DOWNGRADE_PLAN
            goto L59
        L42:
            java.lang.String r8 = "TERMINATE_CARD"
            boolean r0 = r0.equals(r8)
            if (r0 != 0) goto L4b
            goto L59
        L4b:
            r5b.p r7 = r5b.p.TERMINATE_CARD
            goto L59
        L4e:
            java.lang.String r8 = "SCHEDULE_CARD_TERMINATION"
            boolean r0 = r0.equals(r8)
            if (r0 != 0) goto L57
            goto L59
        L57:
            r5b.p r7 = r5b.p.SCHEDULE_CARD_TERMINATION
        L59:
            java.lang.String r9 = r9.f294781g
            if (r9 == 0) goto L6f
            java.lang.String r0 = "DANGER"
            boolean r9 = kotlin.jvm.internal.Intrinsics.f(r9, r0)
            if (r9 == 0) goto L68
            r5b.q r9 = r5b.q.DANGER
            goto L6a
        L68:
            r5b.q r9 = r5b.q.NORMAL
        L6a:
            if (r9 != 0) goto L6d
            goto L6f
        L6d:
            r8 = r9
            goto L72
        L6f:
            r5b.q r9 = r5b.q.NORMAL
            goto L6d
        L72:
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: yh5.b.H(w5b.a6):com.revolut.feature.retail.cobranded_cards.api.domain.model.CobrandedCardsValueReminderActionConfirmationItem");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.util.List] */
    public static final ShopsLockedProductOffer I(v vVar, String carouselId) {
        ?? arrayList;
        m1c.r rVar;
        Intrinsics.checkNotNullParameter(vVar, "<this>");
        Intrinsics.checkNotNullParameter(carouselId, "carouselId");
        String id10 = vVar.getId();
        String analyticsRef = vVar.getAnalyticsRef();
        String productArticleId = vVar.getProductArticleId();
        List<String> eligiblePlans = vVar.getEligiblePlans();
        if (eligiblePlans != null) {
            arrayList = new ArrayList();
            for (String str : eligiblePlans) {
                m1c.r[] rVarArrValues = m1c.r.values();
                int length = rVarArrValues.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        rVar = null;
                        break;
                    }
                    rVar = rVarArrValues[i];
                    if (a0.z(rVar.name(), str, true)) {
                        break;
                    }
                    i++;
                }
                if (rVar != null) {
                    arrayList.add(rVar);
                }
            }
        } else {
            arrayList = f0.f322471a;
        }
        ?? r62 = arrayList;
        if (id10 == null || analyticsRef == null) {
            return null;
        }
        return new ShopsLockedProductOffer(id10, productArticleId, carouselId, analyticsRef, r62);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.util.List] */
    public static final ShopsLockedProductOffer J(p pVar, String carouselId) {
        ?? arrayList;
        m1c.r rVar;
        Intrinsics.checkNotNullParameter(pVar, "<this>");
        Intrinsics.checkNotNullParameter(carouselId, "carouselId");
        String strC = pVar.getId();
        String strA = pVar.getAnalyticsRef();
        String strD = pVar.getProductArticleId();
        List<String> listB = pVar.getEligiblePlans();
        if (listB != null) {
            arrayList = new ArrayList();
            for (String str : listB) {
                m1c.r[] rVarArrValues = m1c.r.values();
                int length = rVarArrValues.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        rVar = null;
                        break;
                    }
                    rVar = rVarArrValues[i];
                    if (a0.z(rVar.name(), str, true)) {
                        break;
                    }
                    i++;
                }
                if (rVar != null) {
                    arrayList.add(rVar);
                }
            }
        } else {
            arrayList = f0.f322471a;
        }
        ?? r62 = arrayList;
        if (strC == null || strA == null) {
            return null;
        }
        return new ShopsLockedProductOffer(strC, strD, carouselId, strA, r62);
    }

    public static final q K(r rVar) {
        Intrinsics.checkNotNullParameter(rVar, "<this>");
        String strD = rVar.getType();
        if (!Intrinsics.f(strD, "AMOUNT")) {
            if (!Intrinsics.f(strD, "QUANTITY")) {
                throw new IllegalStateException();
            }
            String strC = rVar.getQuantity();
            if (strC != null) {
                return new x(new BigDecimal(strC));
            }
            throw new IllegalStateException("Null quantity for QUANTITY InvestValue");
        }
        Long lA = rVar.getAmount();
        if (lA == null) {
            throw new IllegalStateException("Null amount for AMOUNT Invest Value");
        }
        long jLongValue = lA.longValue();
        xi0.a aVar = xi0.b.Companion;
        String strB = rVar.getCurrency();
        if (strB == null) {
            throw new IllegalStateException("Null currency for AMOUNT InvestValue");
        }
        aVar.getClass();
        return new dfl.a(jLongValue, xi0.a.a(strB));
    }

    public static final q L(orl.r rVar) {
        Intrinsics.checkNotNullParameter(rVar, "<this>");
        if (!(rVar instanceof orl.a)) {
            if (rVar instanceof i0) {
                return new x(new BigDecimal(((i0) rVar).getQuantity()));
            }
            throw new NoWhenBranchMatchedException();
        }
        orl.a aVar = (orl.a) rVar;
        long jA = aVar.getAmount();
        xi0.a aVar2 = xi0.b.Companion;
        String strB = aVar.getCurrency();
        aVar2.getClass();
        return new dfl.a(jA, xi0.a.a(strB));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.ArrayList] */
    public static final pd9.a M(g gVar) {
        Set setB;
        Set setB2;
        ?? arrayList;
        List list;
        List list2;
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        ib9.d dVar = gVar.f160135a;
        if (dVar == null || (list2 = dVar.f160132a) == null || (setB = B(list2)) == null) {
            setB = h0.f322473a;
        }
        ib9.d dVar2 = gVar.f160136b;
        if (dVar2 == null || (list = dVar2.f160132a) == null || (setB2 = B(list)) == null) {
            setB2 = h0.f322473a;
        }
        List list3 = gVar.f160137c;
        if (list3 != null) {
            List<ib9.c> list4 = list3;
            arrayList = new ArrayList(w.t(list4, 10));
            for (ib9.c cVar : list4) {
                arrayList.add(new OnboardingCompany(cVar.f160128a, cVar.f160129b, B(cVar.d), cVar.f160130c));
            }
        } else {
            arrayList = f0.f322471a;
        }
        return new pd9.a(arrayList, setB, setB2);
    }

    public static final List N(Set set) {
        Set set2 = set;
        ArrayList arrayList = new ArrayList(w.t(set2, 10));
        Iterator it8 = set2.iterator();
        while (it8.hasNext()) {
            arrayList.add(((wi0.b) it8.next()).f297794a);
        }
        return c6d.b.N(arrayList);
    }

    public static final orl.r O(q qVar) {
        Intrinsics.checkNotNullParameter(qVar, "<this>");
        if (qVar instanceof dfl.a) {
            dfl.a aVar = (dfl.a) qVar;
            return new orl.a(aVar.f114177a, aVar.f114178b.f306286a);
        }
        if (!(qVar instanceof x)) {
            throw new NoWhenBranchMatchedException();
        }
        String string = ((x) qVar).f114516a.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return new i0(string);
    }

    public static final a6 P(CobrandedCardsValueReminderActionConfirmationItem cobrandedCardsValueReminderActionConfirmationItem) {
        String str;
        String str2;
        Intrinsics.checkNotNullParameter(cobrandedCardsValueReminderActionConfirmationItem, "<this>");
        String str3 = cobrandedCardsValueReminderActionConfirmationItem.f82454a;
        String str4 = cobrandedCardsValueReminderActionConfirmationItem.f82455b;
        String str5 = cobrandedCardsValueReminderActionConfirmationItem.f82456c;
        String str6 = cobrandedCardsValueReminderActionConfirmationItem.d;
        String str7 = cobrandedCardsValueReminderActionConfirmationItem.e;
        r5b.p pVar = cobrandedCardsValueReminderActionConfirmationItem.f;
        if (pVar != null) {
            int i = h.f302929a[pVar.ordinal()];
            if (i == 1) {
                str = "NONE";
            } else if (i == 2) {
                str = "FREEZE_CARD";
            } else if (i == 3) {
                str = "TERMINATE_CARD";
            } else if (i == 4) {
                str = "SCHEDULE_CARD_TERMINATION";
            } else {
                if (i != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                str = "DOWNGRADE_PLAN";
            }
        } else {
            str = null;
        }
        int i2 = h.f302930b[cobrandedCardsValueReminderActionConfirmationItem.f82457g.ordinal()];
        if (i2 == 1) {
            str2 = "NORMAL";
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            str2 = "DANGER";
        }
        return new a6(str3, str4, str5, str6, str7, str, str2);
    }

    public static final h6 Q(CobrandedCardsValueReminderAction cobrandedCardsValueReminderAction) {
        ArrayList arrayList;
        ArrayList arrayList2;
        u5 u5Var;
        Intrinsics.checkNotNullParameter(cobrandedCardsValueReminderAction, "<this>");
        String str = cobrandedCardsValueReminderAction.f82447a;
        CobrandedCardsValueReminderActionConfirmation cobrandedCardsValueReminderActionConfirmation = cobrandedCardsValueReminderAction.f82448b;
        x5 x5Var = null;
        u5 u5Var2 = null;
        if (cobrandedCardsValueReminderActionConfirmation != null) {
            Intrinsics.checkNotNullParameter(cobrandedCardsValueReminderActionConfirmation, "<this>");
            String str2 = cobrandedCardsValueReminderActionConfirmation.f82449a;
            String str3 = cobrandedCardsValueReminderActionConfirmation.f82450b;
            List list = cobrandedCardsValueReminderActionConfirmation.f82451c;
            if (list != null) {
                List list2 = list;
                arrayList = new ArrayList(w.t(list2, 10));
                Iterator it8 = list2.iterator();
                while (it8.hasNext()) {
                    arrayList.add(P((CobrandedCardsValueReminderActionConfirmationItem) it8.next()));
                }
            } else {
                arrayList = null;
            }
            List list3 = cobrandedCardsValueReminderActionConfirmation.d;
            if (list3 != null) {
                List<CobrandedCardsValueReminderActionConfirmationSection> list4 = list3;
                arrayList2 = new ArrayList(w.t(list4, 10));
                for (CobrandedCardsValueReminderActionConfirmationSection cobrandedCardsValueReminderActionConfirmationSection : list4) {
                    Intrinsics.checkNotNullParameter(cobrandedCardsValueReminderActionConfirmationSection, "<this>");
                    List list5 = cobrandedCardsValueReminderActionConfirmationSection.f82458a;
                    ArrayList arrayList3 = new ArrayList(w.t(list5, 10));
                    Iterator it9 = list5.iterator();
                    while (it9.hasNext()) {
                        arrayList3.add(P((CobrandedCardsValueReminderActionConfirmationItem) it9.next()));
                    }
                    arrayList2.add(new e6(arrayList3));
                }
            } else {
                arrayList2 = null;
            }
            CobrandedCardsValueReminderActionConfirmationAction cobrandedCardsValueReminderActionConfirmationAction = cobrandedCardsValueReminderActionConfirmation.e;
            if (cobrandedCardsValueReminderActionConfirmationAction != null) {
                Intrinsics.checkNotNullParameter(cobrandedCardsValueReminderActionConfirmationAction, "<this>");
                u5Var = new u5(cobrandedCardsValueReminderActionConfirmationAction.f82452a, cobrandedCardsValueReminderActionConfirmationAction.f82453b);
            } else {
                u5Var = null;
            }
            CobrandedCardsValueReminderActionConfirmationAction cobrandedCardsValueReminderActionConfirmationAction2 = cobrandedCardsValueReminderActionConfirmation.f;
            if (cobrandedCardsValueReminderActionConfirmationAction2 != null) {
                Intrinsics.checkNotNullParameter(cobrandedCardsValueReminderActionConfirmationAction2, "<this>");
                u5Var2 = new u5(cobrandedCardsValueReminderActionConfirmationAction2.f82452a, cobrandedCardsValueReminderActionConfirmationAction2.f82453b);
            }
            x5Var = new x5(str2, str3, arrayList, arrayList2, u5Var, u5Var2);
        }
        return new h6(str, x5Var);
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public static final w5b.z6 R(com.revolut.feature.retail.cobranded_cards.api.domain.model.CobrandedCardsValueReminder r23) {
        /*
            Method dump skipped, instruction units count: 363
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yh5.b.R(com.revolut.feature.retail.cobranded_cards.api.domain.model.CobrandedCardsValueReminder):w5b.z6");
    }

    public static final Map S(p61.b bVar, tl0.a base64Wrapper) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        Intrinsics.checkNotNullParameter(base64Wrapper, "base64Wrapper");
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        Intrinsics.checkNotNullParameter(base64Wrapper, "base64Wrapper");
        String strV = a0.d.v(new Object[]{"id", "accessToken"}, 2, "%s:%s", "format(...)");
        Charset charset = Charsets.UTF_8;
        byte[] bytes = strV.getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        return a0.d.x("Authorization", a0.d.v(new Object[]{new String(base64Wrapper.b(bytes), charset)}, 1, "Basic %s", "format(...)"));
    }

    public static final dj0.d T(MoneyDetails moneyDetails) {
        Intrinsics.checkNotNullParameter(moneyDetails, "<this>");
        Long l2 = moneyDetails.f96898b;
        return new dj0.d(l2 != null ? l2.longValue() : 0L, moneyDetails.f96897a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r1v2, types: [dfl.j0[]] */
    /* JADX WARN: Type inference failed for: r4v0, types: [yhm.n] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Enum] */
    public static final j0 U(String str) throws Throwable {
        ?? A;
        Intrinsics.checkNotNullParameter(str, "<this>");
        try {
            m.Companion aVar = m.INSTANCE;
            ?? Values = j0.values();
            int length = Values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    A = 0;
                    break;
                }
                A = Values[i];
                if (a0.z(A.name(), str, true)) {
                    break;
                }
                i++;
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th10) {
            m.Companion aVar2 = m.INSTANCE;
            A = o.a(th10);
        }
        Throwable thA = m.a(A);
        if (thA != null) {
            e.n(thA);
        }
        j0 j0Var = (j0) (A instanceof n ? 0 : A);
        return j0Var == null ? j0.UNKNOWN : j0Var;
    }

    public static ByteBuffer V(Image.Plane[] planeArr, int i, int i2) {
        int i3 = i * i2;
        int i5 = i3 / 4;
        byte[] bArr = new byte[i5 + i5 + i3];
        ByteBuffer buffer = planeArr[1].getBuffer();
        ByteBuffer buffer2 = planeArr[2].getBuffer();
        int iPosition = buffer2.position();
        int iLimit = buffer.limit();
        buffer2.position(iPosition + 1);
        buffer.limit(iLimit - 1);
        int i6 = (i3 + i3) / 4;
        boolean z = buffer2.remaining() == i6 + (-2) && buffer2.compareTo(buffer) == 0;
        buffer2.position(iPosition);
        buffer.limit(iLimit);
        if (z) {
            planeArr[0].getBuffer().get(bArr, 0, i3);
            ByteBuffer buffer3 = planeArr[1].getBuffer();
            planeArr[2].getBuffer().get(bArr, i3, 1);
            buffer3.get(bArr, i3 + 1, i6 - 1);
        } else {
            Z(planeArr[0], i, i2, bArr, 0, 1);
            Z(planeArr[1], i, i2, bArr, i3 + 1, 2);
            Z(planeArr[2], i, i2, bArr, i3, 2);
        }
        return ByteBuffer.wrap(bArr);
    }

    public static ByteBuffer W(ByteBuffer byteBuffer, boolean z) {
        int i;
        byteBuffer.rewind();
        int iLimit = byteBuffer.limit();
        int i2 = iLimit / 6;
        ByteBuffer byteBufferAllocate = z ? ByteBuffer.allocate(iLimit) : ByteBuffer.allocateDirect(iLimit);
        int i3 = 0;
        while (true) {
            i = i2 * 4;
            if (i3 >= i) {
                break;
            }
            byteBufferAllocate.put(i3, byteBuffer.get(i3));
            i3++;
        }
        for (int i5 = 0; i5 < i2 + i2; i5++) {
            byteBufferAllocate.put(i + i5, byteBuffer.get((i5 / 2) + ((i5 % 2) * i2) + i));
        }
        return byteBufferAllocate;
    }

    public static Bitmap X(int i, int i2, int i3, Bitmap bitmap) {
        if (i == 0) {
            return Bitmap.createBitmap(bitmap, 0, 0, i2, i3);
        }
        Matrix matrix = new Matrix();
        matrix.postRotate(i);
        return Bitmap.createBitmap(bitmap, 0, 0, i2, i3, matrix, true);
    }

    public static byte[] Y(int i, int i2, byte[] bArr) throws MlKitException {
        YuvImage yuvImage = new YuvImage(bArr, 17, i, i2, null);
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                yuvImage.compressToJpeg(new Rect(0, 0, i, i2), 100, byteArrayOutputStream);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                byteArrayOutputStream.close();
                return byteArray;
            } finally {
            }
        } catch (IOException e) {
            throw new MlKitException(13, e, "Image conversion error from NV21 format");
        }
    }

    public static final void Z(Image.Plane plane, int i, int i2, byte[] bArr, int i3, int i5) {
        ByteBuffer buffer = plane.getBuffer();
        buffer.rewind();
        int rowStride = ((plane.getRowStride() + buffer.limit()) - 1) / plane.getRowStride();
        if (rowStride == 0) {
            return;
        }
        int i6 = i / (i2 / rowStride);
        int rowStride2 = 0;
        for (int i21 = 0; i21 < rowStride; i21++) {
            int pixelStride = rowStride2;
            for (int i22 = 0; i22 < i6; i22++) {
                bArr[i3] = buffer.get(pixelStride);
                i3 += i5;
                pixelStride += plane.getPixelStride();
            }
            rowStride2 += plane.getRowStride();
        }
    }

    public static final CompositeClause a(Clause clause) {
        Intrinsics.checkNotNullParameter(clause, "clause");
        int i = R$drawable.uikit_icn_24_chevron_right;
        Integer numValueOf = Integer.valueOf(R$attr.uikit_colorGreyTone50);
        Float fValueOf = Float.valueOf(16.0f);
        return new CompositeClause(zhm.v.k(clause, new ImageClause(i, numValueOf, fValueOf, fValueOf, 16)), null, null, null, 14);
    }

    public static String b(String str, String str2) {
        try {
            byte[] bytes = (str + ":" + str2).getBytes("ISO-8859-1");
            mmm.m.Companion.getClass();
            return "Basic " + mmm.l.e(bytes).a();
        } catch (UnsupportedEncodingException unused) {
            throw new AssertionError();
        }
    }

    public static final ArrayList c(q1 q1Var) {
        Intrinsics.checkNotNullParameter(q1Var, "<this>");
        ImmutableSet<f> immutableSetM6 = q1Var.k.f197513b.m6();
        ArrayList arrayList = new ArrayList();
        for (f fVar : immutableSetM6) {
            nhi.h aVar = fVar instanceof ohi.b ? new pii.a((ohi.b) fVar) : fVar instanceof nhi.f ? (nhi.f) fVar : null;
            if (aVar != null) {
                arrayList.add(aVar);
            }
        }
        ImmutableSet immutableSetL6 = q1Var.k.f197513b.l6();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : immutableSetL6) {
            if (obj2 instanceof nhi.f) {
                arrayList2.add(obj2);
            }
        }
        return d0.E0(arrayList2, arrayList);
    }

    public static final j23.b d(Flow a7, Flow b4) {
        Intrinsics.checkNotNullParameter(a7, "a");
        Intrinsics.checkNotNullParameter(b4, "b");
        return new j23.b(new Flow[]{a7, b4}, 28);
    }

    public static final j23.b e(Flow a7, Flow b4, Flow c2) {
        Intrinsics.checkNotNullParameter(a7, "a");
        Intrinsics.checkNotNullParameter(b4, "b");
        Intrinsics.checkNotNullParameter(c2, "c");
        return new j23.b(new Flow[]{a7, b4, c2}, 29);
    }

    public static final j23.b f(Flow a7, Flow b4, Flow c2, Flow d, Flow e, Flow f, Flow g3, Flow h2, Flow i, Flow j2, Flow k) {
        Intrinsics.checkNotNullParameter(a7, "a");
        Intrinsics.checkNotNullParameter(b4, "b");
        Intrinsics.checkNotNullParameter(c2, "c");
        Intrinsics.checkNotNullParameter(d, "d");
        Intrinsics.checkNotNullParameter(e, "e");
        Intrinsics.checkNotNullParameter(f, "f");
        Intrinsics.checkNotNullParameter(g3, "g");
        Intrinsics.checkNotNullParameter(h2, "h");
        Intrinsics.checkNotNullParameter(i, "i");
        Intrinsics.checkNotNullParameter(j2, "j");
        Intrinsics.checkNotNullParameter(k, "k");
        return new j23.b(new Flow[]{a7, b4, c2, d, e, f, g3, h2, i, j2, k}, 27);
    }

    public static final uf0.b g(Flow a7, Flow b4, Flow c2, Flow d) {
        Intrinsics.checkNotNullParameter(a7, "a");
        Intrinsics.checkNotNullParameter(b4, "b");
        Intrinsics.checkNotNullParameter(c2, "c");
        Intrinsics.checkNotNullParameter(d, "d");
        return new uf0.b(new Flow[]{a7, b4, c2, d}, 0);
    }

    public static final uf0.b h(Flow a7, Flow b4, Flow c2, Flow d, Flow e) {
        Intrinsics.checkNotNullParameter(a7, "a");
        Intrinsics.checkNotNullParameter(b4, "b");
        Intrinsics.checkNotNullParameter(c2, "c");
        Intrinsics.checkNotNullParameter(d, "d");
        Intrinsics.checkNotNullParameter(e, "e");
        return new uf0.b(new Flow[]{a7, b4, c2, d, e}, 1);
    }

    public static final uf0.b i(Flow a7, Flow b4, Flow c2, Flow d, Flow e, Flow f) {
        Intrinsics.checkNotNullParameter(a7, "a");
        Intrinsics.checkNotNullParameter(b4, "b");
        Intrinsics.checkNotNullParameter(c2, "c");
        Intrinsics.checkNotNullParameter(d, "d");
        Intrinsics.checkNotNullParameter(e, "e");
        Intrinsics.checkNotNullParameter(f, "f");
        return new uf0.b(new Flow[]{a7, b4, c2, d, e, f}, 2);
    }

    public static final uf0.b j(Flow a7, Flow b4, Flow c2, Flow d, Flow e, Flow f, Flow g3, Flow h2, Flow i) {
        Intrinsics.checkNotNullParameter(a7, "a");
        Intrinsics.checkNotNullParameter(b4, "b");
        Intrinsics.checkNotNullParameter(c2, "c");
        Intrinsics.checkNotNullParameter(d, "d");
        Intrinsics.checkNotNullParameter(e, "e");
        Intrinsics.checkNotNullParameter(f, "f");
        Intrinsics.checkNotNullParameter(g3, "g");
        Intrinsics.checkNotNullParameter(h2, "h");
        Intrinsics.checkNotNullParameter(i, "i");
        return new uf0.b(new Flow[]{a7, b4, c2, d, e, f, g3, h2, i}, 5);
    }

    public static ByteBuffer k(InputImage inputImage) throws MlKitException {
        int i = inputImage.f49669g;
        int i2 = 0;
        if (i != -1) {
            if (i == 17) {
                return (ByteBuffer) Preconditions.checkNotNull(inputImage.f49667b);
            }
            if (i == 35) {
                return V((Image.Plane[]) Preconditions.checkNotNull(inputImage.k()), inputImage.d, inputImage.e);
            }
            if (i == 842094169) {
                return W((ByteBuffer) Preconditions.checkNotNull(inputImage.f49667b), false);
            }
            throw new MlKitException("Unsupported image format", 13);
        }
        Bitmap bitmapCopy = (Bitmap) Preconditions.checkNotNull(inputImage.f49666a);
        if (bitmapCopy.getConfig() == Bitmap.Config.HARDWARE) {
            bitmapCopy = bitmapCopy.copy(Bitmap.Config.ARGB_8888, bitmapCopy.isMutable());
        }
        Bitmap bitmap = bitmapCopy;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int i3 = width * height;
        int[] iArr = new int[i3];
        bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
        int iCeil = (int) Math.ceil(((double) height) / 2.0d);
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(((iCeil + iCeil) * ((int) Math.ceil(((double) width) / 2.0d))) + i3);
        int i5 = 0;
        int i6 = 0;
        int i21 = 0;
        while (i5 < height) {
            int i22 = i2;
            while (i22 < width) {
                int i32 = iArr[i21];
                int i33 = i32 >> 16;
                int i43 = i32 >> 8;
                int i59 = i32 & 255;
                int i66 = i6 + 1;
                int i74 = i33 & 255;
                int i92 = i43 & 255;
                byteBufferAllocateDirect.put(i6, (byte) Math.min(255, (ehe.n.a(i59, 25, (i92 * 129) + (i74 * 66), 128) >> 8) + 16));
                if (i5 % 2 == 0 && i21 % 2 == 0) {
                    int i96 = ((((i74 * 112) - (i92 * 94)) - (i59 * 18)) + 128) >> 8;
                    int i99 = (((((i74 * (-38)) - (i92 * 74)) + (i59 * 112)) + 128) >> 8) + 128;
                    int i100 = i3 + 1;
                    byteBufferAllocateDirect.put(i3, (byte) Math.min(255, i96 + 128));
                    i3 += 2;
                    byteBufferAllocateDirect.put(i100, (byte) Math.min(255, i99));
                }
                i21++;
                i22++;
                i6 = i66;
            }
            i5++;
            i2 = 0;
        }
        return byteBufferAllocateDirect;
    }

    public static final String l(c0 c0Var) {
        Intrinsics.checkNotNullParameter(c0Var, "<this>");
        if (c0Var instanceof oq9.a0) {
            return ((oq9.a0) c0Var).k;
        }
        if ((c0Var instanceof y) || (c0Var instanceof oq9.z)) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final Pair m(String pocketId, List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(pocketId, "pocketId");
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            Pair pair = (Pair) it8.next();
            fo3.c cVar = (fo3.c) pair.f186385a;
            for (io3.d dVar : (List) pair.f186386b) {
                if (Intrinsics.f(dVar.f163145a, pocketId)) {
                    return new Pair(cVar, dVar);
                }
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.io.Serializable n(kotlinx.coroutines.flow.Flow r4, gim.c r5) {
        /*
            boolean r0 = r5 instanceof nsg.a
            if (r0 == 0) goto L13
            r0 = r5
            nsg.a r0 = (nsg.a) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L18
        L13:
            nsg.a r0 = new nsg.a
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.v
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r5)
            goto L47
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            yhm.o.b(r5)
            nmb.v r5 = new nmb.v
            r2 = 28
            r5.<init>(r2)
            r2 = 0
            jhi.b r4 = mo3.a.g(r4, r2, r5, r3)
            r0.v = r3
            java.lang.Object r5 = vkm.q.x(r4, r0)
            if (r5 != r1) goto L47
            return r1
        L47:
            kotlin.Pair r5 = (kotlin.Pair) r5
            java.lang.Object r4 = r5.f186385a
            fo3.c r4 = (fo3.c) r4
            xi0.b r4 = r4.d
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: yh5.b.n(kotlinx.coroutines.flow.Flow, gim.c):java.io.Serializable");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.io.Serializable o(kotlinx.coroutines.flow.Flow r4, gim.c r5) {
        /*
            boolean r0 = r5 instanceof nsg.b
            if (r0 == 0) goto L13
            r0 = r5
            nsg.b r0 = (nsg.b) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L18
        L13:
            nsg.b r0 = new nsg.b
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.v
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r5)
            goto L47
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            yhm.o.b(r5)
            nmb.v r5 = new nmb.v
            r2 = 29
            r5.<init>(r2)
            r2 = 0
            jhi.b r4 = mo3.a.g(r4, r2, r5, r3)
            r0.v = r3
            java.lang.Object r5 = vkm.q.x(r4, r0)
            if (r5 != r1) goto L47
            return r1
        L47:
            kotlin.Pair r5 = (kotlin.Pair) r5
            java.lang.Object r4 = r5.f186385a
            fo3.c r4 = (fo3.c) r4
            java.lang.Object r5 = r5.f186386b
            java.util.List r5 = (java.util.List) r5
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.Iterator r5 = r5.iterator()
        L57:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L82
            java.lang.Object r0 = r5.next()
            io3.d r0 = (io3.d) r0
            java.lang.String r1 = r0.f163147c
            xi0.b r2 = r4.d
            java.lang.String r2 = r2.f306286a
            boolean r1 = kotlin.jvm.internal.Intrinsics.f(r1, r2)
            if (r1 == 0) goto L57
            io3.i r1 = r0.f163149h
            io3.i r2 = io3.i.INTERNAL
            if (r1 != r2) goto L57
            io3.l r1 = r0.e
            io3.l r2 = io3.l.CURRENT
            if (r1 != r2) goto L57
            io3.k r1 = r0.f
            io3.k r2 = io3.k.ACTIVE
            if (r1 != r2) goto L57
            return r0
        L82:
            java.util.NoSuchElementException r4 = new java.util.NoSuchElementException
            java.lang.String r5 = "Collection contains no element matching the predicate."
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: yh5.b.o(kotlinx.coroutines.flow.Flow, gim.c):java.io.Serializable");
    }

    public static final dj0.d p(dj0.d dVar, Double d) {
        if (d != null) {
            long jDoubleValue = (long) (d.doubleValue() * dVar.f115082a);
            xi0.b.Companion.getClass();
            return new dj0.d(jDoubleValue, xi0.b.z);
        }
        IllegalStateException illegalStateException = new IllegalStateException("Foreign pocket amount cannot be converted to MXN without conversion rate");
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
        return null;
    }

    public static final oq9.o q(String str, String str2, String str3, LinkedHashMap linkedHashMap) {
        if (str == null) {
            throw new NoSuchElementException(str3.concat(" must be specified"));
        }
        oq9.o oVar = (oq9.o) linkedHashMap.get(str);
        return oVar == null ? new oq9.n(str, str2) : oVar;
    }

    public static final int r(i49.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        if (cVar instanceof e40.c) {
            return 0;
        }
        if (cVar instanceof ek8.a) {
            return 1;
        }
        if (cVar instanceof hg8.a) {
            return 2;
        }
        if (cVar instanceof qsi.a) {
            return 3;
        }
        if (cVar instanceof uv9.a) {
            return 4;
        }
        if (cVar instanceof g7k.b) {
            return 5;
        }
        if (cVar instanceof i) {
            return 6;
        }
        if (cVar instanceof kr8.a) {
            return 7;
        }
        if (cVar instanceof g6e.e) {
            return 8;
        }
        if (cVar instanceof i38.a) {
            return 9;
        }
        if (cVar instanceof xld.c) {
            return 10;
        }
        if (cVar instanceof p58.a) {
            return 11;
        }
        if (cVar instanceof hc8.a) {
            return 12;
        }
        if (cVar instanceof s68.a) {
            return 13;
        }
        if (cVar instanceof td8.a) {
            return 14;
        }
        if (cVar instanceof td8.b) {
            return 15;
        }
        if (cVar instanceof xm8.a) {
            return 16;
        }
        if (cVar instanceof gb3.a) {
            return 17;
        }
        if (cVar instanceof uc8.a) {
            return 18;
        }
        return cVar instanceof uc8.b ? 19 : Integer.MAX_VALUE;
    }

    public static final boolean s(j jVar) {
        Intrinsics.checkNotNullParameter(jVar, "<this>");
        String str = jVar.f151691c;
        wi0.b.Companion.getClass();
        wi0.a aVar = wi0.b.Companion;
        if (!Intrinsics.f(str, "GB")) {
            return false;
        }
        Object content = jVar.f151689a.getContent();
        xi0.b.Companion.getClass();
        return Intrinsics.f(content, xi0.b.f306273h.f306286a);
    }

    public static final PricingPlanSwitchToAnnualSavings t(PricingPlanSubscription pricingPlanSubscription) {
        Object next;
        Object next2;
        Intrinsics.checkNotNullParameter(pricingPlanSubscription, "<this>");
        PricingPlanSubscriptionBillingChange pricingPlanSubscriptionBillingChange = pricingPlanSubscription.v;
        if (pricingPlanSubscriptionBillingChange != null) {
            if (pricingPlanSubscriptionBillingChange.f81146b) {
                dj0.d dVar = pricingPlanSubscriptionBillingChange.f81147c;
                String str = pricingPlanSubscriptionBillingChange.d;
                if (dVar != null && str != null) {
                    return new PricingPlanSwitchToAnnualSavings(Double.parseDouble(str), dVar);
                }
            }
        } else if (pricingPlanSubscription.f81140r && pricingPlanSubscription.f81143w && Intrinsics.f(pricingPlanSubscription.d, jli.e.f175845h)) {
            List list = pricingPlanSubscription.i;
            if (list.isEmpty()) {
                list = pricingPlanSubscription.f81129a.f152291h;
            }
            List list2 = list;
            Iterator it8 = list2.iterator();
            while (true) {
                if (!it8.hasNext()) {
                    next = null;
                    break;
                }
                next = it8.next();
                if (Intrinsics.f(((hha.g) next).f152306a, jli.e.f175845h)) {
                    break;
                }
            }
            hha.g gVar = (hha.g) next;
            Iterator it9 = list2.iterator();
            while (true) {
                if (!it9.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it9.next();
                if (Intrinsics.f(((hha.g) next2).f152306a, jli.e.f175842b)) {
                    break;
                }
            }
            hha.g gVar2 = (hha.g) next2;
            if (gVar != null && gVar2 != null) {
                PricingPlanSwitchToAnnualSavings pricingPlanSwitchToAnnualSavingsA = dok.j.a(gVar, gVar2);
                if (pricingPlanSwitchToAnnualSavingsA.f102857b.f115082a > 0) {
                    return pricingPlanSwitchToAnnualSavingsA;
                }
            }
        }
        return null;
    }

    public static final Object u(ue0.c cVar, String key, Type type) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(type, "type");
        try {
            return cVar.T2(key, type);
        } catch (JsonParseException e) {
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, e, h0Var);
            cVar.I0(key);
            return null;
        } catch (IOException e2) {
            h0 h0Var2 = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, e2, h0Var2);
            cVar.I0(key);
            return null;
        }
    }

    public static final boolean v(j jVar) {
        Intrinsics.checkNotNullParameter(jVar, "<this>");
        String str = jVar.f151691c;
        wi0.b.Companion.getClass();
        wi0.a aVar = wi0.b.Companion;
        if (!Intrinsics.f(str, "US")) {
            return false;
        }
        Object content = jVar.f151689a.getContent();
        xi0.b.Companion.getClass();
        return Intrinsics.f(content, xi0.b.i.f306286a);
    }

    public static final boolean w(a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        return aVar != a.FEATURE_UNAVAILABLE;
    }

    public static final boolean x(a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        return aVar == a.ENABLED_AND_ONBOARDED;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r11v6, types: [java.io.Closeable, java.io.FileOutputStream, java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6 */
    public static void y(Context context, String str) throws Throwable {
        kdh.b bVarC;
        String[] strArrH;
        String str2;
        InputStream inputStream;
        InputStream inputStream2;
        ?? r162;
        ?? r112;
        jt0.b bVar = new jt0.b(23);
        if (context == null) {
            throw new IllegalArgumentException("Given context is null");
        }
        if (str.length() == 0) {
            throw new IllegalArgumentException("Given library is either null or empty");
        }
        jt0.b.w0("Beginning load of %s...", str);
        nd.o oVar = (nd.o) bVar.f178266c;
        HashSet hashSet = (HashSet) bVar.f178265b;
        if (hashSet.contains(str)) {
            jt0.b.w0("%s already loaded previously!", str);
            return;
        }
        kdh.b bVar2 = null;
        try {
            oVar.getClass();
            System.loadLibrary(str);
            hashSet.add(str);
            jt0.b.w0("%s (%s) was loaded normally!", str, null);
        } catch (UnsatisfiedLinkError e) {
            jt0.b.w0("Loading the library normally failed: %s", Log.getStackTraceString(e));
            jt0.b.w0("%s (%s) was not loaded normally, re-linking...", str, null);
            ?? T0 = bVar.t0(context, str);
            if (!T0.exists()) {
                boolean z = false;
                File dir = context.getDir("lib", 0);
                File fileT0 = bVar.t0(context, str);
                oVar.getClass();
                File[] fileArrListFiles = dir.listFiles(new sb.a(nd.o.g(str)));
                if (fileArrListFiles != null) {
                    for (File file : fileArrListFiles) {
                        if (!file.getAbsolutePath().equals(fileT0.getAbsolutePath())) {
                            file.delete();
                        }
                    }
                }
                nd.n nVar = (nd.n) bVar.d;
                String[] strArr = Build.SUPPORTED_ABIS;
                if (strArr.length <= 0) {
                    String str3 = Build.CPU_ABI2;
                    strArr = (str3 == null || str3.length() == 0) ? new String[]{Build.CPU_ABI} : new String[]{Build.CPU_ABI, str3};
                }
                String strG = nd.o.g(str);
                nVar.getClass();
                try {
                    bVarC = nd.n.c(context, strArr, strG);
                } catch (Throwable th10) {
                    th = th10;
                }
                try {
                    if (bVarC == null) {
                        try {
                            strArrH = nd.n.h(context, strG);
                        } catch (Exception e2) {
                            strArrH = new String[]{e2.toString()};
                        }
                        StringBuilder sbX = com.google.android.gms.internal.mlkit_vision_face.a.x("Could not find '", strG, "'. Looked for: ");
                        sbX.append(Arrays.toString(strArr));
                        sbX.append(", but only found: ");
                        throw new MissingLibraryException(v0.a.i(sbX, Arrays.toString(strArrH), "."));
                    }
                    ZipFile zipFile = (ZipFile) bVarC.f182899b;
                    int i = 0;
                    while (true) {
                        int i2 = i + 1;
                        if (i < 5) {
                            jt0.b.w0("Found %s! Extracting...", strG);
                            if (T0.exists() || T0.createNewFile()) {
                                try {
                                    inputStream2 = zipFile.getInputStream((ZipEntry) bVarC.f182900c);
                                } catch (FileNotFoundException unused) {
                                    str2 = strG;
                                    inputStream2 = null;
                                } catch (IOException unused2) {
                                    str2 = strG;
                                    inputStream2 = null;
                                } catch (Throwable th11) {
                                    th = th11;
                                    inputStream = null;
                                }
                                try {
                                    ?? fileOutputStream = new FileOutputStream((File) T0);
                                    try {
                                        byte[] bArr = new byte[4096];
                                        long j2 = 0;
                                        ?? r87 = z;
                                        while (true) {
                                            int i3 = inputStream2.read(bArr);
                                            if (i3 == -1) {
                                                break;
                                            }
                                            fileOutputStream.write(bArr, r87, i3);
                                            j2 += (long) i3;
                                            strG = strG;
                                            r87 = 0;
                                        }
                                        fileOutputStream.flush();
                                        fileOutputStream.getFD().sync();
                                        if (j2 == T0.length()) {
                                            nd.n.b(inputStream2);
                                            nd.n.b(fileOutputStream);
                                            T0.setReadable(true, r87);
                                            T0.setExecutable(true, r87);
                                            T0.setWritable(true);
                                            break;
                                        }
                                        nd.n.b(inputStream2);
                                        nd.n.b(fileOutputStream);
                                        str2 = strG;
                                    } catch (FileNotFoundException unused3) {
                                        str2 = strG;
                                        r112 = fileOutputStream;
                                        nd.n.b(inputStream2);
                                        nd.n.b(r112);
                                        strG = str2;
                                        i = i2;
                                        z = false;
                                    } catch (IOException unused4) {
                                        str2 = strG;
                                        r112 = fileOutputStream;
                                        nd.n.b(inputStream2);
                                        nd.n.b(r112);
                                        strG = str2;
                                        i = i2;
                                        z = false;
                                    } catch (Throwable th12) {
                                        th = th12;
                                        inputStream = inputStream2;
                                        r162 = fileOutputStream;
                                        nd.n.b(inputStream);
                                        nd.n.b(r162);
                                        throw th;
                                    }
                                } catch (FileNotFoundException unused5) {
                                    str2 = strG;
                                    r112 = 0;
                                    nd.n.b(inputStream2);
                                    nd.n.b(r112);
                                    strG = str2;
                                    i = i2;
                                    z = false;
                                } catch (IOException unused6) {
                                    str2 = strG;
                                    r112 = 0;
                                    nd.n.b(inputStream2);
                                    nd.n.b(r112);
                                    strG = str2;
                                    i = i2;
                                    z = false;
                                } catch (Throwable th13) {
                                    th = th13;
                                    inputStream = inputStream2;
                                    r162 = 0;
                                    nd.n.b(inputStream);
                                    nd.n.b(r162);
                                    throw th;
                                }
                            } else {
                                str2 = strG;
                            }
                            strG = str2;
                            i = i2;
                            z = false;
                        }
                    }
                    try {
                        zipFile.close();
                        break;
                    } catch (IOException unused7) {
                    }
                } catch (Throwable th14) {
                    th = th14;
                    bVar2 = bVarC;
                    if (bVar2 != null) {
                        try {
                            ((ZipFile) bVar2.f182899b).close();
                        } catch (IOException unused8) {
                        }
                    }
                    throw th;
                }
            }
            String absolutePath = T0.getAbsolutePath();
            oVar.getClass();
            System.load(absolutePath);
            hashSet.add(str);
            jt0.b.w0("%s (%s) was re-linked!", str, null);
        }
    }

    public static Bitmap z(ByteBuffer byteBuffer, int i, int i2, int i3) throws MlKitException {
        byte[] bArrArray;
        if (byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0) {
            bArrArray = byteBuffer.array();
        } else {
            byteBuffer.rewind();
            int iLimit = byteBuffer.limit();
            byte[] bArr = new byte[iLimit];
            byteBuffer.get(bArr, 0, iLimit);
            bArrArray = bArr;
        }
        byte[] bArrY = Y(i, i2, bArrArray);
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrY, 0, bArrY.length);
        return X(i3, bitmapDecodeByteArray.getWidth(), bitmapDecodeByteArray.getHeight(), bitmapDecodeByteArray);
    }
}
