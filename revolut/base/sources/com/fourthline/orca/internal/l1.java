package com.fourthline.orca.internal;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class l1 {
    public final jx a() {
        ib.h hVar = hb.a.f150532a;
        ib.b bVarB = hVar != null ? hVar.b(ib.b.Features) : null;
        jx jxVar = bVarB instanceof jx ? (jx) bVarB : null;
        return jxVar == null ? new jx() : jxVar;
    }

    public final sg0 a(jx featuresAnalyticsContext) {
        Intrinsics.checkNotNullParameter(featuresAnalyticsContext, "featuresAnalyticsContext");
        sg0 sg0Var = new sg0();
        sg0Var.a(featuresAnalyticsContext);
        return sg0Var;
    }

    public final k80 a(sg0 tracker) {
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        return new xh0(tracker, null, null, 6, null);
    }
}
