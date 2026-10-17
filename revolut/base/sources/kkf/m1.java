package kkf;

import android.net.Uri;
import com.revolut.kompot.common.ExternalDestination;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class m1 extends yji.n implements elf.s0 {

    @NotNull
    public static final l1 Companion = new l1();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final klf.h0 f184819l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final gi0.a f184820m;

    public m1(klf.h0 commonDataSource, gi0.a mobileServicesProvider) {
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        Intrinsics.checkNotNullParameter(mobileServicesProvider, "mobileServicesProvider");
        this.f184819l = commonDataSource;
        this.f184820m = mobileServicesProvider;
    }

    public final cmf.p Z2() {
        return new cmf.p(vkm.q.Q(this.f184819l.d(), new jy6.l((Continuation) null, this, 17)), new i0(6), zhm.u.c(this), "Geo");
    }

    @Override // elf.s0
    public final Object c(Object obj2, String str, Continuation continuation) {
        boolean z = false;
        if (Intrinsics.f(str, "ID_MAP_GEO_LOCATION")) {
            Pair pair = obj2 instanceof Pair ? (Pair) obj2 : null;
            if (pair != null) {
                rnf.a aVar = (rnf.a) pair.f186385a;
                String str2 = (String) pair.f186386b;
                A2(new ExternalDestination.ImplicitActivity("android.intent.action.VIEW", "com.google.android.apps.maps", Uri.parse("geo:" + aVar.f255656a + "," + aVar.f255657b + "?q=" + Uri.encode(str2)), 0, null, 490));
                z = true;
            }
        }
        return Boolean.valueOf(z);
    }
}
