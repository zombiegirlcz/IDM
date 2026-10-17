package k7g;

import aim.e;
import android.os.Parcelable;
import aw0.o9;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.of;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import zhm.f0;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes9.dex */
public final class a {

    @NotNull
    private static final C1038a Companion = new C1038a();

    /* JADX INFO: renamed from: k7g.a$a, reason: collision with other inner class name */
    public static final class C1038a {
        private C1038a() {
        }
    }

    public static List a(int i, String str, String str2, ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return f0.f322471a;
        }
        e eVarB = u.b();
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(i, null, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 10);
        int i2 = R$attr.uikit_dp12;
        eVarB.add(new ListSubheaderDelegate.Model(str, (Image) null, (Clause) textLocalisedClause, (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, i2, i2, 0, 0, 53242));
        int i3 = 0;
        for (Object obj2 : arrayList) {
            int i5 = i3 + 1;
            if (i3 < 0) {
                v.s();
                throw null;
            }
            b bVar = (b) obj2;
            String strO = p.a.o(str2, i3);
            boolean z = i3 == v.j(arrayList);
            TextClause textClause = new TextClause(bVar.f182055a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            of ofVar = of.SMALL;
            boolean z3 = bVar.f182056b;
            RowDelegate.Model.MainImage.Image24 image24 = new RowDelegate.Model.MainImage.Image24(new ResourceImage(z3 ? R$drawable.uikit_icn_24_check : R$drawable.uikit_icn_24_cross, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), false, false, 6);
            RowDelegate.Model.b bVar2 = z3 ? RowDelegate.Model.b.c.f53268a : RowDelegate.Model.b.a.f53266a;
            int i6 = R$attr.uikit_dp0;
            eVarB.add(new RowDelegate.Model(strO, image24, textClause, ofVar, 0, null, null, null, 0, null, false, null, false, bVar2, null, null, null, null, null, null, null, i6, z ? R$attr.uikit_dp12 : i6, 0, 0, 486520816));
            i3 = i5;
        }
        return u.a(eVarB);
    }
}
