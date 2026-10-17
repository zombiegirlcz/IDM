package e0f;

import com.revolut.core.error.data.model.ServerError;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.topup_screen.impl.R$string;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sf0.h f121691a;

    public u0(sf0.h serverErrorParser) {
        Intrinsics.checkNotNullParameter(serverErrorParser, "serverErrorParser");
        this.f121691a = serverErrorParser;
    }

    public static nii.y0 b() {
        return new nii.y0(null, new nii.z(new TextLocalisedClause(R$string.topup_mcy_lrs_limit_exceeded_title, null, null, 14), new TextLocalisedClause(R$string.topup_mcy_lrs_limit_exceeded_description, null, null, 14), new TextLocalisedClause(R$string.topup_mcy_lrs_limit_exceeded_primary_button_title, null, null, 14), null, null, null, false, null, null, null, null, null, null, 32756), false, 5);
    }

    public final boolean a(Throwable error) {
        Intrinsics.checkNotNullParameter(error, "error");
        ServerError serverErrorA = this.f121691a.a(error);
        return serverErrorA != null && serverErrorA.f51362a == 70207;
    }
}
