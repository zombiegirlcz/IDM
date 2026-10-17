package xde;

import com.revolut.core.ui_kit.delegates.ff;
import efm.r;
import java.util.Locale;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import y7a.w;
import zhm.d0;

/* JADX INFO: loaded from: classes8.dex */
public final class c extends a8a.c {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n8b.a f304420a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fk3.a f304421b;

    public c(n8b.a countryInteractor, fk3.a configurationInteractor) {
        Intrinsics.checkNotNullParameter(countryInteractor, "countryInteractor");
        Intrinsics.checkNotNullParameter(configurationInteractor, "configurationInteractor");
        this.f304420a = countryInteractor;
        this.f304421b = configurationInteractor;
    }

    @Override // a8a.d
    public final w d(Set ids, Object obj2) {
        Intrinsics.checkNotNullParameter(ids, "ids");
        return new b8a.a((String) d0.a0(ids));
    }

    @Override // a8a.c
    public final ff f() {
        return ff.DP_40;
    }

    @Override // a8a.c
    public final String g(wi0.b countryCode) {
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        String upperCase = countryCode.f297794a.toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        return upperCase;
    }

    @Override // a8a.c
    public final String h(wi0.b countryCode) {
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        return ((o8b.c) this.f304420a).b(countryCode.f297794a);
    }

    @Override // a8a.c
    public final r i() {
        r rVarFromCallable = r.fromCallable(new a(this, 1));
        Intrinsics.checkNotNullExpressionValue(rVarFromCallable, "fromCallable(...)");
        return rVarFromCallable;
    }

    @Override // a8a.c
    public final r j() {
        r rVarFromCallable = r.fromCallable(new a(this, 0));
        Intrinsics.checkNotNullExpressionValue(rVarFromCallable, "fromCallable(...)");
        return rVarFromCallable;
    }
}
