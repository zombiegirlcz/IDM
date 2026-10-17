package com.revolut.feature.payments_migration.impl.ui.flow;

import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.status.StatusViewContract$Duration;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.feature.payments_migration.impl.R$string;
import com.revolut.feature.payments_migration.impl.models.providers.Provider;
import com.revolut.feature.payments_migration.impl.ui.flow.PaymentsMigrationFlowContract$Step;
import com.revolut.kompot.common.dialog.status.StatusDialogDescriptionProgress;
import cp5.d;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import nii.h0;
import nii.j0;
import nii.u1;
import nii.y0;
import oki.h;
import zhm.f0;

/* JADX INFO: loaded from: classes5.dex */
public final class c extends h implements c6a.b {
    public final yki.a o;

    public c() {
        bwd.a aVar = new bwd.a(this, 25);
        this.o = d.a(this, PaymentsMigrationFlowContract$Step.MoveSubscriptions.f80255a, f0.f322471a, aVar);
    }

    public final void I2(qii.b bVar) {
        bVar.J2();
        X1(new y0(null, new j0((Clause) new TextLocalisedClause(R$string.payments_migration_success_dialog_title, null, null, 14), (Clause) new TextLocalisedClause(R$string.payments_migration_success_dialog_description, null, null, 14), (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) null, false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (h0) null, (ResourceImage) null, 4092), false, 5));
    }

    public final void J2(Provider provider, x5a.b bVar, boolean z) {
        int i = c6a.d.f21751a[bVar.ordinal()];
        yki.a aVar = this.o;
        if (i == 1) {
            h.t2(this, aVar, new PaymentsMigrationFlowContract$Step.CardsPaymentMigration(provider, z), false, null, false, 14);
            return;
        }
        if (i == 2) {
            h.t2(this, aVar, new PaymentsMigrationFlowContract$Step.AccountDetailsPaymentMigration(provider, z), false, null, false, 14);
            return;
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        IllegalStateException illegalStateException = new IllegalStateException("Unknown navigation for PaymentType.BOTH");
        zhm.h0 h0Var = zhm.h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
        h.D2(aVar);
    }

    @Override // yki.g
    public final yki.b s() {
        return this.o;
    }
}
