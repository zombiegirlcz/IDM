package com.fourthline.orca.internal;

import com.fourthline.orca.Orca;
import com.fourthline.orca.internal.qg0;
import com.fourthline.orca.internal.ue1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class sg0 {
    public final void a(qg0.a event) {
        Intrinsics.checkNotNullParameter(event, "event");
        ib.h hVar = hb.a.f150532a;
        if (hVar != null) {
            hVar.f(event);
        }
    }

    public final ib.b b(String identifier) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        ib.h hVar = hb.a.f150532a;
        if (hVar != null) {
            return hVar.b(identifier);
        }
        return null;
    }

    public final void a(ib.b context) {
        Intrinsics.checkNotNullParameter(context, "context");
        ib.h hVar = hb.a.f150532a;
        if (hVar != null) {
            hVar.c(context);
        }
    }

    public final void a(String identifier) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        ib.h hVar = hb.a.f150532a;
        if (hVar != null) {
            hVar.a(identifier);
        }
    }

    public final void a(mb.d networkEnvironment, String workflowId, ye1 tenantConfig, Orca.a integration) {
        Intrinsics.checkNotNullParameter(networkEnvironment, "networkEnvironment");
        Intrinsics.checkNotNullParameter(workflowId, "workflowId");
        Intrinsics.checkNotNullParameter(tenantConfig, "tenantConfig");
        Intrinsics.checkNotNullParameter(integration, "integration");
        if (tenantConfig.getTenant().getAnalytics().getEnabled()) {
            te1 te1Var = new te1(a1m.e.s(networkEnvironment), workflowId, tenantConfig.getTenant().getName());
            te1Var.set("remote_assets", Boolean.valueOf(tenantConfig.getTenant().getRemoteAssets().getEnabled()));
            hb.a.e(hb.b.GRANTED);
            ib.h hVar = hb.a.f150532a;
            if (hVar != null) {
                hVar.c(te1Var);
                hVar.d(integration.b());
                hVar.f(ue1.b.f34068b);
                return;
            }
            return;
        }
        hb.a.e(hb.b.NOT_GRANTED);
    }
}
