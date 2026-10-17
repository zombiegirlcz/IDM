package klf;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import tof.v6;

/* JADX INFO: loaded from: classes8.dex */
public final class y0 {

    @NotNull
    public static final u0 Companion = new u0();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Set f185607c;
    public static final Set d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h0 f185608a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fbj.a f185609b;

    static {
        v6[] elements = {v6.CREATED, v6.PENDING};
        Intrinsics.checkNotNullParameter(elements, "elements");
        f185607c = kotlin.collections.d.y0(elements);
        yk5.e[] elements2 = {yk5.e.COMPLETED, yk5.e.RETURNED};
        Intrinsics.checkNotNullParameter(elements2, "elements");
        d = kotlin.collections.d.y0(elements2);
    }

    public y0(h0 commonDataSource, fbj.a cryptoDepositsInteractor) {
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        Intrinsics.checkNotNullParameter(cryptoDepositsInteractor, "cryptoDepositsInteractor");
        this.f185608a = commonDataSource;
        this.f185609b = cryptoDepositsInteractor;
    }
}
