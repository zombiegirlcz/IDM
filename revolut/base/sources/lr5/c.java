package lr5;

import java.time.LocalDateTime;
import kotlin.jvm.internal.Intrinsics;
import lkf.v;
import org.jetbrains.annotations.NotNull;
import rd0.e;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements jr5.a {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sd5.c f199396a;

    public c(sd5.c cryptoConfigInteractor) {
        Intrinsics.checkNotNullParameter(cryptoConfigInteractor, "cryptoConfigInteractor");
        this.f199396a = cryptoConfigInteractor;
    }

    public final v a() {
        return new v(mo3.a.g(e.b(this.f199396a.a(false)), null, null, 3), LocalDateTime.now(), 8);
    }
}
