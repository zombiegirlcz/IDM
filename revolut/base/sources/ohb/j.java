package ohb;

import cli.y;
import com.revolut.feature.retail.salary_account.impl.switch_assistant.email_payroll.request_summary.RequestSummaryContract$InputData;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class j extends oki.h implements b {

    @NotNull
    public static final h Companion = new h();
    public final khb.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final fkg.a f225343p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final khb.f f225344q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f225345r;

    public j(RequestSummaryContract$InputData inputData, k stateMapper, khb.e salaryAccountEmailDataInteractor, fkg.a emailPayrollManagerInteractor, khb.f switchAssistantEmailContentInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(salaryAccountEmailDataInteractor, "salaryAccountEmailDataInteractor");
        Intrinsics.checkNotNullParameter(emailPayrollManagerInteractor, "emailPayrollManagerInteractor");
        Intrinsics.checkNotNullParameter(switchAssistantEmailContentInteractor, "switchAssistantEmailContentInteractor");
        this.o = salaryAccountEmailDataInteractor;
        this.f225343p = emailPayrollManagerInteractor;
        this.f225344q = switchAssistantEmailContentInteractor;
        this.f225345r = mra.d.b(this, new a(null, null, null, inputData.f83031a), stateMapper, null, false, 12);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(ohb.j r9, gim.c r10) {
        /*
            Method dump skipped, instruction units count: 241
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ohb.j.I2(ohb.j, gim.c):java.lang.Object");
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f225345r;
    }
}
