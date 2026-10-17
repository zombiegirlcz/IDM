package xq5;

import aw0.j3;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.crypto.withdraw.impl.R$string;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;
import vkm.q;
import vkm.u1;

/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j2 f308115a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u1 f308116b;

    public b() {
        j2 j2VarC = q.c(null);
        this.f308115a = j2VarC;
        this.f308116b = q.h(j2VarC);
    }

    public final void a(c step) {
        int i;
        j2 j2Var;
        Object value;
        Intrinsics.checkNotNullParameter(step, "step");
        int i2 = a.f308114a[step.ordinal()];
        if (i2 == 1) {
            i = R$string.crypto_withdrawals_screen_review_withdrawal_button_submitting_title;
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i = R$string.crypto_withdrawals_screen_review_withdrawal_button_security_check_title;
        }
        j3 j3Var = new j3(new TextLocalisedClause(i, null, null, 14));
        do {
            j2Var = this.f308115a;
            value = j2Var.getValue();
        } while (!j2Var.h(value, j3Var));
    }
}
