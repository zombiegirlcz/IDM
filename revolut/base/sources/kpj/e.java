package kpj;

import d3c.f0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class e {

    @NotNull
    public static final d Companion = new d();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final f0 f188254c = f0.ACTIVE;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ang.f f188255a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jf1.a f188256b;

    public e(ang.f userInteractor, jf1.a proMerchantTogglesInteractor) {
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(proMerchantTogglesInteractor, "proMerchantTogglesInteractor");
        this.f188255a = userInteractor;
        this.f188256b = proMerchantTogglesInteractor;
    }
}
