package to7;

import com.revolut.feature.insurance_car.impl.data.model.CarVariation;
import java.util.List;
import java.util.Set;
import kl7.s0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import skm.p0;
import zhm.r0;

/* JADX INFO: loaded from: classes4.dex */
public final class c0 extends c {

    @NotNull
    public static final b0 Companion = new b0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ll7.a f272517a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l80.e f272518b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f01.c f272519c;
    public volatile Object d;

    public c0(ll7.a profileRepository, l80.e dateProvider, f01.c uiKitResources) {
        Intrinsics.checkNotNullParameter(profileRepository, "profileRepository");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        this.f272517a = profileRepository;
        this.f272518b = dateProvider;
        this.f272519c = uiKitResources;
        this.d = r0.g();
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, java.util.Map] */
    @Override // a8a.d
    public final y7a.w d(Set ids, Object obj2) {
        Intrinsics.checkNotNullParameter(ids, "ids");
        Set set = ids;
        CarVariation carVariation = (CarVariation) this.d.get(zhm.d0.a0(set));
        if (carVariation != null) {
            return new e0(carVariation);
        }
        throw new IllegalStateException(("variation with id " + zhm.d0.a0(set) + " not found in the map").toString());
    }

    @Override // a8a.d
    public final efm.r e(Object obj2, Set selectedModelIds, List list) {
        Intrinsics.checkNotNullParameter(selectedModelIds, "selectedModelIds");
        Intrinsics.i(obj2, "null cannot be cast to non-null type com.revolut.feature.insurance_car.impl.ui.screen.onboarding.car.manual_input.pickers.VariationPickerParams");
        d0 d0Var = (d0) obj2;
        String str = d0Var.f272520a;
        String str2 = d0Var.f272521b;
        s0 s0Var = d0Var.f272522c;
        int i = d0Var.d;
        akg.n nVarV = nim.a.v(((ll7.h) this.f272517a).b(str, str2), new c18.c(this, s0Var, d0Var.e, i, 8));
        p0 p0Var = p0.f264001a;
        return rd0.e.c(nVarV, elm.f.f127540b);
    }
}
