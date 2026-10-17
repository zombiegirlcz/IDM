package wx2;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static RowDelegate.Model a(int i, TextLocalisedClause textLocalisedClause, TextLocalisedClause textLocalisedClause2, String str) {
        return new RowDelegate.Model(str, new RowDelegate.Model.MainImage.Image24(new ResourceImage(i, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), false, false, 6), textLocalisedClause, null, 0, textLocalisedClause2, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868824);
    }
}
