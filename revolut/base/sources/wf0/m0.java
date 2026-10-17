package wf0;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class m0 {

    @NotNull
    public static final l0 Companion = new l0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u0 f296904a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final vo6.b f296905b;

    public m0(u0 helpCenterRepository, vo6.b faqDataProvider) {
        Intrinsics.checkNotNullParameter(helpCenterRepository, "helpCenterRepository");
        Intrinsics.checkNotNullParameter(faqDataProvider, "faqDataProvider");
        this.f296904a = helpCenterRepository;
        this.f296905b = faqDataProvider;
    }

    public static akg.n a(m0 m0Var) {
        return nim.a.v(m0Var.f296904a.d.c(Unit.f186387a, false), new wdb.b(m0Var, 8));
    }
}
