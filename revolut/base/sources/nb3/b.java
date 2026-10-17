package nb3;

import ang.f;
import dj0.d;
import efm.d0;
import efm.r;
import jb3.i;
import jb3.j;
import jb3.k;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import te0.w;
import ufm.n;

/* JADX INFO: loaded from: classes21.dex */
public final class b {

    @NotNull
    private static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w39.b f213978a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f213979b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f213980c;
    public final d49.a d;

    public b(w39.b locationInteractor, f userInteractor, j cashTopUpLocationRepository, d49.a distanceMeter) {
        Intrinsics.checkNotNullParameter(locationInteractor, "locationInteractor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(cashTopUpLocationRepository, "cashTopUpLocationRepository");
        Intrinsics.checkNotNullParameter(distanceMeter, "distanceMeter");
        this.f213978a = locationInteractor;
        this.f213979b = userInteractor;
        this.f213980c = cashTopUpLocationRepository;
        this.d = distanceMeter;
    }

    public final boolean a(co3.a firstLocation, co3.a secondLocation) {
        Intrinsics.checkNotNullParameter(firstLocation, "firstLocation");
        Intrinsics.checkNotNullParameter(secondLocation, "secondLocation");
        return this.d.a(firstLocation.f25486a, firstLocation.f25487b, secondLocation.f25486a, secondLocation.f25487b) <= 5.0f;
    }

    public final n b(d amount) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        j jVar = this.f213980c;
        jVar.getClass();
        Intrinsics.checkNotNullParameter(amount, "amount");
        d0<jo3.a> topupFee = jVar.f172588a.getTopupFee(amount.f115083b.f306286a, amount.f115082a);
        i iVar = i.f;
        h35.c cVar = new h35.c(26);
        topupFee.getClass();
        ufm.i iVar2 = new ufm.i(topupFee, cVar, 1);
        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
        return w.i0(iVar2);
    }

    public final r c(co3.a userLocation, co3.a searchLocation, cb3.a flowType) {
        Intrinsics.checkNotNullParameter(userLocation, "userLocation");
        Intrinsics.checkNotNullParameter(searchLocation, "searchLocation");
        Intrinsics.checkNotNullParameter(flowType, "flowType");
        j jVar = this.f213980c;
        jVar.getClass();
        Intrinsics.checkNotNullParameter(searchLocation, "searchLocation");
        Intrinsics.checkNotNullParameter(userLocation, "userLocation");
        Intrinsics.checkNotNullParameter(flowType, "flowType");
        return jVar.d.f(new k(userLocation, searchLocation, flowType), true);
    }
}
