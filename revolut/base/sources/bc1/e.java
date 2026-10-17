package bc1;

import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.status.StatusViewContract$Duration;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.feature.acquiring.card_reader.ui.api.R$string;
import com.revolut.feature.acquiring.card_reader.ui.impl.ui.flow.connection.CardReaderConnectionFlowContract$Step;
import com.revolut.kompot.common.dialog.status.StatusDialogDescriptionProgress;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import nii.h0;
import nii.j0;
import nii.u1;
import nii.y0;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class e implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14363a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.acquiring.card_reader.ui.impl.ui.flow.connection.b f14364b;

    public /* synthetic */ e(com.revolut.feature.acquiring.card_reader.ui.impl.ui.flow.connection.b bVar, int i) {
        this.f14363a = i;
        this.f14364b = bVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f14363a) {
            case 0:
                y0 y0Var = new y0(null, new j0((Clause) new TextLocalisedClause(R$string.merchant_card_reader_flow_connected_title, null, null, 14), (Clause) null, (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) null, true, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) StatusViewContract$Duration.Short.f59734a, (h0) null, (ResourceImage) null, 3550), false, 5);
                com.revolut.feature.acquiring.card_reader.ui.impl.ui.flow.connection.b bVar = this.f14364b;
                zii.i.E0(bVar, bVar.O2(y0Var), new d(bVar, 5), null, 14);
                break;
            default:
                this.f14364b.E2(CardReaderConnectionFlowContract$Step.Scanning.f60621a, false, null, false);
                break;
        }
        return Unit.f186387a;
    }
}
