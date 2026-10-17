package r8j;

import io3.l;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wsg.n;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes11.dex */
public final class g implements d {

    @NotNull
    public static final e Companion = new e();
    public static final List d;
    public static final List e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f252466a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l61.a f252467b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final gte.a f252468c;

    static {
        l lVar = l.CURRENT;
        d = v.k(lVar, l.SAVINGS);
        e = u.c(lVar);
    }

    public g(n walletInteractor, l61.a userCompanyInteractor, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(userCompanyInteractor, "userCompanyInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f252466a = walletInteractor;
        this.f252467b = userCompanyInteractor;
        this.f252468c = featureToggleInteractor;
    }
}
