package noi;

import android.provider.Settings;
import ho.w;
import ho.x;
import ho.y;
import ie.r;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class i extends h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h70.a f218055a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final sh0.a f218056b;

    public i(bm0.a cryptoWrapper, h70.a devOptions, sh0.a crashlytics, gi0.a mobileServicesProvider) {
        Intrinsics.checkNotNullParameter(cryptoWrapper, "cryptoWrapper");
        Intrinsics.checkNotNullParameter(devOptions, "devOptions");
        Intrinsics.checkNotNullParameter(crashlytics, "crashlytics");
        Intrinsics.checkNotNullParameter(mobileServicesProvider, "mobileServicesProvider");
        this.f218055a = devOptions;
        this.f218056b = crashlytics;
    }

    @Override // noi.h
    public final boolean a() {
        return false;
    }

    @Override // noi.h
    public final void d(y info) {
        String id10;
        Intrinsics.checkNotNullParameter(info, "info");
        if (info instanceof x) {
            id10 = null;
        } else {
            if (!(info instanceof w)) {
                throw new NoWhenBranchMatchedException();
            }
            id10 = ((w) info).a();
        }
        if (id10 != null) {
            Intrinsics.checkNotNullParameter(id10, "id");
            r rVar = ee.c.a().f125046a;
            rVar.o.f173167a.b(new ce.j(rVar, id10, 6));
        }
        boolean z = Settings.System.getInt(this.f218055a.f149832a.getContentResolver(), "always_finish_activities", 0) != 0;
        Intrinsics.checkNotNullParameter("dka_enabled", "key");
        r rVar2 = ee.c.a().f125046a;
        rVar2.o.f173167a.b(new ag.n(rVar2, 3, "dka_enabled", Boolean.toString(z)));
        this.f218056b.b("mobile_services", gh0.d.GOOGLE.a());
    }

    @Override // noi.h
    public final void e(boolean z) {
    }
}
