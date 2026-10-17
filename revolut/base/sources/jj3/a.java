package jj3;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.ScrollerNavBarContentView;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.insurance.impl.ui.cfac.claim.supporting_documents.CFACInsuranceSupportingDocumentsScreen;
import com.revolut.feature.pay_later.impl.ui.accountdetails.PayLaterAccountDetailsScreen;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_cancellation.bottom_sheets.terms.EsimMobilePlanCancellationTermsScreen;
import com.revolut.retail.wealth.resources.R$string;
import hx7.q;
import ip0.pb0;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import jfb.v0;
import jj9.f;
import jk4.g;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.reflect.KProperty;
import kotlin.text.Charsets;
import kotlin.text.MatchResult;
import kotlin.text.f0;
import mx0.f3;
import mx0.h3;
import nkm.y;
import od0.i;
import rp0.z;
import zh9.i0;
import zhm.d0;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f174629a;

    public /* synthetic */ a(int i) {
        this.f174629a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object it8) throws UnsupportedEncodingException {
        int i = this.f174629a;
        ScrollerNavBarContentView.b.a aVar = ScrollerNavBarContentView.b.a.f59461a;
        switch (i) {
            case 0:
                Map.Entry entry = (Map.Entry) it8;
                Intrinsics.checkNotNullParameter(entry, "<destruct>");
                String str = (String) entry.getKey();
                String str2 = (String) entry.getValue();
                Charset charset = Charsets.UTF_8;
                String strEncode = URLEncoder.encode(str, charset.name());
                Intrinsics.checkNotNullExpressionValue(strEncode, "encode(...)");
                String strEncode2 = URLEncoder.encode(str2, charset.name());
                Intrinsics.checkNotNullExpressionValue(strEncode2, "encode(...)");
                return com.google.android.gms.internal.mlkit_vision_face.a.o(strEncode, "=", strEncode2);
            case 1:
                ty0.a it9 = (ty0.a) it8;
                KProperty[] kPropertyArr = PayLaterAccountDetailsScreen.i0;
                Intrinsics.checkNotNullParameter(it9, "it");
                return new yx4.b(it9.f275445a, it9.d, null);
            case 2:
                z it10 = (z) it8;
                KProperty[] kPropertyArr2 = PayLaterAccountDetailsScreen.i0;
                Intrinsics.checkNotNullParameter(it10, "it");
                return new yx4.b(it10.f256227a, it10.f256228b, null);
            case 3:
                KProperty[] kPropertyArr3 = PayLaterAccountDetailsScreen.i0;
                Intrinsics.checkNotNullParameter(it8, "it");
                if (it8 instanceof yx4.b) {
                    return (yx4.b) it8;
                }
                return null;
            case 4:
                i it11 = (i) it8;
                Intrinsics.checkNotNullParameter(it11, "it");
                return (i0) it11.f224257a;
            case 5:
                i it12 = (i) it8;
                Intrinsics.checkNotNullParameter(it12, "it");
                return (i0) it12.f224257a;
            case 6:
                Intrinsics.checkNotNullParameter((Function0) it8, "it");
                return f.f174788a;
            case 7:
                Function0 getDefaultLoadingItems = (Function0) it8;
                Intrinsics.checkNotNullParameter(getDefaultLoadingItems, "getDefaultLoadingItems");
                return (List) getDefaultLoadingItems.invoke();
            case 8:
                jjd.a update = (jjd.a) it8;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return jjd.a.a(update, true);
            case 9:
                return jjd.a.a((jjd.a) it8, false);
            case 10:
                LargeActionButtonDelegate.Model model = (LargeActionButtonDelegate.Model) it8;
                KProperty[] kPropertyArr4 = EsimMobilePlanCancellationTermsScreen.R;
                Intrinsics.checkNotNullParameter(model, "model");
                return Boolean.valueOf(Intrinsics.f(model.f52613a, "ID_BUTTON_KEEP_MY_PLAN"));
            case 11:
                LargeActionButtonDelegate.Model model2 = (LargeActionButtonDelegate.Model) it8;
                KProperty[] kPropertyArr5 = EsimMobilePlanCancellationTermsScreen.R;
                Intrinsics.checkNotNullParameter(model2, "model");
                return Boolean.valueOf(Intrinsics.f(model2.f52613a, "ID_BUTTON_PROCEED_WITH_CANCELLATION"));
            case 12:
                g it13 = (g) it8;
                Intrinsics.checkNotNullParameter(it13, "it");
                return it13.e;
            case 13:
                Intrinsics.checkNotNullParameter((Function0) it8, "it");
                return new f3(null, null, null, false, h3.LOADING, false);
            case 14:
                RowDelegate.Model it14 = (RowDelegate.Model) it8;
                KProperty[] kPropertyArr6 = CFACInsuranceSupportingDocumentsScreen.f75113d0;
                Intrinsics.checkNotNullParameter(it14, "it");
                return Boolean.valueOf(Intrinsics.f(it14.f53228a, "ID_ADD_DOCUMENT_ITEM"));
            case 15:
                RowDelegate.Model it15 = (RowDelegate.Model) it8;
                KProperty[] kPropertyArr7 = CFACInsuranceSupportingDocumentsScreen.f75113d0;
                Intrinsics.checkNotNullParameter(it15, "it");
                Object obj2 = it15.u;
                if (obj2 instanceof File) {
                    return (File) obj2;
                }
                return null;
            case 16:
                RowDelegate.Model it16 = (RowDelegate.Model) it8;
                KProperty[] kPropertyArr8 = CFACInsuranceSupportingDocumentsScreen.f75113d0;
                Intrinsics.checkNotNullParameter(it16, "it");
                Object obj3 = it16.u;
                if (obj3 instanceof File) {
                    return (File) obj3;
                }
                return null;
            case 17:
                IntRange intRangeU = t61.a.u((Function0) it8, "it", 1, 2, 1);
                ArrayList arrayList = new ArrayList(w.t(intRangeU, 10));
                vim.f it17 = intRangeU.iterator();
                while (it17.f289625c) {
                    arrayList.add(new pb0(a0.d.n("CurrencyChangerItemLoading.", it17.nextInt())));
                }
                yp0.b.k(arrayList, 0, R$attr.uikit_dp16, 0, 0, 29);
                return arrayList;
            case 18:
                Intrinsics.checkNotNullParameter((Function0) it8, "it");
                return new lw0.a(new TextLocalisedClause(R$string.wealth_invest_currency_changer_title, null, null, 14), null, null, null, false, 30);
            case 19:
                kih.c update2 = (kih.c) it8;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return kih.c.a(update2, null, null, false, 3);
            case 20:
                zm3.a it18 = (zm3.a) it8;
                Intrinsics.checkNotNullParameter(it18, "it");
                return Boolean.valueOf(it18 instanceof zm3.i);
            case 21:
                zm3.a it19 = (zm3.a) it8;
                Intrinsics.checkNotNullParameter(it19, "it");
                return q.v(it19);
            case 22:
                List it20 = (List) it8;
                Intrinsics.checkNotNullParameter(it20, "it");
                return d0.U(it20);
            case 23:
                Pair it21 = (Pair) it8;
                Intrinsics.checkNotNullParameter(it21, "it");
                return Boolean.valueOf(it21.f186386b != null);
            case 24:
                Pair it22 = (Pair) it8;
                Intrinsics.checkNotNullParameter(it22, "it");
                Object obj4 = it22.f186385a;
                Object obj5 = it22.f186386b;
                Intrinsics.h(obj5);
                return new Pair(obj4, obj5);
            case 25:
                MatchResult it23 = (MatchResult) it8;
                Intrinsics.checkNotNullParameter(it23, "it");
                List listC = it23.c();
                return listC.get(v.j(listC) - 1) + y.u(y.y(f0.L0((CharSequence) d0.m0(listC)), new v0(25)), "", null, 62);
            case 26:
                Intrinsics.checkNotNullParameter((Function0) it8, "it");
                return new jme.b(aVar);
            case 27:
                Intrinsics.checkNotNullParameter((Function0) it8, "it");
                return aVar;
            case 28:
                Intrinsics.checkNotNullParameter((Function0) it8, "it");
                return null;
            default:
                Boolean unrecoverable = (Boolean) it8;
                Intrinsics.checkNotNullParameter(unrecoverable, "unrecoverable");
                unrecoverable.booleanValue();
                return unrecoverable;
        }
    }

    public /* synthetic */ a(Object obj2, int i) {
        this.f174629a = i;
    }
}
