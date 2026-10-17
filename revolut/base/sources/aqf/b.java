package aqf;

import aw0.j3;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.retail.feature.payments.core.R$string;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import prf.h;
import ukm.f;
import vkm.q;
import vkm.z1;

/* JADX INFO: loaded from: classes9.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z1 f8426a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z1 f8427b;

    public b() {
        z1 z1VarA = q.a(0, 1, f.DROP_OLDEST);
        this.f8426a = z1VarA;
        this.f8427b = z1VarA;
    }

    public final void a(h step) {
        j3 j3Var;
        Intrinsics.checkNotNullParameter(step, "step");
        int i = a.f8425a[step.ordinal()];
        if (i == 1) {
            j3Var = new j3(new TextLocalisedClause(R$string.transfer_step_submitting, null, null, 14));
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            j3Var = new j3(new TextLocalisedClause(R$string.transfer_step_verifying, null, null, 14));
        }
        this.f8426a.k(j3Var);
    }
}
