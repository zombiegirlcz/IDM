package com.fourthline.orca.internal;

import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class dz implements ez {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Function0 f27950a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final bs f27951b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final us f27952c;

    public dz(Function0 workflowIdProvider, bs bundle, us eidFlowConfig) {
        Intrinsics.checkNotNullParameter(workflowIdProvider, "workflowIdProvider");
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(eidFlowConfig, "eidFlowConfig");
        this.f27950a = workflowIdProvider;
        this.f27951b = bundle;
        this.f27952c = eidFlowConfig;
    }

    @Override // com.fourthline.orca.internal.ez
    public String a() {
        return (String) this.f27950a.invoke();
    }

    @Override // com.fourthline.orca.internal.ez
    public boolean b() {
        return this.f27951b.h();
    }

    @Override // com.fourthline.orca.internal.ez
    public void c() {
        bs bsVar = this.f27951b;
        bsVar.b(true);
        bsVar.a(as.f26892a);
        bsVar.c(null);
        bsVar.b((String) null);
        bsVar.a((String) null);
        bsVar.d(null);
        bsVar.a((List) null);
    }

    @Override // com.fourthline.orca.internal.ez
    public us d() {
        return this.f27952c;
    }

    @Override // com.fourthline.orca.internal.ez
    public List e() {
        List listA = this.f27951b.a();
        return listA == null ? zhm.f0.f322471a : listA;
    }

    @Override // com.fourthline.orca.internal.ez
    public void a(boolean z) {
        this.f27951b.b(z);
    }
}
