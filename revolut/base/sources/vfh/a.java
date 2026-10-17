package vfh;

import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.models.PeriodClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.TextImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.CircleTransformation;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import kotlin.text.d0;
import kotlin.text.f0;
import org.jmrtd.cbeff.ISO781611;
import zhm.w;

/* JADX INFO: loaded from: classes9.dex */
public final class a {
    public final Image a(int i, String str, String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        m70.a.t(t0.f186434a);
        List listN0 = d0.n0(name, new String[]{" "}, 0, 6);
        ArrayList arrayList = new ArrayList(w.t(listN0, 10));
        Iterator it8 = listN0.iterator();
        while (it8.hasNext()) {
            arrayList.add(Character.valueOf(f0.P0((String) it8.next())));
        }
        m70.a.c(t0.f186434a);
        String upperCase = zhm.d0.k0(arrayList, "", null, null, 0, null, 62).toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        TextImage textImage = new TextImage(upperCase, new Color.Solid(R$attr.uikit_colorOnAccent), new Color.Solid(i), null, 14, 40, null, null, 200);
        return str == null ? textImage : new UrlImage(str, null, null, null, 0L, null, null, null, null, textImage, false, new ImageTransformations(null, new CircleTransformation((Float) null, (Integer) null, false, 15), null, null, null, null, null, ISO781611.SMT_TAG), null, null, false, false, 506878);
    }

    public final PeriodClause b(Integer num) {
        if (num == null) {
            return null;
        }
        int iIntValue = num.intValue();
        return new PeriodClause(new PeriodClause.PeriodComponents(iIntValue / 12, iIntValue % 12, 0, 0, 0, 0, 60), null);
    }
}
