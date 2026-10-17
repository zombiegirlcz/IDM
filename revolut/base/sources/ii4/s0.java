package ii4;

import com.revolut.feature.credit.application.plugins.api.models.config.SpinnerConfiguration;
import com.revolut.feature.credit.application.plugins.api.models.config.WaitingPopupScreenConfig;
import com.revolut.feature.credit.application.plugins.api.navigation.plugins.CreditApplicationPluginFlowContract$Configuration;
import com.revolut.feature.credit.application.plugins.impl.ui.spinner.SpinnerScreenContract$InputData;
import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import skm.a2;

/* JADX INFO: loaded from: classes22.dex */
public final class s0 extends oki.h implements o0 {
    public final SpinnerScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final o f161554p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public a2 f161555q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final cli.y f161556r;

    public s0(SpinnerScreenContract$InputData inputData, o spinnerInteractor, cli.n stateMapper) {
        SpinnerConfiguration.Content.SpinnerContent spinnerContent;
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(spinnerInteractor, "spinnerInteractor");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f161554p = spinnerInteractor;
        SpinnerConfiguration.Content content = inputData.f68418a.f66378a;
        if (content instanceof SpinnerConfiguration.Content.Static) {
            spinnerContent = ((SpinnerConfiguration.Content.Static) content).f66377a;
        } else {
            if (!(content instanceof SpinnerConfiguration.Content.Dynamic)) {
                throw new NoWhenBranchMatchedException();
            }
            spinnerContent = (SpinnerConfiguration.Content.SpinnerContent) zhm.d0.b0(((SpinnerConfiguration.Content.Dynamic) content).f66373a);
        }
        this.f161556r = mra.d.b(this, new k0(spinnerContent), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void T1(long j2) {
        SpinnerScreenContract$InputData spinnerScreenContract$InputData = this.o;
        SpinnerConfiguration.Content content = spinnerScreenContract$InputData.f68418a.f66378a;
        if (content instanceof SpinnerConfiguration.Content.Dynamic) {
            SpinnerConfiguration.Content.Dynamic dynamic = (SpinnerConfiguration.Content.Dynamic) content;
            ArrayList arrayList = dynamic.f66373a;
            long j3 = dynamic.f66374b;
            a2 a2Var = this.f161555q;
            if (a2Var != null) {
                a2Var.f(null);
            }
            this.f161555q = n2(new r0(arrayList, this, j3, null), new whi.b(6));
        }
        SpinnerConfiguration.Mode mode = spinnerScreenContract$InputData.f68418a.f66379b;
        if (mode instanceof SpinnerConfiguration.Mode.Limited) {
            SpinnerConfiguration.Mode.Limited limited = (SpinnerConfiguration.Mode.Limited) mode;
            SpinnerConfiguration.Mode.Limited.TerminationCondition terminationCondition = limited.d;
            int i = limited.f66381a;
            long j5 = limited.f66382b;
            long j16 = limited.f66383c;
            ju3.g gVar = limited.f;
            WaitingPopupScreenConfig waitingPopupScreenConfig = limited.e;
            CreditApplicationPluginFlowContract$Configuration creditApplicationPluginFlowContract$Configuration = spinnerScreenContract$InputData.f68419b;
            yji.l.b1(this, ((z) this.f161554p).d(terminationCondition, j16, i, j5, gVar, waitingPopupScreenConfig, new g0(creditApplicationPluginFlowContract$Configuration.f66892b, creditApplicationPluginFlowContract$Configuration.f66894g)), null, new q0(this, null), 3);
        }
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f161556r;
    }
}
