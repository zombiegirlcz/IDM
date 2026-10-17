package bn5;

import com.revolut.core.ui_kit.delegates.ff;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import s7a.c0;
import vkm.v1;
import zhm.d0;

/* JADX INFO: loaded from: classes3.dex */
public final class n extends x7a.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n8b.b f17118a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fk3.a f17119b;

    public n(n8b.b countryUtils, fk3.a configurationInteractor) {
        Intrinsics.checkNotNullParameter(countryUtils, "countryUtils");
        Intrinsics.checkNotNullParameter(configurationInteractor, "configurationInteractor");
        this.f17118a = countryUtils;
        this.f17119b = configurationInteractor;
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
        return ((o8b.g) this.f17118a).a(countryCode.f297794a);
    }

    @Override // x7a.c
    public final Flow m(Object obj2) {
        return new v1(new m(this, null, 0));
    }

    @Override // x7a.c
    public final Flow o(Object obj2) {
        return new v1(new m(this, null, 1));
    }
}
