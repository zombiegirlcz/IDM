package ckj;

import aw0.h;
import aw0.n6;
import cli.j;
import cli.k;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.retail.feature.esim.impl.R$string;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_esim_transfer_info.EsimMobilePlanEsimTransferInfoScreenContract$InputData;
import com.revolut.revolut.feature_fourthline_impl.R;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes11.dex */
public final class g implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EsimMobilePlanEsimTransferInfoScreenContract$InputData f24856a;

    public g(EsimMobilePlanEsimTransferInfoScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f24856a = inputData;
    }

    @Override // cli.n
    public final o c(j jVar) {
        k domainState = (k) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        lw0.a aVar = new lw0.a(new TextLocalisedClause(R$string.esim_mobile_plan_esim_transfer_title, null, null, 14), new TextLocalisedClause(R$string.esim_mobile_plan_esim_transfer_subtitle, null, null, 14), null, null, false, 28);
        List listK = v.k(new RowDelegate.Model("ID_PHONE_NUMBER_TRANSFER_NEW_ESIM", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_call, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), false, false, 6), new TextLocalisedClause(R$string.esim_mobile_plan_esim_transfer_phone_number_title, null, null, 14), null, 0, new TextLocalisedClause(R$string.esim_mobile_plan_esim_transfer_phone_number_subtitle, null, null, 14), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870872), new RowDelegate.Model("ID_DATA_PLANS_RESUME_NEW_ESIM", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_data, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), false, false, 6), new TextLocalisedClause(R$string.esim_mobile_plan_esim_transfer_data_plans_title, null, null, 14), null, 0, new TextLocalisedClause(R$string.esim_mobile_plan_esim_transfer_data_plans_subtitle, null, null, 14), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870872), new RowDelegate.Model("ID_DATA_PLANS_STOP_OLD_ESIM", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_decline, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), false, false, 6), new TextLocalisedClause(R$string.esim_mobile_plan_esim_transfer_old_device_title, u.c(this.f24856a.f101218a), null, 12), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870904));
        yp0.b.k(listK, 0, 0, 0, 0, 31);
        return new cii.b(new h(false, new n6(new TextLocalisedClause(R$string.esim_mobile_plan_esim_transfer_cta, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), new n6(new TextLocalisedClause(R.string.common_action_cancel, null, null, 14), LargeActionButton.ButtonStyle.f58726b, null, null, false, null, null, 1020), null, null, null, 121), listK, aVar);
    }
}
