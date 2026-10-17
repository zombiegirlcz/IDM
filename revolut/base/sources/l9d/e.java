package l9d;

import dcl.q;
import kotlin.jvm.internal.Intrinsics;
import lde.n;
import org.jetbrains.annotations.NotNull;
import wf0.u0;

/* JADX INFO: loaded from: classes7.dex */
public final class e {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ie.a f193136a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final bef.b f193137b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n f193138c;
    public final u0 d;

    public e(ie.a cardsTroubleshooterInteractor, bef.b transactionItemProvider, q repository, n sharedHelpWidgetsInteractor, u0 helpCenterRepository) {
        Intrinsics.checkNotNullParameter(cardsTroubleshooterInteractor, "cardsTroubleshooterInteractor");
        Intrinsics.checkNotNullParameter(transactionItemProvider, "transactionItemProvider");
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(sharedHelpWidgetsInteractor, "sharedHelpWidgetsInteractor");
        Intrinsics.checkNotNullParameter(helpCenterRepository, "helpCenterRepository");
        this.f193136a = cardsTroubleshooterInteractor;
        this.f193137b = transactionItemProvider;
        this.f193138c = sharedHelpWidgetsInteractor;
        this.d = helpCenterRepository;
    }
}
