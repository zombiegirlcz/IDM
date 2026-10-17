package at;

import cli.y;
import cli.z;
import com.revolut.biometric_verification.impl.ui.step.document.card_details_edit.details.BiometricVerificationMyNumberDetailsEditScreenContract$InputData;
import com.revolut.biometric_verification.impl.ui.step.document.flow.BiometricVerificationDocumentStepFlowContract$MyNumberCardDetails;
import java.time.LocalDate;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes17.dex */
public final class q extends oki.h implements z {
    public final BiometricVerificationMyNumberDetailsEditScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final s f8973p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f8974q;

    public q(BiometricVerificationMyNumberDetailsEditScreenContract$InputData inputData, s validator, cli.n stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(validator, "validator");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f8973p = validator;
        this.f8974q = mra.d.b(this, new h(String.valueOf(inputData.f50536a.f50546b.getYear()), inputData.f50536a.f50547c), stateMapper, null, false, 12);
    }

    public final void I2(final m event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (Intrinsics.f(event, i.f8963a)) {
            B2();
            return;
        }
        boolean z = event instanceof k;
        y yVar = this.f8974q;
        if (z) {
            final int i = 0;
            H2(yVar, new Function1() { // from class: at.p
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    h update = (h) obj2;
                    switch (i) {
                        case 0:
                            Intrinsics.checkNotNullParameter(update, "$this$update");
                            return h.a(update, ((k) event).f8965a, null, 2);
                        default:
                            Intrinsics.checkNotNullParameter(update, "$this$update");
                            return h.a(update, null, ((l) event).f8966a, 1);
                    }
                }
            });
            return;
        }
        if (event instanceof l) {
            final int i2 = 1;
            H2(yVar, new Function1() { // from class: at.p
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    h update = (h) obj2;
                    switch (i2) {
                        case 0:
                            Intrinsics.checkNotNullParameter(update, "$this$update");
                            return h.a(update, ((k) event).f8965a, null, 2);
                        default:
                            Intrinsics.checkNotNullParameter(update, "$this$update");
                            return h.a(update, null, ((l) event).f8966a, 1);
                    }
                }
            });
            return;
        }
        if (!Intrinsics.f(event, j.f8964a)) {
            throw new NoWhenBranchMatchedException();
        }
        h hVar = (h) ((j2) yVar.f22677a).getValue();
        String str = hVar.f8961a;
        String str2 = hVar.f8962b;
        this.f8973p.getClass();
        if (s.b(str, str2)) {
            BiometricVerificationDocumentStepFlowContract$MyNumberCardDetails biometricVerificationDocumentStepFlowContract$MyNumberCardDetails = this.o.f50536a;
            LocalDate localDateWithYear = biometricVerificationDocumentStepFlowContract$MyNumberCardDetails.f50546b.withYear(Integer.parseInt(hVar.f8961a));
            Intrinsics.checkNotNullExpressionValue(localDateWithYear, "withYear(...)");
            C2(new n(BiometricVerificationDocumentStepFlowContract$MyNumberCardDetails.a(biometricVerificationDocumentStepFlowContract$MyNumberCardDetails, null, localDateWithYear, hVar.f8962b, null, 9)));
        }
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f8974q;
    }
}
