package to7;

import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import skm.p0;

/* JADX INFO: loaded from: classes4.dex */
public final class g0 extends c {

    @NotNull
    public static final f0 Companion = new f0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ll7.a f272528a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l80.e f272529b;

    public g0(ll7.a profileRepository, l80.e dateProvider) {
        Intrinsics.checkNotNullParameter(profileRepository, "profileRepository");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        this.f272528a = profileRepository;
        this.f272529b = dateProvider;
    }

    @Override // a8a.d
    public final y7a.w d(Set ids, Object obj2) {
        Intrinsics.checkNotNullParameter(ids, "ids");
        return new i0(Integer.parseInt((String) zhm.d0.a0(ids)));
    }

    @Override // a8a.d
    public final efm.r e(Object obj2, Set selectedModelIds, List list) {
        Intrinsics.checkNotNullParameter(selectedModelIds, "selectedModelIds");
        Intrinsics.i(obj2, "null cannot be cast to non-null type com.revolut.feature.insurance_car.impl.ui.screen.onboarding.car.manual_input.pickers.YearMadePickerParams");
        h0 h0Var = (h0) obj2;
        akg.n nVarV = nim.a.v(((ll7.h) this.f272528a).b(h0Var.f272531a, h0Var.f272532b), new tkm.d(h0Var.f272533c, this, 2));
        p0 p0Var = p0.f264001a;
        return rd0.e.c(nVarV, elm.f.f127540b);
    }
}
