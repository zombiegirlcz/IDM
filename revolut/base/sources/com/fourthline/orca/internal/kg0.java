package com.fourthline.orca.internal;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class kg0 implements py {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final lg0 f30270a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private oy f30271b;

    public kg0(lg0 flowManager) {
        Intrinsics.checkNotNullParameter(flowManager, "flowManager");
        this.f30270a = flowManager;
        mh0 mh0VarA = flowManager.a();
        this.f30271b = mh0VarA != null ? mh0VarA.b() : null;
    }

    @Override // com.fourthline.orca.internal.py
    public oy a() {
        return this.f30271b;
    }

    @Override // com.fourthline.orca.internal.py
    public oy a(ny flowConfig) {
        Intrinsics.checkNotNullParameter(flowConfig, "flowConfig");
        mh0 mh0VarA = this.f30270a.a(flowConfig);
        if (mh0VarA != null) {
            this.f30270a.a(mh0VarA);
        } else {
            mh0VarA = null;
        }
        oy oyVarB = mh0VarA != null ? mh0VarA.b() : null;
        this.f30271b = oyVarB;
        return oyVarB;
    }

    @Override // com.fourthline.orca.internal.py
    public oy a(p80 p80Var) {
        oy oyVarB;
        sp0 sp0VarB;
        mh0 mh0VarA = this.f30270a.a((p80Var == null || (sp0VarB = p80Var.b()) == null) ? null : sp0VarB.a());
        if (mh0VarA == null || (oyVarB = mh0VarA.b()) == null) {
            return null;
        }
        this.f30271b = oyVarB;
        return oyVarB;
    }
}
