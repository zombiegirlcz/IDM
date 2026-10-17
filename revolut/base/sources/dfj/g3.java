package dfj;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class g3 {

    @NotNull
    public static final a3 Companion = new a3();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s3 f113979a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v2 f113980b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c0 f113981c;
    public final ynj.o d;

    public g3(s3 subscriptionsInteractor, v2 profilesInteractor, c0 giftingInteractor, ynj.o qrCodeGenerator) {
        Intrinsics.checkNotNullParameter(subscriptionsInteractor, "subscriptionsInteractor");
        Intrinsics.checkNotNullParameter(profilesInteractor, "profilesInteractor");
        Intrinsics.checkNotNullParameter(giftingInteractor, "giftingInteractor");
        Intrinsics.checkNotNullParameter(qrCodeGenerator, "qrCodeGenerator");
        this.f113979a = subscriptionsInteractor;
        this.f113980b = profilesInteractor;
        this.f113981c = giftingInteractor;
        this.d = qrCodeGenerator;
    }
}
