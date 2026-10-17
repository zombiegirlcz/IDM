package ua9;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.onboarding.impl.R$string;
import jb9.h;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import nii.y;
import nii.z;
import v60.e;

/* JADX INFO: loaded from: classes5.dex */
public final class a implements s89.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n8b.a f278559a;

    public a(n8b.a countryInteractor, e serverErrorsProvider, h passcodeDialogModelProvider) {
        Intrinsics.checkNotNullParameter(countryInteractor, "countryInteractor");
        Intrinsics.checkNotNullParameter(serverErrorsProvider, "serverErrorsProvider");
        Intrinsics.checkNotNullParameter(passcodeDialogModelProvider, "passcodeDialogModelProvider");
        this.f278559a = countryInteractor;
    }

    public final z a(TextLocalisedClause title, Throwable error) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(error, "error");
        return new z(title, null, new TextLocalisedClause(R$string.onboarding_step_failed_try_again, null, null, 14), new TextLocalisedClause(R$string.common_action_log_out, null, null, 14), null, null, true, null, null, null, null, new y(2, com.google.android.gms.internal.mlkit_vision_face.a.o(o0.f186429a.b(error.getClass()).m(), ": ", error.getMessage()), null), null, 24278);
    }
}
