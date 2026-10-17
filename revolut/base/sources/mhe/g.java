package mhe;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.StylableContactImage$ContactStyle;
import com.revolut.core.ui_kit_core.displayers.image.models.ContactImage;
import com.revolut.core.ui_kit_core.displayers.image.models.CurrencyImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UserAvatarImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UserNamePlaceholder;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import yfe.a1;
import yfe.b1;
import yfe.c1;
import yfe.y0;
import yfe.z0;

/* JADX INFO: loaded from: classes8.dex */
public final class g {
    public static Image a(y0 y0Var) {
        if (y0Var instanceof z0) {
            return new CurrencyImage(((z0) y0Var).f313330a, (ImageTransformations) null, (TextLocalisedClause) null, 14);
        }
        if (y0Var instanceof b1) {
            return new ResourceImage(((b1) y0Var).f313243a, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254);
        }
        if (y0Var instanceof a1) {
            return ((a1) y0Var).f313240a;
        }
        if (y0Var instanceof c1) {
            return new UserAvatarImage(new UserNamePlaceholder.Default(((c1) y0Var).f313245a), null, null, 6);
        }
        if (!(y0Var instanceof y0.a)) {
            throw new NoWhenBranchMatchedException();
        }
        y0.a aVar = (y0.a) y0Var;
        return new ContactImage(aVar.f313326c, (String) null, aVar.f313324a, (String) null, (String) null, aVar.f313325b, (String) null, false, (StylableContactImage$ContactStyle) aVar.d, (ImageTransformations) null, (TextLocalisedClause) null, 3546);
    }
}
