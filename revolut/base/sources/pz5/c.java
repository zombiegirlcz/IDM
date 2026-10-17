package pz5;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements oz5.a {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qz5.b f240896a;

    public c(qz5.b authenticationInteractor) {
        Intrinsics.checkNotNullParameter(authenticationInteractor, "authenticationInteractor");
        this.f240896a = authenticationInteractor;
    }

    @Override // oz5.a
    public final String name() {
        return "Authorization";
    }

    @Override // oz5.a
    public final String value() {
        String strB = this.f240896a.b();
        if (strB == null) {
            strB = "";
        }
        return "Bearer ".concat(strB);
    }
}
