package caf;

import com.revolut.core.ui_kit.delegates.ff;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import o8b.g;
import org.jetbrains.annotations.NotNull;
import s7a.c0;
import vkm.v1;
import zhm.d0;

/* JADX INFO: loaded from: classes8.dex */
public final class c extends x7a.c {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n8b.b f22618a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fk3.a f22619b;

    public c(n8b.b countryUtils, fk3.a configurationInteractor) {
        Intrinsics.checkNotNullParameter(countryUtils, "countryUtils");
        Intrinsics.checkNotNullParameter(configurationInteractor, "configurationInteractor");
        this.f22618a = countryUtils;
        this.f22619b = configurationInteractor;
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
        return ((g) this.f22618a).a(countryCode.f297794a);
    }

    @Override // x7a.c
    public final Flow m(Object obj2) {
        return new v1(new b(this, null, 0));
    }

    @Override // x7a.c
    public final Flow o(Object obj2) {
        return new v1(new b(this, null, 1));
    }
}
