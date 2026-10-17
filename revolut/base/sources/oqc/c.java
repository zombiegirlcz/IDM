package oqc;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.mainscreen.api.navigation.MainScreenFeatureConfig;
import com.revolut.feature.mainscreen.core.api.ui.screen.MainContainerInnerConfiguration;
import com.revolut.feature.mainscreen.core.api.ui.screen.MainContainerNavigationId;
import com.revolut.feature.salary_switch.api.navigation.SalarySwitchDestination;
import com.revolut.feature.salary_switch.impl.R$string;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import nii.y0;
import nii.z;
import yji.l;
import zh9.u0;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class c implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f227881a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.salary_switch.impl.ui.brazil.flow.b f227882b;

    public /* synthetic */ c(com.revolut.feature.salary_switch.impl.ui.brazil.flow.b bVar, int i) {
        this.f227881a = i;
        this.f227882b = bVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f227881a) {
            case 0:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "<unused var>");
                y0 y0Var = new y0(null, new z(new TextLocalisedClause(R$string.salary_switch_br_status_error_title, null, null, 14), new TextLocalisedClause(R$string.salary_switch_br_status_error_try_again, null, null, 14), null, null, null, null, false, null, null, null, null, null, null, 32764), false, 5);
                com.revolut.feature.salary_switch.impl.ui.brazil.flow.b bVar = this.f227882b;
                l.a1(bVar, bVar.X1(y0Var), null, null, new ocb.d(bVar, null, 17), 3);
                return Boolean.TRUE;
            default:
                xqc.e result = (xqc.e) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                if (result == null) {
                    throw new NoWhenBranchMatchedException();
                }
                s49.a aVar = s49.a.SINGLE_TOP;
                MainContainerNavigationId.MainContainerTabId mainContainerTabId = u49.a.f277275a;
                xi0.b.Companion.getClass();
                this.f227882b.C1(u0.c(new MainScreenFeatureConfig.WithInnerConfiguration(aVar, new MainContainerInnerConfiguration(mainContainerTabId, null, u0.f(new SalarySwitchDestination(xi0.b.D.f306286a, result.f308150a)), 2))));
                return Unit.f186387a;
        }
    }
}
