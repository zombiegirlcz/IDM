package fb;

import com.feature.user.details.impl.ui.flow.UserDetailsFlowContract$InputData;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import org.jetbrains.annotations.NotNull;
import rp0.g1;
import til.m;
import yki.i;

/* JADX INFO: loaded from: classes16.dex */
public final class f extends h implements b {

    @NotNull
    public static final d Companion = new d();
    public final m o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final bb.b f133419p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final kgm.c f133420q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final by5.a f133421r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final g1 f133422s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ang.f f133423t;
    public final i u;

    public f(m workflowFlowProvider, bb.b userDetailsRepository, kgm.c userAuthInteractor, by5.a userDetailsFlowDialogMapper, g1 shotDialogDisplayer, ang.f userInteractor, UserDetailsFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(workflowFlowProvider, "workflowFlowProvider");
        Intrinsics.checkNotNullParameter(userDetailsRepository, "userDetailsRepository");
        Intrinsics.checkNotNullParameter(userAuthInteractor, "userAuthInteractor");
        Intrinsics.checkNotNullParameter(userDetailsFlowDialogMapper, "userDetailsFlowDialogMapper");
        Intrinsics.checkNotNullParameter(shotDialogDisplayer, "shotDialogDisplayer");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = workflowFlowProvider;
        this.f133419p = userDetailsRepository;
        this.f133420q = userAuthInteractor;
        this.f133421r = userDetailsFlowDialogMapper;
        this.f133422s = shotDialogDisplayer;
        this.f133423t = userInteractor;
        this.u = d8l.d.a(this, new c(inputData, this, 0));
    }

    @Override // yki.j
    public final void M0() {
        l2(new com.feature.user.details.impl.ui.flow.b(this, null), new yi5.b(26));
    }

    @Override // yki.g
    public final yki.b s() {
        return this.u;
    }
}
