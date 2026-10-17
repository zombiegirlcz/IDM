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
public final class g implements a {

    @NotNull
    public static final f Companion = new f();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f246960a;

    public g(h serverErrorParser) {
        Intrinsics.checkNotNullParameter(serverErrorParser, "serverErrorParser");
        this.f246960a = serverErrorParser;
    }

    @Override // qk3.a
    public final boolean a(Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        ServerError serverErrorA = this.f246960a.a(throwable);
        return serverErrorA != null && serverErrorA.f51362a == 32043;
    }

    @Override // qk3.a
    public final y0 b() {
        return new y0("id_too_many_attempts", new z(new TextLocalisedClause(R$string.confirmation_otp_error_too_many_attempts, null, null, 14), null, new TextLocalisedClause(R$string.confirmation_otp_error_try_later, null, null, 14), null, null, null, false, null, null, null, null, null, null, 32758), false, 4);
    }
}
