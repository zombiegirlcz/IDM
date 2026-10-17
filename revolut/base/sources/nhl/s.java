package nhl;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.trusted_merchants.impl.ui.kompot.list.TrustedMerchantsListController;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KProperty;
import nhl.x;
import nif.c4;
import nif.d2;
import nif.l3;
import nif.s2;
import nif.x3;
import qlm.d1;
import qlm.v1;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class s implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f215564a;

    public /* synthetic */ s(int i) {
        this.f215564a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f215564a) {
            case 0:
                return new qlm.e(v1.f247718a);
            case 1:
                x.Companion companion = x.INSTANCE;
                return new qlm.e(v1.f247718a);
            case 2:
                return new d1("com.revolut.shared.feature.wealth_discovery.domain.impl.data.network.screener.models.ScreenerFilterDto.UnknownFilterDto", z.INSTANCE, new Annotation[0]);
            case 3:
                return new qlm.e(a.f215510a);
            case 4:
                return new qlm.e(c0.f215513a);
            case 5:
                return new qlm.e(v1.f247718a);
            case 6:
                return new qlm.e(f0.f215523a);
            case 7:
                return new qlm.e(v1.f247718a);
            case 8:
                return new qlm.e(v1.f247718a);
            case 9:
                return new qlm.e(c0.f215513a);
            case 10:
                return new qlm.e(v1.f247718a);
            case 11:
                return new LargeActionButtonDelegate();
            case 12:
                return Unit.f186387a;
            case 13:
                return new qlm.e(nif.p0.f215997a);
            case 14:
                return new qlm.e(v1.f247718a);
            case 15:
                return new qlm.e(d2.f215755a);
            case 16:
                return new qlm.e(s2.f216034a);
            case 17:
                return new qlm.e(l3.f215929a);
            case 18:
                return new qlm.e(x3.f216070a);
            case 19:
                return new qlm.e(c4.f215739a);
            case 20:
                return new qlm.e(qlm.t0.f247706a);
            case 21:
                return new LargeActionButtonDelegate();
            case 22:
                return new tw0.l0();
            case 23:
                KProperty[] kPropertyArr = TrustedMerchantsListController.U;
                return new ListSubheaderDelegate();
            case 24:
                KProperty[] kPropertyArr2 = TrustedMerchantsListController.U;
                return new RowDelegate(null, null, 7);
            case 25:
                KProperty[] kPropertyArr3 = TrustedMerchantsListController.U;
                return new FullScreenStateDelegate();
            case 26:
                KProperty[] kPropertyArr4 = TrustedMerchantsListController.U;
                return new RowLoadingDelegate();
            case 27:
                KProperty[] kPropertyArr5 = TrustedMerchantsListController.U;
                return new ListSubheaderLoadingDelegate();
            case 28:
                return com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D242", null, null, null, 30);
            default:
                return new ResourceImage(R$drawable.uikit_icn_16_revolut, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254);
        }
    }
}
