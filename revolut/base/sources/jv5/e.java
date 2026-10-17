package jv5;

import com.revolut.core.ui_kit.delegates.ActionWidgetDelegate;
import com.revolut.core.ui_kit.delegates.t;
import com.revolut.feature.crypto_investments.impl.ui.widget.split.auto_earn.AutoEarnEligibleWidgetContract$Parcel$HeaderParcel;
import com.revolut.feature.crypto_investments.models.SplitAccountsItemGroup;
import com.revolut.feature.staking.api.StakingApi$FeatureToggles;
import ji1.m;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import mu5.p;
import org.jetbrains.annotations.NotNull;
import vkm.j2;
import vkm.q;
import yji.n;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends a {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final a5h.g f178772l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final p f178773m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final nu5.c f178774n;
    public final yud.g o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ut5.h f178775p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final gte.a f178776q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final f f178777r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final iq6.a f178778s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final j2 f178779t;

    public e(a5h.g itemsProvider, p widgetCustomizationInteractor, nu5.c autoEarnEligibleWidgetCustomisationInteractor, yud.g stakingInteractor, ut5.h pocketsDataProvider, gte.a featureToggleInteractor, f headerMapper, iq6.a autoStakingResultPopupProvider) {
        Intrinsics.checkNotNullParameter(itemsProvider, "itemsProvider");
        Intrinsics.checkNotNullParameter(widgetCustomizationInteractor, "widgetCustomizationInteractor");
        Intrinsics.checkNotNullParameter(autoEarnEligibleWidgetCustomisationInteractor, "autoEarnEligibleWidgetCustomisationInteractor");
        Intrinsics.checkNotNullParameter(stakingInteractor, "stakingInteractor");
        Intrinsics.checkNotNullParameter(pocketsDataProvider, "pocketsDataProvider");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(headerMapper, "headerMapper");
        Intrinsics.checkNotNullParameter(autoStakingResultPopupProvider, "autoStakingResultPopupProvider");
        this.f178772l = itemsProvider;
        this.f178773m = widgetCustomizationInteractor;
        this.f178774n = autoEarnEligibleWidgetCustomisationInteractor;
        this.o = stakingInteractor;
        this.f178775p = pocketsDataProvider;
        this.f178776q = featureToggleInteractor;
        this.f178777r = headerMapper;
        this.f178778s = autoStakingResultPopupProvider;
        this.f178779t = q.c(Boolean.TRUE);
    }

    @Override // jv5.a
    public final Flow Z2() {
        return !((jte.d) this.f178776q).c(StakingApi$FeatureToggles.FlexibleStaking.f88055c) ? new go.g(SplitAccountsItemGroup.Empty.f71455a, 2) : q.Q(this.f178774n.a(), new c(null, this, 0));
    }

    @Override // jv5.a
    public final void b3(t clickEvent) {
        Intrinsics.checkNotNullParameter(clickEvent, "clickEvent");
        if (clickEvent.f54722b.f51596l instanceof AutoEarnEligibleWidgetContract$Parcel$HeaderParcel) {
            ActionWidgetDelegate.a aVar = clickEvent.f54721a;
            if (Intrinsics.f(aVar, ActionWidgetDelegate.a.C0395a.f51607a)) {
                V2(new m(this, null, 15), new yi5.b(29));
            } else if (Intrinsics.f(aVar, ActionWidgetDelegate.a.d.f51610a)) {
                n.P2(this, o2(new aq6.f(new aq6.b(true))), null, new jud.d(this, 3), 1);
            }
        }
    }
}
