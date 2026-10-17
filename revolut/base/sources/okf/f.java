package okf;

import klf.h0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.f0;

/* JADX INFO: loaded from: classes8.dex */
public final class f {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h0 f226009a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final al4.q f226010b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final al4.n f226011c;

    public f(h0 commonDataSource, al4.q creditCardProductInteractor, al4.n creditCardInteractor) {
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        Intrinsics.checkNotNullParameter(creditCardProductInteractor, "creditCardProductInteractor");
        Intrinsics.checkNotNullParameter(creditCardInteractor, "creditCardInteractor");
        this.f226009a = commonDataSource;
        this.f226010b = creditCardProductInteractor;
        this.f226011c = creditCardInteractor;
    }

    public final cmf.p a() {
        return new cmf.p(vkm.q.Q(vkm.q.r(new ob2.a(28), this.f226009a.d()), new ns9.h(null, this, 29)), new ok7.b(3), f0.f322471a, "CreditCardExplainer");
    }
}
