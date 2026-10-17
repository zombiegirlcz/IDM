package p0f;

import com.revolut.core.ui_kit.delegates.ff;
import e0f.u0;
import java.util.Locale;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import n8b.b;
import nt.e;
import o8b.g;
import ozc.n;
import s7a.c0;
import vkm.q0;
import w4l.j;
import x7a.c;
import zhm.d0;
import zhm.f0;

/* JADX INFO: loaded from: classes8.dex */
public final class a extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f231527a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final yue.b f231528b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u0 f231529c;

    public a(b countryUtils, yue.b mcyTopupCountryRepository, u0 mcyTopupErrorInteractor) {
        Intrinsics.checkNotNullParameter(countryUtils, "countryUtils");
        Intrinsics.checkNotNullParameter(mcyTopupCountryRepository, "mcyTopupCountryRepository");
        Intrinsics.checkNotNullParameter(mcyTopupErrorInteractor, "mcyTopupErrorInteractor");
        this.f231527a = countryUtils;
        this.f231528b = mcyTopupCountryRepository;
        this.f231529c = mcyTopupErrorInteractor;
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
    public final String j(wi0.b countryCode) {
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        String upperCase = countryCode.f297794a.toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        return upperCase;
    }

    @Override // x7a.c
    public final String k(wi0.b countryCode) {
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        return ((g) this.f231527a).a(countryCode.f297794a);
    }

    @Override // x7a.c
    public final Flow m(Object obj2) {
        j loadingStrategy = j.f294644c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return new q0(nim.a.v(this.f231528b.f317018c.b(Unit.f186387a, loadingStrategy), new n(28)), new e(2, this.f231529c, u0.class, "extractDocumentExpiredError", "extractDocumentExpiredError(Lcom/revolut/data/model/Data;)V", 4, 25), 1);
    }

    @Override // x7a.c
    public final Flow o(Object obj2) {
        return zi0.c.i(f0.f322471a);
    }
}
