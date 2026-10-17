package to7;

import java.util.List;
import java.util.Set;
import kl7.m2;
import kotlin.jvm.internal.Intrinsics;
import le.u1;
import org.jetbrains.annotations.NotNull;
import skm.p0;

/* JADX INFO: loaded from: classes4.dex */
public final class x extends c {

    @NotNull
    public static final v Companion = new v();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ll7.a f272549a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l80.e f272550b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f01.c f272551c;

    public x(ll7.a profileRepository, l80.e dateProvider, f01.c uiKitResources) {
        Intrinsics.checkNotNullParameter(profileRepository, "profileRepository");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        this.f272549a = profileRepository;
        this.f272550b = dateProvider;
        this.f272551c = uiKitResources;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.Map] */
    @Override // a8a.d
    public final y7a.w d(Set ids, Object obj2) {
        Intrinsics.checkNotNullParameter(ids, "ids");
        String str = (String) zhm.d0.a0(ids);
        Object obj3 = jl7.f.f175621a;
        Intrinsics.checkNotNullParameter(str, "<this>");
        return new z((m2) u1.u(str, jl7.f.f175622b));
    }

    @Override // a8a.d
    public final efm.r e(Object obj2, Set selectedModelIds, List list) {
        Intrinsics.checkNotNullParameter(selectedModelIds, "selectedModelIds");
        Intrinsics.i(obj2, "null cannot be cast to non-null type com.revolut.feature.insurance_car.impl.ui.screen.onboarding.car.manual_input.pickers.TransmissionPickerParams");
        y yVar = (y) obj2;
        akg.n nVarV = nim.a.v(((ll7.h) this.f272549a).b(yVar.f272552a, yVar.f272553b), new a94.e(yVar.f272554c, yVar.d, this, 13));
        p0 p0Var = p0.f264001a;
        return rd0.e.c(nVarV, elm.f.f127540b);
    }
}
