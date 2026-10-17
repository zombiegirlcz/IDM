package d1c;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.rev_points.api.R$string;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.d0;
import zhm.f0;
import zhm.h0;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes6.dex */
public final class h {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f01.c f110636a;

    public h(f01.c uiKitResources) {
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        this.f110636a = uiKitResources;
    }

    public static boolean a(dj0.d dVar) {
        return dVar == null || dVar.k();
    }

    public final List b(List list, String str, String str2, int i, y19.i iVar) {
        if (list == null) {
            return f0.f322471a;
        }
        aim.e eVarB = u.b();
        List listV0 = d0.V0(list, 3);
        ArrayList arrayList = new ArrayList(w.t(listV0, 10));
        int i2 = 0;
        for (Object obj2 : listV0) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                v.s();
                throw null;
            }
            y19.a aVar = (y19.a) obj2;
            String strO = p.a.o(str, i2);
            TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.rev_points_trophy_room_product_saving_title, u.c(new TextClause(aVar.f310328a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12);
            TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.rev_points_trophy_room_product_saving_subtitle, u.c(new TextClause(aVar.f310329b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12);
            LayeredImage.Companion companion = LayeredImage.INSTANCE;
            String str3 = aVar.f310330c;
            int iA = this.f110636a.a(str3);
            if (iA <= 0) {
                IllegalArgumentException illegalArgumentException = new IllegalArgumentException(p.a.p("Icon ", str3, " not found"));
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException, h0Var);
                iA = R$drawable.uikit_icn_24_rev_points;
            }
            arrayList.add(new RowDelegate.Model(strO, new RowDelegate.Model.MainImage.Image40(companion.i(iA, R$attr.uikit_colorAccentNeutral, R$attr.uikit_colorAccentNeutral_10), null, null, false, null, false, 60), textLocalisedClause, null, 0, textLocalisedClause2, null, null, 0, new RowDelegate.Model.c.b(new MoneyClause(aVar.d, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), null, null, false, 126), true, null, false, null, null, null, null, null, null, aVar, null, 0, 0, 0, 0, 532673496));
            i2 = i3;
        }
        eVarB.addAll(arrayList);
        if (list.size() == 3) {
            eVarB.add(new LargeActionButtonDelegate.Model(str2, LargeActionButton.ButtonStyle.o, null, new TextLocalisedClause(i, null, null, 14), false, null, null, iVar, null, 744));
        }
        aim.e eVarA = u.a(eVarB);
        yp0.b.k(eVarA, 0, 0, 0, 0, 31);
        return eVarA;
    }
}
