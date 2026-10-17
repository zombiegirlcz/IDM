package be3;

import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.status.StatusViewContract$Duration;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.feature.cashback.impl.R$string;
import com.revolut.kompot.common.dialog.status.StatusDialogDescriptionProgress;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import nii.h0;
import nii.j0;
import nii.u1;
import nii.y0;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class i implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14662a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f14663b;

    public /* synthetic */ i(m mVar, int i) {
        this.f14662a = i;
        this.f14663b = mVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f14662a) {
            case 0:
                Throwable it8 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                this.f14663b.X1(new y0("ID_WITHDRAWAL_FAILURE_DIALOG", new j0((Clause) new TextLocalisedClause(R$string.cashback_withdraw_failure, null, null, 14), (Clause) null, (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) null, false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (h0) null, (ResourceImage) null, 4094), false, 4));
                return Boolean.TRUE;
            default:
                List<io3.d> pockets = (List) obj2;
                Intrinsics.checkNotNullParameter(pockets, "pockets");
                for (io3.d dVar : pockets) {
                    if (Intrinsics.f(dVar.f163147c, ((f) this.f14663b.t2()).f14656a.f278974b.f163147c)) {
                        return dVar;
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
    }
}
