package tll;

import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.utils.ListIdTarget;
import com.revolut.core.ui_kit_core.displayers.image.models.CountryImage;
import com.revolut.sso.api.R$string;
import kotlin.jvm.internal.Intrinsics;
import nii.v;
import nii.y0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class b implements tll.a {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public final y0 a(TextClause title, CountryImage countryImage, TextLocalisedClause description, ListIdTarget anchor) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(anchor, "anchor");
        return new y0(null, new v(title, description, countryImage, new TextLocalisedClause(R$string.revolut_sso_phone_confirmation_dialog_button_confirm, null, null, 14), new TextLocalisedClause(R$string.revolut_sso_phone_confirmation_dialog_button_go_back, null, null, 14), anchor, null, null, false, null, 4032), false, 5);
    }
}
