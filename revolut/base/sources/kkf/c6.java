package kkf;

import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.feature.wealth.api.declaration.AddMoneyFeatureConfig;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class c6 extends yji.n implements elf.s0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final klf.r1 f184623l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final klf.m1 f184624m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final glc.b f184625n;
    public final bmf.b o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final vlf.b f184626p;

    public c6(klf.r1 roboDataSource, klf.m1 juniorDataSource, glc.b roboTradeDetailsMapper, bmf.b modalFactory, vlf.b commonUiMapper) {
        Intrinsics.checkNotNullParameter(roboDataSource, "roboDataSource");
        Intrinsics.checkNotNullParameter(juniorDataSource, "juniorDataSource");
        Intrinsics.checkNotNullParameter(roboTradeDetailsMapper, "roboTradeDetailsMapper");
        Intrinsics.checkNotNullParameter(modalFactory, "modalFactory");
        Intrinsics.checkNotNullParameter(commonUiMapper, "commonUiMapper");
        this.f184623l = roboDataSource;
        this.f184624m = juniorDataSource;
        this.f184625n = roboTradeDetailsMapper;
        this.o = modalFactory;
        this.f184626p = commonUiMapper;
    }

    @Override // elf.s0
    public final Object c(Object obj2, String str, Continuation continuation) {
        boolean z = true;
        if (obj2 instanceof glc.e) {
            A2(new BridgeDestination(new FeatureCommand(new AddMoneyFeatureConfig.ManageRecurringFunding(((glc.e) obj2).f144603a, com.revolut.feature.wealth.api.declaration.a.ROBO))));
        } else if (obj2 instanceof glc.g) {
            glc.g gVar = (glc.g) obj2;
            yji.n.P2(this, bmf.a.c(this.o, gVar.f144605a, gVar.f144606b, gVar.f144607c, LargeActionButton.ButtonStyle.f58725a, null, 40), ModalDestination.Style.BOTTOM_DIALOG.f98301a, null, 2);
        } else if (!(obj2 instanceof glc.f)) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
