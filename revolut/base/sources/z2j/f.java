package z2j;

import com.revolut.feature.payments.api.PaymentsToggles$ShowIncomingBankTransfer;
import f5j.r;
import kotlin.jvm.internal.Intrinsics;
import tof.i7;
import tof.j7;
import tof.s7;
import tof.u7;
import tof.w7;

/* JADX INFO: loaded from: classes10.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gte.a f319093a;

    public f(gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f319093a = featureToggleInteractor;
    }

    public final i7 a(f5j.a beneficiary) {
        Intrinsics.checkNotNullParameter(beneficiary, "beneficiary");
        r rVar = beneficiary.f132335l;
        String str = beneficiary.E;
        String str2 = beneficiary.f132329a;
        String str3 = beneficiary.f132330b;
        if (rVar == r.SPIN_ALIAS) {
            return new j7(str2);
        }
        boolean z = str3 != null;
        boolean z3 = str != null && ((jte.d) this.f319093a).c(PaymentsToggles$ShowIncomingBankTransfer.f79165c);
        i7.c cVar = i7.Companion;
        i7[] i7VarArr = {z ? new w7(str3) : null, z ? new u7(str3) : null, z3 ? new s7(str) : null, new u7(str2)};
        cVar.getClass();
        return i7.c.b(i7VarArr);
    }
}
