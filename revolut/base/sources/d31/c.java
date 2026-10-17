package d31;

import com.revolut.data.network.services.ThreeDSService;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import mm0.e;
import org.jetbrains.annotations.NotNull;
import qr0.i;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ThreeDSService f110897a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f110898b;

    public c(ThreeDSService threeDSService, i threeDSIntegrityHasher) {
        Intrinsics.checkNotNullParameter(threeDSService, "threeDSService");
        Intrinsics.checkNotNullParameter(threeDSIntegrityHasher, "threeDSIntegrityHasher");
        this.f110897a = threeDSService;
        this.f110898b = threeDSIntegrityHasher;
    }

    public static String a(e eVar) {
        int i = b.f110896a[eVar.ordinal()];
        if (i == 1) {
            return "passcode";
        }
        if (i == 2) {
            return "faceId";
        }
        if (i == 3) {
            return "fingerprint";
        }
        if (i == 4) {
            return "unknown";
        }
        throw new NoWhenBranchMatchedException();
    }
}
