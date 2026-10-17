package g81;

import aii.i;
import com.revolut.core.error.data.model.ServerErrorException;
import com.revolut.core.network.exceptions.HandledNetworkException;
import com.revolut.core.network.exceptions.NetworkConnectException;
import com.revolut.error_handling.models.SuspiciousErrorThrown;
import com.revolut.feature.twofa.exceptions.UserDeclinedTwoFaException;
import com.revolut.feature.twofa.exceptions.UserFailedTwoFaException;
import com.revolut.sso.api.exceptions.UserCancelledSSOExceptionLegacy;
import com.revolut.sso.api.exceptions.UserCancelledSsoException;
import com.revolut.sso.api.exceptions.UserFailedSsoException;
import i26.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import nii.y0;
import nkm.y;
import org.jetbrains.annotations.NotNull;
import r10.f;
import retrofit2.HttpException;
import zhm.d0;
import zhm.h0;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes20.dex */
public final class e implements a {

    @NotNull
    public static final c Companion = new c();
    public static final List d = v.k("POST", "PUT", "PATCH", "DELETE");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f141237a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j81.a f141238b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f141239c;

    public e(f dialogsProvider, j81.a errorReporter, List plugins) {
        Intrinsics.checkNotNullParameter(dialogsProvider, "dialogsProvider");
        Intrinsics.checkNotNullParameter(errorReporter, "errorReporter");
        Intrinsics.checkNotNullParameter(plugins, "plugins");
        this.f141237a = dialogsProvider;
        this.f141238b = errorReporter;
        this.f141239c = plugins;
    }

    public final i81.c a(i errorEvent) {
        i81.a aVar = i81.a.f159409a;
        Intrinsics.checkNotNullParameter(errorEvent, "errorEvent");
        try {
            List<Object> listJ = y.J(l.i(errorEvent.f5287b));
            ArrayList arrayList = new ArrayList(w.t(listJ, 10));
            for (Object objA : listJ) {
                if (objA instanceof HttpException) {
                    objA = com.revolut.core.error.data.model.a.a((HttpException) objA);
                }
                arrayList.add(objA);
            }
            Throwable th10 = (Throwable) d0.d0(arrayList);
            if (th10 == null) {
                th10 = errorEvent.f5287b;
            }
            if (errorEvent.f5288c == aii.a.DATA_LOADING) {
                this.f141238b.a(i.b(errorEvent, th10));
                return aVar;
            }
            Iterator it8 = arrayList.iterator();
            while (it8.hasNext()) {
                i81.c cVarC = c(i.b(errorEvent, (Throwable) it8.next()));
                if (cVarC != null) {
                    return cVarC;
                }
            }
            i iVarB = i.b(errorEvent, th10);
            return b(iVarB, new b(this, iVarB, 2));
        } catch (Exception e) {
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, "ErrorHandler", com.google.android.gms.internal.mlkit_vision_face.a.n("ErrorHandler failed: ", e), null, h0Var);
            return aVar;
        }
    }

    public final i81.c b(i event, Function0 function0) {
        aii.a aVar = event.f5288c;
        Throwable th10 = event.f5287b;
        int i = d.f141236a[aVar.ordinal()];
        boolean zT = true;
        if (i == 1) {
            zT = false;
        } else if (i != 2) {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            List list = d;
            Intrinsics.checkNotNullParameter(th10, "<this>");
            zT = d0.T(list, th10 instanceof NetworkConnectException ? ((NetworkConnectException) th10).f51447b : th10 instanceof ServerErrorException ? ((ServerErrorException) th10).f51365a : null);
        }
        if (zT) {
            return new i81.b((y0) function0.invoke());
        }
        Intrinsics.checkNotNullParameter(event, "event");
        String message = "Suspicious error thrown in unknown context: " + th10;
        Intrinsics.checkNotNullParameter(message, "message");
        SuspiciousErrorThrown suspiciousErrorThrown = new SuspiciousErrorThrown(message);
        j81.a.b(suspiciousErrorThrown, event.d);
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, "ErrorReporter", null, suspiciousErrorThrown, h0Var);
        return i81.a.f159409a;
    }

    public final i81.c c(i errorEvent) {
        i81.a aVar;
        Throwable th10 = errorEvent.f5287b;
        Iterator it8 = this.f141239c.iterator();
        do {
            aVar = null;
            if (!it8.hasNext()) {
                if (th10 instanceof NetworkConnectException) {
                    return b(errorEvent, new b(this, errorEvent, 0));
                }
                if (th10 instanceof ServerErrorException) {
                    return b(errorEvent, new b(this, errorEvent, 1));
                }
                return null;
            }
            ((s4l.a) it8.next()).getClass();
            Intrinsics.checkNotNullParameter(errorEvent, "errorEvent");
            if ((th10 instanceof HandledNetworkException) || (th10 instanceof UserCancelledSsoException) || (th10 instanceof UserCancelledSSOExceptionLegacy) || (th10 instanceof UserFailedSsoException) || (th10 instanceof UserFailedTwoFaException) || (th10 instanceof UserDeclinedTwoFaException)) {
                aVar = i81.a.f159409a;
            }
        } while (aVar == null);
        return aVar;
    }
}
