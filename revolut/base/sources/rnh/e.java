package rnh;

import aw0.t0;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class e {

    @NotNull
    private static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static eii.b a(String str, TextLocalisedClause textLocalisedClause, Clause clause, ResourceImage resourceImage) {
        return new eii.b(new CellDetailsDelegate.Model(str, new t0((Clause) textLocalisedClause, (Image) null, 0, false, 30), clause, null, null, null, null, 0, resourceImage, false, false, null, null, 29688));
    }
}
