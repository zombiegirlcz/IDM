package l4c;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class c {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static RowDelegate.Model a(int i, Integer num) {
        return new RowDelegate.Model("INFO_LIST_ID", new RowDelegate.Model.MainImage.Image40(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D076", null, null, null, 30), null, null, false, null, false, 60), new TextLocalisedClause(i, null, null, 14), null, 0, num != null ? new TextLocalisedClause(num.intValue(), null, null, 14) : null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868824);
    }
}
