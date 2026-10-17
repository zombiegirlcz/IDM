package mkf;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class s0 {

    @NotNull
    public static final r0 Companion = new r0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q0 f206270a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k0 f206271b;

    public s0(q0 retryableDirectDebitDisplayChecker, k0 directDebitRetryTagProvider) {
        Intrinsics.checkNotNullParameter(retryableDirectDebitDisplayChecker, "retryableDirectDebitDisplayChecker");
        Intrinsics.checkNotNullParameter(directDebitRetryTagProvider, "directDebitRetryTagProvider");
        this.f206270a = retryableDirectDebitDisplayChecker;
        this.f206271b = directDebitRetryTagProvider;
    }
}
