package udj;

import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.FinishCommand;
import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.retail.feature.api.userauth.navigation.UserAuthFeatureConfig;
import grl.za;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wli.q;
import wli.v;
import wli.w;
import zhm.h0;

/* JADX INFO: loaded from: classes11.dex */
public final class f implements wli.n {

    @NotNull
    private static final e Companion = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r10.d f279232a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wx8.a f279233b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v f279234c;

    public f(r10.d lifecycleReporter, wx8.a pendingDeeplinkInteractor, v trampolineActivityNavigatorHolder, uli.g externalDeeplinkRouterAuthorizedCommandProvider) {
        Intrinsics.checkNotNullParameter(lifecycleReporter, "lifecycleReporter");
        Intrinsics.checkNotNullParameter(pendingDeeplinkInteractor, "pendingDeeplinkInteractor");
        Intrinsics.checkNotNullParameter(trampolineActivityNavigatorHolder, "trampolineActivityNavigatorHolder");
        Intrinsics.checkNotNullParameter(externalDeeplinkRouterAuthorizedCommandProvider, "externalDeeplinkRouterAuthorizedCommandProvider");
        this.f279232a = lifecycleReporter;
        this.f279233b = pendingDeeplinkInteractor;
        this.f279234c = trampolineActivityNavigatorHolder;
    }

    @Override // wli.n
    public final void a(zli.b deeplink, q source, wli.m mVar) throws Throwable {
        boolean zA;
        NaviCommand featureCommand;
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        Intrinsics.checkNotNullParameter(source, "source");
        boolean zF = Intrinsics.f(mVar, g.f279235a);
        h hVar = h.f279236a;
        if (!zF && !Intrinsics.f(mVar, hVar)) {
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, "KycConstraintResolver", "Unsupported reason " + mVar + " to resolve", null, h0Var);
            return;
        }
        if (source == q.PROGRAMMATIC) {
            h0 h0Var2 = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, "KycConstraintResolver", "Unsupported programmatic UAE Pass callback", null, h0Var2);
            return;
        }
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        this.f279232a.u0(deeplink, za.Opened);
        String str = deeplink.f323278a;
        try {
            zA = this.f279233b.a(str);
        } catch (Exception e) {
            h0 h0Var3 = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList3 = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, "KycConstraintResolver", "Failed to resume UAE Pass session", e, h0Var3);
            zA = false;
        }
        if (zA) {
            return;
        }
        sri.m mVar2 = ((w) this.f279234c).f298519a;
        if (mVar2 == null) {
            h0 h0Var4 = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList4 = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, "KycConstraintResolver", "Missing trampoline navigator for UAE Pass callback", null, h0Var4);
            return;
        }
        if (Intrinsics.f(mVar, hVar)) {
            featureCommand = com.revolut.retail.core.navigation.a.c(uli.g.a(str), new FinishCommand(null, null, null, 7));
        } else {
            featureCommand = new FeatureCommand(new UserAuthFeatureConfig.Main(null, null, true, (UserAuthFeatureConfig.UseCase) new UserAuthFeatureConfig.UseCase.SignUpWithDeepLink(str), 7));
        }
        mVar2.c(featureCommand);
    }
}
