package wj8;

import android.os.Parcelable;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.revolut.feature_fourthline_impl.R;
import ip0.rr;
import org.bouncycastle.crypto.digests.Blake2xsDigest;

/* JADX INFO: loaded from: classes4.dex */
public final class b {
    public static InputTextDelegate.Model a(String str, TextLocalisedClause textLocalisedClause, Clause clause, boolean z) {
        InputTextDelegate.Model model = new InputTextDelegate.Model(str, clause, textLocalisedClause, null, false, null, false, null, null, null, null, null, null, false, null, null, false, z, false, false, null, 0, null, rr.f166227a, false, false, null, null, false, null, false, false, null, false, false, 0, false, false, null, null, null, null, 0, 0, 0, 0, -50729096, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        return model;
    }

    public static ListSubheaderDelegate.Model b() {
        return new ListSubheaderDelegate.Model("ID_SECTION_PERSONAL_INFORMATION", (Image) null, (Clause) new TextLocalisedClause(R.string.profile_section_personal_information, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530);
    }
}
