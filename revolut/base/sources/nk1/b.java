package nk1;

import com.revolut.feature.alipay.api.AlipayApi$Toggles$AlipayPlus;
import com.revolut.feature.alipay.api.navigation.SupportedQRsControllerDescriptor;
import com.revolut.kompot.common.ControllerDestination;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.kompot.common.ParcelableDestination;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import lg0.e;
import org.jetbrains.annotations.NotNull;
import zhm.y0;

/* JADX INFO: loaded from: classes20.dex */
public final class b implements xii.b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gte.a f216620a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f216621b;

    public b(gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f216620a = featureToggleInteractor;
        this.f216621b = y0.b("apm/alipay/supported-qrs");
    }

    @Override // xii.b
    public final Set a() {
        return this.f216621b;
    }

    @Override // xii.b
    public final ParcelableDestination e(e deeplink) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        if (this.f216620a.a(AlipayApi$Toggles$AlipayPlus.f61059c)) {
            return null;
        }
        return new ControllerDestination.Modal(SupportedQRsControllerDescriptor.f61061a, ModalDestination.Style.POPUP.f98311a);
    }
}
