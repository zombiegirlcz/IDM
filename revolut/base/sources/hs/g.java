package hs;

import com.revolut.biometric_verification.api.navigation.BiometricVerificationFlowProvider$InputData;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zr.k;

/* JADX INFO: loaded from: classes17.dex */
public final class g implements e {

    @NotNull
    public static final f Companion = new f();
    public static final Set f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final iy.b f154838a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f154839b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final lr.h f154840c;
    public final jx0.a d;
    public final BiometricVerificationFlowProvider$InputData e;

    static {
        rr.d[] elements = {rr.d.FACE_EMBEDDING, rr.d.COMPACT_SELFIE};
        Intrinsics.checkNotNullParameter(elements, "elements");
        f = kotlin.collections.d.y0(elements);
    }

    public g(iy.b experimentsInteractor, k interactor, lr.h repository, jx0.a jwtDecoder, BiometricVerificationFlowProvider$InputData inputData) {
        Intrinsics.checkNotNullParameter(experimentsInteractor, "experimentsInteractor");
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(jwtDecoder, "jwtDecoder");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f154838a = experimentsInteractor;
        this.f154839b = interactor;
        this.f154840c = repository;
        this.d = jwtDecoder;
        this.e = inputData;
    }
}
