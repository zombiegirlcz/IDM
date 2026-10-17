package com.fourthline.orca.internal;

import com.fourthline.core.Gender;
import com.fourthline.core.mrz.MrtdMrzInfoValidationError;
import com.fourthline.core.mrz.MrzInfo;
import com.fourthline.core.mrz.ValidationError;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class l50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f30520a = new a(null);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean b(eh0 eh0Var) {
        return eh0Var.a();
    }

    public final Function0 a(eh0 ocraConfiguration) {
        Intrinsics.checkNotNullParameter(ocraConfiguration, "ocraConfiguration");
        return new ko1(ocraConfiguration, 9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean b(gj gjVar, yj0 yj0Var) {
        MrzInfo mrzInfoF;
        if (gjVar.i() != null) {
            boolean z = (yj0Var.f() == null || yj0Var.f() == Gender.UNKNOWN) ? false : true;
            ub0 ub0VarH = gjVar.f().h();
            boolean z3 = (ub0VarH == null || (mrzInfoF = ub0VarH.f()) == null) ? false : !mrzInfoF.getValidationErrors().contains(MrtdMrzInfoValidationError.TRUNCATED_NAMES);
            if (z && z3) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean d(gj gjVar, yj0 yj0Var) {
        return (gjVar.i() == null || yj0Var.o() == null || yj0Var.q() == null) ? false : true;
    }

    public final vc1 a(gj dataBundle, yj0 personBundle) {
        Intrinsics.checkNotNullParameter(dataBundle, "dataBundle");
        Intrinsics.checkNotNullParameter(personBundle, "personBundle");
        return new vc1(new gp1(dataBundle, personBundle, 1));
    }

    public final vc1 c(gj bundle, yj0 personBundle) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(personBundle, "personBundle");
        return new vc1(new gp1(bundle, personBundle, 0));
    }

    public final vc1 a(yj0 personBundle) {
        Intrinsics.checkNotNullParameter(personBundle, "personBundle");
        return new vc1(new ko1(personBundle, 11));
    }

    public final vc1 a(vc1 validNfcUseCase, vc1 validRemoteOcrUseCase) {
        Intrinsics.checkNotNullParameter(validNfcUseCase, "validNfcUseCase");
        Intrinsics.checkNotNullParameter(validRemoteOcrUseCase, "validRemoteOcrUseCase");
        return new vc1(new rj1(validNfcUseCase, validRemoteOcrUseCase, 27));
    }

    public final vc1 a(m81 bundle) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        return new vc1(new ko1(bundle, 10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean b(yj0 yj0Var) {
        List<ValidationError> validationErrors;
        MrzInfo mrzInfoE = yj0Var.s().e();
        if (mrzInfoE == null || (validationErrors = mrzInfoE.getValidationErrors()) == null) {
            return false;
        }
        return validationErrors.isEmpty();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean b(vc1 vc1Var, vc1 vc1Var2) {
        return vc1Var.a(true) || vc1Var2.a(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean b(m81 m81Var) {
        return m81Var.h().b() || m81Var.g().b();
    }
}
