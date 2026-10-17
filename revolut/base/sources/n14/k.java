package n14;

import android.app.PendingIntent;
import android.net.Uri;
import android.os.Parcelable;
import android.widget.ImageView;
import bjk.d0;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.ResolvableApiException;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.mobile_services.api.exceptions.MsApiException;
import com.revolut.core.mobile_services.api.exceptions.MsResolvableApiException;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.status.StatusViewContract$Duration;
import com.revolut.core.ui_kit_core.R$id;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.feature.crypto.remittance.models.CryptoAddressRecipientDetails;
import com.revolut.feature.crypto.remittance.models.CryptoBeneficiaryRecipientAddress;
import com.revolut.feature.wealth.models.margin.WealthMarginBorrowingInterest;
import com.revolut.kompot.common.dialog.status.StatusDialogDescriptionProgress;
import com.revolut.retail.feature.esim.api.model.EsimCoverage;
import com.revolut.retail.feature.esim.api.model.EsimDataPlanOfferInfo;
import dej.a4;
import dej.b4;
import dej.j3;
import dej.l;
import dej.m;
import dej.o1;
import dej.w3;
import dej.x3;
import dej.y3;
import dej.z3;
import du7.k3;
import du7.n3;
import du7.q3;
import du7.t3;
import efm.r;
import ft3.d1;
import ft3.j1;
import ggk.l1;
import ggk.m1;
import ggk.n1;
import gu7.c2;
import gu7.f2;
import gu7.w1;
import gu7.z1;
import ix0.b2;
import j18.n;
import j18.u;
import j18.v;
import java.math.BigDecimal;
import java.net.URI;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.regex.Matcher;
import k4l.i0;
import k4l.r0;
import kfj.d5;
import kfj.e5;
import kfj.f5;
import kfj.g5;
import kfj.h5;
import kfj.i5;
import kfj.p;
import kfj.r4;
import kfj.v4;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlinx.coroutines.flow.Flow;
import mjk.t;
import myf.q;
import nii.b0;
import nii.c0;
import nii.e0;
import nii.g0;
import nii.h0;
import nii.j0;
import nii.l0;
import nii.m0;
import nii.s;
import nii.t1;
import nii.u1;
import nii.w0;
import nii.z;
import skm.p0;
import yhm.m;
import zhm.f0;
import zhm.q0;
import zhm.w;
import zhm.y0;
import zkm.o;

/* JADX INFO: loaded from: classes22.dex */
public abstract class k {
    public static final a4 A(h5 h5Var) {
        m mVar;
        l lVar;
        l lVar2;
        Intrinsics.checkNotNullParameter(h5Var, "<this>");
        String id10 = h5Var.getId();
        String type = h5Var.getType();
        m[] mVarArrValues = m.values();
        int length = mVarArrValues.length;
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                mVar = null;
                break;
            }
            m mVar2 = mVarArrValues[i2];
            if (a0.z(mVar2.name(), type, true)) {
                mVar = mVar2;
                break;
            }
            i2++;
        }
        String subtype = h5Var.getSubtype();
        if (subtype != null) {
            l[] lVarArrValues = l.values();
            int length2 = lVarArrValues.length;
            while (true) {
                if (i >= length2) {
                    lVar2 = null;
                    break;
                }
                lVar2 = lVarArrValues[i];
                if (a0.z(lVar2.name(), subtype, true)) {
                    break;
                }
                i++;
            }
            lVar = lVar2;
        } else {
            lVar = null;
        }
        Period period = Period.parse(h5Var.getDuration());
        Intrinsics.checkNotNullExpressionValue(period, "parse(...)");
        Long allowanceBytes = h5Var.getAllowanceBytes();
        boolean allowanceBytesUnlimited = h5Var.getAllowanceBytesUnlimited();
        EsimCoverage esimCoverageB = ofj.b.b(h5Var.getCoverageType(), h5Var.getCoverageCode(), null, h5Var.getCoverageCountries());
        p offer = h5Var.getOffer();
        return new a4(id10, mVar, lVar, period, allowanceBytes, allowanceBytesUnlimited, esimCoverageB, offer != null ? ofj.c.a(offer) : null);
    }

    public static final l1 B(bjk.a0 a0Var) {
        m1 m1Var;
        String str = a0Var.f15693a;
        String str2 = a0Var.f15694b;
        if (str2 != null) {
            m1[] m1VarArrValues = m1.values();
            int length = m1VarArrValues.length;
            for (int i = 0; i < length; i++) {
                m1Var = m1VarArrValues[i];
                if (a0.z(m1Var.name(), str2, true)) {
                    break;
                }
            }
            m1Var = null;
        } else {
            m1Var = null;
        }
        String str3 = a0Var.f15695c;
        d0 d0Var = a0Var.d;
        return new l1(str, m1Var, str3, d0Var != null ? new n1(d0Var.f15830a, d0Var.f15831b, t.a(d0Var.f15832c)) : null);
    }

    public static final w1 C(k3 k3Var) {
        Intrinsics.checkNotNullParameter(k3Var, "<this>");
        if (k3Var instanceof n3) {
            return new z1(((n3) k3Var).f117786a);
        }
        if (k3Var instanceof q3) {
            return new c2(((q3) k3Var).f117820a);
        }
        if (k3Var instanceof t3) {
            return new f2(((t3) k3Var).f117853a);
        }
        if (k3Var instanceof k3.b) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final o18.e D(n nVar) {
        Object dVar;
        Intrinsics.checkNotNullParameter(nVar, "<this>");
        List<j18.h> list = nVar.f170148a;
        ArrayList arrayList = new ArrayList();
        for (j18.h hVar : list) {
            if (!Intrinsics.f(hVar, j18.k.INSTANCE)) {
                if (hVar instanceof j18.p) {
                    j18.p pVar = (j18.p) hVar;
                    String str = pVar.f170153b;
                    x08.c cVar = x08.c.PRICE_ALERT;
                    Instant instant = pVar.f170152a;
                    String str2 = pVar.f170154c;
                    String str3 = pVar.d;
                    String str4 = str3 == null ? "" : str3;
                    String str5 = pVar.e;
                    u uVar = pVar.f;
                    dVar = new o18.d(str, cVar, instant, str2, str4, str5, uVar != null ? knm.b.M(uVar) : null);
                } else {
                    if (!(hVar instanceof v)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    v vVar = (v) hVar;
                    String str6 = vVar.f170160a;
                    x08.c cVar2 = x08.c.REV_INSIGHT;
                    Instant instant2 = vVar.f170161b;
                    String str7 = vVar.f170162c;
                    String str8 = vVar.d;
                    String str9 = str8 == null ? "" : str8;
                    String str10 = vVar.e;
                    u uVar2 = vVar.f;
                    dVar = new o18.d(str6, cVar2, instant2, str7, str9, str10, uVar2 != null ? knm.b.M(uVar2) : null);
                }
                obj = dVar;
            }
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return new o18.e(arrayList);
    }

    public static final j18.a E(x08.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        int i = h18.b.f148477c[cVar.ordinal()];
        if (i == 1) {
            return j18.a.REV_INSIGHT;
        }
        if (i == 2) {
            return j18.a.PRICE_ALERT;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final h5 F(a4 a4Var) {
        String strName;
        Intrinsics.checkNotNullParameter(a4Var, "<this>");
        String str = a4Var.f113486a;
        EsimCoverage esimCoverage = a4Var.f113489g;
        m mVar = a4Var.f113487b;
        if (mVar == null || (strName = mVar.name()) == null) {
            strName = "UNKNOWN";
        }
        String str2 = strName;
        l lVar = a4Var.f113488c;
        String strName2 = lVar != null ? lVar.name() : null;
        String string = a4Var.d.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        Long l2 = a4Var.e;
        boolean z = a4Var.f;
        String strA = ofj.b.a(esimCoverage);
        String str3 = esimCoverage.getF100209b().f100235a;
        List f100208a = esimCoverage.getF100208a();
        ArrayList arrayList = new ArrayList(w.t(f100208a, 10));
        Iterator it8 = f100208a.iterator();
        while (it8.hasNext()) {
            arrayList.add(((wi0.b) it8.next()).f297794a);
        }
        EsimDataPlanOfferInfo esimDataPlanOfferInfo = a4Var.f113490h;
        return new h5(str, str2, strName2, string, l2, z, strA, str3, arrayList, esimDataPlanOfferInfo != null ? ofj.c.b(esimDataPlanOfferInfo) : null);
    }

    public static final e18.b G(l2l.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        int i = h18.b.f148476b[aVar.ordinal()];
        if (i == 1) {
            return e18.b.PORTFOLIO;
        }
        if (i == 2) {
            return e18.b.WATCHLIST;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final ArrayList H(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        List<qta.a> list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        for (qta.a aVar : list2) {
            Intrinsics.checkNotNullParameter(aVar, "<this>");
            arrayList.add(new n9l.a(aVar.f249039a, aVar.f249040b, aVar.e.doubleValue(), null, null, null));
        }
        return arrayList;
    }

    public static final n9l.a I(qta.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        return new n9l.a(aVar.f249039a, aVar.f249040b, aVar.d.doubleValue(), null, null, null);
    }

    public static final d1 J(ux4.j jVar) {
        Intrinsics.checkNotNullParameter(jVar, "<this>");
        int i = l15.l.f191469a[jVar.ordinal()];
        if (i == 1) {
            return mif.a.m(d1.Companion, j1.FTC_FORBEARANCE, null);
        }
        if (i == 2) {
            return mif.a.m(d1.Companion, j1.CC_FORBEARANCE, null);
        }
        if (i == 3) {
            return new d1(j1.MORTGAGE_RENEGOTIATION, gt3.e.FORBEARANCE, null);
        }
        if (i == 4) {
            throw new IllegalStateException(a10.b.s("Self service forbearance is not yet supported for ", jVar.name(), " product"));
        }
        if (i != 5) {
            throw new NoWhenBranchMatchedException();
        }
        throw new IllegalStateException(a10.b.s("Self service forbearance is not yet supported for ", jVar.name(), " product"));
    }

    public static final MsApiException K(ApiException apiException) {
        Intrinsics.checkNotNullParameter(apiException, "<this>");
        jh0.a aVar = jh0.b.Companion;
        int statusCode = apiException.getStatusCode();
        aVar.getClass();
        jh0.b bVarA = jh0.a.a(statusCode);
        String localizedMessage = apiException.getLocalizedMessage();
        StackTraceElement[] stackTrace = apiException.getStackTrace();
        Intrinsics.checkNotNullExpressionValue(stackTrace, "getStackTrace(...)");
        return new MsApiException(bVarA, localizedMessage, stackTrace, apiException.getMessage(), apiException.getCause());
    }

    public static final MsResolvableApiException L(ResolvableApiException resolvableApiException) {
        Intrinsics.checkNotNullParameter(resolvableApiException, "<this>");
        jh0.a aVar = jh0.b.Companion;
        int statusCode = resolvableApiException.getStatusCode();
        aVar.getClass();
        jh0.b status = jh0.a.a(statusCode);
        String localizedMessage = resolvableApiException.getLocalizedMessage();
        StackTraceElement[] stackTrace = resolvableApiException.getStackTrace();
        Intrinsics.checkNotNullExpressionValue(stackTrace, "getStackTrace(...)");
        String message = resolvableApiException.getMessage();
        Throwable cause = resolvableApiException.getCause();
        PendingIntent resolution = resolvableApiException.getResolution();
        Intrinsics.checkNotNullExpressionValue(resolution, "getResolution(...)");
        v48.d startForResult = new v48.d(resolvableApiException, 29);
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(stackTrace, "stackTrace");
        Intrinsics.checkNotNullParameter(resolution, "resolution");
        Intrinsics.checkNotNullParameter(startForResult, "startForResult");
        return new MsResolvableApiException(status, localizedMessage, stackTrace, message, cause);
    }

    public static final jf0.c M(zli.b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        Intrinsics.checkNotNullParameter("revolut", "appDeeplinkScheme");
        String str = bVar.f323278a;
        jf0.e eVar = Intrinsics.f(Uri.parse(str).getAuthority(), "action") ? jf0.e.ACTION : jf0.e.NAVIGATION;
        String strS = a0.d.s("revolut://", (Intrinsics.f(Uri.parse(bVar.f323278a).getAuthority(), "action") ? jf0.e.ACTION : jf0.e.NAVIGATION) != jf0.e.ACTION ? "app" : "action", "/", bVar.f323279b);
        LinkedHashMap linkedHashMap = bVar.d;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(q0.b(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Object key = entry.getKey();
            String str2 = (String) zhm.d0.c0((Set) entry.getValue());
            if (str2 == null) {
                str2 = "";
            }
            linkedHashMap2.put(key, str2);
        }
        return new jf0.c(str, eVar, strS, linkedHashMap2, null);
    }

    public static final ArrayList N(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        List<qta.a> list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        for (qta.a aVar : list2) {
            Intrinsics.checkNotNullParameter(aVar, "<this>");
            arrayList.add(new qta.c(aVar.f249039a, aVar.f249040b, aVar.e, aVar.f, null, null, null));
        }
        return arrayList;
    }

    public static final String O(f8l.f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        int i = d8l.i.f112299a[fVar.ordinal()];
        if (i == 1) {
            return "RETAIL";
        }
        if (i == 2) {
            return "TRADING";
        }
        if (i == 3) {
            return "SAVINGS";
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|2|(2:4|(1:6)(1:7))(0)|8|(1:(1:(1:(1:(1:(3:15|70|71)(2:16|17))(2:18|67))(7:19|74|20|21|78|52|53))(14:26|84|27|28|76|44|45|72|46|47|82|48|(4:51|78|52|53)|69))(1:31))(2:32|(3:34|(1:37)|69)(5:39|80|40|(10:43|76|44|45|72|46|47|82|48|(0))|69))|38|80|40|(0)|69|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x011a, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x011b, code lost:
    
        r7 = null;
        r3 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0150, code lost:
    
        if (r0 != r2) goto L70;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0132 A[PHI: r3 r7 r12 r13
      0x0132: PHI (r3v14 tji.f) = (r3v10 tji.f), (r3v20 tji.f) binds: [B:65:0x012f, B:18:0x0043] A[DONT_GENERATE, DONT_INLINE]
      0x0132: PHI (r7v11 ??) = (r7v16 ??), (r7v15 ??) binds: [B:65:0x012f, B:18:0x0043] A[DONT_GENERATE, DONT_INLINE]
      0x0132: PHI (r12v11 java.lang.Throwable) = (r12v7 java.lang.Throwable), (r12v26 java.lang.Throwable) binds: [B:65:0x012f, B:18:0x0043] A[DONT_GENERATE, DONT_INLINE]
      0x0132: PHI (r13v16 nii.b) = (r13v12 nii.b), (r13v24 nii.b) binds: [B:65:0x012f, B:18:0x0043] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Type inference failed for: r16v2, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r7v11, types: [java.lang.Throwable, kotlin.jvm.functions.Function1, nii.b, nii.t1, tji.f] */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v7, types: [kotlin.jvm.functions.Function1, nii.t1] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object P(tji.f r12, nii.c0 r13, nii.b r14, nii.t1 r15, kotlin.jvm.functions.Function1 r16, kotlin.coroutines.Continuation r17) {
        /*
            Method dump skipped, instruction units count: 342
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n14.k.P(tji.f, nii.c0, nii.b, nii.t1, kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static Object Q(yji.l lVar, c0 c0Var, nii.b bVar, t1 t1Var, Function1 function1, Continuation continuation, int i) {
        if ((i & 1) != 0) {
            c0Var = nii.i.a();
        }
        c0 c0Var2 = c0Var;
        if ((i & 2) != 0) {
            bVar = nii.a.f216107a;
        }
        return P(lVar.X(), c0Var2, bVar, t1Var, function1, continuation);
    }

    public static Object R(yji.n nVar, nii.b bVar, t1 t1Var, Function1 function1, gim.c cVar, int i) {
        return P(nVar.q2(), nii.i.a(), (i & 2) != 0 ? nii.a.f216107a : bVar, t1Var, function1, cVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object S(tji.f r4, nii.c0 r5, nii.b r6, nii.t1 r7, kotlin.jvm.functions.Function1 r8, kotlin.coroutines.Continuation r9) {
        /*
            boolean r0 = r9 instanceof nii.x0
            if (r0 == 0) goto L14
            r0 = r9
            nii.x0 r0 = (nii.x0) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.v = r1
        L12:
            r9 = r0
            goto L1a
        L14:
            nii.x0 r0 = new nii.x0
            r0.<init>(r9)
            goto L12
        L1a:
            java.lang.Object r0 = r9.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r9.v
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            yhm.o.b(r0)
            goto L3d
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            yhm.o.b(r0)
            r9.v = r3
            java.lang.Object r0 = P(r4, r5, r6, r7, r8, r9)
            if (r0 != r1) goto L3d
            return r1
        L3d:
            nii.e r0 = (nii.e) r0
            boolean r4 = r0 instanceof nii.c
            if (r4 == 0) goto L4f
            nii.f r4 = new nii.f
            nii.c r0 = (nii.c) r0
            java.lang.Throwable r5 = r0.f216123a
            nii.n1 r6 = r0.f216124b
            r4.<init>(r5, r6)
            return r4
        L4f:
            boolean r4 = r0 instanceof nii.d
            if (r4 == 0) goto L73
            nii.d r0 = (nii.d) r0
            nii.n1 r4 = r0.f216134b
            if (r4 == 0) goto L61
            nii.g r5 = new nii.g
            java.lang.Object r6 = r0.f216133a
            r5.<init>(r6, r4)
            return r5
        L61:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "withStatus can't handle null statusDialogResult"
            r4.<init>(r5)
            zhm.h0 r5 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r6 = rd0.d.f253311a
            rd0.c r6 = rd0.c.ERROR
            r7 = 0
            rd0.d.a(r6, r7, r7, r4, r5)
            throw r4
        L73:
            kotlin.NoWhenBranchMatchedException r4 = new kotlin.NoWhenBranchMatchedException
            r4.<init>()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: n14.k.S(tji.f, nii.c0, nii.b, nii.t1, kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final Object T(yji.l lVar, c0 c0Var, nii.b bVar, t1 t1Var, Function1 function1, Continuation continuation) {
        return S(lVar.X(), c0Var, bVar, t1Var, function1, continuation);
    }

    public static final Object U(yji.n nVar, c0 c0Var, nii.b bVar, t1 t1Var, Function1 function1, Continuation continuation) {
        return S(nVar.q2(), c0Var, bVar, t1Var, function1, continuation);
    }

    public static /* synthetic */ Object V(yji.l lVar, c0 c0Var, nii.b bVar, t1 t1Var, Function1 function1, Continuation continuation, int i) {
        if ((i & 1) != 0) {
            c0Var = nii.i.a();
        }
        c0 c0Var2 = c0Var;
        if ((i & 2) != 0) {
            bVar = nii.a.f216107a;
        }
        return T(lVar, c0Var2, bVar, t1Var, function1, continuation);
    }

    public static /* synthetic */ Object W(yji.n nVar, c0 c0Var, nii.b bVar, t1 t1Var, Function1 function1, Continuation continuation, int i) {
        if ((i & 1) != 0) {
            c0Var = nii.i.a();
        }
        c0 c0Var2 = c0Var;
        if ((i & 2) != 0) {
            bVar = nii.a.f216107a;
        }
        return U(nVar, c0Var2, bVar, t1Var, function1, continuation);
    }

    public static final m0 a(m0 m0Var) {
        if (m0Var instanceof j0) {
            j0 j0Var = (j0) m0Var;
            Clause title = j0Var.f216171a;
            Clause clause = j0Var.f216172b;
            StatusDialogDescriptionProgress statusDialogDescriptionProgress = j0Var.f216173c;
            Parcelable parcelable = j0Var.d;
            u1 successType = j0Var.e;
            AnalyticsProduct analyticsProduct = j0Var.f216174g;
            Parcelable parcelable2 = j0Var.f216175h;
            Parcelable parcelable3 = j0Var.i;
            StatusViewContract$Duration duration = j0Var.f216176j;
            h0 overlayAnimation = j0Var.k;
            Image image = j0Var.f216177l;
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(successType, "successType");
            Intrinsics.checkNotNullParameter(duration, "duration");
            Intrinsics.checkNotNullParameter(overlayAnimation, "overlayAnimation");
            return new j0(title, clause, statusDialogDescriptionProgress, parcelable, successType, true, analyticsProduct, parcelable2, parcelable3, duration, overlayAnimation, image);
        }
        if (m0Var instanceof z) {
            return z.i((z) m0Var, null, 32511);
        }
        if (m0Var instanceof g0) {
            g0 g0Var = (g0) m0Var;
            Clause title2 = g0Var.f216154a;
            Clause clause2 = g0Var.f216155b;
            StatusDialogDescriptionProgress statusDialogDescriptionProgress2 = g0Var.f216156c;
            Clause clause3 = g0Var.d;
            Clause clause4 = g0Var.e;
            Image image2 = g0Var.f;
            Parcelable parcelable4 = g0Var.f216157g;
            nii.j pendingType = g0Var.f216158h;
            AnalyticsProduct analyticsProduct2 = g0Var.f216159j;
            Parcelable parcelable5 = g0Var.k;
            Parcelable parcelable6 = g0Var.f216160l;
            boolean z = g0Var.f216161m;
            Image image3 = g0Var.f216162n;
            Intrinsics.checkNotNullParameter(title2, "title");
            Intrinsics.checkNotNullParameter(pendingType, "pendingType");
            return new g0(title2, clause2, statusDialogDescriptionProgress2, clause3, clause4, image2, parcelable4, pendingType, true, analyticsProduct2, parcelable5, parcelable6, z, image3);
        }
        if (m0Var instanceof l0) {
            l0 l0Var = (l0) m0Var;
            Clause title3 = l0Var.f216184a;
            Clause clause5 = l0Var.f216185b;
            StatusDialogDescriptionProgress statusDialogDescriptionProgress3 = l0Var.f216186c;
            Clause clause6 = l0Var.d;
            Clause clause7 = l0Var.e;
            Parcelable parcelable7 = l0Var.f;
            AnalyticsProduct analyticsProduct3 = l0Var.f216188h;
            Parcelable parcelable8 = l0Var.i;
            Parcelable parcelable9 = l0Var.f216189j;
            Intrinsics.checkNotNullParameter(title3, "title");
            return new l0(title3, clause5, statusDialogDescriptionProgress3, clause6, clause7, parcelable7, true, analyticsProduct3, parcelable8, parcelable9);
        }
        if (m0Var instanceof e0) {
            return e0.i((e0) m0Var, null, 991);
        }
        if (m0Var instanceof b0) {
            b0 b0Var = (b0) m0Var;
            Clause title4 = b0Var.f216111a;
            Clause clause8 = b0Var.f216112b;
            StatusDialogDescriptionProgress statusDialogDescriptionProgress4 = b0Var.f216113c;
            Parcelable parcelable10 = b0Var.d;
            r progressSource = b0Var.e;
            int i = b0Var.f;
            boolean z3 = b0Var.f216115h;
            AnalyticsProduct analyticsProduct4 = b0Var.i;
            Parcelable parcelable11 = b0Var.f216116j;
            Parcelable parcelable12 = b0Var.k;
            Intrinsics.checkNotNullParameter(title4, "title");
            Intrinsics.checkNotNullParameter(progressSource, "progressSource");
            return new b0(title4, clause8, statusDialogDescriptionProgress4, parcelable10, progressSource, i, true, z3, analyticsProduct4, parcelable11, parcelable12);
        }
        if (m0Var instanceof c0) {
            return c0.i((c0) m0Var, 2031);
        }
        if (m0Var instanceof nii.v) {
            nii.v vVar = (nii.v) m0Var;
            Clause title5 = vVar.f216226a;
            Clause description = vVar.f216227b;
            Image image4 = vVar.f216228c;
            Clause primaryButtonText = vVar.d;
            Clause secondaryButtonText = vVar.e;
            b2 b2Var = vVar.f;
            StatusDialogDescriptionProgress statusDialogDescriptionProgress5 = vVar.f216229g;
            Parcelable parcelable13 = vVar.f216230h;
            AnalyticsProduct analyticsProduct5 = vVar.f216231j;
            Parcelable parcelable14 = vVar.k;
            Parcelable parcelable15 = vVar.f216232l;
            Intrinsics.checkNotNullParameter(title5, "title");
            Intrinsics.checkNotNullParameter(description, "description");
            Intrinsics.checkNotNullParameter(primaryButtonText, "primaryButtonText");
            Intrinsics.checkNotNullParameter(secondaryButtonText, "secondaryButtonText");
            return new nii.v(title5, description, image4, primaryButtonText, secondaryButtonText, b2Var, statusDialogDescriptionProgress5, parcelable13, true, analyticsProduct5, parcelable14, parcelable15);
        }
        if (!(m0Var instanceof nii.t)) {
            throw new NoWhenBranchMatchedException();
        }
        nii.t tVar = (nii.t) m0Var;
        Clause title6 = tVar.f216215a;
        Clause clause9 = tVar.f216216b;
        Clause clause10 = tVar.f216217c;
        Clause clause11 = tVar.d;
        s state = tVar.e;
        Parcelable parcelable16 = tVar.f;
        AnalyticsProduct analyticsProduct6 = tVar.f216219h;
        Parcelable parcelable17 = tVar.i;
        Parcelable parcelable18 = tVar.f216220j;
        boolean z4 = tVar.k;
        nii.k kVar = tVar.f216221l;
        Intrinsics.checkNotNullParameter(title6, "title");
        Intrinsics.checkNotNullParameter(state, "state");
        return new nii.t(title6, clause9, clause10, clause11, state, parcelable16, true, analyticsProduct6, parcelable17, parcelable18, z4, kVar);
    }

    public static final String b(Matcher matcher) {
        String strGroup = matcher.group(1);
        if (strGroup != null) {
            return strGroup;
        }
        throw new IllegalStateException("Group 0 does not exist");
    }

    public static final String c(Matcher matcher, int i) {
        String strGroup = matcher.group(i + 1);
        if (strGroup != null) {
            return strGroup;
        }
        throw new IllegalStateException(j6.a.l(i, "Group ", " does not exist"));
    }

    public static final boolean d(ImageView imageView) {
        Object tag2 = imageView.getTag(R$id.internal_view_tag_content_description_controlled_by_displayer);
        if (!(tag2 instanceof Boolean)) {
            tag2 = null;
        }
        Boolean bool = (Boolean) tag2;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    public static final ulm.j1 e(ulm.j1 j1Var) {
        j1Var.getClass();
        return j1Var;
    }

    public static final void f(ImageView imageView, boolean z) {
        imageView.setTag(R$id.internal_view_tag_content_description_controlled_by_displayer, Boolean.valueOf(z));
    }

    public static final xzg.b0 g(i9h.v vVar) {
        int i = i9h.t.f159873a[vVar.ordinal()];
        if (i == 1) {
            return xzg.b0.ONE_DAY;
        }
        if (i == 2) {
            return xzg.b0.ONE_WEEK;
        }
        if (i == 3) {
            return xzg.b0.ONE_MONTH;
        }
        if (i == 4) {
            return xzg.b0.ONE_YEAR;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final List h(k4l.e0 e0Var, r0 orderType) {
        Intrinsics.checkNotNullParameter(e0Var, "<this>");
        Intrinsics.checkNotNullParameter(orderType, "orderType");
        k4l.j0 j0VarI = i(e0Var, orderType);
        List listZ9 = j0VarI != null ? j0VarI.z9() : null;
        return listZ9 == null ? f0.f322471a : listZ9;
    }

    public static final k4l.j0 i(k4l.e0 e0Var, r0 r0Var) {
        int i = j4l.a.f171422a[r0Var.ordinal()];
        Object obj2 = null;
        if (i == 1) {
            Iterator it8 = e0Var.f180958j.iterator();
            while (true) {
                if (!it8.hasNext()) {
                    break;
                }
                Object next = it8.next();
                if (next instanceof k4l.g0) {
                    obj2 = next;
                    break;
                }
            }
            return (k4l.j0) obj2;
        }
        if (i == 2) {
            Iterator it9 = e0Var.f180958j.iterator();
            while (true) {
                if (!it9.hasNext()) {
                    break;
                }
                Object next2 = it9.next();
                if (next2 instanceof k4l.f0) {
                    obj2 = next2;
                    break;
                }
            }
            return (k4l.j0) obj2;
        }
        if (i == 3) {
            Iterator it10 = e0Var.f180958j.iterator();
            while (true) {
                if (!it10.hasNext()) {
                    break;
                }
                Object next3 = it10.next();
                if (next3 instanceof i0) {
                    obj2 = next3;
                    break;
                }
            }
            return (k4l.j0) obj2;
        }
        if (i != 4) {
            throw new NoWhenBranchMatchedException();
        }
        Iterator it11 = e0Var.f180958j.iterator();
        while (true) {
            if (!it11.hasNext()) {
                break;
            }
            Object next4 = it11.next();
            if (next4 instanceof k4l.h0) {
                obj2 = next4;
                break;
            }
        }
        return (k4l.j0) obj2;
    }

    public static final int j(k4l.e0 e0Var, r0 orderType) {
        Intrinsics.checkNotNullParameter(e0Var, "<this>");
        Intrinsics.checkNotNullParameter(orderType, "orderType");
        k4l.j0 j0VarI = i(e0Var, orderType);
        if (j0VarI != null) {
            return j0VarI.I4();
        }
        return 0;
    }

    public static final Map k() {
        return zhm.r0.k(new Pair("IN_REVIEW", w5l.c.IN_REVIEW), new Pair("REJECTED_BY_PARENT", w5l.c.REJECTED_BY_PARENT));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object l(tji.f r6, java.lang.Throwable r7, gim.c r8) throws java.lang.Throwable {
        /*
            boolean r0 = r8 instanceof nii.v0
            if (r0 == 0) goto L13
            r0 = r8
            nii.v0 r0 = (nii.v0) r0
            int r1 = r0.f216233w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f216233w = r1
            goto L18
        L13:
            nii.v0 r0 = new nii.v0
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f216233w
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 == r3) goto L2b
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2b:
            java.util.concurrent.CancellationException r7 = r0.u
            yhm.o.b(r8)
            goto L59
        L31:
            yhm.o.b(r8)
            boolean r8 = r7 instanceof java.util.concurrent.CancellationException
            if (r8 == 0) goto L5a
            skm.w1 r8 = skm.w1.f264016b
            skm.p0 r2 = skm.p0.f264001a
            tkm.e r2 = zkm.o.f323119a
            tkm.e r2 = r2.e
            kotlin.coroutines.CoroutineContext r8 = r8.plus(r2)
            nfj.j2 r2 = new nfj.j2
            r4 = 7
            r5 = 0
            r2.<init>(r6, r5, r4)
            r6 = r7
            java.util.concurrent.CancellationException r6 = (java.util.concurrent.CancellationException) r6
            r0.u = r6
            r0.f216233w = r3
            java.lang.Object r6 = skm.e0.J(r8, r2, r0)
            if (r6 != r1) goto L59
            return r1
        L59:
            throw r7
        L5a:
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: n14.k.l(tji.f, java.lang.Throwable, gim.c):java.lang.Object");
    }

    public static final void m(CoroutineContext coroutineContext, Throwable th10) {
        if (th10 instanceof CancellationException) {
            return;
        }
        try {
            mo3.a.m(th10);
        } catch (Throwable th11) {
            yhm.f.a(th10, th11);
            skm.e0.v(coroutineContext, th10);
        }
    }

    public static final boolean n(k4l.e0 e0Var, r0 orderType) {
        Intrinsics.checkNotNullParameter(e0Var, "<this>");
        Intrinsics.checkNotNullParameter(orderType, "orderType");
        return i(e0Var, orderType) != null;
    }

    public static final boolean o(List list, iy9.a settingId, boolean z) {
        Object next;
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(settingId, "settingId");
        Iterator it8 = list.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (((iy9.b) next).f169640a == settingId) {
                break;
            }
        }
        iy9.b bVar = (iy9.b) next;
        return bVar != null ? bVar.f169641b : z;
    }

    public static final cxe.u p(Flow flow, Function1 block) {
        Intrinsics.checkNotNullParameter(flow, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        return new cxe.u(flow, block, 8);
    }

    public static final r q(r rVar, Function1 block) {
        Intrinsics.checkNotNullParameter(rVar, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        r map = rVar.map(new sx4.c(new js7.c(24, block), 0));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }

    public static final r r(r rVar, Object obj2) {
        Intrinsics.checkNotNullParameter(rVar, "<this>");
        r map = rVar.map(new sp5.h(29, new sx4.b(obj2, 0)));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return ue0.e.p(map, zhm.h0.f322473a);
    }

    public static final jhi.k s(Flow flow, Object obj2) {
        Intrinsics.checkNotNullParameter(flow, "<this>");
        return new jhi.k(flow, obj2, 1);
    }

    public static final myf.s t(String str, String str2) {
        if (str != null && str2 != null) {
            Duration duration = Duration.parse(str);
            Intrinsics.checkNotNullExpressionValue(duration, "parse(...)");
            Duration duration2 = Duration.parse(str2);
            Intrinsics.checkNotNullExpressionValue(duration2, "parse(...)");
            return new myf.r(duration, duration2);
        }
        if (str == null && str2 == null) {
            return null;
        }
        if (str == null) {
            str = str2;
        }
        Duration duration3 = Duration.parse(str);
        Intrinsics.checkNotNullExpressionValue(duration3, "parse(...)");
        return new q(duration3);
    }

    public static final Object u(Function1 function1, w0 w0Var) {
        p0 p0Var = p0.f264001a;
        return skm.e0.J(o.f323119a.e, new bt9.v(4, null, function1), w0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object v(kotlin.jvm.functions.Function1 r11, gim.c r12) {
        /*
            boolean r0 = r12 instanceof ruf.a
            if (r0 == 0) goto L13
            r0 = r12
            ruf.a r0 = (ruf.a) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L18
        L13:
            ruf.a r0 = new ruf.a
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.v
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            yhm.o.b(r12)     // Catch: java.lang.Throwable -> L28
            goto L40
        L28:
            r0 = move-exception
            r11 = r0
            r7 = r11
            goto L47
        L2c:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L34:
            yhm.o.b(r12)
            r0.v = r3     // Catch: java.lang.Throwable -> L28
            java.lang.Object r12 = r11.invoke(r0)     // Catch: java.lang.Throwable -> L28
            if (r12 != r1) goto L40
            return r1
        L40:
            r11 = 0
            r0 = 3
            com.revolut.data.model.Data r11 = zi0.c.P(r12, r11, r4, r0)     // Catch: java.lang.Throwable -> L28
            return r11
        L47:
            zhm.h0 r11 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r12 = rd0.d.f253311a
            rd0.c r12 = rd0.c.ERROR
            rd0.d.a(r12, r4, r4, r7, r11)
            com.revolut.data.model.Data r5 = new com.revolut.data.model.Data
            r9 = 1
            r10 = 0
            r6 = 0
            r8 = 0
            r5.<init>(r6, r7, r8, r9, r10)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: n14.k.v(kotlin.jvm.functions.Function1, gim.c):java.lang.Object");
    }

    public static final zli.b w(jf0.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        URI uriCreate = URI.create(cVar.f173629c);
        String rawPath = uriCreate.getRawPath();
        if (rawPath == null) {
            rawPath = "";
        }
        String strK0 = kotlin.text.d0.K0(rawPath, '/');
        String rawQuery = uriCreate.getRawQuery();
        String strConcat = rawQuery != null ? "?".concat(rawQuery) : null;
        String strR = a0.d.r(strK0, strConcat != null ? strConcat : "");
        String str = cVar.f173627a;
        List list = (List) cVar.i.getValue();
        HashMap map = cVar.d;
        LinkedHashMap params = new LinkedHashMap(q0.b(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            params.put(entry.getKey(), y0.b((String) entry.getValue()));
        }
        zli.e eVar = zli.f.Companion;
        Intrinsics.checkNotNullParameter(params, "params");
        return new zli.b(str, strR, params, list);
    }

    public static final CryptoAddressRecipientDetails x(bl5.b bVar) {
        wk5.i iVar;
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        String strC = bVar.getName();
        String strE = bVar.getType();
        wk5.i[] iVarArrValues = wk5.i.values();
        int length = iVarArrValues.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                iVar = null;
                break;
            }
            iVar = iVarArrValues[i];
            if (a0.z(iVar.name(), strE, true)) {
                break;
            }
            i++;
        }
        if (iVar == null) {
            iVar = wk5.i.UNSET;
        }
        wk5.i iVar2 = iVar;
        String strD = bVar.getSurname();
        bl5.a aVarA = bVar.getAddress();
        return new CryptoAddressRecipientDetails(strC, iVar2, strD, aVarA != null ? new CryptoBeneficiaryRecipientAddress(aVarA.getCountry(), aVarA.getCity(), aVarA.getAddressLine1(), aVarA.getAddressLine2()) : null, bVar.getBusinessRegistrationNumber());
    }

    public static final WealthMarginBorrowingInterest y(t7h.c cVar) throws Throwable {
        Object objA;
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        BigDecimal bigDecimal = cVar.f268695a;
        dj0.d dVarO = mo3.a.o(cVar.f268696b);
        dj0.d dVarO2 = mo3.a.o(cVar.f268697c);
        String str = cVar.d;
        LocalDate localDate = null;
        Object obj2 = null;
        if (str != null) {
            try {
                m.Companion companion = yhm.m.INSTANCE;
                objA = LocalDate.parse(str);
            } catch (Throwable th10) {
                m.Companion companion2 = yhm.m.INSTANCE;
                objA = yhm.o.a(th10);
            }
            Throwable thA = yhm.m.a(objA);
            if (thA == null) {
                obj2 = objA;
            } else {
                hx7.e.n(thA);
            }
            localDate = (LocalDate) obj2;
        }
        return new WealthMarginBorrowingInterest(bigDecimal, dVarO, dVarO2, localDate);
    }

    public static final w3 z(d5 d5Var) {
        j3 j3Var;
        Iterator it8;
        o1 o1Var;
        Intrinsics.checkNotNullParameter(d5Var, "<this>");
        List subscriptions = d5Var.getSubscriptions();
        ArrayList arrayList = new ArrayList(w.t(subscriptions, 10));
        Iterator it9 = subscriptions.iterator();
        while (it9.hasNext()) {
            f5 f5Var = (f5) it9.next();
            Intrinsics.checkNotNullParameter(f5Var, "<this>");
            g5 subscription = f5Var.getSubscription();
            Intrinsics.checkNotNullParameter(subscription, "<this>");
            String strA = subscription.getId();
            String strE = subscription.getState();
            j3[] j3VarArrValues = j3.values();
            int length = j3VarArrValues.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    j3Var = null;
                    break;
                }
                j3Var = j3VarArrValues[i];
                if (a0.z(j3Var.name(), strE, true)) {
                    break;
                }
                i++;
            }
            if (j3Var == null) {
                j3Var = j3.UNKNOWN;
            }
            j3 j3Var2 = j3Var;
            a4 a4VarA = A(subscription.getMobilePlan());
            i5 i5VarD = subscription.getSimProfile();
            Intrinsics.checkNotNullParameter(i5VarD, "<this>");
            String strA2 = i5VarD.getIccId();
            String strC = i5VarD.getState();
            o1[] o1VarArrValues = o1.values();
            int length2 = o1VarArrValues.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length2) {
                    it8 = it9;
                    o1Var = null;
                    break;
                }
                o1Var = o1VarArrValues[i2];
                it8 = it9;
                if (a0.z(o1Var.name(), strC, true)) {
                    break;
                }
                i2++;
                it9 = it8;
            }
            if (o1Var == null) {
                o1Var = o1.UNKNOWN;
            }
            b4 b4Var = new b4(strA2, o1Var, i5VarD.getLocked());
            v4 v4VarF = subscription.getUsage();
            dej.n3 n3VarH = v4VarF != null ? ofj.p.h(v4VarF) : null;
            List listC = subscription.getRoamingAllowances();
            ArrayList arrayList2 = new ArrayList(w.t(listC, 10));
            Iterator it10 = listC.iterator();
            while (it10.hasNext()) {
                arrayList2.add(ofj.p.g((r4) it10.next()));
            }
            arrayList.add(new y3(new z3(strA, j3Var2, a4VarA, b4Var, n3VarH, arrayList2), ofj.p.e(f5Var.getContextualOrder())));
            it9 = it8;
        }
        List<e5> mobilePlans = d5Var.getMobilePlans();
        ArrayList arrayList3 = new ArrayList(w.t(mobilePlans, 10));
        for (e5 e5Var : mobilePlans) {
            Intrinsics.checkNotNullParameter(e5Var, "<this>");
            arrayList3.add(new x3(A(e5Var.getMobilePlan()), e5Var.getPriority()));
        }
        return new w3(arrayList, arrayList3);
    }
}
