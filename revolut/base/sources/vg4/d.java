package vg4;

import android.os.Parcelable;
import androidx.room.RoomDatabase;
import c84.t;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.backend_flow.ui.BackendFlowContract$Configuration;
import com.revolut.feature.credit.application.plugins.impl.ui.backendflow.CreditBackendFlowContract$Configuration;
import com.revolut.feature.credit.application.plugins.impl.ui.co_borrower.consent.partner.manage_details.ManageCoBorrowerDetailsParcel;
import com.revolut.feature.credit.application.plugins.impl.ui.questionnaire_kompot.QuestionnaireFlowContract$InputData;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.ActivityNavigateCommand;
import com.revolut.retail.core.navigation.ExplicitActivityDestination;
import e84.e;
import grl.k9;
import kotlin.jvm.internal.Intrinsics;
import p54.g;
import te0.w;
import yki.h;

/* JADX INFO: loaded from: classes22.dex */
public final class d extends t implements b {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final QuestionnaireFlowContract$InputData f288753p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Object f288754q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(QuestionnaireFlowContract$InputData inputData, e pluginControllerResolver) {
        super(pluginControllerResolver);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(pluginControllerResolver, "pluginControllerResolver");
        this.f288753p = inputData;
        this.f288754q = w.y0(new vch.a(this, 8));
    }

    @Override // yki.j
    public final void M0() {
        g.Companion.getClass();
        ExplicitActivityDestination explicitActivityDestination = p54.b.f233004b;
        QuestionnaireFlowContract$InputData questionnaireFlowContract$InputData = this.f288753p;
        String str = questionnaireFlowContract$InputData.f68243a.f66891a;
        k9 k9Var = k9.Credit;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        C1(new BridgeDestination(new ActivityNavigateCommand(explicitActivityDestination, new CreditBackendFlowContract$Configuration((p54.c) null, new BackendFlowContract$Configuration(22, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), str), (ManageCoBorrowerDetailsParcel) null, questionnaireFlowContract$InputData.f68243a, true, 9), null, Integer.valueOf(RoomDatabase.MAX_BIND_PARAMETER_CNT), 0, null, null, null, null, false, 1012)));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // yki.g
    public final yki.b s() {
        return (h) this.f288754q.getValue();
    }
}
