package c1g;

import com.revolut.core.ui_kit.delegates.ff;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class d extends a8a.c {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fk3.a f20477a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n8b.a f20478b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n8b.b f20479c;

    public d(fk3.a configurationInteractor, n8b.a countryInteractor, n8b.b countryUtils) {
        Intrinsics.checkNotNullParameter(configurationInteractor, "configurationInteractor");
        Intrinsics.checkNotNullParameter(countryInteractor, "countryInteractor");
        Intrinsics.checkNotNullParameter(countryUtils, "countryUtils");
        this.f20477a = configurationInteractor;
        this.f20478b = countryInteractor;
        this.f20479c = countryUtils;
    }

    @Override // a8a.d
    public final y7a.w d(Set ids, Object obj2) {
        Intrinsics.checkNotNullParameter(ids, "ids");
        String str = (String) zhm.d0.c0(ids);
        if (str != null) {
            return new c(str, ((o8b.g) this.f20479c).a(str));
        }
        t0 t0Var = t0.f186434a;
        m70.a.c(t0Var);
        Intrinsics.checkNotNullParameter(t0Var, "<this>");
        return new c("", "");
    }

    @Override // a8a.c
    public final ff f() {
        return ff.DP_40;
    }

    @Override // a8a.c
    public final String h(wi0.b countryCode) {
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        return ((o8b.g) this.f20479c).a(countryCode.f297794a);
    }

    @Override // a8a.c
    public final efm.r i() {
        efm.r rVarFromCallable = efm.r.fromCallable(new a(this, 1));
        Intrinsics.checkNotNullExpressionValue(rVarFromCallable, "fromCallable(...)");
        return rVarFromCallable;
    }

    @Override // a8a.c
    public final efm.r j() {
        efm.r rVarFromCallable = efm.r.fromCallable(new a(this, 0));
        Intrinsics.checkNotNullExpressionValue(rVarFromCallable, "fromCallable(...)");
        return rVarFromCallable;
    }
}
