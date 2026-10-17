package dzd;

import android.os.Parcelable;
import aw0.m6;
import aw0.n6;
import cli.y;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.data.model.Data;
import com.revolut.feature.statements.R$string;
import com.revolut.feature.statements.api.models.StatementUrlState;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.kompot.common.bottom_sheet.actions.ActionsBottomSheetController;
import grl.k9;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import yji.l;

/* JADX INFO: loaded from: classes7.dex */
public final class g extends oki.h implements b {
    public final zxd.c o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final vyd.a f121320p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f121321q;

    public g(zxd.c interactor, vyd.a dialogModelConfigurationFactory, h stateMapper) {
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        Intrinsics.checkNotNullParameter(dialogModelConfigurationFactory, "dialogModelConfigurationFactory");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = interactor;
        this.f121320p = dialogModelConfigurationFactory;
        this.f121321q = mra.d.b(this, new a(new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        l2(new ds4.y(this, null, 6), new yi5.b(26));
    }

    public final void I2(vkm.y yVar) {
        final int i = 0;
        final int i2 = 1;
        l.a1(this, byd.g.a(byd.g.c(yVar, X(), this.f121320p.d(), new Function1(this) { // from class: dzd.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f121319b;

            {
                this.f121319b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                int i3 = i;
                g gVar = this.f121319b;
                switch (i3) {
                    case 0:
                        Throwable error = (Throwable) obj2;
                        Intrinsics.checkNotNullParameter(error, "error");
                        return gVar.f121320p.c(error);
                    default:
                        StatementUrlState content = (StatementUrlState) obj2;
                        Intrinsics.checkNotNullParameter(content, "content");
                        if (!(content instanceof StatementUrlState.InPreparation)) {
                            if (content instanceof StatementUrlState.Ready) {
                                return gVar.f121320p.a();
                            }
                            throw new NoWhenBranchMatchedException();
                        }
                        lw0.a aVar = new lw0.a(new TextLocalisedClause(R$string.statements_group_bank_id_in_preparation_title, null, null, 14), new TextLocalisedClause(R$string.statements_group_bank_id_in_preparation_subtitle, null, null, 14), null, null, false, 28);
                        aw0.e eVar = new aw0.e(false, null, null, m6.c(n6.Companion, new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_got_it, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, null, 1020), null, null, 55);
                        k9 k9Var = k9.Payments;
                        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
                        gVar.C1(new com.revolut.kompot.common.b(new ActionsBottomSheetController(new dii.a(aVar, eVar, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), null, null, 24)), ModalDestination.Style.BOTTOM_DIALOG.f98301a, 4));
                        return null;
                }
            }
        }, new Function1(this) { // from class: dzd.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f121319b;

            {
                this.f121319b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                int i3 = i2;
                g gVar = this.f121319b;
                switch (i3) {
                    case 0:
                        Throwable error = (Throwable) obj2;
                        Intrinsics.checkNotNullParameter(error, "error");
                        return gVar.f121320p.c(error);
                    default:
                        StatementUrlState content = (StatementUrlState) obj2;
                        Intrinsics.checkNotNullParameter(content, "content");
                        if (!(content instanceof StatementUrlState.InPreparation)) {
                            if (content instanceof StatementUrlState.Ready) {
                                return gVar.f121320p.a();
                            }
                            throw new NoWhenBranchMatchedException();
                        }
                        lw0.a aVar = new lw0.a(new TextLocalisedClause(R$string.statements_group_bank_id_in_preparation_title, null, null, 14), new TextLocalisedClause(R$string.statements_group_bank_id_in_preparation_subtitle, null, null, 14), null, null, false, 28);
                        aw0.e eVar = new aw0.e(false, null, null, m6.c(n6.Companion, new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_got_it, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, null, 1020), null, null, 55);
                        k9 k9Var = k9.Payments;
                        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
                        gVar.C1(new com.revolut.kompot.common.b(new ActionsBottomSheetController(new dii.a(aVar, eVar, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), null, null, 24)), ModalDestination.Style.BOTTOM_DIALOG.f98301a, 4));
                        return null;
                }
            }
        })), null, null, new dob.c(this, null, 27), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f121321q;
    }
}
