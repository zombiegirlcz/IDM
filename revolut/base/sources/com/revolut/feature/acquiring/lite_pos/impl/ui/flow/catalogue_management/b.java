package com.revolut.feature.acquiring.lite_pos.impl.ui.flow.catalogue_management;

import com.revolut.feature.acquiring.lite_pos.impl.ui.flow.catalogue_management.CatalogueManagementFlowContract$Step;
import com.revolut.feature.acquiring.lite_pos.impl.ui.screen.catalogue_management.CatalogueManagementScreen;
import com.revolut.kompot.navigable.flow.EmptyFlowState;
import com.revolut.kompot.navigable.flow.FlowState;
import com.revolut.kompot.navigable.flow.FlowStep;
import dki.g;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import td1.f;

/* JADX INFO: loaded from: classes20.dex */
public final class b extends g implements td1.b {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final CatalogueManagementFlowContract$Step.CatalogueManagement f60720t = CatalogueManagementFlowContract$Step.CatalogueManagement.f60718a;
    public final EmptyFlowState u = EmptyFlowState.f98428a;

    @Override // dki.g
    public final com.revolut.kompot.navigable.a t2(FlowStep flowStep) {
        CatalogueManagementFlowContract$Step step = (CatalogueManagementFlowContract$Step) flowStep;
        Intrinsics.checkNotNullParameter(step, "step");
        if (!(step instanceof CatalogueManagementFlowContract$Step.CatalogueManagement)) {
            throw new NoWhenBranchMatchedException();
        }
        CatalogueManagementScreen catalogueManagementScreen = new CatalogueManagementScreen();
        f fVar = new f(this, 0);
        Intrinsics.checkNotNullParameter(fVar, "<set-?>");
        catalogueManagementScreen.H = fVar;
        return catalogueManagementScreen;
    }

    @Override // dki.g
    public final FlowState x2() {
        return this.u;
    }

    @Override // dki.g
    public final FlowStep y2() {
        return this.f60720t;
    }
}
