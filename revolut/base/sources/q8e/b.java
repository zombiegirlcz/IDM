package q8e;

import aw0.o9;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.StylableContactImage$ContactStyle;
import com.revolut.core.ui_kit_core.displayers.image.models.ContactImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.feature.vaults.R$string;
import do3.n;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import pcd.x;
import pcd.z;

/* JADX INFO: loaded from: classes8.dex */
public abstract class b {
    public static final ContactImage a(x xVar) {
        Intrinsics.checkNotNullParameter(xVar, "<this>");
        return new ContactImage(xVar.f234903a, (String) null, xVar.f234907h, (String) null, (String) null, b(xVar), (String) null, false, (StylableContactImage$ContactStyle) null, (ImageTransformations) null, (TextLocalisedClause) null, 4058);
    }

    public static final String b(x xVar) {
        Intrinsics.checkNotNullParameter(xVar, "<this>");
        return com.google.android.gms.internal.mlkit_vision_face.a.o(xVar.d, " ", xVar.e);
    }

    public static final TextLocalisedClause c(x xVar, boolean z) {
        Intrinsics.checkNotNullParameter(xVar, "<this>");
        return new TextLocalisedClause(xVar.f234905c == z.ADMIN ? R$string.moneyboxes_details_shared_admin : z ? R$string.group_pockets_withdrawal_permissions_edit_withdrawal_enabled : R$string.group_pockets_withdrawal_permissions_edit_withdrawal_disabled, null, null, 14);
    }

    public static final Clause d(x xVar, n user) {
        Intrinsics.checkNotNullParameter(xVar, "<this>");
        Intrinsics.checkNotNullParameter(user, "user");
        Intrinsics.checkNotNullParameter(xVar, "<this>");
        Intrinsics.checkNotNullParameter(user, "user");
        boolean zF = Intrinsics.f(xVar.f234903a, user.f116408a);
        if (zF) {
            return new TextLocalisedClause(R$string.moneyboxes_details_shared_vault_members_you, null, null, 14);
        }
        if (zF) {
            throw new NoWhenBranchMatchedException();
        }
        return new TextClause(b(xVar), (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
    }
}
