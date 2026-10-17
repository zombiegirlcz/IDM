package jz6;

import cli.y;
import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.feature.freelancer.impl.ui.onboarding.business_description.FreelancerBusinessDescriptionScreenContract$InputData;
import com.revolut.feature.freelancer.impl.ui.onboarding.validation.OnboardingInputDataValidator$ValidationState;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import lz6.a;
import org.jetbrains.annotations.NotNull;
import vkm.j2;
import vkm.q;

/* JADX INFO: loaded from: classes3.dex */
public final class o extends oki.h implements i {

    @NotNull
    public static final m Companion = new m();
    public final sz6.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final lz6.c f179601p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final j2 f179602q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f179603r;

    public o(FreelancerBusinessDescriptionScreenContract$InputData inputData, sz6.a onboardingValidator, lz6.c descriptionModelExtension, cli.n stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(onboardingValidator, "onboardingValidator");
        Intrinsics.checkNotNullParameter(descriptionModelExtension, "descriptionModelExtension");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = onboardingValidator;
        this.f179601p = descriptionModelExtension;
        String str = inputData.f73974a;
        String str2 = d0.W(str) ? "" : str;
        this.f179602q = q.c(str2);
        this.f179603r = mra.d.b(this, new e(str2, !d0.W(str) ? new OnboardingInputDataValidator$ValidationState.Loading(str) : new OnboardingInputDataValidator$ValidationState.Empty("")), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        yji.l.a1(this, q.Q(t1.g(this.f179602q, 300L), new jy6.l(continuation, this, 1)), null, null, new jv.o(this, continuation, 9), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f179603r;
    }

    @Override // yji.l
    public final aii.n o2(aii.m event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (!(event instanceof a.C1140a)) {
            return super.o2(event);
        }
        C2(g.f179592a);
        return null;
    }
}
