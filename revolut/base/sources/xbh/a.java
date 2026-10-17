package xbh;

import aw0.o9;
import bw0.d;
import com.google.android.gms.location.DeviceOrientationRequest;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.MoneyClause;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xi0.b;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes9.dex */
public final class a {

    @NotNull
    private static final C1691a Companion = new C1691a();

    /* JADX INFO: renamed from: xbh.a$a, reason: collision with other inner class name */
    public static final class C1691a {
        private C1691a() {
        }
    }

    public final ArrayList a(b suggestionCurrency) {
        Intrinsics.checkNotNullParameter(suggestionCurrency, "suggestionCurrency");
        Companion.getClass();
        List listK = v.k(2000L, 5000L, 10000L, Long.valueOf(DeviceOrientationRequest.OUTPUT_PERIOD_DEFAULT));
        ArrayList arrayList = new ArrayList(w.t(listK, 10));
        int i = 0;
        for (Object obj2 : listK) {
            int i2 = i + 1;
            if (i < 0) {
                v.s();
                throw null;
            }
            arrayList.add(new d(6, new MoneyClause(new dj0.d(((Number) obj2).longValue(), suggestionCurrency), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, o9.NON_SENSITIVE, 4), (Clause) null));
            i = i2;
        }
        return arrayList;
    }
}
