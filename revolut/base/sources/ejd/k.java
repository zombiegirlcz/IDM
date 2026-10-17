package ejd;

import ack.o;
import com.revolut.feature.shops.api.navigation.AdsFullScreenPromptType;
import com.revolut.feature.shops.impl.ui.fullscreen_opt_in.ShopsPromptScreenContract$InputData;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.FinishCommand;
import java.util.LinkedList;
import java.util.List;
import jki.p;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import zhm.d0;

/* JADX INFO: loaded from: classes7.dex */
public final class k extends jki.g implements f {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y21.c f126863p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final toa.a f126864q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final mre.c f126865r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final lzb.c f126866s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final LinkedList f126867t;
    public final e u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(p stateMapper, ShopsPromptScreenContract$InputData inputData, y21.c optOutRepository, toa.a notificationSettingsInteractor, mre.c termsNavigationFactory, lzb.c revPointsPostOnboardingExtension) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(optOutRepository, "optOutRepository");
        Intrinsics.checkNotNullParameter(notificationSettingsInteractor, "notificationSettingsInteractor");
        Intrinsics.checkNotNullParameter(termsNavigationFactory, "termsNavigationFactory");
        Intrinsics.checkNotNullParameter(revPointsPostOnboardingExtension, "revPointsPostOnboardingExtension");
        this.f126863p = optOutRepository;
        this.f126864q = notificationSettingsInteractor;
        this.f126865r = termsNavigationFactory;
        this.f126866s = revPointsPostOnboardingExtension;
        LinkedList linkedList = new LinkedList();
        List list = inputData.f87177a;
        linkedList.addAll(d0.V(list, 1));
        this.f126867t = linkedList;
        this.u = new e((AdsFullScreenPromptType) d0.b0(list));
    }

    public static final void y2(k kVar) {
        AdsFullScreenPromptType adsFullScreenPromptType = (AdsFullScreenPromptType) kVar.f126867t.poll();
        if (adsFullScreenPromptType != null) {
            kVar.x2(new ei8.d(adsFullScreenPromptType, 6));
        } else {
            kVar.C1(new BridgeDestination(new FinishCommand(null, null, null, 7)));
        }
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.u;
    }

    public final void z2(AdsFullScreenPromptType adsFullScreenPromptType, boolean z) {
        Continuation continuation = null;
        if (adsFullScreenPromptType instanceof AdsFullScreenPromptType.AdsPersonalizedOffers) {
            n2(new o(z, this, new i(this, z, adsFullScreenPromptType, null), (Continuation) null), new whi.b(6));
        } else {
            if (!Intrinsics.f(adsFullScreenPromptType, AdsFullScreenPromptType.AdsEmailAndPush.f87079a)) {
                throw new NoWhenBranchMatchedException();
            }
            n2(new o(z, this, new af3.f(this, z, continuation, 13), (Continuation) null), new whi.b(6));
        }
    }
}
