package lme;

import com.revolut.data.model.Data;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import lk7.m;
import llb.e;
import m19.g;
import org.jetbrains.annotations.NotNull;
import zhm.f0;

/* JADX INFO: loaded from: classes8.dex */
public final class d implements b {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final eub.a f196973a;

    public d(eub.a revPointsAvailabilityInteractor, g contentGatewaySlotHeroBannerMapper) {
        Intrinsics.checkNotNullParameter(revPointsAvailabilityInteractor, "revPointsAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(contentGatewaySlotHeroBannerMapper, "contentGatewaySlotHeroBannerMapper");
        this.f196973a = revPointsAvailabilityInteractor;
    }

    public final List a(Data suggestedForYouData, boolean z, boolean z3) {
        Intrinsics.checkNotNullParameter(suggestedForYouData, "suggestedForYouData");
        if (!(z ^ ((nyb.b) this.f196973a).f()) && z3) {
            Intrinsics.checkNotNullParameter(suggestedForYouData, "suggestedForYouData");
            return (List) iii.c.f(suggestedForYouData, new e(15), new m(26), new ldj.g(this, 3));
        }
        return f0.f322471a;
    }
}
