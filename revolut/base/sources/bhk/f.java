package bhk;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.revolut.feature_fourthline_impl.R;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import nii.y0;
import nii.z;
import yji.l;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class f implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15312a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.retail.feature.pricing_plans.ui.impl.flows.graduate_student.b f15313b;

    public /* synthetic */ f(com.revolut.retail.feature.pricing_plans.ui.impl.flows.graduate_student.b bVar, int i) {
        this.f15312a = i;
        this.f15313b = bVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f15312a) {
            case 0:
                Throwable it8 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                y0 y0Var = new y0(null, new z(new TextLocalisedClause(R.string.error_generic, null, null, 14), null, null, null, null, null, false, null, null, null, null, null, null, 32766), false, 5);
                com.revolut.retail.feature.pricing_plans.ui.impl.flows.graduate_student.b bVar = this.f15313b;
                l.a1(bVar, bVar.X1(y0Var), null, null, new i(bVar, null, 0), 3);
                return Boolean.TRUE;
            default:
                yja.b output = (yja.b) obj2;
                Intrinsics.checkNotNullParameter(output, "output");
                int i = h.f15314a[output.ordinal()];
                com.revolut.retail.feature.pricing_plans.ui.impl.flows.graduate_student.b bVar2 = this.f15313b;
                if (i == 1 || i == 2) {
                    bVar2.I2();
                } else if (i == 3) {
                    bVar2.C2(c.f15310a);
                    Unit unit = Unit.f186387a;
                } else {
                    if (i != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    bVar2.I2();
                }
                return Unit.f186387a;
        }
    }
}
