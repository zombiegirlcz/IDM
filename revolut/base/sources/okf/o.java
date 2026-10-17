package okf;

import klf.h0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class o {

    @NotNull
    public static final l Companion = new l();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h0 f226025a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final al4.n f226026b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final cm4.j f226027c;
    public final glf.a d;

    public o(h0 commonDataSource, al4.n creditCardInteractor, cm4.j creditCardStatementMapper, glf.a creditInterestRelatedStatementClickHandler) {
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        Intrinsics.checkNotNullParameter(creditCardInteractor, "creditCardInteractor");
        Intrinsics.checkNotNullParameter(creditCardStatementMapper, "creditCardStatementMapper");
        Intrinsics.checkNotNullParameter(creditInterestRelatedStatementClickHandler, "creditInterestRelatedStatementClickHandler");
        this.f226025a = commonDataSource;
        this.f226026b = creditCardInteractor;
        this.f226027c = creditCardStatementMapper;
        this.d = creditInterestRelatedStatementClickHandler;
    }
}
