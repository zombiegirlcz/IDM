package pm4;

import android.graphics.drawable.GradientDrawable;
import aw0.o9;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.internal.views.tag.TagViewData;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_resources.R$attr;
import dx4.a1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import mx0.pc;
import org.jetbrains.annotations.NotNull;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes22.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static ArrayList a(List tags) {
        TagViewData.TagBackground solid;
        Intrinsics.checkNotNullParameter(tags, "tags");
        List list = tags;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        int i = 0;
        for (Object obj2 : list) {
            int i2 = i + 1;
            if (i < 0) {
                v.s();
                throw null;
            }
            wp3.d dVar = (wp3.d) obj2;
            String strN = a0.d.n("CREDIT_CARD_ENTRY_POINT_TAG_", i);
            a1 a1Var = dVar.f299017b;
            Image imageT1 = a1Var != null ? a1Var.T1() : null;
            TextClause textClause = new TextClause(dVar.f299016a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            TagViewData.TagOutline.Solid solid2 = new TagViewData.TagOutline.Solid(R$attr.uikit_colorTransparent);
            wp3.c cVar = dVar.f299018c;
            int i3 = cVar == null ? -1 : c.f237473a[cVar.ordinal()];
            if (i3 == -1) {
                solid = new TagViewData.TagBackground.Solid(new Color.Solid(R$attr.uikit_colorTransparent));
            } else {
                if (i3 != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                List listK = v.k(Integer.valueOf(R$attr.uikit_colorPurple), Integer.valueOf(R$attr.uikit_colorIndigo));
                ArrayList arrayList2 = new ArrayList(w.t(listK, 10));
                Iterator it8 = listK.iterator();
                while (it8.hasNext()) {
                    arrayList2.add(new Color.Solid(((Number) it8.next()).intValue()));
                }
                solid = new TagViewData.TagBackground.Gradient(arrayList2, GradientDrawable.Orientation.TL_BR);
            }
            arrayList.add(new pc(strN, new TagViewData(imageT1, textClause, solid, null, solid2, false, null, null, null, 0, null, 2024), null));
            i = i2;
        }
        return arrayList;
    }
}
