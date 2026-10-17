package x0c;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.h0;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes6.dex */
public final class d {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f01.c f301564a;

    public d(f01.c uiKitResources) {
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        this.f301564a = uiKitResources;
    }

    public final ArrayList a(String str, ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
        int i = 0;
        for (Object obj2 : arrayList) {
            int i2 = i + 1;
            if (i < 0) {
                v.s();
                throw null;
            }
            y19.a aVar = (y19.a) obj2;
            String strO = p.a.o(str, i);
            TextClause textClause = new TextClause(aVar.f310328a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            TextClause textClause2 = new TextClause(aVar.f310329b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            LayeredImage.Companion companion = LayeredImage.INSTANCE;
            String str2 = aVar.f310330c;
            int iA = this.f301564a.a(str2);
            if (iA <= 0) {
                IllegalArgumentException illegalArgumentException = new IllegalArgumentException(p.a.p("Icon ", str2, " not found"));
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException, h0Var);
                iA = R$drawable.uikit_icn_24_rev_points;
            }
            arrayList2.add(new RowDelegate.Model(strO, new RowDelegate.Model.MainImage.Image40(companion.i(iA, R$attr.uikit_colorAccentNeutral, R$attr.uikit_colorAccentNeutral_10), null, null, false, null, false, 60), textClause, null, 0, textClause2, null, null, 0, new RowDelegate.Model.c.b(new MoneyClause(aVar.d, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), null, null, false, 126), true, null, false, null, null, null, null, null, null, aVar, null, 0, 0, 0, 0, 532673496));
            i = i2;
        }
        return arrayList2;
    }
}
