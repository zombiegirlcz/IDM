package rm0;

import android.os.Build;
import android.security.KeyStoreException;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import java.lang.reflect.Field;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Lazy;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.h0;
import zhm.y0;

/* JADX INFO: loaded from: classes19.dex */
public final class a0 {

    @NotNull
    public static final z Companion = new z();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Function0 f255134a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wm0.c f255135b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Lazy f255136c;

    public a0(Function0 diagnosticEventsTrackerProvider, wm0.c keystoreProvider) {
        Intrinsics.checkNotNullParameter(diagnosticEventsTrackerProvider, "diagnosticEventsTrackerProvider");
        Intrinsics.checkNotNullParameter(keystoreProvider, "keystoreProvider");
        this.f255134a = diagnosticEventsTrackerProvider;
        this.f255135b = keystoreProvider;
        this.f255136c = yhm.j.b(new r1a.a(this, 17));
    }

    public final void a(eo.e operation, Throwable th10) {
        String strN;
        Integer numValueOf;
        Integer num;
        Intrinsics.checkNotNullParameter(operation, "operation");
        Throwable error = th10;
        Intrinsics.checkNotNullParameter(error, "error");
        if (Build.VERSION.SDK_INT < 33) {
            return;
        }
        KeyStoreException keyStoreExceptionG = null;
        while (keyStoreExceptionG == null && error != null) {
            if (lr0.a.r(error)) {
                keyStoreExceptionG = lr0.a.g(error);
            } else {
                error = error.getCause();
            }
        }
        if (keyStoreExceptionG == null) {
            return;
        }
        int retryPolicy = keyStoreExceptionG.getRetryPolicy();
        String strN2 = retryPolicy != 1 ? retryPolicy != 2 ? retryPolicy != 3 ? retryPolicy != 4 ? a0.d.n("UNKNOWN_", retryPolicy) : "AFTER_NEXT_REBOOT" : "WHEN_CONNECTIVITY_AVAILABLE" : "WITH_EXPONENTIAL_BACKOFF" : "NEVER";
        int numericErrorCode = keyStoreExceptionG.getNumericErrorCode();
        switch (numericErrorCode) {
            case 1:
                strN = "OTHER";
                break;
            case 2:
                strN = "USER_AUTHENTICATION_REQUIRED";
                break;
            case 3:
                strN = "KEYSTORE_UNINITIALIZED";
                break;
            case 4:
                strN = "INTERNAL_SYSTEM_ERROR";
                break;
            case 5:
                strN = "PERMISSION_DENIED";
                break;
            case 6:
                strN = "KEY_DOES_NOT_EXIST";
                break;
            case 7:
                strN = "KEY_CORRUPTED";
                break;
            case 8:
                strN = "ID_ATTESTATION_FAILURE";
                break;
            case 9:
                strN = "ATTESTATION_CHALLENGE_TOO_LARGE";
                break;
            case 10:
                strN = "KEYMINT_FAILURE";
                break;
            case 11:
                strN = "KEYSTORE_FAILURE";
                break;
            case 12:
                strN = "UNIMPLEMENTED";
                break;
            case 13:
                strN = "INCORRECT_USAGE";
                break;
            case 14:
                strN = "KEY_NOT_TEMPORALLY_VALID";
                break;
            case 15:
                strN = "KEY_OPERATION_EXPIRED";
                break;
            case 16:
                strN = "ATTESTATION_KEYS_UNAVAILABLE";
                break;
            case 17:
                strN = "DEVICE_REQUIRES_UPGRADE_FOR_ATTESTATION";
                break;
            case 18:
                strN = "TOO_MANY_KEYS";
                break;
            default:
                strN = a0.d.n("UNKNOWN_", numericErrorCode);
                break;
        }
        String str = strN;
        String str2 = keyStoreExceptionG.isSystemError() ? "SYSTEM_ERROR" : "KEY_ERROR";
        boolean zRequiresUserAuthentication = keyStoreExceptionG.requiresUserAuthentication();
        try {
            numValueOf = Integer.valueOf(((wm0.g) ((wm0.f) this.f255136c.getValue())).f298587a.size());
        } catch (Exception e) {
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, e, h0Var);
            numValueOf = null;
        }
        int iIntValue = numValueOf != null ? numValueOf.intValue() : -1;
        com.revolut.analytics.tracking.v3.d dVar = (com.revolut.analytics.tracking.v3.d) this.f255134a.invoke();
        try {
            Field declaredField = lr0.a.k().getDeclaredField("mErrorCode");
            declaredField.setAccessible(true);
            Object obj2 = declaredField.get(keyStoreExceptionG);
            Intrinsics.i(obj2, "null cannot be cast to non-null type kotlin.Int");
            num = (Integer) obj2;
        } catch (Exception e2) {
            h0 h0Var2 = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, e2, h0Var2);
            num = null;
        }
        eo.b error2 = new eo.b(num != null ? num.intValue() : 0, str, str2, strN2, zRequiresUserAuthentication, iIntValue);
        com.revolut.analytics.tracking.v3.f fVar = (com.revolut.analytics.tracking.v3.f) dVar;
        fVar.getClass();
        Intrinsics.checkNotNullParameter(operation, "operation");
        Intrinsics.checkNotNullParameter(error2, "error");
        com.revolut.analytics.tracking.v3.f.g(fVar, AnalyticsProduct.Shared.MobilePlatform.f, null, null, new ni1.a(error2, operation, 10), 14);
        if (operation.d) {
            return;
        }
        aim.o oVar = new aim.o();
        oVar.add(new Pair("ks_error_reason", str));
        oVar.add(new Pair("ks_error_nature", str2));
        oVar.add(new Pair("ks_error_retry", strN2));
        oVar.add(new Pair("ks_error_auth", String.valueOf(zRequiresUserAuthentication)));
        oVar.add(new Pair("ks_error_attempt", String.valueOf(operation.f127857c)));
        oVar.add(new Pair("ks_error_aliases_count", String.valueOf(iIntValue)));
        oVar.add(new Pair("ks_error_context_operation_name", operation.f127855a.a()));
        oVar.add(new Pair("ks_error_context_certificate_type", operation.f127856b.a()));
        aim.o oVarA = y0.a(oVar);
        CopyOnWriteArrayList copyOnWriteArrayList3 = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, "KeyStoreErrorsTracker", null, keyStoreExceptionG, oVarA);
    }
}
