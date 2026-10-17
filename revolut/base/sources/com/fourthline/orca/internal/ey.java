package com.fourthline.orca.internal;

import com.fourthline.orca.core.flavor.OrcaFlavor;
import com.fourthline.orca.internal.ff;
import com.fourthline.orca.workflow.WorkflowConfig;
import com.fourthline.orca.workflow.WorkflowDataDelegate;
import kotlin.Lazy;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: loaded from: classes23.dex */
public final class ey implements r70, ch1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final WorkflowConfig f28287a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final WorkflowDataDelegate f28288b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final OrcaFlavor f28289c;
    private eg1 d;
    private final MutableStateFlow e;
    private final StateFlow f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f28290g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Lazy f28291h;
    private ny i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final boolean f28292j;

    public ey(WorkflowConfig workflowConfig, WorkflowDataDelegate workflowDataDelegate, OrcaFlavor flavor) {
        Intrinsics.checkNotNullParameter(workflowConfig, "workflowConfig");
        Intrinsics.checkNotNullParameter(flavor, "flavor");
        this.f28287a = workflowConfig;
        this.f28288b = workflowDataDelegate;
        this.f28289c = flavor;
        vkm.j2 j2VarC = vkm.q.c(new ff(false, 0L, (ff.e) null, (ff.j) null, (ff.f) null, (ff.g) null, (ff.c) null, (ff.k) null, (ff.h) null, (ff.l) null, (ff.b) null, (ff.i) null, (ff.m) null, 8190, (DefaultConstructorMarker) null));
        this.e = j2VarC;
        this.f = vkm.q.h(j2VarC);
        this.f28290g = "n/a";
        this.f28291h = yhm.j.b(new gj1(this, 25));
        this.i = new ef1();
        this.f28292j = a1m.e.B(workflowConfig.getNetworkEnvironment());
    }

    @Override // com.fourthline.orca.internal.r70
    public ff a() {
        ye1 ye1VarC;
        af1 tenant;
        ff ffVarC;
        eg1 eg1Var = this.d;
        return (eg1Var == null || (ye1VarC = eg1Var.c()) == null || (tenant = ye1VarC.getTenant()) == null || (ffVarC = tenant.getDeviceDataCollection()) == null) ? new ff(false, 0L, (ff.e) null, (ff.j) null, (ff.f) null, (ff.g) null, (ff.c) null, (ff.k) null, (ff.h) null, (ff.l) null, (ff.b) null, (ff.i) null, (ff.m) null, 8190, (DefaultConstructorMarker) null) : ffVarC;
    }

    @Override // com.fourthline.orca.internal.r70
    public boolean c() {
        return this.f28292j;
    }

    @Override // com.fourthline.orca.internal.r70
    public WorkflowDataDelegate d() {
        return this.f28288b;
    }

    @Override // com.fourthline.orca.internal.r70
    public ny e() {
        return this.i;
    }

    @Override // com.fourthline.orca.internal.r70
    public ye1 f() {
        return (ye1) this.f28291h.getValue();
    }

    public final StateFlow g() {
        return this.f;
    }

    @Override // com.fourthline.orca.internal.r70
    public OrcaFlavor getFlavor() {
        return this.f28289c;
    }

    @Override // com.fourthline.orca.internal.r70
    public lg1 b() {
        eg1 eg1Var = this.d;
        if (eg1Var != null) {
            return eg1Var.b();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ye1 a(ey eyVar) {
        eg1 eg1Var = eyVar.d;
        if (eg1Var != null) {
            return eg1Var.c();
        }
        throw new IllegalArgumentException(("FL Developer error. " + ((Object) ("Value " + eg1Var + " must not be null."))).toString());
    }

    public void a(ny nyVar) {
        Intrinsics.checkNotNullParameter(nyVar, "<set-?>");
        this.i = nyVar;
    }

    @Override // com.fourthline.orca.internal.r70, com.fourthline.orca.internal.ch1
    public void a(eg1 session) {
        Intrinsics.checkNotNullParameter(session, "session");
        this.d = session;
        this.e.setValue(session.c().getTenant().getDeviceDataCollection());
        ny nyVarA = session.a();
        if (nyVarA != null) {
            a(nyVarA);
        }
    }
}
