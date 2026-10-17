package kk9;

import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.pay_later.api.R$string;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import nii.m0;
import nii.t1;
import vi9.b0;
import vi9.c0;
import zh9.z;
import zhm.u;

/* JADX INFO: loaded from: classes5.dex */
public final class m implements t1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n f184543a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f184544b;

    public m(n nVar, e eVar) {
        this.f184543a = nVar;
        this.f184544b = eVar;
    }

    @Override // nii.p1
    public final m0 a(Object obj2) {
        TextLocalisedClause textLocalisedClause;
        Unit it8 = (Unit) obj2;
        Intrinsics.checkNotNullParameter(it8, "it");
        c0 c0Var = this.f184543a.f184546q;
        vj9.b parcel = this.f184544b.f184527b;
        c0Var.getClass();
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        z zVar = parcel.f289660c;
        dj0.d dVar = parcel.f289658a;
        dj0.d dVar2 = parcel.f289659b;
        boolean z = parcel.d;
        dj0.d dVarH = pyd.c.H(dVar2, dVar);
        dj0.d.Companion.getClass();
        boolean zH = dVarH.h(dj0.d.e);
        if (z && zH) {
            textLocalisedClause = new TextLocalisedClause(R$string.pay_later_custom_repayment_success_full_deactivation_description, null, null, 14);
        } else if (z) {
            textLocalisedClause = new TextLocalisedClause(R$string.pay_later_custom_repayment_success_partial_outstanding_description, u.c(new MoneyClause(dVarH, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)), null, 12);
        } else if (zH) {
            int i = b0.f289530a[zVar.ordinal()];
            if (i == 1) {
                textLocalisedClause = new TextLocalisedClause(R$string.pay_later_custom_repayment_success_full_overdue_description, null, null, 14);
            } else if (i == 2) {
                textLocalisedClause = new TextLocalisedClause(R$string.pay_later_custom_repayment_success_full_outstanding_description, null, null, 14);
            } else {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                textLocalisedClause = new TextLocalisedClause(R$string.pay_later_custom_repayment_success_partial_healthy_description, null, null, 14);
            }
        } else {
            int i2 = b0.f289530a[zVar.ordinal()];
            if (i2 == 1) {
                textLocalisedClause = new TextLocalisedClause(R$string.pay_later_custom_repayment_success_partial_overdue_description, u.c(new MoneyClause(dVarH, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)), null, 12);
            } else if (i2 == 2) {
                textLocalisedClause = new TextLocalisedClause(R$string.pay_later_custom_repayment_success_partial_outstanding_description, u.c(new MoneyClause(dVarH, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)), null, 12);
            } else {
                if (i2 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                textLocalisedClause = new TextLocalisedClause(R$string.pay_later_custom_repayment_success_partial_healthy_description, null, null, 14);
            }
        }
        return c0.d(textLocalisedClause, dVar).f216244b;
    }
}
