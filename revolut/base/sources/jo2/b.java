package jo2;

import com.revolut.core.ui_kit.delegates.ff;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlinx.coroutines.flow.Flow;
import o8b.g;
import s7a.c0;
import vkm.v1;
import x7a.c;
import zhm.d0;

/* JADX INFO: loaded from: classes21.dex */
public final class b extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n8b.b f176855a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fk3.a f176856b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z80.b f176857c;

    public b(n8b.b countryUtils, fk3.a configurationInteractor, z80.b phoneToolsProvider) {
        Intrinsics.checkNotNullParameter(countryUtils, "countryUtils");
        Intrinsics.checkNotNullParameter(configurationInteractor, "configurationInteractor");
        Intrinsics.checkNotNullParameter(phoneToolsProvider, "phoneToolsProvider");
        this.f176855a = countryUtils;
        this.f176856b = configurationInteractor;
        this.f176857c = phoneToolsProvider;
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
        String strJ = this.f176857c.j(countryCode);
        return a0.H(strJ, "+", false) ? strJ : "+".concat(strJ);
    }

    @Override // x7a.c
    public final String k(wi0.b countryCode) {
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        return ((g) this.f176855a).a(countryCode.f297794a);
    }

    @Override // x7a.c
    public final Flow m(Object obj2) {
        return new v1(new a(this, null, 0));
    }

    @Override // x7a.c
    public final Flow o(Object obj2) {
        return new v1(new a(this, null, 1));
    }
}
