package yg6;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.y0;

/* JADX INFO: loaded from: classes3.dex */
public final class p extends pfe.c {

    @NotNull
    public static final n Companion = new n();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final oqk.k f313558m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final com.revolut.feature.external_accounts.api.navigation.a f313559n;
    public final oe6.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Set f313560p;

    public p(oqk.k transactionsWidgetActionExtension, com.revolut.feature.external_accounts.api.navigation.a externalPocketNavigationFactory, gte.a featureToggleInteractor, oe6.a externalInstitutionsInteractor) {
        Intrinsics.checkNotNullParameter(transactionsWidgetActionExtension, "transactionsWidgetActionExtension");
        Intrinsics.checkNotNullParameter(externalPocketNavigationFactory, "externalPocketNavigationFactory");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(externalInstitutionsInteractor, "externalInstitutionsInteractor");
        this.f313558m = transactionsWidgetActionExtension;
        this.f313559n = externalPocketNavigationFactory;
        this.o = externalInstitutionsInteractor;
        this.f313560p = y0.b(transactionsWidgetActionExtension);
    }

    @Override // pfe.a
    public final Set Z2() {
        return this.f313560p;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01a5  */
    @Override // pfe.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b3(sfe.s r18, kotlin.coroutines.Continuation r19) {
        /*
            Method dump skipped, instruction units count: 508
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yg6.p.b3(sfe.s, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
