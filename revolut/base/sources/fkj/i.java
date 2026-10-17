package fkj;

import aw0.n6;
import cli.j;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.retail.feature.esim.impl.R$string;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_get_port_out_credentials.EsimMobilePlanGetPortOutCredentialsScreenContract$InputData;
import ec8.q;
import fk4.r;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class i implements n {

    @NotNull
    public static final g Companion = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EsimMobilePlanGetPortOutCredentialsScreenContract$InputData f135855a;

    public i(EsimMobilePlanGetPortOutCredentialsScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f135855a = inputData;
    }

    @Override // cli.n
    public final o c(j jVar) {
        lw0.a aVar;
        e domainState = (e) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        int i = h.f135854a[this.f135855a.f101223b.ordinal()];
        if (i == 1) {
            aVar = new lw0.a(new TextLocalisedClause(R$string.esim_mobile_plans_plan_details_my_numbers_request_pac_sheet_title, null, null, 14), new TextLocalisedClause(R$string.esim_mobile_plans_plan_details_my_numbers_request_pac_sheet_subtitle, null, null, 14), null, null, false, 28);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            aVar = new lw0.a(new TextLocalisedClause(R$string.esim_mobile_plans_plan_details_my_numbers_request_stac_sheet_title, null, null, 14), new TextLocalisedClause(R$string.esim_mobile_plans_plan_details_my_numbers_request_stac_sheet_subtitle, null, null, 14), null, null, false, 28);
        }
        return new cii.b(new aw0.e(false, null, null, new n6(new TextLocalisedClause(R$string.common_action_got_it, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), null, null, 55), (List) iii.c.f(domainState.f135849a, new fkh.f(this, 3), new r(3), new q(this, 28)), aVar);
    }
}
