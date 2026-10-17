package m62;

import cli.y;
import com.revolut.feature.apm.iris.impl.ui.registration.IrisRegistrationFlowContract$InputData;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vkm.j2;

/* JADX INFO: loaded from: classes20.dex */
public final class p extends oki.h implements g {

    @NotNull
    public static final m Companion = new m();
    public final IrisRegistrationFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final c62.e f202979p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final o62.a f202980q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final jvh.a f202981r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final til.m f202982s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final y f202983t;

    public p(IrisRegistrationFlowContract$InputData inputData, c62.e irisInteractor, o62.a conflictDialogProvider, jvh.a workflowInteractor, til.m workflowFlowProvider, r stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(irisInteractor, "irisInteractor");
        Intrinsics.checkNotNullParameter(conflictDialogProvider, "conflictDialogProvider");
        Intrinsics.checkNotNullParameter(workflowInteractor, "workflowInteractor");
        Intrinsics.checkNotNullParameter(workflowFlowProvider, "workflowFlowProvider");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f202979p = irisInteractor;
        this.f202980q = conflictDialogProvider;
        this.f202981r = workflowInteractor;
        this.f202982s = workflowFlowProvider;
        this.f202983t = mra.d.b(this, new a(inputData.f62522a, false), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void T1(long j2) {
        if (((a) ((j2) this.f202983t.f22677a).getValue()).f202969b) {
            C2(c.f202971a);
        }
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f202983t;
    }
}
