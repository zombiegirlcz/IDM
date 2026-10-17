package com.revolut.feature.payees.impl.ui.payees_overview.flow;

import cli.y;
import com.revolut.feature.payees.api.models.PayeesTargetUser;
import com.revolut.feature.payees.impl.ui.payees_overview.flow.PayeesOverviewFlowContract$FlowPagerItem;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import md6.s;
import oki.h;
import rd3.x;
import sl5.g;
import sm9.e;
import yji.l;
import zhm.h0;
import zhm.u;

/* JADX INFO: loaded from: classes5.dex */
public final class c extends h implements sm9.c {
    public final sm9.d o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final k18.c f79008p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f79009q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ali.b f79010r;

    public c(d stateMapper, sm9.d inputData, k18.c manageableJuniorProfileInteractor) {
        List listC;
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(manageableJuniorProfileInteractor, "manageableJuniorProfileInteractor");
        this.o = inputData;
        this.f79008p = manageableJuniorProfileInteractor;
        PayeesTargetUser payeesTargetUser = inputData.f264392a;
        if (payeesTargetUser instanceof PayeesTargetUser.All) {
            listC = u.c(PayeesOverviewFlowContract$FlowPagerItem.CurrentUser.f79005a);
        } else {
            if (!(payeesTargetUser instanceof PayeesTargetUser.Junior)) {
                throw new NoWhenBranchMatchedException();
            }
            PayeesTargetUser.Junior junior = (PayeesTargetUser.Junior) payeesTargetUser;
            listC = u.c(new PayeesOverviewFlowContract$FlowPagerItem.Junior(junior.f78989a, junior.f78990b));
        }
        this.f79009q = mra.d.b(this, new e(listC, null), stateMapper, null, false, 12);
        this.f79010r = s.b(this, new scl.h(this, 17));
    }

    @Override // ali.h
    public final ali.b I0() {
        return this.f79010r;
    }

    @Override // yji.l
    public final void I1() {
        PayeesTargetUser payeesTargetUser = this.o.f264392a;
        if (!(payeesTargetUser instanceof PayeesTargetUser.All)) {
            if (!(payeesTargetUser instanceof PayeesTargetUser.Junior)) {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            l.a1(this, rd0.e.e(mo3.a.h(this.f79008p.y(), new x(27), new g(3), 2), h0.f322473a, new a(3, null)), null, null, new b(this, null), 3);
        }
    }

    @Override // ali.h, cli.z
    public final cli.g getState() {
        return this.f79009q;
    }
}
