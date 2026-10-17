package com.revolut.retail.operation_status.screen;

import android.os.Parcelable;
import aw0.o9;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.CharSequenceClause;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.CdnImage;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.retail.core.navigation.FinishCommand;
import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.retail.operation_status.step.OperationStatusStepContract$Configuration;
import grl.k9;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\u0001\u0004¨\u0006\u0005À\u0006\u0003"}, d2 = {"com/revolut/retail/operation_status/screen/OperationStatusFlowContract$Configuration", "Lcom/revolut/retail/operation_status/step/OperationStatusStepContract$Configuration;", "Landroid/os/Parcelable;", "Companion", "a", "retail_operation_status_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface OperationStatusFlowContract$Configuration extends OperationStatusStepContract$Configuration, Parcelable {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.f104402a;

    /* JADX INFO: renamed from: com.revolut.retail.operation_status.screen.OperationStatusFlowContract$Configuration$a, reason: from kotlin metadata */
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Companion f104402a = new Companion();

        private Companion() {
        }

        public static OperationStatusFlowContract$Configuration a(Companion companion, Clause clause, TextClause textClause, Clause clause2, NaviCommand naviCommand, String str, Image image) {
            FinishCommand finishCommand = new FinishCommand(null, null, null, 7);
            int i = R$drawable.uikit_icn_24_back_button_arrow;
            e3l.a operationStatusType = e3l.a.SUCCESS;
            AnalyticsProduct.Companion companion2 = AnalyticsProduct.INSTANCE;
            k9 k9Var = frl.a.o;
            companion2.getClass();
            AnalyticsProduct.Companion.a(k9Var);
            AnalyticsProduct.Retail automaticEventProduct = new AnalyticsProduct.Retail(k9Var);
            companion.getClass();
            Intrinsics.checkNotNullParameter(operationStatusType, "operationStatusType");
            Intrinsics.checkNotNullParameter(automaticEventProduct, "automaticEventProduct");
            return new OperationStatusFlowContract$ConfigurationImpl(clause, textClause, null, clause2, naviCommand, str, finishCommand, i, image, operationStatusType, automaticEventProduct, -1879048192);
        }

        public static OperationStatusFlowContract$Configuration b(Companion companion, String str, String str2, String str3, FinishCommand finishCommand, int i, CdnImage cdnImage) {
            FinishCommand finishCommand2 = new FinishCommand(null, null, null, 7);
            e3l.a operationStatusType = e3l.a.SUCCESS;
            AnalyticsProduct.Companion companion2 = AnalyticsProduct.INSTANCE;
            k9 k9Var = frl.a.o;
            companion2.getClass();
            AnalyticsProduct.Companion.a(k9Var);
            AnalyticsProduct.Retail automaticEventProduct = new AnalyticsProduct.Retail(k9Var);
            companion.getClass();
            Intrinsics.checkNotNullParameter(operationStatusType, "operationStatusType");
            Intrinsics.checkNotNullParameter(automaticEventProduct, "automaticEventProduct");
            return new OperationStatusFlowContract$ConfigurationImpl(str != null ? new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null, str2 != null ? new CharSequenceClause(str2) : null, null, str3 != null ? new TextClause(str3, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null, finishCommand, null, finishCommand2, i, cdnImage, operationStatusType, automaticEventProduct, -1879046144);
        }
    }
}
