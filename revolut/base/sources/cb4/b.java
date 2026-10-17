package cb4;

import com.revolut.core.error.data.model.ServerError;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.credit.core.R$string;
import kotlin.jvm.internal.Intrinsics;
import nii.y0;
import nii.z;
import org.jetbrains.annotations.NotNull;
import sf0.h;

/* JADX INFO: loaded from: classes22.dex */
public final class b implements qk3.a {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f22720a;

    public b(h serverErrorParser) {
        Intrinsics.checkNotNullParameter(serverErrorParser, "serverErrorParser");
        this.f22720a = serverErrorParser;
    }

    @Override // qk3.a
    public final boolean a(Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        ServerError serverErrorA = this.f22720a.a(throwable);
        return serverErrorA != null && serverErrorA.f51362a == 32047;
    }

    @Override // qk3.a
    public final y0 b() {
        return new y0("id_next_day_expiration_error_dialog", new z(new TextLocalisedClause(R$string.e_signature_error_next_day_expiry_title, null, null, 14), new TextLocalisedClause(R$string.e_signature_error_next_day_expiry_description, null, null, 14), new TextLocalisedClause(R$string.e_signature_error_next_day_expiry_button, null, null, 14), null, null, null, false, null, null, null, null, null, null, 32756), false, 4);
    }
}
