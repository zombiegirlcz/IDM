package qk3;

import com.revolut.core.error.data.model.ServerError;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.confirmation_code.R$string;
import kotlin.jvm.internal.Intrinsics;
import nii.y0;
import nii.z;
import org.jetbrains.annotations.NotNull;
import sf0.h;

/* JADX INFO: loaded from: classes21.dex */
public final class c implements a {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f246958a;

    public c(h serverErrorParser) {
        Intrinsics.checkNotNullParameter(serverErrorParser, "serverErrorParser");
        this.f246958a = serverErrorParser;
    }

    @Override // qk3.a
    public final boolean a(Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        ServerError serverErrorA = this.f246958a.a(throwable);
        return serverErrorA != null && serverErrorA.f51362a == 32044;
    }

    @Override // qk3.a
    public final y0 b() {
        return new y0("id_wrong_password", new z(new TextLocalisedClause(R$string.confirmation_otp_error_wrong_code, null, null, 14), null, new TextLocalisedClause(R$string.confirmation_otp_error_try_again, null, null, 14), null, null, null, false, null, null, null, null, null, null, 32758), false, 4);
    }
}
