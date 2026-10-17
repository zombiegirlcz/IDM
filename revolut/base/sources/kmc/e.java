package kmc;

import com.revolut.feature.robo.impl.ui.flow.onboarding.OnboardingFlowContract$State;
import com.revolut.feature.wealth.models.robo.Template;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jmrtd.lds.LDSFile;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class e implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f185756a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Template f185757b;

    public /* synthetic */ e(Template template, int i) {
        this.f185756a = i;
        this.f185757b = template;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f185756a) {
            case 0:
                OnboardingFlowContract$State update = (OnboardingFlowContract$State) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return OnboardingFlowContract$State.a(update, null, this.f185757b, null, null, 27);
            case 1:
                v7f.a update2 = (v7f.a) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return v7f.a.a(update2, null, null, this.f185757b.k, null, false, 27);
            default:
                return wnc.m.a((wnc.m) obj2, null, null, null, this.f185757b, null, null, null, LDSFile.EF_SOD_TAG);
        }
    }
}
