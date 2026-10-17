package com.fourthline.orca.internal;

import android.content.Context;
import com.fourthline.core.ContextExtensionsKt;
import com.fourthline.orca.internal.lz;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import yhm.m;

/* JADX INFO: loaded from: classes23.dex */
public final class u31 {
    public final CoroutineScope a() {
        skm.c2 c2VarE = skm.e0.e();
        skm.p0 p0Var = skm.p0.f264001a;
        return skm.e0.c(kotlin.coroutines.e.d(c2VarE, elm.f.f127540b));
    }

    public final fg1 a(Context context, t9 cdnUrlDownloadWorker, t90 resultRepository, gh1 workflowStartSessionWorker, bf1 workflowConfigurationWorker, kh1 workflowStatusWorker, mb.d networkEnvironment, sg0 tracker, h2 attestationWorker, CoroutineScope attestationScope) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(cdnUrlDownloadWorker, "cdnUrlDownloadWorker");
        Intrinsics.checkNotNullParameter(resultRepository, "resultRepository");
        Intrinsics.checkNotNullParameter(workflowStartSessionWorker, "workflowStartSessionWorker");
        Intrinsics.checkNotNullParameter(workflowConfigurationWorker, "workflowConfigurationWorker");
        Intrinsics.checkNotNullParameter(workflowStatusWorker, "workflowStatusWorker");
        Intrinsics.checkNotNullParameter(networkEnvironment, "networkEnvironment");
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        Intrinsics.checkNotNullParameter(attestationWorker, "attestationWorker");
        Intrinsics.checkNotNullParameter(attestationScope, "attestationScope");
        eg0 eg0Var = new eg0();
        m.Companion companion = yhm.m.INSTANCE;
        return new hg1(context, new ix(true, workflowStartSessionWorker, eg0Var, workflowConfigurationWorker, workflowStatusWorker, new s41(new lz.b(lz.c.a.f30793a)), new kg1(networkEnvironment), resultRepository, new u21(), attestationWorker, attestationScope), cdnUrlDownloadWorker, ContextExtensionsKt.getAssetsFourthlineDirectory(context), tracker);
    }

    public final h00 a(fg1 mobileSessionWorker, ej documentFlowConfigWorker, p01 selfieFlowConfigWorker, r11 selfieModelDownloadWorker) {
        Intrinsics.checkNotNullParameter(mobileSessionWorker, "mobileSessionWorker");
        Intrinsics.checkNotNullParameter(documentFlowConfigWorker, "documentFlowConfigWorker");
        Intrinsics.checkNotNullParameter(selfieFlowConfigWorker, "selfieFlowConfigWorker");
        Intrinsics.checkNotNullParameter(selfieModelDownloadWorker, "selfieModelDownloadWorker");
        return new fx(mobileSessionWorker, documentFlowConfigWorker, selfieFlowConfigWorker, selfieModelDownloadWorker);
    }

    public final t90 a(gf1 bundle) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        return new u90(bundle);
    }
}
