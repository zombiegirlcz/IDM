package s94;

import c84.t;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.credit.application.plugins.impl.ui.direct_debit.failed.DirectDebitFailedContract$InputData;
import com.revolut.feature.credit.core.R$string;
import d8l.d;
import e84.e;
import kotlin.jvm.internal.Intrinsics;
import nii.y0;
import nii.z;
import s6d.r;
import yji.l;
import yki.i;
import yki.j;

/* JADX INFO: loaded from: classes22.dex */
public final class b extends t implements j {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final DirectDebitFailedContract$InputData f261109p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final hw3.c f261110q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final i f261111r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(DirectDebitFailedContract$InputData inputData, hw3.c directDebitInteractor, e pluginControllerResolver) {
        super(pluginControllerResolver);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(directDebitInteractor, "directDebitInteractor");
        Intrinsics.checkNotNullParameter(pluginControllerResolver, "pluginControllerResolver");
        this.f261109p = inputData;
        this.f261110q = directDebitInteractor;
        this.f261111r = d.a(this, new r(28));
    }

    @Override // yki.j
    public final void M0() {
        l.a1(this, X1(new y0(null, new z(new TextLocalisedClause(R$string.credit_direct_debit_new_account_confirm_error_title, null, null, 14), new TextLocalisedClause(R$string.credit_direct_debit_new_account_confirm_error_subtitle, null, null, 14), new TextLocalisedClause(R$string.credit_direct_debit_new_account_confirm_error_button, null, null, 14), null, null, null, false, null, null, null, null, null, null, 32756), false, 5)), null, null, new s56.i(this, null, 17), 3);
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f261111r;
    }
}
