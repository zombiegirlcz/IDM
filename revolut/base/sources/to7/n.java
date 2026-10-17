package to7;

import java.util.List;
import java.util.Set;
import kl7.s0;
import kotlin.jvm.internal.Intrinsics;
import le.u1;
import org.jetbrains.annotations.NotNull;
import skm.p0;

/* JADX INFO: loaded from: classes4.dex */
public final class n extends c {

    @NotNull
    public static final k Companion = new k();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ll7.a f272539a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f01.c f272540b;

    public n(ll7.a profileRepository, f01.c uiKitResources) {
        Intrinsics.checkNotNullParameter(profileRepository, "profileRepository");
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        this.f272539a = profileRepository;
        this.f272540b = uiKitResources;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.Map] */
    @Override // a8a.d
    public final y7a.w d(Set ids, Object obj2) {
        Intrinsics.checkNotNullParameter(ids, "ids");
        String str = (String) zhm.d0.a0(ids);
        Object obj3 = jl7.f.f175621a;
        Intrinsics.checkNotNullParameter(str, "<this>");
        return new p((s0) u1.u(str, jl7.f.f175621a));
    }

    @Override // a8a.d
    public final efm.r e(Object obj2, Set selectedModelIds, List list) {
        Intrinsics.checkNotNullParameter(selectedModelIds, "selectedModelIds");
        Intrinsics.i(obj2, "null cannot be cast to non-null type com.revolut.feature.insurance_car.impl.ui.screen.onboarding.car.manual_input.pickers.FuelTypePickerParams");
        o oVar = (o) obj2;
        akg.n nVarV = nim.a.v(((ll7.h) this.f272539a).b(oVar.f272541a, oVar.f272542b), new tjf.e(this, 22));
        p0 p0Var = p0.f264001a;
        return rd0.e.c(nVarV, elm.f.f127540b);
    }
}
