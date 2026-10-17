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
public final class e implements a {

    @NotNull
    public static final d Companion = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f246959a;

    public e(h serverErrorParser) {
        Intrinsics.checkNotNullParameter(serverErrorParser, "serverErrorParser");
        this.f246959a = serverErrorParser;
    }

    @Override // qk3.a
    public final boolean a(Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        ServerError serverErrorA = this.f246959a.a(throwable);
        return serverErrorA != null && serverErrorA.f51362a == 32045;
    }

    @Override // qk3.a
    public final y0 b() {
        return new y0("id_signature_error_dialog", new z(new TextLocalisedClause(R$string.confirmation_otp_error_technical_error_title, null, null, 14), new TextLocalisedClause(R$string.confirmation_otp_error_technical_error_description, null, null, 14), new TextLocalisedClause(R$string.confirmation_otp_error_try_again, null, null, 14), null, null, null, false, null, null, null, null, null, null, 32756), false, 4);
    }
}
