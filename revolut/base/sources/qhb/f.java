package qhb;

import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.retail.salary_account.impl.switch_assistant.email_payroll.review_email.ReviewEmailBottomSheetContract$InputData;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import qg7.v;
import qgf.o;

/* JADX INFO: loaded from: classes6.dex */
public final class f extends h implements dli.b {
    public final fkg.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y f246597p;

    public f(ReviewEmailBottomSheetContract$InputData inputData, g stateMapper, fkg.a emailPayrollManagerInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(emailPayrollManagerInteractor, "emailPayrollManagerInteractor");
        this.o = emailPayrollManagerInteractor;
        this.f246597p = mra.d.b(this, new a(new Data(null, null, true, 3, null), inputData.f83032a), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        H2(this.f246597p, new v(3));
        l2(new e(this, null, 0), new o(this, 3));
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f246597p;
    }
}
