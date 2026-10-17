package vrh;

import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.status.StatusViewContract$Duration;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.kompot.common.dialog.status.StatusDialogDescriptionProgress;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import nii.h0;
import nii.j0;
import nii.u1;
import nii.y0;
import zii.i;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class d implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f291601a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.web_sign_in.ui.flow.web_sign_in.a f291602b;

    public /* synthetic */ d(com.revolut.feature.web_sign_in.ui.flow.web_sign_in.a aVar, int i) {
        this.f291601a = i;
        this.f291602b = aVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f291601a) {
            case 0:
                this.f291602b.q2();
                break;
            case 1:
                this.f291602b.q2();
                break;
            case 2:
                com.revolut.feature.web_sign_in.ui.flow.web_sign_in.a aVar = this.f291602b;
                i.t(aVar, aVar.O2(new y0(null, new j0((Clause) aVar.f96340y.f239027a.f239025a, (Clause) null, (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) null, true, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (h0) null, (ResourceImage) null, 4062), false, 5)), new c(aVar, 6), null, 14);
                break;
            case 3:
                com.revolut.feature.web_sign_in.ui.flow.web_sign_in.a aVar2 = this.f291602b;
                aVar2.f96340y.getClass();
                aVar2.s1();
                aVar2.I2();
                break;
            default:
                this.f291602b.I2();
                break;
        }
        return Unit.f186387a;
    }
}
