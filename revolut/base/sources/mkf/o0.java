package mkf;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class o0 {

    @NotNull
    public static final m0 Companion = new m0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final klf.h0 f206259a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final er1.b f206260b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final flf.n f206261c;

    public o0(klf.h0 commonDataSource, er1.b postalCheckFeatureChecker, flf.n postalCheckReceiptClickHandler) {
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        Intrinsics.checkNotNullParameter(postalCheckFeatureChecker, "postalCheckFeatureChecker");
        Intrinsics.checkNotNullParameter(postalCheckReceiptClickHandler, "postalCheckReceiptClickHandler");
        this.f206259a = commonDataSource;
        this.f206260b = postalCheckFeatureChecker;
        this.f206261c = postalCheckReceiptClickHandler;
    }
}
