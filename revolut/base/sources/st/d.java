package st;

import com.revolut.core.ui_kit.delegates.ff;
import com.revolut.core.ui_kit.models.CountryClause;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import pt.f;
import pt.m;
import s7a.c0;
import vkm.j2;
import zhm.d0;
import zjh.i;

/* JADX INFO: loaded from: classes17.dex */
public final class d extends x7a.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f265429a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f265430b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f01.a f265431c;

    public d(m screenModelApi, i popularCountriesProvider, f01.a uiKitResources) {
        Intrinsics.checkNotNullParameter(screenModelApi, "screenModelApi");
        Intrinsics.checkNotNullParameter(popularCountriesProvider, "popularCountriesProvider");
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        this.f265429a = screenModelApi;
        this.f265430b = popularCountriesProvider;
        this.f265431c = uiKitResources;
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
        return this.f265431c.b(new CountryClause(countryCode, null)).toString();
    }

    @Override // x7a.c
    public final Flow m(Object obj2) {
        return zi0.c.i(d0.P0(((f) ((j2) ((com.revolut.biometric_verification.impl.ui.step.document.manual_document_selection.a) this.f265429a).u.f22677a).getValue()).d, new c()));
    }

    @Override // x7a.c
    public final Flow o(Object obj2) {
        return zi0.c.i(d0.d1(this.f265430b.m()));
    }
}
