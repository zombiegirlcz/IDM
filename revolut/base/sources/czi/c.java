package czi;

import android.app.Activity;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.animation.AlphaAnimation;
import android.widget.TextView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.camerakit.vision_framework.generated.Mat;
import com.revolut.core.error.data.model.ServerErrorException;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.rev_points.models.RevPoints;
import com.revolut.feature.store.core.api.model.StoreProduct;
import com.revolut.feature.store.core.api.model.StoreProductOption;
import com.revolut.feature.store.core.api.model.StoreProductTerm;
import com.revolut.feature.store.core.api.model.StoreProductVariant;
import com.revolut.feature.store.core.api.model.StoreProductVariantValue;
import com.revolut.feature.tax_residency.api.BackNavigationType;
import com.revolut.feature.transfer.core.models.CountryProfile;
import com.revolut.feature.transfer.core.models.DeFiBalanceSource;
import com.revolut.feature.transfer.core.models.FundingSource;
import com.revolut.feature.transfer.core.models.PocketSource;
import com.revolut.feature.transfer.core.models.SavingsAccount;
import com.revolut.feature.transfer.core.models.WealthPortfolio;
import com.revolut.kompot.R$id;
import com.revolut.kompot.R$layout;
import com.revolut.kompot.common.R$string;
import ehc.g;
import ehc.h;
import ehc.i;
import io.reactivex.exceptions.CompositeException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kl.l;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import kotlin.ranges.IntRange;
import kotlin.reflect.KFunction;
import kotlin.text.a0;
import kotlin.text.y;
import nii.y0;
import nii.z;
import org.joda.time.DateTime;
import pt5.q;
import retrofit2.HttpException;
import x1e.j;
import x1e.s;
import x1e.v;
import xzg.b0;
import yhm.m;
import yhm.n;
import zh9.o;
import zh9.p;
import zh9.r0;
import zhm.w;
import zim.d1;

/* JADX INFO: loaded from: classes10.dex */
public abstract class c {
    public static final boolean A(b2i.b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        return cp5.d.z(bVar.d.f115083b) || cp5.d.z(bVar.f.f115083b);
    }

    public static final boolean B(p pVar) {
        Intrinsics.checkNotNullParameter(pVar, "<this>");
        return C(pVar) || D(pVar) || F(pVar);
    }

    public static final boolean C(p pVar) {
        Intrinsics.checkNotNullParameter(pVar, "<this>");
        return pVar.e == o.OUTSTANDING;
    }

    public static final boolean D(p pVar) {
        Intrinsics.checkNotNullParameter(pVar, "<this>");
        return pVar.e == o.OVERDUE;
    }

    public static final boolean E(p pVar, r0 plan) {
        Intrinsics.checkNotNullParameter(pVar, "<this>");
        Intrinsics.checkNotNullParameter(plan, "plan");
        return F(pVar) && plan.f322336q;
    }

    public static final boolean F(p pVar) {
        Intrinsics.checkNotNullParameter(pVar, "<this>");
        return pVar.e == o.SCHEDULED;
    }

    public static final boolean G(BackNavigationType backNavigationType) {
        Intrinsics.checkNotNullParameter(backNavigationType, "<this>");
        return backNavigationType != BackNavigationType.NONE;
    }

    public static final int H(tim.c cVar, IntRange range) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        Intrinsics.checkNotNullParameter(range, "range");
        boolean zIsEmpty = range.isEmpty();
        int i = range.f186448a;
        if (!zIsEmpty) {
            int i2 = range.f186449b;
            return i2 < Integer.MAX_VALUE ? cVar.e(i, i2 + 1) : i > Integer.MIN_VALUE ? cVar.e(i - 1, i2) + 1 : cVar.c();
        }
        throw new IllegalArgumentException("Cannot get random in empty range: " + range);
    }

    public static final void I(Rect rect, int i, int i2, int i3, int i5) {
        Intrinsics.checkNotNullParameter(rect, "<this>");
        float f = i3 / i;
        float f4 = i5 / i2;
        rect.left = (int) (rect.left * f);
        rect.top = (int) (rect.top * f4);
        rect.right = (int) (rect.right * f);
        rect.bottom = (int) (rect.bottom * f4);
    }

    public static final void J(TextView textView, int i) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, BitmapDescriptorFactory.HUE_RED);
        alphaAnimation.setDuration(200L);
        alphaAnimation.setRepeatCount(1);
        alphaAnimation.setRepeatMode(2);
        alphaAnimation.setAnimationListener(new l(textView, i));
        textView.startAnimation(alphaAnimation);
    }

    public static final int K(int i, int i2) {
        return (i >>> (32 - i2)) & ((-i2) >> 31);
    }

    public static final bk4.d L(zz3.b bVar, String applicationId, r10.f networkUrlBuilder) {
        String string;
        String string2;
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        Intrinsics.checkNotNullParameter(applicationId, "applicationId");
        Intrinsics.checkNotNullParameter(networkUrlBuilder, "networkUrlBuilder");
        int iD = bVar.getRepaymentDay();
        dj0.d dVarO = mo3.a.o(bVar.getMonthlyRepayment());
        String strA = bVar.getHtmlAgreementId();
        String str = "";
        if (strA == null || (string = r10.f.q(networkUrlBuilder, j6.a.s("/credit-application/", applicationId, "/auto-pay/ach-authorization/", strA, "/html")).toString()) == null) {
            m70.a.c(t0.f186434a);
            string = "";
        }
        String strC = bVar.getPdfAgreementId();
        if (strC == null || (string2 = r10.f.q(networkUrlBuilder, j6.a.s("/credit-application/", applicationId, "/auto-pay/ach-authorization/", strC, "/pdf")).toString()) == null) {
            m70.a.c(t0.f186434a);
        } else {
            str = string2;
        }
        return new bk4.d(iD, dVarO, string, str);
    }

    public static final StoreProduct M(j jVar) {
        Object objA;
        LocalDateTime localDateTime;
        v1e.b bVar;
        String str;
        String str2;
        StoreProductVariant storeProductVariant;
        Intrinsics.checkNotNullParameter(jVar, "<this>");
        String str3 = jVar.f302375a;
        String str4 = jVar.f302376b;
        String str5 = jVar.f302377c;
        String str6 = jVar.d;
        if (str6 != null) {
            try {
                m.Companion aVar = m.INSTANCE;
                objA = LocalDateTime.parse(str6);
            } catch (Throwable th10) {
                m.Companion aVar2 = m.INSTANCE;
                objA = yhm.o.a(th10);
            }
            if (objA instanceof n) {
                objA = null;
            }
            localDateTime = (LocalDateTime) objA;
        } else {
            localDateTime = null;
        }
        String str7 = jVar.e;
        String str8 = jVar.f;
        Integer num = jVar.f302378g;
        String str9 = jVar.f302379h;
        v1e.b[] bVarArrValues = v1e.b.values();
        int length = bVarArrValues.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                bVar = null;
                break;
            }
            bVar = bVarArrValues[i];
            if (a0.z(bVar.name(), str9, true)) {
                break;
            }
            i++;
        }
        if (bVar == null) {
            bVar = v1e.b.UNKNOWN;
        }
        v1e.b bVar2 = bVar;
        boolean z = jVar.i;
        boolean z3 = jVar.f302383n;
        List<x1e.m> list = jVar.f302380j;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        for (x1e.m mVar : list) {
            Double dK = y.k(mVar.f302387c);
            RevPoints revPointsA = dK != null ? qvb.a.a(dK.doubleValue()) : null;
            if (revPointsA == null) {
                throw new IllegalArgumentException(("points value is invalid: " + revPointsA).toString());
            }
            arrayList.add(new StoreProductOption(mVar.f302386b, revPointsA, mVar.f302385a));
            localDateTime = localDateTime;
        }
        LocalDateTime localDateTime2 = localDateTime;
        List<x1e.p> list2 = jVar.k;
        ArrayList arrayList2 = new ArrayList(w.t(list2, 10));
        for (x1e.p pVar : list2) {
            arrayList2.add(new StoreProductTerm(pVar.f302389a, pVar.f302390b));
        }
        s sVar = jVar.f302381l;
        if (sVar != null) {
            String str10 = sVar.f302393a;
            List list3 = sVar.f302394b;
            ArrayList arrayList3 = new ArrayList(w.t(list3, 10));
            Iterator it8 = list3.iterator();
            while (it8.hasNext()) {
                v vVar = (v) it8.next();
                arrayList3.add(new StoreProductVariantValue(vVar.f302396a, vVar.f302398c, vVar.f302397b));
                it8 = it8;
                str3 = str3;
                str4 = str4;
            }
            str = str3;
            str2 = str4;
            storeProductVariant = new StoreProductVariant(str10, arrayList3);
        } else {
            str = str3;
            str2 = str4;
            storeProductVariant = null;
        }
        return new StoreProduct(str, str2, str5, localDateTime2, str7, str8, num, bVar2, z, z3, arrayList, arrayList2, storeProductVariant, jVar.f302382m);
    }

    public static final ArrayList N(List list) {
        cgc.c cVar;
        cgc.o oVar;
        Intrinsics.checkNotNullParameter(list, "<this>");
        ArrayList arrayList = new ArrayList();
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            i iVar = (i) it8.next();
            String strF = iVar.getSubscriberAccountType();
            cgc.o[] oVarArrValues = cgc.o.values();
            int length = oVarArrValues.length;
            int i = 0;
            while (true) {
                cVar = null;
                if (i >= length) {
                    oVar = null;
                    break;
                }
                oVar = oVarArrValues[i];
                if (a0.z(oVar.name(), strF, true)) {
                    break;
                }
                i++;
            }
            if (oVar != null) {
                boolean zB = iVar.getAvailable();
                ehc.j jVarE = iVar.getMerchant();
                Intrinsics.checkNotNullParameter(jVarE, "<this>");
                cgc.l lVar = new cgc.l(jVarE.getId(), jVarE.getName(), jVarE.getLogo());
                h hVarD = iVar.getDescription();
                Intrinsics.checkNotNullParameter(hVarD, "<this>");
                cgc.j jVar = new cgc.j(hVarD.getBrief(), hVarD.getNormal(), hVarD.getVerbose(), hVarD.getPicture());
                g gVarA = iVar.getAction();
                Intrinsics.checkNotNullParameter(gVarA, "<this>");
                cVar = new cgc.c(oVar, zB, lVar, jVar, new cgc.e(gVarA.getType(), gVarA.getPerkId()), iVar.getCategories());
            }
            if (cVar != null) {
                arrayList.add(cVar);
            }
        }
        return arrayList;
    }

    public static final kl7.r0 O(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return a0.H(str, "image/", false) ? kl7.r0.IMAGE : str.equals("application/pdf") ? kl7.r0.PDF : kl7.r0.OTHER;
    }

    /* JADX WARN: Removed duplicated region for block: B:72:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0198  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final hh0.b P(com.google.firebase.messaging.RemoteMessage r38) {
        /*
            Method dump skipped, instruction units count: 519
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: czi.c.P(com.google.firebase.messaging.RemoteMessage):hh0.b");
    }

    public static final Integer Q(BackNavigationType backNavigationType) {
        Intrinsics.checkNotNullParameter(backNavigationType, "<this>");
        int i = lpe.a.f198993a[backNavigationType.ordinal()];
        if (i == 1) {
            return Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow);
        }
        if (i == 2) {
            return Integer.valueOf(R$drawable.uikit_icn_24_cross);
        }
        if (i == 3) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final ResourceImage R(BackNavigationType backNavigationType) {
        Intrinsics.checkNotNullParameter(backNavigationType, "<this>");
        Integer numQ = Q(backNavigationType);
        if (numQ == null) {
            return null;
        }
        return new ResourceImage(numQ.intValue(), (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254);
    }

    public static final qk.d S(FundingSource fundingSource) {
        Intrinsics.checkNotNullParameter(fundingSource, "<this>");
        if (fundingSource instanceof PocketSource) {
            String str = fundingSource.f92240a;
            CountryProfile countryProfile = ((PocketSource) fundingSource).f;
            return new prf.b(str, countryProfile != null ? countryProfile.f92231a : null);
        }
        if (fundingSource instanceof WealthPortfolio) {
            String str2 = fundingSource.f92241b.f306286a;
            WealthPortfolio wealthPortfolio = (WealthPortfolio) fundingSource;
            String str3 = wealthPortfolio.d;
            CountryProfile countryProfile2 = wealthPortfolio.f92264h;
            return new prf.d(str2, str3, countryProfile2 != null ? countryProfile2.f92231a : null);
        }
        if (!(fundingSource instanceof SavingsAccount)) {
            if (fundingSource instanceof DeFiBalanceSource) {
                throw new IllegalStateException("DeFi is not supported as a transfer funding source");
            }
            throw new NoWhenBranchMatchedException();
        }
        SavingsAccount savingsAccount = (SavingsAccount) fundingSource;
        String str4 = savingsAccount.e;
        String str5 = savingsAccount.f92243g.f115083b.f306286a;
        CountryProfile countryProfile3 = savingsAccount.f92246l;
        return new prf.c(str4, str5, countryProfile3 != null ? countryProfile3.f92231a : null);
    }

    public static final uki.a a(int i, uki.b model, uki.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        Intrinsics.checkNotNullParameter(model, "model");
        return new uki.a(i, model, cVar);
    }

    public static final yki.e b(yki.f fVar, yki.g model, int i, Function1 function1) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        Intrinsics.checkNotNullParameter(model, "model");
        return new yki.e(i, 48, function1, fVar, model);
    }

    public static ski.c c(ski.a aVar, int i, ski.b model) {
        int i2 = R$layout.flow_scroller_item_container;
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Intrinsics.checkNotNullParameter(model, "model");
        return new ski.c(aVar, i2, model, i);
    }

    public static /* synthetic */ yki.e d(int i, int i2, Function1 function1, yki.f fVar, yki.g gVar) {
        if ((i2 & 2) != 0) {
            i = R$id.container;
        }
        if ((i2 & 4) != 0) {
            function1 = null;
        }
        return b(fVar, gVar, i, function1);
    }

    public static Object e(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() != 0) {
            return creator.createFromParcel(parcel);
        }
        return null;
    }

    public static final String f(String str) {
        return j6.a.q("eligibility_", str);
    }

    public static final b0 g(q0h.m mVar) {
        int i = q9h.d.f243900b[mVar.ordinal()];
        if (i == 1) {
            return b0.ONE_DAY;
        }
        if (i == 2) {
            return b0.ONE_WEEK;
        }
        if (i == 3) {
            return b0.ONE_MONTH;
        }
        if (i == 4) {
            return b0.ONE_YEAR;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final void h(int i, int i2) {
        if (i2 > i) {
            return;
        }
        Integer from = Integer.valueOf(i);
        Integer until = Integer.valueOf(i2);
        Intrinsics.checkNotNullParameter(from, "from");
        Intrinsics.checkNotNullParameter(until, "until");
        throw new IllegalArgumentException(("Random range is empty: [" + from + ", " + until + ").").toString());
    }

    public static final int i(int i) {
        return 31 - Integer.numberOfLeadingZeros(i);
    }

    public static final fbm.c j(Function1 selector, Function1 predicate) {
        Intrinsics.checkNotNullParameter(selector, "selector");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        return new fbm.c(selector, predicate);
    }

    public static final c2m.b k(Function1... functions) {
        Intrinsics.checkNotNullParameter(functions, "functions");
        return new c2m.b(functions, 2);
    }

    public static final void l(yji.l lVar, Throwable throwable) {
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.b(rd0.c.ERROR, null, "request failed", throwable, null, 18);
        TextLocalisedClause title = new TextLocalisedClause(R$string.common_error_state_title, null, null, 14);
        Intrinsics.checkNotNullParameter(title, "title");
        lVar.X1(new y0(null, new z(title, null, null, null, null, null, true, null, null, null, null, null, null, 32468), false, 5));
    }

    public static final double[] m(Mat mat, int i) {
        Intrinsics.checkNotNullParameter(mat, "<this>");
        int i2 = 0;
        ArrayList<Double> arrayList = mat.getDouble(0, i);
        Intrinsics.checkNotNullExpressionValue(arrayList, "getDouble(...)");
        Intrinsics.checkNotNullParameter(arrayList, "<this>");
        double[] dArr = new double[arrayList.size()];
        Iterator<Double> it8 = arrayList.iterator();
        while (it8.hasNext()) {
            dArr[i2] = it8.next().doubleValue();
            i2++;
        }
        return dArr;
    }

    public static final DateTime n(p pVar) {
        Intrinsics.checkNotNullParameter(pVar, "<this>");
        DateTime dateTime = pVar.f;
        return dateTime == null ? pVar.f322317b : dateTime;
    }

    public static final u45.h o(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "<this>");
        phm.a aVar = (phm.a) ue0.e.j(activity).a().get(u45.h.class);
        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
        if (aVar2 != null) {
            return (u45.h) aVar2.b();
        }
        throw new IllegalStateException(a0.d.q("Api ", u45.h.class, " is not found"));
    }

    public static final String p(FundingSource fundingSource) {
        Intrinsics.checkNotNullParameter(fundingSource, "<this>");
        if (fundingSource instanceof PocketSource) {
            return ((PocketSource) fundingSource).d.f163145a;
        }
        if (fundingSource instanceof SavingsAccount) {
            return ((SavingsAccount) fundingSource).f;
        }
        if ((fundingSource instanceof WealthPortfolio) || (fundingSource instanceof DeFiBalanceSource)) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final dj0.d q(p pVar) {
        Intrinsics.checkNotNullParameter(pVar, "<this>");
        return pyd.c.O(pyd.c.O(pVar.i, pVar.f322320h), pVar.k);
    }

    public static final q r(qua.p pVar, String id10) {
        Intrinsics.checkNotNullParameter(pVar, "<this>");
        Intrinsics.checkNotNullParameter(id10, "id");
        int iHashCode = id10.hashCode();
        if (iHashCode != -1770978505) {
            if (iHashCode != -846300744) {
                if (iHashCode == -84182801 && id10.equals("ORDERS_MAPPER_SWIPE_ACTION_ID_DELETE")) {
                    return new pt5.o(pVar);
                }
                return null;
            }
            if (!id10.equals("ORDERS_MAPPER_SWIPE_ACTION_ID_DEACTIVATE")) {
                return null;
            }
        } else if (!id10.equals("ORDERS_MAPPER_SWIPE_ACTION_ID_ACTIVATE")) {
            return null;
        }
        return new pt5.p(pVar);
    }

    public static final dj0.d s(p pVar) {
        Intrinsics.checkNotNullParameter(pVar, "<this>");
        return pyd.c.O(pyd.c.O(pVar.f322318c, pVar.d), pVar.f322321j);
    }

    public static final String t(FundingSource fundingSource) {
        Intrinsics.checkNotNullParameter(fundingSource, "<this>");
        if (fundingSource instanceof PocketSource) {
            return fundingSource.f92240a;
        }
        if (fundingSource instanceof WealthPortfolio) {
            return null;
        }
        if (fundingSource instanceof SavingsAccount) {
            return ((SavingsAccount) fundingSource).f;
        }
        if (fundingSource instanceof DeFiBalanceSource) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final dj0.d u(p pVar) {
        Intrinsics.checkNotNullParameter(pVar, "<this>");
        return pyd.c.H(pVar.f322321j, pVar.k);
    }

    public static final dj0.d v(p pVar) {
        Intrinsics.checkNotNullParameter(pVar, "<this>");
        return pyd.c.H(s(pVar), q(pVar));
    }

    public static final ArrayList w(KFunction kFunction) {
        Intrinsics.checkNotNullParameter(kFunction, "<this>");
        List parameters = kFunction.getParameters();
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : parameters) {
            if (((d1) ((wim.m) obj2)).f322623c == wim.l.VALUE) {
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }

    public static final boolean x(int i, Throwable th10) {
        if (!(th10 instanceof CompositeException)) {
            if ((th10 instanceof ServerErrorException) && ((ServerErrorException) th10).e == i) {
                return true;
            }
            return (th10 instanceof HttpException) && ((HttpException) th10).code() == i;
        }
        List list = ((CompositeException) th10).f163108a;
        Intrinsics.checkNotNullExpressionValue(list, "getExceptions(...)");
        List<Throwable> list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return false;
        }
        for (Throwable th11 : list2) {
            if ((th11 instanceof ServerErrorException) && ((ServerErrorException) th11).e == i) {
                return true;
            }
            if ((th11 instanceof HttpException) && ((HttpException) th11).code() == i) {
                return true;
            }
        }
        return false;
    }

    public static final boolean y(b2i.b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        return cp5.d.y(bVar.d.f115083b) || cp5.d.y(bVar.f.f115083b);
    }

    public static final boolean z(b2i.b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        return A(bVar) || y(bVar);
    }
}
