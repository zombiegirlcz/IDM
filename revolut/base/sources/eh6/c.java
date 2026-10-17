package eh6;

import a08.l;
import com.revolut.feature.external_accounts.impl.destinations.CreateMandateResultDestination;
import com.revolut.feature.external_accounts.impl.destinations.MandateResult;
import dj0.d;
import efm.d0;
import java.util.HashMap;
import ke6.t;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.z;
import org.jetbrains.annotations.NotNull;
import q06.h;
import sri.m;
import wp5.y;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements t {

    @NotNull
    private static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f125740a;

    public c(m navigator) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.f125740a = navigator;
    }

    public static CreateMandateResultDestination b(jf0.c cVar) {
        Long lN;
        HashMap map = cVar.d;
        String str = (String) map.get("mandate_id");
        d dVar = null;
        if (str == null) {
            return null;
        }
        boolean zF = Intrinsics.f(map.get("success"), "true");
        String str2 = (String) map.get("initial_payment_amount");
        if (str2 != null && (lN = z.n(str2)) != null) {
            long jLongValue = lN.longValue();
            String str3 = (String) map.get("initial_payment_currency");
            if (str3 != null) {
                xi0.b.Companion.getClass();
                dVar = new d(jLongValue, xi0.a.a(str3));
            }
        }
        return new CreateMandateResultDestination(new MandateResult(dVar, str, zF, !Intrinsics.f(map.get("replaced"), "false")));
    }

    @Override // jf0.d, q06.k
    public final boolean a(jf0.c cVar) {
        return y.D(cVar, "deeplink", 1, "mandate-institution-auth");
    }

    @Override // q06.k
    public final Object e(jf0.c cVar, Continuation continuation) {
        CreateMandateResultDestination createMandateResultDestinationB = b(cVar);
        if (createMandateResultDestinationB != null) {
            return new h(createMandateResultDestinationB, null);
        }
        return null;
    }

    @Override // jf0.d
    public final d0 f(jf0.c deeplink, boolean z) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        pfm.z zVarD = new pfm.h(new l(this, deeplink, 25), 2).D(Boolean.TRUE);
        Intrinsics.checkNotNullExpressionValue(zVarD, "toSingleDefault(...)");
        return zVarD;
    }
}
