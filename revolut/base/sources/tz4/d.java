package tz4;

import a9g.l2;
import android.content.Context;
import android.view.View;
import aw0.o4;
import aw0.o9;
import com.revolut.core.android.R$string;
import com.revolut.core.error.data.model.ServerError;
import com.revolut.core.error.data.model.ServerErrorParams;
import com.revolut.core.ui_kit.gradients.UiKitGradient;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.model.Data;
import com.revolut.feature.apm.multibanco.sdk.proxy.models.results.MBWaySdkError;
import com.revolut.feature.apm.multibanco.sdk.proxy.models.results.MBWaySdkGenericError;
import com.revolut.feature.apm.multibanco.sdk.proxy.models.results.MBWaySdkNoResponse;
import com.revolut.feature.apm.multibanco.sdk.proxy.models.results.MBWaySdkNotHandledError;
import com.revolut.feature.apm.multibanco.sdk.proxy.models.results.MBWaySdkRegistrationNeeded;
import com.revolut.feature.apm.multibanco.sdk.proxy.models.results.MBWaySdkSuspended;
import com.revolut.feature.apm.multibanco.sdk.proxy.models.results.MBWaySdkUnavailable;
import com.revolut.feature.backend_flow.domain.models.CountrySelectionItem;
import com.revolut.feature.backend_flow.domain.models.CountrySelectionOption;
import com.revolut.feature.junior_profile.api.models.JuniorBankingProfile;
import com.revolut.feature.product_article.api.models.ProductArticleKey;
import com.revolut.feature_travel_hotels_models.property.Distance;
import com.revolut.feature_travel_hotels_models.property.Window;
import com.revolut.otp.input.flow.common.OtpInvalidException;
import fim.h;
import gim.i;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Single;
import java.io.EOFException;
import java.time.Duration;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import kotlin.ranges.IntRange;
import kotlinx.coroutines.flow.Flow;
import le.u1;
import mmm.l0;
import net.sf.scuba.smartcards.ISO7816;
import nii.y0;
import nii.z;
import no.f1;
import org.joda.time.LocalTime;
import skm.l;
import t61.j;
import wvg.y1;
import xg0.f;
import xg0.g;
import xg0.k;
import xg0.m;
import xg0.n;
import xg0.o;
import xg0.q;
import xg0.r;
import xg0.t;
import zhm.d0;
import zhm.u;

/* JADX INFO: loaded from: classes22.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static String[] f275868a;

    public static final pt0.a A(o4 o4Var) {
        Intrinsics.checkNotNullParameter(o4Var, "<this>");
        int i = pt0.b.f239570a[o4Var.ordinal()];
        if (i == 1) {
            return new pt0.a(true, false, true, false);
        }
        if (i == 2) {
            return new pt0.a(false, false, false, false);
        }
        if (i == 3) {
            return new pt0.a(true, true, false, true);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final String B(MBWaySdkError mBWaySdkError) {
        String str;
        Intrinsics.checkNotNullParameter(mBWaySdkError, "<this>");
        if (mBWaySdkError instanceof MBWaySdkGenericError) {
            str = "GENERIC";
        } else if (mBWaySdkError instanceof MBWaySdkNoResponse) {
            str = "NO_RESPONSE";
        } else if (mBWaySdkError instanceof MBWaySdkNotHandledError) {
            str = "NOT_HANDLED";
        } else if (mBWaySdkError instanceof MBWaySdkRegistrationNeeded) {
            str = "REGISTRATION_NEEDED";
        } else if (mBWaySdkError instanceof MBWaySdkSuspended) {
            str = "SUSPENDED";
        } else {
            if (!(mBWaySdkError instanceof MBWaySdkUnavailable)) {
                throw new NoWhenBranchMatchedException();
            }
            str = "UNAVAILABLE";
        }
        String f62689a = mBWaySdkError.getF62674a();
        return j6.a.w(v0.a.m("MBWaySdkError(type=", str, ", operation=", f62689a, ", code="), mBWaySdkError.getF62675b(), ", reason=", mBWaySdkError.getF62676c(), ")");
    }

    public static final Clause C(Duration duration) {
        Intrinsics.checkNotNullParameter(duration, "<this>");
        long minutes = duration.toMinutes();
        if (minutes < 0) {
            minutes = 0;
        }
        long j2 = minutes / 60;
        long j3 = minutes % 60;
        aim.e eVarB = u.b();
        if (j2 > 0) {
            eVarB.add(yoj.b.w(new TextClause(String.valueOf(j2), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextLocalisedClause(R$string.date_shortest_hour_format, null, null, 14)));
        }
        if (j3 > 0 || j2 == 0) {
            eVarB.add(yoj.b.w(new TextClause(String.valueOf(j3), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextLocalisedClause(R$string.date_shortest_minute_format, null, null, 14)));
        }
        aim.e eVarA = u.a(eVarB);
        return eVarA.size() == 1 ? (Clause) d0.K0(eVarA) : yoj.b.m(new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), eVarA);
    }

    public static final atc.d a(f01.a uiKitResources, int... keywords) {
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        Intrinsics.checkNotNullParameter(keywords, "keywords");
        return new atc.d(uiKitResources, keywords);
    }

    public static final String b(String str) {
        return j6.a.q("template_intro_", str);
    }

    public static final void c(View[] viewArr, IntRange intRange) {
        int length = viewArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int i3 = i2 + 1;
            viewArr[i].setVisibility((i2 > intRange.f186449b || intRange.f186448a > i2) ? 8 : 0);
            i++;
            i2 = i3;
        }
    }

    public static final String d(y1 y1Var) {
        return "complex_analytics_sector_allocations_" + s.Q(y1Var.f300505b) + "_" + y1Var.f300506c + "_" + y1Var.e.f306286a;
    }

    public static final String e(ProductArticleKey productArticleKey) {
        Intrinsics.checkNotNullParameter(productArticleKey, "<this>");
        String[] elements = {productArticleKey.getProductName(), productArticleKey.getArticleName(), productArticleKey.getArticleVariant()};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return d0.k0(kotlin.collections.d.L(elements), ".", null, null, 0, null, 62);
    }

    public static final Object f(Completable completable, i frame) {
        l lVar = new l(1, h.b(frame));
        lVar.u();
        completable.c(new zjh.c(lVar, 18));
        Object objT = lVar.t();
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        if (objT == aVar) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        return objT == aVar ? objT : Unit.f186387a;
    }

    public static final Object g(Single single, Continuation frame) {
        l lVar = new l(1, h.b(frame));
        lVar.u();
        single.c(new dlm.a(lVar));
        Object objT = lVar.t();
        if (objT == fim.a.COROUTINE_SUSPENDED) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        return objT;
    }

    public static final bq0.c h(UiKitGradient uiKitGradient, Context context) {
        Intrinsics.checkNotNullParameter(uiKitGradient, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        return new bq0.c(uiKitGradient, k(uiKitGradient, context), uiKitGradient.f55828b);
    }

    public static final String i(CountrySelectionItem countrySelectionItem, wi0.b code) {
        Object next;
        Locale locale;
        String str;
        Intrinsics.checkNotNullParameter(countrySelectionItem, "<this>");
        Intrinsics.checkNotNullParameter(code, "code");
        Iterator it8 = countrySelectionItem.d.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (Intrinsics.f(((CountrySelectionOption) next).f63372a.f297794a, code.f297794a)) {
                break;
            }
        }
        CountrySelectionOption countrySelectionOption = (CountrySelectionOption) next;
        if (countrySelectionOption != null && (str = countrySelectionOption.f63373b) != null) {
            return str;
        }
        Locale[] availableLocales = Locale.getAvailableLocales();
        Intrinsics.checkNotNullExpressionValue(availableLocales, "getAvailableLocales(...)");
        int length = availableLocales.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                locale = null;
                break;
            }
            locale = availableLocales[i];
            if (Intrinsics.f(locale.getCountry(), code.f297794a)) {
                break;
            }
            i++;
        }
        if (locale != null) {
            return locale.getDisplayCountry();
        }
        return null;
    }

    public static final String j(com.revolut.feature.junior_profile.api.models.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        if (aVar instanceof JuniorBankingProfile) {
            return ((JuniorBankingProfile) aVar).f77103j;
        }
        if (!(aVar instanceof com.revolut.feature.junior_profile.api.models.c)) {
            throw new NoWhenBranchMatchedException();
        }
        List list = ((com.revolut.feature.junior_profile.api.models.c) aVar).f77119j;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (obj2 instanceof com.revolut.feature.junior_profile.api.models.e) {
                arrayList.add(obj2);
            }
        }
        com.revolut.feature.junior_profile.api.models.e eVar = (com.revolut.feature.junior_profile.api.models.e) d0.d0(arrayList);
        if (eVar != null) {
            return eVar.f77121b;
        }
        return null;
    }

    public static final int[] k(UiKitGradient uiKitGradient, Context context) {
        Intrinsics.checkNotNullParameter(uiKitGradient, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        int[] iArr = uiKitGradient.f55827a;
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i : iArr) {
            arrayList.add(Integer.valueOf(kli.a.s(i, context)));
        }
        return d0.c1(arrayList);
    }

    public static final String l(j jVar) {
        String str = jVar != null ? jVar.f268159b : null;
        return str == null ? "" : str;
    }

    public static final String m(com.revolut.feature.junior_profile.api.models.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        return com.google.android.gms.internal.mlkit_vision_face.a.o(aVar.getF77099b(), " ", aVar.getF77100c());
    }

    public static final String n(g gVar) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        if (gVar instanceof xg0.b) {
            return "availability_request";
        }
        if (gVar instanceof xg0.e) {
            return "install_request";
        }
        if (gVar instanceof f) {
            return "uninstall_request";
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final String o(g gVar) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        if (gVar instanceof xg0.b) {
            int i = f1.f217766a[((xg0.b) gVar).f305459b.ordinal()];
            if (i == 1) {
                return "available";
            }
            if (i == 2) {
                return "unavailable";
            }
            throw new NoWhenBranchMatchedException();
        }
        if (!(gVar instanceof xg0.e)) {
            if (!(gVar instanceof f)) {
                throw new NoWhenBranchMatchedException();
            }
            int i2 = f1.f217767b[((f) gVar).f305463b.ordinal()];
            if (i2 == 1) {
                return "success";
            }
            if (i2 == 2) {
                return "failed";
            }
            throw new NoWhenBranchMatchedException();
        }
        xg0.u uVar = ((xg0.e) gVar).f305461b;
        if (Intrinsics.f(uVar, xg0.s.f305478a)) {
            return "started";
        }
        if (Intrinsics.f(uVar, xg0.l.f305470a)) {
            return "deferred";
        }
        if (uVar instanceof n) {
            return "downloading";
        }
        if (Intrinsics.f(uVar, m.f305471a)) {
            return "downloaded";
        }
        if (Intrinsics.f(uVar, r.f305477a)) {
            return "installing";
        }
        if (Intrinsics.f(uVar, q.f305476a)) {
            return "installed";
        }
        if (uVar instanceof o) {
            return "failed";
        }
        if (uVar instanceof t) {
            return "user_confirmation";
        }
        if (Intrinsics.f(uVar, k.f305469a)) {
            return "cancelled";
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final Long p(g gVar) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        if (gVar instanceof xg0.e) {
            xg0.u uVar = ((xg0.e) gVar).f305461b;
            if (uVar instanceof n) {
                return Long.valueOf(((n) uVar).f305473b);
            }
        }
        return null;
    }

    public static final double q(Distance distance) {
        Intrinsics.checkNotNullParameter(distance, "<this>");
        ufi.a aVar = distance.f97972b;
        double d = distance.f97971a;
        int i = h9g.c.f150248a[aVar.ordinal()];
        if (i == 1) {
            return d;
        }
        if (i == 2) {
            return d * ((double) 1000);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final boolean r(mmm.h hVar) {
        Intrinsics.checkNotNullParameter(hVar, "<this>");
        try {
            l0 l0VarPeek = hVar.peek();
            for (long j2 = 0; j2 < 16; j2++) {
                if (l0VarPeek.J()) {
                    return true;
                }
                l0VarPeek.b(1L);
                mmm.h hVar2 = l0VarPeek.f207283b;
                byte bJ = hVar2.j(0L);
                if ((bJ & ISO7816.INS_CREATE_FILE) == 192) {
                    l0VarPeek.b(2L);
                } else if ((bJ & 240) == 224) {
                    l0VarPeek.b(3L);
                } else if ((bJ & 248) == 240) {
                    l0VarPeek.b(4L);
                }
                int iR = hVar2.r();
                if (Character.isISOControl(iR) && !Character.isWhitespace(iR)) {
                    return false;
                }
            }
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    public static final Flow s(yji.l lVar, Data data) {
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        Intrinsics.checkNotNullParameter(data, "data");
        if (data.getError() instanceof OtpInvalidException) {
            return lVar.X1(new y0(null, new z(new TextLocalisedClause(com.revolut.otp.input.R$string.revolut_sso_login_incorrect_code_title, null, null, 14), new TextLocalisedClause(com.revolut.otp.input.R$string.revolut_sso_login_incorrect_code_description, null, null, 14), null, null, null, null, true, null, null, null, null, null, null, 32508), false, 5));
        }
        if (data.getError() != null) {
            throw new IllegalStateException("Unexpected errors must be handled by a parent flow", data.getError());
        }
        throw new IllegalStateException(("Incorrect state " + data).toString());
    }

    public static final void t(yji.l lVar) {
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        lVar.X1(new y0(null, new z(new TextLocalisedClause(com.revolut.otp.input.R$string.otp_input_sms_error_title, null, null, 14), new TextLocalisedClause(com.revolut.otp.input.R$string.otp_input_sms_error_description_generic, null, null, 14), null, null, null, null, true, null, null, null, null, null, null, 32508), false, 5));
    }

    public static Date u(LocalDate localDate) {
        ZoneId zone = ZoneId.systemDefault();
        Intrinsics.checkNotNullExpressionValue(zone, "systemDefault(...)");
        Intrinsics.checkNotNullParameter(localDate, "<this>");
        Intrinsics.checkNotNullParameter(zone, "zone");
        Date dateFrom = Date.from(localDate.atStartOfDay(zone).toInstant());
        Intrinsics.checkNotNullExpressionValue(dateFrom, "from(...)");
        return dateFrom;
    }

    public static final ServerError v(mf0.b bVar) {
        dj0.d dVar;
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        Integer code = bVar.getCode();
        int iIntValue = code != null ? code.intValue() : 1;
        String message = bVar.getMessage();
        mf0.c params = bVar.getParams();
        ServerErrorParams serverErrorParams = null;
        if (params != null) {
            Intrinsics.checkNotNullParameter(params, "<this>");
            mf0.a amountLacking = params.getAmountLacking();
            if (amountLacking != null) {
                long amount = amountLacking.getAmount();
                String currency = amountLacking.getCurrency();
                xi0.b.Companion.getClass();
                dVar = new dj0.d(amount, xi0.a.a(currency));
            } else {
                dVar = null;
            }
            serverErrorParams = new ServerErrorParams(dVar, params.getCountryCode(), params.getBiometricDisabled(), params.getMaskedEmail(), params.getPreorderId(), params.getCardId(), params.getTitle(), params.getDescription(), params.getAction(), params.getLink(), params.getImage());
        }
        return new ServerError(iIntValue, message, serverErrorParams, bVar.getMethod());
    }

    public static final Window w(l2 l2Var) {
        Intrinsics.checkNotNullParameter(l2Var, "<this>");
        String start = l2Var.getStart();
        LocalTime localTime = start != null ? new LocalTime(start) : null;
        String end2 = l2Var.getEnd();
        return new Window(localTime, end2 != null ? new LocalTime(end2) : null);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Map] */
    public static final lz4.a x(c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        it3.f fVar = (it3.f) u1.v(cVar.getState(), e.f275869a);
        if (fVar == null) {
            return null;
        }
        return new lz4.a(cVar.getApplicationId(), fVar, cVar.getActive(), cVar.getLoanId(), gs3.a.LOAN);
    }

    public static final xel.c y(fyk.n nVar) {
        Intrinsics.checkNotNullParameter(nVar, "<this>");
        wi0.a aVar = wi0.b.Companion;
        String str = nVar.f139041a;
        aVar.getClass();
        wi0.b bVarA = wi0.a.a(str);
        String str2 = nVar.d;
        String str3 = nVar.f139042b;
        String str4 = nVar.f;
        String str5 = nVar.e;
        return new xel.c(bVarA, str2, str3, str4, nVar.f139043c, nVar.f139044g, str5, nVar.f139045h, nVar.i, nVar.f139046j);
    }

    public static final l2 z(Window window) {
        Intrinsics.checkNotNullParameter(window, "<this>");
        LocalTime localTime = window.f98074a;
        String string = localTime != null ? localTime.toString("HH:mm:ss") : null;
        LocalTime localTime2 = window.f98075b;
        return new l2(string, localTime2 != null ? localTime2.toString("HH:mm:ss") : null);
    }
}
