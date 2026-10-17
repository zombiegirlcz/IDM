package wz7;

import com.revolut.core.ui_kit.delegates.ListCellDelegate;
import com.revolut.core.ui_kit.delegates.j8;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import ip0.yt;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    @NotNull
    public static final C1669a Companion = new C1669a();

    /* JADX INFO: renamed from: wz7.a$a, reason: collision with other inner class name */
    public static final class C1669a {
        private C1669a() {
        }
    }

    public static ListCellDelegate.Model a(TextLocalisedClause textLocalisedClause, String str) {
        return new ListCellDelegate.Model(str, new j8(new ResourceImage(R$drawable.uikit_icn_24_dot, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), yt.TOP), null, textLocalisedClause, false, null, null, 0, 0, 0, 0, 4068);
    }
}
