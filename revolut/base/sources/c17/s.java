package c17;

import c17.i;
import cli.y;
import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.feature.freelancer.impl.ui.onboarding.validation.OnboardingInputDataValidator$ValidationState;
import com.revolut.feature.freelancer.impl.ui.profile.website.FreelancerWebsiteScreenContract$InputData;
import e17.a;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vkm.j2;

/* JADX INFO: loaded from: classes3.dex */
public final class s extends oki.h implements j {

    @NotNull
    public static final p Companion = new p();
    public final a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final j60.a f20406p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final sz6.a f20407q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e17.c f20408r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final FreelancerWebsiteScreenContract$InputData f20409s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final j2 f20410t;
    public final y u;

    public s(a freelancerWebsiteMapper, j60.a bottomDialogExtension, sz6.a onboardingInputDataValidator, e17.c websiteModelExtension, FreelancerWebsiteScreenContract$InputData inputData, cli.n stateMapper) {
        Intrinsics.checkNotNullParameter(freelancerWebsiteMapper, "freelancerWebsiteMapper");
        Intrinsics.checkNotNullParameter(bottomDialogExtension, "bottomDialogExtension");
        Intrinsics.checkNotNullParameter(onboardingInputDataValidator, "onboardingInputDataValidator");
        Intrinsics.checkNotNullParameter(websiteModelExtension, "websiteModelExtension");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = freelancerWebsiteMapper;
        this.f20406p = bottomDialogExtension;
        this.f20407q = onboardingInputDataValidator;
        this.f20408r = websiteModelExtension;
        this.f20409s = inputData;
        String str = inputData.f74075a;
        this.f20410t = vkm.q.c(str == null ? "" : str);
        o oVarZ1 = websiteModelExtension.z1(inputData.f74076b);
        String str2 = inputData.f74075a;
        this.u = mra.d.b(this, new h(oVarZ1, str2, str2, str2 != null ? new OnboardingInputDataValidator$ValidationState.Loading(str2) : new OnboardingInputDataValidator$ValidationState.Empty(""), inputData.f74077c), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        yji.l.a1(this, vkm.q.Q(t1.g(this.f20410t, 300L), new bw4.s(continuation, this, 4)), null, null, new btd.e(this, continuation, 29), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.u;
    }

    @Override // yji.l
    public final aii.n o2(aii.m event) {
        Intrinsics.checkNotNullParameter(event, "event");
        Continuation continuation = null;
        if (Intrinsics.f(event, a.C0716a.f121896b)) {
            B2();
            return null;
        }
        if (Intrinsics.f(event, a.b.f121897b)) {
            C2(i.b.f20392a);
            return null;
        }
        if (!(event instanceof e17.b)) {
            return super.o2(event);
        }
        n2(new btk.j(this, event, continuation, 10), new whi.b(6));
        return null;
    }
}
