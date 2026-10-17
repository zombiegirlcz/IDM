package com.fourthline.orca.internal;

import android.content.Context;
import com.fourthline.core.ContextExtensionsKt;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes23.dex */
public final class hf1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ef1 f29240a;

    /* JADX WARN: Multi-variable type inference failed */
    public hf1() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final ff1 a(o80 navigationChannel) {
        Intrinsics.checkNotNullParameter(navigationChannel, "navigationChannel");
        return new ff1(navigationChannel);
    }

    public hf1(ef1 ef1Var) {
        this.f29240a = ef1Var;
    }

    public final zf1 a(gf1 bundle, Locale locale) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(locale, "locale");
        String language = locale.getLanguage();
        Intrinsics.checkNotNullExpressionValue(language, "getLanguage(...)");
        return new ag1(bundle, language);
    }

    public /* synthetic */ hf1(ef1 ef1Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : ef1Var);
    }

    public final t90 a(gf1 bundle) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        return new u90(bundle);
    }

    public final fg1 a(Context context, t9 cdnUrlDownloadWorker, t90 resultRepository, gh1 workflowStartSessionWorker, yg1 workflowQtspPreSadTokenWorker, bf1 workflowConfigurationWorker, kh1 workflowStatusWorker, lz workflowWhatsNextWorker, mb.d networkEnvironment, sg0 tracker, u21 signingManager, h2 attestationWorker, CoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(cdnUrlDownloadWorker, "cdnUrlDownloadWorker");
        Intrinsics.checkNotNullParameter(resultRepository, "resultRepository");
        Intrinsics.checkNotNullParameter(workflowStartSessionWorker, "workflowStartSessionWorker");
        Intrinsics.checkNotNullParameter(workflowQtspPreSadTokenWorker, "workflowQtspPreSadTokenWorker");
        Intrinsics.checkNotNullParameter(workflowConfigurationWorker, "workflowConfigurationWorker");
        Intrinsics.checkNotNullParameter(workflowStatusWorker, "workflowStatusWorker");
        Intrinsics.checkNotNullParameter(workflowWhatsNextWorker, "workflowWhatsNextWorker");
        Intrinsics.checkNotNullParameter(networkEnvironment, "networkEnvironment");
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        Intrinsics.checkNotNullParameter(signingManager, "signingManager");
        Intrinsics.checkNotNullParameter(attestationWorker, "attestationWorker");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        return new hg1(context, new ix(false, workflowStartSessionWorker, workflowQtspPreSadTokenWorker, workflowConfigurationWorker, workflowStatusWorker, workflowWhatsNextWorker, new kg1(networkEnvironment), resultRepository, signingManager, attestationWorker, coroutineScope), cdnUrlDownloadWorker, ContextExtensionsKt.getAssetsFourthlineDirectory(context), tracker);
    }

    public final cg1 a() {
        return new cg1();
    }

    public final dg1 a(zf1 repository, r70 mainRepository, ij0 themeRepository, cg1 stateProvider, fg1 mobileSessionWorker, aq0 popupHandler, tf1 analytics, ff1 flowCoordinator, CoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(mainRepository, "mainRepository");
        Intrinsics.checkNotNullParameter(themeRepository, "themeRepository");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(mobileSessionWorker, "mobileSessionWorker");
        Intrinsics.checkNotNullParameter(popupHandler, "popupHandler");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(flowCoordinator, "flowCoordinator");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        return new dg1(new f80(stateProvider), stateProvider, popupHandler, flowCoordinator, repository, mainRepository, themeRepository, mobileSessionWorker, analytics, coroutineScope);
    }

    public final tf1 a(sg0 tracker) {
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        return new tf1(tracker);
    }

    public final aq0 a(bq0 popupHandlerBuilder, ff1 flowCoordinator) {
        Intrinsics.checkNotNullParameter(popupHandlerBuilder, "popupHandlerBuilder");
        Intrinsics.checkNotNullParameter(flowCoordinator, "flowCoordinator");
        x10 x10Var = new x10();
        return popupHandlerBuilder.a(new sf1(flowCoordinator, x10Var), new f50(flowCoordinator, x10Var), new rj0(flowCoordinator, x10Var), new f40(flowCoordinator, x10Var), new xe1(flowCoordinator, x10Var), new lh1(flowCoordinator, x10Var), new nh1(flowCoordinator, x10Var), new mh1(flowCoordinator, x10Var), new zv0(x10Var, new mp1(flowCoordinator, 10)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(ff1 ff1Var, kh0 it8) {
        Intrinsics.checkNotNullParameter(it8, "it");
        ff1Var.b((qf1) new uf1(it8));
        return Unit.f186387a;
    }
}
