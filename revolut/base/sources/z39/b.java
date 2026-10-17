package z39;

import com.revolut.feature.address.models.Address;
import e4k.m0;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import nkm.y;
import org.jetbrains.annotations.NotNull;
import rfm.w;
import ufm.i;
import z1i.l;
import z1i.n;

/* JADX INFO: loaded from: classes13.dex */
public final class b implements w39.b {

    @NotNull
    private static final a Companion = new a(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c49.f f319220a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c49.d f319221b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final qd0.b f319222c;

    public b(c49.f securityLocationRepository, c49.d locationRepository, qd0.b languageProvider) {
        Intrinsics.checkNotNullParameter(securityLocationRepository, "securityLocationRepository");
        Intrinsics.checkNotNullParameter(locationRepository, "locationRepository");
        Intrinsics.checkNotNullParameter(languageProvider, "languageProvider");
        this.f319220a = securityLocationRepository;
        this.f319221b = locationRepository;
        this.f319222c = languageProvider;
    }

    public final ufm.c b() {
        return this.f319220a.f21127b.e("android.permission.ACCESS_FINE_LOCATION");
    }

    public final i c(Long l2) {
        i iVar = new i(b(), new n(new m0(this, l2 != null ? l2.longValue() : 5000L, 20), 26), 0);
        Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
        return iVar;
    }

    public final w d(Address address) {
        Intrinsics.checkNotNullParameter(address, "address");
        Locale localeA = ((s80.b) this.f319222c).a();
        String displayCountry = new Locale(localeA.getLanguage(), address.getCountry()).getDisplayCountry(localeA);
        Intrinsics.h(displayCountry);
        if (d0.W(displayCountry)) {
            displayCountry = null;
        }
        if (displayCountry == null) {
            displayCountry = address.getCountry();
        }
        String[] elements = {address.getStreetLine1(), address.getStreetLine2(), address.getRegion(), address.getCity(), address.getNeighborhood(), address.getPostcode(), displayCountry};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return this.f319221b.d(y.u(y.o(kotlin.collections.d.E(elements), new l(22)), ", ", null, 62));
    }

    public final pfm.a e(String owner, boolean z) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        pfm.a aVar = new pfm.a(this.f319221b.b(), new n(new wo5.a(z, this, owner), 28), 4);
        Intrinsics.checkNotNullExpressionValue(aVar, "flatMapCompletable(...)");
        return aVar;
    }
}
