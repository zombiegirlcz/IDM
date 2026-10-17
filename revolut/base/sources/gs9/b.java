package gs9;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.DotDividerClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.avatar.AvatarModel;
import com.revolut.core.ui_kit_core.displayers.image.StylableContactImage$ContactStyle;
import com.revolut.core.ui_kit_core.displayers.image.models.ContactImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import mx0.i1;
import oi0.d;
import oq9.o;
import zhm.d0;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes5.dex */
public final class b {
    public static ArrayList a(List members) {
        Intrinsics.checkNotNullParameter(members, "members");
        List<o> listP0 = d0.P0(members, new a());
        ArrayList arrayList = new ArrayList(w.t(listP0, 10));
        for (o oVar : listP0) {
            arrayList.add(new RowDelegate.Model(j6.a.q("mention_", oVar.b()), new RowDelegate.Model.MainImage.Avatar(new AvatarModel.Default(new ContactImage((String) null, (String) null, d.k(oVar), (String) null, (String) null, d.p(oVar), (String) null, false, (StylableContactImage$ContactStyle) null, (ImageTransformations) null, (TextLocalisedClause) null, 4059), null, null, null, null, null, 126), i1.SIZE_24_24, 4), yoj.b.m(new DotDividerClause(Integer.valueOf(R$attr.uikit_colorGreyTone50)), v.k(new TextClause(d.p(oVar), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextClause(j6.a.q("@", d.t(oVar)), (Style) new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), (Integer) null, false, (o9) null, (List) null, 124))), null, 1, null, null, null, 0, null, true, null, false, null, null, null, null, null, null, oVar, null, 0, 0, 0, 0, 532674536));
        }
        return arrayList;
    }
}
