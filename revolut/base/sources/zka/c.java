package zka;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes5.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zjh.i f322928a;

    public c(zjh.i productArticleIconMapper) {
        Intrinsics.checkNotNullParameter(productArticleIconMapper, "productArticleIconMapper");
        this.f322928a = productArticleIconMapper;
    }

    public final ArrayList a(bka.k kVar) {
        List list = kVar.f16321a.f16311a;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        int i = 0;
        for (Object obj2 : list) {
            int i2 = i + 1;
            if (i < 0) {
                v.s();
                throw null;
            }
            bka.j jVar = (bka.j) obj2;
            String strN = a0.d.n("BulletItem_", i);
            TextClause textClause = new TextClause(jVar.f16319b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            String str = jVar.f16320c;
            TextClause textClause2 = str != null ? new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null;
            String iconCode = jVar.f16318a;
            Intrinsics.checkNotNullParameter(iconCode, "iconCode");
            String lowerCase = iconCode.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            int iA = ((f01.c) this.f322928a.f322838b).a(d0.e0(lowerCase, "icn_"));
            Integer numValueOf = iA != 0 ? Integer.valueOf(iA) : null;
            arrayList.add(new RowDelegate.Model(strN, new RowDelegate.Model.MainImage.Image24(new ResourceImage(numValueOf != null ? numValueOf.intValue() : R$drawable.uikit_icn_24_logo_revolut, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), false, false, 6), textClause, null, 0, textClause2, null, null, Integer.MAX_VALUE, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868568));
            i = i2;
        }
        return arrayList;
    }
}
