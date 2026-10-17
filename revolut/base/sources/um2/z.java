package um2;

import aw0.n6;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.feature.backgroundpicker.impl.flow.theme_customisation_v2.ThemeCustomisationContract$ModalStep;
import com.revolut.feature.backgroundpicker.impl.flow.theme_customisation_v2.ThemeCustomisationContract$ThemeInfo;
import com.revolut.feature.backgroundpicker.impl.flow.theme_customisation_v2.ThemeCustomisationController;
import com.revolut.feature.backgroundpicker.impl.interactor.ThemesInteractor$Theme;
import com.revolut.feature.backgroundpicker.impl.model.UiAssetLockReason;
import com.revolut.feature.backgroundpicker.impl.model.UiAssetLockState;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.kompot.bridge.navigation.KompotFeatureConfig;
import com.revolut.kompot.common.ModalDestination;
import grl.k9;
import grl.od;
import grl.q6;
import grl.w2;
import grl.x0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes21.dex */
public final class z extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ ThemeCustomisationController f281221w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z(ThemeCustomisationController themeCustomisationController, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f281221w = themeCustomisationController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                z zVar = new z(this.f281221w, continuation, 0);
                zVar.v = obj2;
                return zVar;
            case 1:
                z zVar2 = new z(this.f281221w, continuation, 1);
                zVar2.v = obj2;
                return zVar2;
            default:
                z zVar3 = new z(this.f281221w, continuation, 2);
                zVar3.v = obj2;
                return zVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((z) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((z) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((z) create((n6) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        ModalDestination.Style.BOTTOM_DIALOG bottom_dialog = ModalDestination.Style.BOTTOM_DIALOG.f98301a;
        ThemeCustomisationController themeCustomisationController = this.f281221w;
        switch (i) {
            case 0:
                String itemId = (String) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                b bVarE3 = themeCustomisationController.d();
                Intrinsics.h(itemId);
                com.revolut.feature.backgroundpicker.impl.flow.theme_customisation_v2.b bVar = (com.revolut.feature.backgroundpicker.impl.flow.theme_customisation_v2.b) bVarE3;
                bVar.getClass();
                Intrinsics.checkNotNullParameter(itemId, "itemId");
                if (itemId.equals("ID_RESET_THEME_BGS_MENU_ITEM")) {
                    oki.h.v2(bVar.C, ThemeCustomisationContract$ModalStep.ResetBackgroundsConfirmation.f63764a, bottom_dialog);
                }
                return Unit.f186387a;
            case 1:
                ty0.a model = (ty0.a) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                b bVarE32 = themeCustomisationController.d();
                Intrinsics.h(model);
                com.revolut.feature.backgroundpicker.impl.flow.theme_customisation_v2.b bVar2 = (com.revolut.feature.backgroundpicker.impl.flow.theme_customisation_v2.b) bVarE32;
                bVar2.getClass();
                Intrinsics.checkNotNullParameter(model, "model");
                if (Intrinsics.f(model.f275445a, "ID_SEASONAL_STYLE_DISCLAIMER")) {
                    oki.h.v2(bVar2.C, ThemeCustomisationContract$ModalStep.SeasonalStyleDisclaimer.f63765a, bottom_dialog);
                }
                return Unit.f186387a;
            default:
                n6 model2 = (n6) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                b bVarE33 = themeCustomisationController.d();
                Intrinsics.h(model2);
                com.revolut.feature.backgroundpicker.impl.flow.theme_customisation_v2.b bVar3 = (com.revolut.feature.backgroundpicker.impl.flow.theme_customisation_v2.b) bVarE33;
                bVar3.getClass();
                Intrinsics.checkNotNullParameter(model2, "model");
                Object obj3 = model2.k;
                aii.u uVarA = null;
                Object[] objArr = 0;
                f fVar = obj3 instanceof f ? (f) obj3 : null;
                int i2 = fVar == null ? -1 : b0.f281184a[fVar.ordinal()];
                if (i2 != -1) {
                    int i3 = 1;
                    if (i2 == 1) {
                        bVar3.K2();
                    } else {
                        if (i2 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        ThemesInteractor$Theme themesInteractor$ThemeA = ((ThemeCustomisationContract$ThemeInfo) zi0.c.I(((a) ((j2) bVar3.B.f22677a).getValue()).f281178b)).a();
                        UiAssetLockState uiAssetLockState = themesInteractor$ThemeA != null ? themesInteractor$ThemeA.f63801b : null;
                        if (uiAssetLockState instanceof UiAssetLockState.Locked) {
                            UiAssetLockReason uiAssetLockReason = ((UiAssetLockState.Locked) uiAssetLockState).f63806a;
                            if (uiAssetLockReason instanceof UiAssetLockReason.Challenge) {
                                KompotFeatureConfig kompotFeatureConfigD = ((pg3.b) bVar3.f63793w).d(((UiAssetLockReason.Challenge) uiAssetLockReason).f63802a, new AnalyticsProduct.Shared(k9.Profile, x0.RevolutUIKit, q6.RevolutUiKit, w2.Profile, od.RevolutUIKit));
                                if (kompotFeatureConfigD != null) {
                                    uVarA = new BridgeDestination(gc0.c.f(kompotFeatureConfigD));
                                }
                            } else {
                                if (!(uiAssetLockReason instanceof UiAssetLockReason.Plan)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                uVarA = bVar3.f63791s.a(((UiAssetLockReason.Plan) uiAssetLockReason).f63804a);
                            }
                            if (uVarA != null) {
                                bVar3.C1(uVarA);
                            }
                        } else {
                            bVar3.l2(new c0(bVar3, objArr == true ? 1 : 0, i3), new yi5.b(26));
                        }
                    }
                }
                return Unit.f186387a;
        }
    }
}
