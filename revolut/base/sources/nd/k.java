package nd;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import aw0.o9;
import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.common.internal.Preconditions;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.exchange.models.ExchangeOrder;
import com.revolut.feature.exchange.models.ExchangeOrderInfo;
import com.revolut.feature.sca_prompt.impl.R$string;
import com.revolut.retail.feature.esim.api.model.EsimPhoneNumberPortingAttributesValidation;
import com.revolut.shared.feature.market_data.models.domain.models.ChargeBreakdown;
import d9.e1;
import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.MathContext;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.security.Provider;
import java.security.Signature;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import org.json.JSONException;
import org.json.JSONObject;
import ro0.b0;
import sgm.e3;
import ulm.c1;
import zc.y;
import zhm.d0;

/* JADX INFO: loaded from: classes17.dex */
public final class k implements q, zc.n, ce.f, kotlin.coroutines.f, vh.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f214264a;

    public /* synthetic */ k(int i) {
        this.f214264a = i;
    }

    public static void c(x2m.f fVar, Activity activity) throws PackageManager.NameNotFoundException {
        Integer numA;
        ActivityManager.TaskDescription taskDescriptionBuild;
        PackageManager packageManager = activity.getPackageManager();
        if (packageManager == null || (numA = vc.o.a(fVar.a())) == null) {
            return;
        }
        int iIntValue = numA.intValue();
        ApplicationInfo applicationInfo = packageManager.getApplicationInfo(activity.getPackageName(), 0);
        Intrinsics.checkNotNullExpressionValue(applicationInfo, "getApplicationInfo(...)");
        String string = packageManager.getApplicationLabel(applicationInfo).toString();
        if (Build.VERSION.SDK_INT < 33) {
            taskDescriptionBuild = new ActivityManager.TaskDescription(string, applicationInfo.icon, iIntValue);
        } else {
            taskDescriptionBuild = b0.a().setLabel(string).setIcon(applicationInfo.icon).setPrimaryColor(iIntValue).build();
            Intrinsics.h(taskDescriptionBuild);
        }
        activity.setTaskDescription(taskDescriptionBuild);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x005f A[Catch: UnsupportedEncodingException -> 0x0062, TRY_LEAVE, TryCatch #0 {UnsupportedEncodingException -> 0x0062, blocks: (B:6:0x0021, B:18:0x005f, B:14:0x0045, B:16:0x005b, B:9:0x0036, B:11:0x003f), top: B:24:0x0021, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static nd.k d(java.lang.String r13) {
        /*
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r13)
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r13)
            java.lang.String r0 = "\\."
            r1 = -1
            java.lang.String[] r0 = r13.split(r0, r1)
            int r1 = r0.length
            r2 = 2
            java.lang.String r3 = "FirebaseAppCheck"
            r4 = 0
            if (r1 >= r2) goto L1e
            java.lang.String r0 = "Invalid token (too few subsections):\n"
            java.lang.String r0 = r0.concat(r13)
            java.util.Map r0 = java.util.Collections.EMPTY_MAP
            goto L74
        L1e:
            r1 = 1
            r0 = r0[r1]
            java.lang.String r1 = new java.lang.String     // Catch: java.io.UnsupportedEncodingException -> L62
            r2 = 11
            byte[] r0 = android.util.Base64.decode(r0, r2)     // Catch: java.io.UnsupportedEncodingException -> L62
            java.lang.String r2 = "UTF-8"
            r1.<init>(r0, r2)     // Catch: java.io.UnsupportedEncodingException -> L62
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch: java.io.UnsupportedEncodingException -> L62
            if (r0 == 0) goto L36
        L34:
            r0 = r4
            goto L5d
        L36:
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Exception -> L44
            r0.<init>(r1)     // Catch: java.lang.Exception -> L44
            java.lang.Object r1 = org.json.JSONObject.NULL     // Catch: java.lang.Exception -> L44
            if (r0 == r1) goto L34
            androidx.collection.ArrayMap r0 = ta6.a.Y(r0)     // Catch: java.lang.Exception -> L44
            goto L5d
        L44:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.io.UnsupportedEncodingException -> L62
            java.lang.String r2 = "Failed to parse JSONObject into Map:\n"
            r1.<init>(r2)     // Catch: java.io.UnsupportedEncodingException -> L62
            r1.append(r0)     // Catch: java.io.UnsupportedEncodingException -> L62
            java.lang.String r0 = r1.toString()     // Catch: java.io.UnsupportedEncodingException -> L62
            r1 = 3
            boolean r1 = android.util.Log.isLoggable(r3, r1)     // Catch: java.io.UnsupportedEncodingException -> L62
            if (r1 == 0) goto L5b
        L5b:
            java.util.Map r0 = java.util.Collections.EMPTY_MAP     // Catch: java.io.UnsupportedEncodingException -> L62
        L5d:
            if (r0 != 0) goto L74
            java.util.Map r0 = java.util.Collections.EMPTY_MAP     // Catch: java.io.UnsupportedEncodingException -> L62
            goto L74
        L62:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Unable to decode token (charset unknown):\n"
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.util.Map r0 = java.util.Collections.EMPTY_MAP
        L74:
            java.lang.String r1 = "iat"
            long r1 = g(r1, r0)
            java.lang.String r3 = "exp"
            long r3 = g(r3, r0)
            long r3 = r3 - r1
            r5 = 1000(0x3e8, double:4.94E-321)
            long r9 = r3 * r5
            nd.k r7 = new nd.k
            long r11 = r1 * r5
            r8 = r13
            r7.<init>(r8, r9, r11)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: nd.k.d(java.lang.String):nd.k");
    }

    public static k e(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            return new k(jSONObject.getString("token"), jSONObject.getLong("expiresIn"), jSONObject.getLong("receivedAt"));
        } catch (JSONException e) {
            String str2 = "Could not deserialize token: " + e.getMessage();
            return null;
        }
    }

    public static nw.b f(String str) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(new URL(str).openConnection()));
        httpURLConnection.setRequestMethod("GET");
        httpURLConnection.connect();
        return new nw.b(httpURLConnection);
    }

    public static long g(String str, Map map) {
        Preconditions.checkNotNull(map);
        Preconditions.checkNotEmpty(str);
        Integer num = (Integer) map.get(str);
        if (num == null) {
            return 0L;
        }
        return num.longValue();
    }

    public static void h(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
    }

    public static void k() {
        StackTraceElement stackTraceElement = new Exception().getStackTrace()[2];
        StringBuilder sb6 = new StringBuilder();
        String className = stackTraceElement.getClassName();
        Intrinsics.checkNotNullExpressionValue(className, "lastStacktrace.className");
        sb6.append((String) d0.m0(kotlin.text.d0.m0(className, new char[]{CoreConstants.DOT}, 6)));
        sb6.append(": ");
        sb6.append(stackTraceElement.getMethodName());
        h(sb6.toString());
    }

    public static b2i.b l(ExchangeOrder order, mha.k kVar, ChargeBreakdown chargeBreakdown) {
        dj0.d dVarL;
        dj0.d dVar;
        Intrinsics.checkNotNullParameter(order, "order");
        ExchangeOrderInfo f72134a = order.getF72134a();
        dj0.d dVarK = f72134a.f72140g;
        double d = f72134a.f72141h;
        xi0.b bVar = f72134a.f;
        xi0.b bVar2 = dVarK.f115083b;
        xi0.b bVar3 = f72134a.e;
        b2i.a aVar = Intrinsics.f(bVar2, bVar3) ? b2i.a.PRECISE : b2i.a.ESTIMATED;
        xi0.b bVar4 = dVarK.f115083b;
        xi0.b bVar5 = dVarK.f115083b;
        if (Intrinsics.f(bVar4, bVar3)) {
            dVar = dVarK;
        } else {
            BigDecimal bigDecimal = new BigDecimal(String.valueOf(d));
            if (e1.I(bigDecimal)) {
                r6.b.D("The target rate should not be zero");
                dj0.d.Companion.getClass();
                dVarL = dj0.d.c(dj0.d.e, 0L, bVar3, 1);
            } else {
                dj0.d dVar2 = f72134a.f72140g;
                BigDecimal bigDecimalDivide = BigDecimal.ONE.divide(bigDecimal, MathContext.DECIMAL128);
                Intrinsics.checkNotNullExpressionValue(bigDecimalDivide, "divide(...)");
                dVarL = pyd.c.L(dVar2, bigDecimalDivide, bVar3);
            }
            dVar = dVarL;
        }
        b2i.a aVar2 = Intrinsics.f(bVar5, bVar) ? b2i.a.PRECISE : b2i.a.ESTIMATED;
        if (!Intrinsics.f(bVar5, bVar)) {
            dVarK = pyd.c.K(dVarK, d, bVar);
        }
        return new b2i.b(f72134a.f72139c, f72134a.d, f72134a.f72141h, dVar, aVar, dVarK, aVar2, null, null, chargeBreakdown, kVar, null, null, null, false, null, null, null, false, null, null, false, 8378752);
    }

    @Override // zc.o
    public /* synthetic */ Object a() {
        return new y("StandardIntegrity");
    }

    @Override // vh.d
    public yh.b b(String str, vh.a aVar, int i, int i2, aim.f fVar) {
        vh.d gVar;
        switch (vh.c.f289265a[aVar.ordinal()]) {
            case 1:
                gVar = new ci.g(1);
                break;
            case 2:
                gVar = new ci.g(2);
                break;
            case 3:
                gVar = new ci.g(0);
                break;
            case 4:
                gVar = new zjh.i(15);
                break;
            case 5:
                gVar = new dcl.q();
                break;
            case 6:
                gVar = new ci.h(2);
                break;
            case 7:
                gVar = new ci.h(3);
                break;
            case 8:
                gVar = new ci.h(1);
                break;
            case 9:
                gVar = new ci.h(0);
                break;
            case 10:
                gVar = new p96.a(8);
                break;
            case 11:
                gVar = new ci.b();
                break;
            case 12:
                gVar = new qy5.a(1);
                break;
            case 13:
                gVar = new o();
                break;
            default:
                throw new IllegalArgumentException("No encoder available for format ".concat(String.valueOf(aVar)));
        }
        return gVar.b(str, aVar, i, i2, fVar);
    }

    public Clause i(String id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        int i = xrc.a.f308320a[msc.a.a(id10).ordinal()];
        if (i == 1) {
            return new TextLocalisedClause(R$string.trusted_beneficiaries_entities_rdael_full_name, null, null, 14);
        }
        if (i == 2) {
            return new TextLocalisedClause(R$string.trusted_beneficiaries_entities_rseuab_full_name, null, null, 14);
        }
        if (i == 3) {
            return new TextLocalisedClause(R$string.trusted_beneficiaries_entities_revolut_ltd_full_name, null, null, 14);
        }
        if (i == 4) {
            return new TextLocalisedClause(R$string.trusted_beneficiaries_entities_revolut_trading_ltd_full_name, null, null, 14);
        }
        if (i != 5) {
            throw new NoWhenBranchMatchedException();
        }
        m70.a.c(t0.f186434a);
        return new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
    }

    public Clause j(String id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        int i = xrc.a.f308320a[msc.a.a(id10).ordinal()];
        if (i == 1) {
            return new TextLocalisedClause(R$string.trusted_beneficiaries_entities_rdael_short_name, null, null, 14);
        }
        if (i == 2) {
            return new TextLocalisedClause(R$string.trusted_beneficiaries_entities_rseuab_short_name, null, null, 14);
        }
        if (i == 3) {
            return new TextLocalisedClause(R$string.trusted_beneficiaries_entities_revolut_ltd_short_name, null, null, 14);
        }
        if (i == 4) {
            return new TextLocalisedClause(R$string.trusted_beneficiaries_entities_revolut_trading_ltd_short_name, null, null, 14);
        }
        if (i != 5) {
            throw new NoWhenBranchMatchedException();
        }
        m70.a.c(t0.f186434a);
        return new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
    }

    @Override // ce.f
    public Object m(ce.v vVar) {
        return new rh.h((ch.h) vVar.a(ch.h.class));
    }

    public efm.r n(List files, Function1 uploadCompletable) {
        Intrinsics.checkNotNullParameter(files, "files");
        Intrinsics.checkNotNullParameter(uploadCompletable, "uploadCompletable");
        ihm.j jVarD = new ihm.b().d();
        Intrinsics.checkNotNullExpressionValue(jVarD, "toSerialized(...)");
        nrd.g bytesWritten = new nrd.g(jVarD, 27);
        c1 c1Var = new c1(0);
        c1Var.f(okhttp3.c.f226117n);
        Iterator it8 = files.iterator();
        while (it8.hasNext()) {
            File file = (File) it8.next();
            String name = file.getName();
            Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
            String name2 = file.getName();
            Intrinsics.checkNotNullParameter(file, "file");
            Intrinsics.checkNotNullParameter(bytesWritten, "bytesWritten");
            c1Var.b(name, name2, new j21.b(m31.c.a(file), bytesWritten));
        }
        pfm.r completable = te0.w.g0((efm.b) uploadCompletable.invoke(c1Var.e()));
        Intrinsics.checkNotNullParameter(jVarD, "<this>");
        Intrinsics.checkNotNullParameter(completable, "completable");
        efm.r rVarTakeUntil = jVarD.takeUntil(completable.g(efm.r.just(Unit.f186387a)));
        Intrinsics.checkNotNullExpressionValue(rVarTakeUntil, "takeUntil(...)");
        return rVarTakeUntil;
    }

    public boolean o(mlj.i userInput) {
        Intrinsics.checkNotNullParameter(userInput, "userInput");
        EsimPhoneNumberPortingAttributesValidation esimPhoneNumberPortingAttributesValidation = userInput.f206988c;
        String str = userInput.f206986a;
        if (esimPhoneNumberPortingAttributesValidation == null) {
            return true;
        }
        boolean z = esimPhoneNumberPortingAttributesValidation.d;
        String strA = userInput.f206987b != null ? olj.a.a(kotlin.text.d0.F0(str).toString()) : kotlin.text.d0.F0(str).toString();
        if (z && strA.length() == 0) {
            return false;
        }
        if (!z && strA.length() == 0) {
            return true;
        }
        Long l2 = esimPhoneNumberPortingAttributesValidation.f100342a;
        if (l2 != null) {
            if (strA.length() < l2.longValue()) {
                return false;
            }
        }
        Long l3 = esimPhoneNumberPortingAttributesValidation.f100343b;
        if (l3 != null) {
            if (strA.length() > l3.longValue()) {
                return false;
            }
        }
        String str2 = esimPhoneNumberPortingAttributesValidation.f100344c;
        return str2 == null || ch.qos.logback.core.util.a.x(str2, strA);
    }

    public k(olj.a phoneNumberPortingUserInputMasker) {
        this.f214264a = 4;
        Intrinsics.checkNotNullParameter(phoneNumberPortingUserInputMasker, "phoneNumberPortingUserInputMasker");
    }

    @Override // nd.q
    public Object a(String str, Provider provider) {
        switch (this.f214264a) {
            case 0:
                return provider == null ? Cipher.getInstance(str) : Cipher.getInstance(str, provider);
            default:
                return provider == null ? Signature.getInstance(str) : Signature.getInstance(str, provider);
        }
    }

    public k(r10.r wealthMarginBorrowingStatusInteractor, x8h.k displayCurrencyInteractor) {
        this.f214264a = 18;
        Intrinsics.checkNotNullParameter(wealthMarginBorrowingStatusInteractor, "wealthMarginBorrowingStatusInteractor");
        Intrinsics.checkNotNullParameter(displayCurrencyInteractor, "displayCurrencyInteractor");
    }

    public k(q4j.c nameElementsUtils) {
        this.f214264a = 6;
        Intrinsics.checkNotNullParameter(nameElementsUtils, "nameElementsUtils");
    }

    public k(e3 juniorTransferRequestInteractor) {
        this.f214264a = 22;
        Intrinsics.checkNotNullParameter(juniorTransferRequestInteractor, "juniorTransferRequestInteractor");
    }

    public k(s7j.b commodityOrderIntroChartMapper, s7j.g historicalPoints) {
        this.f214264a = 11;
        Intrinsics.checkNotNullParameter(commodityOrderIntroChartMapper, "commodityOrderIntroChartMapper");
        Intrinsics.checkNotNullParameter(historicalPoints, "historicalPoints");
    }

    public k(msc.a legalEntityProvider) {
        this.f214264a = 21;
        Intrinsics.checkNotNullParameter(legalEntityProvider, "legalEntityProvider");
    }

    public k(m31.c multipartHelper) {
        this.f214264a = 2;
        Intrinsics.checkNotNullParameter(multipartHelper, "multipartHelper");
    }

    public k(String str, long j2, long j3) {
        this.f214264a = 20;
        Preconditions.checkNotEmpty(str);
    }

    public k(l4i.a amountConverter) {
        this.f214264a = 23;
        Intrinsics.checkNotNullParameter(amountConverter, "amountConverter");
    }

    public k(v4d.a stubImpl, v4d.a realImpl, gte.a featureToggleInteractor) {
        this.f214264a = 17;
        Intrinsics.checkNotNullParameter(stubImpl, "stubImpl");
        Intrinsics.checkNotNullParameter(realImpl, "realImpl");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
    }

    public k(woc.h projectionCalculator) {
        this.f214264a = 7;
        Intrinsics.checkNotNullParameter(projectionCalculator, "projectionCalculator");
    }
}
