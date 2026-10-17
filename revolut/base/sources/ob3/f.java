package ob3;

import ipa.j;
import ipa.k;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.coroutines.g;
import kotlin.jvm.internal.Intrinsics;
import nya.i0;
import org.jetbrains.annotations.NotNull;
import skm.e0;
import vkm.q;
import vkm.z1;
import zhm.h0;

/* JADX INFO: loaded from: classes13.dex */
public final class f implements db3.b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z1 f223871a = q.b(0, 7, null);

    public static final class a {
        private a() {
        }
    }

    @Override // hpa.a
    public final boolean b(j message) throws Throwable {
        Intrinsics.checkNotNullParameter(message, "message");
        if (!Intrinsics.f(k.b(message), "cashdeposit")) {
            return false;
        }
        String str = (String) message.get("transactionId");
        if (str == null || str.length() == 0) {
            IllegalStateException illegalStateException = new IllegalStateException(j6.a.q("Push was not processed because of invalid transaction id: ", str));
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
            return false;
        }
        String str2 = (String) message.get("event");
        if (Intrinsics.f(str2 != null ? Boolean.valueOf(str2.equalsIgnoreCase("LOCKED")) : null, Boolean.TRUE)) {
            e0.E(g.f186406a, new i0(this, str, null, 18));
            CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
            rd0.d.b(rd0.c.DEBUG, "BarcodeScannedPushInterceptor", "Push message handled by ".concat(f.class.getSimpleName()), null, null, 16);
            return true;
        }
        IllegalStateException illegalStateException2 = new IllegalStateException(a0.d.m(message.get("event"), "Push was not processed because of invalid event: "));
        h0 h0Var2 = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList3 = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, null, null, illegalStateException2, h0Var2);
        return false;
    }
}
