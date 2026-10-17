package pkf;

import java.util.Set;
import kotlin.Lazy;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class h2 extends yji.n implements elf.s0 {

    @NotNull
    public static final g2 Companion = new g2();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final Lazy f237066s = yhm.j.b(new pka.c(13));

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final klf.h0 f237067l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final l61.a f237068m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ylg.b f237069n;
    public final hc5.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final bbj.c f237070p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final rhf.d f237071q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final v9j.a f237072r;

    public h2(klf.h0 commonDataSource, l61.a userCompanyInteractor, ylg.b userInteractor, hc5.a cryptoAccountInteractor, bbj.c cryptoDisclaimerMapper, rhf.d entryPoint, v9j.a cryptoDisclaimerControllerModelExtension) {
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        Intrinsics.checkNotNullParameter(userCompanyInteractor, "userCompanyInteractor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(cryptoAccountInteractor, "cryptoAccountInteractor");
        Intrinsics.checkNotNullParameter(cryptoDisclaimerMapper, "cryptoDisclaimerMapper");
        Intrinsics.checkNotNullParameter(entryPoint, "entryPoint");
        Intrinsics.checkNotNullParameter(cryptoDisclaimerControllerModelExtension, "cryptoDisclaimerControllerModelExtension");
        this.f237067l = commonDataSource;
        this.f237068m = userCompanyInteractor;
        this.f237069n = userInteractor;
        this.o = cryptoAccountInteractor;
        this.f237070p = cryptoDisclaimerMapper;
        this.f237071q = entryPoint;
        this.f237072r = cryptoDisclaimerControllerModelExtension;
    }

    @Override // elf.s0
    public final Object c(Object obj2, String str, Continuation continuation) {
        boolean z;
        Companion.getClass();
        if (((Set) f237066s.getValue()).contains(str)) {
            m70.a.c(kotlin.jvm.internal.t0.f186434a);
            this.f237072r.Z2(new ty0.a(str, "", null, obj2, 4));
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
