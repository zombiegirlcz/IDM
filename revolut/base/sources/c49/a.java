package c49;

import android.location.Location;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.feature.location.api.domain.models.location.LocationDomain;
import efm.c0;
import efm.d0;
import efm.i;
import efm.k;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import qfm.f0;
import rfm.h;
import te0.w;
import ufm.n;
import ufm.p;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21117a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f21118b;

    public /* synthetic */ a(d dVar, int i) {
        this.f21117a = i;
        this.f21118b = dVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f21117a) {
            case 0:
                Boolean granted = (Boolean) obj2;
                Intrinsics.checkNotNullParameter(granted, "granted");
                if (!granted.booleanValue()) {
                    return d0.l(new IllegalStateException("location permissions not granted"));
                }
                d dVar = this.f21118b;
                n nVarE = dVar.e();
                TimeUnit timeUnit = TimeUnit.SECONDS;
                i iVarH = dVar.h(BitmapDescriptorFactory.HUE_RED, 1000L);
                iVarH.getClass();
                f0 f0Var = new f0(iVarH, null);
                c0 c0Var = hhm.f.f152430b;
                mfm.f.b(timeUnit, "unit is null");
                mfm.f.b(c0Var, "scheduler is null");
                p pVar = new p(nVarE, 20L, timeUnit, c0Var, f0Var);
                Intrinsics.checkNotNullExpressionValue(pVar, "timeout(...)");
                return w.i0(pVar);
            case 1:
                Location it8 = (Location) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return this.f21118b.e.a(it8) ? h.f253943a : k.g(new LocationDomain(it8.getLatitude(), it8.getLongitude()));
            default:
                Intrinsics.checkNotNullParameter((Location) obj2, "it");
                return Boolean.valueOf(!this.f21118b.e.a(r8));
        }
    }
}
