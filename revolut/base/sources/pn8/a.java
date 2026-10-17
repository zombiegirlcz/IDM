package pn8;

import hn8.b;
import ipa.j;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.coroutines.g;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import org.jetbrains.annotations.NotNull;
import rd0.c;
import rd0.d;
import skm.e0;
import vkm.q;
import vkm.z1;
import zhm.h0;

/* JADX INFO: loaded from: classes13.dex */
public final class a implements b {

    @NotNull
    public static final C1318a Companion = new C1318a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z1 f237678a = q.b(0, 7, null);

    /* JADX INFO: renamed from: pn8.a$a, reason: collision with other inner class name */
    public static final class C1318a {
        private C1318a() {
        }
    }

    @Override // hpa.a
    public final boolean b(j message) throws Throwable {
        Intrinsics.checkNotNullParameter(message, "message");
        if (!Intrinsics.f(message.get("qrCodeValidationAction"), "GIVE_PERSONAL_DATA_CONSENT")) {
            return false;
        }
        String str = (String) message.get("youthId");
        if (str != null && !d0.W(str)) {
            e0.E(g.f186406a, new pdi.j(this, str, null, 28));
            return true;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Received null or blank for juniorId while receiving QR code validation");
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = d.f253311a;
        d.a(c.ERROR, null, null, illegalArgumentException, h0Var);
        return true;
    }
}
