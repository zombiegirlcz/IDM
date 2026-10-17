package mkf;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class l {

    @NotNull
    public static final j Companion = new j();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final klf.h0 f206253a;

    public l(klf.h0 commonDataSource) {
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        this.f206253a = commonDataSource;
    }

    public final cmf.p a() {
        return new cmf.p(new lkf.v(this.f206253a.d(), this, 17), new mfl.b(28), zhm.f0.f322471a, "BankTransferFooterLogo");
    }
}
