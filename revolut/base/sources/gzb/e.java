package gzb;

import android.os.Parcelable;
import aw0.o9;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.tf;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.CircleTransformation;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.feature.rev_points.api.R$string;
import java.util.List;
import m1c.l0;
import org.jetbrains.annotations.NotNull;
import org.jmrtd.cbeff.ISO781611;
import yy0.j;
import zhm.u;

/* JADX INFO: loaded from: classes6.dex */
public final class e {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static ListSubheaderDelegate.Model a() {
        return new ListSubheaderDelegate.Model("ARCHIVED_TITLE_ID", (Image) null, (Clause) new TextLocalisedClause(R$string.rev_points_challenges_archived_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530);
    }

    public static RowDelegate.Model b(String str, l0 l0Var, Image image, RowDelegate.Model.b bVar) {
        return new RowDelegate.Model(str, new RowDelegate.Model.MainImage.Image40(new UrlImage(l0Var.f, null, null, null, 0L, null, null, null, null, null, false, new ImageTransformations(null, new CircleTransformation((Float) null, (Integer) null, false, 15), null, null, null, null, null, ISO781611.SMT_TAG), null, null, false, false, 507902), null, null, false, null, false, 60), new TextLocalisedClause(R$string.rev_points_challenge_v3_home_list_item, u.c(new TextClause(l0Var.f201385b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12), null, 0, new TextClause(l0Var.f201386c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 0, new tf(new j(image)), false, null, false, bVar, null, null, null, null, null, l0Var, null, 0, 0, 0, 0, 532659160);
    }
}
