package f0f;

import ewa.d;
import ipa.j;
import ipa.k;
import kotlin.coroutines.g;
import kotlin.jvm.internal.Intrinsics;
import skm.e0;
import vkm.q;
import vkm.z1;

/* JADX INFO: loaded from: classes8.dex */
public final class a implements hpa.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z1 f131119a = q.b(0, 7, null);

    @Override // hpa.a
    public final boolean b(j message) throws Throwable {
        Intrinsics.checkNotNullParameter(message, "message");
        boolean zF = Intrinsics.f(k.b(message), "EXTERNAL_CARD_BLOCK");
        if (zF) {
            e0.E(g.f186406a, new d(this, null, 4));
        }
        return zF;
    }
}
