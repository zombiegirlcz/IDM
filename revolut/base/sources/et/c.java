package et;

import com.revolut.core.ui_kit.delegates.ff;
import com.revolut.core.ui_kit.models.CountryClause;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import s7a.c0;
import zhm.d0;
import zhm.f0;
import zjh.i;

/* JADX INFO: loaded from: classes17.dex */
public final class c extends x7a.c {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zr.a f128998a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f128999b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f01.a f129000c;

    public c(zr.a documentCountriesInteractor, i popularCountriesProvider, f01.a uiKitResources) {
        Intrinsics.checkNotNullParameter(documentCountriesInteractor, "documentCountriesInteractor");
        Intrinsics.checkNotNullParameter(popularCountriesProvider, "popularCountriesProvider");
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        this.f128998a = documentCountriesInteractor;
        this.f128999b = popularCountriesProvider;
        this.f129000c = uiKitResources;
    }

    @Override // x7a.d
    public final c0 c(Set ids, Object obj2) {
        Intrinsics.checkNotNullParameter(ids, "ids");
        return new c8a.a((String) d0.a0(ids));
    }

    @Override // x7a.c
    public final ff i() {
        return ff.DP_40;
    }

    @Override // x7a.c
    public final String k(wi0.b countryCode) {
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        return this.f129000c.b(new CountryClause(countryCode, null)).toString();
    }

    @Override // x7a.c
    public final Flow m(Object obj2) {
        Iterable iterable = (List) this.f128998a.f324503a.f199343a.get("BIOMETRIC_VERIFICATION_DOCUMENT_COUNTRIES_MEMORY_CACHE_KEY");
        if (iterable == null) {
            iterable = f0.f322471a;
        }
        return zi0.c.i(d0.P0(iterable, new b()));
    }

    @Override // x7a.c
    public final Flow o(Object obj2) {
        return zi0.c.i(d0.d1(this.f128999b.m()));
    }
}
