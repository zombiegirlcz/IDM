package d9;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.text.TextUtils;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.gms.wallet.CreditCardExpirationDate;
import com.google.android.gms.wallet.PaymentCardRecognitionResult;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.revolut.core.ui_kit.models.PercentageClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.feature.address.models.Address;
import com.revolut.feature.insurance_car.impl.data.model.Payment;
import com.revolut.feature.insurance_car.impl.data.model.PriceWithLabel;
import com.revolut.retail.feature.api.income_sorter.models.IncomeSorterExecution;
import com.revolut.retail.feature.api.income_sorter.models.IncomeSorterExecutionDestination;
import com.revolut.revolut.feature_fourthline_impl.R;
import com.revolut.shared.feature.market_data.models.domain.models.Amount;
import com.revolut.shared.feature.market_data.models.domain.models.Asset;
import com.revolut.shared.feature.market_data.models.domain.models.OrderQuote;
import dx4.a2;
import dx4.b3;
import dx4.b5;
import dx4.c5;
import dx4.e5;
import dx4.f4;
import dx4.g2;
import dx4.g5;
import dx4.h5;
import dx4.i2;
import dx4.i4;
import dx4.i5;
import dx4.j2;
import dx4.j5;
import dx4.k3;
import dx4.l2;
import dx4.l3;
import dx4.l4;
import dx4.m1;
import dx4.m4;
import dx4.n3;
import dx4.o5;
import dx4.p3;
import dx4.p5;
import dx4.r3;
import dx4.r4;
import dx4.s3;
import dx4.w1;
import dx4.w3;
import dx4.x1;
import dx4.x3;
import dx4.x4;
import dx4.x5;
import dx4.y4;
import io.reactivex.exceptions.CompositeException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicReference;
import kl7.f1;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.ArrayDeque;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import org.joda.time.LocalDate;
import org.joda.time.ReadablePartial;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import tof.a3;
import tof.v6;
import vkm.v1;
import w30.y;

/* JADX INFO: loaded from: classes16.dex */
public abstract class e1 {
    public static final boolean A(IncomeSorterExecution incomeSorterExecution) {
        Intrinsics.checkNotNullParameter(incomeSorterExecution, "<this>");
        return incomeSorterExecution.f99240c == yzi.b.FAILED && !F(incomeSorterExecution);
    }

    public static final boolean B(a3 a3Var) {
        Intrinsics.checkNotNullParameter(a3Var, "<this>");
        if (a3Var.f == v6.COMPLETED) {
            return false;
        }
        fal.b.Companion.getClass();
        return zhm.d0.T(fal.a.f133411b, a3Var.f272611s);
    }

    public static final boolean C(BigDecimal bigDecimal) {
        Intrinsics.checkNotNullParameter(bigDecimal, "<this>");
        return bigDecimal.compareTo(BigDecimal.ZERO) < 0;
    }

    public static final boolean D(BigDecimal bigDecimal) {
        Intrinsics.checkNotNullParameter(bigDecimal, "<this>");
        return !I(bigDecimal);
    }

    public static final boolean E(BigDecimal bigDecimal) {
        Intrinsics.checkNotNullParameter(bigDecimal, "<this>");
        return bigDecimal.compareTo(BigDecimal.ONE) == 0;
    }

    public static final boolean F(IncomeSorterExecution incomeSorterExecution) {
        Intrinsics.checkNotNullParameter(incomeSorterExecution, "<this>");
        ArrayList<IncomeSorterExecutionDestination> arrayList = incomeSorterExecution.f;
        if (arrayList.isEmpty()) {
            return false;
        }
        for (IncomeSorterExecutionDestination incomeSorterExecutionDestination : arrayList) {
            Intrinsics.checkNotNullParameter(incomeSorterExecutionDestination, "<this>");
            if (incomeSorterExecutionDestination.f99244c == yzi.c.FAILED) {
                return true;
            }
        }
        return false;
    }

    public static final boolean G(BigDecimal bigDecimal) {
        Intrinsics.checkNotNullParameter(bigDecimal, "<this>");
        return bigDecimal.compareTo(BigDecimal.ZERO) > 0;
    }

    public static final boolean H(w30.y yVar) {
        Intrinsics.checkNotNullParameter(yVar, "<this>");
        if ((yVar instanceof w30.x) || (yVar instanceof y.a) || (yVar instanceof y.b)) {
            return true;
        }
        if ((yVar instanceof w30.v) || (yVar instanceof w30.w)) {
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final boolean I(BigDecimal bigDecimal) {
        Intrinsics.checkNotNullParameter(bigDecimal, "<this>");
        return bigDecimal.compareTo(BigDecimal.ZERO) == 0;
    }

    public static final f8l.b J(f8l.b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        int i = b4i.a.f12381a[bVar.ordinal()];
        if (i == 1) {
            return f8l.b.TO;
        }
        if (i == 2) {
            return f8l.b.FROM;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final com.google.protobuf.g K(com.google.protobuf.w0 w0Var) {
        Intrinsics.checkNotNullParameter(w0Var, "<this>");
        String strConcat = "type.googleapis.com/revolut.tracking.".concat(w0Var.getClass().getSimpleName());
        Package r110 = w0Var.getClass().getPackage();
        Intrinsics.f(r110 != null ? r110.getName() : null, "com.revolut.tracking.v3");
        com.google.protobuf.f fVarNewBuilder = com.google.protobuf.g.newBuilder();
        com.google.protobuf.p byteString = w0Var.toByteString();
        fVarNewBuilder.c();
        ((com.google.protobuf.g) fVarNewBuilder.f49761b).setValue(byteString);
        fVarNewBuilder.c();
        ((com.google.protobuf.g) fVarNewBuilder.f49761b).setTypeUrl(strConcat);
        com.google.protobuf.w0 w0VarA = fVarNewBuilder.a();
        Intrinsics.checkNotNullExpressionValue(w0VarA, "build(...)");
        return (com.google.protobuf.g) w0VarA;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x006e, code lost:
    
        r0 = java.lang.Integer.valueOf(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0072, code lost:
    
        if (r5 == (-1)) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0074, code lost:
    
        r3 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0075, code lost:
    
        if (r3 == null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0077, code lost:
    
        r2 = r3.intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x007b, code lost:
    
        r2 = r2 + r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x007c, code lost:
    
        if (r2 >= r10) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x007f, code lost:
    
        r10 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0080, code lost:
    
        if (r10 <= r12) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0083, code lost:
    
        r12 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0084, code lost:
    
        r9 = r9.setScale(r12, r11);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, "setScale(...)");
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x008b, code lost:
    
        return r9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.math.BigDecimal L(java.math.BigDecimal r9, int r10, java.math.RoundingMode r11, int r12) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            java.lang.String r0 = "roundingMode"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            java.lang.String r0 = r9.toPlainString()
            kotlin.jvm.internal.Intrinsics.h(r0)
            r1 = 46
            boolean r1 = kotlin.text.d0.K(r0, r1)
            r2 = 0
            r3 = 0
            if (r1 == 0) goto L2d
            java.lang.String r1 = "."
            java.lang.String[] r1 = new java.lang.String[]{r1}
            r4 = 6
            java.util.List r0 = kotlin.text.d0.n0(r0, r1, r2, r4)
            java.lang.Object r0 = zhm.d0.o0(r0)
            java.lang.String r0 = (java.lang.String) r0
            goto L2e
        L2d:
            r0 = r3
        L2e:
            java.lang.String r1 = "setScale(...)"
            if (r0 == 0) goto L8c
            int r4 = r0.length()
            if (r4 != 0) goto L39
            goto L8c
        L39:
            kotlin.sequences.Sequence r0 = kotlin.text.f0.L0(r0)
            jli.a r4 = jli.a.f
            nkm.d0 r0 = nkm.y.x(r0, r4)
            kotlin.sequences.Sequence r4 = r0.f216835a
            java.util.Iterator r4 = r4.iterator()
            r5 = r2
        L4a:
            boolean r6 = r4.hasNext()
            r7 = -1
            if (r6 == 0) goto L6d
            kotlin.jvm.functions.Function1 r6 = r0.f216836b
            java.lang.Object r8 = r4.next()
            java.lang.Object r6 = r6.invoke(r8)
            if (r5 < 0) goto L69
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            if (r6 == 0) goto L66
            goto L6e
        L66:
            int r5 = r5 + 1
            goto L4a
        L69:
            zhm.v.s()
            throw r3
        L6d:
            r5 = r7
        L6e:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            if (r5 == r7) goto L75
            r3 = r0
        L75:
            if (r3 == 0) goto L7b
            int r2 = r3.intValue()
        L7b:
            int r2 = r2 + r10
            if (r2 >= r10) goto L7f
            goto L80
        L7f:
            r10 = r2
        L80:
            if (r10 <= r12) goto L83
            goto L84
        L83:
            r12 = r10
        L84:
            java.math.BigDecimal r9 = r9.setScale(r12, r11)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, r1)
            return r9
        L8c:
            java.math.BigDecimal r9 = r9.setScale(r10, r11)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, r1)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: d9.e1.L(java.math.BigDecimal, int, java.math.RoundingMode, int):java.math.BigDecimal");
    }

    public static /* synthetic */ BigDecimal M(BigDecimal bigDecimal, int i, int i2) {
        RoundingMode roundingMode = RoundingMode.DOWN;
        if ((i2 & 2) != 0) {
            roundingMode = RoundingMode.HALF_EVEN;
        }
        return L(bigDecimal, i, roundingMode, 10);
    }

    public static v1 N(Function2 tillProvider, Flow flow) {
        o2g.f handleError = new o2g.f(2);
        Intrinsics.checkNotNullParameter(flow, "<this>");
        Intrinsics.checkNotNullParameter(tillProvider, "tillProvider");
        Intrinsics.checkNotNullParameter(handleError, "handleError");
        skm.r rVarB = skm.e0.b();
        Continuation continuation = null;
        tillProvider.invoke(handleError, new lhk.a0(flow, rVarB, continuation, 27));
        return new v1(new nyd.j(rVarB, continuation, 2));
    }

    public static void O(AppCompatActivity activity, Function0 okAction) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(okAction, "okAction");
        new AlertDialog.Builder(activity, R.style.tdcoreekyc__BaseAlertDialogTheme).setTitle(activity.getString(R.string.tdcoreekyc__quit_popupTitle)).setMessage(activity.getString(R.string.tdcoreekyc__quit_popupDescription)).setPositiveButton(activity.getString(R.string.tdcoreekyc__quit_popupButton), new n2m.f(okAction)).setNegativeButton(activity.getString(R.string.tdcoreekyc__common_popupButton_cancel), new n2m.g()).setCancelable(false).show();
    }

    public static final efm.r P(efm.r rVar, fif.g gVar, AtomicReference cache) {
        Intrinsics.checkNotNullParameter(rVar, "<this>");
        Intrinsics.checkNotNullParameter(cache, "cache");
        efm.r rVarDoOnNext = rVar.doOnNext(new xg6.k(new l97.t(cache, 2), 22));
        Object obj2 = cache.get();
        Object obj3 = gVar;
        if (obj2 != null) {
            obj3 = obj2;
        }
        efm.r rVarDistinctUntilChanged = rVarDoOnNext.startWith(obj3).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(rVarDistinctUntilChanged, "distinctUntilChanged(...)");
        return rVarDistinctUntilChanged;
    }

    public static final BigDecimal Q(BigDecimal bigDecimal) {
        Intrinsics.checkNotNullParameter(bigDecimal, "<this>");
        if (bigDecimal.scale() <= 0 || !Intrinsics.f(bigDecimal.unscaledValue().mod(BigInteger.TEN), BigInteger.ZERO)) {
            return bigDecimal;
        }
        BigDecimal scale = bigDecimal.setScale(bigDecimal.scale() - 1);
        Intrinsics.h(scale);
        return scale;
    }

    public static final BigDecimal R(BigDecimal bigDecimal) {
        Intrinsics.checkNotNullParameter(bigDecimal, "<this>");
        BigDecimal bigDecimal2 = bigDecimal.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : bigDecimal.stripTrailingZeros();
        if (bigDecimal2.scale() < 0) {
            bigDecimal2 = bigDecimal2.setScale(0);
        }
        Intrinsics.h(bigDecimal2);
        return bigDecimal2;
    }

    public static final cdd.c S(gdd.c signInResponse) {
        gdd.g eVar;
        cdd.b bVar;
        do3.s sVar;
        Intrinsics.checkNotNullParameter(signInResponse, "<this>");
        gdd.g.Companion.getClass();
        Intrinsics.checkNotNullParameter(signInResponse, "signInResponse");
        gdd.j jVarD = signInResponse.getToken();
        do3.s sVar2 = null;
        if (jVarD == null) {
            eVar = null;
        } else {
            gdd.a aVarC = signInResponse.getRegisteredIdentity();
            if (aVarC != null) {
                eVar = new gdd.f(aVarC, jVarD);
            } else {
                String ownerId = jVarD.getOwnerId();
                gdd.k kVarF = signInResponse.getWaitlist();
                eVar = new gdd.e(ownerId, jVarD, kVarF != null ? kVarF.getCountry() : null);
            }
        }
        int i = 0;
        if (eVar == null) {
            String strB = signInResponse.getNextStep();
            String strA = signInResponse.getChannel();
            String strE = signInResponse.getValue();
            boolean z = signInResponse.getRegisteredIdentity() != null;
            boolean z3 = signInResponse.getToken() != null;
            boolean z4 = signInResponse.getWaitlist() != null;
            StringBuilder sbM = v0.a.m("Illegal dto state: nextStep=", strB, ", channel=", strA, ", value=");
            sbM.append(strE);
            sbM.append(", hasRegisteredIdentity=");
            sbM.append(z);
            sbM.append(", hasToken=");
            sbM.append(z3);
            sbM.append(", hasWaitlist=");
            sbM.append(z4);
            throw new IllegalStateException(sbM.toString());
        }
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        if (eVar instanceof gdd.f) {
            gdd.a aVar = ((gdd.f) eVar).f143160a;
            Intrinsics.checkNotNullParameter(aVar, "<this>");
            String strB2 = aVar.getId();
            String value = aVar.getId();
            Intrinsics.checkNotNullParameter(value, "value");
            String strD = aVar.getState();
            do3.s[] sVarArrValues = do3.s.values();
            int length = sVarArrValues.length;
            while (true) {
                if (i >= length) {
                    sVar = null;
                    break;
                }
                do3.s sVar3 = sVarArrValues[i];
                if (kotlin.text.a0.z(sVar3.name(), strD, true)) {
                    sVar = sVar3;
                    break;
                }
                i++;
            }
            bVar = new cdd.b(strB2, value, sVar, new Address(null, null, null, null, null, aVar.getCountry(), null, null, null, null, null, null, null, null, null, 32735, null), aVar.getRequiresOnboarding());
        } else {
            if (!(eVar instanceof gdd.e)) {
                throw new NoWhenBranchMatchedException();
            }
            gdd.e eVar2 = (gdd.e) eVar;
            String str = eVar2.f143157a;
            String str2 = eVar2.f143159c;
            bVar = new cdd.b(str, sVar2, str2 != null ? new Address(null, null, null, null, null, str2, null, null, null, null, null, null, null, null, null, 32735, null) : null);
        }
        gdd.j token = eVar.getToken();
        Intrinsics.checkNotNullParameter(token, "<this>");
        String accessCode = token.getAccessCode();
        String refreshCode = token.getRefreshCode();
        long expiryDate = token.getExpiryDate();
        String value2 = token.getOwnerId();
        Intrinsics.checkNotNullParameter(value2, "value");
        return new cdd.c(bVar, new cdd.a(expiryDate, accessCode, refreshCode, value2));
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0260  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.revolut.feature.store.api.model.StoreDealsLayout T(f2e.s0 r25) {
        /*
            Method dump skipped, instruction units count: 625
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: d9.e1.T(f2e.s0):com.revolut.feature.store.api.model.StoreDealsLayout");
    }

    public static final d0j.h U(ntj.r rVar) {
        d0j.n nVar;
        Intrinsics.checkNotNullParameter(rVar, "<this>");
        String str = rVar.f219115a;
        String str2 = rVar.f219116b;
        String str3 = rVar.f219117c;
        String str4 = rVar.d;
        d0j.n[] nVarArrValues = d0j.n.values();
        int length = nVarArrValues.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                nVar = null;
                break;
            }
            nVar = nVarArrValues[i];
            if (kotlin.text.a0.z(nVar.name(), str4, true)) {
                break;
            }
            i++;
        }
        if (nVar == null) {
            nVar = d0j.n.UNKNOWN;
        }
        d0j.n nVar2 = nVar;
        String str5 = rVar.e;
        Long l2 = rVar.f;
        Instant instantOfEpochMilli = l2 != null ? Instant.ofEpochMilli(l2.longValue()) : null;
        Long l3 = rVar.f219118g;
        Instant instantOfEpochMilli2 = l3 != null ? Instant.ofEpochMilli(l3.longValue()) : null;
        Integer num = rVar.f219119h;
        ntj.q qVar = rVar.i;
        d0j.g gVar = qVar != null ? new d0j.g(qVar.f219111a, qVar.f219112b) : null;
        Boolean bool = rVar.f219120j;
        boolean zBooleanValue = bool != null ? bool.booleanValue() : true;
        Boolean bool2 = rVar.k;
        return new d0j.h(str, str2, str3, nVar2, str5, instantOfEpochMilli, instantOfEpochMilli2, num, gVar, zBooleanValue, bool2 != null ? bool2.booleanValue() : true);
    }

    public static final d0j.h V(ttj.u uVar) {
        d0j.n nVar;
        Intrinsics.checkNotNullParameter(uVar, "<this>");
        String str = uVar.f274410a;
        String str2 = uVar.f274411b;
        String str3 = uVar.f274412c;
        String str4 = uVar.d;
        d0j.n[] nVarArrValues = d0j.n.values();
        int length = nVarArrValues.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                nVar = null;
                break;
            }
            nVar = nVarArrValues[i];
            if (kotlin.text.a0.z(nVar.name(), str4, true)) {
                break;
            }
            i++;
        }
        if (nVar == null) {
            nVar = d0j.n.UNKNOWN;
        }
        d0j.n nVar2 = nVar;
        String str5 = uVar.e;
        Long l2 = uVar.f;
        Instant instantOfEpochMilli = l2 != null ? Instant.ofEpochMilli(l2.longValue()) : null;
        Long l3 = uVar.f274413g;
        Instant instantOfEpochMilli2 = l3 != null ? Instant.ofEpochMilli(l3.longValue()) : null;
        Integer num = uVar.f274414h;
        ttj.t tVar = uVar.i;
        d0j.g gVar = tVar != null ? new d0j.g(tVar.f274404a, tVar.f274405b) : null;
        Boolean bool = uVar.f274415j;
        boolean zBooleanValue = bool != null ? bool.booleanValue() : true;
        Boolean bool2 = uVar.k;
        return new d0j.h(str, str2, str3, nVar2, str5, instantOfEpochMilli, instantOfEpochMilli2, num, gVar, zBooleanValue, bool2 != null ? bool2.booleanValue() : true);
    }

    public static final nl4.e W(un4.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        boolean zA = aVar.getActive();
        dj0.d dVarO = mo3.a.o(aVar.getThreshold());
        return new nl4.e(zA, aVar.getPeriodEndDate(), mo3.a.o(aVar.getSpend()), dVarO, aVar.getEligible());
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public static final xdb.v X(qdb.m r18) {
        /*
            Method dump skipped, instruction units count: 216
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: d9.e1.X(qdb.m):xdb.v");
    }

    public static final ntj.r Y(d0j.h hVar) {
        Intrinsics.checkNotNullParameter(hVar, "<this>");
        String str = hVar.f110399a;
        String str2 = hVar.f110400b;
        String str3 = hVar.f110401c;
        String strName = hVar.d.name();
        String str4 = hVar.e;
        Instant instant = hVar.f;
        Long lValueOf = instant != null ? Long.valueOf(instant.toEpochMilli()) : null;
        Instant instant2 = hVar.f110402g;
        Long lValueOf2 = instant2 != null ? Long.valueOf(instant2.toEpochMilli()) : null;
        Integer num = hVar.f110403h;
        d0j.g gVar = hVar.i;
        return new ntj.r(str, str2, str3, strName, str4, lValueOf, lValueOf2, num, gVar != null ? new ntj.q(gVar.f110396a, gVar.f110397b) : null, Boolean.valueOf(hVar.f110404j), Boolean.valueOf(hVar.k));
    }

    public static final BigDecimal Z(BigDecimal bigDecimal) {
        Intrinsics.checkNotNullParameter(bigDecimal, "<this>");
        BigDecimal scale = bigDecimal.multiply(new BigDecimal(100)).setScale(2, RoundingMode.HALF_EVEN);
        Intrinsics.checkNotNullExpressionValue(scale, "setScale(...)");
        return scale;
    }

    public static final CancellationException a(String str, Throwable th10) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th10);
        return cancellationException;
    }

    public static PercentageClause a0(Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "<this>");
        BigDecimal percent = (BigDecimal) pair.f186385a;
        wi0.b countryCode = (wi0.b) pair.f186386b;
        Intrinsics.checkNotNullParameter(percent, "percent");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        return new PercentageClause(percent, new PercentageClause.Format.Custom(ky4.d.b(countryCode), 12, null, null, ky4.d.c(countryCode)), (Style) null);
    }

    public static final dj0.d b(Payment payment) {
        Intrinsics.checkNotNullParameter(payment, "<this>");
        f1 f1Var = payment.f75272a;
        PriceWithLabel priceWithLabel = payment.f75273b;
        int i = kl7.e1.f185310a[f1Var.ordinal()];
        if (i == 1) {
            return pyd.c.k(priceWithLabel.f75296b, 12L);
        }
        if (i == 2) {
            return priceWithLabel.f75296b;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final x53.a b0(ni0.e eVar) {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        PaymentCardRecognitionResult paymentCardRecognitionResult = eVar.f215614a;
        String pan = paymentCardRecognitionResult.getPan();
        Intrinsics.checkNotNullExpressionValue(pan, "getPan(...)");
        CreditCardExpirationDate creditCardExpirationDate = paymentCardRecognitionResult.getCreditCardExpirationDate();
        mh0.a aVar = creditCardExpirationDate != null ? new mh0.a(creditCardExpirationDate.getMonth(), creditCardExpirationDate.getYear()) : null;
        Integer numValueOf = aVar != null ? Integer.valueOf(aVar.f205343a) : null;
        CreditCardExpirationDate creditCardExpirationDate2 = paymentCardRecognitionResult.getCreditCardExpirationDate();
        mh0.a aVar2 = creditCardExpirationDate2 != null ? new mh0.a(creditCardExpirationDate2.getMonth(), creditCardExpirationDate2.getYear()) : null;
        return e(pan, numValueOf, aVar2 != null ? Integer.valueOf(aVar2.f205344b) : null);
    }

    public static String c(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        String string = "";
        boolean z = true;
        for (char c2 : str.toCharArray()) {
            if (z && Character.isLetter(c2)) {
                StringBuilder sbS = p.a.s(string);
                sbS.append(Character.toUpperCase(c2));
                string = sbS.toString();
                z = false;
            } else {
                if (Character.isWhitespace(c2)) {
                    z = true;
                }
                string = string + c2;
            }
        }
        return string;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final ogd.k c0(java.lang.String r3) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "-"
            java.lang.String[] r0 = new java.lang.String[]{r0}
            r1 = 6
            r2 = 0
            java.util.List r3 = kotlin.text.d0.n0(r3, r0, r2, r1)
            ogd.k r0 = new ogd.k
            java.lang.Object r1 = zhm.d0.e0(r2, r3)
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto L6b
            int r2 = r1.hashCode()
            switch(r2) {
                case -1997548570: goto L5f;
                case -1727016134: goto L53;
                case -1553760711: goto L47;
                case 77381929: goto L3b;
                case 803668952: goto L2f;
                case 1541034953: goto L23;
                default: goto L22;
            }
        L22:
            goto L6b
        L23:
            java.lang.String r2 = "24H_change"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L2c
            goto L6b
        L2c:
            ogd.m r1 = ogd.m.CHANGE_24H
            goto L6d
        L2f:
            java.lang.String r2 = "Alphabetical"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L38
            goto L6b
        L38:
            ogd.m r1 = ogd.m.ALPHABETICAL
            goto L6d
        L3b:
            java.lang.String r2 = "Price"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L44
            goto L6b
        L44:
            ogd.m r1 = ogd.m.PRICE
            goto L6d
        L47:
            java.lang.String r2 = "PriceChange"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L50
            goto L6b
        L50:
            ogd.m r1 = ogd.m.PRICE_CHANGE
            goto L6d
        L53:
            java.lang.String r2 = "Volume"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L5c
            goto L6b
        L5c:
            ogd.m r1 = ogd.m.VOLUME
            goto L6d
        L5f:
            java.lang.String r2 = "Manual"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L68
            goto L6b
        L68:
            ogd.m r1 = ogd.m.MANUAL
            goto L6d
        L6b:
            ogd.m r1 = ogd.m.MANUAL
        L6d:
            r2 = 1
            java.lang.Object r3 = zhm.d0.e0(r2, r3)
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r2 = "ascending"
            boolean r2 = kotlin.jvm.internal.Intrinsics.f(r3, r2)
            if (r2 == 0) goto L7f
            ogd.l r3 = ogd.l.ASCENDING
            goto L8b
        L7f:
            java.lang.String r2 = "descending"
            boolean r3 = kotlin.jvm.internal.Intrinsics.f(r3, r2)
            if (r3 == 0) goto L8a
            ogd.l r3 = ogd.l.DESCENDING
            goto L8b
        L8a:
            r3 = 0
        L8b:
            r0.<init>(r1, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: d9.e1.c0(java.lang.String):ogd.k");
    }

    public static final LinkedHashMap d(Throwable th10) {
        Intrinsics.checkNotNullParameter(th10, "<this>");
        Intrinsics.checkNotNullParameter(th10, "<this>");
        Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap());
        ArrayDeque arrayDeque = new ArrayDeque();
        ArrayList arrayList = new ArrayList();
        arrayDeque.addLast(th10);
        while (!arrayDeque.isEmpty()) {
            Throwable th11 = (Throwable) arrayDeque.removeFirst();
            if (setNewSetFromMap.add(th11)) {
                if (th11 instanceof rd0.f) {
                    arrayList.add(((rd0.f) th11).f253312a);
                }
                if (th11 instanceof CompositeException) {
                    List list = ((CompositeException) th11).f163108a;
                    Intrinsics.checkNotNullExpressionValue(list, "getExceptions(...)");
                    Iterator it8 = list.iterator();
                    while (it8.hasNext()) {
                        arrayDeque.addLast((Throwable) it8.next());
                    }
                } else if (th11 instanceof io.reactivex.rxjava3.exceptions.CompositeException) {
                    List list2 = ((io.reactivex.rxjava3.exceptions.CompositeException) th11).f163118a;
                    Intrinsics.checkNotNullExpressionValue(list2, "getExceptions(...)");
                    Iterator it9 = list2.iterator();
                    while (it9.hasNext()) {
                        arrayDeque.addLast((Throwable) it9.next());
                    }
                } else if (th11 instanceof com.revolut.rxdata.core.CompositeException) {
                    Iterator it10 = ((com.revolut.rxdata.core.CompositeException) th11).f104678a.iterator();
                    while (it10.hasNext()) {
                        arrayDeque.addLast((Throwable) it10.next());
                    }
                    Throwable cause = th11.getCause();
                    if (cause != null) {
                        arrayDeque.addLast(cause);
                    }
                } else {
                    Throwable cause2 = th11.getCause();
                    if (cause2 != null) {
                        arrayDeque.addLast(cause2);
                    }
                }
                Throwable[] suppressed = th11.getSuppressed();
                Intrinsics.checkNotNullExpressionValue(suppressed, "getSuppressed(...)");
                for (Throwable th12 : suppressed) {
                    arrayDeque.addLast(th12);
                }
            }
        }
        List<rd0.a> listV0 = zhm.d0.V0(arrayList, 8);
        int iB = zhm.q0.b(zhm.w.t(listV0, 10));
        if (iB < 16) {
            iB = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iB);
        for (rd0.a aVar : listV0) {
            String str = aVar.f253307b;
            String str2 = aVar.f253308c;
            String str3 = aVar.d;
            StringBuilder sbM = v0.a.m("ownership_", str, ".", str2, "_");
            sbM.append(str3);
            linkedHashMap.put(sbM.toString(), aVar.f253306a);
        }
        return linkedHashMap;
    }

    public static final com.google.protobuf.w0 d0(com.google.protobuf.g gVar) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        try {
            Class clsE0 = e0(gVar);
            if (clsE0 == null) {
                return null;
            }
            Object objInvoke = clsE0.getMethod("parseFrom", com.google.protobuf.p.class).invoke(null, gVar.getValue());
            Intrinsics.i(objInvoke, "null cannot be cast to non-null type com.google.protobuf.GeneratedMessageLite<*, *>");
            return (com.google.protobuf.w0) objInvoke;
        } catch (Exception e) {
            zhm.h0 h0Var = zhm.h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, "proto", j6.a.q("Can't parse ", gVar.getTypeUrl()), e, h0Var);
            return null;
        }
    }

    public static final x53.a e(String str, Integer num, Integer num2) {
        int iIntValue;
        boolean z = false;
        if (num != null && num2 != null && 1 <= (iIntValue = num.intValue()) && iIntValue < 13) {
            if (LocalDate.now().compareTo((ReadablePartial) new LocalDate(num2.intValue(), num.intValue(), 1).plusMonths(1)) < 0) {
                z = true;
            }
        }
        String strV = null;
        String strV2 = (!z || num == null) ? null : a0.d.v(new Object[]{num}, 1, "%02d", "format(...)");
        if (z && num2 != null) {
            strV = a0.d.v(new Object[]{Integer.valueOf(num2.intValue() % 100)}, 1, "%02d", "format(...)");
        }
        return new x53.a(str, strV2, strV);
    }

    public static final Class e0(com.google.protobuf.g gVar) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        try {
            String typeUrl = gVar.getTypeUrl();
            Intrinsics.checkNotNullExpressionValue(typeUrl, "getTypeUrl(...)");
            String strW0 = kotlin.text.d0.w0('/', typeUrl, typeUrl);
            return Class.forName("com.revolut.tracking.v3." + kotlin.text.d0.v0(strW0, "revolut.tracking.", strW0));
        } catch (Exception e) {
            zhm.h0 h0Var = zhm.h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, "proto", j6.a.q("Can't instantiate type ", gVar.getTypeUrl()), e, h0Var);
            return null;
        }
    }

    public static String f(String str) throws Throwable {
        StringBuilder sb6 = new StringBuilder();
        BufferedReader bufferedReader = null;
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(new URL(str).openConnection()));
            httpURLConnection.setReadTimeout(10000);
            httpURLConnection.setConnectTimeout(15000);
            httpURLConnection.setRequestMethod("GET");
            httpURLConnection.setDoInput(true);
            httpURLConnection.connect();
            if (httpURLConnection.getResponseCode() == 200) {
                BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
                while (true) {
                    try {
                        String line = bufferedReader2.readLine();
                        if (line == null) {
                            break;
                        }
                        sb6.append(line);
                        sb6.append('\n');
                    } catch (Throwable th10) {
                        th = th10;
                        bufferedReader = bufferedReader2;
                        if (bufferedReader != null) {
                            bufferedReader.close();
                        }
                        throw th;
                    }
                }
                bufferedReader = bufferedReader2;
            }
            String string = sb6.toString();
            if (bufferedReader != null) {
                bufferedReader.close();
            }
            return string;
        } catch (Throwable th11) {
            th = th11;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0071, code lost:
    
        if (r13.invoke(r1) == r2) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00f2, code lost:
    
        if (kotlin.Unit.f186387a == r2) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00f4, code lost:
    
        return r2;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object f0(oki.h r10, cjl.s r11, bjl.o0 r12, kotlin.jvm.functions.Function1 r13, kotlin.jvm.functions.Function0 r14, kotlin.jvm.functions.Function0 r15, gim.c r16) {
        /*
            Method dump skipped, instruction units count: 278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: d9.e1.f0(oki.h, cjl.s, bjl.o0, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, gim.c):java.lang.Object");
    }

    public static final ArrayList g(List contentItems, Function1 predicate) {
        Collection collectionL;
        Intrinsics.checkNotNullParameter(contentItems, "contentItems");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        List<dx4.e1> list = contentItems;
        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
        for (dx4.e1 e1Var : list) {
            if (e1Var instanceof g2) {
                collectionL = g(((g2) e1Var).d, predicate);
            } else {
                if (!((Boolean) predicate.invoke(e1Var)).booleanValue()) {
                    e1Var = null;
                }
                collectionL = zhm.v.l(e1Var);
            }
            arrayList.add(collectionL);
        }
        return zhm.w.u(arrayList);
    }

    public static final List h(dx4.e1 e1Var) {
        dx4.l lVar;
        Intrinsics.checkNotNullParameter(e1Var, "<this>");
        if (e1Var instanceof g2) {
            List list = ((g2) e1Var).d;
            ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
            Iterator it8 = list.iterator();
            while (it8.hasNext()) {
                arrayList.add(h((dx4.e1) it8.next()));
            }
            return zhm.w.u(arrayList);
        }
        if (e1Var instanceof x4) {
            x4 x4Var = (x4) e1Var;
            dx4.l[] elements = {x4Var.i, x4Var.k};
            Intrinsics.checkNotNullParameter(elements, "elements");
            return kotlin.collections.d.L(elements);
        }
        if (e1Var instanceof c5) {
            return zhm.v.l(((c5) e1Var).d);
        }
        if (e1Var instanceof p5) {
            ArrayList arrayList2 = ((p5) e1Var).d;
            ArrayList arrayList3 = new ArrayList();
            Iterator it9 = arrayList2.iterator();
            while (it9.hasNext()) {
                dx4.l lVar2 = ((o5) it9.next()).f120705g;
                if (lVar2 != null) {
                    arrayList3.add(lVar2);
                }
            }
            return arrayList3;
        }
        if (e1Var instanceof dx4.x0) {
            LinkedHashMap linkedHashMap = ((dx4.x0) e1Var).f120826c;
            ArrayList arrayList4 = new ArrayList();
            Iterator it10 = linkedHashMap.entrySet().iterator();
            while (it10.hasNext()) {
                dx4.w0 w0Var = (dx4.w0) ((Map.Entry) it10.next()).getValue();
                if (w0Var instanceof dx4.u0) {
                    lVar = ((dx4.u0) w0Var).f120782b;
                } else {
                    if (!(w0Var instanceof dx4.v0)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    lVar = ((dx4.v0) w0Var).f120798b;
                }
                if (lVar != null) {
                    arrayList4.add(lVar);
                }
            }
            return arrayList4;
        }
        if (e1Var instanceof dx4.m) {
            return zhm.u.c(((dx4.m) e1Var).d);
        }
        if (e1Var instanceof dx4.o) {
            return zhm.v.l(((dx4.o) e1Var).e);
        }
        if (e1Var instanceof dx4.r0) {
            return zhm.v.l(((dx4.r0) e1Var).f120739h);
        }
        if (e1Var instanceof i2) {
            return zhm.u.c(((i2) e1Var).d);
        }
        if (e1Var instanceof f4) {
            return zhm.v.l(((f4) e1Var).f120598g);
        }
        if (e1Var instanceof i4) {
            i4 i4Var = (i4) e1Var;
            dx4.l[] elements2 = {i4Var.f120631g, i4Var.f120632h};
            Intrinsics.checkNotNullParameter(elements2, "elements");
            return kotlin.collections.d.L(elements2);
        }
        if (e1Var instanceof r3) {
            return zhm.v.l(((r3) e1Var).f120751g);
        }
        if (e1Var instanceof r4) {
            return zhm.u.c(((r4) e1Var).f120754c);
        }
        if (e1Var instanceof h5) {
            h5 h5Var = (h5) e1Var;
            dx4.l lVar3 = h5Var.e;
            g5 g5Var = h5Var.f;
            dx4.l[] elements3 = {lVar3, g5Var != null ? g5Var.f120609b : null};
            Intrinsics.checkNotNullParameter(elements3, "elements");
            return kotlin.collections.d.L(elements3);
        }
        if (e1Var instanceof i5) {
            i5 i5Var = (i5) e1Var;
            dx4.l[] elements4 = {i5Var.f120637a.e, i5Var.f120638b.e};
            Intrinsics.checkNotNullParameter(elements4, "elements");
            return kotlin.collections.d.L(elements4);
        }
        if (e1Var instanceof j5) {
            j5 j5Var = (j5) e1Var;
            dx4.l[] elements5 = {j5Var.f120641a.e, j5Var.f120642b.e};
            Intrinsics.checkNotNullParameter(elements5, "elements");
            return kotlin.collections.d.L(elements5);
        }
        if (e1Var instanceof a2) {
            List list2 = ((a2) e1Var).e;
            ArrayList arrayList5 = new ArrayList(zhm.w.t(list2, 10));
            Iterator it11 = list2.iterator();
            while (it11.hasNext()) {
                arrayList5.add(((m1) it11.next()).f120676b);
            }
            return arrayList5;
        }
        if (e1Var instanceof l2) {
            return zhm.v.l(((l2) e1Var).f);
        }
        if ((e1Var instanceof m4) || (e1Var instanceof l4) || (e1Var instanceof x1) || (e1Var instanceof x5) || (e1Var instanceof dx4.r) || (e1Var instanceof dx4.i0) || (e1Var instanceof dx4.l0) || (e1Var instanceof dx4.t0) || (e1Var instanceof w1) || (e1Var instanceof j2) || (e1Var instanceof b3) || (e1Var instanceof k3) || (e1Var instanceof l3) || (e1Var instanceof n3) || (e1Var instanceof p3) || (e1Var instanceof s3) || (e1Var instanceof w3) || (e1Var instanceof x3) || (e1Var instanceof y4) || (e1Var instanceof e5) || (e1Var instanceof b5) || (e1Var instanceof dx4.s0)) {
            return zhm.f0.f322471a;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final Amount i(OrderQuote orderQuote, f8l.b assetPointer) {
        Intrinsics.checkNotNullParameter(orderQuote, "<this>");
        Intrinsics.checkNotNullParameter(assetPointer, "assetPointer");
        int i = b4i.a.f12381a[assetPointer.ordinal()];
        if (i == 1) {
            return orderQuote.f104754c;
        }
        if (i == 2) {
            return orderQuote.e;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final Amount j(OrderQuote orderQuote, f8l.b assetPointer) {
        Intrinsics.checkNotNullParameter(orderQuote, "<this>");
        Intrinsics.checkNotNullParameter(assetPointer, "assetPointer");
        int i = b4i.a.f12381a[assetPointer.ordinal()];
        if (i == 1) {
            return orderQuote.d;
        }
        if (i == 2) {
            return orderQuote.f;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final Asset k(OrderQuote orderQuote) {
        Intrinsics.checkNotNullParameter(orderQuote, "<this>");
        return l(orderQuote).f104718b;
    }

    public static final Amount l(OrderQuote orderQuote) {
        Intrinsics.checkNotNullParameter(orderQuote, "<this>");
        return i(orderQuote, orderQuote.f104753b);
    }

    public static final Amount m(OrderQuote orderQuote) {
        Intrinsics.checkNotNullParameter(orderQuote, "<this>");
        Intrinsics.checkNotNullParameter(orderQuote, "<this>");
        Amount amountJ = j(orderQuote, orderQuote.f104753b);
        return amountJ == null ? l(orderQuote) : amountJ;
    }

    public static twg.c n(Context context, String str, String str2) {
        NetworkInfo activeNetworkInfo;
        SharedPreferences sharedPreferences = context.getSharedPreferences("device_names", 0);
        String strO = com.google.android.gms.internal.mlkit_vision_face.a.o(str, ":", str2);
        Object obj2 = null;
        String string = sharedPreferences.getString(strO, null);
        if (string != null) {
            try {
                return new twg.c(new JSONObject(string));
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        if (context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") != 0 || ((activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo()) != null && activeNetworkInfo.isConnected())) {
            try {
                JSONArray jSONArray = new JSONArray(f("https://raw.githubusercontent.com/jaredrummler/AndroidDeviceNames/master/json/devices/" + str.toLowerCase(Locale.ENGLISH) + ".json"));
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    twg.c cVar = new twg.c(jSONObject);
                    String str3 = (String) cVar.f275019c;
                    if ((str.equalsIgnoreCase(str3) && str2 == null) || (str.equalsIgnoreCase(str3) && str2.equalsIgnoreCase((String) cVar.d))) {
                        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                        editorEdit.putString(strO, jSONObject.toString());
                        editorEdit.apply();
                        return cVar;
                    }
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        if (str.equals(Build.DEVICE)) {
            String str4 = Build.MODEL;
            if (str2.equals(str4)) {
                return new twg.c(Build.MANUFACTURER, o(c(str4)), str, str2);
            }
        }
        return new twg.c(obj2, obj2, str, str2);
    }

    public static String o(String str) {
        String str2 = Build.DEVICE;
        String str3 = Build.MODEL;
        if (str2 != null && (str2.equals("acer_harley") || str2.equals("acer_harleyfhd"))) {
            return "Iconia Tab 10";
        }
        if (str3 != null && (str3.equals("A3-A20") || str3.equals("A3-A20FHD"))) {
            return "Iconia Tab 10";
        }
        if (str2 != null && (str2.equals("acer_aprilia") || str2.equals("acer_apriliahd"))) {
            return "Iconia Tab 7";
        }
        if (str3 != null && (str3.equals("A1-713") || str3.equals("A1-713HD"))) {
            return "Iconia Tab 7";
        }
        if (str2 != null && (str2.equals("ducati2fhd") || str2.equals("ducati2hd") || str2.equals("ducati2hd3g"))) {
            return "Iconia Tab 8";
        }
        if (str3 != null && (str3.equals("A1-840") || str3.equals("A1-840FHD") || str3.equals("A1-841"))) {
            return "Iconia Tab 8";
        }
        if (str2 != null && str2.equals("a1")) {
            return "Liquid";
        }
        if (str3 != null && (str3.equals("Acer Liquid") || str3.equals("Acer S100"))) {
            return "Liquid";
        }
        if (str2 != null && (str2.equals("acer_e3") || str2.equals("acer_e3n"))) {
            return "Liquid E3";
        }
        if (str3 != null && str3.equals("E380")) {
            return "Liquid E3";
        }
        if (str2 != null && str2.equals("acer_S55")) {
            return "Liquid Jade";
        }
        if (str3 != null && str3.equals("S55")) {
            return "Liquid Jade";
        }
        if (str2 != null && str2.equals("acer_S56")) {
            return "Liquid Jade S";
        }
        if (str3 != null && str3.equals("S56")) {
            return "Liquid Jade S";
        }
        if (str2 != null && str2.equals("s3")) {
            return "Liquid S3";
        }
        if (str3 != null && str3.equals("S53")) {
            return "Liquid S3";
        }
        if (str2 != null && str2.equals("acer_ZXL")) {
            return "Liquid Z5";
        }
        if (str3 != null && str3.equals("Z150")) {
            return "Liquid Z5";
        }
        if (str2 != null && str2.equals("K013C")) {
            return "MeMO Pad 7";
        }
        if (str3 != null && str3.equals("K013C")) {
            return "MeMO Pad 7";
        }
        if (str2 != null && (str2.equals("grouper") || str2.equals("tilapia"))) {
            return "Nexus 7 (2012)";
        }
        if (str2 != null && (str2.equals("deb") || str2.equals("flo"))) {
            return "Nexus 7 (2013)";
        }
        if (str2 != null && (str2.equals("ASUS_T00F") || str2.equals("ASUS_T00J"))) {
            return "ZenFone 5";
        }
        if (str3 != null && (str3.equals("ASUS_T00F") || str3.equals("ASUS_T00J"))) {
            return "ZenFone 5";
        }
        if (str2 != null && (str2.equals("LW") || str2.equals("Venue7") || str2.equals("thunderbird"))) {
            return "Venue 7";
        }
        if (str3 != null && (str3.equals("Venue 7 3730") || str3.equals("Venue 7 3740") || str3.equals("Venue 7 3741") || str3.equals("Venue 7 HSPA+") || str3.equals("Venue7 3740") || str3.equals("Venue7 3740 LTE"))) {
            return "Venue 7";
        }
        if (str2 != null && (str2.equals("BB") || str2.equals("Venue8") || str2.equals("yellowtail"))) {
            return "Venue 8";
        }
        if (str3 != null && (str3.equals("Venue 8 3830") || str3.equals("Venue 8 3840") || str3.equals("Venue 8 7840") || str3.equals("Venue 8 7840 LTE") || str3.equals("Venue 8 HSPA+") || str3.equals("Venue8 3840") || str3.equals("Venue8 3840 LTE"))) {
            return "Venue 8";
        }
        if (str2 != null && str2.equals("sailfish")) {
            return "Pixel";
        }
        if (str2 != null && str2.equals("dragon")) {
            return "Pixel C";
        }
        if (str2 != null && str2.equals("marlin")) {
            return "Pixel XL";
        }
        if (str2 != null && (str2.equals("m7") || str2.equals("m7cdtu") || str2.equals("m7cdug") || str2.equals("m7cdwg") || str2.equals("m7wls") || str2.equals("m7wlv"))) {
            return "HTC One";
        }
        if (str3 != null && (str3.equals("HTC 801e") || str3.equals("HTC 802d") || str3.equals("HTC 802t") || str3.equals("HTC 802t 16GB") || str3.equals("HTC 802w") || str3.equals("HTC One 801e") || str3.equals("HTC One dual 802d") || str3.equals("HTC One dual sim") || str3.equals("HTC6500LVW") || str3.equals("HTCONE") || str3.equals("HTC_PN071"))) {
            return "HTC One";
        }
        if (str2 != null && (str2.equals("htc_mecdwg") || str2.equals("htc_mectl") || str2.equals("htc_mecul") || str2.equals("htc_mecwhl"))) {
            return "HTC One (E8)";
        }
        if (str3 != null && (str3.equals("0PAJ5") || str3.equals("HTC M8Sd") || str3.equals("HTC M8St") || str3.equals("HTC One_E8") || str3.equals("HTC_M8Sx"))) {
            return "HTC One (E8)";
        }
        if (str2 != null && (str2.equals("htc_m8") || str2.equals("htc_m8dug") || str2.equals("htc_m8dwg") || str2.equals("htc_m8whl") || str2.equals("htc_m8wl"))) {
            return "HTC One (M8)";
        }
        if (str3 != null && (str3.equals("831C") || str3.equals("HTC M8d") || str3.equals("HTC M8w") || str3.equals("HTC One_M8") || str3.equals("HTC One_M8 dual sim") || str3.equals("HTC6525LVW") || str3.equals("HTC_0P6B") || str3.equals("HTC_0P6B6") || str3.equals("HTC_M8x"))) {
            return "HTC One (M8)";
        }
        if (str2 != null && (str2.equals("htc_hiaetuhl") || str2.equals("htc_hiaeuhl") || str2.equals("htc_hiaeul") || str2.equals("htc_hiaewhl"))) {
            return "HTC One A9";
        }
        if (str3 != null && (str3.equals("2PQ93") || str3.equals("HTC A9w") || str3.equals("HTC_A9u"))) {
            return "HTC One A9";
        }
        if (str2 != null && (str2.equals("htc_himauhl") || str2.equals("htc_himaul") || str2.equals("htc_himaulatt") || str2.equals("htc_himawhl") || str2.equals("htc_himawl"))) {
            return "HTC One M9";
        }
        if (str3 != null && (str3.equals("0PJA10") || str3.equals("0PJA2") || str3.equals("HTC 0PJA10") || str3.equals("HTC6535LRA") || str3.equals("HTC6535LVW") || str3.equals("HTC_0PJA10") || str3.equals("HTC_M9u"))) {
            return "HTC One M9";
        }
        if (str2 != null && (str2.equals("ville") || str2.equals("villec2"))) {
            return "HTC One S";
        }
        if (str3 != null && (str3.equals("HTC VLE_U") || str3.equals("HTC Z560e"))) {
            return "HTC One S";
        }
        if (str2 != null && str2.equals("flounder")) {
            return "Nexus 9";
        }
        if (str2 != null && (str2.equals("hwH30-T10") || str2.equals("hwH30-U10") || str2.equals("hwhn3-u00") || str2.equals("hwhn3-u01"))) {
            return "Honor3";
        }
        if (str3 != null && (str3.equals("H30-T10") || str3.equals("H30-U10") || str3.equals("HUAWEI HN3-U00") || str3.equals("HUAWEI HN3-U01"))) {
            return "Honor3";
        }
        if (str2 != null && str2.equals("HWCRR")) {
            return "Mate S";
        }
        if (str3 != null && (str3.equals("HUAWEI CRR-CL00") || str3.equals("HUAWEI CRR-CL20") || str3.equals("HUAWEI CRR-L09") || str3.equals("HUAWEI CRR-TL00") || str3.equals("HUAWEI CRR-UL00") || str3.equals("HUAWEI CRR-UL20"))) {
            return "Mate S";
        }
        if (str2 != null && str2.equals("angler")) {
            return "Nexus 6P";
        }
        if (str2 != null && str2.equals("zee")) {
            return "LG G Flex";
        }
        if (str3 != null && (str3.equals("LG-D950") || str3.equals("LG-D950G") || str3.equals("LG-D951") || str3.equals("LG-D955") || str3.equals("LG-D956") || str3.equals("LG-D958") || str3.equals("LG-D959") || str3.equals("LG-F340K") || str3.equals("LG-F340L") || str3.equals("LG-F340S") || str3.equals("LG-LS995") || str3.equals("LGL23"))) {
            return "LG G Flex";
        }
        if (str2 != null && str2.equals("z2")) {
            return "LG G Flex2";
        }
        if (str3 != null && (str3.equals("LG-F510K") || str3.equals("LG-F510L") || str3.equals("LG-F510S") || str3.equals("LG-H950") || str3.equals("LG-H955") || str3.equals("LG-H959") || str3.equals("LGAS995") || str3.equals("LGLS996") || str3.equals("LGUS995"))) {
            return "LG G Flex2";
        }
        if (str2 != null && str2.equals("g2")) {
            return "LG G2";
        }
        if (str3 != null && (str3.equals("LG-D800") || str3.equals("LG-D801") || str3.equals("LG-D802") || str3.equals("LG-D802T") || str3.equals("LG-D802TR") || str3.equals("LG-D803") || str3.equals("LG-D805") || str3.equals("LG-D806") || str3.equals("LG-F320K") || str3.equals("LG-F320L") || str3.equals("LG-F320S") || str3.equals("LG-LS980") || str3.equals("VS980 4G"))) {
            return "LG G2";
        }
        if (str2 != null && str2.equals("g3")) {
            return "LG G3";
        }
        if (str3 != null && (str3.equals("AS985") || str3.equals("LG-AS990") || str3.equals("LG-D850") || str3.equals("LG-D851") || str3.equals("LG-D852") || str3.equals("LG-D852G") || str3.equals("LG-D855") || str3.equals("LG-D856") || str3.equals("LG-D857") || str3.equals("LG-D858") || str3.equals("LG-D858HK") || str3.equals("LG-D859") || str3.equals("LG-F400K") || str3.equals("LG-F400L") || str3.equals("LG-F400S") || str3.equals("LGL24") || str3.equals("LGLS990") || str3.equals("LGUS990") || str3.equals("LGV31") || str3.equals("VS985 4G"))) {
            return "LG G3";
        }
        if (str2 != null && str2.equals("p1")) {
            return "LG G4";
        }
        if (str3 != null && (str3.equals("AS986") || str3.equals("LG-AS811") || str3.equals("LG-AS991") || str3.equals("LG-F500K") || str3.equals("LG-F500L") || str3.equals("LG-F500S") || str3.equals("LG-H810") || str3.equals("LG-H811") || str3.equals("LG-H812") || str3.equals("LG-H815") || str3.equals("LG-H818") || str3.equals("LG-H819") || str3.equals("LGLS991") || str3.equals("LGUS991") || str3.equals("LGV32") || str3.equals("VS986"))) {
            return "LG G4";
        }
        if (str2 != null && (str2.equals("c50") || str2.equals("c50ds") || str2.equals("c50n"))) {
            return "LG Leon 4G LTE";
        }
        if (str3 != null && (str3.equals("LG-H340") || str3.equals("LG-H340AR") || str3.equals("LG-H340GT") || str3.equals("LG-H340n") || str3.equals("LG-H342") || str3.equals("LG-H343") || str3.equals("LGMS345"))) {
            return "LG Leon 4G LTE";
        }
        if (str2 != null && str2.equals("m1ds")) {
            return "LG M1";
        }
        if (str3 != null && str3.equals("LG-K332")) {
            return "LG M1";
        }
        if (str2 != null && str2.equals("cosmopolitan")) {
            return "LG Optimus 3D";
        }
        if (str3 != null && (str3.equals("LG-P920") || str3.equals("LG-P925g") || str3.equals("LG-SU760"))) {
            return "LG Optimus 3D";
        }
        if (str2 != null && (str2.equals("geeb") || str2.equals("geehdc") || str2.equals("geehrc") || str2.equals("geehrc4g"))) {
            return "LG Optimus G";
        }
        if (str3 != null && (str3.equals("L-01E") || str3.equals("LG-E970") || str3.equals("LG-E971") || str3.equals("LG-E973") || str3.equals("LG-E975") || str3.equals("LG-E975K") || str3.equals("LG-E975T") || str3.equals("LG-E976") || str3.equals("LG-E977") || str3.equals("LG-E987") || str3.equals("LG-F180K") || str3.equals("LG-F180L") || str3.equals("LG-F180S") || str3.equals("LG-LS970") || str3.equals("LGL21"))) {
            return "LG Optimus G";
        }
        if (str2 != null && (str2.equals("geefhd") || str2.equals("geefhd4g"))) {
            return "LG Optimus G Pro";
        }
        if (str3 != null && (str3.equals("LG-E980") || str3.equals("LG-E980h") || str3.equals("LG-E981h") || str3.equals("LG-E986") || str3.equals("LG-E988") || str3.equals("LG-E989") || str3.equals("LG-F240K") || str3.equals("LG-F240L") || str3.equals("LG-F240S"))) {
            return "LG Optimus G Pro";
        }
        if (str2 != null && str2.equals("u2")) {
            return "LG Optimus L9";
        }
        if (str3 != null && (str3.equals("LG-D700") || str3.equals("LG-P760") || str3.equals("LG-P765") || str3.equals("LG-P768") || str3.equals("LG-P769") || str3.equals("LG-P778") || str3.equals("LGMS769"))) {
            return "LG Optimus L9";
        }
        if (str2 != null && str2.equals("mako")) {
            return "Nexus 4";
        }
        if (str2 != null && str2.equals("hammerhead")) {
            return "Nexus 5";
        }
        if (str2 != null && str2.equals("bullhead")) {
            return "Nexus 5X";
        }
        if (str2 != null && (str2.equals("p990") || str2.equals("p990_262-xx") || str2.equals("p990_CIS-xxx") || str2.equals("p990_EUR-xx") || str2.equals("p990hN") || str2.equals("p999") || str2.equals("star") || str2.equals("star_450-05") || str2.equals("su660"))) {
            return "Optimus 2X";
        }
        if (str3 != null && (str3.equals("LG-P990") || str3.equals("LG-P990H") || str3.equals("LG-P990h") || str3.equals("LG-P990hN") || str3.equals("LG-P999") || str3.equals("LG-SU660"))) {
            return "Optimus 2X";
        }
        if (str2 != null && (str2.equals("cosmo_450-05") || str2.equals("cosmo_EUR-XXX") || str2.equals("cosmo_MEA-XXX") || str2.equals("p920") || str2.equals("su760"))) {
            return "Optimus 3D";
        }
        if (str3 != null && (str3.equals("LG-P920") || str3.equals("LG-P920h") || str3.equals("LG-SU760"))) {
            return "Optimus 3D";
        }
        if (str2 != null && str2.equals("cx2")) {
            return "Optimus 3D MAX";
        }
        if (str3 != null && (str3.equals("LG-P720") || str3.equals("LG-P720h") || str3.equals("LG-P725") || str3.equals("LG-SU870"))) {
            return "Optimus 3D MAX";
        }
        if (str2 != null && (str2.equals("LGL85C") || str2.equals("black") || str2.equals("blackg") || str2.equals("bproj_214-03") || str2.equals("bproj_262-XXX") || str2.equals("bproj_302-220") || str2.equals("bproj_334-020") || str2.equals("bproj_724-xxx") || str2.equals("bproj_ARE-XXX") || str2.equals("bproj_EUR-XXX") || str2.equals("bproj_sea-xxx") || str2.equals("ku5900") || str2.equals("lgp970"))) {
            return "Optimus Black";
        }
        if (str3 != null && (str3.equals("LG-KU5900") || str3.equals("LG-P970") || str3.equals("LG-P970g") || str3.equals("LG-P970h") || str3.equals("LGL85C"))) {
            return "Optimus Black";
        }
        if (str2 != null && str2.equals("m4")) {
            return "Optimus L5";
        }
        if (str3 != null && (str3.equals("LG-E610") || str3.equals("LG-E610v") || str3.equals("LG-E612") || str3.equals("LG-E612f") || str3.equals("LG-E612g") || str3.equals("LG-E617G") || str3.equals("LG-L40G"))) {
            return "Optimus L5";
        }
        if (str2 != null && (str2.equals("i_dcm") || str2.equals("i_skt") || str2.equals("i_u") || str2.equals("iproj") || str2.equals("lgp930") || str2.equals("lgp935"))) {
            return "Optimus LTE";
        }
        if (str3 != null && (str3.equals("L-01D") || str3.equals("LG-LU6200") || str3.equals("LG-P930") || str3.equals("LG-P935") || str3.equals("LG-P936") || str3.equals("LG-SU640"))) {
            return "Optimus LTE";
        }
        if (str2 != null && (str2.equals("ku3700") || str2.equals("lu3700") || str2.equals("su370") || str2.equals("thunder_kor-05") || str2.equals("thunder_kor-08") || str2.equals("thunderc"))) {
            return "Optimus One";
        }
        if (str3 != null && (str3.equals("LG-CX670") || str3.equals("LG-KU3700") || str3.equals("LG-LU3700") || str3.equals("LG-LW690") || str3.equals("LG-MS690") || str3.equals("LG-SU370") || str3.equals("LG-US670") || str3.equals("LS670") || str3.equals("VM670") || str3.equals("Vortex") || str3.equals("thunderc"))) {
            return "Optimus One";
        }
        if (str2 != null && (str2.equals("l06c") || str2.equals("v900") || str2.equals("v900asia") || str2.equals("v901ar") || str2.equals("v901kr") || str2.equals("v901tr") || str2.equals("v905r") || str2.equals("v909") || str2.equals("v909mkt"))) {
            return "Optimus Pad";
        }
        if (str3 != null && (str3.equals("L-06C") || str3.equals("LG-V900") || str3.equals("LG-V901") || str3.equals("LG-V905R") || str3.equals("LG-V909"))) {
            return "Optimus Pad";
        }
        if (str2 != null && str2.equals("A7-30GC")) {
            return "Lenovo A7-30GC";
        }
        if (str3 != null && str3.equals("Lenovo TAB 2 A7-30GC")) {
            return "Lenovo A7-30GC";
        }
        if (str2 != null && (str2.equals("falcon_cdma") || str2.equals("falcon_umts") || str2.equals("falcon_umtsds"))) {
            return "Moto G (1st Gen)";
        }
        if (str3 != null && (str3.equals("XT1002") || str3.equals("XT1003") || str3.equals("XT1008") || str3.equals("XT1028") || str3.equals("XT1031") || str3.equals("XT1032") || str3.equals("XT1033") || str3.equals("XT1034") || str3.equals("XT937C") || str3.equals("XT939G"))) {
            return "Moto G (1st Gen)";
        }
        if (str2 != null && (str2.equals("titan_udstv") || str2.equals("titan_umts") || str2.equals("titan_umtsds"))) {
            return "Moto G (2nd Gen)";
        }
        if (str3 != null && (str3.equals("XT1063") || str3.equals("XT1064") || str3.equals("XT1068") || str3.equals("XT1069") || str3.equals("titan_niibr_ds") || str3.equals("titan_retbr_dstv"))) {
            return "Moto G (2nd Gen)";
        }
        if (str2 != null && (str2.equals("clark") || str2.equals("clark_ds"))) {
            return "Moto X Style";
        }
        if (str3 != null && (str3.equals("XT1570") || str3.equals("XT1572"))) {
            return "Moto X Style";
        }
        if (str2 != null && str2.equals("shamu")) {
            return "Nexus 6";
        }
        if ((str2 != null && str2.equals("OnePlus")) || (str3 != null && str3.equals("ONE E1003"))) {
            return "OnePlus";
        }
        if (str2 != null && str2.equals("A0001")) {
            return "OnePlus One";
        }
        if (str3 != null && (str3.equals("A0001") || str3.equals("One"))) {
            return "OnePlus One";
        }
        if ((str2 != null && str2.equals("OnePlus2")) || (str3 != null && str3.equals("ONE A2003"))) {
            return "OnePlus2";
        }
        if (str2 != null && (str2.equals("a53g") || str2.equals("a5lte") || str2.equals("a5ltechn") || str2.equals("a5ltectc") || str2.equals("a5ltezh") || str2.equals("a5ltezt") || str2.equals("a5ulte") || str2.equals("a5ultebmc") || str2.equals("a5ultektt") || str2.equals("a5ultelgt") || str2.equals("a5ulteskt"))) {
            return "Galaxy A5";
        }
        if (str3 != null && (str3.equals("SM-A5000") || str3.equals("SM-A5009") || str3.equals("SM-A500F") || str3.equals("SM-A500F1") || str3.equals("SM-A500FU") || str3.equals("SM-A500G") || str3.equals("SM-A500H") || str3.equals("SM-A500K") || str3.equals("SM-A500L") || str3.equals("SM-A500M") || str3.equals("SM-A500S") || str3.equals("SM-A500W") || str3.equals("SM-A500X") || str3.equals("SM-A500XZ") || str3.equals("SM-A500Y") || str3.equals("SM-A500YZ"))) {
            return "Galaxy A5";
        }
        if (str2 != null && (str2.equals("SCV32") || str2.equals("a8elte") || str2.equals("a8elteskt") || str2.equals("a8hplte") || str2.equals("a8ltechn"))) {
            return "Galaxy A8";
        }
        if (str3 != null && (str3.equals("SCV32") || str3.equals("SM-A8000") || str3.equals("SM-A800F") || str3.equals("SM-A800I") || str3.equals("SM-A800IZ") || str3.equals("SM-A800S") || str3.equals("SM-A800X") || str3.equals("SM-A800YZ"))) {
            return "Galaxy A8";
        }
        if (str2 != null && str2.equals("vivaltods5m")) {
            return "Galaxy Ace 4";
        }
        if (str3 != null && (str3.equals("SM-G313HU") || str3.equals("SM-G313HY") || str3.equals("SM-G313M") || str3.equals("SM-G313MY"))) {
            return "Galaxy Ace 4";
        }
        if (str2 != null && (str2.equals("GT-S6352") || str2.equals("GT-S6802") || str2.equals("GT-S6802B") || str2.equals("SCH-I579") || str2.equals("SCH-I589") || str2.equals("SCH-i579") || str2.equals("SCH-i589"))) {
            return "Galaxy Ace Duos";
        }
        if (str3 != null && (str3.equals("GT-S6352") || str3.equals("GT-S6802") || str3.equals("GT-S6802B") || str3.equals("SCH-I589") || str3.equals("SCH-i579") || str3.equals("SCH-i589"))) {
            return "Galaxy Ace Duos";
        }
        if (str2 != null && (str2.equals("GT-S7500") || str2.equals("GT-S7500L") || str2.equals("GT-S7500T") || str2.equals("GT-S7500W") || str2.equals("GT-S7508"))) {
            return "Galaxy Ace Plus";
        }
        if (str3 != null && (str3.equals("GT-S7500") || str3.equals("GT-S7500L") || str3.equals("GT-S7500T") || str3.equals("GT-S7500W") || str3.equals("GT-S7508"))) {
            return "Galaxy Ace Plus";
        }
        if (str2 != null && (str2.equals("heat3gtfnvzw") || str2.equals("heatnfc3g") || str2.equals("heatqlte"))) {
            return "Galaxy Ace Style";
        }
        if (str3 != null && (str3.equals("SM-G310HN") || str3.equals("SM-G357FZ") || str3.equals("SM-S765C") || str3.equals("SM-S766C"))) {
            return "Galaxy Ace Style";
        }
        if (str2 != null && (str2.equals("vivalto3g") || str2.equals("vivalto3mve3g") || str2.equals("vivalto5mve3g") || str2.equals("vivaltolte") || str2.equals("vivaltonfc3g"))) {
            return "Galaxy Ace4";
        }
        if (str3 != null && (str3.equals("SM-G313F") || str3.equals("SM-G313HN") || str3.equals("SM-G313ML") || str3.equals("SM-G313MU") || str3.equals("SM-G316H") || str3.equals("SM-G316HU") || str3.equals("SM-G316M") || str3.equals("SM-G316MY"))) {
            return "Galaxy Ace4";
        }
        if (str2 != null && (str2.equals("core33g") || str2.equals("coreprimelte") || str2.equals("coreprimelteaio") || str2.equals("coreprimeltelra") || str2.equals("coreprimeltespr") || str2.equals("coreprimeltetfnvzw") || str2.equals("coreprimeltevzw") || str2.equals("coreprimeve3g") || str2.equals("coreprimevelte") || str2.equals("cprimeltemtr") || str2.equals("cprimeltetmo") || str2.equals("rossalte") || str2.equals("rossaltectc") || str2.equals("rossaltexsa"))) {
            return "Galaxy Core Prime";
        }
        if (str3 != null && (str3.equals("SAMSUNG-SM-G360AZ") || str3.equals("SM-G3606") || str3.equals("SM-G3608") || str3.equals("SM-G3609") || str3.equals("SM-G360F") || str3.equals("SM-G360FY") || str3.equals("SM-G360GY") || str3.equals("SM-G360H") || str3.equals("SM-G360HU") || str3.equals("SM-G360M") || str3.equals("SM-G360P") || str3.equals("SM-G360R6") || str3.equals("SM-G360T") || str3.equals("SM-G360T1") || str3.equals("SM-G360V") || str3.equals("SM-G361F") || str3.equals("SM-G361H") || str3.equals("SM-G361HU") || str3.equals("SM-G361M") || str3.equals("SM-S820L"))) {
            return "Galaxy Core Prime";
        }
        if (str2 != null && (str2.equals("kanas") || str2.equals("kanas3g") || str2.equals("kanas3gcmcc") || str2.equals("kanas3gctc") || str2.equals("kanas3gnfc"))) {
            return "Galaxy Core2";
        }
        if (str3 != null && (str3.equals("SM-G3556D") || str3.equals("SM-G3558") || str3.equals("SM-G3559") || str3.equals("SM-G355H") || str3.equals("SM-G355HN") || str3.equals("SM-G355HQ") || str3.equals("SM-G355M"))) {
            return "Galaxy Core2";
        }
        if (str2 != null && (str2.equals("e53g") || str2.equals("e5lte") || str2.equals("e5ltetfnvzw") || str2.equals("e5ltetw"))) {
            return "Galaxy E5";
        }
        if (str3 != null && (str3.equals("SM-E500F") || str3.equals("SM-E500H") || str3.equals("SM-E500M") || str3.equals("SM-E500YZ") || str3.equals("SM-S978L"))) {
            return "Galaxy E5";
        }
        if (str2 != null && (str2.equals("e73g") || str2.equals("e7lte") || str2.equals("e7ltechn") || str2.equals("e7ltectc") || str2.equals("e7ltehktw"))) {
            return "Galaxy E7";
        }
        if (str3 != null && (str3.equals("SM-E7000") || str3.equals("SM-E7009") || str3.equals("SM-E700F") || str3.equals("SM-E700H") || str3.equals("SM-E700M"))) {
            return "Galaxy E7";
        }
        if (str2 != null && (str2.equals("SCH-I629") || str2.equals("nevis") || str2.equals("nevis3g") || str2.equals("nevis3gcmcc") || str2.equals("nevisds") || str2.equals("nevisnvess") || str2.equals("nevisp") || str2.equals("nevisvess") || str2.equals("nevisw"))) {
            return "Galaxy Fame";
        }
        if (str3 != null && (str3.equals("GT-S6790") || str3.equals("GT-S6790E") || str3.equals("GT-S6790L") || str3.equals("GT-S6790N") || str3.equals("GT-S6810") || str3.equals("GT-S6810B") || str3.equals("GT-S6810E") || str3.equals("GT-S6810L") || str3.equals("GT-S6810M") || str3.equals("GT-S6810P") || str3.equals("GT-S6812") || str3.equals("GT-S6812B") || str3.equals("GT-S6812C") || str3.equals("GT-S6812i") || str3.equals("GT-S6818") || str3.equals("GT-S6818V") || str3.equals("SCH-I629"))) {
            return "Galaxy Fame";
        }
        if (str2 != null && str2.equals("grandprimelteatt")) {
            return "Galaxy Go Prime";
        }
        if (str3 != null && str3.equals("SAMSUNG-SM-G530A")) {
            return "Galaxy Go Prime";
        }
        if (str2 != null && (str2.equals("baffinlite") || str2.equals("baffinlitedtv") || str2.equals("baffinq3g"))) {
            return "Galaxy Grand Neo";
        }
        if (str3 != null && (str3.equals("GT-I9060") || str3.equals("GT-I9060L") || str3.equals("GT-I9063T") || str3.equals("GT-I9082C") || str3.equals("GT-I9168") || str3.equals("GT-I9168I"))) {
            return "Galaxy Grand Neo";
        }
        if (str2 != null && (str2.equals("fortuna3g") || str2.equals("fortuna3gdtv") || str2.equals("fortunalte") || str2.equals("fortunaltectc") || str2.equals("fortunaltezh") || str2.equals("fortunaltezt") || str2.equals("fortunave3g") || str2.equals("gprimelteacg") || str2.equals("gprimeltecan") || str2.equals("gprimeltemtr") || str2.equals("gprimeltespr") || str2.equals("gprimeltetfnvzw") || str2.equals("gprimeltetmo") || str2.equals("gprimelteusc") || str2.equals("grandprimelte") || str2.equals("grandprimelteaio") || str2.equals("grandprimeve3g") || str2.equals("grandprimeve3gdtv") || str2.equals("grandprimevelte") || str2.equals("grandprimevelteltn") || str2.equals("grandprimeveltezt"))) {
            return "Galaxy Grand Prime";
        }
        if (str3 != null && (str3.equals("SAMSUNG-SM-G530AZ") || str3.equals("SM-G5306W") || str3.equals("SM-G5308W") || str3.equals("SM-G5309W") || str3.equals("SM-G530BT") || str3.equals("SM-G530F") || str3.equals("SM-G530FZ") || str3.equals("SM-G530H") || str3.equals("SM-G530M") || str3.equals("SM-G530MU") || str3.equals("SM-G530P") || str3.equals("SM-G530R4") || str3.equals("SM-G530R7") || str3.equals("SM-G530T") || str3.equals("SM-G530T1") || str3.equals("SM-G530W") || str3.equals("SM-G530Y") || str3.equals("SM-G531BT") || str3.equals("SM-G531F") || str3.equals("SM-G531H") || str3.equals("SM-G531M") || str3.equals("SM-G531Y") || str3.equals("SM-S920L") || str3.equals("gprimelteacg"))) {
            return "Galaxy Grand Prime";
        }
        if (str2 != null && (str2.equals("ms013g") || str2.equals("ms013gdtv") || str2.equals("ms013gss") || str2.equals("ms01lte") || str2.equals("ms01ltektt") || str2.equals("ms01ltelgt") || str2.equals("ms01lteskt"))) {
            return "Galaxy Grand2";
        }
        if (str3 != null && (str3.equals("SM-G710") || str3.equals("SM-G7102") || str3.equals("SM-G7102T") || str3.equals("SM-G7105") || str3.equals("SM-G7105H") || str3.equals("SM-G7105L") || str3.equals("SM-G7106") || str3.equals("SM-G7108") || str3.equals("SM-G7109") || str3.equals("SM-G710K") || str3.equals("SM-G710L") || str3.equals("SM-G710S"))) {
            return "Galaxy Grand2";
        }
        if (str2 != null && (str2.equals("j13g") || str2.equals("j13gtfnvzw") || str2.equals("j1lte") || str2.equals("j1nlte") || str2.equals("j1qltevzw") || str2.equals("j1xlte") || str2.equals("j1xlteaio") || str2.equals("j1xlteatt") || str2.equals("j1xltecan") || str2.equals("j1xqltespr") || str2.equals("j1xqltetfnvzw"))) {
            return "Galaxy J1";
        }
        if (str3 != null && (str3.equals("SAMSUNG-SM-J120A") || str3.equals("SAMSUNG-SM-J120AZ") || str3.equals("SM-J100F") || str3.equals("SM-J100FN") || str3.equals("SM-J100G") || str3.equals("SM-J100H") || str3.equals("SM-J100M") || str3.equals("SM-J100ML") || str3.equals("SM-J100MU") || str3.equals("SM-J100VPP") || str3.equals("SM-J100Y") || str3.equals("SM-J120F") || str3.equals("SM-J120FN") || str3.equals("SM-J120M") || str3.equals("SM-J120P") || str3.equals("SM-J120W") || str3.equals("SM-S120VL") || str3.equals("SM-S777C"))) {
            return "Galaxy J1";
        }
        if (str2 != null && (str2.equals("j1acelte") || str2.equals("j1acelteltn") || str2.equals("j1acevelte") || str2.equals("j1pop3g"))) {
            return "Galaxy J1 Ace";
        }
        if (str3 != null && (str3.equals("SM-J110F") || str3.equals("SM-J110G") || str3.equals("SM-J110H") || str3.equals("SM-J110L") || str3.equals("SM-J110M") || str3.equals("SM-J111F") || str3.equals("SM-J111M"))) {
            return "Galaxy J1 Ace";
        }
        if (str2 != null && (str2.equals("j53g") || str2.equals("j5lte") || str2.equals("j5ltechn") || str2.equals("j5ltekx") || str2.equals("j5nlte") || str2.equals("j5ylte"))) {
            return "Galaxy J5";
        }
        if (str3 != null && (str3.equals("SM-J5007") || str3.equals("SM-J5008") || str3.equals("SM-J500F") || str3.equals("SM-J500FN") || str3.equals("SM-J500G") || str3.equals("SM-J500H") || str3.equals("SM-J500M") || str3.equals("SM-J500N0") || str3.equals("SM-J500Y"))) {
            return "Galaxy J5";
        }
        if (str2 != null && (str2.equals("j75ltektt") || str2.equals("j7e3g") || str2.equals("j7elte") || str2.equals("j7ltechn"))) {
            return "Galaxy J7";
        }
        if (str3 != null && (str3.equals("SM-J7008") || str3.equals("SM-J700F") || str3.equals("SM-J700H") || str3.equals("SM-J700K") || str3.equals("SM-J700M"))) {
            return "Galaxy J7";
        }
        if (str2 != null && (str2.equals("maguro") || str2.equals("toro") || str2.equals("toroplus"))) {
            return "Galaxy Nexus";
        }
        if (str3 != null && str3.equals("Galaxy X")) {
            return "Galaxy Nexus";
        }
        if (str2 != null && (str2.equals("lt033g") || str2.equals("lt03ltektt") || str2.equals("lt03ltelgt") || str2.equals("lt03lteskt") || str2.equals("p4notelte") || str2.equals("p4noteltektt") || str2.equals("p4noteltelgt") || str2.equals("p4notelteskt") || str2.equals("p4noteltespr") || str2.equals("p4notelteusc") || str2.equals("p4noteltevzw") || str2.equals("p4noterf") || str2.equals("p4noterfktt") || str2.equals("p4notewifi") || str2.equals("p4notewifi43241any") || str2.equals("p4notewifiany") || str2.equals("p4notewifiktt") || str2.equals("p4notewifiww"))) {
            return "Galaxy Note 10.1";
        }
        if (str3 != null && (str3.equals("GT-N8000") || str3.equals("GT-N8005") || str3.equals("GT-N8010") || str3.equals("GT-N8013") || str3.equals("GT-N8020") || str3.equals("SCH-I925") || str3.equals("SCH-I925U") || str3.equals("SHV-E230K") || str3.equals("SHV-E230L") || str3.equals("SHV-E230S") || str3.equals("SHW-M480K") || str3.equals("SHW-M480W") || str3.equals("SHW-M485W") || str3.equals("SHW-M486W") || str3.equals("SM-P601") || str3.equals("SM-P602") || str3.equals("SM-P605K") || str3.equals("SM-P605L") || str3.equals("SM-P605S") || str3.equals("SPH-P600"))) {
            return "Galaxy Note 10.1";
        }
        if (str2 != null && (str2.equals("SC-01G") || str2.equals("SCL24") || str2.equals("tbeltektt") || str2.equals("tbeltelgt") || str2.equals("tbelteskt") || str2.equals("tblte") || str2.equals("tblteatt") || str2.equals("tbltecan") || str2.equals("tbltechn") || str2.equals("tbltespr") || str2.equals("tbltetmo") || str2.equals("tblteusc") || str2.equals("tbltevzw"))) {
            return "Galaxy Note Edge";
        }
        if (str3 != null && (str3.equals("SAMSUNG-SM-N915A") || str3.equals("SC-01G") || str3.equals("SCL24") || str3.equals("SM-N9150") || str3.equals("SM-N915F") || str3.equals("SM-N915FY") || str3.equals("SM-N915G") || str3.equals("SM-N915K") || str3.equals("SM-N915L") || str3.equals("SM-N915P") || str3.equals("SM-N915R4") || str3.equals("SM-N915S") || str3.equals("SM-N915T") || str3.equals("SM-N915T3") || str3.equals("SM-N915V") || str3.equals("SM-N915W8") || str3.equals("SM-N915X"))) {
            return "Galaxy Note Edge";
        }
        if (str2 != null && (str2.equals("v1a3g") || str2.equals("v1awifi") || str2.equals("v1awifikx") || str2.equals("viennalte") || str2.equals("viennalteatt") || str2.equals("viennaltekx") || str2.equals("viennaltevzw"))) {
            return "Galaxy Note Pro 12.2";
        }
        if (str3 != null && (str3.equals("SAMSUNG-SM-P907A") || str3.equals("SM-P900") || str3.equals("SM-P901") || str3.equals("SM-P905") || str3.equals("SM-P905F0") || str3.equals("SM-P905M") || str3.equals("SM-P905V"))) {
            return "Galaxy Note Pro 12.2";
        }
        if (str2 != null && (str2.equals("tre3caltektt") || str2.equals("tre3caltelgt") || str2.equals("tre3calteskt") || str2.equals("tre3g") || str2.equals("trelte") || str2.equals("treltektt") || str2.equals("treltelgt") || str2.equals("trelteskt") || str2.equals("trhplte") || str2.equals("trlte") || str2.equals("trlteatt") || str2.equals("trltecan") || str2.equals("trltechn") || str2.equals("trltechnzh") || str2.equals("trltespr") || str2.equals("trltetmo") || str2.equals("trlteusc") || str2.equals("trltevzw"))) {
            return "Galaxy Note4";
        }
        if (str3 != null && (str3.equals("SAMSUNG-SM-N910A") || str3.equals("SM-N9100") || str3.equals("SM-N9106W") || str3.equals("SM-N9108V") || str3.equals("SM-N9109W") || str3.equals("SM-N910C") || str3.equals("SM-N910F") || str3.equals("SM-N910G") || str3.equals("SM-N910H") || str3.equals("SM-N910K") || str3.equals("SM-N910L") || str3.equals("SM-N910P") || str3.equals("SM-N910R4") || str3.equals("SM-N910S") || str3.equals("SM-N910T") || str3.equals("SM-N910T2") || str3.equals("SM-N910T3") || str3.equals("SM-N910U") || str3.equals("SM-N910V") || str3.equals("SM-N910W8") || str3.equals("SM-N910X") || str3.equals("SM-N916K") || str3.equals("SM-N916L") || str3.equals("SM-N916S"))) {
            return "Galaxy Note4";
        }
        if (str2 != null && (str2.equals("noblelte") || str2.equals("noblelteacg") || str2.equals("noblelteatt") || str2.equals("nobleltebmc") || str2.equals("nobleltechn") || str2.equals("nobleltecmcc") || str2.equals("nobleltehk") || str2.equals("nobleltektt") || str2.equals("nobleltelgt") || str2.equals("nobleltelra") || str2.equals("noblelteskt") || str2.equals("nobleltespr") || str2.equals("nobleltetmo") || str2.equals("noblelteusc") || str2.equals("nobleltevzw"))) {
            return "Galaxy Note5";
        }
        if (str3 != null && (str3.equals("SAMSUNG-SM-N920A") || str3.equals("SM-N9200") || str3.equals("SM-N9208") || str3.equals("SM-N920C") || str3.equals("SM-N920F") || str3.equals("SM-N920G") || str3.equals("SM-N920I") || str3.equals("SM-N920K") || str3.equals("SM-N920L") || str3.equals("SM-N920P") || str3.equals("SM-N920R4") || str3.equals("SM-N920R6") || str3.equals("SM-N920R7") || str3.equals("SM-N920S") || str3.equals("SM-N920T") || str3.equals("SM-N920V") || str3.equals("SM-N920W8") || str3.equals("SM-N920X"))) {
            return "Galaxy Note5";
        }
        if (str2 != null && (str2.equals("SC-01J") || str2.equals("SCV34") || str2.equals("gracelte") || str2.equals("graceltektt") || str2.equals("graceltelgt") || str2.equals("gracelteskt") || str2.equals("graceqlteacg") || str2.equals("graceqlteatt") || str2.equals("graceqltebmc") || str2.equals("graceqltechn") || str2.equals("graceqltedcm") || str2.equals("graceqltelra") || str2.equals("graceqltespr") || str2.equals("graceqltetfnvzw") || str2.equals("graceqltetmo") || str2.equals("graceqlteue") || str2.equals("graceqlteusc") || str2.equals("graceqltevzw"))) {
            return "Galaxy Note7";
        }
        if (str3 != null && (str3.equals("SAMSUNG-SM-N930A") || str3.equals("SC-01J") || str3.equals("SCV34") || str3.equals("SGH-N037") || str3.equals("SM-N9300") || str3.equals("SM-N930F") || str3.equals("SM-N930K") || str3.equals("SM-N930L") || str3.equals("SM-N930P") || str3.equals("SM-N930R4") || str3.equals("SM-N930R6") || str3.equals("SM-N930R7") || str3.equals("SM-N930S") || str3.equals("SM-N930T") || str3.equals("SM-N930U") || str3.equals("SM-N930V") || str3.equals("SM-N930VL") || str3.equals("SM-N930W8") || str3.equals("SM-N930X"))) {
            return "Galaxy Note7";
        }
        if (str2 != null && (str2.equals("o5lte") || str2.equals("o5ltechn") || str2.equals("o5prolte") || str2.equals("on5ltemtr") || str2.equals("on5ltetfntmo") || str2.equals("on5ltetmo"))) {
            return "Galaxy On5";
        }
        if (str3 != null && (str3.equals("SM-G5500") || str3.equals("SM-G550FY") || str3.equals("SM-G550T") || str3.equals("SM-G550T1") || str3.equals("SM-G550T2") || str3.equals("SM-S550TL"))) {
            return "Galaxy On5";
        }
        if (str2 != null && (str2.equals("o7lte") || str2.equals("o7ltechn") || str2.equals("on7elte") || str2.equals("on7nlteskt"))) {
            return "Galaxy On7";
        }
        if (str3 != null && (str3.equals("SM-G6000") || str3.equals("SM-G600F") || str3.equals("SM-G600FY") || str3.equals("SM-G600S"))) {
            return "Galaxy On7";
        }
        if (str2 != null && (str2.equals("kylechn") || str2.equals("kyleopen") || str2.equals("kyletdcmcc"))) {
            return "Galaxy S Duos";
        }
        if (str3 != null && (str3.equals("GT-S7562") || str3.equals("GT-S7568"))) {
            return "Galaxy S Duos";
        }
        if (str2 != null && str2.equals("kyleprods")) {
            return "Galaxy S Duos2";
        }
        if (str3 != null && (str3.equals("GT-S7582") || str3.equals("GT-S7582L"))) {
            return "Galaxy S Duos2";
        }
        if (str2 != null && str2.equals("vivalto3gvn")) {
            return "Galaxy S Duos3";
        }
        if (str3 != null && str3.equals("SM-G313HZ")) {
            return "Galaxy S Duos3";
        }
        if (str2 != null && (str2.equals("SC-03E") || str2.equals("c1att") || str2.equals("c1ktt") || str2.equals("c1lgt") || str2.equals("c1skt") || str2.equals("d2att") || str2.equals("d2can") || str2.equals("d2cri") || str2.equals("d2dcm") || str2.equals("d2lteMetroPCS") || str2.equals("d2lterefreshspr") || str2.equals("d2ltetmo") || str2.equals("d2mtr") || str2.equals("d2spi") || str2.equals("d2spr") || str2.equals("d2tfnspr") || str2.equals("d2tfnvzw") || str2.equals("d2tmo") || str2.equals("d2usc") || str2.equals("d2vmu") || str2.equals("d2vzw") || str2.equals("d2xar") || str2.equals("m0") || str2.equals("m0apt") || str2.equals("m0chn") || str2.equals("m0cmcc") || str2.equals("m0ctc") || str2.equals("m0ctcduos") || str2.equals("m0skt") || str2.equals("m3") || str2.equals("m3dcm"))) {
            return "Galaxy S3";
        }
        if (str3 != null && (str3.equals("GT-I9300") || str3.equals("GT-I9300T") || str3.equals("GT-I9305") || str3.equals("GT-I9305N") || str3.equals("GT-I9305T") || str3.equals("GT-I9308") || str3.equals("Gravity") || str3.equals("GravityQuad") || str3.equals("SAMSUNG-SGH-I747") || str3.equals("SC-03E") || str3.equals("SC-06D") || str3.equals("SCH-I535") || str3.equals("SCH-I535PP") || str3.equals("SCH-I939") || str3.equals("SCH-I939D") || str3.equals("SCH-L710") || str3.equals("SCH-R530C") || str3.equals("SCH-R530M") || str3.equals("SCH-R530U") || str3.equals("SCH-R530X") || str3.equals("SCH-S960L") || str3.equals("SCH-S968C") || str3.equals("SGH-I747M") || str3.equals("SGH-I748") || str3.equals("SGH-T999") || str3.equals("SGH-T999L") || str3.equals("SGH-T999N") || str3.equals("SGH-T999V") || str3.equals("SHV-E210K") || str3.equals("SHV-E210L") || str3.equals("SHV-E210S") || str3.equals("SHW-M440S") || str3.equals("SPH-L710") || str3.equals("SPH-L710T"))) {
            return "Galaxy S3";
        }
        if (str2 != null && (str2.equals("golden") || str2.equals("goldenlteatt") || str2.equals("goldenltebmc") || str2.equals("goldenltevzw") || str2.equals("goldenve3g"))) {
            return "Galaxy S3 Mini";
        }
        if (str3 != null && (str3.equals("GT-I8190") || str3.equals("GT-I8190L") || str3.equals("GT-I8190N") || str3.equals("GT-I8190T") || str3.equals("GT-I8200L") || str3.equals("SAMSUNG-SM-G730A") || str3.equals("SM-G730V") || str3.equals("SM-G730W8"))) {
            return "Galaxy S3 Mini";
        }
        if (str2 != null && (str2.equals("s3ve3g") || str2.equals("s3ve3gdd") || str2.equals("s3ve3gds") || str2.equals("s3ve3gdsdd"))) {
            return "Galaxy S3 Neo";
        }
        if (str3 != null && (str3.equals("GT-I9300I") || str3.equals("GT-I9301I") || str3.equals("GT-I9301Q"))) {
            return "Galaxy S3 Neo";
        }
        if (str2 != null && (str2.equals("SC-04E") || str2.equals("ja3g") || str2.equals("ja3gduosctc") || str2.equals("jaltektt") || str2.equals("jaltelgt") || str2.equals("jalteskt") || str2.equals("jflte") || str2.equals("jflteaio") || str2.equals("jflteatt") || str2.equals("jfltecan") || str2.equals("jfltecri") || str2.equals("jfltecsp") || str2.equals("jfltelra") || str2.equals("jflterefreshspr") || str2.equals("jfltespr") || str2.equals("jfltetfnatt") || str2.equals("jfltetfntmo") || str2.equals("jfltetmo") || str2.equals("jflteusc") || str2.equals("jfltevzw") || str2.equals("jfltevzwpp") || str2.equals("jftdd") || str2.equals("jfvelte") || str2.equals("jfwifi") || str2.equals("jsglte") || str2.equals("ks01lte") || str2.equals("ks01ltektt") || str2.equals("ks01ltelgt"))) {
            return "Galaxy S4";
        }
        if (str3 != null && (str3.equals("GT-I9500") || str3.equals("GT-I9505") || str3.equals("GT-I9505X") || str3.equals("GT-I9506") || str3.equals("GT-I9507") || str3.equals("GT-I9507V") || str3.equals("GT-I9508") || str3.equals("GT-I9508C") || str3.equals("GT-I9508V") || str3.equals("GT-I9515") || str3.equals("GT-I9515L") || str3.equals("SAMSUNG-SGH-I337") || str3.equals("SAMSUNG-SGH-I337Z") || str3.equals("SC-04E") || str3.equals("SCH-I545") || str3.equals("SCH-I545L") || str3.equals("SCH-I545PP") || str3.equals("SCH-I959") || str3.equals("SCH-R970") || str3.equals("SCH-R970C") || str3.equals("SCH-R970X") || str3.equals("SGH-I337M") || str3.equals("SGH-M919") || str3.equals("SGH-M919V") || str3.equals("SGH-S970G") || str3.equals("SHV-E300K") || str3.equals("SHV-E300L") || str3.equals("SHV-E300S") || str3.equals("SHV-E330K") || str3.equals("SHV-E330L") || str3.equals("SM-S975L") || str3.equals("SPH-L720") || str3.equals("SPH-L720T"))) {
            return "Galaxy S4";
        }
        if (str2 != null && (str2.equals("serrano3g") || str2.equals("serranods") || str2.equals("serranolte") || str2.equals("serranoltebmc") || str2.equals("serranoltektt") || str2.equals("serranoltekx") || str2.equals("serranoltelra") || str2.equals("serranoltespr") || str2.equals("serranolteusc") || str2.equals("serranoltevzw") || str2.equals("serranove3g") || str2.equals("serranovelte") || str2.equals("serranovolteatt"))) {
            return "Galaxy S4 Mini";
        }
        if (str3 != null && (str3.equals("GT-I9190") || str3.equals("GT-I9192") || str3.equals("GT-I9192I") || str3.equals("GT-I9195") || str3.equals("GT-I9195I") || str3.equals("GT-I9195L") || str3.equals("GT-I9195T") || str3.equals("GT-I9195X") || str3.equals("GT-I9197") || str3.equals("SAMSUNG-SGH-I257") || str3.equals("SCH-I435") || str3.equals("SCH-I435L") || str3.equals("SCH-R890") || str3.equals("SGH-I257M") || str3.equals("SHV-E370D") || str3.equals("SHV-E370K") || str3.equals("SPH-L520"))) {
            return "Galaxy S4 Mini";
        }
        if (str2 != null && (str2.equals("SC-04F") || str2.equals("SCL23") || str2.equals("k3g") || str2.equals("klte") || str2.equals("klteMetroPCS") || str2.equals("klteacg") || str2.equals("klteaio") || str2.equals("klteatt") || str2.equals("kltecan") || str2.equals("klteduoszn") || str2.equals("kltektt") || str2.equals("kltelgt") || str2.equals("kltelra") || str2.equals("klteskt") || str2.equals("kltespr") || str2.equals("kltetfnvzw") || str2.equals("kltetmo") || str2.equals("klteusc") || str2.equals("kltevzw") || str2.equals("kwifi") || str2.equals("lentisltektt") || str2.equals("lentisltelgt") || str2.equals("lentislteskt"))) {
            return "Galaxy S5";
        }
        if (str3 != null && (str3.equals("SAMSUNG-SM-G900A") || str3.equals("SAMSUNG-SM-G900AZ") || str3.equals("SC-04F") || str3.equals("SCL23") || str3.equals("SM-G9006W") || str3.equals("SM-G9008W") || str3.equals("SM-G9009W") || str3.equals("SM-G900F") || str3.equals("SM-G900FQ") || str3.equals("SM-G900H") || str3.equals("SM-G900I") || str3.equals("SM-G900K") || str3.equals("SM-G900L") || str3.equals("SM-G900M") || str3.equals("SM-G900MD") || str3.equals("SM-G900P") || str3.equals("SM-G900R4") || str3.equals("SM-G900R6") || str3.equals("SM-G900R7") || str3.equals("SM-G900S") || str3.equals("SM-G900T") || str3.equals("SM-G900T1") || str3.equals("SM-G900T3") || str3.equals("SM-G900T4") || str3.equals("SM-G900V") || str3.equals("SM-G900W8") || str3.equals("SM-G900X") || str3.equals("SM-G906K") || str3.equals("SM-G906L") || str3.equals("SM-G906S") || str3.equals("SM-S903VL"))) {
            return "Galaxy S5";
        }
        if (str2 != null && (str2.equals("s5neolte") || str2.equals("s5neoltecan"))) {
            return "Galaxy S5 Neo";
        }
        if (str3 != null && (str3.equals("SM-G903F") || str3.equals("SM-G903M") || str3.equals("SM-G903W"))) {
            return "Galaxy S5 Neo";
        }
        if (str2 != null && (str2.equals("SC-05G") || str2.equals("zeroflte") || str2.equals("zeroflteacg") || str2.equals("zeroflteaio") || str2.equals("zeroflteatt") || str2.equals("zerofltebmc") || str2.equals("zerofltechn") || str2.equals("zerofltectc") || str2.equals("zerofltektt") || str2.equals("zerofltelgt") || str2.equals("zerofltelra") || str2.equals("zerofltemtr") || str2.equals("zeroflteskt") || str2.equals("zerofltespr") || str2.equals("zerofltetfnvzw") || str2.equals("zerofltetmo") || str2.equals("zeroflteusc") || str2.equals("zerofltevzw"))) {
            return "Galaxy S6";
        }
        if (str3 != null && (str3.equals("SAMSUNG-SM-G920A") || str3.equals("SAMSUNG-SM-G920AZ") || str3.equals("SC-05G") || str3.equals("SM-G9200") || str3.equals("SM-G9208") || str3.equals("SM-G9209") || str3.equals("SM-G920F") || str3.equals("SM-G920I") || str3.equals("SM-G920K") || str3.equals("SM-G920L") || str3.equals("SM-G920P") || str3.equals("SM-G920R4") || str3.equals("SM-G920R6") || str3.equals("SM-G920R7") || str3.equals("SM-G920S") || str3.equals("SM-G920T") || str3.equals("SM-G920T1") || str3.equals("SM-G920V") || str3.equals("SM-G920W8") || str3.equals("SM-G920X") || str3.equals("SM-S906L") || str3.equals("SM-S907VL"))) {
            return "Galaxy S6";
        }
        if (str2 != null && (str2.equals("404SC") || str2.equals("SC-04G") || str2.equals("SCV31") || str2.equals("zerolte") || str2.equals("zerolteacg") || str2.equals("zerolteatt") || str2.equals("zeroltebmc") || str2.equals("zeroltechn") || str2.equals("zeroltektt") || str2.equals("zeroltelgt") || str2.equals("zeroltelra") || str2.equals("zerolteskt") || str2.equals("zeroltespr") || str2.equals("zeroltetmo") || str2.equals("zerolteusc") || str2.equals("zeroltevzw"))) {
            return "Galaxy S6 Edge";
        }
        if (str3 != null && (str3.equals("404SC") || str3.equals("SAMSUNG-SM-G925A") || str3.equals("SC-04G") || str3.equals("SCV31") || str3.equals("SM-G9250") || str3.equals("SM-G925F") || str3.equals("SM-G925I") || str3.equals("SM-G925K") || str3.equals("SM-G925L") || str3.equals("SM-G925P") || str3.equals("SM-G925R4") || str3.equals("SM-G925R6") || str3.equals("SM-G925R7") || str3.equals("SM-G925S") || str3.equals("SM-G925T") || str3.equals("SM-G925V") || str3.equals("SM-G925W8") || str3.equals("SM-G925X"))) {
            return "Galaxy S6 Edge";
        }
        if (str2 != null && (str2.equals("zenlte") || str2.equals("zenlteatt") || str2.equals("zenltebmc") || str2.equals("zenltechn") || str2.equals("zenltektt") || str2.equals("zenltekx") || str2.equals("zenltelgt") || str2.equals("zenlteskt") || str2.equals("zenltespr") || str2.equals("zenltetmo") || str2.equals("zenltevzw"))) {
            return "Galaxy S6 Edge+";
        }
        if (str3 != null && (str3.equals("SAMSUNG-SM-G928A") || str3.equals("SM-G9280") || str3.equals("SM-G9287") || str3.equals("SM-G9287C") || str3.equals("SM-G928C") || str3.equals("SM-G928F") || str3.equals("SM-G928G") || str3.equals("SM-G928I") || str3.equals("SM-G928K") || str3.equals("SM-G928L") || str3.equals("SM-G928N0") || str3.equals("SM-G928P") || str3.equals("SM-G928S") || str3.equals("SM-G928T") || str3.equals("SM-G928V") || str3.equals("SM-G928W8") || str3.equals("SM-G928X"))) {
            return "Galaxy S6 Edge+";
        }
        if (str2 != null && (str2.equals("herolte") || str2.equals("heroltebmc") || str2.equals("heroltektt") || str2.equals("heroltelgt") || str2.equals("herolteskt") || str2.equals("heroqlteacg") || str2.equals("heroqlteaio") || str2.equals("heroqlteatt") || str2.equals("heroqltecctvzw") || str2.equals("heroqltechn") || str2.equals("heroqltelra") || str2.equals("heroqltemtr") || str2.equals("heroqltespr") || str2.equals("heroqltetfnvzw") || str2.equals("heroqltetmo") || str2.equals("heroqlteue") || str2.equals("heroqlteusc") || str2.equals("heroqltevzw"))) {
            return "Galaxy S7";
        }
        if (str3 != null && (str3.equals("SAMSUNG-SM-G930A") || str3.equals("SAMSUNG-SM-G930AZ") || str3.equals("SM-G9300") || str3.equals("SM-G9308") || str3.equals("SM-G930F") || str3.equals("SM-G930K") || str3.equals("SM-G930L") || str3.equals("SM-G930P") || str3.equals("SM-G930R4") || str3.equals("SM-G930R6") || str3.equals("SM-G930R7") || str3.equals("SM-G930S") || str3.equals("SM-G930T") || str3.equals("SM-G930T1") || str3.equals("SM-G930U") || str3.equals("SM-G930V") || str3.equals("SM-G930VC") || str3.equals("SM-G930VL") || str3.equals("SM-G930W8") || str3.equals("SM-G930X"))) {
            return "Galaxy S7";
        }
        if (str2 != null && (str2.equals("SC-02H") || str2.equals("SCV33") || str2.equals("hero2lte") || str2.equals("hero2ltebmc") || str2.equals("hero2ltektt") || str2.equals("hero2ltelgt") || str2.equals("hero2lteskt") || str2.equals("hero2qlteatt") || str2.equals("hero2qltecctvzw") || str2.equals("hero2qltechn") || str2.equals("hero2qltespr") || str2.equals("hero2qltetmo") || str2.equals("hero2qlteue") || str2.equals("hero2qlteusc") || str2.equals("hero2qltevzw"))) {
            return "Galaxy S7 Edge";
        }
        if (str3 != null && (str3.equals("SAMSUNG-SM-G935A") || str3.equals("SC-02H") || str3.equals("SCV33") || str3.equals("SM-G9350") || str3.equals("SM-G935F") || str3.equals("SM-G935K") || str3.equals("SM-G935L") || str3.equals("SM-G935P") || str3.equals("SM-G935R4") || str3.equals("SM-G935S") || str3.equals("SM-G935T") || str3.equals("SM-G935U") || str3.equals("SM-G935V") || str3.equals("SM-G935VC") || str3.equals("SM-G935W8") || str3.equals("SM-G935X"))) {
            return "Galaxy S7 Edge";
        }
        if (str2 != null && (str2.equals("dreamlte") || str2.equals("dreamlteskt") || str2.equals("dreamqltecan") || str2.equals("dreamqltechn") || str2.equals("dreamqltesq"))) {
            return "Galaxy S8";
        }
        if (str3 != null && (str3.equals("SM-G9500") || str3.equals("SM-G950W") || str3.equals("SM-G950X") || str3.equals("SM-G950XC") || str3.equals("SM-G950XN") || str3.equals("SM-G950XU"))) {
            return "Galaxy S8";
        }
        if (str2 != null && (str2.equals("GT-P7500") || str2.equals("GT-P7500D") || str2.equals("GT-P7503") || str2.equals("GT-P7510") || str2.equals("SC-01D") || str2.equals("SCH-I905") || str2.equals("SGH-T859") || str2.equals("SHW-M300W") || str2.equals("SHW-M380K") || str2.equals("SHW-M380S") || str2.equals("SHW-M380W"))) {
            return "Galaxy Tab 10.1";
        }
        if (str3 != null && (str3.equals("GT-P7500") || str3.equals("GT-P7500D") || str3.equals("GT-P7503") || str3.equals("GT-P7510") || str3.equals("SC-01D") || str3.equals("SCH-I905") || str3.equals("SGH-T859") || str3.equals("SHW-M300W") || str3.equals("SHW-M380K") || str3.equals("SHW-M380S") || str3.equals("SHW-M380W"))) {
            return "Galaxy Tab 10.1";
        }
        if (str2 != null && (str2.equals("GT-P6200") || str2.equals("GT-P6200L") || str2.equals("GT-P6201") || str2.equals("GT-P6210") || str2.equals("GT-P6211") || str2.equals("SC-02D") || str2.equals("SGH-T869") || str2.equals("SHW-M430W"))) {
            return "Galaxy Tab 7.0 Plus";
        }
        if (str3 != null && (str3.equals("GT-P6200") || str3.equals("GT-P6200L") || str3.equals("GT-P6201") || str3.equals("GT-P6210") || str3.equals("GT-P6211") || str3.equals("SC-02D") || str3.equals("SGH-T869") || str3.equals("SHW-M430W"))) {
            return "Galaxy Tab 7.0 Plus";
        }
        if (str2 != null && (str2.equals("gteslteatt") || str2.equals("gtesltebmc") || str2.equals("gtesltelgt") || str2.equals("gteslteskt") || str2.equals("gtesltetmo") || str2.equals("gtesltetw") || str2.equals("gtesltevzw") || str2.equals("gtesqltespr") || str2.equals("gtesqlteusc"))) {
            return "Galaxy Tab E 8.0";
        }
        if (str3 != null && (str3.equals("SAMSUNG-SM-T377A") || str3.equals("SM-T375L") || str3.equals("SM-T375S") || str3.equals("SM-T3777") || str3.equals("SM-T377P") || str3.equals("SM-T377R4") || str3.equals("SM-T377T") || str3.equals("SM-T377V") || str3.equals("SM-T377W"))) {
            return "Galaxy Tab E 8.0";
        }
        if (str2 != null && (str2.equals("gtel3g") || str2.equals("gtelltevzw") || str2.equals("gtelwifi") || str2.equals("gtelwifichn") || str2.equals("gtelwifiue"))) {
            return "Galaxy Tab E 9.6";
        }
        if (str3 != null && (str3.equals("SM-T560") || str3.equals("SM-T560NU") || str3.equals("SM-T561") || str3.equals("SM-T561M") || str3.equals("SM-T561Y") || str3.equals("SM-T562") || str3.equals("SM-T567V"))) {
            return "Galaxy Tab E 9.6";
        }
        if (str2 != null && (str2.equals("403SC") || str2.equals("degas2wifi") || str2.equals("degas2wifibmwchn") || str2.equals("degas3g") || str2.equals("degaslte") || str2.equals("degasltespr") || str2.equals("degasltevzw") || str2.equals("degasvelte") || str2.equals("degasveltechn") || str2.equals("degaswifi") || str2.equals("degaswifibmwzc") || str2.equals("degaswifidtv") || str2.equals("degaswifiopenbnn") || str2.equals("degaswifiue"))) {
            return "Galaxy Tab4 7.0";
        }
        if (str3 != null && (str3.equals("403SC") || str3.equals("SM-T230") || str3.equals("SM-T230NT") || str3.equals("SM-T230NU") || str3.equals("SM-T230NW") || str3.equals("SM-T230NY") || str3.equals("SM-T230X") || str3.equals("SM-T231") || str3.equals("SM-T232") || str3.equals("SM-T235") || str3.equals("SM-T235Y") || str3.equals("SM-T237P") || str3.equals("SM-T237V") || str3.equals("SM-T239") || str3.equals("SM-T2397") || str3.equals("SM-T239C") || str3.equals("SM-T239M"))) {
            return "Galaxy Tab4 7.0";
        }
        if (str2 != null && (str2.equals("gvlte") || str2.equals("gvlteatt") || str2.equals("gvltevzw") || str2.equals("gvltexsp") || str2.equals("gvwifijpn") || str2.equals("gvwifiue"))) {
            return "Galaxy View";
        }
        if (str3 != null && (str3.equals("SAMSUNG-SM-T677A") || str3.equals("SM-T670") || str3.equals("SM-T677") || str3.equals("SM-T677V"))) {
            return "Galaxy View";
        }
        if (str2 != null && (str2.equals("GT-S5360") || str2.equals("GT-S5360B") || str2.equals("GT-S5360L") || str2.equals("GT-S5360T") || str2.equals("GT-S5363") || str2.equals("GT-S5368") || str2.equals("GT-S5369") || str2.equals("SCH-I509") || str2.equals("SCH-i509"))) {
            return "Galaxy Y";
        }
        if (str3 != null && (str3.equals("GT-S5360") || str3.equals("GT-S5360B") || str3.equals("GT-S5360L") || str3.equals("GT-S5360T") || str3.equals("GT-S5363") || str3.equals("GT-S5368") || str3.equals("GT-S5369") || str3.equals("SCH-I509") || str3.equals("SCH-i509"))) {
            return "Galaxy Y";
        }
        if (str2 != null && str2.equals("manta")) {
            return "Nexus 10";
        }
        if (str2 != null && (str2.equals("D2104") || str2.equals("D2105"))) {
            return "Xperia E1 dual";
        }
        if (str3 != null && (str3.equals("D2104") || str3.equals("D2105"))) {
            return "Xperia E1 dual";
        }
        if (str2 != null && (str2.equals("D2202") || str2.equals("D2203") || str2.equals("D2206") || str2.equals("D2243"))) {
            return "Xperia E3";
        }
        if (str3 != null && (str3.equals("D2202") || str3.equals("D2203") || str3.equals("D2206") || str3.equals("D2243"))) {
            return "Xperia E3";
        }
        if (str2 != null && (str2.equals("E5603") || str2.equals("E5606") || str2.equals("E5653"))) {
            return "Xperia M5";
        }
        if (str3 != null && (str3.equals("E5603") || str3.equals("E5606") || str3.equals("E5653"))) {
            return "Xperia M5";
        }
        if (str2 != null && (str2.equals("E5633") || str2.equals("E5643") || str2.equals("E5663"))) {
            return "Xperia M5 Dual";
        }
        if (str3 != null && (str3.equals("E5633") || str3.equals("E5643") || str3.equals("E5663"))) {
            return "Xperia M5 Dual";
        }
        if (str2 != null && str2.equals("LT26i")) {
            return "Xperia S";
        }
        if (str3 != null && str3.equals("LT26i")) {
            return "Xperia S";
        }
        if (str2 != null && (str2.equals("D5303") || str2.equals("D5306") || str2.equals("D5316") || str2.equals("D5316N") || str2.equals("D5322"))) {
            return "Xperia T2 Ultra";
        }
        if (str3 != null && (str3.equals("D5303") || str3.equals("D5306") || str3.equals("D5316") || str3.equals("D5316N") || str3.equals("D5322"))) {
            return "Xperia T2 Ultra";
        }
        if (str2 != null && str2.equals("txs03")) {
            return "Xperia Tablet S";
        }
        if (str3 != null && (str3.equals("SGPT12") || str3.equals("SGPT13"))) {
            return "Xperia Tablet S";
        }
        if (str2 != null && (str2.equals("SGP311") || str2.equals("SGP312") || str2.equals("SGP321") || str2.equals("SGP351"))) {
            return "Xperia Tablet Z";
        }
        if (str3 != null && (str3.equals("SGP311") || str3.equals("SGP312") || str3.equals("SGP321") || str3.equals("SGP351"))) {
            return "Xperia Tablet Z";
        }
        if (str2 != null && (str2.equals("D6502") || str2.equals("D6503") || str2.equals("D6543") || str2.equals("SO-03F"))) {
            return "Xperia Z2";
        }
        if (str3 != null && (str3.equals("D6502") || str3.equals("D6503") || str3.equals("D6543") || str3.equals("SO-03F"))) {
            return "Xperia Z2";
        }
        if (str2 != null && (str2.equals("401SO") || str2.equals("D6603") || str2.equals("D6616") || str2.equals("D6643") || str2.equals("D6646") || str2.equals("D6653") || str2.equals("SO-01G") || str2.equals("SOL26") || str2.equals("leo"))) {
            return "Xperia Z3";
        }
        if (str3 != null && (str3.equals("401SO") || str3.equals("D6603") || str3.equals("D6616") || str3.equals("D6643") || str3.equals("D6646") || str3.equals("D6653") || str3.equals("SO-01G") || str3.equals("SOL26"))) {
            return "Xperia Z3";
        }
        if (str2 != null && (str2.equals("402SO") || str2.equals("SO-03G") || str2.equals("SOV31"))) {
            return "Xperia Z4";
        }
        if (str3 != null && (str3.equals("402SO") || str3.equals("SO-03G") || str3.equals("SOV31"))) {
            return "Xperia Z4";
        }
        if (str2 != null && (str2.equals("E5803") || str2.equals("E5823") || str2.equals("SO-02H"))) {
            return "Xperia Z5 Compact";
        }
        if (str3 != null && (str3.equals("E5803") || str3.equals("E5823") || str3.equals("SO-02H"))) {
            return "Xperia Z5 Compact";
        }
        if (str2 != null && (str2.equals("LT26i") || str2.equals("SO-02D"))) {
            return "Xperia S";
        }
        if (str3 != null && (str3.equals("LT26i") || str3.equals("SO-02D"))) {
            return "Xperia S";
        }
        if (str2 == null || (!str2.equals("SGP311") && !str2.equals("SGP321") && !str2.equals("SGP341") && !str2.equals("SO-03E"))) {
            if (str3 == null) {
                return str;
            }
            if (!str3.equals("SGP311") && !str3.equals("SGP321") && !str3.equals("SGP341") && !str3.equals("SO-03E")) {
                return str;
            }
        }
        return "Xperia Tablet Z";
    }

    public static final String p(dx4.e1 e1Var) {
        Intrinsics.checkNotNullParameter(e1Var, "<this>");
        if (e1Var instanceof i4) {
            return ((i4) e1Var).f120628a;
        }
        if (e1Var instanceof f4) {
            return ((f4) e1Var).f120595a;
        }
        if (e1Var instanceof x1) {
            return ((x1) e1Var).f120827a;
        }
        if (e1Var instanceof h5) {
            return ((h5) e1Var).f120615a;
        }
        if (e1Var instanceof x4) {
            return ((x4) e1Var).f120834a;
        }
        if (e1Var instanceof dx4.i0) {
            return ((dx4.i0) e1Var).f120620a;
        }
        if (e1Var instanceof b3) {
            return ((b3) e1Var).f120556a;
        }
        if (e1Var instanceof g2) {
            return ((g2) e1Var).f120602a;
        }
        if (e1Var instanceof l4) {
            return ((l4) e1Var).f120667a;
        }
        if (e1Var instanceof e5) {
            return ((e5) e1Var).f120585a;
        }
        if (e1Var instanceof dx4.t0) {
            return ((dx4.t0) e1Var).f120770a;
        }
        if (e1Var instanceof w1) {
            return ((w1) e1Var).f120809a;
        }
        if (e1Var instanceof dx4.r0) {
            return ((dx4.r0) e1Var).f120735a;
        }
        if (e1Var instanceof dx4.o) {
            return ((dx4.o) e1Var).f120694a;
        }
        if (e1Var instanceof k3) {
            return ((k3) e1Var).f120651a;
        }
        if (e1Var instanceof c5) {
            return ((c5) e1Var).f120569a;
        }
        if (e1Var instanceof dx4.r) {
            return ((dx4.r) e1Var).f120732a;
        }
        if (e1Var instanceof r4) {
            return ((r4) e1Var).f120752a;
        }
        if (e1Var instanceof p5) {
            return ((p5) e1Var).f120721a;
        }
        if (e1Var instanceof dx4.m) {
            return ((dx4.m) e1Var).f120670a;
        }
        if (e1Var instanceof s3) {
            return ((s3) e1Var).f120764a;
        }
        if (e1Var instanceof r3) {
            return ((r3) e1Var).f120748a;
        }
        if (e1Var instanceof i2) {
            return ((i2) e1Var).f120623a;
        }
        if (e1Var instanceof a2) {
            return ((a2) e1Var).f120543a;
        }
        if (e1Var instanceof m4) {
            return ((m4) e1Var).f120680a;
        }
        if (e1Var instanceof y4) {
            return ((y4) e1Var).f120854a;
        }
        if (e1Var instanceof l3) {
            return ((l3) e1Var).f120664a;
        }
        if (e1Var instanceof x3) {
            return ((x3) e1Var).f120831a;
        }
        if (e1Var instanceof l2) {
            return ((l2) e1Var).f120661a;
        }
        if (e1Var instanceof dx4.x0) {
            return ((dx4.x0) e1Var).f120824a;
        }
        if (e1Var instanceof dx4.s0) {
            return ((dx4.s0) e1Var).f120759a;
        }
        if ((e1Var instanceof dx4.l0) || (e1Var instanceof j2) || (e1Var instanceof n3) || (e1Var instanceof p3) || (e1Var instanceof w3) || (e1Var instanceof i5) || (e1Var instanceof j5) || (e1Var instanceof x5) || (e1Var instanceof b5)) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final List q(dx4.e1 e1Var) {
        Intrinsics.checkNotNullParameter(e1Var, "<this>");
        if (e1Var instanceof g2) {
            List list = ((g2) e1Var).d;
            ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
            Iterator it8 = list.iterator();
            while (it8.hasNext()) {
                arrayList.add(q((dx4.e1) it8.next()));
            }
            return zhm.w.u(arrayList);
        }
        if (e1Var instanceof x4) {
            return zhm.u.c(((x4) e1Var).f120841m);
        }
        if (e1Var instanceof c5) {
            return zhm.u.c(((c5) e1Var).f120572g);
        }
        if (e1Var instanceof m4) {
            return zhm.u.c(((m4) e1Var).e);
        }
        if (e1Var instanceof p5) {
            return zhm.u.c(((p5) e1Var).f120723c);
        }
        if (e1Var instanceof x3) {
            return zhm.u.c(((x3) e1Var).d);
        }
        if ((e1Var instanceof dx4.m) || (e1Var instanceof dx4.o) || (e1Var instanceof dx4.r) || (e1Var instanceof dx4.i0) || (e1Var instanceof dx4.l0) || (e1Var instanceof dx4.r0) || (e1Var instanceof dx4.t0) || (e1Var instanceof w1) || (e1Var instanceof x1) || (e1Var instanceof i2) || (e1Var instanceof j2) || (e1Var instanceof b3) || (e1Var instanceof k3) || (e1Var instanceof l3) || (e1Var instanceof n3) || (e1Var instanceof p3) || (e1Var instanceof f4) || (e1Var instanceof i4) || (e1Var instanceof l4) || (e1Var instanceof r4) || (e1Var instanceof e5) || (e1Var instanceof h5) || (e1Var instanceof i5) || (e1Var instanceof j5) || (e1Var instanceof s3) || (e1Var instanceof r3) || (e1Var instanceof w3) || (e1Var instanceof a2) || (e1Var instanceof y4) || (e1Var instanceof x5) || (e1Var instanceof b5) || (e1Var instanceof l2) || (e1Var instanceof dx4.x0) || (e1Var instanceof dx4.s0)) {
            return zhm.f0.f322471a;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final Map r(dx4.e1 e1Var) {
        Intrinsics.checkNotNullParameter(e1Var, "<this>");
        if (e1Var instanceof g2) {
            List list = ((g2) e1Var).d;
            ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
            Iterator it8 = list.iterator();
            while (it8.hasNext()) {
                arrayList.add(r((dx4.e1) it8.next()));
            }
            Iterator it9 = arrayList.iterator();
            if (!it9.hasNext()) {
                throw new UnsupportedOperationException("Empty collection can't be reduced.");
            }
            Object next = it9.next();
            while (it9.hasNext()) {
                next = zhm.r0.p((Map) next, (Map) it9.next());
            }
            return (Map) next;
        }
        if (e1Var instanceof x4) {
            x4 x4Var = (x4) e1Var;
            return zhm.q0.c(new Pair(x4Var.f120841m, Long.valueOf(x4Var.e)));
        }
        if (e1Var instanceof c5) {
            c5 c5Var = (c5) e1Var;
            return zhm.q0.c(new Pair(c5Var.f120572g, Boolean.valueOf(c5Var.e)));
        }
        if (e1Var instanceof m4) {
            m4 m4Var = (m4) e1Var;
            return zhm.q0.c(new Pair(m4Var.e, Boolean.valueOf(m4Var.d)));
        }
        if (e1Var instanceof p5) {
            p5 p5Var = (p5) e1Var;
            String str = p5Var.f120723c;
            for (o5 o5Var : p5Var.d) {
                if (o5Var.f) {
                    return foh.i.q(new Pair(str, o5Var.e));
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
        if (e1Var instanceof x3) {
            x3 x3Var = (x3) e1Var;
            return x3Var.e ? a0.d.x(x3Var.d, x3Var.f120831a) : zhm.r0.g();
        }
        if ((e1Var instanceof dx4.m) || (e1Var instanceof dx4.o) || (e1Var instanceof dx4.r) || (e1Var instanceof dx4.i0) || (e1Var instanceof dx4.l0) || (e1Var instanceof dx4.r0) || (e1Var instanceof dx4.t0) || (e1Var instanceof w1) || (e1Var instanceof x1) || (e1Var instanceof i2) || (e1Var instanceof j2) || (e1Var instanceof b3) || (e1Var instanceof k3) || (e1Var instanceof l3) || (e1Var instanceof n3) || (e1Var instanceof p3) || (e1Var instanceof f4) || (e1Var instanceof i4) || (e1Var instanceof l4) || (e1Var instanceof r4) || (e1Var instanceof e5) || (e1Var instanceof h5) || (e1Var instanceof i5) || (e1Var instanceof j5) || (e1Var instanceof s3) || (e1Var instanceof r3) || (e1Var instanceof w3) || (e1Var instanceof a2) || (e1Var instanceof y4) || (e1Var instanceof x5) || (e1Var instanceof b5) || (e1Var instanceof l2) || (e1Var instanceof dx4.x0) || (e1Var instanceof dx4.s0)) {
            return zhm.r0.g();
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final Map s(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        List list2 = list;
        ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
        Iterator it8 = list2.iterator();
        while (it8.hasNext()) {
            arrayList.add(r((dx4.e1) it8.next()));
        }
        Iterator it9 = arrayList.iterator();
        if (!it9.hasNext()) {
            throw new UnsupportedOperationException("Empty collection can't be reduced.");
        }
        Object next = it9.next();
        while (it9.hasNext()) {
            next = zhm.r0.p((Map) next, (Map) it9.next());
        }
        return (Map) next;
    }

    public static final Asset t(OrderQuote orderQuote) {
        Intrinsics.checkNotNullParameter(orderQuote, "<this>");
        return u(orderQuote).f104718b;
    }

    public static final Amount u(OrderQuote orderQuote) {
        Intrinsics.checkNotNullParameter(orderQuote, "<this>");
        return i(orderQuote, J(orderQuote.f104753b));
    }

    public static final Amount v(OrderQuote orderQuote) {
        Intrinsics.checkNotNullParameter(orderQuote, "<this>");
        Intrinsics.checkNotNullParameter(orderQuote, "<this>");
        Amount amountJ = j(orderQuote, J(orderQuote.f104753b));
        return amountJ == null ? u(orderQuote) : amountJ;
    }

    public static final boolean w(OrderQuote orderQuote) {
        Intrinsics.checkNotNullParameter(orderQuote, "<this>");
        f8l.c cVar = k(orderQuote).f104719a;
        f8l.c cVar2 = f8l.c.COMMODITY;
        return cVar == cVar2 || t(orderQuote).f104719a == cVar2;
    }

    public static final boolean x(OrderQuote orderQuote) {
        Intrinsics.checkNotNullParameter(orderQuote, "<this>");
        f8l.c cVar = k(orderQuote).f104719a;
        f8l.c cVar2 = f8l.c.CRYPTO;
        return cVar == cVar2 || t(orderQuote).f104719a == cVar2;
    }

    public static final boolean y(c3i.b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        return cp5.d.y(bVar.d.f115083b) || cp5.d.y(bVar.f.f115083b);
    }

    public static final boolean z(OrderQuote orderQuote) {
        Intrinsics.checkNotNullParameter(orderQuote, "<this>");
        return !Intrinsics.f(orderQuote.f104754c.f104718b, orderQuote.e.f104718b);
    }
}
