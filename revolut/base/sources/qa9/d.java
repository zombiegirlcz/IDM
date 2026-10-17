package qa9;

import com.revolut.core.ui_kit.delegates.ff;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import s7a.c0;
import vkm.v1;
import zhm.d0;

/* JADX INFO: loaded from: classes5.dex */
public final class d extends x7a.c {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fk3.a f243980a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n8b.a f243981b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n8b.b f243982c;

    public d(fk3.a configurationInteractor, n8b.a countryInteractor, n8b.b countryUtils) {
        Intrinsics.checkNotNullParameter(configurationInteractor, "configurationInteractor");
        Intrinsics.checkNotNullParameter(countryInteractor, "countryInteractor");
        Intrinsics.checkNotNullParameter(countryUtils, "countryUtils");
        this.f243980a = configurationInteractor;
        this.f243981b = countryInteractor;
        this.f243982c = countryUtils;
    }

    @Override // x7a.d
    public final c0 c(Set ids, Object obj2) {
        Intrinsics.checkNotNullParameter(ids, "ids");
        return new s7a.q((String) d0.a0(ids), null);
    }

    @Override // x7a.c
    public final ff i() {
        return ff.DP_40;
    }

    @Override // x7a.c
    public final String k(wi0.b countryCode) {
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        return ((o8b.g) this.f243982c).a(countryCode.f297794a);
    }

    @Override // x7a.c
    public final Flow m(Object obj2) {
        return new v1(new c(this, null, 0));
    }

    @Override // x7a.c
    public final Flow o(Object obj2) {
        return new v1(new c(this, null, 1));
    }
}
